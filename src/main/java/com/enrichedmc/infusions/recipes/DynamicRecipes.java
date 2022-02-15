package com.enrichedmc.infusions.recipes;

import com.google.gson.JsonObject;
import com.enrichedmc.Enriched;
import com.enrichedmc.builder.ShapedRecipeBuilder;
import com.enrichedmc.infusions.config.ModConfig;
import net.minecraft.util.Identifier;
import net.minecraft.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicRecipes {
    public static final Map<Identifier, JsonObject> REGISTRY = new HashMap<>();

    public static void register(ModConfig config) {
        final List<Pair<Identifier, JsonObject>> enabledFeatures = new ArrayList<>();

        if (config.enableEmeraldSteelGear) {
            enabledFeatures.add(pickaxe_tag("emerald_steel_pickaxe", "c:steel_ingots", "enriched-infusions:emerald_steel_pickaxe"));
            enabledFeatures.add(sword_tag("emerald_steel_sword", "c:steel_ingots", "enriched-infusions:emerald_steel_sword"));
            enabledFeatures.add(axe_tag("emerald_steel_axe", "c:steel_ingots", "enriched-infusions:emerald_steel_axe"));
            enabledFeatures.add(shovel_tag("emerald_steel_shovel", "c:steel_ingots", "enriched-infusions:emerald_steel_shovel"));
            enabledFeatures.add(hoe_tag("emerald_steel_hoe", "c:steel_ingots", "enriched-infusions:emerald_steel_hoe"));
            enabledFeatures.add(helmet_tag("emerald_steel_helmet", "c:steel_ingots", "enriched-infusions:emerald_steel_helmet"));
            enabledFeatures.add(chestplate_tag("emerald_steel_chestplate", "c:steel_ingots", "enriched-infusions:emerald_steel_chestplate"));
            enabledFeatures.add(leggings_tag("emerald_steel_leggings", "c:steel_ingots", "enriched-infusions:emerald_steel_leggings"));
            enabledFeatures.add(boots_tag("emerald_steel_boots", "c:steel_ingots", "enriched-infusions:emerald_steel_boots"));
            enabledFeatures.add(blend("emerald_steel_blend", "minecraft:iron_ingot", "minecraft:coal", "enriched-infusions:emerald_steel_ingot"));
            enabledFeatures.add(blasting("steel_ingot_blasting", "enriched:steel_blend", "enriched:steel_ingot", 0.7, 100));
            enabledFeatures.add(block("emerald_steel_block", "enriched:steel_ingot", "enriched-infusions:emerald_steel_block", 1));
            enabledFeatures.add(uncrafting("emerald_steel_ingot", "enriched:steel_block", "enriched-infusions:emerald_infused_steel_ingot", 9));
        }


        enabledFeatures.forEach(it -> REGISTRY.put(it.getLeft(), it.getRight()));
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
            String name, String input, String output, double experience, int cookingTime
    ) {
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
}