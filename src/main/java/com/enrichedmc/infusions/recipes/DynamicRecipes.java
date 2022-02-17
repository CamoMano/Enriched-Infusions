package com.enrichedmc.infusions.recipes;

import com.google.gson.JsonObject;
import com.enrichedmc.Enriched;
import com.enrichedmc.builder.ShapedRecipeBuilder;
import com.enrichedmc.infusions.config.ModConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;
import org.apache.logging.log4j.Level;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.enrichedmc.infusions.EnrichedInfusions.log;

public class DynamicRecipes {
    public static final Map<Identifier, JsonObject> REGISTRY = new HashMap<>();

    public static void register(ModConfig config) {
        final List<Pair<Identifier, JsonObject>> enabledFeatures = new ArrayList<>();
        if (config.enableEmeraldSteelGear) {
            enabledFeatures.add(smithing("emerald_steel_infused_pickaxe", "enriched:steel_pickaxe", "minecraft:emerald", "enriched:emerald_steel_pickaxe"));
            enabledFeatures.add(smithing("emerald_steel_infused_sword", "enriched:steel_sword", "minecraft:emerald", "enriched:emerald_steel_sword"));
            enabledFeatures.add(smithing("emerald_steel_infused_shovel", "enriched:steel_shovel", "minecraft:emerald", "enriched:emerald_steel_shovel"));
            enabledFeatures.add(smithing("emerald_steel_infused_hoe", "enriched:steel_hoe", "minecraft:emerald", "enriched:emerald_steel_hoe"));
            enabledFeatures.add(smithing("emerald_steel_infused_axe", "enriched:steel_axe", "minecraft:emerald", "enriched:emerald_steel_axe"));

            enabledFeatures.add(smithing("emerald_steel_infused_helmet", "enriched:steel_helmet", "minecraft:emerald", "enriched:emerald_steel_helmet"));
            enabledFeatures.add(smithing("emerald_steel_infused_chestplate", "enriched:steel_chestplate", "minecraft:emerald", "enriched:emerald_steel_chestplate"));
            enabledFeatures.add(smithing("emerald_steel_infused_leggings", "enriched:steel_leggings", "minecraft:emerald", "enriched:emerald_steel_leggings"));
            enabledFeatures.add(smithing("emerald_steel_infused_boots", "enriched:steel_boots", "minecraft:emerald", "enriched:emerald_steel_boots"));
        }

        enabledFeatures.add(smithing("sapphire_steel_infused_pickaxe", "enriched:steel_pickaxe", "enriched:sapphire", "enriched:sapphire_steel_pickaxe"));
        enabledFeatures.add(smithing("sapphire_steel_infused_sword", "enriched:steel_sword", "enriched:sapphire", "enriched:sapphire_steel_sword"));
        enabledFeatures.add(smithing("sapphire_steel_infused_shovel", "enriched:steel_shovel", "enriched:sapphire", "enriched:sapphire_steel_shovel"));
        enabledFeatures.add(smithing("sapphire_steel_infused_hoe", "enriched:steel_hoe", "enriched:sapphire", "enriched:sapphire_steel_hoe"));
        enabledFeatures.add(smithing("sapphire_steel_infused_axe", "enriched:steel_axe", "enriched:sapphire", "enriched:sapphire_steel_axe"));

        enabledFeatures.add(smithing("sapphire_steel_infused_helmet", "enriched:steel_helmet", "enriched:sapphire", "enriched:sapphire_steel_helmet"));
        enabledFeatures.add(smithing("sapphire_steel_infused_chestplate", "enriched:steel_chestplate", "enriched:sapphire", "enriched:sapphire_steel_chestplate"));
        enabledFeatures.add(smithing("sapphire_steel_infused_leggings", "enriched:steel_leggings", "enriched:sapphire", "enriched:sapphire_steel_leggings"));
        enabledFeatures.add(smithing("sapphire_steel_infused_boots", "enriched:steel_boots", "enriched:sapphire", "enriched:sapphire_steel_boots"));


        enabledFeatures.add(smithing("ruby_steel_infused_pickaxe", "enriched:steel_pickaxe", "enriched:ruby", "enriched:ruby_steel_pickaxe"));
        enabledFeatures.add(smithing("ruby_steel_infused_sword", "enriched:steel_sword", "enriched:ruby", "enriched:ruby_steel_sword"));
        enabledFeatures.add(smithing("ruby_steel_infused_shovel", "enriched:steel_shovel", "enriched:ruby", "enriched:ruby_steel_shovel"));
        enabledFeatures.add(smithing("ruby_steel_infused_hoe", "enriched:steel_hoe", "enriched:ruby", "enriched:ruby_steel_hoe"));
        enabledFeatures.add(smithing("ruby_steel_infused_axe", "enriched:steel_axe", "enriched:ruby", "enriched:ruby_steel_axe"));

        enabledFeatures.add(smithing("ruby_steel_infused_helmet", "enriched:steel_helmet", "enriched:ruby", "enriched:ruby_steel_helmet"));
        enabledFeatures.add(smithing("ruby_steel_infused_chestplate", "enriched:steel_chestplate", "enriched:ruby", "enriched:ruby_steel_chestplate"));
        enabledFeatures.add(smithing("ruby_steel_infused_leggings", "enriched:steel_leggings", "enriched:ruby", "enriched:ruby_steel_leggings"));
        enabledFeatures.add(smithing("ruby_steel_infused_boots", "enriched:steel_boots", "enriched:ruby", "enriched:ruby_steel_boots"));

        enabledFeatures.add(smithing("tanzanite_steel_infused_pickaxe", "enriched:steel_pickaxe", "enriched:tanzanite", "enriched:tanzanite_steel_pickaxe"));
        enabledFeatures.add(smithing("tanzanite_steel_infused_sword", "enriched:steel_sword", "enriched:tanzanite", "enriched:tanzanite_steel_sword"));
        enabledFeatures.add(smithing("tanzanite_steel_infused_shovel", "enriched:steel_shovel", "enriched:tanzanite", "enriched:tanzanite_steel_shovel"));
        enabledFeatures.add(smithing("tanzanite_steel_infused_hoe", "enriched:steel_hoe", "enriched:tanzanite", "enriched:tanzanite_steel_hoe"));
        enabledFeatures.add(smithing("tanzanite_steel_infused_axe", "enriched:steel_axe", "enriched:tanzanite", "enriched:tanzanite_steel_axe"));

        enabledFeatures.add(smithing("tanzanite_steel_infused_helmet", "enriched:steel_helmet", "enriched:tanzanite", "enriched:tanzanite_steel_helmet"));
        enabledFeatures.add(smithing("tanzanite_steel_infused_chestplate", "enriched:steel_chestplate", "enriched:tanzanite", "enriched:tanzanite_steel_chestplate"));
        enabledFeatures.add(smithing("tanzanite_steel_infused_leggings", "enriched:steel_leggings", "enriched:tanzanite", "enriched:tanzanite_steel_leggings"));
        enabledFeatures.add(smithing("tanzanite_steel_infused_boots", "enriched:steel_boots", "enriched:tanzanite", "enriched:tanzanite_steel_boots"));


        enabledFeatures.add(smithing("diamond_steel_infused_pickaxe", "enriched:steel_pickaxe", "minecraft:diamond", "enriched:diamond_steel_pickaxe"));
        enabledFeatures.add(smithing("diamond_steel_infused_sword", "enriched:steel_sword", "minecraft:diamond", "enriched:diamond_steel_sword"));
        enabledFeatures.add(smithing("diamond_steel_infused_shovel", "enriched:steel_shovel", "minecraft:diamond", "enriched:diamond_steel_shovel"));
        enabledFeatures.add(smithing("diamond_steel_infused_hoe", "enriched:steel_hoe", "minecraft:diamond", "enriched:diamond_steel_hoe"));
        enabledFeatures.add(smithing("diamond_steel_infused_axe", "enriched:steel_axe", "minecraft:diamond", "enriched:diamond_steel_axe"));

        enabledFeatures.add(smithing("diamond_steel_infused_helmet", "enriched:steel_helmet", "minecraft:diamond", "enriched:diamond_steel_helmet"));
        enabledFeatures.add(smithing("diamond_steel_infused_chestplate", "enriched:steel_chestplate", "minecraft:diamond", "enriched:diamond_steel_chestplate"));
        enabledFeatures.add(smithing("diamond_steel_infused_leggings", "enriched:steel_leggings", "minecraft:diamond", "enriched:diamond_steel_leggings"));
        enabledFeatures.add(smithing("diamond_steel_infused_boots", "enriched:steel_boots", "minecraft:diamond", "enriched:diamond_steel_boots"));

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
            String name, String input, String upgrade,  String output) {
        final Identifier identifier = Enriched.identifier(name);
        final JsonObject json = new JsonObject();
        json.addProperty("type", "minecraft:smithing");

        final JsonObject base = new JsonObject();
        base.addProperty("item",input);
        json.add("base", base);

        final JsonObject addition = new JsonObject();
        json.add("addition", addition);
        addition.addProperty("item", upgrade);

        final JsonObject result = new JsonObject();
        result.addProperty("item", output);
        json.add("result", result);


        return new Pair<>(identifier, json);
    }
}