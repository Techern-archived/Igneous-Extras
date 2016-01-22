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
     * Registers the {@link net.minecraft.block.Block}s added by the {@link IgneousExtrasMod}
     *
     * @since 0.0.1
     */
    public static void registerBlocks() {
        GameRegistry.registerBlock(DYED_COBBLESTONE, ItemColoredBlock.class, "dyed_cobblestone");
        GameRegistry.registerBlock(DYED_MOSSY_COBBLESTONE, ItemColoredBlock.class, "dyed_mossy_cobblestone");
        GameRegistry.registerBlock(DYED_STONE, ItemColoredBlock.class, "dyed_stone");

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
        for (EnumDyeColor color : EnumDyeColor.values()) {
            dye = new ItemStack(Items.dye, 1, color.getDyeDamage());

            ItemStack input = new ItemStack(blockToConsume, 1);
            ItemStack output = new ItemStack(blockToReturn, 8, color.getMetadata());

            GameRegistry.addShapedRecipe(output, "III", "IDI", "III", 'I', input, 'D', dye);
        }
    }

}
