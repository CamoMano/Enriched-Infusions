package com.enrichedmc.infusions;


import com.enrichedmc.infusions.config.ModConfig;
import com.enrichedmc.infusions.recipes.DynamicRecipes;
import com.enrichedmc.infusions.registry.ModInit;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EnrichedInfusions implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "enriched-infusions";
    public static final String MOD_NAME = "Enriched Infusions";

    public static void log(Level level, String message) {
        LOGGER.log(level, "[" + MOD_NAME + "] " + message);
    }

    @Override
    public void onInitialize() {
        log(Level.INFO, "Hello there!");
        //Config
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
        ModConfig config = AutoConfig.getConfigHolder(ModConfig.class).getConfig();
        //Setup
        ModInit.Register();
        DynamicRecipes.register(config);
    }
}