package com.enrichedmc.infusions.materials.items;

import com.enrichedmc.registry.ModInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialEmeraldObsidian implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1820;
    }

    @Override
    public float getAttackDamage() {
        return 4.5F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModInit.OBSIDIAN_ALLOY_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0F;
    }
}
