package com.techern.minecraft.igneousextras.blocks;

import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * A block representing a colored stone {@link net.minecraft.block.Block}
 *
 * @since 0.0.1
 */
public class BlockDyedStone extends BlockColored {

    /**
     * Creates a new {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public BlockDyedStone(String unlocalizedName) {
        super(Material.rock);

        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(SoundType.STONE);
        this.setCreativeTab(IABlocks.DYED_BLOCKS_TAB);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(unlocalizedName);
        this.setHarvestLevel("pickaxe", 0);
    }

}
