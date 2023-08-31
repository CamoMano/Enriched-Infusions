package com.enrichedmc.infusions.materials.items;

import com.enrichedmc.registry.ModInit;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialDiamondSteel implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private static final int[] PROTECTION_AMOUNTS = new int[]{3, 5, 7, 3};

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.getEquipmentSlot().getEntitySlotId()] * 30;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTION_AMOUNTS[type.getEquipmentSlot().getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 9;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModInit.STEEL_INGOT);
    }

    @Override
    public String getName() {
        return "diamond_steel";
    }

    @Override
    public float getToughness() {
        return 2.0f;
    }

    @Override
    public float getKnockbackResistance() {
        return 0.2f;
    }
}
