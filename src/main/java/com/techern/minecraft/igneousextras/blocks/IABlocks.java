package com.techern.minecraft.igneousextras.blocks;

import com.techern.minecraft.IgneousExtrasMod;
import com.techern.minecraft.igneousextras.blocks.redstone.BlockBasicLever;
import com.techern.minecraft.igneousextras.ConfigHandler;
import com.techern.minecraft.igneousextras.blocks.redstone.BlockBasicPressurePlate;
import com.techern.minecraft.igneousextras.blocks.stairs.BaseBlockStairs;
import com.techern.minecraft.igneousextras.blocks.stairs.ColoredBlockStairs;
import com.techern.minecraft.igneousextras.items.ItemColoredBlock;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * A class that contains every {@link net.minecraft.block.Block} added by the {@link com.techern.minecraft.IgneousExtrasMod}
 *
 * @since 0.0.1
 */
public class IABlocks {

    /**
     * The {@link CreativeTabs} for dyed blocks
     *
     * @since 0.0.1
     */
    public static CreativeTabs DYED_BLOCKS_TAB = new CreativeTabs("dyed_blocks") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(DYED_COBBLESTONE);
        }
    };

    /**
     * The {@link CreativeTabs} for igneous stairs
     *
     * @since 0.0.1
     */
    public static CreativeTabs STAIRS_TAB = new CreativeTabs("igneous_stairs") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(GRANITE_STAIRS);
        }
    };

    /**
     * The {@link CreativeTabs} for dyed igneous stirs
     *
     * @since 0.0.1
     */
    public static CreativeTabs DYED_STAIRS_TAB = new CreativeTabs("dyed_igneous_stairs") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(WHITE_DYED_COBBLESTONE_STAIRS);
        }
    };

    /**
     * A {@link BlockColored} defining a {@link BlockDyedCobblestone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_COBBLESTONE = new BlockDyedCobblestone();

    /**
     * A {@link BlockColored} defining a mossy cobblestone {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_MOSSY_COBBLESTONE = new BlockDyedStone("dyed_mossy_cobblestone");

    /**
     * A {@link BlockColored} defining a {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_STONE = new BlockDyedStone("dyed_stone");

    /**
     * A {@link BlockColored} defining a granite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_GRANITE = new BlockDyedStone("dyed_granite");

    /**
     * A {@link BlockColored} defining a smooth granite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_GRANITE = new BlockDyedStone("dyed_smooth_granite");

    /**
     * A {@link BlockColored} defining a diorite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_DIORITE = new BlockDyedStone("dyed_diorite");

    /**
     * A {@link BlockColored} defining a smooth diorite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_DIORITE = new BlockDyedStone("dyed_smooth_diorite");

    /**
     * A {@link BlockColored} defining an andesite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_ANDESITE = new BlockDyedStone("dyed_andesite");

    /**
     * A {@link BlockColored} defining a smooth andesite {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_ANDESITE = new BlockDyedStone("dyed_smooth_andesite");

    /**
     * A {@link BlockStairs} defining stone stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs STONE_STAIRS = new BaseBlockStairs(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.STONE), "stone_stairs");

    /**
     * A {@link BlockStairs} defining mossy cobblestone stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs MOSSY_COBBLESTONE_STAIRS = new BaseBlockStairs(Blocks.mossy_cobblestone.getDefaultState(), "mossy_cobblestone_stairs");

    /**
     * A {@link BlockStairs} defining granite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs GRANITE_STAIRS = new BaseBlockStairs(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), "granite_stairs");

    /**
     * A {@link BlockStairs} defining polished granite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs POLISHED_GRANITE_STAIRS = new BaseBlockStairs(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE_SMOOTH), "polished_granite_stairs");

    /**
     * A {@link BlockStairs} defining diorite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs DIORITE_STAIRS = new BaseBlockStairs(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), "diorite_stairs");

    /**
     * A {@link BlockStairs} defining polished diorite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs POLISHED_DIORITE_STAIRS = new BaseBlockStairs(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE_SMOOTH), "polished_diorite_stairs");

    /**
     * A {@link BlockStairs} defining andesite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs ANDESITE_STAIRS = new BaseBlockStairs(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), "andesite_stairs");

    /**
     * A {@link BlockStairs} defining polished andesite stairs
     *
     * @since 0.0.1
     */
    public static BlockStairs POLISHED_ANDESITE_STAIRS = new BaseBlockStairs(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE_SMOOTH), "polished_andesite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIME), "lime_dyed_cobblestone_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLACK), "black_dyed_cobblestone_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLUE), "blue_dyed_cobblestone_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BROWN), "brown_dyed_cobblestone_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_cobblestone_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GRAY), "gray_dyed_cobblestone_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GREEN), "green_dyed_cobblestone_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_cobblestone_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_cobblestone_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_cobblestone_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PINK), "pink_dyed_cobblestone_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_cobblestone_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.RED), "red_dyed_cobblestone_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.SILVER), "silver_dyed_cobblestone_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.WHITE), "white_dyed_cobblestone_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_cobblestone_stairs");


    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIME), "lime_dyed_mossy_cobblestone_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLACK), "black_dyed_mossy_cobblestone_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLUE), "blue_dyed_mossy_cobblestone_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BROWN), "brown_dyed_mossy_cobblestone_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_mossy_cobblestone_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GRAY), "gray_dyed_mossy_cobblestone_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GREEN), "green_dyed_mossy_cobblestone_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_mossy_cobblestone_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_mossy_cobblestone_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_mossy_cobblestone_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PINK), "pink_dyed_mossy_cobblestone_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_mossy_cobblestone_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.RED), "red_dyed_mossy_cobblestone_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.SILVER), "silver_dyed_mossy_cobblestone_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.WHITE), "white_dyed_mossy_cobblestone_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS = new ColoredBlockStairs(DYED_MOSSY_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_mossy_cobblestone_stairs");


    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_stone_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_stone_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_stone_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_stone_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_stone_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_stone_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_stone_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_stone_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_stone_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_stone_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_stone_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_stone_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_stone_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_stone_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_stone_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_STONE_STAIRS = new ColoredBlockStairs(DYED_STONE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_stone_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_andesite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_andesite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_andesite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_andesite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_andesite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_andesite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_andesite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_andesite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_andesite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_andesite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_andesite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_andesite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_andesite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_andesite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_andesite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_andesite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_diorite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_diorite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_diorite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_diorite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_diorite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_diorite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_diorite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_diorite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_diorite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_diorite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_diorite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_diorite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_diorite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_diorite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_diorite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_diorite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_granite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_granite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_granite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_granite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_granite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_granite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_granite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_granite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_granite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_granite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_granite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_granite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_granite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_granite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_granite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_granite_stairs");


    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_polished_andesite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_polished_andesite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_polished_andesite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_polished_andesite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_polished_andesite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_polished_andesite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_polished_andesite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_polished_andesite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_polished_andesite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_polished_andesite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_polished_andesite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_polished_andesite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_polished_andesite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_polished_andesite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_polished_andesite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_POLISHED_ANDESITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_ANDESITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_polished_andesite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_polished_diorite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_polished_diorite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_polished_diorite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_polished_diorite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_polished_diorite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_polished_diorite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_polished_diorite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_polished_diorite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_polished_diorite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_polished_diorite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_polished_diorite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_polished_diorite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_polished_diorite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_polished_diorite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_polished_diorite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_POLISHED_DIORITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_DIORITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_polished_diorite_stairs");

    /**
     * Lime coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIME_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIME), "lime_dyed_polished_granite_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLACK), "black_dyed_polished_granite_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BLUE), "blue_dyed_polished_granite_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.BROWN), "brown_dyed_polished_granite_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_polished_granite_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GRAY), "gray_dyed_polished_granite_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.GREEN), "green_dyed_polished_granite_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_polished_granite_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_polished_granite_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_polished_granite_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PINK), "pink_dyed_polished_granite_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_polished_granite_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.RED), "red_dyed_polished_granite_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.SILVER), "silver_dyed_polished_granite_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.WHITE), "white_dyed_polished_granite_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_POLISHED_GRANITE_STAIRS = new ColoredBlockStairs(DYED_SMOOTH_GRANITE.getDefaultState().withProperty(BlockDyedStone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_polished_granite_stairs");

    /**
     * A granite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "granite_pressure_plate");

    /**
     * A polished granite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_GRANITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "polished_granite_pressure_plate");

    /**
     * A diorite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "diorite_pressure_plate");

    /**
     * A polished diorite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_DIORITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "polished_diorite_pressure_plate");

    /**
     * A andesite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "andesite_pressure_plate");

    /**
     * A polished andesite {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_ANDESITE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "polished_andesite_pressure_plate");

    /**
     * A cobblestone {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "cobblestone_pressure_plate");

    /**
     * A mossy cobblestone {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_COBBLESTONE_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "mossy_cobblestone_pressure_plate");

    /**
     * A stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "stone_brick_pressure_plate");

    /**
     * A cracked stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block CRACKED_STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "cracked_stone_brick_pressure_plate");

    /**
     * A chiseled stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block CHISELED_STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "chiseled_stone_brick_pressure_plate");

    /**
     * A mossy stone brick {@link BlockBasicPressurePlate}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_STONE_BRICK_PRESSURE_PLATE = new BlockBasicPressurePlate(Material.rock, BlockPressurePlate.Sensitivity.EVERYTHING, "mossy_stone_brick_pressure_plate");

    /**
     * A granite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block GRANITE_LEVER = new BlockBasicLever("granite_lever");

    /**
     * A polished granite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_GRANITE_LEVER = new BlockBasicLever("polished_granite_lever");
    
    /**
     * A diorite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block DIORITE_LEVER = new BlockBasicLever("diorite_lever");

    /**
     * A polished diorite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_DIORITE_LEVER = new BlockBasicLever("polished_diorite_lever");

    /**
     * A andesite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block ANDESITE_LEVER = new BlockBasicLever("andesite_lever");

    /**
     * A polished andesite {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block POLISHED_ANDESITE_LEVER = new BlockBasicLever("polished_andesite_lever");

    /**
     * A mossy cobblestone {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_COBBLESTONE_LEVER = new BlockBasicLever("mossy_cobblestone_lever");

    /**
     * A stone {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block STONE_LEVER = new BlockBasicLever("stone_lever");

    /**
     * A stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block STONE_BRICK_LEVER = new BlockBasicLever("stone_brick_lever");

    /**
     * A chiseled stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block CHISELED_STONE_BRICK_LEVER = new BlockBasicLever("chiseled_stone_brick_lever");

    /**
     * A cracked stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block CRACKED_STONE_BRICK_LEVER = new BlockBasicLever("cracked_stone_brick_lever");

    /**
     * A mossy stone brick {@link BlockBasicLever}
     *
     * @since 0.0.2
     */
    public static Block MOSSY_STONE_BRICK_LEVER = new BlockBasicLever("mossy_stone_brick_lever");


    /**
     * Registers the {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
	public static void registerBlocks() {

        //First, we'll register dyed blocks
        if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
            registerColoredBlock(DYED_COBBLESTONE);
            registerColoredBlock(DYED_MOSSY_COBBLESTONE);
            registerColoredBlock(DYED_STONE);
            registerColoredBlock(DYED_GRANITE);
            registerColoredBlock(DYED_SMOOTH_GRANITE);
            registerColoredBlock(DYED_DIORITE);
            registerColoredBlock(DYED_SMOOTH_DIORITE);
            registerColoredBlock(DYED_ANDESITE);
            registerColoredBlock(DYED_SMOOTH_ANDESITE);
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_STAIRS) {
            registerSimpleBlock(STONE_STAIRS);
            registerSimpleBlock(MOSSY_COBBLESTONE_STAIRS);
            registerSimpleBlock(GRANITE_STAIRS);
            registerSimpleBlock(POLISHED_GRANITE_STAIRS);
            registerSimpleBlock(DIORITE_STAIRS);
            registerSimpleBlock(POLISHED_DIORITE_STAIRS);
            registerSimpleBlock(ANDESITE_STAIRS);
            registerSimpleBlock(POLISHED_ANDESITE_STAIRS);

            //Okay, dyed blocks now!
            if (ConfigHandler.ENABLE_DYED_STONE_STAIRS) {
                registerSimpleBlock(WHITE_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(LIME_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(PINK_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(GRAY_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(SILVER_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(CYAN_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(BLUE_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(BROWN_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(GREEN_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(RED_DYED_COBBLESTONE_STAIRS);
                registerSimpleBlock(BLACK_DYED_COBBLESTONE_STAIRS);


                registerSimpleBlock(WHITE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(LIME_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(PINK_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(GRAY_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(SILVER_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(CYAN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(BLUE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(BROWN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(GREEN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(RED_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerSimpleBlock(BLACK_DYED_MOSSY_COBBLESTONE_STAIRS);


                registerSimpleBlock(WHITE_DYED_STONE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_STONE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_STONE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_STONE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_STONE_STAIRS);
                registerSimpleBlock(LIME_DYED_STONE_STAIRS);
                registerSimpleBlock(PINK_DYED_STONE_STAIRS);
                registerSimpleBlock(GRAY_DYED_STONE_STAIRS);
                registerSimpleBlock(SILVER_DYED_STONE_STAIRS);
                registerSimpleBlock(CYAN_DYED_STONE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_STONE_STAIRS);
                registerSimpleBlock(BLUE_DYED_STONE_STAIRS);
                registerSimpleBlock(BROWN_DYED_STONE_STAIRS);
                registerSimpleBlock(GREEN_DYED_STONE_STAIRS);
                registerSimpleBlock(RED_DYED_STONE_STAIRS);
                registerSimpleBlock(BLACK_DYED_STONE_STAIRS);

                //Ugh


                registerSimpleBlock(WHITE_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(LIME_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(PINK_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(GRAY_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(SILVER_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(CYAN_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(BLUE_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(BROWN_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(GREEN_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(RED_DYED_ANDESITE_STAIRS);
                registerSimpleBlock(BLACK_DYED_ANDESITE_STAIRS);


                registerSimpleBlock(WHITE_DYED_DIORITE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_DIORITE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_DIORITE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_DIORITE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_DIORITE_STAIRS);
                registerSimpleBlock(LIME_DYED_DIORITE_STAIRS);
                registerSimpleBlock(PINK_DYED_DIORITE_STAIRS);
                registerSimpleBlock(GRAY_DYED_DIORITE_STAIRS);
                registerSimpleBlock(SILVER_DYED_DIORITE_STAIRS);
                registerSimpleBlock(CYAN_DYED_DIORITE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_DIORITE_STAIRS);
                registerSimpleBlock(BLUE_DYED_DIORITE_STAIRS);
                registerSimpleBlock(BROWN_DYED_DIORITE_STAIRS);
                registerSimpleBlock(GREEN_DYED_DIORITE_STAIRS);
                registerSimpleBlock(RED_DYED_DIORITE_STAIRS);
                registerSimpleBlock(BLACK_DYED_DIORITE_STAIRS);


                registerSimpleBlock(WHITE_DYED_GRANITE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_GRANITE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_GRANITE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_GRANITE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_GRANITE_STAIRS);
                registerSimpleBlock(LIME_DYED_GRANITE_STAIRS);
                registerSimpleBlock(PINK_DYED_GRANITE_STAIRS);
                registerSimpleBlock(GRAY_DYED_GRANITE_STAIRS);
                registerSimpleBlock(SILVER_DYED_GRANITE_STAIRS);
                registerSimpleBlock(CYAN_DYED_GRANITE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_GRANITE_STAIRS);
                registerSimpleBlock(BLUE_DYED_GRANITE_STAIRS);
                registerSimpleBlock(BROWN_DYED_GRANITE_STAIRS);
                registerSimpleBlock(GREEN_DYED_GRANITE_STAIRS);
                registerSimpleBlock(RED_DYED_GRANITE_STAIRS);
                registerSimpleBlock(BLACK_DYED_GRANITE_STAIRS);

                registerSimpleBlock(WHITE_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(LIME_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(PINK_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(GRAY_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(SILVER_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(CYAN_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(BLUE_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(BROWN_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(GREEN_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(RED_DYED_POLISHED_ANDESITE_STAIRS);
                registerSimpleBlock(BLACK_DYED_POLISHED_ANDESITE_STAIRS);


                registerSimpleBlock(WHITE_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(LIME_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(PINK_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(GRAY_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(SILVER_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(CYAN_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(BLUE_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(BROWN_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(GREEN_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(RED_DYED_POLISHED_DIORITE_STAIRS);
                registerSimpleBlock(BLACK_DYED_POLISHED_DIORITE_STAIRS);


                registerSimpleBlock(WHITE_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(ORANGE_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(MAGENTA_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(YELLOW_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(LIME_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(PINK_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(GRAY_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(SILVER_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(CYAN_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(PURPLE_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(BLUE_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(BROWN_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(GREEN_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(RED_DYED_POLISHED_GRANITE_STAIRS);
                registerSimpleBlock(BLACK_DYED_POLISHED_GRANITE_STAIRS);
            }
        }

        //Now register pressure plates

        if (ConfigHandler.ENABLE_ADDITIONAL_PRESSURE_PLATES) {
            registerSimpleBlock(COBBLESTONE_PRESSURE_PLATE);
            registerSimpleBlock(MOSSY_COBBLESTONE_PRESSURE_PLATE);
            registerSimpleBlock(GRANITE_PRESSURE_PLATE);
            registerSimpleBlock(POLISHED_GRANITE_PRESSURE_PLATE);
            registerSimpleBlock(DIORITE_PRESSURE_PLATE);
            registerSimpleBlock(POLISHED_DIORITE_PRESSURE_PLATE);
            registerSimpleBlock(ANDESITE_PRESSURE_PLATE);
            registerSimpleBlock(POLISHED_ANDESITE_PRESSURE_PLATE);

            registerSimpleBlock(STONE_BRICK_PRESSURE_PLATE);
            registerSimpleBlock(CRACKED_STONE_BRICK_PRESSURE_PLATE);
            registerSimpleBlock(CHISELED_STONE_BRICK_PRESSURE_PLATE);
            registerSimpleBlock(MOSSY_STONE_BRICK_PRESSURE_PLATE);
        }

        //Now register levers

        if (ConfigHandler.ENABLE_ADDITIONAL_LEVERS) {

            registerSimpleBlock(STONE_LEVER); //GameRegistry.register(STONE_LEVER.setRegistryName("StoneLever");
            registerSimpleBlock(GRANITE_LEVER);
            registerSimpleBlock(POLISHED_GRANITE_LEVER);
            registerSimpleBlock(DIORITE_LEVER);
            registerSimpleBlock(POLISHED_DIORITE_LEVER);
            registerSimpleBlock(ANDESITE_LEVER);
            registerSimpleBlock(POLISHED_ANDESITE_LEVER);

            registerSimpleBlock(MOSSY_COBBLESTONE_LEVER);

            registerSimpleBlock(STONE_BRICK_LEVER);
            registerSimpleBlock(CHISELED_STONE_BRICK_LEVER);
            registerSimpleBlock(CRACKED_STONE_BRICK_LEVER);
            registerSimpleBlock(MOSSY_STONE_BRICK_LEVER);

        }

        if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
            //Now we register meshes for coloured blocks in this loop
            for (EnumDyeColor color : EnumDyeColor.values()) {

                //Start off with dyed cobblestone
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_COBBLESTONE), color.getMetadata(), "dyed_cobblestone", "color=" + color.getName());

                //Then dyed mossy cobblestone
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_MOSSY_COBBLESTONE), color.getMetadata(), "dyed_mossy_cobblestone", "color=" + color.getName());

                //Then dyed stone
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_STONE), color.getMetadata(), "dyed_stone", "color=" + color.getName());

                //Then dyed granite
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_GRANITE), color.getMetadata(), "dyed_granite", "color=" + color.getName());
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_SMOOTH_GRANITE), color.getMetadata(), "dyed_smooth_granite", "color=" + color.getName());

                //Then dyed diorite
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_DIORITE), color.getMetadata(), "dyed_diorite", "color=" + color.getName());
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_SMOOTH_DIORITE), color.getMetadata(), "dyed_smooth_diorite", "color=" + color.getName());

                //Then dyed andesite
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_ANDESITE), color.getMetadata(), "dyed_andesite", "color=" + color.getName());
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DYED_SMOOTH_ANDESITE), color.getMetadata(), "dyed_smooth_andesite", "color=" + color.getName());
            }
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_STAIRS) {
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_STAIRS), 0, "stone_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_COBBLESTONE_STAIRS), 0, "mossy_cobblestone_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRANITE_STAIRS), 0, "granite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_GRANITE_STAIRS), 0, "polished_granite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DIORITE_STAIRS), 0, "diorite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_DIORITE_STAIRS), 0, "polished_diorite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ANDESITE_STAIRS), 0, "andesite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_ANDESITE_STAIRS), 0, "polished_andesite_stairs", "inventory");

            //Now begin the dyed versions
            if (ConfigHandler.ENABLE_DYED_STONE_STAIRS) {
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_COBBLESTONE_STAIRS), 0, "white_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_COBBLESTONE_STAIRS), 0, "orange_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_COBBLESTONE_STAIRS), 0, "magenta_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_COBBLESTONE_STAIRS), 0, "light_blue_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_COBBLESTONE_STAIRS), 0, "yellow_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_COBBLESTONE_STAIRS), 0, "lime_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_COBBLESTONE_STAIRS), 0, "pink_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_COBBLESTONE_STAIRS), 0, "gray_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_COBBLESTONE_STAIRS), 0, "silver_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_COBBLESTONE_STAIRS), 0, "cyan_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_COBBLESTONE_STAIRS), 0, "purple_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_COBBLESTONE_STAIRS), 0, "blue_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_COBBLESTONE_STAIRS), 0, "brown_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_COBBLESTONE_STAIRS), 0, "green_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_COBBLESTONE_STAIRS), 0, "red_dyed_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_COBBLESTONE_STAIRS), 0, "black_dyed_cobblestone_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "white_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "orange_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "magenta_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "light_blue_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "yellow_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "lime_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "pink_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "gray_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "silver_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "cyan_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "purple_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "blue_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "brown_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "green_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "red_dyed_mossy_cobblestone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_MOSSY_COBBLESTONE_STAIRS), 0, "black_dyed_mossy_cobblestone_stairs", "inventory");


                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_STONE_STAIRS), 0, "white_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_STONE_STAIRS), 0, "orange_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_STONE_STAIRS), 0, "magenta_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_STONE_STAIRS), 0, "light_blue_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_STONE_STAIRS), 0, "yellow_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_STONE_STAIRS), 0, "lime_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_STONE_STAIRS), 0, "pink_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_STONE_STAIRS), 0, "gray_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_STONE_STAIRS), 0, "silver_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_STONE_STAIRS), 0, "cyan_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_STONE_STAIRS), 0, "purple_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_STONE_STAIRS), 0, "blue_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_STONE_STAIRS), 0, "brown_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_STONE_STAIRS), 0, "green_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_STONE_STAIRS), 0, "red_dyed_stone_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_STONE_STAIRS), 0, "black_dyed_stone_stairs", "inventory");

                //I repeat; ugh

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_ANDESITE_STAIRS), 0, "white_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_ANDESITE_STAIRS), 0, "orange_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_ANDESITE_STAIRS), 0, "magenta_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_ANDESITE_STAIRS), 0, "light_blue_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_ANDESITE_STAIRS), 0, "yellow_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_ANDESITE_STAIRS), 0, "lime_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_ANDESITE_STAIRS), 0, "pink_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_ANDESITE_STAIRS), 0, "gray_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_ANDESITE_STAIRS), 0, "silver_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_ANDESITE_STAIRS), 0, "cyan_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_ANDESITE_STAIRS), 0, "purple_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_ANDESITE_STAIRS), 0, "blue_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_ANDESITE_STAIRS), 0, "brown_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_ANDESITE_STAIRS), 0, "green_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_ANDESITE_STAIRS), 0, "red_dyed_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_ANDESITE_STAIRS), 0, "black_dyed_andesite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_DIORITE_STAIRS), 0, "white_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_DIORITE_STAIRS), 0, "orange_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_DIORITE_STAIRS), 0, "magenta_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_DIORITE_STAIRS), 0, "light_blue_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_DIORITE_STAIRS), 0, "yellow_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_DIORITE_STAIRS), 0, "lime_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_DIORITE_STAIRS), 0, "pink_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_DIORITE_STAIRS), 0, "gray_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_DIORITE_STAIRS), 0, "silver_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_DIORITE_STAIRS), 0, "cyan_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_DIORITE_STAIRS), 0, "purple_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_DIORITE_STAIRS), 0, "blue_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_DIORITE_STAIRS), 0, "brown_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_DIORITE_STAIRS), 0, "green_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_DIORITE_STAIRS), 0, "red_dyed_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_DIORITE_STAIRS), 0, "black_dyed_diorite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_GRANITE_STAIRS), 0, "white_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_GRANITE_STAIRS), 0, "orange_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_GRANITE_STAIRS), 0, "magenta_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_GRANITE_STAIRS), 0, "light_blue_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_GRANITE_STAIRS), 0, "yellow_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_GRANITE_STAIRS), 0, "lime_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_GRANITE_STAIRS), 0, "pink_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_GRANITE_STAIRS), 0, "gray_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_GRANITE_STAIRS), 0, "silver_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_GRANITE_STAIRS), 0, "cyan_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_GRANITE_STAIRS), 0, "purple_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_GRANITE_STAIRS), 0, "blue_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_GRANITE_STAIRS), 0, "brown_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_GRANITE_STAIRS), 0, "green_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_GRANITE_STAIRS), 0, "red_dyed_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_GRANITE_STAIRS), 0, "black_dyed_granite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_ANDESITE_STAIRS), 0, "white_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_ANDESITE_STAIRS), 0, "orange_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_ANDESITE_STAIRS), 0, "magenta_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS), 0, "light_blue_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_ANDESITE_STAIRS), 0, "yellow_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_ANDESITE_STAIRS), 0, "lime_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_ANDESITE_STAIRS), 0, "pink_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_ANDESITE_STAIRS), 0, "gray_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_ANDESITE_STAIRS), 0, "silver_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_ANDESITE_STAIRS), 0, "cyan_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_ANDESITE_STAIRS), 0, "purple_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_ANDESITE_STAIRS), 0, "blue_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_ANDESITE_STAIRS), 0, "brown_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_ANDESITE_STAIRS), 0, "green_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_ANDESITE_STAIRS), 0, "red_dyed_polished_andesite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_ANDESITE_STAIRS), 0, "black_dyed_polished_andesite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_DIORITE_STAIRS), 0, "white_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_DIORITE_STAIRS), 0, "orange_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_DIORITE_STAIRS), 0, "magenta_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS), 0, "light_blue_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_DIORITE_STAIRS), 0, "yellow_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_DIORITE_STAIRS), 0, "lime_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_DIORITE_STAIRS), 0, "pink_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_DIORITE_STAIRS), 0, "gray_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_DIORITE_STAIRS), 0, "silver_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_DIORITE_STAIRS), 0, "cyan_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_DIORITE_STAIRS), 0, "purple_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_DIORITE_STAIRS), 0, "blue_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_DIORITE_STAIRS), 0, "brown_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_DIORITE_STAIRS), 0, "green_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_DIORITE_STAIRS), 0, "red_dyed_polished_diorite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_DIORITE_STAIRS), 0, "black_dyed_polished_diorite_stairs", "inventory");

                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(WHITE_DYED_POLISHED_GRANITE_STAIRS), 0, "white_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ORANGE_DYED_POLISHED_GRANITE_STAIRS), 0, "orange_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MAGENTA_DYED_POLISHED_GRANITE_STAIRS), 0, "magenta_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS), 0, "light_blue_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(YELLOW_DYED_POLISHED_GRANITE_STAIRS), 0, "yellow_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(LIME_DYED_POLISHED_GRANITE_STAIRS), 0, "lime_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PINK_DYED_POLISHED_GRANITE_STAIRS), 0, "pink_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRAY_DYED_POLISHED_GRANITE_STAIRS), 0, "gray_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(SILVER_DYED_POLISHED_GRANITE_STAIRS), 0, "silver_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CYAN_DYED_POLISHED_GRANITE_STAIRS), 0, "cyan_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(PURPLE_DYED_POLISHED_GRANITE_STAIRS), 0, "purple_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLUE_DYED_POLISHED_GRANITE_STAIRS), 0, "blue_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BROWN_DYED_POLISHED_GRANITE_STAIRS), 0, "brown_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GREEN_DYED_POLISHED_GRANITE_STAIRS), 0, "green_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(RED_DYED_POLISHED_GRANITE_STAIRS), 0, "red_dyed_polished_granite_stairs", "inventory");
                IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(BLACK_DYED_POLISHED_GRANITE_STAIRS), 0, "black_dyed_polished_granite_stairs", "inventory");
            }

        }

        if (ConfigHandler.ENABLE_ADDITIONAL_PRESSURE_PLATES) {
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(COBBLESTONE_PRESSURE_PLATE), 0, "cobblestone_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_COBBLESTONE_PRESSURE_PLATE), 0, "mossy_cobblestone_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRANITE_PRESSURE_PLATE), 0, "granite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_GRANITE_PRESSURE_PLATE), 0, "polished_granite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DIORITE_PRESSURE_PLATE), 0, "diorite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_DIORITE_PRESSURE_PLATE), 0, "polished_diorite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ANDESITE_PRESSURE_PLATE), 0, "andesite_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_ANDESITE_PRESSURE_PLATE), 0, "polished_andesite_pressure_plate", "inventory");

            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_BRICK_PRESSURE_PLATE), 0, "stone_brick_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CHISELED_STONE_BRICK_PRESSURE_PLATE), 0, "chiseled_stone_brick_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CRACKED_STONE_BRICK_PRESSURE_PLATE), 0, "cracked_stone_brick_pressure_plate", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_STONE_BRICK_PRESSURE_PLATE), 0, "mossy_stone_brick_pressure_plate", "inventory");
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_LEVERS) {
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_LEVER), 0, "stone_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRANITE_LEVER), 0, "granite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_GRANITE_LEVER), 0, "polished_granite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DIORITE_LEVER), 0, "diorite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_DIORITE_LEVER), 0, "polished_diorite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ANDESITE_LEVER), 0, "andesite_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_ANDESITE_LEVER), 0, "polished_andesite_lever", "inventory");

            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_COBBLESTONE_LEVER), 0, "mossy_cobblestone_lever", "inventory");

            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_BRICK_LEVER), 0, "stone_brick_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CRACKED_STONE_BRICK_LEVER), 0, "cracked_stone_brick_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(CHISELED_STONE_BRICK_LEVER), 0, "chiseled_stone_brick_lever", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_STONE_BRICK_LEVER), 0, "mossy_stone_brick_lever", "inventory");
        }
    }

    /**
     * Registers recipes for {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
    public static void registerRecipes() {

        if (ConfigHandler.ENABLE_DYED_STONE_BLOCKS) {
            registerSingleDyeBlockRecipeCombination(Blocks.cobblestone, DYED_COBBLESTONE);
            registerSingleDyeBlockRecipeCombination(Blocks.mossy_cobblestone, DYED_MOSSY_COBBLESTONE);
            registerSingleDyeBlockRecipeCombination(Blocks.stone, 0, DYED_STONE);
            registerSingleDyeBlockRecipeCombination(Blocks.stone, 1, DYED_GRANITE);
            registerSingleDyeBlockRecipeCombination(Blocks.stone, 2, DYED_SMOOTH_GRANITE);
            registerSingleDyeBlockRecipeCombination(Blocks.stone, 3, DYED_DIORITE);
            registerSingleDyeBlockRecipeCombination(Blocks.stone, 4, DYED_SMOOTH_DIORITE);
            registerSingleDyeBlockRecipeCombination(Blocks.stone, 5, DYED_ANDESITE);
            registerSingleDyeBlockRecipeCombination(Blocks.stone, 6, DYED_SMOOTH_ANDESITE);
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_STAIRS) {
            registerStairsRecipe(Blocks.stone, 0, STONE_STAIRS);
            registerStairsRecipe(Blocks.mossy_cobblestone, 0, MOSSY_COBBLESTONE_STAIRS);
            registerStairsRecipe(Blocks.stone, 1, GRANITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 2, POLISHED_GRANITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 3, DIORITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 4, POLISHED_DIORITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 5, ANDESITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 6, POLISHED_ANDESITE_STAIRS);

            //Now dyed variants
            if (ConfigHandler.ENABLE_DYED_STONE_STAIRS) {
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_COBBLESTONE_STAIRS);
                
                
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.RED.getMetadata(), RED_DYED_MOSSY_COBBLESTONE_STAIRS);
                registerStairsRecipe(DYED_MOSSY_COBBLESTONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_MOSSY_COBBLESTONE_STAIRS);


                registerStairsRecipe(DYED_STONE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.RED.getMetadata(), RED_DYED_STONE_STAIRS);
                registerStairsRecipe(DYED_STONE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_STONE_STAIRS);

                //<h1>UGHHHHH</h1>
                //Maybe I should have skipped dyed stone... But oh well

                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_ANDESITE_STAIRS);

                
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_DIORITE_STAIRS);

                
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_GRANITE_STAIRS);

                
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_ANDESITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_ANDESITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_ANDESITE_STAIRS);

                
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_DIORITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_DIORITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_DIORITE_STAIRS);

                
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.WHITE.getMetadata(), WHITE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.ORANGE.getMetadata(), ORANGE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.MAGENTA.getMetadata(), MAGENTA_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIGHT_BLUE.getMetadata(), LIGHT_BLUE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.YELLOW.getMetadata(), YELLOW_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.LIME.getMetadata(), LIME_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PINK.getMetadata(), PINK_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GRAY.getMetadata(), GRAY_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.SILVER.getMetadata(), SILVER_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.CYAN.getMetadata(), CYAN_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.PURPLE.getMetadata(), PURPLE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLUE.getMetadata(), BLUE_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BROWN.getMetadata(), BROWN_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.GREEN.getMetadata(), GREEN_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.RED.getMetadata(), RED_DYED_POLISHED_GRANITE_STAIRS);
                registerStairsRecipe(DYED_SMOOTH_GRANITE, EnumDyeColor.BLACK.getMetadata(), BLACK_DYED_POLISHED_GRANITE_STAIRS);
            }

        }

        if (ConfigHandler.ENABLE_ADDITIONAL_PRESSURE_PLATES) {
            registerPressurePlateRecipe(Blocks.cobblestone, 0, COBBLESTONE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.mossy_cobblestone, 0, MOSSY_COBBLESTONE_PRESSURE_PLATE);

            registerPressurePlateRecipe(Blocks.stone, BlockStone.EnumType.GRANITE.getMetadata(), GRANITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata(), POLISHED_GRANITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stone, BlockStone.EnumType.ANDESITE.getMetadata(), ANDESITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata(), POLISHED_ANDESITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stone, BlockStone.EnumType.DIORITE.getMetadata(), DIORITE_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata(), POLISHED_DIORITE_PRESSURE_PLATE);

            registerPressurePlateRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.DEFAULT.getMetadata(), STONE_BRICK_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.CHISELED.getMetadata(), CHISELED_STONE_BRICK_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.CRACKED.getMetadata(), CRACKED_STONE_BRICK_PRESSURE_PLATE);
            registerPressurePlateRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.MOSSY.getMetadata(), MOSSY_STONE_BRICK_PRESSURE_PLATE);
        }

        if (ConfigHandler.ENABLE_ADDITIONAL_LEVERS) {
            registerLeverRecipe(Blocks.stone, BlockStone.EnumType.STONE.getMetadata(), STONE_LEVER);
            registerLeverRecipe(Blocks.stone, BlockStone.EnumType.GRANITE.getMetadata(), GRANITE_LEVER);
            registerLeverRecipe(Blocks.stone, BlockStone.EnumType.GRANITE_SMOOTH.getMetadata(), POLISHED_GRANITE_LEVER);
            registerLeverRecipe(Blocks.stone, BlockStone.EnumType.DIORITE.getMetadata(), DIORITE_LEVER);
            registerLeverRecipe(Blocks.stone, BlockStone.EnumType.DIORITE_SMOOTH.getMetadata(), POLISHED_DIORITE_LEVER);
            registerLeverRecipe(Blocks.stone, BlockStone.EnumType.ANDESITE.getMetadata(), ANDESITE_LEVER);
            registerLeverRecipe(Blocks.stone, BlockStone.EnumType.ANDESITE_SMOOTH.getMetadata(), POLISHED_ANDESITE_LEVER);

            registerLeverRecipe(Blocks.mossy_cobblestone, 0, MOSSY_COBBLESTONE_LEVER);

            registerLeverRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.DEFAULT.getMetadata(), STONE_BRICK_LEVER);
            registerLeverRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.CRACKED.getMetadata(), CRACKED_STONE_BRICK_LEVER);
            registerLeverRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.CHISELED.getMetadata(), CHISELED_STONE_BRICK_LEVER);
            registerLeverRecipe(Blocks.stonebrick, BlockStoneBrick.EnumType.MOSSY.getMetadata(), MOSSY_STONE_BRICK_LEVER);
        }

    }

    /**
     * Registers a {@link BlockStairs} recipe
     *
     * @param baseBlock The base block to be consumed
     * @param baseBlockMetadata The required metadata value of the base block
     * @param stairBlock The stair block to be returned
     * @since 0.0.1
     */
    public static void registerStairsRecipe(Block baseBlock, int baseBlockMetadata, Block stairBlock) {
        ItemStack input = new ItemStack(baseBlock, 1, baseBlockMetadata);
        ItemStack output = new ItemStack(stairBlock, 4, 0);

        GameRegistry.addShapedRecipe(output, "  I", " II", "III", 'I', input);
        GameRegistry.addShapedRecipe(output, "I  ", "II ", "III", 'I', input);
    }

    /**
     * Registers a {@link BlockPressurePlate} recipe
     *
     * @param baseBlock The base block to be consumed
     * @param baseBlockMetadata The required metadata value of the base block
     * @param plateBlock The plate block to be returned
     * @since 0.0.2
     */
    public static void registerPressurePlateRecipe(Block baseBlock, int baseBlockMetadata, Block plateBlock) {
        ItemStack input = new ItemStack(baseBlock, 1, baseBlockMetadata);
        ItemStack output = new ItemStack(plateBlock, 1, 0);

        GameRegistry.addShapedRecipe(output, "II", 'I', input);
    }

    /**
     * Registers a {@link BlockBasicLever} recipe
     *
     * @param baseBlock The base block to be consumed
     * @param baseBlockMetadata The required metadata value of the base block
     * @param leverBlock The lever block to be returned
     * @since 0.0.2
     */
    public static void registerLeverRecipe(Block baseBlock, int baseBlockMetadata, Block leverBlock) {
        ItemStack input = new ItemStack(baseBlock, 1, baseBlockMetadata);
        ItemStack output = new ItemStack(leverBlock, 1, 0);
        ItemStack stick = new ItemStack(Items.stick, 1);

        GameRegistry.addShapedRecipe(output, "S", "I", 'I', input, 'S', stick);
    }

    /**
     * Registers all dye variant recipes for a single input {@link Block}
     *
     * @param blockToConsume The {@link Block} to consume
     * @param blockToReturn The {@link Block} to return
     *
     * @since 0.0.1
     */
    public static void registerSingleDyeBlockRecipeCombination(Block blockToConsume, Block blockToReturn) {
        registerSingleDyeBlockRecipeCombination(blockToConsume, 0, blockToReturn);
    }

    /**
     * Registers all dye variant recipes for a single input {@link Block}
     *
     * @param blockToConsume The {@link Block} to consume
     * @param consumptionMetadata The metadata of the block being consumed
     * @param blockToReturn The {@link Block} to return
     *
     * @since 0.0.1
     */
    public static void registerSingleDyeBlockRecipeCombination(Block blockToConsume, int consumptionMetadata, Block blockToReturn) {
        ItemStack dye;
        ItemStack water = new ItemStack(Items.water_bucket, 1);
        for (EnumDyeColor color : EnumDyeColor.values()) {
            dye = new ItemStack(Items.dye, 1, color.getDyeDamage());

            ItemStack input = new ItemStack(blockToConsume, 1, consumptionMetadata);
            ItemStack output = new ItemStack(blockToReturn, 8, color.getMetadata());

            GameRegistry.addShapedRecipe(output, "III", "IDI", "III", 'I', input, 'D', dye);
            GameRegistry.addShapedRecipe(new ItemStack(blockToConsume, 8, consumptionMetadata),
                                         "OOO", "OWO", "OOO",
                                         'W', water, 'O', new ItemStack(blockToReturn, 1, color.getMetadata()));
        }
    }

    /**
     * Registers a simple {@link Block}
     *
     * TODO Add more variants as needed
     *
     * @param block The {@link Block} to register
     * @since 0.0.2
     */
    public static void registerSimpleBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    /**
     * Registers a colored {@link Block}
     *
     * @param block The {@link Block} to register
     * @since 0.0.2
     */
    public static void registerColoredBlock(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemColoredBlock(block).setRegistryName(block.getRegistryName()));
    }

}
