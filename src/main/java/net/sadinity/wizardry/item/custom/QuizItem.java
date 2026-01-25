package net.sadinity.wizardry.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.minecraft.client.MinecraftClient;
import net.sadinity.wizardry.screen.QuizScreen;

public class QuizItem extends Item {

    public QuizItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (world.isClient) {
            MinecraftClient.getInstance().setScreen(new QuizScreen());
        }
        return TypedActionResult.success(player.getStackInHand(hand));
    }
}
