package com.techern.minecraft.igneousextras.blocks.redstone;

import com.techern.minecraft.igneousextras.blocks.IABlocks;
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

        this.setCreativeTab(IABlocks.IGNEOUS_LEVER_TAB);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
    }

}
