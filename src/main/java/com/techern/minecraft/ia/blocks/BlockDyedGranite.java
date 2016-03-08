package com.techern.minecraft.ia.blocks;

import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * A block representing a colored granite {@link net.minecraft.block.Block}
 *
 * @since 0.0.1
 */
public class BlockDyedGranite extends BlockColored {

    /**
     * Creates a new {@link BlockDyedGranite}
     *
     * @since 0.0.1
     */
    public BlockDyedGranite() {
        super(Material.rock);

        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setStepSound(soundTypeStone);
        this.setCreativeTab(CreativeTabs.tabDecorations); //TODO: Add to Coloured Blocks tab
        this.setUnlocalizedName("dyed_granite");
        this.setHarvestLevel("pickaxe", 0);
    }

}
