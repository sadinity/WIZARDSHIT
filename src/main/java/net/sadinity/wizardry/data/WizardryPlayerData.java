package net.sadinity.wizardry.data;

import net.minecraft.util.Identifier;

import java.util.HashSet;
import java.util.Set;

public class WizardryPlayerData {

    private final Set<Identifier> unlockedSkills = new HashSet<>();
    private String clan = "";
    private int skillPoints = 0;

    /* -------- SKILLS -------- */

    public void unlockSkill(Identifier id) {
        unlockedSkills.add(id);
    }

    public boolean hasSkill(Identifier id) {
        return unlockedSkills.contains(id);
    }

    public Set<Identifier> getUnlockedSkills() {
        return unlockedSkills;
    }

    /* -------- CLAN -------- */

    public void setClan(String clan) {
        this.clan = clan;
    }

    public boolean hasClan() {
        return !clan.isEmpty();
    }

    public String getClan() {
        return clan;
    }

    public void resetClan() {
        clan = "";
        unlockedSkills.clear();
        skillPoints = 0;
    }

    /* -------- SKILL POINTS -------- */

    public int getSkillPoints() {
        return skillPoints;
    }

    public void addSkillPoints(int amount) {
        skillPoints += amount;
    }

    /* -------- COPY (respawn / dimension) -------- */

    public void readFrom(WizardryPlayerData other) {
        this.unlockedSkills.clear();
        this.unlockedSkills.addAll(other.unlockedSkills);
        this.clan = other.clan;
        this.skillPoints = other.skillPoints;
    }
}
