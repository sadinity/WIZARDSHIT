package net.sadinity.wizardry.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.sadinity.wizardry.Wizardry;
import net.sadinity.wizardry.entity.custom.FlutterEntity;

public class FlutterModel
        extends SinglePartEntityModel<FlutterEntity> {

    private final ModelPart full2;
    private final ModelPart full;
    private final ModelPart head;

    public static final EntityModelLayer FLUTTER = new EntityModelLayer(Identifier.of(Wizardry.MOD_ID, "flutter"), "main");

    public FlutterModel(ModelPart root) {
        this.full2 = root.getChild("full2");
        this.full = this.full2.getChild("full");
        this.head = this.full.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData full2 = modelPartData.addChild("full2", ModelPartBuilder.create(), ModelTransform.of(0.0F, 6.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        ModelPartData full = full2.addChild("full", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData head = full.addChild("head", ModelPartBuilder.create().uv(20, 23).cuboid(0.7F, -2.0F, -2.0F, 1.0F, 2.0F, 3.0F, new Dilation(0.0F))
                .uv(0, 13).cuboid(-3.0F, -4.0F, -3.0F, 4.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cube_r1 = head.addChild("cube_r1", ModelPartBuilder.create().uv(12, 28).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.6F, -3.6F, 0.9F, -1.309F, 0.0F, 0.0F));

        ModelPartData cube_r2 = head.addChild("cube_r2", ModelPartBuilder.create().uv(28, 12).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.6F, -3.6F, -1.9F, 1.309F, 0.0F, 0.0F));

        ModelPartData body = full.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(-0.8F, -3.3F, 0.5F));

        ModelPartData cube_r3 = body.addChild("cube_r3", ModelPartBuilder.create().uv(16, 0).cuboid(-1.0F, 2.0F, -3.0F, 2.0F, 4.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));

        ModelPartData cube_r4 = body.addChild("cube_r4", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -2.0F, -3.0F, 3.0F, 8.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(-1.5F, 6.6F, -0.5F, 0.0F, 0.0F, 0.1745F));

        ModelPartData tail = full.addChild("tail", ModelPartBuilder.create(), ModelTransform.of(-2.9F, 14.8F, -1.1F, 0.0F, 0.0F, 0.0349F));

        ModelPartData bone = tail.addChild("bone", ModelPartBuilder.create(), ModelTransform.pivot(-0.2F, -5.3F, 0.0F));

        ModelPartData cube_r5 = bone.addChild("cube_r5", ModelPartBuilder.create().uv(16, 8).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.2F, 1.1F, 0.0F, 0.0F, 0.0F, 0.3927F));

        ModelPartData bone2 = tail.addChild("bone2", ModelPartBuilder.create(), ModelTransform.pivot(-0.7F, -3.5F, 0.0F));

        ModelPartData cube_r6 = bone2.addChild("cube_r6", ModelPartBuilder.create().uv(18, 13).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.6F, 0.9F, 0.0F, 0.0F, 0.0F, 0.5236F));

        ModelPartData bone3 = tail.addChild("bone3", ModelPartBuilder.create(), ModelTransform.pivot(-1.6F, -1.8F, 0.0F));

        ModelPartData cube_r7 = bone3.addChild("cube_r7", ModelPartBuilder.create().uv(18, 18).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-1.9F, 0.4F, 0.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData bone4 = tail.addChild("bone4", ModelPartBuilder.create(), ModelTransform.pivot(-4.5F, 0.0F, 0.0F));

        ModelPartData cube_r8 = bone4.addChild("cube_r8", ModelPartBuilder.create().uv(10, 23).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.2F, -1.0F, 0.0F, 0.0F, 0.0F, -1.2217F));

        ModelPartData bone5 = tail.addChild("bone5", ModelPartBuilder.create(), ModelTransform.pivot(-3.1F, -0.6F, 0.0F));

        ModelPartData cube_r9 = bone5.addChild("cube_r9", ModelPartBuilder.create().uv(0, 22).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-0.6F, 0.2F, 0.0F, 0.0F, 0.0F, -0.3054F));

        ModelPartData Rarm = full.addChild("Rarm", ModelPartBuilder.create(), ModelTransform.pivot(-0.4F, 2.0F, 1.1F));

        ModelPartData cube_r10 = Rarm.addChild("cube_r10", ModelPartBuilder.create().uv(0, 27).cuboid(0.0F, -5.0F, -2.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.0873F, 4.9992F, 1.0F, 0.0F, 0.0F, -0.1309F));

        ModelPartData Rleg = full.addChild("Rleg", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, 13.0F, 2.1F));

        ModelPartData cube_r11 = Rleg.addChild("cube_r11", ModelPartBuilder.create().uv(6, 28).cuboid(0.0F, -5.0F, -2.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1309F));

        ModelPartData Lleg = full.addChild("Lleg", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, 8.0F, -2.3F));

        ModelPartData cube_r12 = Lleg.addChild("cube_r12", ModelPartBuilder.create().uv(28, 6).cuboid(0.0F, -5.0F, -2.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 5.0F, 1.1F, 0.0F, 0.0F, -0.1309F));

        ModelPartData Larm = full.addChild("Larm", ModelPartBuilder.create(), ModelTransform.pivot(-0.4F, 2.0F, -2.1F));

        ModelPartData cube_r13 = Larm.addChild("cube_r13", ModelPartBuilder.create().uv(28, 0).cuboid(0.0F, -5.0F, -1.0F, 1.0F, 4.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.0873F, 4.9992F, 0.0F, 0.0F, 0.0F, -0.1309F));

        ModelPartData wings = full.addChild("wings", ModelPartBuilder.create(), ModelTransform.pivot(-4.5F, 2.6F, -4.2F));

        ModelPartData wingL = wings.addChild("wingL", ModelPartBuilder.create().uv(22, 32).cuboid(-0.3981F, 2.2701F, -6.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 22).cuboid(-0.3981F, 2.2701F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 32).cuboid(-0.3981F, 1.2701F, -3.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 24).cuboid(-0.3981F, 0.2701F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(26, 32).cuboid(-0.3981F, 1.2701F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 26).cuboid(-0.3981F, 0.2701F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 32).cuboid(-0.3981F, 1.2701F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 28).cuboid(-0.3981F, 0.2701F, -6.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 32).cuboid(-0.3981F, 1.2701F, -6.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 34).cuboid(-0.3981F, -0.7299F, -6.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 20).cuboid(-0.3981F, 0.2701F, -7.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(22, 34).cuboid(-0.3981F, 1.2701F, -7.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 30).cuboid(-0.3981F, 2.2701F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 32).cuboid(-0.3981F, 0.2701F, -2.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 33).cuboid(-0.3981F, 0.2701F, -3.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 14).cuboid(-0.3981F, -0.7299F, -1.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 16).cuboid(-0.3981F, -0.7299F, -2.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(2, 33).cuboid(-0.3981F, -2.7299F, -3.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(4, 33).cuboid(-0.3981F, -1.7299F, -2.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 0).cuboid(-0.3981F, -1.7299F, -3.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(18, 34).cuboid(-0.3981F, -0.7299F, -3.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 2).cuboid(-0.3981F, -2.7299F, -6.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 4).cuboid(-0.3981F, -3.7299F, -6.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(6, 34).cuboid(-0.3981F, -3.7299F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 6).cuboid(-0.3981F, -3.7299F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(8, 34).cuboid(-0.3981F, -2.7299F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 8).cuboid(-0.3981F, -2.7299F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(10, 34).cuboid(-0.3981F, -4.7299F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 10).cuboid(-0.3981F, -4.7299F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 34).cuboid(-0.3981F, -3.7299F, -3.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 12).cuboid(-0.3981F, -1.7299F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 18).cuboid(-0.3981F, -0.7299F, -5.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(14, 34).cuboid(-0.3981F, -1.7299F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(20, 34).cuboid(-0.3981F, -0.7299F, -4.0927F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.8F, 0.0F, 3.2F, -0.1315F, -0.1272F, -3.0033F));

        ModelPartData wingR = wings.addChild("wingR", ModelPartBuilder.create().uv(30, 20).cuboid(-0.0653F, 2.4659F, -5.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 26).cuboid(-0.0653F, 2.4659F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 24).cuboid(-0.0653F, 1.4659F, -2.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(20, 30).cuboid(-0.0653F, 0.4659F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(16, 32).cuboid(-0.0653F, 1.4659F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 18).cuboid(-0.0653F, 0.4659F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(12, 32).cuboid(-0.0653F, 1.4659F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 30).cuboid(-0.0653F, 0.4659F, -5.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(14, 32).cuboid(-0.0653F, 1.4659F, -5.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(26, 10).cuboid(-0.0653F, -0.5341F, -5.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(18, 30).cuboid(-0.0653F, 0.4659F, -6.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 16).cuboid(-0.0653F, 1.4659F, -6.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(26, 28).cuboid(-0.0653F, 2.4659F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 28).cuboid(-0.0653F, 0.4659F, -1.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 28).cuboid(-0.0653F, 0.4659F, -2.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(26, 8).cuboid(-0.0653F, -0.5341F, -0.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(18, 28).cuboid(-0.0653F, -0.5341F, -1.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 20).cuboid(-0.0653F, -2.5341F, -2.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 26).cuboid(-0.0653F, -1.5341F, -1.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 30).cuboid(-0.0653F, -1.5341F, -2.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 16).cuboid(-0.0653F, -0.5341F, -2.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(22, 30).cuboid(-0.0653F, -2.5341F, -5.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 22).cuboid(-0.0653F, -3.5341F, -5.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 16).cuboid(-0.0653F, -3.5341F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(18, 32).cuboid(-0.0653F, -3.5341F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(32, 18).cuboid(-0.0653F, -2.5341F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(20, 32).cuboid(-0.0653F, -2.5341F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(24, 30).cuboid(-0.0653F, -4.5341F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(30, 24).cuboid(-0.0653F, -4.5341F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(26, 30).cuboid(-0.0653F, -3.5341F, -2.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 22).cuboid(-0.0653F, -1.5341F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(20, 28).cuboid(-0.0653F, -0.5341F, -4.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(22, 28).cuboid(-0.0653F, -1.5341F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(28, 18).cuboid(-0.0653F, -0.5341F, -3.8756F, 0.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.2F, 0.3F, 4.4F, 3.0094F, -0.115F, 0.1384F));
        return TexturedModelData.of(modelData, 64, 64);

    }
    @Override
    public void setAngles(FlutterEntity entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {

        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngels(netHeadYaw, headPitch);

        boolean isMoving =
                entity.getVelocity().horizontalLengthSquared() > 0.0001;

        if (entity.isSitting()) {
            this.updateAnimation(
                    entity.idleAnimationState,
                    FlutterAnimations.FLUTTER_SIT,
                    ageInTicks,
                    1.0F
            );
        }
        else if (isMoving) {
            this.animateMovement(
                    FlutterAnimations.FLUTTER_WALK,
                    limbSwing,
                    1.0F,   // force amount
                    2.0F,
                    2.5F
            );
        }
        else {
            this.updateAnimation(
                    entity.idleAnimationState,
                    FlutterAnimations.FLUTTER_IDLE,
                    ageInTicks,
                    1.0F
            );
        }


}

    private void  setHeadAngels(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        full2.render(matrices, vertexConsumer, light, overlay, color);
    }
    @Override
    public ModelPart getPart(){
        return full2;
    }

    public ModelPart getHead() {
        return head;
    }
}