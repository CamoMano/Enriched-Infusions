package com.enrichedmc.infusions.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "enriched-infusions")
@Config.Gui.CategoryBackground(
    category = "Resources",
    background = "minecraft:textures/block/emerald_block.png")
public class ModConfig implements ConfigData {
  // Resources
  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableEmeraldSteelGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableEmeraldObsidianGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableRubySteelGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableRubyObsidianGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableSapphireSteelGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableSapphireObsidianGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableTanzaniteSteelGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableTanzaniteObsidianGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableDiamondSteelGear = true;

  @ConfigEntry.Category("Resources")
  @ConfigEntry.Gui.Tooltip()
  public boolean enableDiamondObsidianGear = true;
}
