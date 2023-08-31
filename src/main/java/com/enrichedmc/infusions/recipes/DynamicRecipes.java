package com.enrichedmc.infusions.recipes;

import static com.enrichedmc.infusions.EnrichedInfusions.log;

import com.enrichedmc.Enriched;
import com.enrichedmc.builder.ShapedRecipeBuilder;
import com.enrichedmc.infusions.config.ModConfig;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import org.apache.logging.log4j.Level;

public class DynamicRecipes {
    public static final Map<Identifier, JsonObject> REGISTRY = new HashMap<>();

    public static void register(ModConfig config) {
        final List<Pair<Identifier, JsonObject>> enabledFeatures = new ArrayList<>();
        if (config.enableEmeraldSteelGear) {
            enabledFeatures.add(smithing("emerald_steel_infused_pickaxe", "enriched:steel_pickaxe", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_pickaxe"));
            enabledFeatures.add(smithing("emerald_steel_infused_sword", "enriched:steel_sword", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_sword"));
            enabledFeatures.add(smithing("emerald_steel_infused_shovel", "enriched:steel_shovel", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_shovel"));
            enabledFeatures.add(smithing("emerald_steel_infused_hoe", "enriched:steel_hoe", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_hoe"));
            enabledFeatures.add(smithing("emerald_steel_infused_axe", "enriched:steel_axe", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_axe"));

            enabledFeatures.add(smithing("emerald_steel_infused_helmet", "enriched:steel_helmet", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_helmet"));
            enabledFeatures.add(smithing("emerald_steel_infused_chestplate", "enriched:steel_chestplate", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_chestplate"));
            enabledFeatures.add(smithing("emerald_steel_infused_leggings", "enriched:steel_leggings", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_leggings"));
            enabledFeatures.add(smithing("emerald_steel_infused_boots", "enriched:steel_boots", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_steel_boots"));
        }
        if (config.enableEmeraldObsidianGear) {
            enabledFeatures.add(smithing("emerald_obsidian_infused_pickaxe", "enriched:obsidian_pickaxe", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_pickaxe"));
            enabledFeatures.add(smithing("emerald_obsidian_infused_sword", "enriched:obsidian_sword", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_sword"));
            enabledFeatures.add(smithing("emerald_obsidian_infused_shovel", "enriched:obsidian_shovel", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_shovel"));
            enabledFeatures.add(smithing("emerald_obsidian_infused_hoe", "enriched:obsidian_hoe", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_hoe"));
            enabledFeatures.add(smithing("emerald_obsidian_infused_axe", "enriched:obsidian_axe", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_axe"));

            enabledFeatures.add(smithing("emerald_obsidian_infused_helmet", "enriched:obsidian_helmet", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_helmet"));
            enabledFeatures.add(smithing("emerald_obsidian_infused_chestplate", "enriched:obsidian_chestplate", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_chestplate"));
            enabledFeatures.add(smithing("emerald_obsidian_infused_leggings", "enriched:obsidian_leggings", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_leggings"));
            enabledFeatures.add(smithing("emerald_obsidian_infused_boots", "enriched:obsidian_boots", "minecraft:emerald", "minecraft:netherite_upgrade_smithing_template", "enriched:emerald_obsidian_boots"));
        }

        if (config.enableSapphireSteelGear) {
            enabledFeatures.add(smithing("sapphire_steel_infused_pickaxe", "enriched:steel_pickaxe", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_pickaxe"));
            enabledFeatures.add(smithing("sapphire_steel_infused_sword", "enriched:steel_sword", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_sword"));
            enabledFeatures.add(smithing("sapphire_steel_infused_shovel", "enriched:steel_shovel", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_shovel"));
            enabledFeatures.add(smithing("sapphire_steel_infused_hoe", "enriched:steel_hoe", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_hoe"));
            enabledFeatures.add(smithing("sapphire_steel_infused_axe", "enriched:steel_axe", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_axe"));

            enabledFeatures.add(smithing("sapphire_steel_infused_helmet", "enriched:steel_helmet", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_helmet"));
            enabledFeatures.add(smithing("sapphire_steel_infused_chestplate", "enriched:steel_chestplate", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_chestplate"));
            enabledFeatures.add(smithing("sapphire_steel_infused_leggings", "enriched:steel_leggings", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_leggings"));
            enabledFeatures.add(smithing("sapphire_steel_infused_boots", "enriched:steel_boots", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_steel_boots"));
        }
        if (config.enableSapphireObsidianGear) {
            enabledFeatures.add(smithing("sapphire_obsidian_infused_pickaxe", "enriched:obsidian_pickaxe", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_pickaxe"));
            enabledFeatures.add(smithing("sapphire_obsidian_infused_sword", "enriched:obsidian_sword", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_sword"));
            enabledFeatures.add(smithing("sapphire_obsidian_infused_shovel", "enriched:obsidian_shovel", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_shovel"));
            enabledFeatures.add(smithing("sapphire_obsidian_infused_hoe", "enriched:obsidian_hoe", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_hoe"));
            enabledFeatures.add(smithing("sapphire_obsidian_infused_axe", "enriched:obsidian_axe", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_axe"));

            enabledFeatures.add(smithing("sapphire_obsidian_infused_helmet", "enriched:obsidian_helmet", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_helmet"));
            enabledFeatures.add(smithing("sapphire_obsidian_infused_chestplate", "enriched:obsidian_chestplate", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_chestplate"));
            enabledFeatures.add(smithing("sapphire_obsidian_infused_leggings", "enriched:obsidian_leggings", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_leggings"));
            enabledFeatures.add(smithing("sapphire_obsidian_infused_boots", "enriched:obsidian_boots", "enriched:sapphire", "minecraft:netherite_upgrade_smithing_template", "enriched:sapphire_obsidian_boots"));
        }
        if (config.enableRubySteelGear) {
            enabledFeatures.add(smithing("ruby_steel_infused_pickaxe", "enriched:steel_pickaxe", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_pickaxe"));
            enabledFeatures.add(smithing("ruby_steel_infused_sword", "enriched:steel_sword", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_sword"));
            enabledFeatures.add(smithing("ruby_steel_infused_shovel", "enriched:steel_shovel", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_shovel"));
            enabledFeatures.add(smithing("ruby_steel_infused_hoe", "enriched:steel_hoe", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_hoe"));
            enabledFeatures.add(smithing("ruby_steel_infused_axe", "enriched:steel_axe", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_axe"));

            enabledFeatures.add(smithing("ruby_steel_infused_helmet", "enriched:steel_helmet", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_helmet"));
            enabledFeatures.add(smithing("ruby_steel_infused_chestplate", "enriched:steel_chestplate", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_chestplate"));
            enabledFeatures.add(smithing("ruby_steel_infused_leggings", "enriched:steel_leggings", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_leggings"));
            enabledFeatures.add(smithing("ruby_steel_infused_boots", "enriched:steel_boots", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_steel_boots"));
        }
        if (config.enableRubyObsidianGear) {
            enabledFeatures.add(smithing("ruby_obsidian_infused_pickaxe", "enriched:obsidian_pickaxe", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_pickaxe"));
            enabledFeatures.add(smithing("ruby_obsidian_infused_sword", "enriched:obsidian_sword", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_sword"));
            enabledFeatures.add(smithing("ruby_obsidian_infused_shovel", "enriched:obsidian_shovel", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_shovel"));
            enabledFeatures.add(smithing("ruby_obsidian_infused_hoe", "enriched:obsidian_hoe", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_hoe"));
            enabledFeatures.add(smithing("ruby_obsidian_infused_axe", "enriched:obsidian_axe", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_axe"));

            enabledFeatures.add(smithing("ruby_obsidian_infused_helmet", "enriched:obsidian_helmet", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_helmet"));
            enabledFeatures.add(smithing("ruby_obsidian_infused_chestplate", "enriched:obsidian_chestplate", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_chestplate"));
            enabledFeatures.add(smithing("ruby_obsidian_infused_leggings", "enriched:obsidian_leggings", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_leggings"));
            enabledFeatures.add(smithing("ruby_obsidian_infused_boots", "enriched:obsidian_boots", "enriched:ruby", "minecraft:netherite_upgrade_smithing_template", "enriched:ruby_obsidian_boots"));
        }
        if (config.enableTanzaniteSteelGear) {
            enabledFeatures.add(smithing("tanzanite_steel_infused_pickaxe", "enriched:steel_pickaxe", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_pickaxe"));
            enabledFeatures.add(smithing("tanzanite_steel_infused_sword", "enriched:steel_sword", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_sword"));
            enabledFeatures.add(smithing("tanzanite_steel_infused_shovel", "enriched:steel_shovel", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_shovel"));
            enabledFeatures.add(smithing("tanzanite_steel_infused_hoe", "enriched:steel_hoe", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_hoe"));
            enabledFeatures.add(smithing("tanzanite_steel_infused_axe", "enriched:steel_axe", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_axe"));

            enabledFeatures.add(smithing("tanzanite_steel_infused_helmet", "enriched:steel_helmet", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_helmet"));
            enabledFeatures.add(smithing("tanzanite_steel_infused_chestplate", "enriched:steel_chestplate", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_chestplate"));
            enabledFeatures.add(smithing("tanzanite_steel_infused_leggings", "enriched:steel_leggings", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_leggings"));
            enabledFeatures.add(smithing("tanzanite_steel_infused_boots", "enriched:steel_boots", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_steel_boots"));
        }
        if (config.enableTanzaniteObsidianGear) {
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_pickaxe", "enriched:obsidian_pickaxe", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_pickaxe"));
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_sword", "enriched:obsidian_sword", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_sword"));
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_shovel", "enriched:obsidian_shovel", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_shovel"));
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_hoe", "enriched:obsidian_hoe", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_hoe"));
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_axe", "enriched:obsidian_axe", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_axe"));

            enabledFeatures.add(smithing("tanzanite_obsidian_infused_helmet", "enriched:obsidian_helmet", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_helmet"));
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_chestplate", "enriched:obsidian_chestplate", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_chestplate"));
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_leggings", "enriched:obsidian_leggings", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_leggings"));
            enabledFeatures.add(smithing("tanzanite_obsidian_infused_boots", "enriched:obsidian_boots", "enriched:tanzanite", "minecraft:netherite_upgrade_smithing_template", "enriched:tanzanite_obsidian_boots"));
        }

        if (config.enableDiamondSteelGear) {
            enabledFeatures.add(smithing("diamond_steel_infused_pickaxe", "enriched:steel_pickaxe", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_pickaxe"));
            enabledFeatures.add(smithing("diamond_steel_infused_sword", "enriched:steel_sword", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_sword"));
            enabledFeatures.add(smithing("diamond_steel_infused_shovel", "enriched:steel_shovel", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_shovel"));
            enabledFeatures.add(smithing("diamond_steel_infused_hoe", "enriched:steel_hoe", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_hoe"));
            enabledFeatures.add(smithing("diamond_steel_infused_axe", "enriched:steel_axe", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_axe"));

            enabledFeatures.add(smithing("diamond_steel_infused_helmet", "enriched:steel_helmet", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_helmet"));
            enabledFeatures.add(smithing("diamond_steel_infused_chestplate", "enriched:steel_chestplate", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_chestplate"));
            enabledFeatures.add(smithing("diamond_steel_infused_leggings", "enriched:steel_leggings", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_leggings"));
            enabledFeatures.add(smithing("diamond_steel_infused_boots", "enriched:steel_boots", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_steel_boots"));
        }
        if (config.enableDiamondObsidianGear) {
            enabledFeatures.add(smithing("diamond_obsidian_infused_pickaxe", "enriched:obsidian_pickaxe", "minecraft:diamond","minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_pickaxe"));
            enabledFeatures.add(smithing("diamond_obsidian_infused_sword", "enriched:obsidian_sword", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_sword"));
            enabledFeatures.add(smithing("diamond_obsidian_infused_shovel", "enriched:obsidian_shovel", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_shovel"));
            enabledFeatures.add(smithing("diamond_obsidian_infused_hoe", "enriched:obsidian_hoe", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_hoe"));
            enabledFeatures.add(smithing("diamond_obsidian_infused_axe", "enriched:obsidian_axe", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_axe"));

            enabledFeatures.add(smithing("diamond_obsidian_infused_helmet", "enriched:obsidian_helmet", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_helmet"));
            enabledFeatures.add(smithing("diamond_obsidian_infused_chestplate", "enriched:obsidian_chestplate", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_chestplate"));
            enabledFeatures.add(smithing("diamond_obsidian_infused_leggings", "enriched:obsidian_leggings", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_leggings"));
            enabledFeatures.add(smithing("diamond_obsidian_infused_boots", "enriched:obsidian_boots", "minecraft:diamond", "minecraft:netherite_upgrade_smithing_template", "enriched:diamond_obsidian_boots"));
        }

        enabledFeatures.forEach(it -> REGISTRY.put(it.getLeft(), it.getRight()));

        log(Level.INFO, "Loaded recipes");
    }

    private static Pair<Identifier, JsonObject> pickaxe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> pickaxe_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                " | ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> sword(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " # ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> sword_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " # ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> axe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                "#| ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> axe_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                "#| ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> shovel(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> shovel_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                " # ",
                " | ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> hoe(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                " | ",
                " | "
        ).item('#', item).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> hoe_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "## ",
                " | ",
                " | "
        ).tag('#', tag).item('|', "stick").result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> alloy() {
        return ShapedRecipeBuilder.ofPattern(
                "III",
                "OOO",
                "III"
        ).item('I', "iron_ingot").item('O', "obsidian").result(
                "enriched:obsidian_alloy_ingot", 9
        ).build(Enriched.identifier("obsidian_alloy_ingot"));
    }

    private static Pair<Identifier, JsonObject> helmet(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "   "
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> helmet_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "   "
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> chestplate(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "###",
                "###"
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> chestplate_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "###",
                "###"
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> leggings(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "# #"
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> leggings_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "# #",
                "# #"
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> boots(String name, String item, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "# #",
                "   "
        ).item('#', item).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> boots_tag(String name, String tag, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "# #",
                "# #",
                "   "
        ).tag('#', tag).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> blend(String name, String item_1, String item_2, String result) {
        return ShapedRecipeBuilder.ofPattern(
                "   ",
                "21 ",
                "   "
        ).item('1', item_1).item('2', item_2).result(result).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> uncrafting_tag(String name, String tag, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "#  ",
                "   ",
                "   "
        ).tag('#', tag).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> uncrafting(String name, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "#  ",
                "   ",
                "   "
        ).item('#', item).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> horse_armor(String name, String tag, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "  #",
                "#W#",
                "###"
        ).tag('W', tag).item('#', item).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> block(String name, String item, String result, int count) {
        return ShapedRecipeBuilder.ofPattern(
                "###",
                "###",
                "###"
        ).item('#', item).result(result, count).build(
                Enriched.identifier(name)
        );
    }

    private static Pair<Identifier, JsonObject> blasting(
            String name, String input, String output, double experience, int cookingTime
    ) {
        final Identifier identifier = Enriched.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:blasting");

        final JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input);
        json.add("ingredient", ingredient);

        json.addProperty("result", output);
        json.addProperty("experience", experience);
        json.addProperty("cookingtime", cookingTime);

        return new Pair<>(identifier, json);
    }

    private static Pair<Identifier, JsonObject> smelting(
            String name, String input, String output, double experience, int cookingTime) {
        final Identifier identifier = Enriched.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smelting");

        final JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input);
        json.add("ingredient", ingredient);

        json.addProperty("result", output);
        json.addProperty("experience", experience);
        json.addProperty("cookingtime", cookingTime);

        return new Pair<>(identifier, json);
    }


    private static Pair<Identifier, JsonObject> smithing(
            String name, String input, String upgrade, String template, String output) {
        final Identifier identifier = Enriched.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smithing_transform");

        final JsonObject addition = new JsonObject();
        addition.addProperty("item", upgrade);
        json.add("addition", addition);

        final JsonObject base = new JsonObject();
        base.addProperty("item", input);
        json.add("base", base);

        final JsonObject templateitem = new JsonObject();
        templateitem.addProperty("item", template);
        json.add("template", templateitem);

        final JsonObject result = new JsonObject();
        result.addProperty("item", output);
        json.add("result", result);


        return new Pair<>(identifier, json);
    }
}