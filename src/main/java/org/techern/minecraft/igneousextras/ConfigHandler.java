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
     * @see {@link ConfigHandler#getRawConfig()}
     * @since 0.0.2
     */
    private static Configuration configuration;

	/**
	 * Checks to see if dyed stone blocks are enabled
	 *
	 * @since 0.0.2
	 */
    public static boolean ENABLE_DYED_STONE_BLOCKS;

	/**
	 * Checks to see if additional stairs are enabled
	 *
	 * @since 0.0.2
	 */
    public static boolean ENABLE_ADDITIONAL_STAIRS;
    
    /**
	 * Checks to see if additional pressure plates are enabled
	 *
	 * @since 0.0.2
	 */
	public static boolean ENABLE_ADDITIONAL_PRESSURE_PLATES;

	/**
	 * Checks to see if additional levers are enabled
	 *
	 * @since 0.0.2
	 */
	public static boolean ENABLE_ADDITIONAL_LEVERS;
    
    public static boolean ENABLE_ADDITIONAL_TOOLS;
    
    public static final int POLISHED_BOOST_DURABILITY = 33;
    public static final float POLISHED_BOOST_EFFICIENCY = 1F;
    public static final float POLISHED_BOOST_DAMAGE = 0.5F;
    public static final int POLISHED_BOOST_ENCHANTABILITY = 2;

	public static ToolMaterial MAT_GRANITE;
	public static ToolMaterial MAT_ANDESITE;
	public static ToolMaterial MAT_DIORITE;
	public static ToolMaterial MAT_POLISHED_GRANITE;
	public static ToolMaterial MAT_POLISHED_ANDESITE;
	public static ToolMaterial MAT_POLISHED_DIORITE;


    /**
	 * Initialize the configuration handler
	 *
	 * @param rawConfiguration The raw {@link Configuration} being imported
	 *
	 * @since 0.0.2
     */
	public static void init(Configuration rawConfiguration) {
    	configuration = rawConfiguration;
    	configuration.load();
    	
    	//Blocks
    	ENABLE_DYED_STONE_BLOCKS = configuration.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean();
    	ENABLE_ADDITIONAL_STAIRS = configuration.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean();
    	ENABLE_ADDITIONAL_PRESSURE_PLATES = configuration.get("ADDITIONAL_BLOCKS", "PRESSURE_PLATES", true, "Enable the use of additional pressure plates").getBoolean();
		ENABLE_ADDITIONAL_LEVERS = configuration.get("ADDITIONAL_BLOCKS", "LEVERS", true, "Enable the use of additional levers").getBoolean();
    	
    	//Items
    	ENABLE_ADDITIONAL_TOOLS = configuration.get("ADDITIONAL_ITEMS", "TOOL", true, "Enable additional tools").getBoolean();

    	//Materials
		MAT_GRANITE = EnumHelper.addToolMaterial("granite",
				configuration.getInt("harvestlevel", "granite_material", 1, 0, Integer.MAX_VALUE, ""),
				configuration.getInt("durability", "granite_material", 131, 1, Integer.MAX_VALUE, ""),
				configuration.getFloat("efficiency", "granite_material", 4.0F, 1.0F, Float.MAX_VALUE, ""),
				configuration.getFloat("damage_on_hit", "granite_material", 5.0F, 1, Float.MAX_VALUE, "") - 4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				configuration.getInt("enchantability", "granite_material", 5, 1, Integer.MAX_VALUE, ""));
		MAT_ANDESITE = EnumHelper.addToolMaterial("andesite",
				configuration.getInt("harvestlevel", "andesite_material", 1, 0, Integer.MAX_VALUE, ""),
				configuration.getInt("durability", "andesite_material", 131, 1, Integer.MAX_VALUE, ""),
				configuration.getFloat("efficiency", "andesite_material", 4.0F, 1.0F, Float.MAX_VALUE, ""),
				configuration.getFloat("damage_on_hit", "andesite_material", 5.0F, 1, Float.MAX_VALUE, "") - 4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				configuration.getInt("enchantability", "andesite_material", 5, 1, Integer.MAX_VALUE, ""));
		MAT_DIORITE = EnumHelper.addToolMaterial("diorite",
				configuration.getInt("harvestlevel", "diorite_material", 1, 0, Integer.MAX_VALUE, ""),
				configuration.getInt("durability", "diorite_material", 131, 1, Integer.MAX_VALUE, ""),
				configuration.getFloat("efficiency", "diorite_material", 4.0F, 1.0F, Float.MAX_VALUE, ""),
				configuration.getFloat("damage_on_hit", "diorite_material", 5, 1, Float.MAX_VALUE, "") - 4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				configuration.getInt("enchantability", "diorite_material", 250, 1, Integer.MAX_VALUE, ""));

		
		MAT_POLISHED_GRANITE = EnumHelper.addToolMaterial("polished_granite",
				configuration.getInt("harvestlevel", "polished_granite_material", 1, 0, Integer.MAX_VALUE, ""),
				configuration.getInt("durability", "polished_granite_material", (131 + POLISHED_BOOST_DURABILITY), 1, Integer.MAX_VALUE, ""),
				configuration.getFloat("efficiency", "polished_granite_material", (4.0F + POLISHED_BOOST_EFFICIENCY), 1.0F, Float.MAX_VALUE, ""),
				configuration.getFloat("damage_on_hit", "polished_granite_material", (5.0F + POLISHED_BOOST_DAMAGE), 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				configuration.getInt("enchantability", "polished_granite_material", (5 + POLISHED_BOOST_ENCHANTABILITY), 1, Integer.MAX_VALUE, ""));
		MAT_POLISHED_ANDESITE = EnumHelper.addToolMaterial("polished_andesite",
				configuration.getInt("harvestlevel", "polished_andesite_material", 1, 0, Integer.MAX_VALUE, ""),
				configuration.getInt("durability", "polished_andesite_material", (131 + POLISHED_BOOST_DURABILITY), 1, Integer.MAX_VALUE, ""),
				configuration.getFloat("efficiency", "polished_andesite_material", (4.0F + POLISHED_BOOST_EFFICIENCY), 1.0F, Float.MAX_VALUE, ""),
				configuration.getFloat("damage_on_hit", "polished_andesite_material", (5.0F + POLISHED_BOOST_DAMAGE), 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				configuration.getInt("enchantability", "polished_andesite_material", (5 + POLISHED_BOOST_ENCHANTABILITY), 1, Integer.MAX_VALUE, ""));
		MAT_POLISHED_DIORITE = EnumHelper.addToolMaterial("diorite",
				configuration.getInt("harvestlevel", "polished_diorite_material", 1, 0, Integer.MAX_VALUE, ""),
				configuration.getInt("durability", "polished_diorite_material", (131 + POLISHED_BOOST_DURABILITY), 1, Integer.MAX_VALUE, ""),
				configuration.getFloat("efficiency", "polished_diorite_material", (4.0F + POLISHED_BOOST_EFFICIENCY), 1.0F, Float.MAX_VALUE, ""),
				configuration.getFloat("damage_on_hit", "polished_diorite_material", (5.0F + POLISHED_BOOST_DAMAGE), 1, Float.MAX_VALUE, "")-4F, //Minecraft automatically adds 4.0F, so to give an actual representation I retract 4.0F
				configuration.getInt("enchantability", "polished_diorite_material", (5 + POLISHED_BOOST_ENCHANTABILITY), 1, Integer.MAX_VALUE, ""));

    }

	/**
	 * Get the raw {@link Configuration}
	 *
	 * @return The raw {@link Configuration}
	 * @since 0.0.2
     */
	public static Configuration getRawConfig() {
		return configuration;
	}
	
}
