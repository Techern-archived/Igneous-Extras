package com.techern.minecraft.ia.blocks;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * A block representing a colored mossy obblestone {@link net.minecraft.block.Block}
 *
 * @since 0.0.1
 */
public class BlockDyedMossyCobblestone extends BlockColored {

    /**
     * Creates a new {@link BlockDyedMossyCobblestone}
     *
     * @since 0.0.1
     */
    public BlockDyedMossyCobblestone() {
        super(Material.rock);

        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabDecorations); //TODO: Add to Coloured Blocks tab
        this.setUnlocalizedName("dyed_mossy_cobblestone");
        this.setHarvestLevel("pickaxe", 0);
    }

}
