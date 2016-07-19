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

	public static ToolMaterial MAT_GRANITE;
	public static ToolMaterial MAT_ANDESITE;
	public static ToolMaterial MAT_DIORITE;
    
    public static boolean ENABLE_DYED_STONE_BLOCKS;
    public static boolean ENABLE_ADDITIONAL_STAIRS;

	public static boolean ENABLE_ADDITIONAL_PRESSURE_PLATES;

	public static boolean ENABLE_ADDITIONAL_LEVERS;

    
	public static void init(Configuration cfgFile) {
    	cfg = cfgFile;
    	cfg.load();
    	
    	ENABLE_DYED_STONE_BLOCKS = cfg.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean();
    	ENABLE_ADDITIONAL_STAIRS = cfg.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean();
    	ENABLE_ADDITIONAL_PRESSURE_PLATES = cfg.get("ADDITIONAL_BLOCKS", "PRESSURE_PLATES", true, "Enable the use of additional pressure plates").getBoolean();
		ENABLE_ADDITIONAL_LEVERS = cfg.get("ADDITIONAL_BLOCKS", "LEVERS", true, "Enable the use of additional levers").getBoolean();
    	
    }
	
	public static Configuration getConfig() {
		return cfg;
	}
	
}
