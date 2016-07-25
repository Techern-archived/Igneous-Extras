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
     * @since 0.0.2
     */
    public static CreativeTabs SWORDS_TAB = new CreativeTabs("igneous_swords") {
        @Override
        public Item getTabIconItem() {
            return GRANITE_SWORD;
        }
    };

    /**
     * The {@link CreativeTabs} for new tools
     *
     * @since 0.0.2
     */
    public static CreativeTabs TOOLS_TAB = new CreativeTabs("igneous_tools") {
        @Override
        public Item getTabIconItem() {
            return GRANITE_AXE;
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

	public static Item BLACK_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "black_dyed_granite");
	public static Item BLUE_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_granite");
	public static Item BROWN_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_granite");
	public static Item CYAN_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_granite");
	public static Item GRAY_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_granite");
	public static Item GREEN_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "green_dyed_granite");
	public static Item LIGHT_BLUE_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_granite");
	public static Item LIME_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_granite");
	public static Item MAGENTA_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_granite");
	public static Item ORANGE_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_granite");
	public static Item PINK_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_granite");
	public static Item PURPLE_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_granite");
	public static Item RED_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "red_dyed_granite");
	public static Item SILVER_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_granite");
	public static Item WHITE_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "white_dyed_granite");
	public static Item YELLOW_DYED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_granite");

	public static Item BLACK_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "black_dyed_granite");
	public static Item BLUE_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_granite");
	public static Item BROWN_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_granite");
	public static Item CYAN_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_granite");
	public static Item GRAY_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_granite");
	public static Item GREEN_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "green_dyed_granite");
	public static Item LIGHT_BLUE_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_granite");
	public static Item LIME_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_granite");
	public static Item MAGENTA_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_granite");
	public static Item ORANGE_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_granite");
	public static Item PINK_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_granite");
	public static Item PURPLE_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_granite");
	public static Item RED_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "red_dyed_granite");
	public static Item SILVER_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_granite");
	public static Item WHITE_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "white_dyed_granite");
	public static Item YELLOW_DYED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_granite");

	public static Item BLACK_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "black_dyed_granite");
	public static Item BLUE_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_granite");
	public static Item BROWN_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_granite");
	public static Item CYAN_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_granite");
	public static Item GRAY_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_granite");
	public static Item GREEN_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "green_dyed_granite");
	public static Item LIGHT_BLUE_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_granite");
	public static Item LIME_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_granite");
	public static Item MAGENTA_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_granite");
	public static Item ORANGE_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_granite");
	public static Item PINK_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_granite");
	public static Item PURPLE_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_granite");
	public static Item RED_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "red_dyed_granite");
	public static Item SILVER_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_granite");
	public static Item WHITE_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "white_dyed_granite");
	public static Item YELLOW_DYED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_granite");

	public static Item BLACK_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "black_dyed_granite");
	public static Item BLUE_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_granite");
	public static Item BROWN_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_granite");
	public static Item CYAN_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_granite");
	public static Item GRAY_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_granite");
	public static Item GREEN_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "green_dyed_granite");
	public static Item LIGHT_BLUE_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_granite");
	public static Item LIME_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_granite");
	public static Item MAGENTA_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_granite");
	public static Item ORANGE_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_granite");
	public static Item PINK_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_granite");
	public static Item PURPLE_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_granite");
	public static Item RED_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "red_dyed_granite");
	public static Item SILVER_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_granite");
	public static Item WHITE_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "white_dyed_granite");
	public static Item YELLOW_DYED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_granite");

	public static Item BLACK_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "black_dyed_polished_granite");
	public static Item BLUE_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_polished_granite");
	public static Item BROWN_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_polished_granite");
	public static Item CYAN_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_polished_granite");
	public static Item GRAY_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_polished_granite");
	public static Item GREEN_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "green_dyed_polished_granite");
	public static Item LIGHT_BLUE_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_polished_granite");
	public static Item LIME_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_polished_granite");
	public static Item MAGENTA_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_polished_granite");
	public static Item ORANGE_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_polished_granite");
	public static Item PINK_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_polished_granite");
	public static Item PURPLE_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_polished_granite");
	public static Item RED_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "red_dyed_polished_granite");
	public static Item SILVER_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_polished_granite");
	public static Item WHITE_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "white_dyed_polished_granite");
	public static Item YELLOW_DYED_POLISHED_GRANITE_SWORD = new ItemIgneousSword(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_polished_granite");

	public static Item BLACK_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "black_dyed_polished_granite");
	public static Item BLUE_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_polished_granite");
	public static Item BROWN_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_polished_granite");
	public static Item CYAN_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_polished_granite");
	public static Item GRAY_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_polished_granite");
	public static Item GREEN_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "green_dyed_polished_granite");
	public static Item LIGHT_BLUE_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_polished_granite");
	public static Item LIME_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_polished_granite");
	public static Item MAGENTA_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_polished_granite");
	public static Item ORANGE_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_polished_granite");
	public static Item PINK_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_polished_granite");
	public static Item PURPLE_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_polished_granite");
	public static Item RED_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "red_dyed_polished_granite");
	public static Item SILVER_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_polished_granite");
	public static Item WHITE_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "white_dyed_polished_granite");
	public static Item YELLOW_DYED_POLISHED_GRANITE_AXE = new ItemIgneousAxe(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_polished_granite");

	public static Item BLACK_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "black_dyed_polished_granite");
	public static Item BLUE_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_polished_granite");
	public static Item BROWN_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_polished_granite");
	public static Item CYAN_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_polished_granite");
	public static Item GRAY_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_polished_granite");
	public static Item GREEN_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "green_dyed_polished_granite");
	public static Item LIGHT_BLUE_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_polished_granite");
	public static Item LIME_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_polished_granite");
	public static Item MAGENTA_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_polished_granite");
	public static Item ORANGE_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_polished_granite");
	public static Item PINK_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_polished_granite");
	public static Item PURPLE_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_polished_granite");
	public static Item RED_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "red_dyed_polished_granite");
	public static Item SILVER_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_polished_granite");
	public static Item WHITE_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "white_dyed_polished_granite");
	public static Item YELLOW_DYED_POLISHED_GRANITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_polished_granite");

	public static Item BLACK_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "black_dyed_polished_granite");
	public static Item BLUE_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_polished_granite");
	public static Item BROWN_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_polished_granite");
	public static Item CYAN_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_polished_granite");
	public static Item GRAY_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_polished_granite");
	public static Item GREEN_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "green_dyed_polished_granite");
	public static Item LIGHT_BLUE_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_polished_granite");
	public static Item LIME_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_polished_granite");
	public static Item MAGENTA_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_polished_granite");
	public static Item ORANGE_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_polished_granite");
	public static Item PINK_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_polished_granite");
	public static Item PURPLE_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_polished_granite");
	public static Item RED_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "red_dyed_polished_granite");
	public static Item SILVER_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_polished_granite");
	public static Item WHITE_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "white_dyed_polished_granite");
	public static Item YELLOW_DYED_POLISHED_GRANITE_HOE = new ItemIgneousHoe(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_polished_granite");

	public static Item BLACK_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "black_dyed_polished_granite");
	public static Item BLUE_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "blue_dyed_polished_granite");
	public static Item BROWN_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "brown_dyed_polished_granite");
	public static Item CYAN_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "cyan_dyed_polished_granite");
	public static Item GRAY_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "gray_dyed_polished_granite");
	public static Item GREEN_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "green_dyed_polished_granite");
	public static Item LIGHT_BLUE_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "light_blue_dyed_polished_granite");
	public static Item LIME_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "lime_dyed_polished_granite");
	public static Item MAGENTA_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "magenta_dyed_polished_granite");
	public static Item ORANGE_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "orange_dyed_polished_granite");
	public static Item PINK_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "pink_dyed_polished_granite");
	public static Item PURPLE_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "purple_dyed_polished_granite");
	public static Item RED_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "red_dyed_polished_granite");
	public static Item SILVER_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "silver_dyed_polished_granite");
	public static Item WHITE_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "white_dyed_polished_granite");
	public static Item YELLOW_DYED_POLISHED_GRANITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.GRANITE_MATERIAL, "yellow_dyed_polished_granite");

	public static Item BLACK_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "black_dyed_diorite");
	public static Item BLUE_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_diorite");
	public static Item BROWN_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_diorite");
	public static Item CYAN_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_diorite");
	public static Item GRAY_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_diorite");
	public static Item GREEN_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "green_dyed_diorite");
	public static Item LIGHT_BLUE_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_diorite");
	public static Item LIME_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_diorite");
	public static Item MAGENTA_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_diorite");
	public static Item ORANGE_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_diorite");
	public static Item PINK_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_diorite");
	public static Item PURPLE_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_diorite");
	public static Item RED_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "red_dyed_diorite");
	public static Item SILVER_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_diorite");
	public static Item WHITE_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "white_dyed_diorite");
	public static Item YELLOW_DYED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_diorite");

	public static Item BLACK_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "black_dyed_diorite");
	public static Item BLUE_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_diorite");
	public static Item BROWN_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_diorite");
	public static Item CYAN_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_diorite");
	public static Item GRAY_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_diorite");
	public static Item GREEN_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "green_dyed_diorite");
	public static Item LIGHT_BLUE_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_diorite");
	public static Item LIME_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_diorite");
	public static Item MAGENTA_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_diorite");
	public static Item ORANGE_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_diorite");
	public static Item PINK_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_diorite");
	public static Item PURPLE_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_diorite");
	public static Item RED_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "red_dyed_diorite");
	public static Item SILVER_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_diorite");
	public static Item WHITE_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "white_dyed_diorite");
	public static Item YELLOW_DYED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_diorite");

	public static Item BLACK_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "black_dyed_diorite");
	public static Item BLUE_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_diorite");
	public static Item BROWN_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_diorite");
	public static Item CYAN_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_diorite");
	public static Item GRAY_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_diorite");
	public static Item GREEN_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "green_dyed_diorite");
	public static Item LIGHT_BLUE_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_diorite");
	public static Item LIME_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_diorite");
	public static Item MAGENTA_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_diorite");
	public static Item ORANGE_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_diorite");
	public static Item PINK_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_diorite");
	public static Item PURPLE_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_diorite");
	public static Item RED_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "red_dyed_diorite");
	public static Item SILVER_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_diorite");
	public static Item WHITE_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "white_dyed_diorite");
	public static Item YELLOW_DYED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_diorite");

	public static Item BLACK_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "black_dyed_diorite");
	public static Item BLUE_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_diorite");
	public static Item BROWN_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_diorite");
	public static Item CYAN_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_diorite");
	public static Item GRAY_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_diorite");
	public static Item GREEN_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "green_dyed_diorite");
	public static Item LIGHT_BLUE_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_diorite");
	public static Item LIME_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_diorite");
	public static Item MAGENTA_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_diorite");
	public static Item ORANGE_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_diorite");
	public static Item PINK_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_diorite");
	public static Item PURPLE_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_diorite");
	public static Item RED_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "red_dyed_diorite");
	public static Item SILVER_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_diorite");
	public static Item WHITE_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "white_dyed_diorite");
	public static Item YELLOW_DYED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_diorite");

	public static Item BLACK_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "black_dyed_diorite");
	public static Item BLUE_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_diorite");
	public static Item BROWN_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_diorite");
	public static Item CYAN_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_diorite");
	public static Item GRAY_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_diorite");
	public static Item GREEN_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "green_dyed_diorite");
	public static Item LIGHT_BLUE_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_diorite");
	public static Item LIME_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_diorite");
	public static Item MAGENTA_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_diorite");
	public static Item ORANGE_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_diorite");
	public static Item PINK_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_diorite");
	public static Item PURPLE_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_diorite");
	public static Item RED_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "red_dyed_diorite");
	public static Item SILVER_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_diorite");
	public static Item WHITE_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "white_dyed_diorite");
	public static Item YELLOW_DYED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_diorite");

	public static Item BLACK_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "black_dyed_polished_diorite");
	public static Item BLUE_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_polished_diorite");
	public static Item BROWN_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_polished_diorite");
	public static Item CYAN_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_polished_diorite");
	public static Item GRAY_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_polished_diorite");
	public static Item GREEN_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "green_dyed_polished_diorite");
	public static Item LIGHT_BLUE_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_polished_diorite");
	public static Item LIME_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_polished_diorite");
	public static Item MAGENTA_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_polished_diorite");
	public static Item ORANGE_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_polished_diorite");
	public static Item PINK_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_polished_diorite");
	public static Item PURPLE_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_polished_diorite");
	public static Item RED_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "red_dyed_polished_diorite");
	public static Item SILVER_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_polished_diorite");
	public static Item WHITE_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "white_dyed_polished_diorite");
	public static Item YELLOW_DYED_POLISHED_DIORITE_SWORD = new ItemIgneousSword(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_polished_diorite");

	public static Item BLACK_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "black_dyed_polished_diorite");
	public static Item BLUE_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_polished_diorite");
	public static Item BROWN_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_polished_diorite");
	public static Item CYAN_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_polished_diorite");
	public static Item GRAY_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_polished_diorite");
	public static Item GREEN_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "green_dyed_polished_diorite");
	public static Item LIGHT_BLUE_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_polished_diorite");
	public static Item LIME_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_polished_diorite");
	public static Item MAGENTA_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_polished_diorite");
	public static Item ORANGE_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_polished_diorite");
	public static Item PINK_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_polished_diorite");
	public static Item PURPLE_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_polished_diorite");
	public static Item RED_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "red_dyed_polished_diorite");
	public static Item SILVER_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_polished_diorite");
	public static Item WHITE_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "white_dyed_polished_diorite");
	public static Item YELLOW_DYED_POLISHED_DIORITE_AXE = new ItemIgneousAxe(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_polished_diorite");

	public static Item BLACK_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "black_dyed_polished_diorite");
	public static Item BLUE_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_polished_diorite");
	public static Item BROWN_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_polished_diorite");
	public static Item CYAN_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_polished_diorite");
	public static Item GRAY_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_polished_diorite");
	public static Item GREEN_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "green_dyed_polished_diorite");
	public static Item LIGHT_BLUE_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_polished_diorite");
	public static Item LIME_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_polished_diorite");
	public static Item MAGENTA_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_polished_diorite");
	public static Item ORANGE_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_polished_diorite");
	public static Item PINK_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_polished_diorite");
	public static Item PURPLE_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_polished_diorite");
	public static Item RED_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "red_dyed_polished_diorite");
	public static Item SILVER_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_polished_diorite");
	public static Item WHITE_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "white_dyed_polished_diorite");
	public static Item YELLOW_DYED_POLISHED_DIORITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_polished_diorite");

	public static Item BLACK_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "black_dyed_polished_diorite");
	public static Item BLUE_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_polished_diorite");
	public static Item BROWN_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_polished_diorite");
	public static Item CYAN_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_polished_diorite");
	public static Item GRAY_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_polished_diorite");
	public static Item GREEN_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "green_dyed_polished_diorite");
	public static Item LIGHT_BLUE_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_polished_diorite");
	public static Item LIME_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_polished_diorite");
	public static Item MAGENTA_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_polished_diorite");
	public static Item ORANGE_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_polished_diorite");
	public static Item PINK_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_polished_diorite");
	public static Item PURPLE_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_polished_diorite");
	public static Item RED_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "red_dyed_polished_diorite");
	public static Item SILVER_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_polished_diorite");
	public static Item WHITE_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "white_dyed_polished_diorite");
	public static Item YELLOW_DYED_POLISHED_DIORITE_HOE = new ItemIgneousHoe(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_polished_diorite");

	public static Item BLACK_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "black_dyed_polished_diorite");
	public static Item BLUE_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "blue_dyed_polished_diorite");
	public static Item BROWN_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "brown_dyed_polished_diorite");
	public static Item CYAN_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "cyan_dyed_polished_diorite");
	public static Item GRAY_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "gray_dyed_polished_diorite");
	public static Item GREEN_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "green_dyed_polished_diorite");
	public static Item LIGHT_BLUE_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "light_blue_dyed_polished_diorite");
	public static Item LIME_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "lime_dyed_polished_diorite");
	public static Item MAGENTA_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "magenta_dyed_polished_diorite");
	public static Item ORANGE_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "orange_dyed_polished_diorite");
	public static Item PINK_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "pink_dyed_polished_diorite");
	public static Item PURPLE_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "purple_dyed_polished_diorite");
	public static Item RED_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "red_dyed_polished_diorite");
	public static Item SILVER_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "silver_dyed_polished_diorite");
	public static Item WHITE_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "white_dyed_polished_diorite");
	public static Item YELLOW_DYED_POLISHED_DIORITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.DIORITE_MATERIAL, "yellow_dyed_polished_diorite");

	public static Item BLACK_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_andesite");
	public static Item BLUE_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_andesite");
	public static Item BROWN_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_andesite");
	public static Item CYAN_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_andesite");
	public static Item GRAY_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_andesite");
	public static Item GREEN_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_andesite");
	public static Item LIGHT_BLUE_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_andesite");
	public static Item LIME_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_andesite");
	public static Item MAGENTA_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_andesite");
	public static Item ORANGE_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_andesite");
	public static Item PINK_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_andesite");
	public static Item PURPLE_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_andesite");
	public static Item RED_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_andesite");
	public static Item SILVER_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_andesite");
	public static Item WHITE_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_andesite");
	public static Item YELLOW_DYED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_andesite");

	public static Item BLACK_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_andesite");
	public static Item BLUE_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_andesite");
	public static Item BROWN_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_andesite");
	public static Item CYAN_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_andesite");
	public static Item GRAY_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_andesite");
	public static Item GREEN_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_andesite");
	public static Item LIGHT_BLUE_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_andesite");
	public static Item LIME_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_andesite");
	public static Item MAGENTA_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_andesite");
	public static Item ORANGE_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_andesite");
	public static Item PINK_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_andesite");
	public static Item PURPLE_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_andesite");
	public static Item RED_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_andesite");
	public static Item SILVER_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_andesite");
	public static Item WHITE_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_andesite");
	public static Item YELLOW_DYED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_andesite");

	public static Item BLACK_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_andesite");
	public static Item BLUE_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_andesite");
	public static Item BROWN_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_andesite");
	public static Item CYAN_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_andesite");
	public static Item GRAY_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_andesite");
	public static Item GREEN_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_andesite");
	public static Item LIGHT_BLUE_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_andesite");
	public static Item LIME_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_andesite");
	public static Item MAGENTA_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_andesite");
	public static Item ORANGE_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_andesite");
	public static Item PINK_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_andesite");
	public static Item PURPLE_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_andesite");
	public static Item RED_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_andesite");
	public static Item SILVER_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_andesite");
	public static Item WHITE_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_andesite");
	public static Item YELLOW_DYED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_andesite");

	public static Item BLACK_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_andesite");
	public static Item BLUE_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_andesite");
	public static Item BROWN_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_andesite");
	public static Item CYAN_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_andesite");
	public static Item GRAY_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_andesite");
	public static Item GREEN_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_andesite");
	public static Item LIGHT_BLUE_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_andesite");
	public static Item LIME_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_andesite");
	public static Item MAGENTA_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_andesite");
	public static Item ORANGE_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_andesite");
	public static Item PINK_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_andesite");
	public static Item PURPLE_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_andesite");
	public static Item RED_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_andesite");
	public static Item SILVER_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_andesite");
	public static Item WHITE_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_andesite");
	public static Item YELLOW_DYED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_andesite");

	public static Item BLACK_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_andesite");
	public static Item BLUE_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_andesite");
	public static Item BROWN_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_andesite");
	public static Item CYAN_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_andesite");
	public static Item GRAY_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_andesite");
	public static Item GREEN_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_andesite");
	public static Item LIGHT_BLUE_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_andesite");
	public static Item LIME_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_andesite");
	public static Item MAGENTA_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_andesite");
	public static Item ORANGE_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_andesite");
	public static Item PINK_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_andesite");
	public static Item PURPLE_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_andesite");
	public static Item RED_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_andesite");
	public static Item SILVER_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_andesite");
	public static Item WHITE_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_andesite");
	public static Item YELLOW_DYED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_andesite");

	public static Item BLACK_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_polished_andesite");
	public static Item BLUE_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_polished_andesite");
	public static Item BROWN_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_polished_andesite");
	public static Item CYAN_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_polished_andesite");
	public static Item GRAY_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_polished_andesite");
	public static Item GREEN_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_polished_andesite");
	public static Item LIGHT_BLUE_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_polished_andesite");
	public static Item LIME_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_polished_andesite");
	public static Item MAGENTA_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_polished_andesite");
	public static Item ORANGE_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_polished_andesite");
	public static Item PINK_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_polished_andesite");
	public static Item PURPLE_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_polished_andesite");
	public static Item RED_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_polished_andesite");
	public static Item SILVER_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_polished_andesite");
	public static Item WHITE_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_polished_andesite");
	public static Item YELLOW_DYED_POLISHED_ANDESITE_SWORD = new ItemIgneousSword(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_polished_andesite");

	public static Item BLACK_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_polished_andesite");
	public static Item BLUE_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_polished_andesite");
	public static Item BROWN_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_polished_andesite");
	public static Item CYAN_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_polished_andesite");
	public static Item GRAY_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_polished_andesite");
	public static Item GREEN_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_polished_andesite");
	public static Item LIGHT_BLUE_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_polished_andesite");
	public static Item LIME_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_polished_andesite");
	public static Item MAGENTA_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_polished_andesite");
	public static Item ORANGE_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_polished_andesite");
	public static Item PINK_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_polished_andesite");
	public static Item PURPLE_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_polished_andesite");
	public static Item RED_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_polished_andesite");
	public static Item SILVER_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_polished_andesite");
	public static Item WHITE_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_polished_andesite");
	public static Item YELLOW_DYED_POLISHED_ANDESITE_AXE = new ItemIgneousAxe(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_polished_andesite");

	public static Item BLACK_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_polished_andesite");
	public static Item BLUE_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_polished_andesite");
	public static Item BROWN_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_polished_andesite");
	public static Item CYAN_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_polished_andesite");
	public static Item GRAY_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_polished_andesite");
	public static Item GREEN_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_polished_andesite");
	public static Item LIGHT_BLUE_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_polished_andesite");
	public static Item LIME_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_polished_andesite");
	public static Item MAGENTA_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_polished_andesite");
	public static Item ORANGE_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_polished_andesite");
	public static Item PINK_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_polished_andesite");
	public static Item PURPLE_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_polished_andesite");
	public static Item RED_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_polished_andesite");
	public static Item SILVER_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_polished_andesite");
	public static Item WHITE_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_polished_andesite");
	public static Item YELLOW_DYED_POLISHED_ANDESITE_PICKAXE = new ItemIgneousPickaxe(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_polished_andesite");

	public static Item BLACK_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_polished_andesite");
	public static Item BLUE_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_polished_andesite");
	public static Item BROWN_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_polished_andesite");
	public static Item CYAN_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_polished_andesite");
	public static Item GRAY_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_polished_andesite");
	public static Item GREEN_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_polished_andesite");
	public static Item LIGHT_BLUE_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_polished_andesite");
	public static Item LIME_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_polished_andesite");
	public static Item MAGENTA_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_polished_andesite");
	public static Item ORANGE_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_polished_andesite");
	public static Item PINK_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_polished_andesite");
	public static Item PURPLE_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_polished_andesite");
	public static Item RED_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_polished_andesite");
	public static Item SILVER_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_polished_andesite");
	public static Item WHITE_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_polished_andesite");
	public static Item YELLOW_DYED_POLISHED_ANDESITE_HOE = new ItemIgneousHoe(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_polished_andesite");

	public static Item BLACK_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "black_dyed_polished_andesite");
	public static Item BLUE_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "blue_dyed_polished_andesite");
	public static Item BROWN_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "brown_dyed_polished_andesite");
	public static Item CYAN_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "cyan_dyed_polished_andesite");
	public static Item GRAY_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "gray_dyed_polished_andesite");
	public static Item GREEN_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "green_dyed_polished_andesite");
	public static Item LIGHT_BLUE_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "light_blue_dyed_polished_andesite");
	public static Item LIME_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "lime_dyed_polished_andesite");
	public static Item MAGENTA_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "magenta_dyed_polished_andesite");
	public static Item ORANGE_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "orange_dyed_polished_andesite");
	public static Item PINK_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "pink_dyed_polished_andesite");
	public static Item PURPLE_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "purple_dyed_polished_andesite");
	public static Item RED_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "red_dyed_polished_andesite");
	public static Item SILVER_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "silver_dyed_polished_andesite");
	public static Item WHITE_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "white_dyed_polished_andesite");
	public static Item YELLOW_DYED_POLISHED_ANDESITE_SHOVEL = new ItemIgneousShovel(ConfigHandler.ANDESITE_MATERIAL, "yellow_dyed_polished_andesite");

	public static void registerItems() {
		//GameRegistry
		if (ConfigHandler.ENABLE_ADDITIONAL_TOOLS) {

			//Start with andesite tools
			registerItems(ANDESITE_SWORD, ANDESITE_PICKAXE, ANDESITE_AXE, ANDESITE_SHOVEL, ANDESITE_HOE,
					POLISHED_ANDESITE_SWORD, POLISHED_ANDESITE_PICKAXE, POLISHED_ANDESITE_AXE, POLISHED_ANDESITE_SHOVEL, POLISHED_ANDESITE_HOE);

			//Then granite tools
			registerItems(GRANITE_SWORD, GRANITE_PICKAXE, GRANITE_AXE, GRANITE_SHOVEL, GRANITE_HOE,
					POLISHED_GRANITE_SWORD, POLISHED_GRANITE_PICKAXE, POLISHED_GRANITE_AXE, POLISHED_GRANITE_SHOVEL, POLISHED_GRANITE_HOE);

			//Then diorite tools
			registerItems(DIORITE_SWORD, DIORITE_PICKAXE, DIORITE_AXE, DIORITE_SHOVEL, DIORITE_HOE,
					POLISHED_DIORITE_SWORD, POLISHED_DIORITE_PICKAXE, POLISHED_DIORITE_AXE, POLISHED_DIORITE_SHOVEL, POLISHED_DIORITE_HOE);
			
			//Then... Dyed tools *starts crying*
			if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
				registerItems(BLACK_DYED_GRANITE_SWORD, BLUE_DYED_GRANITE_SWORD, BROWN_DYED_GRANITE_SWORD,
						CYAN_DYED_GRANITE_SWORD, GRAY_DYED_GRANITE_SWORD, GREEN_DYED_GRANITE_SWORD,
						LIGHT_BLUE_DYED_GRANITE_SWORD, LIME_DYED_GRANITE_SWORD, MAGENTA_DYED_GRANITE_SWORD,
						ORANGE_DYED_GRANITE_SWORD, PINK_DYED_GRANITE_SWORD, PURPLE_DYED_GRANITE_SWORD,
						RED_DYED_GRANITE_SWORD, SILVER_DYED_GRANITE_SWORD, WHITE_DYED_GRANITE_SWORD,
						YELLOW_DYED_GRANITE_SWORD);
				registerItems(BLACK_DYED_GRANITE_AXE, BLUE_DYED_GRANITE_AXE, BROWN_DYED_GRANITE_AXE,
						CYAN_DYED_GRANITE_AXE, GRAY_DYED_GRANITE_AXE, GREEN_DYED_GRANITE_AXE,
						LIGHT_BLUE_DYED_GRANITE_AXE, LIME_DYED_GRANITE_AXE, MAGENTA_DYED_GRANITE_AXE,
						ORANGE_DYED_GRANITE_AXE, PINK_DYED_GRANITE_AXE, PURPLE_DYED_GRANITE_AXE,
						RED_DYED_GRANITE_AXE, SILVER_DYED_GRANITE_AXE, WHITE_DYED_GRANITE_AXE,
						YELLOW_DYED_GRANITE_AXE);
				registerItems(BLACK_DYED_GRANITE_PICKAXE, BLUE_DYED_GRANITE_PICKAXE, BROWN_DYED_GRANITE_PICKAXE,
						CYAN_DYED_GRANITE_PICKAXE, GRAY_DYED_GRANITE_PICKAXE, GREEN_DYED_GRANITE_PICKAXE,
						LIGHT_BLUE_DYED_GRANITE_PICKAXE, LIME_DYED_GRANITE_PICKAXE, MAGENTA_DYED_GRANITE_PICKAXE,
						ORANGE_DYED_GRANITE_PICKAXE, PINK_DYED_GRANITE_PICKAXE, PURPLE_DYED_GRANITE_PICKAXE,
						RED_DYED_GRANITE_PICKAXE, SILVER_DYED_GRANITE_PICKAXE, WHITE_DYED_GRANITE_PICKAXE,
						YELLOW_DYED_GRANITE_PICKAXE);
				registerItems(BLACK_DYED_GRANITE_HOE, BLUE_DYED_GRANITE_HOE, BROWN_DYED_GRANITE_HOE,
						CYAN_DYED_GRANITE_HOE, GRAY_DYED_GRANITE_HOE, GREEN_DYED_GRANITE_HOE,
						LIGHT_BLUE_DYED_GRANITE_HOE, LIME_DYED_GRANITE_HOE, MAGENTA_DYED_GRANITE_HOE,
						ORANGE_DYED_GRANITE_HOE, PINK_DYED_GRANITE_HOE, PURPLE_DYED_GRANITE_HOE,
						RED_DYED_GRANITE_HOE, SILVER_DYED_GRANITE_HOE, WHITE_DYED_GRANITE_HOE,
						YELLOW_DYED_GRANITE_HOE);
				registerItems(BLACK_DYED_GRANITE_SHOVEL, BLUE_DYED_GRANITE_SHOVEL, BROWN_DYED_GRANITE_SHOVEL,
						CYAN_DYED_GRANITE_SHOVEL, GRAY_DYED_GRANITE_SHOVEL, GREEN_DYED_GRANITE_SHOVEL,
						LIGHT_BLUE_DYED_GRANITE_SHOVEL, LIME_DYED_GRANITE_SHOVEL, MAGENTA_DYED_GRANITE_SHOVEL,
						ORANGE_DYED_GRANITE_SHOVEL, PINK_DYED_GRANITE_SHOVEL, PURPLE_DYED_GRANITE_SHOVEL,
						RED_DYED_GRANITE_SHOVEL, SILVER_DYED_GRANITE_SHOVEL, WHITE_DYED_GRANITE_SHOVEL,
						YELLOW_DYED_GRANITE_SHOVEL);
				registerItems(BLACK_DYED_POLISHED_GRANITE_SWORD, BLUE_DYED_POLISHED_GRANITE_SWORD, BROWN_DYED_POLISHED_GRANITE_SWORD,
						CYAN_DYED_POLISHED_GRANITE_SWORD, GRAY_DYED_POLISHED_GRANITE_SWORD, GREEN_DYED_POLISHED_GRANITE_SWORD,
						LIGHT_BLUE_DYED_POLISHED_GRANITE_SWORD, LIME_DYED_POLISHED_GRANITE_SWORD, MAGENTA_DYED_POLISHED_GRANITE_SWORD,
						ORANGE_DYED_POLISHED_GRANITE_SWORD, PINK_DYED_POLISHED_GRANITE_SWORD, PURPLE_DYED_POLISHED_GRANITE_SWORD,
						RED_DYED_POLISHED_GRANITE_SWORD, SILVER_DYED_POLISHED_GRANITE_SWORD, WHITE_DYED_POLISHED_GRANITE_SWORD,
						YELLOW_DYED_POLISHED_GRANITE_SWORD);
				registerItems(BLACK_DYED_POLISHED_GRANITE_AXE, BLUE_DYED_POLISHED_GRANITE_AXE, BROWN_DYED_POLISHED_GRANITE_AXE,
						CYAN_DYED_POLISHED_GRANITE_AXE, GRAY_DYED_POLISHED_GRANITE_AXE, GREEN_DYED_POLISHED_GRANITE_AXE,
						LIGHT_BLUE_DYED_POLISHED_GRANITE_AXE, LIME_DYED_POLISHED_GRANITE_AXE, MAGENTA_DYED_POLISHED_GRANITE_AXE,
						ORANGE_DYED_POLISHED_GRANITE_AXE, PINK_DYED_POLISHED_GRANITE_AXE, PURPLE_DYED_POLISHED_GRANITE_AXE,
						RED_DYED_POLISHED_GRANITE_AXE, SILVER_DYED_POLISHED_GRANITE_AXE, WHITE_DYED_POLISHED_GRANITE_AXE,
						YELLOW_DYED_POLISHED_GRANITE_AXE);
				registerItems(BLACK_DYED_POLISHED_GRANITE_PICKAXE, BLUE_DYED_POLISHED_GRANITE_PICKAXE, BROWN_DYED_POLISHED_GRANITE_PICKAXE,
						CYAN_DYED_POLISHED_GRANITE_PICKAXE, GRAY_DYED_POLISHED_GRANITE_PICKAXE, GREEN_DYED_POLISHED_GRANITE_PICKAXE,
						LIGHT_BLUE_DYED_POLISHED_GRANITE_PICKAXE, LIME_DYED_POLISHED_GRANITE_PICKAXE, MAGENTA_DYED_POLISHED_GRANITE_PICKAXE,
						ORANGE_DYED_POLISHED_GRANITE_PICKAXE, PINK_DYED_POLISHED_GRANITE_PICKAXE, PURPLE_DYED_POLISHED_GRANITE_PICKAXE,
						RED_DYED_POLISHED_GRANITE_PICKAXE, SILVER_DYED_POLISHED_GRANITE_PICKAXE, WHITE_DYED_POLISHED_GRANITE_PICKAXE,
						YELLOW_DYED_POLISHED_GRANITE_PICKAXE);
				registerItems(BLACK_DYED_POLISHED_GRANITE_HOE, BLUE_DYED_POLISHED_GRANITE_HOE, BROWN_DYED_POLISHED_GRANITE_HOE,
						CYAN_DYED_POLISHED_GRANITE_HOE, GRAY_DYED_POLISHED_GRANITE_HOE, GREEN_DYED_POLISHED_GRANITE_HOE,
						LIGHT_BLUE_DYED_POLISHED_GRANITE_HOE, LIME_DYED_POLISHED_GRANITE_HOE, MAGENTA_DYED_POLISHED_GRANITE_HOE,
						ORANGE_DYED_POLISHED_GRANITE_HOE, PINK_DYED_POLISHED_GRANITE_HOE, PURPLE_DYED_POLISHED_GRANITE_HOE,
						RED_DYED_POLISHED_GRANITE_HOE, SILVER_DYED_POLISHED_GRANITE_HOE, WHITE_DYED_POLISHED_GRANITE_HOE,
						YELLOW_DYED_POLISHED_GRANITE_HOE);
				registerItems(BLACK_DYED_POLISHED_GRANITE_SHOVEL, BLUE_DYED_POLISHED_GRANITE_SHOVEL, BROWN_DYED_POLISHED_GRANITE_SHOVEL,
						CYAN_DYED_POLISHED_GRANITE_SHOVEL, GRAY_DYED_POLISHED_GRANITE_SHOVEL, GREEN_DYED_POLISHED_GRANITE_SHOVEL,
						LIGHT_BLUE_DYED_POLISHED_GRANITE_SHOVEL, LIME_DYED_POLISHED_GRANITE_SHOVEL, MAGENTA_DYED_POLISHED_GRANITE_SHOVEL,
						ORANGE_DYED_POLISHED_GRANITE_SHOVEL, PINK_DYED_POLISHED_GRANITE_SHOVEL, PURPLE_DYED_POLISHED_GRANITE_SHOVEL,
						RED_DYED_POLISHED_GRANITE_SHOVEL, SILVER_DYED_POLISHED_GRANITE_SHOVEL, WHITE_DYED_POLISHED_GRANITE_SHOVEL,
						YELLOW_DYED_POLISHED_GRANITE_SHOVEL);
				registerItems(BLACK_DYED_DIORITE_SWORD, BLUE_DYED_DIORITE_SWORD, BROWN_DYED_DIORITE_SWORD,
						CYAN_DYED_DIORITE_SWORD, GRAY_DYED_DIORITE_SWORD, GREEN_DYED_DIORITE_SWORD,
						LIGHT_BLUE_DYED_DIORITE_SWORD, LIME_DYED_DIORITE_SWORD, MAGENTA_DYED_DIORITE_SWORD,
						ORANGE_DYED_DIORITE_SWORD, PINK_DYED_DIORITE_SWORD, PURPLE_DYED_DIORITE_SWORD,
						RED_DYED_DIORITE_SWORD, SILVER_DYED_DIORITE_SWORD, WHITE_DYED_DIORITE_SWORD,
						YELLOW_DYED_DIORITE_SWORD);
				registerItems(BLACK_DYED_DIORITE_AXE, BLUE_DYED_DIORITE_AXE, BROWN_DYED_DIORITE_AXE,
						CYAN_DYED_DIORITE_AXE, GRAY_DYED_DIORITE_AXE, GREEN_DYED_DIORITE_AXE,
						LIGHT_BLUE_DYED_DIORITE_AXE, LIME_DYED_DIORITE_AXE, MAGENTA_DYED_DIORITE_AXE,
						ORANGE_DYED_DIORITE_AXE, PINK_DYED_DIORITE_AXE, PURPLE_DYED_DIORITE_AXE,
						RED_DYED_DIORITE_AXE, SILVER_DYED_DIORITE_AXE, WHITE_DYED_DIORITE_AXE,
						YELLOW_DYED_DIORITE_AXE);
				registerItems(BLACK_DYED_DIORITE_PICKAXE, BLUE_DYED_DIORITE_PICKAXE, BROWN_DYED_DIORITE_PICKAXE,
						CYAN_DYED_DIORITE_PICKAXE, GRAY_DYED_DIORITE_PICKAXE, GREEN_DYED_DIORITE_PICKAXE,
						LIGHT_BLUE_DYED_DIORITE_PICKAXE, LIME_DYED_DIORITE_PICKAXE, MAGENTA_DYED_DIORITE_PICKAXE,
						ORANGE_DYED_DIORITE_PICKAXE, PINK_DYED_DIORITE_PICKAXE, PURPLE_DYED_DIORITE_PICKAXE,
						RED_DYED_DIORITE_PICKAXE, SILVER_DYED_DIORITE_PICKAXE, WHITE_DYED_DIORITE_PICKAXE,
						YELLOW_DYED_DIORITE_PICKAXE);
				registerItems(BLACK_DYED_DIORITE_HOE, BLUE_DYED_DIORITE_HOE, BROWN_DYED_DIORITE_HOE,
						CYAN_DYED_DIORITE_HOE, GRAY_DYED_DIORITE_HOE, GREEN_DYED_DIORITE_HOE,
						LIGHT_BLUE_DYED_DIORITE_HOE, LIME_DYED_DIORITE_HOE, MAGENTA_DYED_DIORITE_HOE,
						ORANGE_DYED_DIORITE_HOE, PINK_DYED_DIORITE_HOE, PURPLE_DYED_DIORITE_HOE,
						RED_DYED_DIORITE_HOE, SILVER_DYED_DIORITE_HOE, WHITE_DYED_DIORITE_HOE,
						YELLOW_DYED_DIORITE_HOE);
				registerItems(BLACK_DYED_DIORITE_SHOVEL, BLUE_DYED_DIORITE_SHOVEL, BROWN_DYED_DIORITE_SHOVEL,
						CYAN_DYED_DIORITE_SHOVEL, GRAY_DYED_DIORITE_SHOVEL, GREEN_DYED_DIORITE_SHOVEL,
						LIGHT_BLUE_DYED_DIORITE_SHOVEL, LIME_DYED_DIORITE_SHOVEL, MAGENTA_DYED_DIORITE_SHOVEL,
						ORANGE_DYED_DIORITE_SHOVEL, PINK_DYED_DIORITE_SHOVEL, PURPLE_DYED_DIORITE_SHOVEL,
						RED_DYED_DIORITE_SHOVEL, SILVER_DYED_DIORITE_SHOVEL, WHITE_DYED_DIORITE_SHOVEL,
						YELLOW_DYED_DIORITE_SHOVEL);
				registerItems(BLACK_DYED_POLISHED_DIORITE_SWORD, BLUE_DYED_POLISHED_DIORITE_SWORD, BROWN_DYED_POLISHED_DIORITE_SWORD,
						CYAN_DYED_POLISHED_DIORITE_SWORD, GRAY_DYED_POLISHED_DIORITE_SWORD, GREEN_DYED_POLISHED_DIORITE_SWORD,
						LIGHT_BLUE_DYED_POLISHED_DIORITE_SWORD, LIME_DYED_POLISHED_DIORITE_SWORD, MAGENTA_DYED_POLISHED_DIORITE_SWORD,
						ORANGE_DYED_POLISHED_DIORITE_SWORD, PINK_DYED_POLISHED_DIORITE_SWORD, PURPLE_DYED_POLISHED_DIORITE_SWORD,
						RED_DYED_POLISHED_DIORITE_SWORD, SILVER_DYED_POLISHED_DIORITE_SWORD, WHITE_DYED_POLISHED_DIORITE_SWORD,
						YELLOW_DYED_POLISHED_DIORITE_SWORD);
				registerItems(BLACK_DYED_POLISHED_DIORITE_AXE, BLUE_DYED_POLISHED_DIORITE_AXE, BROWN_DYED_POLISHED_DIORITE_AXE,
						CYAN_DYED_POLISHED_DIORITE_AXE, GRAY_DYED_POLISHED_DIORITE_AXE, GREEN_DYED_POLISHED_DIORITE_AXE,
						LIGHT_BLUE_DYED_POLISHED_DIORITE_AXE, LIME_DYED_POLISHED_DIORITE_AXE, MAGENTA_DYED_POLISHED_DIORITE_AXE,
						ORANGE_DYED_POLISHED_DIORITE_AXE, PINK_DYED_POLISHED_DIORITE_AXE, PURPLE_DYED_POLISHED_DIORITE_AXE,
						RED_DYED_POLISHED_DIORITE_AXE, SILVER_DYED_POLISHED_DIORITE_AXE, WHITE_DYED_POLISHED_DIORITE_AXE,
						YELLOW_DYED_POLISHED_DIORITE_AXE);
				registerItems(BLACK_DYED_POLISHED_DIORITE_PICKAXE, BLUE_DYED_POLISHED_DIORITE_PICKAXE, BROWN_DYED_POLISHED_DIORITE_PICKAXE,
						CYAN_DYED_POLISHED_DIORITE_PICKAXE, GRAY_DYED_POLISHED_DIORITE_PICKAXE, GREEN_DYED_POLISHED_DIORITE_PICKAXE,
						LIGHT_BLUE_DYED_POLISHED_DIORITE_PICKAXE, LIME_DYED_POLISHED_DIORITE_PICKAXE, MAGENTA_DYED_POLISHED_DIORITE_PICKAXE,
						ORANGE_DYED_POLISHED_DIORITE_PICKAXE, PINK_DYED_POLISHED_DIORITE_PICKAXE, PURPLE_DYED_POLISHED_DIORITE_PICKAXE,
						RED_DYED_POLISHED_DIORITE_PICKAXE, SILVER_DYED_POLISHED_DIORITE_PICKAXE, WHITE_DYED_POLISHED_DIORITE_PICKAXE,
						YELLOW_DYED_POLISHED_DIORITE_PICKAXE);
				registerItems(BLACK_DYED_POLISHED_DIORITE_HOE, BLUE_DYED_POLISHED_DIORITE_HOE, BROWN_DYED_POLISHED_DIORITE_HOE,
						CYAN_DYED_POLISHED_DIORITE_HOE, GRAY_DYED_POLISHED_DIORITE_HOE, GREEN_DYED_POLISHED_DIORITE_HOE,
						LIGHT_BLUE_DYED_POLISHED_DIORITE_HOE, LIME_DYED_POLISHED_DIORITE_HOE, MAGENTA_DYED_POLISHED_DIORITE_HOE,
						ORANGE_DYED_POLISHED_DIORITE_HOE, PINK_DYED_POLISHED_DIORITE_HOE, PURPLE_DYED_POLISHED_DIORITE_HOE,
						RED_DYED_POLISHED_DIORITE_HOE, SILVER_DYED_POLISHED_DIORITE_HOE, WHITE_DYED_POLISHED_DIORITE_HOE,
						YELLOW_DYED_POLISHED_DIORITE_HOE);
				registerItems(BLACK_DYED_POLISHED_DIORITE_SHOVEL, BLUE_DYED_POLISHED_DIORITE_SHOVEL, BROWN_DYED_POLISHED_DIORITE_SHOVEL,
						CYAN_DYED_POLISHED_DIORITE_SHOVEL, GRAY_DYED_POLISHED_DIORITE_SHOVEL, GREEN_DYED_POLISHED_DIORITE_SHOVEL,
						LIGHT_BLUE_DYED_POLISHED_DIORITE_SHOVEL, LIME_DYED_POLISHED_DIORITE_SHOVEL, MAGENTA_DYED_POLISHED_DIORITE_SHOVEL,
						ORANGE_DYED_POLISHED_DIORITE_SHOVEL, PINK_DYED_POLISHED_DIORITE_SHOVEL, PURPLE_DYED_POLISHED_DIORITE_SHOVEL,
						RED_DYED_POLISHED_DIORITE_SHOVEL, SILVER_DYED_POLISHED_DIORITE_SHOVEL, WHITE_DYED_POLISHED_DIORITE_SHOVEL,
						YELLOW_DYED_POLISHED_DIORITE_SHOVEL);
				registerItems(BLACK_DYED_ANDESITE_SWORD, BLUE_DYED_ANDESITE_SWORD, BROWN_DYED_ANDESITE_SWORD,
						CYAN_DYED_ANDESITE_SWORD, GRAY_DYED_ANDESITE_SWORD, GREEN_DYED_ANDESITE_SWORD,
						LIGHT_BLUE_DYED_ANDESITE_SWORD, LIME_DYED_ANDESITE_SWORD, MAGENTA_DYED_ANDESITE_SWORD,
						ORANGE_DYED_ANDESITE_SWORD, PINK_DYED_ANDESITE_SWORD, PURPLE_DYED_ANDESITE_SWORD,
						RED_DYED_ANDESITE_SWORD, SILVER_DYED_ANDESITE_SWORD, WHITE_DYED_ANDESITE_SWORD,
						YELLOW_DYED_ANDESITE_SWORD);
				registerItems(BLACK_DYED_ANDESITE_AXE, BLUE_DYED_ANDESITE_AXE, BROWN_DYED_ANDESITE_AXE,
						CYAN_DYED_ANDESITE_AXE, GRAY_DYED_ANDESITE_AXE, GREEN_DYED_ANDESITE_AXE,
						LIGHT_BLUE_DYED_ANDESITE_AXE, LIME_DYED_ANDESITE_AXE, MAGENTA_DYED_ANDESITE_AXE,
						ORANGE_DYED_ANDESITE_AXE, PINK_DYED_ANDESITE_AXE, PURPLE_DYED_ANDESITE_AXE,
						RED_DYED_ANDESITE_AXE, SILVER_DYED_ANDESITE_AXE, WHITE_DYED_ANDESITE_AXE,
						YELLOW_DYED_ANDESITE_AXE);
				registerItems(BLACK_DYED_ANDESITE_PICKAXE, BLUE_DYED_ANDESITE_PICKAXE, BROWN_DYED_ANDESITE_PICKAXE,
						CYAN_DYED_ANDESITE_PICKAXE, GRAY_DYED_ANDESITE_PICKAXE, GREEN_DYED_ANDESITE_PICKAXE,
						LIGHT_BLUE_DYED_ANDESITE_PICKAXE, LIME_DYED_ANDESITE_PICKAXE, MAGENTA_DYED_ANDESITE_PICKAXE,
						ORANGE_DYED_ANDESITE_PICKAXE, PINK_DYED_ANDESITE_PICKAXE, PURPLE_DYED_ANDESITE_PICKAXE,
						RED_DYED_ANDESITE_PICKAXE, SILVER_DYED_ANDESITE_PICKAXE, WHITE_DYED_ANDESITE_PICKAXE,
						YELLOW_DYED_ANDESITE_PICKAXE);
				registerItems(BLACK_DYED_ANDESITE_HOE, BLUE_DYED_ANDESITE_HOE, BROWN_DYED_ANDESITE_HOE,
						CYAN_DYED_ANDESITE_HOE, GRAY_DYED_ANDESITE_HOE, GREEN_DYED_ANDESITE_HOE,
						LIGHT_BLUE_DYED_ANDESITE_HOE, LIME_DYED_ANDESITE_HOE, MAGENTA_DYED_ANDESITE_HOE,
						ORANGE_DYED_ANDESITE_HOE, PINK_DYED_ANDESITE_HOE, PURPLE_DYED_ANDESITE_HOE,
						RED_DYED_ANDESITE_HOE, SILVER_DYED_ANDESITE_HOE, WHITE_DYED_ANDESITE_HOE,
						YELLOW_DYED_ANDESITE_HOE);
				registerItems(BLACK_DYED_ANDESITE_SHOVEL, BLUE_DYED_ANDESITE_SHOVEL, BROWN_DYED_ANDESITE_SHOVEL,
						CYAN_DYED_ANDESITE_SHOVEL, GRAY_DYED_ANDESITE_SHOVEL, GREEN_DYED_ANDESITE_SHOVEL,
						LIGHT_BLUE_DYED_ANDESITE_SHOVEL, LIME_DYED_ANDESITE_SHOVEL, MAGENTA_DYED_ANDESITE_SHOVEL,
						ORANGE_DYED_ANDESITE_SHOVEL, PINK_DYED_ANDESITE_SHOVEL, PURPLE_DYED_ANDESITE_SHOVEL,
						RED_DYED_ANDESITE_SHOVEL, SILVER_DYED_ANDESITE_SHOVEL, WHITE_DYED_ANDESITE_SHOVEL,
						YELLOW_DYED_ANDESITE_SHOVEL);
				registerItems(BLACK_DYED_POLISHED_ANDESITE_SWORD, BLUE_DYED_POLISHED_ANDESITE_SWORD, BROWN_DYED_POLISHED_ANDESITE_SWORD,
						CYAN_DYED_POLISHED_ANDESITE_SWORD, GRAY_DYED_POLISHED_ANDESITE_SWORD, GREEN_DYED_POLISHED_ANDESITE_SWORD,
						LIGHT_BLUE_DYED_POLISHED_ANDESITE_SWORD, LIME_DYED_POLISHED_ANDESITE_SWORD, MAGENTA_DYED_POLISHED_ANDESITE_SWORD,
						ORANGE_DYED_POLISHED_ANDESITE_SWORD, PINK_DYED_POLISHED_ANDESITE_SWORD, PURPLE_DYED_POLISHED_ANDESITE_SWORD,
						RED_DYED_POLISHED_ANDESITE_SWORD, SILVER_DYED_POLISHED_ANDESITE_SWORD, WHITE_DYED_POLISHED_ANDESITE_SWORD,
						YELLOW_DYED_POLISHED_ANDESITE_SWORD);
				registerItems(BLACK_DYED_POLISHED_ANDESITE_AXE, BLUE_DYED_POLISHED_ANDESITE_AXE, BROWN_DYED_POLISHED_ANDESITE_AXE,
						CYAN_DYED_POLISHED_ANDESITE_AXE, GRAY_DYED_POLISHED_ANDESITE_AXE, GREEN_DYED_POLISHED_ANDESITE_AXE,
						LIGHT_BLUE_DYED_POLISHED_ANDESITE_AXE, LIME_DYED_POLISHED_ANDESITE_AXE, MAGENTA_DYED_POLISHED_ANDESITE_AXE,
						ORANGE_DYED_POLISHED_ANDESITE_AXE, PINK_DYED_POLISHED_ANDESITE_AXE, PURPLE_DYED_POLISHED_ANDESITE_AXE,
						RED_DYED_POLISHED_ANDESITE_AXE, SILVER_DYED_POLISHED_ANDESITE_AXE, WHITE_DYED_POLISHED_ANDESITE_AXE,
						YELLOW_DYED_POLISHED_ANDESITE_AXE);
				registerItems(BLACK_DYED_POLISHED_ANDESITE_PICKAXE, BLUE_DYED_POLISHED_ANDESITE_PICKAXE, BROWN_DYED_POLISHED_ANDESITE_PICKAXE,
						CYAN_DYED_POLISHED_ANDESITE_PICKAXE, GRAY_DYED_POLISHED_ANDESITE_PICKAXE, GREEN_DYED_POLISHED_ANDESITE_PICKAXE,
						LIGHT_BLUE_DYED_POLISHED_ANDESITE_PICKAXE, LIME_DYED_POLISHED_ANDESITE_PICKAXE, MAGENTA_DYED_POLISHED_ANDESITE_PICKAXE,
						ORANGE_DYED_POLISHED_ANDESITE_PICKAXE, PINK_DYED_POLISHED_ANDESITE_PICKAXE, PURPLE_DYED_POLISHED_ANDESITE_PICKAXE,
						RED_DYED_POLISHED_ANDESITE_PICKAXE, SILVER_DYED_POLISHED_ANDESITE_PICKAXE, WHITE_DYED_POLISHED_ANDESITE_PICKAXE,
						YELLOW_DYED_POLISHED_ANDESITE_PICKAXE);
				registerItems(BLACK_DYED_POLISHED_ANDESITE_HOE, BLUE_DYED_POLISHED_ANDESITE_HOE, BROWN_DYED_POLISHED_ANDESITE_HOE,
						CYAN_DYED_POLISHED_ANDESITE_HOE, GRAY_DYED_POLISHED_ANDESITE_HOE, GREEN_DYED_POLISHED_ANDESITE_HOE,
						LIGHT_BLUE_DYED_POLISHED_ANDESITE_HOE, LIME_DYED_POLISHED_ANDESITE_HOE, MAGENTA_DYED_POLISHED_ANDESITE_HOE,
						ORANGE_DYED_POLISHED_ANDESITE_HOE, PINK_DYED_POLISHED_ANDESITE_HOE, PURPLE_DYED_POLISHED_ANDESITE_HOE,
						RED_DYED_POLISHED_ANDESITE_HOE, SILVER_DYED_POLISHED_ANDESITE_HOE, WHITE_DYED_POLISHED_ANDESITE_HOE,
						YELLOW_DYED_POLISHED_ANDESITE_HOE);
				registerItems(BLACK_DYED_POLISHED_ANDESITE_SHOVEL, BLUE_DYED_POLISHED_ANDESITE_SHOVEL, BROWN_DYED_POLISHED_ANDESITE_SHOVEL,
						CYAN_DYED_POLISHED_ANDESITE_SHOVEL, GRAY_DYED_POLISHED_ANDESITE_SHOVEL, GREEN_DYED_POLISHED_ANDESITE_SHOVEL,
						LIGHT_BLUE_DYED_POLISHED_ANDESITE_SHOVEL, LIME_DYED_POLISHED_ANDESITE_SHOVEL, MAGENTA_DYED_POLISHED_ANDESITE_SHOVEL,
						ORANGE_DYED_POLISHED_ANDESITE_SHOVEL, PINK_DYED_POLISHED_ANDESITE_SHOVEL, PURPLE_DYED_POLISHED_ANDESITE_SHOVEL,
						RED_DYED_POLISHED_ANDESITE_SHOVEL, SILVER_DYED_POLISHED_ANDESITE_SHOVEL, WHITE_DYED_POLISHED_ANDESITE_SHOVEL,
						YELLOW_DYED_POLISHED_ANDESITE_SHOVEL);
			}
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

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_GRANITE_AXE, 0, "black_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_GRANITE_AXE, 0, "blue_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_GRANITE_AXE, 0, "brown_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_GRANITE_AXE, 0, "cyan_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_GRANITE_AXE, 0, "gray_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_GRANITE_AXE, 0, "green_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_GRANITE_AXE, 0, "light_blue_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_GRANITE_AXE, 0, "lime_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_GRANITE_AXE, 0, "magenta_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_GRANITE_AXE, 0, "orange_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_GRANITE_AXE, 0, "pink_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_GRANITE_AXE, 0, "purple_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_GRANITE_AXE, 0, "red_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_GRANITE_AXE, 0, "silver_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_GRANITE_AXE, 0, "white_dyed_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_GRANITE_AXE, 0, "yellow_dyed_granite_axe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_GRANITE_PICKAXE, 0, "black_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_GRANITE_PICKAXE, 0, "blue_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_GRANITE_PICKAXE, 0, "brown_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_GRANITE_PICKAXE, 0, "cyan_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_GRANITE_PICKAXE, 0, "gray_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_GRANITE_PICKAXE, 0, "green_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_GRANITE_PICKAXE, 0, "light_blue_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_GRANITE_PICKAXE, 0, "lime_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_GRANITE_PICKAXE, 0, "magenta_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_GRANITE_PICKAXE, 0, "orange_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_GRANITE_PICKAXE, 0, "pink_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_GRANITE_PICKAXE, 0, "purple_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_GRANITE_PICKAXE, 0, "red_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_GRANITE_PICKAXE, 0, "silver_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_GRANITE_PICKAXE, 0, "white_dyed_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_GRANITE_PICKAXE, 0, "yellow_dyed_granite_pickaxe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_GRANITE_SHOVEL, 0, "black_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_GRANITE_SHOVEL, 0, "blue_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_GRANITE_SHOVEL, 0, "brown_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_GRANITE_SHOVEL, 0, "cyan_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_GRANITE_SHOVEL, 0, "gray_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_GRANITE_SHOVEL, 0, "green_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_GRANITE_SHOVEL, 0, "light_blue_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_GRANITE_SHOVEL, 0, "lime_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_GRANITE_SHOVEL, 0, "magenta_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_GRANITE_SHOVEL, 0, "orange_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_GRANITE_SHOVEL, 0, "pink_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_GRANITE_SHOVEL, 0, "purple_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_GRANITE_SHOVEL, 0, "red_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_GRANITE_SHOVEL, 0, "silver_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_GRANITE_SHOVEL, 0, "white_dyed_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_GRANITE_SHOVEL, 0, "yellow_dyed_granite_shovel", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_GRANITE_HOE, 0, "black_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_GRANITE_HOE, 0, "blue_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_GRANITE_HOE, 0, "brown_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_GRANITE_HOE, 0, "cyan_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_GRANITE_HOE, 0, "gray_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_GRANITE_HOE, 0, "green_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_GRANITE_HOE, 0, "light_blue_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_GRANITE_HOE, 0, "lime_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_GRANITE_HOE, 0, "magenta_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_GRANITE_HOE, 0, "orange_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_GRANITE_HOE, 0, "pink_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_GRANITE_HOE, 0, "purple_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_GRANITE_HOE, 0, "red_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_GRANITE_HOE, 0, "silver_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_GRANITE_HOE, 0, "white_dyed_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_GRANITE_HOE, 0, "yellow_dyed_granite_hoe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_GRANITE_SWORD, 0, "black_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_GRANITE_SWORD, 0, "blue_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_GRANITE_SWORD, 0, "brown_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_GRANITE_SWORD, 0, "cyan_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_GRANITE_SWORD, 0, "gray_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_GRANITE_SWORD, 0, "green_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_GRANITE_SWORD, 0, "light_blue_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_GRANITE_SWORD, 0, "lime_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_GRANITE_SWORD, 0, "magenta_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_GRANITE_SWORD, 0, "orange_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_GRANITE_SWORD, 0, "pink_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_GRANITE_SWORD, 0, "purple_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_GRANITE_SWORD, 0, "red_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_GRANITE_SWORD, 0, "silver_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_GRANITE_SWORD, 0, "white_dyed_polished_granite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_GRANITE_SWORD, 0, "yellow_dyed_polished_granite_sword", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_GRANITE_AXE, 0, "black_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_GRANITE_AXE, 0, "blue_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_GRANITE_AXE, 0, "brown_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_GRANITE_AXE, 0, "cyan_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_GRANITE_AXE, 0, "gray_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_GRANITE_AXE, 0, "green_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_GRANITE_AXE, 0, "light_blue_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_GRANITE_AXE, 0, "lime_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_GRANITE_AXE, 0, "magenta_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_GRANITE_AXE, 0, "orange_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_GRANITE_AXE, 0, "pink_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_GRANITE_AXE, 0, "purple_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_GRANITE_AXE, 0, "red_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_GRANITE_AXE, 0, "silver_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_GRANITE_AXE, 0, "white_dyed_polished_granite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_GRANITE_AXE, 0, "yellow_dyed_polished_granite_axe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_GRANITE_PICKAXE, 0, "black_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_GRANITE_PICKAXE, 0, "blue_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_GRANITE_PICKAXE, 0, "brown_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_GRANITE_PICKAXE, 0, "cyan_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_GRANITE_PICKAXE, 0, "gray_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_GRANITE_PICKAXE, 0, "green_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_GRANITE_PICKAXE, 0, "light_blue_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_GRANITE_PICKAXE, 0, "lime_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_GRANITE_PICKAXE, 0, "magenta_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_GRANITE_PICKAXE, 0, "orange_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_GRANITE_PICKAXE, 0, "pink_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_GRANITE_PICKAXE, 0, "purple_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_GRANITE_PICKAXE, 0, "red_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_GRANITE_PICKAXE, 0, "silver_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_GRANITE_PICKAXE, 0, "white_dyed_polished_granite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_GRANITE_PICKAXE, 0, "yellow_dyed_polished_granite_pickaxe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_GRANITE_SHOVEL, 0, "black_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_GRANITE_SHOVEL, 0, "blue_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_GRANITE_SHOVEL, 0, "brown_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_GRANITE_SHOVEL, 0, "cyan_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_GRANITE_SHOVEL, 0, "gray_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_GRANITE_SHOVEL, 0, "green_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_GRANITE_SHOVEL, 0, "light_blue_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_GRANITE_SHOVEL, 0, "lime_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_GRANITE_SHOVEL, 0, "magenta_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_GRANITE_SHOVEL, 0, "orange_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_GRANITE_SHOVEL, 0, "pink_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_GRANITE_SHOVEL, 0, "purple_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_GRANITE_SHOVEL, 0, "red_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_GRANITE_SHOVEL, 0, "silver_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_GRANITE_SHOVEL, 0, "white_dyed_polished_granite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_GRANITE_SHOVEL, 0, "yellow_dyed_polished_granite_shovel", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_GRANITE_HOE, 0, "black_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_GRANITE_HOE, 0, "blue_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_GRANITE_HOE, 0, "brown_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_GRANITE_HOE, 0, "cyan_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_GRANITE_HOE, 0, "gray_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_GRANITE_HOE, 0, "green_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_GRANITE_HOE, 0, "light_blue_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_GRANITE_HOE, 0, "lime_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_GRANITE_HOE, 0, "magenta_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_GRANITE_HOE, 0, "orange_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_GRANITE_HOE, 0, "pink_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_GRANITE_HOE, 0, "purple_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_GRANITE_HOE, 0, "red_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_GRANITE_HOE, 0, "silver_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_GRANITE_HOE, 0, "white_dyed_polished_granite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_GRANITE_HOE, 0, "yellow_dyed_polished_granite_hoe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_DIORITE_SWORD, 0, "black_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_DIORITE_SWORD, 0, "blue_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_DIORITE_SWORD, 0, "brown_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_DIORITE_SWORD, 0, "cyan_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_DIORITE_SWORD, 0, "gray_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_DIORITE_SWORD, 0, "green_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_DIORITE_SWORD, 0, "light_blue_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_DIORITE_SWORD, 0, "lime_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_DIORITE_SWORD, 0, "magenta_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_DIORITE_SWORD, 0, "orange_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_DIORITE_SWORD, 0, "pink_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_DIORITE_SWORD, 0, "purple_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_DIORITE_SWORD, 0, "red_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_DIORITE_SWORD, 0, "silver_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_DIORITE_SWORD, 0, "white_dyed_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_DIORITE_SWORD, 0, "yellow_dyed_diorite_sword", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_DIORITE_AXE, 0, "black_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_DIORITE_AXE, 0, "blue_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_DIORITE_AXE, 0, "brown_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_DIORITE_AXE, 0, "cyan_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_DIORITE_AXE, 0, "gray_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_DIORITE_AXE, 0, "green_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_DIORITE_AXE, 0, "light_blue_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_DIORITE_AXE, 0, "lime_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_DIORITE_AXE, 0, "magenta_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_DIORITE_AXE, 0, "orange_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_DIORITE_AXE, 0, "pink_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_DIORITE_AXE, 0, "purple_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_DIORITE_AXE, 0, "red_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_DIORITE_AXE, 0, "silver_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_DIORITE_AXE, 0, "white_dyed_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_DIORITE_AXE, 0, "yellow_dyed_diorite_axe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_DIORITE_PICKAXE, 0, "black_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_DIORITE_PICKAXE, 0, "blue_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_DIORITE_PICKAXE, 0, "brown_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_DIORITE_PICKAXE, 0, "cyan_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_DIORITE_PICKAXE, 0, "gray_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_DIORITE_PICKAXE, 0, "green_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_DIORITE_PICKAXE, 0, "light_blue_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_DIORITE_PICKAXE, 0, "lime_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_DIORITE_PICKAXE, 0, "magenta_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_DIORITE_PICKAXE, 0, "orange_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_DIORITE_PICKAXE, 0, "pink_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_DIORITE_PICKAXE, 0, "purple_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_DIORITE_PICKAXE, 0, "red_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_DIORITE_PICKAXE, 0, "silver_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_DIORITE_PICKAXE, 0, "white_dyed_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_DIORITE_PICKAXE, 0, "yellow_dyed_diorite_pickaxe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_DIORITE_SHOVEL, 0, "black_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_DIORITE_SHOVEL, 0, "blue_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_DIORITE_SHOVEL, 0, "brown_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_DIORITE_SHOVEL, 0, "cyan_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_DIORITE_SHOVEL, 0, "gray_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_DIORITE_SHOVEL, 0, "green_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_DIORITE_SHOVEL, 0, "light_blue_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_DIORITE_SHOVEL, 0, "lime_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_DIORITE_SHOVEL, 0, "magenta_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_DIORITE_SHOVEL, 0, "orange_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_DIORITE_SHOVEL, 0, "pink_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_DIORITE_SHOVEL, 0, "purple_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_DIORITE_SHOVEL, 0, "red_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_DIORITE_SHOVEL, 0, "silver_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_DIORITE_SHOVEL, 0, "white_dyed_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_DIORITE_SHOVEL, 0, "yellow_dyed_diorite_shovel", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_DIORITE_HOE, 0, "black_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_DIORITE_HOE, 0, "blue_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_DIORITE_HOE, 0, "brown_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_DIORITE_HOE, 0, "cyan_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_DIORITE_HOE, 0, "gray_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_DIORITE_HOE, 0, "green_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_DIORITE_HOE, 0, "light_blue_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_DIORITE_HOE, 0, "lime_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_DIORITE_HOE, 0, "magenta_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_DIORITE_HOE, 0, "orange_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_DIORITE_HOE, 0, "pink_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_DIORITE_HOE, 0, "purple_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_DIORITE_HOE, 0, "red_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_DIORITE_HOE, 0, "silver_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_DIORITE_HOE, 0, "white_dyed_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_DIORITE_HOE, 0, "yellow_dyed_diorite_hoe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_DIORITE_SWORD, 0, "black_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_DIORITE_SWORD, 0, "blue_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_DIORITE_SWORD, 0, "brown_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_DIORITE_SWORD, 0, "cyan_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_DIORITE_SWORD, 0, "gray_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_DIORITE_SWORD, 0, "green_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_DIORITE_SWORD, 0, "light_blue_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_DIORITE_SWORD, 0, "lime_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_DIORITE_SWORD, 0, "magenta_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_DIORITE_SWORD, 0, "orange_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_DIORITE_SWORD, 0, "pink_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_DIORITE_SWORD, 0, "purple_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_DIORITE_SWORD, 0, "red_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_DIORITE_SWORD, 0, "silver_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_DIORITE_SWORD, 0, "white_dyed_polished_diorite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_DIORITE_SWORD, 0, "yellow_dyed_polished_diorite_sword", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_DIORITE_AXE, 0, "black_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_DIORITE_AXE, 0, "blue_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_DIORITE_AXE, 0, "brown_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_DIORITE_AXE, 0, "cyan_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_DIORITE_AXE, 0, "gray_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_DIORITE_AXE, 0, "green_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_DIORITE_AXE, 0, "light_blue_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_DIORITE_AXE, 0, "lime_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_DIORITE_AXE, 0, "magenta_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_DIORITE_AXE, 0, "orange_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_DIORITE_AXE, 0, "pink_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_DIORITE_AXE, 0, "purple_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_DIORITE_AXE, 0, "red_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_DIORITE_AXE, 0, "silver_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_DIORITE_AXE, 0, "white_dyed_polished_diorite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_DIORITE_AXE, 0, "yellow_dyed_polished_diorite_axe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_DIORITE_PICKAXE, 0, "black_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_DIORITE_PICKAXE, 0, "blue_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_DIORITE_PICKAXE, 0, "brown_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_DIORITE_PICKAXE, 0, "cyan_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_DIORITE_PICKAXE, 0, "gray_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_DIORITE_PICKAXE, 0, "green_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_DIORITE_PICKAXE, 0, "light_blue_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_DIORITE_PICKAXE, 0, "lime_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_DIORITE_PICKAXE, 0, "magenta_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_DIORITE_PICKAXE, 0, "orange_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_DIORITE_PICKAXE, 0, "pink_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_DIORITE_PICKAXE, 0, "purple_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_DIORITE_PICKAXE, 0, "red_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_DIORITE_PICKAXE, 0, "silver_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_DIORITE_PICKAXE, 0, "white_dyed_polished_diorite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_DIORITE_PICKAXE, 0, "yellow_dyed_polished_diorite_pickaxe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_DIORITE_SHOVEL, 0, "black_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_DIORITE_SHOVEL, 0, "blue_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_DIORITE_SHOVEL, 0, "brown_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_DIORITE_SHOVEL, 0, "cyan_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_DIORITE_SHOVEL, 0, "gray_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_DIORITE_SHOVEL, 0, "green_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_DIORITE_SHOVEL, 0, "light_blue_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_DIORITE_SHOVEL, 0, "lime_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_DIORITE_SHOVEL, 0, "magenta_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_DIORITE_SHOVEL, 0, "orange_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_DIORITE_SHOVEL, 0, "pink_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_DIORITE_SHOVEL, 0, "purple_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_DIORITE_SHOVEL, 0, "red_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_DIORITE_SHOVEL, 0, "silver_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_DIORITE_SHOVEL, 0, "white_dyed_polished_diorite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_DIORITE_SHOVEL, 0, "yellow_dyed_polished_diorite_shovel", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_DIORITE_HOE, 0, "black_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_DIORITE_HOE, 0, "blue_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_DIORITE_HOE, 0, "brown_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_DIORITE_HOE, 0, "cyan_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_DIORITE_HOE, 0, "gray_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_DIORITE_HOE, 0, "green_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_DIORITE_HOE, 0, "light_blue_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_DIORITE_HOE, 0, "lime_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_DIORITE_HOE, 0, "magenta_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_DIORITE_HOE, 0, "orange_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_DIORITE_HOE, 0, "pink_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_DIORITE_HOE, 0, "purple_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_DIORITE_HOE, 0, "red_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_DIORITE_HOE, 0, "silver_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_DIORITE_HOE, 0, "white_dyed_polished_diorite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_DIORITE_HOE, 0, "yellow_dyed_polished_diorite_hoe", "inventory");


        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_ANDESITE_SWORD, 0, "black_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_ANDESITE_SWORD, 0, "blue_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_ANDESITE_SWORD, 0, "brown_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_ANDESITE_SWORD, 0, "cyan_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_ANDESITE_SWORD, 0, "gray_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_ANDESITE_SWORD, 0, "green_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_ANDESITE_SWORD, 0, "light_blue_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_ANDESITE_SWORD, 0, "lime_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_ANDESITE_SWORD, 0, "magenta_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_ANDESITE_SWORD, 0, "orange_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_ANDESITE_SWORD, 0, "pink_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_ANDESITE_SWORD, 0, "purple_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_ANDESITE_SWORD, 0, "red_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_ANDESITE_SWORD, 0, "silver_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_ANDESITE_SWORD, 0, "white_dyed_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_ANDESITE_SWORD, 0, "yellow_dyed_andesite_sword", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_ANDESITE_AXE, 0, "black_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_ANDESITE_AXE, 0, "blue_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_ANDESITE_AXE, 0, "brown_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_ANDESITE_AXE, 0, "cyan_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_ANDESITE_AXE, 0, "gray_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_ANDESITE_AXE, 0, "green_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_ANDESITE_AXE, 0, "light_blue_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_ANDESITE_AXE, 0, "lime_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_ANDESITE_AXE, 0, "magenta_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_ANDESITE_AXE, 0, "orange_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_ANDESITE_AXE, 0, "pink_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_ANDESITE_AXE, 0, "purple_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_ANDESITE_AXE, 0, "red_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_ANDESITE_AXE, 0, "silver_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_ANDESITE_AXE, 0, "white_dyed_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_ANDESITE_AXE, 0, "yellow_dyed_andesite_axe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_ANDESITE_PICKAXE, 0, "black_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_ANDESITE_PICKAXE, 0, "blue_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_ANDESITE_PICKAXE, 0, "brown_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_ANDESITE_PICKAXE, 0, "cyan_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_ANDESITE_PICKAXE, 0, "gray_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_ANDESITE_PICKAXE, 0, "green_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_ANDESITE_PICKAXE, 0, "light_blue_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_ANDESITE_PICKAXE, 0, "lime_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_ANDESITE_PICKAXE, 0, "magenta_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_ANDESITE_PICKAXE, 0, "orange_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_ANDESITE_PICKAXE, 0, "pink_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_ANDESITE_PICKAXE, 0, "purple_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_ANDESITE_PICKAXE, 0, "red_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_ANDESITE_PICKAXE, 0, "silver_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_ANDESITE_PICKAXE, 0, "white_dyed_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_ANDESITE_PICKAXE, 0, "yellow_dyed_andesite_pickaxe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_ANDESITE_SHOVEL, 0, "black_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_ANDESITE_SHOVEL, 0, "blue_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_ANDESITE_SHOVEL, 0, "brown_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_ANDESITE_SHOVEL, 0, "cyan_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_ANDESITE_SHOVEL, 0, "gray_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_ANDESITE_SHOVEL, 0, "green_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_ANDESITE_SHOVEL, 0, "light_blue_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_ANDESITE_SHOVEL, 0, "lime_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_ANDESITE_SHOVEL, 0, "magenta_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_ANDESITE_SHOVEL, 0, "orange_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_ANDESITE_SHOVEL, 0, "pink_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_ANDESITE_SHOVEL, 0, "purple_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_ANDESITE_SHOVEL, 0, "red_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_ANDESITE_SHOVEL, 0, "silver_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_ANDESITE_SHOVEL, 0, "white_dyed_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_ANDESITE_SHOVEL, 0, "yellow_dyed_andesite_shovel", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_ANDESITE_HOE, 0, "black_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_ANDESITE_HOE, 0, "blue_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_ANDESITE_HOE, 0, "brown_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_ANDESITE_HOE, 0, "cyan_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_ANDESITE_HOE, 0, "gray_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_ANDESITE_HOE, 0, "green_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_ANDESITE_HOE, 0, "light_blue_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_ANDESITE_HOE, 0, "lime_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_ANDESITE_HOE, 0, "magenta_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_ANDESITE_HOE, 0, "orange_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_ANDESITE_HOE, 0, "pink_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_ANDESITE_HOE, 0, "purple_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_ANDESITE_HOE, 0, "red_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_ANDESITE_HOE, 0, "silver_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_ANDESITE_HOE, 0, "white_dyed_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_ANDESITE_HOE, 0, "yellow_dyed_andesite_hoe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_ANDESITE_SWORD, 0, "black_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_ANDESITE_SWORD, 0, "blue_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_ANDESITE_SWORD, 0, "brown_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_ANDESITE_SWORD, 0, "cyan_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_ANDESITE_SWORD, 0, "gray_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_ANDESITE_SWORD, 0, "green_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_ANDESITE_SWORD, 0, "light_blue_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_ANDESITE_SWORD, 0, "lime_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_ANDESITE_SWORD, 0, "magenta_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_ANDESITE_SWORD, 0, "orange_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_ANDESITE_SWORD, 0, "pink_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_ANDESITE_SWORD, 0, "purple_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_ANDESITE_SWORD, 0, "red_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_ANDESITE_SWORD, 0, "silver_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_ANDESITE_SWORD, 0, "white_dyed_polished_andesite_sword", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_ANDESITE_SWORD, 0, "yellow_dyed_polished_andesite_sword", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_ANDESITE_AXE, 0, "black_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_ANDESITE_AXE, 0, "blue_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_ANDESITE_AXE, 0, "brown_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_ANDESITE_AXE, 0, "cyan_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_ANDESITE_AXE, 0, "gray_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_ANDESITE_AXE, 0, "green_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_ANDESITE_AXE, 0, "light_blue_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_ANDESITE_AXE, 0, "lime_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_ANDESITE_AXE, 0, "magenta_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_ANDESITE_AXE, 0, "orange_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_ANDESITE_AXE, 0, "pink_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_ANDESITE_AXE, 0, "purple_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_ANDESITE_AXE, 0, "red_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_ANDESITE_AXE, 0, "silver_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_ANDESITE_AXE, 0, "white_dyed_polished_andesite_axe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_ANDESITE_AXE, 0, "yellow_dyed_polished_andesite_axe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_ANDESITE_PICKAXE, 0, "black_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_ANDESITE_PICKAXE, 0, "blue_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_ANDESITE_PICKAXE, 0, "brown_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_ANDESITE_PICKAXE, 0, "cyan_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_ANDESITE_PICKAXE, 0, "gray_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_ANDESITE_PICKAXE, 0, "green_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_ANDESITE_PICKAXE, 0, "light_blue_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_ANDESITE_PICKAXE, 0, "lime_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_ANDESITE_PICKAXE, 0, "magenta_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_ANDESITE_PICKAXE, 0, "orange_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_ANDESITE_PICKAXE, 0, "pink_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_ANDESITE_PICKAXE, 0, "purple_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_ANDESITE_PICKAXE, 0, "red_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_ANDESITE_PICKAXE, 0, "silver_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_ANDESITE_PICKAXE, 0, "white_dyed_polished_andesite_pickaxe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_ANDESITE_PICKAXE, 0, "yellow_dyed_polished_andesite_pickaxe", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_ANDESITE_SHOVEL, 0, "black_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_ANDESITE_SHOVEL, 0, "blue_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_ANDESITE_SHOVEL, 0, "brown_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_ANDESITE_SHOVEL, 0, "cyan_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_ANDESITE_SHOVEL, 0, "gray_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_ANDESITE_SHOVEL, 0, "green_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_ANDESITE_SHOVEL, 0, "light_blue_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_ANDESITE_SHOVEL, 0, "lime_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_ANDESITE_SHOVEL, 0, "magenta_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_ANDESITE_SHOVEL, 0, "orange_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_ANDESITE_SHOVEL, 0, "pink_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_ANDESITE_SHOVEL, 0, "purple_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_ANDESITE_SHOVEL, 0, "red_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_ANDESITE_SHOVEL, 0, "silver_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_ANDESITE_SHOVEL, 0, "white_dyed_polished_andesite_shovel", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_ANDESITE_SHOVEL, 0, "yellow_dyed_polished_andesite_shovel", "inventory");

        IgneousExtrasMod.PROXY.registerItemModelMesher(BLACK_DYED_POLISHED_ANDESITE_HOE, 0, "black_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BLUE_DYED_POLISHED_ANDESITE_HOE, 0, "blue_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(BROWN_DYED_POLISHED_ANDESITE_HOE, 0, "brown_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(CYAN_DYED_POLISHED_ANDESITE_HOE, 0, "cyan_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GRAY_DYED_POLISHED_ANDESITE_HOE, 0, "gray_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(GREEN_DYED_POLISHED_ANDESITE_HOE, 0, "green_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIGHT_BLUE_DYED_POLISHED_ANDESITE_HOE, 0, "light_blue_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(LIME_DYED_POLISHED_ANDESITE_HOE, 0, "lime_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(MAGENTA_DYED_POLISHED_ANDESITE_HOE, 0, "magenta_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(ORANGE_DYED_POLISHED_ANDESITE_HOE, 0, "orange_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PINK_DYED_POLISHED_ANDESITE_HOE, 0, "pink_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(PURPLE_DYED_POLISHED_ANDESITE_HOE, 0, "purple_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(RED_DYED_POLISHED_ANDESITE_HOE, 0, "red_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(SILVER_DYED_POLISHED_ANDESITE_HOE, 0, "silver_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(WHITE_DYED_POLISHED_ANDESITE_HOE, 0, "white_dyed_polished_andesite_hoe", "inventory");
        IgneousExtrasMod.PROXY.registerItemModelMesher(YELLOW_DYED_POLISHED_ANDESITE_HOE, 0, "yellow_dyed_polished_andesite_hoe", "inventory");

	}

	public static void registerRecipes() {

		//First, we register recipes for tools
		if (ConfigHandler.ENABLE_ADDITIONAL_TOOLS) {

			//Start with granite

			registerToolRecipes(Blocks.STONE, 1, GRANITE_SWORD, GRANITE_PICKAXE, GRANITE_AXE, GRANITE_SHOVEL, GRANITE_HOE);
			registerToolRecipes(Blocks.STONE, 2, POLISHED_GRANITE_SWORD, POLISHED_GRANITE_PICKAXE, POLISHED_GRANITE_AXE, POLISHED_GRANITE_SHOVEL, POLISHED_GRANITE_HOE);

			//Then diorite

			registerToolRecipes(Blocks.STONE, 3, DIORITE_SWORD, DIORITE_PICKAXE, DIORITE_AXE, DIORITE_SHOVEL, DIORITE_HOE);
			registerToolRecipes(Blocks.STONE, 4, POLISHED_DIORITE_SWORD, POLISHED_DIORITE_PICKAXE, POLISHED_DIORITE_AXE, POLISHED_DIORITE_SHOVEL, POLISHED_DIORITE_HOE);

			//Then andesite
			registerToolRecipes(Blocks.STONE, 5, ANDESITE_SWORD, ANDESITE_PICKAXE, ANDESITE_AXE, ANDESITE_SHOVEL, ANDESITE_HOE);
			registerToolRecipes(Blocks.STONE, 6, POLISHED_ANDESITE_SWORD, POLISHED_ANDESITE_PICKAXE, POLISHED_ANDESITE_AXE, POLISHED_ANDESITE_SHOVEL, POLISHED_ANDESITE_HOE);

            //Then dyed
            //DAMN IT
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_GRANITE_SWORD, BLACK_DYED_GRANITE_PICKAXE, BLACK_DYED_GRANITE_AXE, BLACK_DYED_GRANITE_SHOVEL, BLACK_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_GRANITE_SWORD, ORANGE_DYED_GRANITE_PICKAXE, ORANGE_DYED_GRANITE_AXE, ORANGE_DYED_GRANITE_SHOVEL, ORANGE_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_GRANITE_SWORD, YELLOW_DYED_GRANITE_PICKAXE, YELLOW_DYED_GRANITE_AXE, YELLOW_DYED_GRANITE_SHOVEL, YELLOW_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_GRANITE_SWORD, GREEN_DYED_GRANITE_PICKAXE, GREEN_DYED_GRANITE_AXE, GREEN_DYED_GRANITE_SHOVEL, GREEN_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_GRANITE_SWORD, BLUE_DYED_GRANITE_PICKAXE, BLUE_DYED_GRANITE_AXE, BLUE_DYED_GRANITE_SHOVEL, BLUE_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_GRANITE_SWORD, LIGHT_BLUE_DYED_GRANITE_PICKAXE, LIGHT_BLUE_DYED_GRANITE_AXE, LIGHT_BLUE_DYED_GRANITE_SHOVEL, LIGHT_BLUE_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_GRANITE_SWORD, MAGENTA_DYED_GRANITE_PICKAXE, MAGENTA_DYED_GRANITE_AXE, MAGENTA_DYED_GRANITE_SHOVEL, MAGENTA_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_GRANITE_SWORD, PINK_DYED_GRANITE_PICKAXE, PINK_DYED_GRANITE_AXE, PINK_DYED_GRANITE_SHOVEL, PINK_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_GRANITE_SWORD, WHITE_DYED_GRANITE_PICKAXE, WHITE_DYED_GRANITE_AXE, WHITE_DYED_GRANITE_SHOVEL, WHITE_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_GRANITE_SWORD, GRAY_DYED_GRANITE_PICKAXE, GRAY_DYED_GRANITE_AXE, GRAY_DYED_GRANITE_SHOVEL, GRAY_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_GRANITE_SWORD, RED_DYED_GRANITE_PICKAXE, RED_DYED_GRANITE_AXE, RED_DYED_GRANITE_SHOVEL, RED_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_GRANITE_SWORD, BROWN_DYED_GRANITE_PICKAXE, BROWN_DYED_GRANITE_AXE, BROWN_DYED_GRANITE_SHOVEL, BROWN_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_GRANITE_SWORD, CYAN_DYED_GRANITE_PICKAXE, CYAN_DYED_GRANITE_AXE, CYAN_DYED_GRANITE_SHOVEL, CYAN_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_GRANITE_SWORD, PURPLE_DYED_GRANITE_PICKAXE, PURPLE_DYED_GRANITE_AXE, PURPLE_DYED_GRANITE_SHOVEL, PURPLE_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_GRANITE_SWORD, SILVER_DYED_GRANITE_PICKAXE, SILVER_DYED_GRANITE_AXE, SILVER_DYED_GRANITE_SHOVEL, SILVER_DYED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_GRANITE_SWORD, LIME_DYED_GRANITE_PICKAXE, LIME_DYED_GRANITE_AXE, LIME_DYED_GRANITE_SHOVEL, LIME_DYED_GRANITE_HOE);

            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_GRANITE_SWORD, BLACK_DYED_POLISHED_GRANITE_PICKAXE, BLACK_DYED_POLISHED_GRANITE_AXE, BLACK_DYED_POLISHED_GRANITE_SHOVEL, BLACK_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_GRANITE_SWORD, ORANGE_DYED_POLISHED_GRANITE_PICKAXE, ORANGE_DYED_POLISHED_GRANITE_AXE, ORANGE_DYED_POLISHED_GRANITE_SHOVEL, ORANGE_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_GRANITE_SWORD, YELLOW_DYED_POLISHED_GRANITE_PICKAXE, YELLOW_DYED_POLISHED_GRANITE_AXE, YELLOW_DYED_POLISHED_GRANITE_SHOVEL, YELLOW_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_GRANITE_SWORD, GREEN_DYED_POLISHED_GRANITE_PICKAXE, GREEN_DYED_POLISHED_GRANITE_AXE, GREEN_DYED_POLISHED_GRANITE_SHOVEL, GREEN_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_GRANITE_SWORD, BLUE_DYED_POLISHED_GRANITE_PICKAXE, BLUE_DYED_POLISHED_GRANITE_AXE, BLUE_DYED_POLISHED_GRANITE_SHOVEL, BLUE_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_GRANITE_SWORD, LIGHT_BLUE_DYED_POLISHED_GRANITE_PICKAXE, LIGHT_BLUE_DYED_POLISHED_GRANITE_AXE, LIGHT_BLUE_DYED_POLISHED_GRANITE_SHOVEL, LIGHT_BLUE_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_GRANITE_SWORD, MAGENTA_DYED_POLISHED_GRANITE_PICKAXE, MAGENTA_DYED_POLISHED_GRANITE_AXE, MAGENTA_DYED_POLISHED_GRANITE_SHOVEL, MAGENTA_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_GRANITE_SWORD, PINK_DYED_POLISHED_GRANITE_PICKAXE, PINK_DYED_POLISHED_GRANITE_AXE, PINK_DYED_POLISHED_GRANITE_SHOVEL, PINK_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_GRANITE_SWORD, WHITE_DYED_POLISHED_GRANITE_PICKAXE, WHITE_DYED_POLISHED_GRANITE_AXE, WHITE_DYED_POLISHED_GRANITE_SHOVEL, WHITE_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_GRANITE_SWORD, GRAY_DYED_POLISHED_GRANITE_PICKAXE, GRAY_DYED_POLISHED_GRANITE_AXE, GRAY_DYED_POLISHED_GRANITE_SHOVEL, GRAY_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_GRANITE_SWORD, RED_DYED_POLISHED_GRANITE_PICKAXE, RED_DYED_POLISHED_GRANITE_AXE, RED_DYED_POLISHED_GRANITE_SHOVEL, RED_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_GRANITE_SWORD, BROWN_DYED_POLISHED_GRANITE_PICKAXE, BROWN_DYED_POLISHED_GRANITE_AXE, BROWN_DYED_POLISHED_GRANITE_SHOVEL, BROWN_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_GRANITE_SWORD, CYAN_DYED_POLISHED_GRANITE_PICKAXE, CYAN_DYED_POLISHED_GRANITE_AXE, CYAN_DYED_POLISHED_GRANITE_SHOVEL, CYAN_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_GRANITE_SWORD, PURPLE_DYED_POLISHED_GRANITE_PICKAXE, PURPLE_DYED_POLISHED_GRANITE_AXE, PURPLE_DYED_POLISHED_GRANITE_SHOVEL, PURPLE_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_GRANITE_SWORD, SILVER_DYED_POLISHED_GRANITE_PICKAXE, SILVER_DYED_POLISHED_GRANITE_AXE, SILVER_DYED_POLISHED_GRANITE_SHOVEL, SILVER_DYED_POLISHED_GRANITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_GRANITE_SWORD, LIME_DYED_POLISHED_GRANITE_PICKAXE, LIME_DYED_POLISHED_GRANITE_AXE, LIME_DYED_POLISHED_GRANITE_SHOVEL, LIME_DYED_POLISHED_GRANITE_HOE);


            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_DIORITE_SWORD, BLACK_DYED_DIORITE_PICKAXE, BLACK_DYED_DIORITE_AXE, BLACK_DYED_DIORITE_SHOVEL, BLACK_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_DIORITE_SWORD, ORANGE_DYED_DIORITE_PICKAXE, ORANGE_DYED_DIORITE_AXE, ORANGE_DYED_DIORITE_SHOVEL, ORANGE_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_DIORITE_SWORD, YELLOW_DYED_DIORITE_PICKAXE, YELLOW_DYED_DIORITE_AXE, YELLOW_DYED_DIORITE_SHOVEL, YELLOW_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_DIORITE_SWORD, GREEN_DYED_DIORITE_PICKAXE, GREEN_DYED_DIORITE_AXE, GREEN_DYED_DIORITE_SHOVEL, GREEN_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_DIORITE_SWORD, BLUE_DYED_DIORITE_PICKAXE, BLUE_DYED_DIORITE_AXE, BLUE_DYED_DIORITE_SHOVEL, BLUE_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_DIORITE_SWORD, LIGHT_BLUE_DYED_DIORITE_PICKAXE, LIGHT_BLUE_DYED_DIORITE_AXE, LIGHT_BLUE_DYED_DIORITE_SHOVEL, LIGHT_BLUE_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_DIORITE_SWORD, MAGENTA_DYED_DIORITE_PICKAXE, MAGENTA_DYED_DIORITE_AXE, MAGENTA_DYED_DIORITE_SHOVEL, MAGENTA_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_DIORITE_SWORD, PINK_DYED_DIORITE_PICKAXE, PINK_DYED_DIORITE_AXE, PINK_DYED_DIORITE_SHOVEL, PINK_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_DIORITE_SWORD, WHITE_DYED_DIORITE_PICKAXE, WHITE_DYED_DIORITE_AXE, WHITE_DYED_DIORITE_SHOVEL, WHITE_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_DIORITE_SWORD, GRAY_DYED_DIORITE_PICKAXE, GRAY_DYED_DIORITE_AXE, GRAY_DYED_DIORITE_SHOVEL, GRAY_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_DIORITE_SWORD, RED_DYED_DIORITE_PICKAXE, RED_DYED_DIORITE_AXE, RED_DYED_DIORITE_SHOVEL, RED_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_DIORITE_SWORD, BROWN_DYED_DIORITE_PICKAXE, BROWN_DYED_DIORITE_AXE, BROWN_DYED_DIORITE_SHOVEL, BROWN_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_DIORITE_SWORD, CYAN_DYED_DIORITE_PICKAXE, CYAN_DYED_DIORITE_AXE, CYAN_DYED_DIORITE_SHOVEL, CYAN_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_DIORITE_SWORD, PURPLE_DYED_DIORITE_PICKAXE, PURPLE_DYED_DIORITE_AXE, PURPLE_DYED_DIORITE_SHOVEL, PURPLE_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_DIORITE_SWORD, SILVER_DYED_DIORITE_PICKAXE, SILVER_DYED_DIORITE_AXE, SILVER_DYED_DIORITE_SHOVEL, SILVER_DYED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_DIORITE_SWORD, LIME_DYED_DIORITE_PICKAXE, LIME_DYED_DIORITE_AXE, LIME_DYED_DIORITE_SHOVEL, LIME_DYED_DIORITE_HOE);

            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_DIORITE_SWORD, BLACK_DYED_POLISHED_DIORITE_PICKAXE, BLACK_DYED_POLISHED_DIORITE_AXE, BLACK_DYED_POLISHED_DIORITE_SHOVEL, BLACK_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_DIORITE_SWORD, ORANGE_DYED_POLISHED_DIORITE_PICKAXE, ORANGE_DYED_POLISHED_DIORITE_AXE, ORANGE_DYED_POLISHED_DIORITE_SHOVEL, ORANGE_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_DIORITE_SWORD, YELLOW_DYED_POLISHED_DIORITE_PICKAXE, YELLOW_DYED_POLISHED_DIORITE_AXE, YELLOW_DYED_POLISHED_DIORITE_SHOVEL, YELLOW_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_DIORITE_SWORD, GREEN_DYED_POLISHED_DIORITE_PICKAXE, GREEN_DYED_POLISHED_DIORITE_AXE, GREEN_DYED_POLISHED_DIORITE_SHOVEL, GREEN_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_DIORITE_SWORD, BLUE_DYED_POLISHED_DIORITE_PICKAXE, BLUE_DYED_POLISHED_DIORITE_AXE, BLUE_DYED_POLISHED_DIORITE_SHOVEL, BLUE_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_DIORITE_SWORD, LIGHT_BLUE_DYED_POLISHED_DIORITE_PICKAXE, LIGHT_BLUE_DYED_POLISHED_DIORITE_AXE, LIGHT_BLUE_DYED_POLISHED_DIORITE_SHOVEL, LIGHT_BLUE_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_DIORITE_SWORD, MAGENTA_DYED_POLISHED_DIORITE_PICKAXE, MAGENTA_DYED_POLISHED_DIORITE_AXE, MAGENTA_DYED_POLISHED_DIORITE_SHOVEL, MAGENTA_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_DIORITE_SWORD, PINK_DYED_POLISHED_DIORITE_PICKAXE, PINK_DYED_POLISHED_DIORITE_AXE, PINK_DYED_POLISHED_DIORITE_SHOVEL, PINK_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_DIORITE_SWORD, WHITE_DYED_POLISHED_DIORITE_PICKAXE, WHITE_DYED_POLISHED_DIORITE_AXE, WHITE_DYED_POLISHED_DIORITE_SHOVEL, WHITE_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_DIORITE_SWORD, GRAY_DYED_POLISHED_DIORITE_PICKAXE, GRAY_DYED_POLISHED_DIORITE_AXE, GRAY_DYED_POLISHED_DIORITE_SHOVEL, GRAY_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_DIORITE_SWORD, RED_DYED_POLISHED_DIORITE_PICKAXE, RED_DYED_POLISHED_DIORITE_AXE, RED_DYED_POLISHED_DIORITE_SHOVEL, RED_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_DIORITE_SWORD, BROWN_DYED_POLISHED_DIORITE_PICKAXE, BROWN_DYED_POLISHED_DIORITE_AXE, BROWN_DYED_POLISHED_DIORITE_SHOVEL, BROWN_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_DIORITE_SWORD, CYAN_DYED_POLISHED_DIORITE_PICKAXE, CYAN_DYED_POLISHED_DIORITE_AXE, CYAN_DYED_POLISHED_DIORITE_SHOVEL, CYAN_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_DIORITE_SWORD, PURPLE_DYED_POLISHED_DIORITE_PICKAXE, PURPLE_DYED_POLISHED_DIORITE_AXE, PURPLE_DYED_POLISHED_DIORITE_SHOVEL, PURPLE_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_DIORITE_SWORD, SILVER_DYED_POLISHED_DIORITE_PICKAXE, SILVER_DYED_POLISHED_DIORITE_AXE, SILVER_DYED_POLISHED_DIORITE_SHOVEL, SILVER_DYED_POLISHED_DIORITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_DIORITE_SWORD, LIME_DYED_POLISHED_DIORITE_PICKAXE, LIME_DYED_POLISHED_DIORITE_AXE, LIME_DYED_POLISHED_DIORITE_SHOVEL, LIME_DYED_POLISHED_DIORITE_HOE);


            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_ANDESITE_SWORD, BLACK_DYED_ANDESITE_PICKAXE, BLACK_DYED_ANDESITE_AXE, BLACK_DYED_ANDESITE_SHOVEL, BLACK_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_ANDESITE_SWORD, ORANGE_DYED_ANDESITE_PICKAXE, ORANGE_DYED_ANDESITE_AXE, ORANGE_DYED_ANDESITE_SHOVEL, ORANGE_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_ANDESITE_SWORD, YELLOW_DYED_ANDESITE_PICKAXE, YELLOW_DYED_ANDESITE_AXE, YELLOW_DYED_ANDESITE_SHOVEL, YELLOW_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_ANDESITE_SWORD, GREEN_DYED_ANDESITE_PICKAXE, GREEN_DYED_ANDESITE_AXE, GREEN_DYED_ANDESITE_SHOVEL, GREEN_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_ANDESITE_SWORD, BLUE_DYED_ANDESITE_PICKAXE, BLUE_DYED_ANDESITE_AXE, BLUE_DYED_ANDESITE_SHOVEL, BLUE_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_ANDESITE_SWORD, LIGHT_BLUE_DYED_ANDESITE_PICKAXE, LIGHT_BLUE_DYED_ANDESITE_AXE, LIGHT_BLUE_DYED_ANDESITE_SHOVEL, LIGHT_BLUE_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_ANDESITE_SWORD, MAGENTA_DYED_ANDESITE_PICKAXE, MAGENTA_DYED_ANDESITE_AXE, MAGENTA_DYED_ANDESITE_SHOVEL, MAGENTA_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_ANDESITE_SWORD, PINK_DYED_ANDESITE_PICKAXE, PINK_DYED_ANDESITE_AXE, PINK_DYED_ANDESITE_SHOVEL, PINK_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_ANDESITE_SWORD, WHITE_DYED_ANDESITE_PICKAXE, WHITE_DYED_ANDESITE_AXE, WHITE_DYED_ANDESITE_SHOVEL, WHITE_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_ANDESITE_SWORD, GRAY_DYED_ANDESITE_PICKAXE, GRAY_DYED_ANDESITE_AXE, GRAY_DYED_ANDESITE_SHOVEL, GRAY_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_ANDESITE_SWORD, RED_DYED_ANDESITE_PICKAXE, RED_DYED_ANDESITE_AXE, RED_DYED_ANDESITE_SHOVEL, RED_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_ANDESITE_SWORD, BROWN_DYED_ANDESITE_PICKAXE, BROWN_DYED_ANDESITE_AXE, BROWN_DYED_ANDESITE_SHOVEL, BROWN_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_ANDESITE_SWORD, CYAN_DYED_ANDESITE_PICKAXE, CYAN_DYED_ANDESITE_AXE, CYAN_DYED_ANDESITE_SHOVEL, CYAN_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_ANDESITE_SWORD, PURPLE_DYED_ANDESITE_PICKAXE, PURPLE_DYED_ANDESITE_AXE, PURPLE_DYED_ANDESITE_SHOVEL, PURPLE_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_ANDESITE_SWORD, SILVER_DYED_ANDESITE_PICKAXE, SILVER_DYED_ANDESITE_AXE, SILVER_DYED_ANDESITE_SHOVEL, SILVER_DYED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_ANDESITE_SWORD, LIME_DYED_ANDESITE_PICKAXE, LIME_DYED_ANDESITE_AXE, LIME_DYED_ANDESITE_SHOVEL, LIME_DYED_ANDESITE_HOE);

            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_ANDESITE_SWORD, BLACK_DYED_POLISHED_ANDESITE_PICKAXE, BLACK_DYED_POLISHED_ANDESITE_AXE, BLACK_DYED_POLISHED_ANDESITE_SHOVEL, BLACK_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_ANDESITE_SWORD, ORANGE_DYED_POLISHED_ANDESITE_PICKAXE, ORANGE_DYED_POLISHED_ANDESITE_AXE, ORANGE_DYED_POLISHED_ANDESITE_SHOVEL, ORANGE_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_ANDESITE_SWORD, YELLOW_DYED_POLISHED_ANDESITE_PICKAXE, YELLOW_DYED_POLISHED_ANDESITE_AXE, YELLOW_DYED_POLISHED_ANDESITE_SHOVEL, YELLOW_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_ANDESITE_SWORD, GREEN_DYED_POLISHED_ANDESITE_PICKAXE, GREEN_DYED_POLISHED_ANDESITE_AXE, GREEN_DYED_POLISHED_ANDESITE_SHOVEL, GREEN_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_ANDESITE_SWORD, BLUE_DYED_POLISHED_ANDESITE_PICKAXE, BLUE_DYED_POLISHED_ANDESITE_AXE, BLUE_DYED_POLISHED_ANDESITE_SHOVEL, BLUE_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_ANDESITE_SWORD, LIGHT_BLUE_DYED_POLISHED_ANDESITE_PICKAXE, LIGHT_BLUE_DYED_POLISHED_ANDESITE_AXE, LIGHT_BLUE_DYED_POLISHED_ANDESITE_SHOVEL, LIGHT_BLUE_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_ANDESITE_SWORD, MAGENTA_DYED_POLISHED_ANDESITE_PICKAXE, MAGENTA_DYED_POLISHED_ANDESITE_AXE, MAGENTA_DYED_POLISHED_ANDESITE_SHOVEL, MAGENTA_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_ANDESITE_SWORD, PINK_DYED_POLISHED_ANDESITE_PICKAXE, PINK_DYED_POLISHED_ANDESITE_AXE, PINK_DYED_POLISHED_ANDESITE_SHOVEL, PINK_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_ANDESITE_SWORD, WHITE_DYED_POLISHED_ANDESITE_PICKAXE, WHITE_DYED_POLISHED_ANDESITE_AXE, WHITE_DYED_POLISHED_ANDESITE_SHOVEL, WHITE_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_ANDESITE_SWORD, GRAY_DYED_POLISHED_ANDESITE_PICKAXE, GRAY_DYED_POLISHED_ANDESITE_AXE, GRAY_DYED_POLISHED_ANDESITE_SHOVEL, GRAY_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_ANDESITE_SWORD, RED_DYED_POLISHED_ANDESITE_PICKAXE, RED_DYED_POLISHED_ANDESITE_AXE, RED_DYED_POLISHED_ANDESITE_SHOVEL, RED_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_ANDESITE_SWORD, BROWN_DYED_POLISHED_ANDESITE_PICKAXE, BROWN_DYED_POLISHED_ANDESITE_AXE, BROWN_DYED_POLISHED_ANDESITE_SHOVEL, BROWN_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_ANDESITE_SWORD, CYAN_DYED_POLISHED_ANDESITE_PICKAXE, CYAN_DYED_POLISHED_ANDESITE_AXE, CYAN_DYED_POLISHED_ANDESITE_SHOVEL, CYAN_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_ANDESITE_SWORD, PURPLE_DYED_POLISHED_ANDESITE_PICKAXE, PURPLE_DYED_POLISHED_ANDESITE_AXE, PURPLE_DYED_POLISHED_ANDESITE_SHOVEL, PURPLE_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_ANDESITE_SWORD, SILVER_DYED_POLISHED_ANDESITE_PICKAXE, SILVER_DYED_POLISHED_ANDESITE_AXE, SILVER_DYED_POLISHED_ANDESITE_SHOVEL, SILVER_DYED_POLISHED_ANDESITE_HOE);
            registerToolRecipes(IgneousBlocks.DYED_SMOOTH_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_ANDESITE_SWORD, LIME_DYED_POLISHED_ANDESITE_PICKAXE, LIME_DYED_POLISHED_ANDESITE_AXE, LIME_DYED_POLISHED_ANDESITE_SHOVEL, LIME_DYED_POLISHED_ANDESITE_HOE);
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


        GameRegistry.addShapedRecipe(new ItemStack(sword, 1), " B ", " B ", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		GameRegistry.addShapedRecipe(new ItemStack(pickaxe, 1), "BBB", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //pickaxe
		GameRegistry.addShapedRecipe(new ItemStack(axe, 1), "BB ", "BS ", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		GameRegistry.addShapedRecipe(new ItemStack(axe, 1), " BB", " SB", " S ", 'S', Items.STICK, 'B', baseBlockStack);
		GameRegistry.addShapedRecipe(new ItemStack(shovel, 1), " B ", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //shovel
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), " BB", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //hoe
		GameRegistry.addShapedRecipe(new ItemStack(hoe, 1), "BB ", " S ", " S ", 'S', Items.STICK, 'B', baseBlockStack); //hoe flipped

		IgneousExtrasMod.REGISTERED_RECIPES += 7;
	}
}
