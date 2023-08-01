package com.qihuang02.reomniores.items;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;

public class BurnableBlockItems extends BlockItem {
    private final int burnTime;

    public BurnableBlockItems(Block block, int burnTime) {
        super(block, new Properties());
        this.burnTime = burnTime;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
        return burnTime;
    }
}
