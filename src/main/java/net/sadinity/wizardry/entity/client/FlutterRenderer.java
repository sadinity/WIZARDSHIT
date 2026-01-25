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
        return switch (entity.getVariant()) {
            case 1 -> Identifier.of("wizardry", "textures/entity/flutter_1.png");
            case 2 -> Identifier.of("wizardry", "textures/entity/flutter_2.png");
            case 3 -> Identifier.of("wizardry", "textures/entity/flutter_3.png");
            case 4 -> Identifier.of("wizardry", "textures/entity/flutter_4.png");
            case 5 -> Identifier.of("wizardry", "textures/entity/flutter_5.png");
            case 6 -> Identifier.of("wizardry", "textures/entity/flutter_6.png");
            default -> Identifier.of("wizardry", "textures/entity/flutter.png");
        };
    }



}
