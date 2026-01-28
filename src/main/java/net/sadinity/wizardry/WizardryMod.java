package net.sadinity.wizardry;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.sadinity.wizardry.block.ModBlocks;
import net.sadinity.wizardry.command.WizardryCommands;
import net.sadinity.wizardry.entity.ModEntities;
import net.sadinity.wizardry.entity.custom.FlutterEntity;
import net.sadinity.wizardry.item.ModItemGroups;
import net.sadinity.wizardry.item.ModItems;
import net.sadinity.wizardry.player.WizardryPlayerDataProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WizardryMod implements ModInitializer {

    public static final String MOD_ID = "wizardry";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        // Items
        ModItems.register();

        // Commands
        CommandRegistrationCallback.EVENT.register(
                (dispatcher, registryAccess, environment) ->
                        WizardryCommands.register(dispatcher)
        );

        // Player data copy (respawn / dimension change)
        ServerPlayerEvents.COPY_FROM.register((oldPlayer, newPlayer, alive) -> {
            WizardryPlayerDataProvider.copy(oldPlayer, newPlayer);
        });

        FabricDefaultAttributeRegistry.register(
                ModEntities.FLUTTER,
                FlutterEntity.createFlutterAttributes()
        );
        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();




        LOGGER.info("Wizardry initialized");
    }
}
