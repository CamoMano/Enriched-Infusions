package com.enrichedmc.infusions.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "enriched-infusions")
@Config.Gui.CategoryBackground(category = "Recipes", background = "minecraft:textures/block/raw_copper_block.png")
public class ModConfig implements ConfigData {
    //Resources
    @ConfigEntry.Category("Resources")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableEmeraldSteelGear = true;

}

