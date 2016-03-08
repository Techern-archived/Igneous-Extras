package com.techern.minecraft.ia.blocks;

import com.techern.minecraft.IgneousExtrasMod;
import com.techern.minecraft.ia.items.ItemColoredBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
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
     * A {@link BlockColored} defining a {@link BlockDyedMossyCobblestone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_MOSSY_COBBLESTONE = new BlockDyedMossyCobblestone();

    /**
     * A {@link BlockColored} defining a {@link BlockDyedStone}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_STONE = new BlockDyedStone();

    /**
     * A {@link BlockColored} defining a {@link BlockDyedGranite}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_GRANITE = new BlockDyedGranite();

    /**
     * A {@link BlockColored} defining a {@link BlockDyedSmoothGranite}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_GRANITE = new BlockDyedSmoothGranite();

    /**
     * A {@link BlockColored} defining a {@link BlockDyedDiorite}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_DIORITE = new BlockDyedDiorite();

    /**
     * A {@link BlockColored} defining a {@link BlockDyedSmoothDiorite}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_DIORITE = new BlockDyedSmoothDiorite();

    /**
     * A {@link BlockColored} defining a {@link BlockDyedAndesite}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_ANDESITE = new BlockDyedAndesite();

    /**
     * A {@link BlockColored} defining a {@link BlockDyedSmoothAndesite}
     *
     * @since 0.0.1
     */
    public static BlockColored DYED_SMOOTH_ANDESITE = new BlockDyedSmoothAndesite();

    /**
     * Registers the {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
    public static void registerBlocks() {
        GameRegistry.registerBlock(DYED_COBBLESTONE, ItemColoredBlock.class, "dyed_cobblestone");
        GameRegistry.registerBlock(DYED_MOSSY_COBBLESTONE, ItemColoredBlock.class, "dyed_mossy_cobblestone");
        GameRegistry.registerBlock(DYED_STONE, ItemColoredBlock.class, "dyed_stone");
        GameRegistry.registerBlock(DYED_GRANITE, ItemColoredBlock.class, "dyed_granite");
        GameRegistry.registerBlock(DYED_SMOOTH_GRANITE, ItemColoredBlock.class, "dyed_smooth_granite");
        GameRegistry.registerBlock(DYED_DIORITE, ItemColoredBlock.class, "dyed_diorite");
        GameRegistry.registerBlock(DYED_SMOOTH_DIORITE, ItemColoredBlock.class, "dyed_smooth_diorite");
        GameRegistry.registerBlock(DYED_ANDESITE, ItemColoredBlock.class, "dyed_andesite");
        GameRegistry.registerBlock(DYED_SMOOTH_ANDESITE, ItemColoredBlock.class, "dyed_smooth_andesite");

        //TODO: More here

        //TODO: Register normal block meshes here

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

    /**
     * Registers recipes for {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
    public static void registerRecipes() {

        registerSingleDyeBlockRecipeCombination(Blocks.cobblestone, DYED_COBBLESTONE);
        registerSingleDyeBlockRecipeCombination(Blocks.mossy_cobblestone, DYED_MOSSY_COBBLESTONE);
        registerSingleDyeBlockRecipeCombination(Blocks.stone, 0, DYED_STONE);
        registerSingleDyeBlockRecipeCombination(Blocks.stone, 1, DYED_GRANITE);
        registerSingleDyeBlockRecipeCombination(Blocks.stone, 2, DYED_SMOOTH_GRANITE);
        registerSingleDyeBlockRecipeCombination(Blocks.stone, 3, DYED_DIORITE);
        registerSingleDyeBlockRecipeCombination(Blocks.stone, 4, DYED_SMOOTH_DIORITE);
        registerSingleDyeBlockRecipeCombination(Blocks.stone, 5, DYED_ANDESITE);
        registerSingleDyeBlockRecipeCombination(Blocks.stone, 6, DYED_SMOOTH_ANDESITE);

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
