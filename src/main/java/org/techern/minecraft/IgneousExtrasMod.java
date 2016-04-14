package org.techern.minecraft;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.techern.minecraft.igneousextras.ConfigHandler;
import org.techern.minecraft.igneousextras.blocks.IABlocks;
import org.techern.minecraft.igneousextras.proxy.CommonProxy;
import org.techern.minecraft.igneousextras.proxy.ClientProxy;

/**
 * A {@link net.minecraftforge.fml.common.Mod} for additional igneous rock blocks
 *
 * @since 0.0.1
 */
@Mod(modid = "igneous_extras", version = IgneousExtrasMod.VERSION)
public class IgneousExtrasMod {

    /**
     * The version {@link String}
     *
     * @since 0.0.1
     */
    public static final String VERSION = "0.0.2-SNAPSHOT";

    /**
     * The {@link Logger} for this mod
     *
     * Gets replaced in {@link IgneousExtrasMod#handlePreInitEvent(FMLPreInitializationEvent)}
     *
     * @since 0.0.1
     */
    public static Logger LOGGER = LogManager.getLogger(IgneousExtrasMod.class);

    /**
     * A {@link SidedProxy} of either {@link CommonProxy} or {@link ClientProxy}
     *
     * @since 0.0.1
     */
    @SidedProxy(clientSide = "org.techern.minecraft.igneousextras.proxy.ClientProxy",
                serverSide = "org.techern.minecraft.igneousextras.proxy.CommonProxy")
    public static CommonProxy PROXY;

    /**
     * Handles the {@link FMLPreInitializationEvent}
     *
     * @param event The {@link FMLPreInitializationEvent}
     * @since 0.0.1
     */
    @Mod.EventHandler
    public void handlePreInitEvent(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
        LOGGER.debug("Attempting to load configuration file...");

        ConfigHandler.init(new Configuration(event.getSuggestedConfigurationFile()));

        LOGGER.info("Loaded configuration file for Igneous Extras");
    }

    /**
     * Handles the {@link FMLInitializationEvent}
     *
     * @param event The {@link FMLInitializationEvent}
     * @since 0.0.1
     */
    @Mod.EventHandler
    public void handleInitEvent(FMLInitializationEvent event) {
        IABlocks.registerBlocks();
    }

    /**
     * Handles the {@link FMLPostInitializationEvent}
     *
     * @param event The {@link FMLPostInitializationEvent}
     * @since 0.0.1
     */
    @Mod.EventHandler
    public void handlePostInitEvent(FMLPostInitializationEvent event) {
        IABlocks.registerRecipes();
        if (ConfigHandler.getConfig().hasChanged()) {
            LOGGER.info("Igneous Additions found extra / changed configuration, and is now saving");
            ConfigHandler.getConfig().save();
        }
    }

}
