package com.enrichedmc.infusions.materials.items;

import com.enrichedmc.registry.ModInit;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialRubySteel implements ToolMaterial {
    @Override
    public int getDurability() {
        return 850;
    }

    @Override
    public float getAttackDamage() {
        return 5.0F;
    }

    @Override
    public int getMiningLevel() {
        return 3;
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModInit.STEEL_INGOT);
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }
}
