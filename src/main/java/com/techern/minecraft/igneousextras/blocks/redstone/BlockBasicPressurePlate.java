package com.techern.minecraft.igneousextras.blocks.redstone;

import net.minecraft.block.BlockPressurePlate;
import net.minecraft.block.material.Material;

/**
 * An extension of {@link net.minecraft.block.BlockPressurePlate} for use in Igneous Extras
 *
 * @since 0.0.2
 */
public class BlockBasicPressurePlate extends BlockPressurePlate {

    /**
     * Creates a new {@link BlockBasicPressurePlate}
     *
     * @param material The {@link Material} used by this {@link BlockBasicPressurePlate}
     * @param sensitivity The {@link net.minecraft.block.BlockPressurePlate.Sensitivity} used by this {@link BlockBasicPressurePlate}
     * @param name The name of this {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public BlockBasicPressurePlate(Material material, Sensitivity sensitivity, String name) {
        super(material, sensitivity);

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

}
