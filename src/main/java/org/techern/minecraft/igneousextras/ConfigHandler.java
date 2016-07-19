package org.techern.minecraft.igneousextras;

import net.minecraftforge.common.config.Configuration;

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
    	
    	ENABLE_DYED_STONE_BLOCKS = configuration.get("ADDITIONAL_BLOCKS", "DYED_STONE_BLOCKS", true, "Enable the use of dyed stone blocks").getBoolean();
    	ENABLE_ADDITIONAL_STAIRS = configuration.get("ADDITIONAL_BLOCKS", "STAIRS", true, "Enable the use of additional stair blocks").getBoolean();
    	ENABLE_ADDITIONAL_PRESSURE_PLATES = configuration.get("ADDITIONAL_BLOCKS", "PRESSURE_PLATES", true, "Enable the use of additional pressure plates").getBoolean();
		ENABLE_ADDITIONAL_LEVERS = configuration.get("ADDITIONAL_BLOCKS", "LEVERS", true, "Enable the use of additional levers").getBoolean();

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
