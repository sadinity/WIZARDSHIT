package net.sadinity.wizardry.entity.client;

import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;

public class FlutterAnimations {

        public static final Animation FLUTTER_IDLE = Animation.Builder.create(1.75F).looping()
                .addBoneAnimation("wingR", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.4583F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingR", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.4583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingR", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.8333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.4583F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingL", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.8333F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.4583F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingL", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.8333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.4583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingL", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.8333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.4583F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Larm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Larm", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Larm", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("wings", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("wings", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("wings", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("full", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("full", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.875F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone5", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone5", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.2F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone5", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.9167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone2", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone2", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone2", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone3", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone3", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone3", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone4", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone4", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone4", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .build();

        public static final Animation FLUTTER_WALK = Animation.Builder.create(1.3333F).looping()
                .addBoneAnimation("wingR", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.125F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingR", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.125F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.0417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingR", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.125F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.375F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.875F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.0417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingL", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.125F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.375F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.75F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.875F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingL", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.125F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.375F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.75F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.875F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.0417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("wingL", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.125F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.375F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.75F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.875F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.0417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.1667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.6667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -2.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Larm", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Larm", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Larm", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("wings", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("wings", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("wings", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("full", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                        new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                ))
                .addBoneAnimation("full", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone5", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone5", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.2F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone5", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone2", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone2", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone2", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone3", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone3", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone3", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone4", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone4", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("bone4", new Transformation(Transformation.Targets.SCALE,
                        new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                ))
                .build();

        public static final Animation FLUTTER_SIT = Animation.Builder.create(2.5F).looping()
                .addBoneAnimation("wingR", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-5.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5F, AnimationHelper.createRotationalVector(-7.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("wingL", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(-2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createRotationalVector(-3.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5F, AnimationHelper.createRotationalVector(-5.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -0.4F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.8333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("body", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 77.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(0.5833F, AnimationHelper.createRotationalVector(1.0F, 0.0F, 77.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 77.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(1.875F, AnimationHelper.createRotationalVector(-1.0F, 0.0F, 77.5F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 77.5F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                        new Keyframe(2.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -75.0F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.ROTATE,
                        new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -70.5F), Transformation.Interpolations.LINEAR)
                ))
                .addBoneAnimation("full2", new Transformation(Transformation.Targets.TRANSLATE,
                        new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -8.6F, 0.0F), Transformation.Interpolations.LINEAR)
                ))
                .build();



        public static final Animation FLUTTER_WALK2SIT = Animation.Builder.create(1.3333F)
                        .addBoneAnimation("wingR", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingR", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingR", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.1667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingL", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.1667F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9167F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingL", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.1667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingL", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.1667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("head", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("tail", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 70.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("tail", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -1.76F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -67.5F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -62.5F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Larm", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Larm", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Larm", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("wings", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("wings", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("wings", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("full", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(0.0F, -8.4F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("full", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone5", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone5", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.2F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone5", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone2", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone2", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone2", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone3", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone3", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone3", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone4", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone4", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone4", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .build();

        public static final Animation FLUTTER_SIT2WALK = Animation.Builder.create(1.3333F)
                        .addBoneAnimation("wingR", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.4167F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.7917F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.125F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingR", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.4167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.7917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.125F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingR", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.4167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.7917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9583F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.125F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingL", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.4167F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.7917F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9583F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.125F, AnimationHelper.createRotationalVector(0.0F, -60.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingL", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.4167F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.7917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9583F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.125F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("wingL", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.4167F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.7917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.9583F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.125F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.2917F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("head", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0417F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6667F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("head", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.6667F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("head", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.6667F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("tail", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 70.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("tail", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("tail", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 4.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rarm", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -67.5F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -1.76F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Rleg", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.2F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -62.5F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.25F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Lleg", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0417F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Larm", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createRotationalVector(0.0F, 0.0F, -6.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Larm", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.7083F, AnimationHelper.createTranslationalVector(0.1F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("Larm", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("wings", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("wings", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("wings", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("full", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, -8.4F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(0.5417F, AnimationHelper.createTranslationalVector(0.0F, 0.5F, 0.0F), Transformation.Interpolations.CUBIC),
                                new Keyframe(1.25F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.CUBIC)
                        ))
                        .addBoneAnimation("full", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.5417F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.25F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone5", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone5", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.2F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone5", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone2", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone2", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone2", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone3", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 2.5F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone3", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.1F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone3", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone4", new Transformation(Transformation.Targets.ROTATE,
                                new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 5.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone4", new Transformation(Transformation.Targets.TRANSLATE,
                                new Keyframe(0.0F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(0.625F, AnimationHelper.createTranslationalVector(0.0F, 0.3F, 0.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createTranslationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .addBoneAnimation("bone4", new Transformation(Transformation.Targets.SCALE,
                                new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
                                new Keyframe(1.3333F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
                        ))
                        .build();
        }