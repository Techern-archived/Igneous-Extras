package com.techern.minecraft.ia.blocks;

import com.techern.minecraft.IgneousExtrasMod;
import com.techern.minecraft.ia.blocks.stairs.BaseBlockStairs;
import com.techern.minecraft.ia.items.ItemColoredBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockStone;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * A class that contains every {@link net.minecraft.block.Block} added by the {@link com.techern.minecraft.IgneousExtrasMod}
 *
 * @since 0.0.1
 */
public class IABlocks {

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
     * A {@link BlockStairs} defining mossy cobblestonje stairs
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
    public static BlockStairs LIME_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIME), "lime_dyed_cobblestone_stairs");

    /**
     * Black coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLACK_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLACK), "black_dyed_cobblestone_stairs");

    /**
     * Blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BLUE_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BLUE), "blue_dyed_cobblestone_stairs");

    /**
     * Brown coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs BROWN_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.BROWN), "brown_dyed_cobblestone_stairs");

    /**
     * Cyan coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs CYAN_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.CYAN), "cyan_dyed_cobblestone_stairs");

    /**
     * Gray coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GRAY_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GRAY), "gray_dyed_cobblestone_stairs");

    /**
     * Green coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs GREEN_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.GREEN), "green_dyed_cobblestone_stairs");

    /**
     * Light blue coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs LIGHT_BLUE_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.LIGHT_BLUE), "light_blue_dyed_cobblestone_stairs");

    /**
     * Magenta coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs MAGENTA_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.MAGENTA), "magenta_dyed_cobblestone_stairs");

    /**
     * Orange coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs ORANGE_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.ORANGE), "orange_dyed_cobblestone_stairs");

    /**
     * Pink coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PINK_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PINK), "pink_dyed_cobblestone_stairs");

    /**
     * Purple coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs PURPLE_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.PURPLE), "purple_dyed_cobblestone_stairs");

    /**
     * Red coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs RED_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.RED), "red_dyed_cobblestone_stairs");

    /**
     * Silver coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs SILVER_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.SILVER), "silver_dyed_cobblestone_stairs");

    /**
     * White coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs WHITE_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.WHITE), "white_dyed_cobblestone_stairs");

    /**
     * Yellow coloured {@link BlockStairs}
     *
     * @since 0.0.1
     */
    public static BlockStairs YELLOW_DYED_COBBLESTONE_STAIRS = new BaseBlockStairs(DYED_COBBLESTONE.getDefaultState().withProperty(BlockDyedCobblestone.COLOR, EnumDyeColor.YELLOW), "yellow_dyed_cobblestone_stairs");

    /**
     * Registers the {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
    public static void registerBlocks() {

        //First, we'll register dyed blocks
        if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean()) {
            GameRegistry.registerBlock(DYED_COBBLESTONE, ItemColoredBlock.class, "dyed_cobblestone");
            GameRegistry.registerBlock(DYED_MOSSY_COBBLESTONE, ItemColoredBlock.class, "dyed_mossy_cobblestone");
            GameRegistry.registerBlock(DYED_STONE, ItemColoredBlock.class, "dyed_stone");
            GameRegistry.registerBlock(DYED_GRANITE, ItemColoredBlock.class, "dyed_granite");
            GameRegistry.registerBlock(DYED_SMOOTH_GRANITE, ItemColoredBlock.class, "dyed_smooth_granite");
            GameRegistry.registerBlock(DYED_DIORITE, ItemColoredBlock.class, "dyed_diorite");
            GameRegistry.registerBlock(DYED_SMOOTH_DIORITE, ItemColoredBlock.class, "dyed_smooth_diorite");
            GameRegistry.registerBlock(DYED_ANDESITE, ItemColoredBlock.class, "dyed_andesite");
            GameRegistry.registerBlock(DYED_SMOOTH_ANDESITE, ItemColoredBlock.class, "dyed_smooth_andesite");
        }

        if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean()) {

            GameRegistry.registerBlock(STONE_STAIRS, "stone_stairs");
            GameRegistry.registerBlock(MOSSY_COBBLESTONE_STAIRS, "mossy_cobblestone_stairs");
            GameRegistry.registerBlock(GRANITE_STAIRS, "granite_stairs");
            GameRegistry.registerBlock(POLISHED_GRANITE_STAIRS, "polished_granite_stairs");
            GameRegistry.registerBlock(DIORITE_STAIRS, "diorite_stairs");
            GameRegistry.registerBlock(POLISHED_DIORITE_STAIRS, "polished_diorite_stairs");
            GameRegistry.registerBlock(ANDESITE_STAIRS, "andesite_stairs");
            GameRegistry.registerBlock(POLISHED_ANDESITE_STAIRS, "polished_andesite_stairs");

            //Okay, dyed blocks now!
            if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean()) {

                GameRegistry.registerBlock(WHITE_DYED_COBBLESTONE_STAIRS, "white_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(ORANGE_DYED_COBBLESTONE_STAIRS, "orange_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(MAGENTA_DYED_COBBLESTONE_STAIRS, "magenta_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(LIGHT_BLUE_DYED_COBBLESTONE_STAIRS, "light_blue_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(YELLOW_DYED_COBBLESTONE_STAIRS, "yellow_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(LIME_DYED_COBBLESTONE_STAIRS, "lime_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(PINK_DYED_COBBLESTONE_STAIRS, "pink_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(GRAY_DYED_COBBLESTONE_STAIRS, "gray_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(SILVER_DYED_COBBLESTONE_STAIRS, "silver_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(CYAN_DYED_COBBLESTONE_STAIRS, "cyan_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(PURPLE_DYED_COBBLESTONE_STAIRS, "purple_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(BLUE_DYED_COBBLESTONE_STAIRS, "blue_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(BROWN_DYED_COBBLESTONE_STAIRS, "brown_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(GREEN_DYED_COBBLESTONE_STAIRS, "green_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(RED_DYED_COBBLESTONE_STAIRS, "red_dyed_cobblestone_stairs");
                GameRegistry.registerBlock(BLACK_DYED_COBBLESTONE_STAIRS, "black_dyed_cobblestone_stairs");

            }

        }

        //TODO: More here

        //TODO: Register normal block meshes here

        if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean()) {
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

        if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean()) {

            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(STONE_STAIRS), 0, "stone_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(MOSSY_COBBLESTONE_STAIRS), 0, "mossy_cobblestone_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(GRANITE_STAIRS), 0, "granite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_GRANITE_STAIRS), 0, "polished_granite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(DIORITE_STAIRS), 0, "diorite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_DIORITE_STAIRS), 0, "polished_diorite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(ANDESITE_STAIRS), 0, "andesite_stairs", "inventory");
            IgneousExtrasMod.PROXY.registerItemModelMesher(Item.getItemFromBlock(POLISHED_ANDESITE_STAIRS), 0, "polished_andesite_stairs", "inventory");

            //Now begin the dyed versions
            if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean()) {
                
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

            }

        }
    }

    /**
     * Registers recipes for {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
    public static void registerRecipes() {

        if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean()) {
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

        if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean()) {
            registerStairsRecipe(Blocks.stone, 0, STONE_STAIRS);
            registerStairsRecipe(Blocks.mossy_cobblestone, 0, MOSSY_COBBLESTONE_STAIRS);
            registerStairsRecipe(Blocks.stone, 1, GRANITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 2, POLISHED_GRANITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 3, DIORITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 4, POLISHED_DIORITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 5, ANDESITE_STAIRS);
            registerStairsRecipe(Blocks.stone, 6, POLISHED_ANDESITE_STAIRS);

            //Now dyed variants
            if (IgneousExtrasMod.CONFIGURATION.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean()) {
                
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

            }
        }

        //TODO: Add recipes for items second

    }

    /**
     * Registers a {@link BlockStairs} recipe
     *
     * @param baseBlock The base block to be consumed
     * @param stairBlock The stair block to be returned
     * @since 0.0.1
     */
    public static void registerStairsRecipe(Block baseBlock, Block stairBlock) {
        registerStairsRecipe(baseBlock, 0, stairBlock);
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

}
