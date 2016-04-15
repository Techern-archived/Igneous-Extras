package org.techern.minecraft.igneousextras;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

import org.techern.minecraft.IgneousExtrasMod;

/**
 * Configuration handler
 * 
 * @author ShadowCoder69
 * @since 0.0.2
 */
public class ConfigHandler {
	/**
     * The {@link Configuration} (backed by a {@link java.io.File} used by {@link IgneousExtrasMod}
     *
     * @see {@link ConfigHandler#getConfig()}
     * @since 0.0.2
     */
    private static Configuration cfg;
    
    public static boolean ENABLE_DYED_STONE_BLOCKS;

    public static boolean ENABLE_ADDITIONAL_STAIRS;
    public static boolean ENABLE_DYED_STONE_STAIRS;

    public static boolean ENABLE_ADDITIONAL_PRESSURE_PLATES;
	public static boolean ENABLE_DYED_STONE_PRESSURE_PLATES;
	
    public static boolean ENABLE_ADDITIONAL_LEVERS;
	public static boolean ENABLE_DYED_STONE_LEVERS;
    
    public static boolean ENABLE_ANDESITE_TOOLS;
    public static boolean ENABLE_GRANITE_TOOLS;
    public static boolean ENABLE_DIORITE_TOOLS;

	public static ToolMaterial MAT_GRANITE;
	public static ToolMaterial MAT_ANDESITE;
	public static ToolMaterial MAT_DIORITE;
	public static ToolMaterial MAT_POLISHED_GRANITE;
	public static ToolMaterial MAT_POLISHED_ANDESITE;
	public static ToolMaterial MAT_POLISHED_DIORITE;


    
	public static void init(Configuration cfgFile) {
    	cfg = cfgFile;
    	cfg.load();
    	
    	//Blocks
    	ENABLE_DYED_STONE_BLOCKS = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean();
		ENABLE_DYED_STONE_STAIRS = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_STAIRS", true, "Enable the use of dyed stone stairs").getBoolean();
		ENABLE_DYED_STONE_PRESSURE_PLATES = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_PRESSURE_PLATES", true, "Enable the use of dyed pressure plates").getBoolean();
    	ENABLE_ADDITIONAL_STAIRS = cfg.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean();
    	ENABLE_ADDITIONAL_PRESSURE_PLATES = cfg.get("ADDITIONAL_BLOCKS", "PRESSURE_PLATES", true, "Enable the use of additional pressure plates").getBoolean();
		ENABLE_ADDITIONAL_LEVERS = cfg.get("ADDITIONAL_BLOCKS", "LEVERS", true, "Enable the use of additional levers").getBoolean();
		ENABLE_DYED_STONE_LEVERS = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_LEVERS", true, "Enable the use of dyed stone levers").getBoolean();
    	
    	//Items
    	ENABLE_ANDESITE_TOOLS = cfg.get("ADDITIONAL_TOOLS", "ANDESITE", true, "Enable andesite tools").getBoolean();
    	ENABLE_GRANITE_TOOLS = cfg.get("ADDITIONAL_TOOLS", "GRANITE", true, "Enable granite tools").getBoolean();
    	ENABLE_DIORITE_TOOLS = cfg.get("ADDITIONAL_TOOLS", "DIORITE", true, "Enable diorite tools").getBoolean();
    	
    	//Materials
		MAT_GRANITE = EnumHelper.addToolMaterial("granite",
				cfg.getInt("harvestlevel", "granite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "granite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "granite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				//TODO use this value as base value and put in comment the damage that is added per tool
				cfg.getFloat("damge_on_hit", "granite_material", 5.0F, 1, Float.MAX_VALUE, "") - 4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "granite_material", 250, 1, Integer.MAX_VALUE, ""));
		MAT_ANDESITE = EnumHelper.addToolMaterial("andesite",
				cfg.getInt("harvestlevel", "andesite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "andesite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "andesite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				cfg.getFloat("damge_on_hit", "andesite_material", 5.0F, 1, Float.MAX_VALUE, "") - 4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "andesite_material", 250, 1, Integer.MAX_VALUE, ""));
		MAT_DIORITE = EnumHelper.addToolMaterial("diorite",
				cfg.getInt("harvestlevel", "diorite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "diorite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "diorite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				cfg.getFloat("damge_on_hit", "diorite_material", 5.0F, 1, Float.MAX_VALUE, "") - 4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "diorite_material", 250, 1, Integer.MAX_VALUE, ""));


		MAT_POLISHED_GRANITE = EnumHelper.addToolMaterial("polished_granite",
				cfg.getInt("harvestlevel", "polished_granite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "polished_granite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "polished_granite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				//TODO use this value as base value and put in comment the damage that is added per tool
				cfg.getFloat("damge_on_hit", "polished_granite_material", 5.0F, 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "polished_granite_material", 250, 1, Integer.MAX_VALUE, ""));
		MAT_POLISHED_ANDESITE = EnumHelper.addToolMaterial("polished_andesite",
				cfg.getInt("harvestlevel", "polished_andesite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "polished_andesite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "polished_andesite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				cfg.getFloat("damge_on_hit", "polished_andesite_material", 5.0F, 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "polished_andesite_material", 250, 1, Integer.MAX_VALUE, ""));
		MAT_POLISHED_DIORITE = EnumHelper.addToolMaterial("diorite",
				cfg.getInt("harvestlevel", "polished_diorite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "polished_diorite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "polished_diorite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				cfg.getFloat("damge_on_hit", "polished_diorite_material", 5.0F, 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "polished_diorite_material", 250, 1, Integer.MAX_VALUE, ""));
    }
	
	public static Configuration getConfig() {
		return cfg;
	}
	
}
