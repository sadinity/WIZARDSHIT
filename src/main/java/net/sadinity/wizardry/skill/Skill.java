package net.sadinity.wizardry.skill;

import net.minecraft.util.Identifier;

public class Skill {

    private final Identifier id;

    public Skill(Identifier id) {
        this.id = id;
    }

    public Identifier getId() {
        return id;
    }
}
