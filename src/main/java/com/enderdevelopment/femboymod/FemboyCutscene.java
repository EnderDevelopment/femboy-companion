package com.enderdevelopment.femboymod;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.Random;

public class FemboyCutscene {
    private static final Random RANDOM = new Random();

    public static void playCutscene(Player player, FemboyEntity femboy) {
        // Logic to make the femboy lay on the player's chest
        // Bring random items to the player
        ItemStack randomItem = getRandomItem();
        player.getInventory().add(randomItem);
    }

    private static ItemStack getRandomItem() {
        // Logic to get a random item
        return new ItemStack(Items.DIAMOND); // Example
    }
}