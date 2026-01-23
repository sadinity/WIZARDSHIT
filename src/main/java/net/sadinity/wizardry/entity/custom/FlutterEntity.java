package net.sadinity.wizardry.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.AnimationState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class FlutterEntity extends TameableEntity {

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState sitAnimationState = new AnimationState();


    public FlutterEntity(EntityType<? extends TameableEntity> type, World world) {
        super(type, world);
    }

    // 🔹 ATTRIBUTES
    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 15.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.18);
    }

    // 🔹 GOALS
    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SitGoal(this));

        this.goalSelector.add(2,
                new FollowOwnerGoal(this, 1.2, 6.0F, 2.0F));

        this.goalSelector.add(3,
                new WanderAroundGoal(this, 1.0));

        this.goalSelector.add(4,
                new LookAtEntityGoal(this, PlayerEntity.class, 4.0F));

        this.goalSelector.add(5,
                new LookAroundGoal(this));
    }



    // 🔹 ANIMATION STATE (CLIENT ONLY)
    @Override
    public void tick() {
        super.tick();

        if (!this.getWorld().isClient) return;

        if (this.isInSittingPose()) {
            this.sitAnimationState.startIfNotRunning(this.age);
            this.idleAnimationState.stop();
        } else {
            this.idleAnimationState.startIfNotRunning(this.age);
            this.sitAnimationState.stop();
        }
    }



    // 🔹 INTERACTION
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (this.getWorld().isClient) {
            return ActionResult.SUCCESS;
        }

        // TAMEN
        if (!this.isTamed() && stack.isOf(Items.AMETHYST_SHARD)) {
            if (!player.getAbilities().creativeMode) {
                stack.decrement(1);
            }

            if (this.random.nextInt(3) == 0) {
                this.setOwner(player);
                this.setTamed(true, true);
                this.setSitting(true);
                this.getNavigation().stop();
                this.getWorld().sendEntityStatus(this, (byte) 7);
            } else {
                this.getWorld().sendEntityStatus(this, (byte) 6);
            }

            return ActionResult.CONSUME;
        }

        // ZITTEN / STAAN
        if (this.isTamed() && this.isOwner(player)) {
            this.setSitting(!this.isSitting());
            this.getNavigation().stop();
            return ActionResult.CONSUME;
        }

        return super.interactMob(player, hand);
    }


    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    @Override
    public @Nullable PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }
}
