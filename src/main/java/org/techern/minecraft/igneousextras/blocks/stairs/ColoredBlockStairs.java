package org.techern.minecraft.igneousextras.blocks.stairs;

import org.techern.minecraft.igneousextras.blocks.IABlocks;
import net.minecraft.block.state.IBlockState;

/**
 * A wrapper around {@link BaseBlockStairs}
 *
 * @since 0.0.1
 */
public class ColoredBlockStairs extends BaseBlockStairs {

    /**
     * Creates a new {@link ColoredBlockStairs}
     *
     * @param referenceState The {@link IBlockState} of the parent {@link net.minecraft.block.Block}
     * @param unlocalizedName The unlocalized name to use
     * @since 0.0.1
     */
    public ColoredBlockStairs(IBlockState referenceState, String unlocalizedName) {
        super(referenceState, unlocalizedName);
        this.setCreativeTab(IABlocks.DYED_STAIRS_TAB);
    }
}
