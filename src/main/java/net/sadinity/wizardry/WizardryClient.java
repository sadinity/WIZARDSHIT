package net.sadinity.wizardry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.sadinity.wizardry.block.ModBlocks;
import net.sadinity.wizardry.client.Keybinds;
import net.sadinity.wizardry.entity.ModEntities;
import net.sadinity.wizardry.entity.client.FlutterModel;
import net.sadinity.wizardry.entity.client.FlutterRenderer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.sadinity.wizardry.screen.WizardrySkillTreeScreen;

public class WizardryClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ELDER_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ELDER_DOOR, RenderLayer.getCutout());

        EntityModelLayerRegistry.registerModelLayer(FlutterModel.FLUTTER, FlutterModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.FLUTTER, FlutterRenderer::new);

        Keybinds.register();

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (Keybinds.OPEN_SKILLTREE.wasPressed()) {

                if (client.player == null || client.world == null) {
                    return; //
                }

                client.setScreen(new WizardrySkillTreeScreen());
            }
        });



    }
}
