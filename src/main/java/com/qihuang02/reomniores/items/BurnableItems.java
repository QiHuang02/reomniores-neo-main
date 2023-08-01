package com.qihuang02.reomniores.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class BurnableItems extends Item {
    private final int burnTime;

    public BurnableItems(int burnTime) {
        super(new Properties());
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
        return burnTime;
    }
}
