package com.techern.minecraft.igneousextras.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.techern.minecraft.igneousextras.ConfigHandler;

public class IAItems {
	
	public static void registerItems() {
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) registerTools(ConfigHandler.MAT_ANDESITE, "andestite");
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) registerTools(ConfigHandler.MAT_GRANITE, "granite");
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) registerTools(ConfigHandler.MAT_DIORITE, "diorite");
	}
	
	@SuppressWarnings("deprecation")
	public static void registerTools(ToolMaterial mat, String name) {
		GameRegistry.registerItem(new ItemIgneousSword(mat, name), name + "_sword");
		GameRegistry.registerItem(new ItemIgneousPickaxe(mat, name), name + "_pickaxe");
		GameRegistry.registerItem(new ItemIgneousAxe(mat, name), name + "_axe");
		GameRegistry.registerItem(new ItemIgneousShovel(mat, name), name + "_shovel");
		GameRegistry.registerItem(new ItemIgneousHoe(mat, name), name + "_hoe");
	}

	public static void registerRecipes() {
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) registerToolRecipes(Blocks.stone, 1);
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) registerToolRecipes(Blocks.stone, 3);
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) registerToolRecipes(Blocks.stone, 5);
	}

	public static void registerToolRecipes(Block baseBlock, int meta) {
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " B ", " B ", " S ", 'S', Items.stick, 'B', baseBlock); //sword
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), "BBB", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), "BB ", "BS ", " S ", 'S', Items.stick, 'B', baseBlock); //axe
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " BB", " SB", " S ", 'S', Items.stick, 'B', baseBlock); //axe flipped
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " B ", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //shovel
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " BB", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //hoe
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), "BB ", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //hoe flipped
	}
}
