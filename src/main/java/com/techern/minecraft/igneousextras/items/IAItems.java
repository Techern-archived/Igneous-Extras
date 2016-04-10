package com.techern.minecraft.igneousextras.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.techern.minecraft.IgneousExtrasMod;
import com.techern.minecraft.igneousextras.ConfigHandler;

public class IAItems {
	public static Item ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_ANDESITE, "andesite");
	
	public static Item GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_GRANITE, "granite");
	
	public static Item DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_DIORITE, "diorite");
	
	@SuppressWarnings("deprecation")
	public static void registerItems() {
		//GameRegistry
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) {
			GameRegistry.registerItem(ANDESITE_SWORD, "andesite_sword");
			GameRegistry.registerItem(ANDESITE_PICKAXE, "andesite_pickaxe");
			//FIXME axe
			GameRegistry.registerItem(ANDESITE_SHOVEL, "andesite_shovel");
			GameRegistry.registerItem(ANDESITE_HOE, "andesite_hoe");
		}
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) {
			GameRegistry.registerItem(GRANITE_SWORD, "granite_sword");
			GameRegistry.registerItem(GRANITE_PICKAXE, "granite_pickaxe");
			//FIXME axe
			GameRegistry.registerItem(GRANITE_SHOVEL, "granite_shovel");
			GameRegistry.registerItem(GRANITE_HOE, "granite_hoe");
		}
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) {
			GameRegistry.registerItem(DIORITE_SWORD, "diorite_sword");
			GameRegistry.registerItem(DIORITE_PICKAXE, "diorite_pickaxe");
			//FIXME axe
			GameRegistry.registerItem(DIORITE_SHOVEL, "diorite_shovel");
			GameRegistry.registerItem(DIORITE_HOE, "diorite_hoe");
		}
		
		//Renderers
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_SWORD, 0, ANDESITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_PICKAXE, 0, ANDESITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		//FIXME axe
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_SHOVEL, 0, ANDESITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_HOE, 0, ANDESITE_HOE.getUnlocalizedName().substring(5), "inventory");
		
		
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_SWORD, 0, GRANITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_PICKAXE, 0, GRANITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		//FIXME axe
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_SHOVEL, 0, GRANITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_HOE, 0, GRANITE_HOE.getUnlocalizedName().substring(5), "inventory");
		
		
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_SWORD, 0, DIORITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_PICKAXE, 0, DIORITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		//FIXME axe
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_SHOVEL, 0, DIORITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_HOE, 0, DIORITE_HOE.getUnlocalizedName().substring(5), "inventory");
	}

	public static void registerRecipes() {
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) registerToolRecipes(Blocks.stone, 1);
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) registerToolRecipes(Blocks.stone, 3);
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) registerToolRecipes(Blocks.stone, 5);
	}

	private static void registerToolRecipes(Block baseBlock, int meta) {
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " B ", " B ", " S ", 'S', Items.stick, 'B', baseBlock); //sword
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), "BBB", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), "BB ", "BS ", " S ", 'S', Items.stick, 'B', baseBlock); //axe
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " BB", " SB", " S ", 'S', Items.stick, 'B', baseBlock); //axe flipped
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " B ", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //shovel
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), " BB", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //hoe
		GameRegistry.addShapedRecipe(new ItemStack(baseBlock, 1, meta), "BB ", " S ", " S ", 'S', Items.stick, 'B', baseBlock); //hoe flipped
	}
}
