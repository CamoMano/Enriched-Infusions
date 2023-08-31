package com.enrichedmc.infusions.registry;

import static com.enrichedmc.registry.ModInit.item;
import static net.minecraft.item.ItemGroups.COMBAT;
import static net.minecraft.item.ItemGroups.TOOLS;

import com.enrichedmc.infusions.materials.items.*;
import com.enrichedmc.items.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class ModInit {

    public static final ArmorMaterial EMERALD_STEEL_ARMOR = new ArmorMaterialEmeraldSteel();
    public static final ArmorMaterial SAPPHIRE_STEEL_ARMOR = new ArmorMaterialSapphireSteel();
    public static final ArmorMaterial RUBY_STEEL_ARMOR = new ArmorMaterialRubySteel();
    public static final ArmorMaterial TANZANITE_STEEL_ARMOR = new ArmorMaterialTanzaniteSteel();
    public static final ArmorMaterial DIAMOND_STEEL_ARMOR = new ArmorMaterialDiamondSteel();
    public static final ArmorMaterial EMERALD_OBSIDIAN_ARMOR = new ArmorMaterialEmeraldObsidian();
    public static final ArmorMaterial SAPPHIRE_OBSIDIAN_ARMOR = new ArmorMaterialSapphireObsidian();
    public static final ArmorMaterial RUBY_OBSIDIAN_ARMOR = new ArmorMaterialRubyObsidian();
    public static final ArmorMaterial TANZANITE_OBSIDIAN_ARMOR = new ArmorMaterialTanzaniteObsidian();
    public static final ArmorMaterial DIAMOND_OBSIDIAN_ARMOR = new ArmorMaterialDiamondObsidian();


    public static final Item EMERALD_STEEL_HELMET =
            new ArmorItem(EMERALD_STEEL_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item EMERALD_STEEL_CHESTPLATE =
            new ArmorItem(EMERALD_STEEL_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item EMERALD_STEEL_LEGGINGS =
            new ArmorItem(EMERALD_STEEL_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item EMERALD_STEEL_BOOTS =
            new ArmorItem(EMERALD_STEEL_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());


    public static final Item SAPPHIRE_STEEL_HELMET =
            new ArmorItem(SAPPHIRE_STEEL_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item SAPPHIRE_STEEL_CHESTPLATE =
            new ArmorItem(SAPPHIRE_STEEL_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item SAPPHIRE_STEEL_LEGGINGS =
            new ArmorItem(SAPPHIRE_STEEL_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item SAPPHIRE_STEEL_BOOTS =
            new ArmorItem(SAPPHIRE_STEEL_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item RUBY_STEEL_HELMET =
            new ArmorItem(RUBY_STEEL_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item RUBY_STEEL_CHESTPLATE =
            new ArmorItem(RUBY_STEEL_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item RUBY_STEEL_LEGGINGS =
            new ArmorItem(RUBY_STEEL_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item RUBY_STEEL_BOOTS =
            new ArmorItem(RUBY_STEEL_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item TANZANITE_STEEL_HELMET =
            new ArmorItem(TANZANITE_STEEL_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item TANZANITE_STEEL_CHESTPLATE =
            new ArmorItem(TANZANITE_STEEL_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item TANZANITE_STEEL_LEGGINGS =
            new ArmorItem(TANZANITE_STEEL_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item TANZANITE_STEEL_BOOTS =
            new ArmorItem(TANZANITE_STEEL_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item DIAMOND_STEEL_HELMET =
            new ArmorItem(DIAMOND_STEEL_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item DIAMOND_STEEL_CHESTPLATE =
            new ArmorItem(DIAMOND_STEEL_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item DIAMOND_STEEL_LEGGINGS =
            new ArmorItem(DIAMOND_STEEL_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item DIAMOND_STEEL_BOOTS =
            new ArmorItem(DIAMOND_STEEL_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item EMERALD_OBSIDIAN_HELMET =
            new ArmorItem(EMERALD_OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item EMERALD_OBSIDIAN_CHESTPLATE =
            new ArmorItem(EMERALD_OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item EMERALD_OBSIDIAN_LEGGINGS =
            new ArmorItem(EMERALD_OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item EMERALD_OBSIDIAN_BOOTS =
            new ArmorItem(EMERALD_OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item SAPPHIRE_OBSIDIAN_HELMET =
            new ArmorItem(SAPPHIRE_OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item SAPPHIRE_OBSIDIAN_CHESTPLATE =
            new ArmorItem(SAPPHIRE_OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item SAPPHIRE_OBSIDIAN_LEGGINGS =
            new ArmorItem(SAPPHIRE_OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item SAPPHIRE_OBSIDIAN_BOOTS =
            new ArmorItem(SAPPHIRE_OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item RUBY_OBSIDIAN_HELMET =
            new ArmorItem(RUBY_OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item RUBY_OBSIDIAN_CHESTPLATE =
            new ArmorItem(RUBY_OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item RUBY_OBSIDIAN_LEGGINGS =
            new ArmorItem(RUBY_OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item RUBY_OBSIDIAN_BOOTS =
            new ArmorItem(RUBY_OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item TANZANITE_OBSIDIAN_HELMET =
            new ArmorItem(TANZANITE_OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item TANZANITE_OBSIDIAN_CHESTPLATE =
            new ArmorItem(TANZANITE_OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item TANZANITE_OBSIDIAN_LEGGINGS =
            new ArmorItem(TANZANITE_OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item TANZANITE_OBSIDIAN_BOOTS =
            new ArmorItem(TANZANITE_OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item DIAMOND_OBSIDIAN_HELMET =
            new ArmorItem(DIAMOND_OBSIDIAN_ARMOR, ArmorItem.Type.HELMET, new Item.Settings());
    public static final Item DIAMOND_OBSIDIAN_CHESTPLATE =
            new ArmorItem(DIAMOND_OBSIDIAN_ARMOR, ArmorItem.Type.CHESTPLATE, new Item.Settings());
    public static final Item DIAMOND_OBSIDIAN_LEGGINGS =
            new ArmorItem(DIAMOND_OBSIDIAN_ARMOR, ArmorItem.Type.LEGGINGS, new Item.Settings());
    public static final Item DIAMOND_OBSIDIAN_BOOTS =
            new ArmorItem(DIAMOND_OBSIDIAN_ARMOR, ArmorItem.Type.BOOTS, new Item.Settings());

    public static final Item EMERALD_STEEL_PICKAXE = new PickaxeBase(new ToolMaterialEmeraldSteel());
    public static final Item EMERALD_STEEL_SWORD = new SwordBase(new ToolMaterialEmeraldSteel());
    public static final Item EMERALD_STEEL_AXE = new AxeBase(new ToolMaterialEmeraldSteel());
    public static final Item EMERALD_STEEL_SHOVEL = new ShovelBase(new ToolMaterialEmeraldSteel());
    public static final Item EMERALD_STEEL_HOE = new HoeBase(new ToolMaterialEmeraldSteel());

    public static final Item SAPPHIRE_STEEL_PICKAXE = new PickaxeBase(new ToolMaterialSapphireSteel());
    public static final Item SAPPHIRE_STEEL_SWORD = new SwordBase(new ToolMaterialSapphireSteel());
    public static final Item SAPPHIRE_STEEL_AXE = new AxeBase(new ToolMaterialSapphireSteel());
    public static final Item SAPPHIRE_STEEL_SHOVEL = new ShovelBase(new ToolMaterialSapphireSteel());
    public static final Item SAPPHIRE_STEEL_HOE = new HoeBase(new ToolMaterialSapphireSteel());

    public static final Item RUBY_STEEL_PICKAXE = new PickaxeBase(new ToolMaterialRubySteel());
    public static final Item RUBY_STEEL_SWORD = new SwordBase(new ToolMaterialRubySteel());
    public static final Item RUBY_STEEL_AXE = new AxeBase(new ToolMaterialRubySteel());
    public static final Item RUBY_STEEL_SHOVEL = new ShovelBase(new ToolMaterialRubySteel());
    public static final Item RUBY_STEEL_HOE = new HoeBase(new ToolMaterialRubySteel());

    public static final Item TANZANITE_STEEL_PICKAXE = new PickaxeBase(new ToolMaterialTanzaniteSteel());
    public static final Item TANZANITE_STEEL_SWORD = new SwordBase(new ToolMaterialTanzaniteSteel());
    public static final Item TANZANITE_STEEL_AXE = new AxeBase(new ToolMaterialTanzaniteSteel());
    public static final Item TANZANITE_STEEL_SHOVEL = new ShovelBase(new ToolMaterialTanzaniteSteel());
    public static final Item TANZANITE_STEEL_HOE = new HoeBase(new ToolMaterialTanzaniteSteel());

    public static final Item DIAMOND_STEEL_PICKAXE = new PickaxeBase(new ToolMaterialDiamondSteel());
    public static final Item DIAMOND_STEEL_SWORD = new SwordBase(new ToolMaterialDiamondSteel());
    public static final Item DIAMOND_STEEL_AXE = new AxeBase(new ToolMaterialDiamondSteel());
    public static final Item DIAMOND_STEEL_SHOVEL = new ShovelBase(new ToolMaterialDiamondSteel());
    public static final Item DIAMOND_STEEL_HOE = new HoeBase(new ToolMaterialDiamondSteel());


    public static final Item EMERALD_OBSIDIAN_PICKAXE = new PickaxeBase(new ToolMaterialEmeraldObsidian());
    public static final Item EMERALD_OBSIDIAN_SWORD = new SwordBase(new ToolMaterialEmeraldObsidian());
    public static final Item EMERALD_OBSIDIAN_AXE = new AxeBase(new ToolMaterialEmeraldObsidian());
    public static final Item EMERALD_OBSIDIAN_SHOVEL = new ShovelBase(new ToolMaterialEmeraldObsidian());
    public static final Item EMERALD_OBSIDIAN_HOE = new HoeBase(new ToolMaterialEmeraldObsidian());

    public static final Item SAPPHIRE_OBSIDIAN_PICKAXE = new PickaxeBase(new ToolMaterialSapphireObsidian());
    public static final Item SAPPHIRE_OBSIDIAN_SWORD = new SwordBase(new ToolMaterialSapphireObsidian());
    public static final Item SAPPHIRE_OBSIDIAN_AXE = new AxeBase(new ToolMaterialSapphireObsidian());
    public static final Item SAPPHIRE_OBSIDIAN_SHOVEL = new ShovelBase(new ToolMaterialSapphireObsidian());
    public static final Item SAPPHIRE_OBSIDIAN_HOE = new HoeBase(new ToolMaterialSapphireObsidian());

    public static final Item RUBY_OBSIDIAN_PICKAXE = new PickaxeBase(new ToolMaterialRubyObsidian());
    public static final Item RUBY_OBSIDIAN_SWORD = new SwordBase(new ToolMaterialRubyObsidian());
    public static final Item RUBY_OBSIDIAN_AXE = new AxeBase(new ToolMaterialRubyObsidian());
    public static final Item RUBY_OBSIDIAN_SHOVEL = new ShovelBase(new ToolMaterialRubyObsidian());
    public static final Item RUBY_OBSIDIAN_HOE = new HoeBase(new ToolMaterialRubyObsidian());

    public static final Item TANZANITE_OBSIDIAN_PICKAXE = new PickaxeBase(new ToolMaterialTanzaniteObsidian());
    public static final Item TANZANITE_OBSIDIAN_SWORD = new SwordBase(new ToolMaterialTanzaniteObsidian());
    public static final Item TANZANITE_OBSIDIAN_AXE = new AxeBase(new ToolMaterialTanzaniteObsidian());
    public static final Item TANZANITE_OBSIDIAN_SHOVEL = new ShovelBase(new ToolMaterialTanzaniteObsidian());
    public static final Item TANZANITE_OBSIDIAN_HOE = new HoeBase(new ToolMaterialTanzaniteObsidian());

    public static final Item DIAMOND_OBSIDIAN_PICKAXE = new PickaxeBase(new ToolMaterialDiamondObsidian());
    public static final Item DIAMOND_OBSIDIAN_SWORD = new SwordBase(new ToolMaterialDiamondObsidian());
    public static final Item DIAMOND_OBSIDIAN_AXE = new AxeBase(new ToolMaterialDiamondObsidian());
    public static final Item DIAMOND_OBSIDIAN_SHOVEL = new ShovelBase(new ToolMaterialDiamondObsidian());
    public static final Item DIAMOND_OBSIDIAN_HOE = new HoeBase(new ToolMaterialDiamondObsidian());




    public static void Register() {
        
        
        //Emerald Steel Tools
        item("emerald_steel_shovel", EMERALD_STEEL_SHOVEL);
        item("emerald_steel_pickaxe", EMERALD_STEEL_PICKAXE);
        item("emerald_steel_axe", EMERALD_STEEL_AXE);
        item("emerald_steel_sword", EMERALD_STEEL_SWORD);
        item("emerald_steel_hoe", EMERALD_STEEL_HOE);
        //Emerald Steel Armor
        item("emerald_steel_helmet", EMERALD_STEEL_HELMET);
        item("emerald_steel_chestplate", EMERALD_STEEL_CHESTPLATE);
        item("emerald_steel_leggings",EMERALD_STEEL_LEGGINGS);
        item("emerald_steel_boots", EMERALD_STEEL_BOOTS);
        //Emerald Obsidian Tools
        item("emerald_obsidian_shovel", EMERALD_OBSIDIAN_SHOVEL);
        item("emerald_obsidian_pickaxe", EMERALD_OBSIDIAN_PICKAXE);
        item("emerald_obsidian_axe", EMERALD_OBSIDIAN_AXE);
        item("emerald_obsidian_sword", EMERALD_OBSIDIAN_SWORD);
        item("emerald_obsidian_hoe", EMERALD_OBSIDIAN_HOE);
        //Emerald Obsidian Armor
        item("emerald_obsidian_helmet", EMERALD_OBSIDIAN_HELMET);
        item("emerald_obsidian_chestplate", EMERALD_OBSIDIAN_CHESTPLATE);
        item("emerald_obsidian_leggings",EMERALD_OBSIDIAN_LEGGINGS);
        item("emerald_obsidian_boots", EMERALD_OBSIDIAN_BOOTS);


        //Sapphire Steel Tools
        item("sapphire_steel_shovel", SAPPHIRE_STEEL_SHOVEL);
        item("sapphire_steel_pickaxe", SAPPHIRE_STEEL_PICKAXE);
        item("sapphire_steel_axe", SAPPHIRE_STEEL_AXE);
        item("sapphire_steel_sword", SAPPHIRE_STEEL_SWORD);
        item("sapphire_steel_hoe", SAPPHIRE_STEEL_HOE);
        //Sapphire Steel Armor
        item("sapphire_steel_helmet", SAPPHIRE_STEEL_HELMET);
        item("sapphire_steel_chestplate", SAPPHIRE_STEEL_CHESTPLATE);
        item("sapphire_steel_leggings",SAPPHIRE_STEEL_LEGGINGS);
        item("sapphire_steel_boots", SAPPHIRE_STEEL_BOOTS);
        //Sapphire Obsidian Tools
        item("sapphire_obsidian_shovel", SAPPHIRE_OBSIDIAN_SHOVEL);
        item("sapphire_obsidian_pickaxe", SAPPHIRE_OBSIDIAN_PICKAXE);
        item("sapphire_obsidian_axe", SAPPHIRE_OBSIDIAN_AXE);
        item("sapphire_obsidian_sword", SAPPHIRE_OBSIDIAN_SWORD);
        item("sapphire_obsidian_hoe", SAPPHIRE_OBSIDIAN_HOE);
        //Sapphire Obsidian Armor
        item("sapphire_obsidian_helmet", SAPPHIRE_OBSIDIAN_HELMET);
        item("sapphire_obsidian_chestplate", SAPPHIRE_OBSIDIAN_CHESTPLATE);
        item("sapphire_obsidian_leggings",SAPPHIRE_OBSIDIAN_LEGGINGS);
        item("sapphire_obsidian_boots", SAPPHIRE_OBSIDIAN_BOOTS);


        //Ruby Steel Tools
        item("ruby_steel_shovel", RUBY_STEEL_SHOVEL);
        item("ruby_steel_pickaxe", RUBY_STEEL_PICKAXE);
        item("ruby_steel_axe", RUBY_STEEL_AXE);
        item("ruby_steel_sword", RUBY_STEEL_SWORD);
        item("ruby_steel_hoe", RUBY_STEEL_HOE);
        //Ruby Steel Armor
        item("ruby_steel_helmet", RUBY_STEEL_HELMET);
        item("ruby_steel_chestplate", RUBY_STEEL_CHESTPLATE);
        item("ruby_steel_leggings",RUBY_STEEL_LEGGINGS);
        item("ruby_steel_boots", RUBY_STEEL_BOOTS);
        //Ruby Obsidian Tools
        item("ruby_obsidian_shovel", RUBY_OBSIDIAN_SHOVEL);
        item("ruby_obsidian_pickaxe", RUBY_OBSIDIAN_PICKAXE);
        item("ruby_obsidian_axe", RUBY_OBSIDIAN_AXE);
        item("ruby_obsidian_sword", RUBY_OBSIDIAN_SWORD);
        item("ruby_obsidian_hoe", RUBY_OBSIDIAN_HOE);
        //Ruby Obsidian Armor
        item("ruby_obsidian_helmet", RUBY_OBSIDIAN_HELMET);
        item("ruby_obsidian_chestplate", RUBY_OBSIDIAN_CHESTPLATE);
        item("ruby_obsidian_leggings",RUBY_OBSIDIAN_LEGGINGS);
        item("ruby_obsidian_boots", RUBY_OBSIDIAN_BOOTS);


        //Tanzanite Steel Tools
        item("tanzanite_steel_shovel", TANZANITE_STEEL_SHOVEL);
        item("tanzanite_steel_pickaxe", TANZANITE_STEEL_PICKAXE);
        item("tanzanite_steel_axe", TANZANITE_STEEL_AXE);
        item("tanzanite_steel_sword", TANZANITE_STEEL_SWORD);
        item("tanzanite_steel_hoe", TANZANITE_STEEL_HOE);
        //Tanzanite Steel Armor
        item("tanzanite_steel_helmet", TANZANITE_STEEL_HELMET);
        item("tanzanite_steel_chestplate", TANZANITE_STEEL_CHESTPLATE);
        item("tanzanite_steel_leggings",TANZANITE_STEEL_LEGGINGS);
        item("tanzanite_steel_boots", TANZANITE_STEEL_BOOTS);
        //Tanzanite Obsidian Tools
        item("tanzanite_obsidian_shovel", TANZANITE_OBSIDIAN_SHOVEL);
        item("tanzanite_obsidian_pickaxe", TANZANITE_OBSIDIAN_PICKAXE);
        item("tanzanite_obsidian_axe", TANZANITE_OBSIDIAN_AXE);
        item("tanzanite_obsidian_sword", TANZANITE_OBSIDIAN_SWORD);
        item("tanzanite_obsidian_hoe", TANZANITE_OBSIDIAN_HOE);
        //Tanzanite Obsidian Armor
        item("tanzanite_obsidian_helmet", TANZANITE_OBSIDIAN_HELMET);
        item("tanzanite_obsidian_chestplate", TANZANITE_OBSIDIAN_CHESTPLATE);
        item("tanzanite_obsidian_leggings",TANZANITE_OBSIDIAN_LEGGINGS);
        item("tanzanite_obsidian_boots", TANZANITE_OBSIDIAN_BOOTS);


        //Diamond Steel Tools
        item("diamond_steel_shovel", DIAMOND_STEEL_SHOVEL);
        item("diamond_steel_pickaxe", DIAMOND_STEEL_PICKAXE);
        item("diamond_steel_axe", DIAMOND_STEEL_AXE);
        item("diamond_steel_sword", DIAMOND_STEEL_SWORD);
        item("diamond_steel_hoe", DIAMOND_STEEL_HOE);
        //Diamond Steel Armor
        item("diamond_steel_helmet", DIAMOND_STEEL_HELMET);
        item("diamond_steel_chestplate", DIAMOND_STEEL_CHESTPLATE);
        item("diamond_steel_leggings",DIAMOND_STEEL_LEGGINGS);
        item("diamond_steel_boots", DIAMOND_STEEL_BOOTS);
        //Diamond Obsidian Tools
        item("diamond_obsidian_shovel", DIAMOND_OBSIDIAN_SHOVEL);
        item("diamond_obsidian_pickaxe", DIAMOND_OBSIDIAN_PICKAXE);
        item("diamond_obsidian_axe", DIAMOND_OBSIDIAN_AXE);
        item("diamond_obsidian_sword", DIAMOND_OBSIDIAN_SWORD);
        item("diamond_obsidian_hoe", DIAMOND_OBSIDIAN_HOE);
        //Diamond Obsidian Armor
        item("diamond_obsidian_helmet", DIAMOND_OBSIDIAN_HELMET);
        item("diamond_obsidian_chestplate", DIAMOND_OBSIDIAN_CHESTPLATE);
        item("diamond_obsidian_leggings",DIAMOND_OBSIDIAN_LEGGINGS);
        item("diamond_obsidian_boots", DIAMOND_OBSIDIAN_BOOTS);









        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_STEEL_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_STEEL_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_STEEL_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_STEEL_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_STEEL_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_STEEL_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_STEEL_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_STEEL_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_STEEL_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_STEEL_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_STEEL_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_STEEL_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_STEEL_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_STEEL_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_STEEL_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_STEEL_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_STEEL_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_STEEL_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_STEEL_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_STEEL_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_STEEL_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_STEEL_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_STEEL_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_STEEL_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_STEEL_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_STEEL_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_STEEL_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_STEEL_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_STEEL_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_STEEL_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_STEEL_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_STEEL_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_STEEL_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_STEEL_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_STEEL_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_STEEL_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_STEEL_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_STEEL_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_STEEL_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_STEEL_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_STEEL_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_STEEL_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_STEEL_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_STEEL_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_STEEL_HOE));



        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_OBSIDIAN_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_OBSIDIAN_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_OBSIDIAN_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_OBSIDIAN_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(EMERALD_OBSIDIAN_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_OBSIDIAN_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_OBSIDIAN_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_OBSIDIAN_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(EMERALD_OBSIDIAN_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(SAPPHIRE_OBSIDIAN_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_OBSIDIAN_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_OBSIDIAN_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_OBSIDIAN_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_OBSIDIAN_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(RUBY_OBSIDIAN_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_OBSIDIAN_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_OBSIDIAN_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_OBSIDIAN_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(RUBY_OBSIDIAN_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_OBSIDIAN_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_OBSIDIAN_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_OBSIDIAN_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_OBSIDIAN_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(TANZANITE_OBSIDIAN_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_OBSIDIAN_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_OBSIDIAN_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_OBSIDIAN_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(TANZANITE_OBSIDIAN_HOE));

        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_OBSIDIAN_HELMET));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_OBSIDIAN_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_OBSIDIAN_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_OBSIDIAN_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(COMBAT).register(entries -> entries.add(DIAMOND_OBSIDIAN_SWORD));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_OBSIDIAN_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_OBSIDIAN_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_OBSIDIAN_AXE));
        ItemGroupEvents.modifyEntriesEvent(TOOLS).register(entries -> entries.add(DIAMOND_OBSIDIAN_HOE));
        
    }





}
