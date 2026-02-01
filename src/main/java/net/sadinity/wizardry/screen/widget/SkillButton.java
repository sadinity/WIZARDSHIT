package net.sadinity.wizardry.screen.widget;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.widget.ClickableWidget;
import net.minecraft.client.gui.screen.narration.NarrationMessageBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;
import net.sadinity.wizardry.skilltree.SkillNode;

public class SkillButton extends ClickableWidget {

    private static final Identifier ADV_WIDGETS =
            Identifier.of("minecraft", "textures/gui/advancements/widgets.png");

    private final SkillNode skill;

    // advancement frame data (TASK)
    private static final int FRAME_SIZE = 26;
    private static final int ICON_SIZE = 16;

    public SkillButton(int x, int y, SkillNode skill) {
        super(x, y, FRAME_SIZE, FRAME_SIZE, Text.empty());
        this.skill = skill;
    }

    @Override
    protected void renderWidget(DrawContext context, int mouseX, int mouseY, float delta) {

        // =========================
        // 1️⃣ FRAME (achtergrond)
        // =========================
        int v = skill.unlocked ? 0 : 26; // 0 = unlocked (goud), 26 = locked (grijs)

        context.drawTexture(
                ADV_WIDGETS,
                getX(),
                getY(),
                0,
                v,
                FRAME_SIZE,
                FRAME_SIZE,
                256,
                256
        );

        // =========================
        // 2️⃣ GEANIMEERD ICON
        // =========================
        int frameCount = 8;
        int frameHeight = 16;
        int textureHeight = 128;

        long ticks = System.currentTimeMillis() / 50;
        int frame = (int) (ticks % frameCount);

        int iconX = getX() + 5;
        int iconY = getY() + 5;

        context.drawTexture(
                skill.icon,
                iconX,
                iconY,
                0,
                frame * frameHeight,
                ICON_SIZE,
                ICON_SIZE,
                ICON_SIZE,
                textureHeight
        );
    }

    @Override
    public void onClick(double mouseX, double mouseY) {
        skill.unlocked = !skill.unlocked;
    }

    @Override
    protected void appendClickableNarrations(NarrationMessageBuilder builder) {
        // leeg laten
    }
}
