package com.techern.minecraft.igneousextras.blocks.redstone;

import net.minecraft.block.BlockLever;

/**
 * An extension of {@link BlockLever} used in order to gain access to the constructor
 *
 * @since 0.0.2
 */
public class BlockBasicLever extends BlockLever {

    /**
     * Creates a new {@link BlockBasicLever}
     *
     * @param unlocalizedName The unlocalized name being used by this {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public BlockBasicLever(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
    }

}
