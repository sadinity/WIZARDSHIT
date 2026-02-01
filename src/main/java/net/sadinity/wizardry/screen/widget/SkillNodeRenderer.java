package net.sadinity.wizardry.screen.widget;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.skilltree.SkillNode;
import net.sadinity.wizardry.skilltree.SkillNodeType;

public class SkillNodeRenderer {

    private static final Identifier WIDGETS =
            Identifier.of("wizardry", "textures/gui/widgets.png");

    // Afmetingen vanilla node
    public static final int SIZE = 26;

    public static void draw(DrawContext context, SkillNode node, int x, int y) {

        int u = 0;
        int v = 0;

        // === Verticale rij ===
        if (node.unlocked) {
            v = 0;
        } else {
            v = 26;
        }

        // === Horizontale kolom ===
        if (node.type == SkillNodeType.GOAL) {
            u = 26;
        } else if (node.type == SkillNodeType.CHALLENGE) {
            u = 52;
        }

        context.drawTexture(
                WIDGETS,
                x - 5,
                y - 5,
                u,
                v,
                SIZE,
                SIZE,
                256,
                256
        );
    }
}
