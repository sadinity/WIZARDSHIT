package net.sadinity.wizardry.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class GrimoireScreen extends Screen {

    private static final Identifier BACKGROUND =
            Identifier.of("wizardry", "textures/gui/grimoire.png");

    public GrimoireScreen() {
        super(Text.literal("Grimoire"));
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context);

        int x = (this.width - 256) / 2;
        int y = (this.height - 180) / 2;

        context.drawTexture(
                BACKGROUND,
                x,
                y,
                0,
                0,
                256,
                180,
                256,
                180
        );

        context.drawText(
                this.textRenderer,
                "Grimoire",
                x + 100,
                y + 10,
                0xE6D9A3,
                false
        );

        super.render(context, mouseX, mouseY, delta);
    }

    private void renderBackground(DrawContext context) {
    }

    @Override
    public boolean shouldPause() {
        return false;
    }
}
