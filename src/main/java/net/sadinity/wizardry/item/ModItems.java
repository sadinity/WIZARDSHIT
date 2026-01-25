package net.sadinity.wizardry.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.sadinity.wizardry.Wizardry;
import net.sadinity.wizardry.entity.ModEntities;
import net.sadinity.wizardry.item.custom.GrimoireItem;
import net.sadinity.wizardry.item.custom.QuizItem;

public class ModItems {
    public static final Item REGULAR_WAND = registerItem("regular_wand", new Item(new Item.Settings()));
    public static final Item MAGIC_ESSENCE = registerItem("magic_essence", new Item(new Item.Settings().rarity(Rarity.UNCOMMON)));
    public static final Item MAGIC_PARTICLES = registerItem("magic_particles", new Item(new Item.Settings()));
    public static final Item ELDER_DOOR = registerItem("elder_door", new Item(new Item.Settings()));

    public static final Item GRIMOIRE = Registry.register(
            Registries.ITEM,
            Identifier.of("wizardry", "grimoire"),
            new GrimoireItem(new Item.Settings().maxCount(1))
    );
    public static final Item QUIZ_ITEM = Registry.register(
            Registries.ITEM,
            Identifier.of("wizardry", "quiz_item"),
            new QuizItem(new Item.Settings().maxCount(1))
    );



    public static final Item FLUTTER_SPAWN_EGG = registerItem("flutter_spawn_egg",
            new SpawnEggItem(ModEntities.FLUTTER, 0xe3fffe,0xafd1e3, new Item.Settings()));

    private  static Item registerItem(String name, Item item) {
           return Registry.register(Registries.ITEM, Identifier.of(Wizardry.MOD_ID, name), item);
    }
    public static void registerModItems(){


    Wizardry.LOGGER.info("Registering Mod Items for " + Wizardry.MOD_ID);


    }
         }