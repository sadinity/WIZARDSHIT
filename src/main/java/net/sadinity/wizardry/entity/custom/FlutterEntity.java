package net.sadinity.wizardry.entity.custom;

import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;
import java.awt.*;


public class FlutterEntity extends TameableEntity {

    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState sitAnimationState = new AnimationState();

    private static final TrackedData<Integer> VARIANT =
            DataTracker.registerData(FlutterEntity.class, TrackedDataHandlerRegistry.INTEGER);


    public FlutterEntity(EntityType<? extends TameableEntity> type, World world) {
        super(type, world);
    }


    public static DefaultAttributeContainer.Builder createFlutterAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                .add(EntityAttributes.GENERIC_FLYING_SPEED, 0.4);
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

    @Override
    protected void initDataTracker(DataTracker.Builder builder) {
        super.initDataTracker(builder);
        builder.add(VARIANT, 0);
    }

    public int getVariant() {
        return this.dataTracker.get(VARIANT);
    }

    public void setVariant(int variant) {
        this.dataTracker.set(VARIANT, variant);
    }




    @Override
    public void tick() {
        super.tick();


        if (this.isInSittingPose()) {
            this.setPose(EntityPose.SITTING);

            sitAnimationState.startIfNotRunning(this.age);
            idleAnimationState.stop();
        } else {
            this.setPose(EntityPose.STANDING);

            idleAnimationState.startIfNotRunning(this.age);
            sitAnimationState.stop();
        }



        if (!this.isOnGround() && this.getVelocity().y < 0.0D) {
            net.minecraft.util.math.Vec3d motion = this.getVelocity();

            this.setVelocity(
                    motion.x,
                    motion.y * 0.6D,
                    motion.z
            );

            this.fallDistance = 0.0F;
        }
    }




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
    public EntityData initialize(
            ServerWorldAccess world,
            LocalDifficulty difficulty,
            SpawnReason spawnReason,
            @Nullable EntityData entityData
    ) {
        this.setVariant(this.random.nextInt(7)); // ← change 3 to number of variants
        return super.initialize(world, difficulty, spawnReason, entityData);
    }

    @Override
    public void writeCustomDataToNbt(NbtCompound nbt) {
        super.writeCustomDataToNbt(nbt);
        nbt.putInt("Variant", this.getVariant());
    }

    @Override
    public void readCustomDataFromNbt(NbtCompound nbt) {
        super.readCustomDataFromNbt(nbt);
        this.setVariant(nbt.getInt("Variant"));
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
