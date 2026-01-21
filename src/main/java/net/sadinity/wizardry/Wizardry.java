package net.sadinity.wizardry;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.sadinity.wizardry.block.ModBlocks;
import net.sadinity.wizardry.entity.ModEntities;
import net.sadinity.wizardry.entity.custom.FlutterEntity;
import net.sadinity.wizardry.item.ModItems;
import net.sadinity.wizardry.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Wizardry implements ModInitializer {
	public static final String MOD_ID = "wizardry";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		FabricDefaultAttributeRegistry.register(ModEntities.FLUTTER, FlutterEntity.createAttributes());
	}
}