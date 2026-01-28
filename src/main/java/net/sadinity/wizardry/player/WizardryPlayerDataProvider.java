package net.sadinity.wizardry.player;

import net.minecraft.server.network.ServerPlayerEntity;
import net.sadinity.wizardry.data.WizardryPlayerData;

import java.util.WeakHashMap;

public class WizardryPlayerDataProvider {

    private static final WeakHashMap<ServerPlayerEntity, WizardryPlayerData> DATA =
            new WeakHashMap<>();

    public static WizardryPlayerData get(ServerPlayerEntity player) {
        return DATA.computeIfAbsent(player, p -> new WizardryPlayerData());
    }

    public static void copy(ServerPlayerEntity oldPlayer, ServerPlayerEntity newPlayer) {
        WizardryPlayerData oldData = get(oldPlayer);
        WizardryPlayerData newData = get(newPlayer);
        newData.readFrom(oldData);
    }
}
