package net.sadinity.wizardry.skill;

import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.Map;

public class SkillRegistry {

    private static final Map<Identifier, Skill> SKILLS = new HashMap<>();

    public static void register(Skill skill) {
        SKILLS.put(skill.getId(), skill);
    }

    public static Skill get(Identifier id) {
        return SKILLS.get(id);
    }

    public static boolean has(Identifier id) {
        return SKILLS.containsKey(id);
    }

    public static void clear() {
        SKILLS.clear();
    }

    public static int size() {
        return SKILLS.size();
    }
}
