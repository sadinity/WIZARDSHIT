package net.sadinity.wizardry.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.data.WizardryPlayerData;
import net.sadinity.wizardry.player.WizardryPlayerDataProvider;

import static net.minecraft.server.command.CommandManager.argument;
import static net.minecraft.server.command.CommandManager.literal;

public class WizardryCommands {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {

        dispatcher.register(
                literal("wizardry")
                        .requires(source -> source.hasPermissionLevel(2))

                        // /wizardry resetclan <player>
                        .then(literal("resetclan")
                                .then(argument("player", EntityArgumentType.player())
                                        .executes(context -> {

                                            ServerPlayerEntity target =
                                                    EntityArgumentType.getPlayer(context, "player");

                                            WizardryPlayerData data =
                                                    WizardryPlayerDataProvider.get(target);

                                            data.resetClan();

                                            context.getSource().sendFeedback(
                                                    () -> Text.literal(
                                                            "Clan reset voor " + target.getName().getString()
                                                    ),
                                                    true
                                            );

                                            return 1;
                                        })
                                )
                        )

                        // /wizardry unlocktest
                        .then(literal("unlocktest")
                                .executes(context -> unlockTestSkill(context.getSource()))
                        )
        );
    }

    private static int unlockTestSkill(ServerCommandSource source) {
        ServerPlayerEntity player = source.getPlayer();
        if (player == null) return 0;

        WizardryPlayerData data =
                WizardryPlayerDataProvider.get(player);

        Identifier skillId =
                Identifier.of("wizardry", "fire/fire_affinity_1");

        data.unlockSkill(skillId);

        source.sendFeedback(
                () -> Text.literal("§aSkill unlocked: " + skillId),
                false
        );

        return 1;
    }
}
