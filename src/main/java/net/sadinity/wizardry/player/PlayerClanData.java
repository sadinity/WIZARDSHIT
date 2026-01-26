package net.sadinity.wizardry.player;

import net.minecraft.server.network.ServerPlayerEntity;

public class PlayerClanData {

    private static final String CLAN_PREFIX = "wizardry_clan_";

    public static boolean hasClan(ServerPlayerEntity player) {
        for (String tag : player.getCommandTags()) {
            if (tag.startsWith(CLAN_PREFIX)) {
                return true;
            }
        }
        return false;
    }

    public static void setClan(ServerPlayerEntity player, String clan) {
        // Verwijder oude clan tags (veiligheid)
        player.getCommandTags().removeIf(tag -> tag.startsWith(CLAN_PREFIX));

        // Voeg nieuwe toe
        player.addCommandTag(CLAN_PREFIX + clan);
    }

    public static String getClan(ServerPlayerEntity player) {
        for (String tag : player.getCommandTags()) {
            if (tag.startsWith(CLAN_PREFIX)) {
                return tag.substring(CLAN_PREFIX.length());
            }
        }
        return "";
    }
}
