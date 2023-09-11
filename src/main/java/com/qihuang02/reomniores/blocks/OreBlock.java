package com.qihuang02.reomniores.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.IntProvider;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class OreBlock extends DropExperienceBlock {
    private final IntProvider xpRange;

    public OreBlock(BlockBehaviour.Properties properties) {
        this(properties, ConstantInt.of(0));
    }

    public OreBlock(BlockBehaviour.Properties properties, IntProvider xpRange) {
        super(properties);
        this.xpRange = xpRange;
    }

    public void spawnAfterBreak(BlockState blockState, ServerLevel serverLevel, BlockPos blockPos, ItemStack itemStack, boolean b) {
        super.spawnAfterBreak(blockState, serverLevel, blockPos, itemStack, b);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.level.LevelReader level, net.minecraft.util.RandomSource randomSource, BlockPos pos, int fortuneLevel, int silkTouchLevel) {
        return silkTouchLevel == 0 ? this.xpRange.sample(randomSource) : 0;
    }
}
