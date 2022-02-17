package com.enrichedmc.infusions.registry;

import com.enrichedmc.infusions.materials.items.*;
import com.enrichedmc.items.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;

import static com.enrichedmc.registry.ModInit.item;

public class ModInit {

    public static final ArmorMaterial EMERALD_STEEL_ARMOR = new ArmorMaterialEmeraldSteel();
    public static final ArmorMaterial SAPPHIRE_STEEL_ARMOR = new ArmorMaterialSapphireSteel();
    public static final ArmorMaterial RUBY_STEEL_ARMOR = new ArmorMaterialRubySteel();
    public static final ArmorMaterial TANZANITE_STEEL_ARMOR = new ArmorMaterialTanzaniteSteel();
    public static final ArmorMaterial DIAMOND_STEEL_ARMOR = new ArmorMaterialDiamondSteel();

    public static void Register() {
        
        //Emerald Steel Tools
        item("emerald_steel_shovel", new ShovelBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_pickaxe", new PickaxeBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_axe", new AxeBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_sword", new SwordBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_hoe", new HoeBase(new ToolMaterialEmeraldSteel()));
        //Emerald Steel Armor
        item("emerald_steel_helmet", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.HEAD));
        item("emerald_steel_chestplate", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.CHEST));
        item("emerald_steel_leggings", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.LEGS));
        item("emerald_steel_boots", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.FEET));


        //Sapphire Steel Tools
        item("sapphire_steel_shovel", new ShovelBase(new ToolMaterialSapphireSteel()));
        item("sapphire_steel_pickaxe", new PickaxeBase(new ToolMaterialSapphireSteel()));
        item("sapphire_steel_axe", new AxeBase(new ToolMaterialSapphireSteel()));
        item("sapphire_steel_sword", new SwordBase(new ToolMaterialSapphireSteel()));
        item("sapphire_steel_hoe", new HoeBase(new ToolMaterialSapphireSteel()));
        //Sapphire Steel Armor
        item("sapphire_steel_helmet", new ArmorBase(SAPPHIRE_STEEL_ARMOR, EquipmentSlot.HEAD));
        item("sapphire_steel_chestplate", new ArmorBase(SAPPHIRE_STEEL_ARMOR, EquipmentSlot.CHEST));
        item("sapphire_steel_leggings", new ArmorBase(SAPPHIRE_STEEL_ARMOR, EquipmentSlot.LEGS));
        item("sapphire_steel_boots", new ArmorBase(SAPPHIRE_STEEL_ARMOR, EquipmentSlot.FEET));


        //Ruby Steel Tools
        item("ruby_steel_shovel", new ShovelBase(new ToolMaterialRubySteel()));
        item("ruby_steel_pickaxe", new PickaxeBase(new ToolMaterialRubySteel()));
        item("ruby_steel_axe", new AxeBase(new ToolMaterialRubySteel()));
        item("ruby_steel_sword", new SwordBase(new ToolMaterialRubySteel()));
        item("ruby_steel_hoe", new HoeBase(new ToolMaterialRubySteel()));
        //Ruby Steel Armor
        item("ruby_steel_helmet", new ArmorBase(RUBY_STEEL_ARMOR, EquipmentSlot.HEAD));
        item("ruby_steel_chestplate", new ArmorBase(RUBY_STEEL_ARMOR, EquipmentSlot.CHEST));
        item("ruby_steel_leggings", new ArmorBase(RUBY_STEEL_ARMOR, EquipmentSlot.LEGS));
        item("ruby_steel_boots", new ArmorBase(RUBY_STEEL_ARMOR, EquipmentSlot.FEET));


        //Tanzanite Steel Tools
        item("tanzanite_steel_shovel", new ShovelBase(new ToolMaterialTanzaniteSteel()));
        item("tanzanite_steel_pickaxe", new PickaxeBase(new ToolMaterialTanzaniteSteel()));
        item("tanzanite_steel_axe", new AxeBase(new ToolMaterialTanzaniteSteel()));
        item("tanzanite_steel_sword", new SwordBase(new ToolMaterialTanzaniteSteel()));
        item("tanzanite_steel_hoe", new HoeBase(new ToolMaterialTanzaniteSteel()));
        //Tanzanite Steel Armor
        item("tanzanite_steel_helmet", new ArmorBase(TANZANITE_STEEL_ARMOR, EquipmentSlot.HEAD));
        item("tanzanite_steel_chestplate", new ArmorBase(TANZANITE_STEEL_ARMOR, EquipmentSlot.CHEST));
        item("tanzanite_steel_leggings", new ArmorBase(TANZANITE_STEEL_ARMOR, EquipmentSlot.LEGS));
        item("tanzanite_steel_boots", new ArmorBase(TANZANITE_STEEL_ARMOR, EquipmentSlot.FEET));


        //Diamond Steel Tools
        item("diamond_steel_shovel", new ShovelBase(new ToolMaterialDiamondSteel()));
        item("diamond_steel_pickaxe", new PickaxeBase(new ToolMaterialDiamondSteel()));
        item("diamond_steel_axe", new AxeBase(new ToolMaterialDiamondSteel()));
        item("diamond_steel_sword", new SwordBase(new ToolMaterialDiamondSteel()));
        item("diamond_steel_hoe", new HoeBase(new ToolMaterialDiamondSteel()));
        //Diamond Steel Armor
        item("diamond_steel_helmet", new ArmorBase(DIAMOND_STEEL_ARMOR, EquipmentSlot.HEAD));
        item("diamond_steel_chestplate", new ArmorBase(DIAMOND_STEEL_ARMOR, EquipmentSlot.CHEST));
        item("diamond_steel_leggings", new ArmorBase(DIAMOND_STEEL_ARMOR, EquipmentSlot.LEGS));
        item("diamond_steel_boots", new ArmorBase(DIAMOND_STEEL_ARMOR, EquipmentSlot.FEET));
        
    }





}
