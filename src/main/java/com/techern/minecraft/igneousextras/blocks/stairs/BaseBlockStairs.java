package com.techern.minecraft.igneousextras.blocks.stairs;

import com.techern.minecraft.igneousextras.blocks.IABlocks;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

/**
 * A wrapper around {@link BlockStairs}
 *
 * @since 0.0.1
 */
public class BaseBlockStairs extends BlockStairs {

    /**
     * Creates a new {@link BaseBlockStairs}
     *
     * @param referenceState The {@link IBlockState} of the parent {@link net.minecraft.block.Block}
     * @param unlocalizedName The unlocalized name to use
     * @since 0.0.1
     */
    public BaseBlockStairs(IBlockState referenceState, String unlocalizedName) {
        super(referenceState);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(IABlocks.STAIRS_TAB);
    }
}
