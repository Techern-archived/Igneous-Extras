package com.techern.minecraft.igneousextras;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;

import com.techern.minecraft.IgneousExtrasMod;

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
     * @see {@link ConfigHandler.getConfig()}
     * @since 0.0.2
     */
    private static Configuration cfg;
    
    public static boolean ENABLE_DYED_STONE_BLOCKS;
    public static boolean ENABLE_ADDITIONAL_STAIRS;
    public static boolean ENABLE_DYED_STONE_STAIRS;
    
    public static ToolMaterial MAT_GRANITE;
    public static ToolMaterial MAT_ANDESITE;
    public static ToolMaterial MAT_DIORITE;

	public static boolean ENABLE_ADDITIONAL_PRESSURE_PLATES;
	public static boolean ENABLE_DYED_STONE_PRESSURE_PLATES;

	public static boolean ENABLE_ADDITIONAL_LEVERS;
	public static boolean ENABLE_DYED_STONE_LEVERS;

    
	public static void init(Configuration cfgFile) {
    	cfg = cfgFile;
    	cfg.load();
    	
    	ENABLE_DYED_STONE_BLOCKS = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean();
		ENABLE_DYED_STONE_STAIRS = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_STAIRS", true, "Enable the use of dyed stone stairs").getBoolean();
		ENABLE_DYED_STONE_PRESSURE_PLATES = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_PRESSURE_PLATES", true, "Enable the use of dyed pressure plates").getBoolean();
    	ENABLE_ADDITIONAL_STAIRS = cfg.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean();
    	ENABLE_ADDITIONAL_PRESSURE_PLATES = cfg.get("ADDITIONAL_BLOCKS", "PRESSURE_PLATES", true, "Enable the use of additional pressure plates").getBoolean();
		ENABLE_ADDITIONAL_LEVERS = cfg.get("ADDITIONAL_BLOCKS", "LEVERS", true, "Enable the use of additional levers").getBoolean();
		ENABLE_DYED_STONE_LEVERS = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_LEVERS", true, "Enable the use of dyed stone levers").getBoolean();
    	
		MAT_GRANITE = EnumHelper.addToolMaterial("granite", 
				cfg.getInt("harvestlevel", "granite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "granite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "granite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				//TODO use this value as base value and put in comment the damage that is added per tool
				cfg.getFloat("damge_on_hit", "granite_material", 5.0F, 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "granite_material", 250, 1, Integer.MAX_VALUE, ""));
		MAT_ANDESITE = EnumHelper.addToolMaterial("andesite",
				cfg.getInt("harvestlevel", "andesite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "andesite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "andesite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				cfg.getFloat("damge_on_hit", "andesite_material", 5.0F, 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "andesite_material", 250, 1, Integer.MAX_VALUE, ""));
		MAT_DIORITE = EnumHelper.addToolMaterial("diorite",
				cfg.getInt("harvestlevel", "diorite_material", 1, 0, Integer.MAX_VALUE, ""),
				cfg.getInt("durability", "diorite_material", 250, 1, Integer.MAX_VALUE, ""),
				cfg.getFloat("efficiency", "diorite_material", 4.5F, 1.0F, Float.MAX_VALUE, ""),
				cfg.getFloat("damge_on_hit", "diorite_material", 5.0F, 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				cfg.getInt("enchantability", "diorite_material", 250, 1, Integer.MAX_VALUE, ""));
    }
	
	public static Configuration getConfig() {
		return cfg;
	}
	
}
