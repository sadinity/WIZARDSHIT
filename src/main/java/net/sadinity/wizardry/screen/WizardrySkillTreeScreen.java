package net.sadinity.wizardry.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.skilltree.SkillNode;
import net.sadinity.wizardry.screen.widget.SkillButton;
import net.sadinity.wizardry.skilltree.SkillNodeType;

public class WizardrySkillTreeScreen extends Screen {

    private static final Identifier BACKGROUND =
            Identifier.of("wizardry", "textures/gui/skilltree.png");

    private static final int BG_WIDTH = 256;
    private static final int BG_HEIGHT = 256;

    private int bgX;
    private int bgY;

    public WizardrySkillTreeScreen() {
        super(Text.literal("Skill Tree"));
    }

    @Override
    public boolean shouldPause() {
        return false; // geen blur / pause
    }

    @Override
    protected void init() {
        // Widgets resetten bij heropenen
        this.clearChildren();

        // Achtergrond centreren
        this.bgX = (this.width - BG_WIDTH) / 2;
        this.bgY = (this.height - BG_HEIGHT) / 2;

        SkillNode quizRoot = new SkillNode(
                Identifier.of("wizardry", "quiz_root"),
                Identifier.of("wizardry", "textures/item/quiz_item.png"),
                BG_WIDTH / 2 - 8,
                BG_HEIGHT / 2 - 8,
                SkillNodeType.ROOT
        );


        this.addDrawableChild(
                new SkillButton(
                        bgX + quizRoot.x,
                        bgY + quizRoot.y,
                        quizRoot
                )
        );
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {

        // GUI achtergrond
        context.drawTexture(
                BACKGROUND,
                bgX,
                bgY,
                0,
                0,
                BG_WIDTH,
                BG_HEIGHT,
                BG_WIDTH,
                BG_HEIGHT
        );

        super.render(context, mouseX, mouseY, delta);
    }
}
