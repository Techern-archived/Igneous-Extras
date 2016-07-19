package org.techern.minecraft.igneousextras.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import org.techern.minecraft.IgneousExtrasMod;
import org.techern.minecraft.igneousextras.ConfigHandler;
import org.techern.minecraft.igneousextras.blocks.IgneousBlocks;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousAxe;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousHoe;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousPickaxe;
import org.techern.minecraft.igneousextras.items.tools.ItemIgneousShovel;
import org.techern.minecraft.igneousextras.items.weapons.ItemIgneousSword;

public class IgneousItems {

	/**
	 * The {@link CreativeTabs} for new swords
	 *
	 * @since 0.0.1
	 */
	public static CreativeTabs SWORDS_TAB = new CreativeTabs("igneous_swords") {
		@Override
		public Item getTabIconItem() {
			return GRANITE_SWORD;
		}
	};

	public static Item ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "andesite");
	public static Item ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "andesite");
	public static Item ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "andesite");
	public static Item ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "andesite");
	public static Item ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "andesite");

	public static Item GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "granite");
	public static Item GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "granite");
	public static Item GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "granite");
	public static Item GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "granite");
	public static Item GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "granite");

	public static Item DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "diorite");
	public static Item DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "diorite");
	public static Item DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "diorite");
	public static Item DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "diorite");
	public static Item DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "diorite");
	
	public static Item POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.POLISHED_ANDESITE_MATERIAL, "polished_andesite");
	public static Item POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.POLISHED_ANDESITE_MATERIAL, "polished_andesite");
	public static Item POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.POLISHED_ANDESITE_MATERIAL, "polished_andesite");
	public static Item POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.POLISHED_ANDESITE_MATERIAL, "polished_andesite");
	public static Item POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.POLISHED_ANDESITE_MATERIAL, "polished_andesite");

	public static Item POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.POLISHED_GRANITE_MATERIAL, "polished_granite");
	public static Item POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.POLISHED_GRANITE_MATERIAL, "polished_granite");
	public static Item POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.POLISHED_GRANITE_MATERIAL, "polished_granite");
	public static Item POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.POLISHED_GRANITE_MATERIAL, "polished_granite");
	public static Item POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.POLISHED_GRANITE_MATERIAL, "polished_granite");

	public static Item POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.POLISHED_DIORITE_MATERIAL, "polished_diorite");
	public static Item POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.POLISHED_DIORITE_MATERIAL, "polished_diorite");
	public static Item POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.POLISHED_DIORITE_MATERIAL, "polished_diorite");
	public static Item POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.POLISHED_DIORITE_MATERIAL, "polished_diorite");
	public static Item POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.POLISHED_DIORITE_MATERIAL, "polished_diorite");

	public static Item BLACK_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "black_dyed_granite");
	public static Item BLUE_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_granite");
	public static Item BROWN_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_granite");
	public static Item CYAN_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_granite");
	public static Item GRAY_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_granite");
	public static Item GREEN_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "green_dyed_granite");
	public static Item LIGHT_BLUE_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_granite");
	public static Item LIME_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_granite");
	public static Item MAGENTA_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_granite");
	public static Item ORANGE_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_granite");
	public static Item PINK_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_granite");
	public static Item PURPLE_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_granite");
	public static Item RED_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "red_dyed_granite");
	public static Item SILVER_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_granite");
	public static Item WHITE_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "white_dyed_granite");
	public static Item YELLOW_DYED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_granite");

	public static void registerItems() {
		//GameRegistry
		if (ConfigHandler.ENABLE_ADDITIONAL_TOOLS) {

			//Start with andesite tools
			registerItems(ANDESITE_SWORD, ANDESITE_PICKAXE, ANDESITE_AXE, ANDESITE_SHOVEL, ANDESITE_HOE,
					POLISHED_ANDESITE_SWORD, POLISHED_ANDESITE_PICKAXE, POLISHED_ANDESITE_AXE, POLISHED_ANDESITE_SHOVEL, POLISHED_ANDESITE_HOE);

			//Then granite tools
			registerItems(GRANITE_SWORD, GRANITE_PICKAXE, GRANITE_AXE, GRANITE_SHOVEL, GRANITE_HOE,
					POLISHED_GRANITE_SWORD, POLISHED_GRANITE_PICKAXE, POLISHED_GRANITE_AXE, POLISHED_GRANITE_SHOVEL, POLISHED_GRANITE_HOE);

			if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
				registerItems(BLACK_DYED_GRANITE_SWORD, BLUE_DYED_GRANITE_SWORD, BROWN_DYED_GRANITE_SWORD,
						CYAN_DYED_GRANITE_SWORD, GRAY_DYED_GRANITE_SWORD, GREEN_DYED_GRANITE_SWORD,
						LIGHT_BLUE_DYED_GRANITE_SWORD, LIME_DYED_GRANITE_SWORD, MAGENTA_DYED_GRANITE_SWORD,
						ORANGE_DYED_GRANITE_SWORD, PINK_DYED_GRANITE_SWORD, PURPLE_DYED_GRANITE_SWORD,
						RED_DYED_GRANITE_SWORD, SILVER_DYED_GRANITE_SWORD, WHITE_DYED_GRANITE_SWORD,
						YELLOW_DYED_GRANITE_SWORD);
			}

			//Then diorite tools
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

		//Now... Now for dyed ones. Awww
		IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_GRANITE_SWORD, 0, "black_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_GRANITE_SWORD, 0, "blue_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_GRANITE_SWORD, 0, "brown_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_GRANITE_SWORD, 0, "cyan_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_GRANITE_SWORD, 0, "gray_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_GRANITE_SWORD, 0, "green_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_GRANITE_SWORD, 0, "light_blue_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_GRANITE_SWORD, 0, "lime_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_GRANITE_SWORD, 0, "magenta_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_GRANITE_SWORD, 0, "orange_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_GRANITE_SWORD, 0, "pink_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_GRANITE_SWORD, 0, "purple_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_GRANITE_SWORD, 0, "red_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_GRANITE_SWORD, 0, "silver_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_GRANITE_SWORD, 0, "white_dyed_granite_sword", "inventory");
		IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_GRANITE_SWORD, 0, "yellow_dyed_granite_sword", "inventory");

	}

	public static void registerRecipes() {

		//First, we register recipes for tools
		if (ConfigHandler.ENABLE_ADDITIONAL_TOOLS) {

			//Start with granite

			registerToolRecipes(Blocks.STONE, 1, GRANITE_SWORD, GRANITE_PICKAXE, GRANITE_AXE, GRANITE_SHOVEL, GRANITE_HOE);
			registerToolRecipes(Blocks.STONE, 2, POLISHED_GRANITE_SWORD, POLISHED_GRANITE_PICKAXE, POLISHED_GRANITE_AXE, POLISHED_GRANITE_SHOVEL, POLISHED_GRANITE_HOE);

			if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_GRANITE_SWORD);
				registerSwordRecipe(IgneousBlocks.DYED_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_GRANITE_SWORD);
			}

			//Then diorite

			registerToolRecipes(Blocks.STONE, 3, DIORITE_SWORD, DIORITE_PICKAXE, DIORITE_AXE, DIORITE_SHOVEL, DIORITE_HOE);
			registerToolRecipes(Blocks.STONE, 4, POLISHED_DIORITE_SWORD, POLISHED_DIORITE_PICKAXE, POLISHED_DIORITE_AXE, POLISHED_DIORITE_SHOVEL, POLISHED_DIORITE_HOE);

			//Then andesite
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

	/**
	 * Registers all recipes associated with tools
	 *
	 * @param baseBlock The base block used by the recipe
	 * @param meta The metadata of the base block
	 * @param sword The sword item
	 * @param pickaxe The pickaxe item
	 * @param axe The axe item
	 * @param shovel The shovel item
     * @param hoe The hoe item
     */
	private static void registerToolRecipes(Block baseBlock, int meta, Item sword, Item pickaxe, Item axe, Item shovel, Item hoe) {
		ItemStack baseBlockStack = new ItemStack(baseBlock, 1, meta);
		
		registerSwordRecipe(baseBlock, meta, sword);

		GameRegistry.addShapedRecipe(new ItemStack(pickaxe, 1), "BBB", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(axe, 1), "BB ", "BS ", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		GameRegistry.addShapedRecipe(new ItemStack(axe, 1), " BB", " SB", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		GameRegistry.addShapedRecipe(new ItemStack(shovel, 1), " B ", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //shovel
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), " BB", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //hoe
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), "BB ", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //hoe flipped

		IgneousExtrasMod.REGISTERED_RECIPES += 6;
	}

	/**
	 * Registers a sword recipe
	 *
	 * @param baseBlock The base {@link Block}
	 * @param meta The metadata
	 * @param sword The sword {@link Item}
	 *
	 * @since 0.0.2
     */
	private static void registerSwordRecipe(Block baseBlock, int meta, Item sword) {
		ItemStack baseBlockStack = new ItemStack(baseBlock, 1, meta);
		GameRegistry.addShapedRecipe(new ItemStack(sword, 1), " B ", " B ", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		IgneousExtrasMod.REGISTERED_RECIPES += 1;
	}
}
