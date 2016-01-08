package com.techern.minecraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A {@link net.minecraftforge.fml.common.Mod} for additional igneous rock blocks
 *
 * @since 0.0.1
 */
@Mod(modid = "IgneousExtras", version = IgneousExtrasMod.VERSION)
public class IgneousExtrasMod {

    /**
     * The version {@link String}
     *
     * @since 0.0.1
     */
    public static final String VERSION = "0.0.1-SNAPSHOT";

    /**
     * The {@link Logger} for this mod
     *
     * Gets replaced in {@link IgneousExtrasMod#handlePreInitEvent(FMLPreInitializationEvent)}
     *
     * @since 0.0.1
     */
    public static Logger LOGGER = LogManager.getLogger(IgneousExtrasMod.class);

    /**
     * Handles the {@link FMLPreInitializationEvent}
     *
     * @param event The {@link FMLPreInitializationEvent}
     * @since 0.0.1
     */
    @Mod.EventHandler
    public void handlePreInitEvent(FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
        LOGGER.info("Set up logging for Igneous Extras! :D");
    }

}
