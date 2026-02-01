package net.sadinity.wizardry.skilltree;

import net.minecraft.util.Identifier;

public class SkillNode {

    public final Identifier id;
    public final Identifier icon;
    public final int x;
    public final int y;
    public final SkillNodeType type;

    public boolean unlocked = false;

    public SkillNode(
            Identifier id,
            Identifier icon,
            int x,
            int y,
            SkillNodeType type
    ) {
        this.id = id;
        this.icon = icon;
        this.x = x;
        this.y = y;
        this.type = type;
    }
}
