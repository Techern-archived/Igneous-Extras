package org.techern.minecraft.igneousextras.items;

import net.minecraft.block.Block;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * An extension of {@link ItemBlock} for {@link net.minecraft.block.BlockColored} implementations
 *
 * @since 0.0.1
 */
public class ItemColoredBlock extends ItemBlock {

    /**
     * Creates a new {@link ItemColoredBlock}
     *
     * @param block The {@link Block} being used
     * @since 0.0.1
     */
    public ItemColoredBlock(Block block)
    {
        super(block);
        this.setMaxDamage(0);
        this.setHasSubtypes(true);
    }

    /**
     * Provides a metadata value for the corresponding damage value
     *
     * @since 0.0.1
     */
    @Override
	public int getMetadata(int damage)
    {
        return damage;
    }

    /**
     * Gets the unlocalized name for the provided {@link ItemStack}, changing based on the provided color
     *
     * @since 0.0.1
     */
    @Override
	public String getUnlocalizedName(ItemStack stack)
    {
        return super.getUnlocalizedName() + "." + EnumDyeColor.byMetadata(stack.getMetadata()).getUnlocalizedName();
    }

}
