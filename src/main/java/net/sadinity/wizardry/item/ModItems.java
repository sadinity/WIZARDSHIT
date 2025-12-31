package net.sadinity.wizardry.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.Wizardry;

public class ModItems {
    public static final Item REGULAR_WAND = registerItem("regular_wand", new Item(new Item.Settings()));
    public static final Item MAGIC_ESSENCE = registerItem("magic_essence", new Item(new Item.Settings()));
    public static final Item MAGIC_PARTICLES = registerItem("magic_particles", new Item(new Item.Settings()));
    public static final Item ELDER_DOOR = registerItem("elder_door", new Item(new Item.Settings()));

    private  static Item registerItem(String name, Item item) {
return Registry.register(Registries.ITEM, Identifier.of(Wizardry.MOD_ID, name), item);
    }
    public static void registerModItems(){

    Wizardry.LOGGER.info("Registering Mod Items for " + Wizardry.MOD_ID);


    }
         }