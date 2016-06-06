package org.techern.minecraft.igneousextras.items;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.techern.minecraft.IgneousExtrasMod;
import org.techern.minecraft.igneousextras.ConfigHandler;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousAxe;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousHoe;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousPickaxe;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousShovel;
import org.techern.minecraft.igneousextras.items.weapons.ItemIgneousSword;

public class IgneousItems {
	public static Item ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_ANDESITE, "andesite");
	public static Item ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_ANDESITE, "andesite");

	public static Item GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_GRANITE, "granite");
	public static Item GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_GRANITE, "granite");

	public static Item DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_DIORITE, "diorite");
	public static Item DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_DIORITE, "diorite");
	
	public static Item POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_POLISHED_ANDESITE, "polished_andesite");
	public static Item POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_POLISHED_ANDESITE, "polished_andesite");
	public static Item POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_POLISHED_ANDESITE, "polished_andesite");
	public static Item POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_POLISHED_ANDESITE, "polished_andesite");
	public static Item POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_POLISHED_ANDESITE, "polished_andesite");

	public static Item POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_POLISHED_GRANITE, "polished_granite");
	public static Item POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_POLISHED_GRANITE, "polished_granite");
	public static Item POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_POLISHED_GRANITE, "polished_granite");
	public static Item POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_POLISHED_GRANITE, "polished_granite");
	public static Item POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_POLISHED_GRANITE, "polished_granite");

	public static Item POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.MAT_POLISHED_DIORITE, "polished_diorite");
	public static Item POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.MAT_POLISHED_DIORITE, "polished_diorite");
	public static Item POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.MAT_POLISHED_DIORITE, "polished_diorite");
	public static Item POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.MAT_POLISHED_DIORITE, "polished_diorite");
	public static Item POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.MAT_POLISHED_DIORITE, "polished_diorite");

	public static void registerItems() {
		//GameRegistry
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) {
			registerItems(ANDESITE_SWORD, ANDESITE_PICKAXE, ANDESITE_AXE, ANDESITE_SHOVEL, ANDESITE_HOE,
					POLISHED_ANDESITE_SWORD, POLISHED_ANDESITE_PICKAXE, POLISHED_ANDESITE_AXE, POLISHED_ANDESITE_SHOVEL, POLISHED_ANDESITE_HOE);
		}
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) {
			registerItems(GRANITE_SWORD, GRANITE_PICKAXE, GRANITE_AXE, GRANITE_SHOVEL, GRANITE_HOE,
					POLISHED_GRANITE_SWORD, POLISHED_GRANITE_PICKAXE, POLISHED_GRANITE_AXE, POLISHED_GRANITE_SHOVEL, POLISHED_GRANITE_HOE);
		}
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) {
			registerItems(DIORITE_SWORD, DIORITE_PICKAXE, DIORITE_AXE, DIORITE_SHOVEL, DIORITE_HOE,
					POLISHED_DIORITE_SWORD, POLISHED_DIORITE_PICKAXE, POLISHED_DIORITE_AXE, POLISHED_DIORITE_SHOVEL, POLISHED_DIORITE_HOE);
		}
		
		//Renderers
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_SWORD, 0, ANDESITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_PICKAXE, 0, ANDESITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_AXE, 0, ANDESITE_AXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_SHOVEL, 0, ANDESITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(ANDESITE_HOE, 0, ANDESITE_HOE.getUnlocalizedName().substring(5), "inventory");

		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_ANDESITE_SWORD, 0, POLISHED_ANDESITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_ANDESITE_PICKAXE, 0, POLISHED_ANDESITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_ANDESITE_AXE, 0, POLISHED_ANDESITE_AXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_ANDESITE_SHOVEL, 0, POLISHED_ANDESITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_ANDESITE_HOE, 0, POLISHED_ANDESITE_HOE.getUnlocalizedName().substring(5), "inventory");


		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_SWORD, 0, GRANITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_PICKAXE, 0, GRANITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_AXE, 0, GRANITE_AXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_SHOVEL, 0, GRANITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRANITE_HOE, 0, GRANITE_HOE.getUnlocalizedName().substring(5), "inventory");

		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_GRANITE_SWORD, 0, POLISHED_GRANITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_GRANITE_PICKAXE, 0, POLISHED_GRANITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_GRANITE_AXE, 0, POLISHED_GRANITE_AXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_GRANITE_SHOVEL, 0, POLISHED_GRANITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_GRANITE_HOE, 0, POLISHED_GRANITE_HOE.getUnlocalizedName().substring(5), "inventory");


		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_SWORD, 0, DIORITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_PICKAXE, 0, DIORITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_AXE, 0, DIORITE_AXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_SHOVEL, 0, DIORITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(DIORITE_HOE, 0, DIORITE_HOE.getUnlocalizedName().substring(5), "inventory");

		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_DIORITE_SWORD, 0, POLISHED_DIORITE_SWORD.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_DIORITE_PICKAXE, 0, POLISHED_DIORITE_PICKAXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_DIORITE_AXE, 0, POLISHED_DIORITE_AXE.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_DIORITE_SHOVEL, 0, POLISHED_DIORITE_SHOVEL.getUnlocalizedName().substring(5), "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(POLISHED_DIORITE_HOE, 0, POLISHED_DIORITE_HOE.getUnlocalizedName().substring(5), "inventory");
	}

	public static void registerRecipes() {
		if (ConfigHandler.ENABLE_GRANITE_TOOLS) {
			registerToolRecipes(Blocks.STONE, 1, GRANITE_SWORD, GRANITE_PICKAXE, GRANITE_AXE, GRANITE_SHOVEL, GRANITE_HOE);
			registerToolRecipes(Blocks.STONE, 2, POLISHED_GRANITE_SWORD, POLISHED_GRANITE_PICKAXE, POLISHED_GRANITE_AXE, POLISHED_GRANITE_SHOVEL, POLISHED_GRANITE_HOE);
		}
		if (ConfigHandler.ENABLE_DIORITE_TOOLS) {
			registerToolRecipes(Blocks.STONE, 3, DIORITE_SWORD, DIORITE_PICKAXE, DIORITE_AXE, DIORITE_SHOVEL, DIORITE_HOE);
			registerToolRecipes(Blocks.STONE, 4, POLISHED_DIORITE_SWORD, POLISHED_DIORITE_PICKAXE, POLISHED_DIORITE_AXE, POLISHED_DIORITE_SHOVEL, POLISHED_DIORITE_HOE);
		}
		
		if (ConfigHandler.ENABLE_ANDESITE_TOOLS) {
			registerToolRecipes(Blocks.STONE, 5, ANDESITE_SWORD, ANDESITE_PICKAXE, ANDESITE_AXE, ANDESITE_SHOVEL, ANDESITE_HOE);
			registerToolRecipes(Blocks.STONE, 6, POLISHED_ANDESITE_SWORD, POLISHED_ANDESITE_PICKAXE, POLISHED_ANDESITE_AXE, POLISHED_ANDESITE_SHOVEL, POLISHED_ANDESITE_HOE);
		}
	}

	/**
	 * Registers an {@link Item}
	 *
	 * @param item The {@link Item} to be registered
	 *
	 * @since 0.0.2
	 */
	private static void registerItem(Item item) {
		GameRegistry.register(item);

		IgneousExtrasMod.REGISTERED_ITEMS += 1;
	}

	/**
	 * Registers a number of {@link Item}s
	 *
	 * @param items The {@link Item)s to be registered
	 *
	 * @since 0.0.2
	 */
	private static void registerItems(Item... items) {
		for (Item item : items) {
			registerItem(item);
		}
	}

	private static void registerToolRecipes(Block baseBlock, int meta, Item sword, Item pickaxe, Item axe, Item shovel, Item hoe) {
		ItemStack baseBlockStack = new ItemStack(baseBlock, 1, meta);
		GameRegistry.addShapedRecipe(new ItemStack(sword, 1), " B ", " B ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //sword
		GameRegistry.addShapedRecipe(new ItemStack(pickaxe, 1), "BBB", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(axe, 1), "BB ", "BS ", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		GameRegistry.addShapedRecipe(new ItemStack(axe, 1), " BB", " SB", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		GameRegistry.addShapedRecipe(new ItemStack(shovel, 1), " B ", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //shovel
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), " BB", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //hoe
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), "BB ", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //hoe flipped

		IgneousExtrasMod.REGISTERED_RECIPES += 7;
	}
}
