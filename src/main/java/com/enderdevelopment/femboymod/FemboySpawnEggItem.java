package com.enderdevelopment.femboymod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.SpawnEggItem;

public class FemboySpawnEggItem extends SpawnEggItem {
    public FemboySpawnEggItem(EntityType<? extends Mob> type, int backgroundColor, int highlightColor, Properties props) {
        super(type, backgroundColor, highlightColor, props);
    }
}