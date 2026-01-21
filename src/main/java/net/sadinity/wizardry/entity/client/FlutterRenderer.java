package net.sadinity.wizardry.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.Wizardry;
import net.sadinity.wizardry.entity.custom.FlutterEntity;

public class FlutterRenderer
        extends MobEntityRenderer<FlutterEntity, FlutterModel> {

    public FlutterRenderer(EntityRendererFactory.Context context) {
        super(
                context,
                new FlutterModel(
                        context.getPart(FlutterModel.FLUTTER)
                ),
                0.4f
        );
    }

    @Override
    public Identifier getTexture(FlutterEntity entity) {
        return Identifier.of(
                Wizardry.MOD_ID,
                "textures/entity/flutter.png"
        );
    }
}
