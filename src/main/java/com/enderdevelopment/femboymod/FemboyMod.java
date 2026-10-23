package com.enderdevelopment.femboymod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FemboyMod implements ModInitializer {
    public static final String MOD_ID = "femboy_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final EntityType<FemboyEntity> FEMBOY_ENTITY_TYPE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            new ResourceLocation(MOD_ID, "femboy_entity"),
            EntityType.Builder.of(FemboyEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 1.8f)
                    .build("femboy_entity"));

    public static final Item FEMBOY_SPAWN_EGG = Registry.register(
            BuiltInRegistries.ITEM,
            new ResourceLocation(MOD_ID, "femboy_spawn_egg"),
            new FemboySpawnEggItem(FEMBOY_ENTITY_TYPE, 0xFF69B4, 0xFFFFFF, new Item.Properties()));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Femboy Mod");
    }
}