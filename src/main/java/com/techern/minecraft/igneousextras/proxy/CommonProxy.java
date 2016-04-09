package com.techern.minecraft.igneousextras.proxy;

import net.minecraft.item.Item;

/**
 * A {@link net.minecraftforge.fml.common.SidedProxy} for the {@link com.techern.minecraft.IgneousExtrasMod}
 *
 * @since 0.0.1
 */
public abstract class CommonProxy {

    /**
     * Registers an {@link Item} in the {@link net.minecraft.client.renderer.ItemModelMesher}
     *
     * @param item The {@link Item} being registered
     * @param metadata The metadata of said item
     * @param itemName The item's name
     *
     * @since 0.0.1
     */
    public abstract void registerItemModelMesher(Item item, int metadata, String itemName);

    /**
     * Registers an {@link Item} in the {@link net.minecraft.client.renderer.ItemModelMesher}
     *
     * @param item     The {@link Item} being registered
     * @param metadata The metadata of said item
     * @param itemName The item's name
     * @param metadataNameAndValue The name and value of the metadata
     *
     * @since 0.0.1
     */
    public abstract void registerItemModelMesher(Item item, int metadata, String itemName, String metadataNameAndValue);

}
