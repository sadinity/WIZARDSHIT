package net.sadinity.wizardry.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.Wizardry;
import net.sadinity.wizardry.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup WIZARDRY_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Wizardry.MOD_ID, "wizardry"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.MAGIC_ESSENCE))
                    .displayName(Text.translatable("itemgroup.wizardry"))
                    .entries((context, entries) -> {
                        entries.add(ModBlocks.AMBER_LOG);
                        entries.add(ModBlocks.STRIPPED_AMBER_LOG);
                        entries.add(ModBlocks.AMBER_PLANKS);
                        entries.add(ModBlocks.AMBER_LEAVES);

                        entries.add(ModBlocks.ASH_LOG);
                        entries.add(ModBlocks.STRIPPED_ASH_LOG);
                        entries.add(ModBlocks.ASH_PLANKS);
                        entries.add(ModBlocks.ASH_LEAVES);

                        entries.add(ModBlocks.ELDER_LOG);
                        entries.add(ModBlocks.STRIPPED_ELDER_LOG);
                        entries.add(ModBlocks.ELDER_PLANKS);
                        entries.add(ModBlocks.ELDER_DOOR);
                        entries.add(ModBlocks.ELDER_TRAPDOOR);
                        entries.add(ModBlocks.ELDER_LEAVES);

                        entries.add(ModBlocks.WILLOW_LOG);
                        entries.add(ModBlocks.STRIPPED_WILLOW_LOG);
                        entries.add(ModBlocks.WILLOW_PLANKS);
                        entries.add(ModBlocks.WILLOW_LEAVES);


                        entries.add(ModItems.REGULAR_WAND);
                        entries.add(ModItems.MAGIC_ESSENCE);
                        entries.add(ModItems.MAGIC_PARTICLES);
                        // later items hier
                    })
                    .build()
    );

    public static void registerItemGroups() {
        Wizardry.LOGGER.info("Registering Item Groups for " + Wizardry.MOD_ID);
    }
}
