package org.techern.minecraft.igneousextras.items;

import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

/**
 * An extension of {@link ItemTool} (for now) that pretends to be an {@link net.minecraft.item.ItemAxe}
 *
 * @since 0.0.2
 */
public class ItemIgneousAxe extends ItemTool {

	/**
	 * The temporary hardcoded list of blocks this {@link ItemIgneousAxe} is effective on
	 *
	 * @since 0.0.2
	 */
	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder, Blocks.wooden_button, Blocks.wooden_pressure_plate);

	/**
	 * The temporary hardcoded list of tool classes this {@link ItemIgneousAxe} is
	 *
	 * Lol
	 *
	 * @since 0.0.2
	 */
	private static final Set<String> CLASSES = Sets.newHashSet("axe");

	/**
	 * Creates a new {@link ItemIgneousAxe}
	 *
	 * @param mat The {@link net.minecraft.item.Item.ToolMaterial} being used
	 * @param unlocalizedName The name of this {@link ItemIgneousAxe}
	 *
	 * @since 0.0.2
	 */
	public ItemIgneousAxe(ToolMaterial mat, String unlocalizedName) {
		super(8.0F, -3.2F, mat, EFFECTIVE_ON);
		this.setUnlocalizedName(unlocalizedName + "_axe");
		this.setRegistryName(unlocalizedName + "_axe");
	}

	/**
	 * Gets a {@link Set<String>} of tool classes defining this {@link ItemIgneousAxe}
	 *
	 * @param ignoreMe Ignore me
	 *
	 * @return A {@link Set<String>} of tool classes
	 *
	 * @since 0.0.2
	 */
	@Override
	public Set<String> getToolClasses(ItemStack ignoreMe) {
		return CLASSES;
	}
}
