package com.techern.minecraft.ia.blocks;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * A block representing a colored diorite {@link net.minecraft.block.Block}
 *
 * @since 0.0.1
 */
public class BlockDyedDiorite extends BlockColored {

    /**
     * Creates a new {@link BlockDyedDiorite}
     *
     * @since 0.0.1
     */
    public BlockDyedDiorite() {
        super(Material.rock);

        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabDecorations); //TODO: Add to Coloured Blocks tab
        this.setUnlocalizedName("dyed_diorite");
        this.setHarvestLevel("pickaxe", 0);
    }

}
