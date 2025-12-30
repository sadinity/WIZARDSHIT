package net.sadinity.wizardry;

import net.fabricmc.api.ModInitializer;

import net.sadinity.wizardry.block.ModBlocks;
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

	}
}