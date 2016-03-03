package com.techern.minecraft.ia.blocks;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * A block representing a colored smooth andesite {@link net.minecraft.block.Block}
 *
 * @since 0.0.1
 */
public class BlockDyedSmoothAndesite extends BlockColored {

    /**
     * Creates a new {@link BlockDyedSmoothAndesite}
     *
     * @since 0.0.1
     */
    public BlockDyedSmoothAndesite() {
        super(Material.rock);

        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabDecorations); //TODO: Add to Coloured Blocks tab
        this.setUnlocalizedName("dyed_smooth_andesite");
        this.setHarvestLevel("pickaxe", 0);
    }

}
