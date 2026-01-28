package net.sadinity.wizardry.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class WizardrySkillTreeScreen extends Screen {

    public WizardrySkillTreeScreen() {
        super(Text.literal("Wizardry Skill Tree"));
    }

    @Override
    protected void init() {
        // later: skill nodes
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {

        // Achtergrond (donker)
        context.fill(0, 0, this.width, this.height, 0xFF0A0A0A);

        if (this.textRenderer != null) {
            context.drawCenteredTextWithShadow(
                    this.textRenderer,
                    this.title,
                    this.width / 2,
                    20,
                    0xFFFFFF
            );

            super.render(context, mouseX, mouseY, delta);
        }
    }
}
