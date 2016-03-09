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

        //TODO: Add recipes for items second

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
