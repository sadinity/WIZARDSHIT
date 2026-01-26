package net.sadinity.wizardry.item.custom;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.sadinity.wizardry.player.PlayerClanData;
import net.sadinity.wizardry.screen.QuizScreen;

public class QuizItem extends Item {

    public QuizItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        // SERVER: check of speler al een clan heeft
        if (!world.isClient && player instanceof ServerPlayerEntity serverPlayer) {
            if (PlayerClanData.hasClan(serverPlayer)) {
                return TypedActionResult.fail(stack);
            }
        }

        // CLIENT: open quiz
        if (world.isClient) {
            MinecraftClient.getInstance().setScreen(new QuizScreen());
        }

        // 🔥 HIER gebeurt stap 5 🔥
        // item verdwijnt na gebruik
        if (!player.isCreative()) {
            stack.decrement(1);
        }

        return TypedActionResult.success(stack);
    }
}
