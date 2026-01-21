package net.sadinity.wizardry.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.sadinity.wizardry.Wizardry;
import net.sadinity.wizardry.entity.custom.FlutterEntity;

public class ModEntities {
public static final EntityType<FlutterEntity> FLUTTER = Registry.register(Registries.ENTITY_TYPE,
        Identifier.of(Wizardry.MOD_ID, "flutter"),
        EntityType.Builder.create(FlutterEntity::new, SpawnGroup.CREATURE)
                .dimensions(1f, 1f).build());

    public  static void registerModEntities() {
        Wizardry.LOGGER.info("Registering Mod Entities for " + Wizardry.MOD_ID);

    }
}
