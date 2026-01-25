package net.sadinity.wizardry.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.sadinity.wizardry.screen.GrimoireScreen;

public class GrimoireItem extends Item {

    public GrimoireItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (world.isClient) {
            Screen screen = new GrimoireScreen();
            net.minecraft.client.MinecraftClient.getInstance().setScreen(screen);
        }
        return TypedActionResult.success(player.getStackInHand(hand));
    }
}
