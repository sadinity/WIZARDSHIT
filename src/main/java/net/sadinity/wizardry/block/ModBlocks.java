package net.sadinity.wizardry.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.Wizardry;




public class ModBlocks {

    public static final Block WILLOW_LOG = registerBlock("willow_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_WILLOW_LOG = registerBlock("stripped_willow_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WILLOW_PLANKS = registerBlock(
            "willow_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block WILLOW_LEAVES = registerBlock(
            "willow_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque())
            );

    public static final Block ASH_LOG = registerBlock(
            "ash_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block STRIPPED_ASH_LOG = registerBlock(
            "stripped_ash_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block ASH_PLANKS = registerBlock(
            "ash_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block ASH_LEAVES = registerBlock(
            "ash_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque())
    );


    public static final Block AMBER_LOG = registerBlock(
            "amber_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block STRIPPED_AMBER_LOG = registerBlock(
            "stripped_amber_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block AMBER_PLANKS = registerBlock(
            "amber_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block AMBER_LEAVES = registerBlock(
            "amber_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque())
    );

    public static final Block ELDER_LOG = registerBlock(
            "elder_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block STRIPPED_ELDER_LOG = registerBlock(
            "stripped_elder_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD))
    );

    public static final Block ELDER_PLANKS = registerBlock(
            "elder_planks",
            new Block(AbstractBlock.Settings.create()
                    .strength(2.0f)
                    .sounds(BlockSoundGroup.WOOD)
            )
    );

    public static final Block ELDER_DOOR = registerBlock(
            "elder_door",
            new DoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(3.0f)
                            .nonOpaque()
                            .sounds(BlockSoundGroup.WOOD)
            )
    );



    public static final Block ELDER_TRAPDOOR = registerBlock(
            "elder_trapdoor",
            new TrapdoorBlock(
                    BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(3.0f)
                            .nonOpaque()
                            .sounds(BlockSoundGroup.WOOD)
            )
    );




    public static final Block ELDER_LEAVES = registerBlock(
            "elder_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .strength(0.2f)
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque())
    );





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(
                Registries.BLOCK,
                Identifier.of(Wizardry.MOD_ID, name),
                block
        );
    }



    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Wizardry.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Wizardry.LOGGER.info("Registering Mod Blocks for " + Wizardry.MOD_ID);
    }
}
