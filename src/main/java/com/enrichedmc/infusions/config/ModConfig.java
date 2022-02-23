package com.enrichedmc.infusions.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "enriched-infusions")
@Config.Gui.CategoryBackground(category = "Resources", background = "minecraft:textures/block/emerald_block.png")
public class ModConfig implements ConfigData {
    //Resources
    @ConfigEntry.Category("Resources")
    @ConfigEntry.Gui.Tooltip()
    public boolean enableEmeraldSteelGear = true;
    public boolean enableEmeraldObsidianGear = true;
    public boolean enableRubySteelGear = true;
    public boolean enableRubyObsidianGear = true;
    public boolean enableSapphireSteelGear = true;
    public boolean enableSapphireObsidianGear = true;
    public boolean enableTanzaniteSteelGear = true;
    public boolean enableTanzaniteObsidianGear = true;
    public boolean enableDiamondSteelGear = true;
    public boolean enableDiamondObsidianGear = true;


}

