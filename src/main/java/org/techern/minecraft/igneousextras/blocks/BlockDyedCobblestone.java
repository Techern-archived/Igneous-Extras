package org.techern.minecraft.igneousextras.blocks;

import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * A block representing a colored cobblestone {@link net.minecraft.block.Block}
 *
 * @since 0.0.1
 */
public class BlockDyedCobblestone extends BlockColored {

    /**
     * Creates a new {@link BlockDyedCobblestone}
     *
     * @since 0.0.1
     */
    public BlockDyedCobblestone() {
        super(Material.rock);

        this.setHardness(2.0F);
        this.setResistance(10.0F);
        this.setStepSound(SoundType.STONE);
        this.setCreativeTab(IABlocks.DYED_BLOCKS_TAB);
        this.setUnlocalizedName("dyed_cobblestone");
        this.setRegistryName("dyed_cobblestone");
        this.setHarvestLevel("pickaxe", 0);
    }

}
