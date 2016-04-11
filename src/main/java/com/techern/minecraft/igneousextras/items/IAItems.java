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
	//public static Item ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_ANDESITE, "andesite");FIXME regression?
	public static Item ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_ANDESITE, "andesite");
	
	public static Item GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_GRANITE, "granite");
	//public static Item GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_GRANITE, "granite");FIXME regression?
	public static Item GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_GRANITE, "granite");
	
	public static Item DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_DIORITE, "diorite");
	//public static Item DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_DIORITE, "diorite");FIXME regression?
	public static Item DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_DIORITE, "diorite");
	
	public static void registerItems() {
		//GameRegistry
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) {
			GameRegistry.register(ANDESITE_SWORD);
			GameRegistry.register(ANDESITE_PICKAXE);
			//FIXME axe
			GameRegistry.register(ANDESITE_SHOVEL);
			GameRegistry.register(ANDESITE_HOE);
		}
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) {
			GameRegistry.register(GRANITE_SWORD);
			GameRegistry.register(GRANITE_PICKAXE);
			//FIXME axe
			GameRegistry.register(GRANITE_SHOVEL);
			GameRegistry.register(GRANITE_HOE);
		}
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) {
			GameRegistry.register(DIORITE_SWORD);
			GameRegistry.register(DIORITE_PICKAXE);
			//FIXME axe
			GameRegistry.register(DIORITE_SHOVEL);
			GameRegistry.register(DIORITE_HOE);
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
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) registerToolRecipes(Blocks.stone, 1, GRANITE_SWORD, GRANITE_PICKAXE,/* GRANITE_AXE,*/ GRANITE_SHOVEL, GRANITE_HOE);
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) registerToolRecipes(Blocks.stone, 3, DIORITE_SWORD, DIORITE_PICKAXE, /*DIORITE_AXE,*/ DIORITE_SHOVEL, DIORITE_HOE);
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) registerToolRecipes(Blocks.stone, 5, ANDESITE_SWORD, ANDESITE_PICKAXE, /*ANDESITE_AXE,*/ ANDESITE_SHOVEL, ANDESITE_HOE);
	}

	private static void registerToolRecipes(Block baseBlock, int meta, Item sword, Item pickaxe, /*Item axe,*/ Item shovel, Item hoe) {
		ItemStack baseBlockStack = new ItemStack(baseBlock, 1, meta);
		GameRegistry.addShapedRecipe(new ItemStack(sword, 1), " B ", " B ", " S ", 'S', Items.stick, 'B', baseBlockStack); //sword
		GameRegistry.addShapedRecipe(new ItemStack(pickaxe, 1), "BBB", " S ", " S ", 'S', Items.stick, 'B', baseBlockStack); //pickaxe
		//GameRegistry.addShapedRecipe(new ItemStack(axe, 1), "BB ", "BS ", " S ", 'S', Items.stick, 'B', baseBlockStack); //FIXME axe
		//GameRegistry.addShapedRecipe(new ItemStack(axe, 1), " BB", " SB", " S ", 'S', Items.stick, 'B', baseBlockStack); //FIXME axe flipped
		GameRegistry.addShapedRecipe(new ItemStack(shovel, 1), " B ", " S ", " S ", 'S', Items.stick, 'B', baseBlockStack); //shovel
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), " BB", " S ", " S ", 'S', Items.stick, 'B', baseBlockStack); //hoe
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), "BB ", " S ", " S ", 'S', Items.stick, 'B', baseBlockStack); //hoe flipped
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), "BB ", " S ", " S ", 'S', Items.stick, 'B', baseBlockStack); //hoe flipped
	}
}
