package com.enrichedmc.infusions.registry;

import com.enrichedmc.infusions.materials.items.ArmorMaterialEmeraldSteel;
import com.enrichedmc.infusions.materials.items.ToolMaterialEmeraldSteel;
import com.enrichedmc.items.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;

import static com.enrichedmc.registry.ModInit.*;

public class ModInit {

    public static final ArmorMaterial EMERALD_STEEL_ARMOR = new ArmorMaterialEmeraldSteel();
    public static final Item EMERALD_INFUSED_STEEL_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Block EMERALD_STEEL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).requiresTool().sounds(BlockSoundGroup.METAL).strength(6.0f, 7.0f));

    public static void Register() {

        //Steel Ingot/Block
        item("emerald_infused_steel_ingot", EMERALD_INFUSED_STEEL_INGOT);
        block("emerald_steel_block", EMERALD_STEEL_BLOCK);
        blockItem("emerald_steel_block", EMERALD_STEEL_BLOCK, ItemGroup.BUILDING_BLOCKS);
        //Steel Tools
        item("emerald_steel_shovel", new ShovelBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_pickaxe", new PickaxeBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_axe", new AxeBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_sword", new SwordBase(new ToolMaterialEmeraldSteel()));
        item("emerald_steel_hoe", new HoeBase(new ToolMaterialEmeraldSteel()));
        //Steel Armor
        item("emerald_steel_helmet", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.HEAD));
        item("emerald_steel_chestplate", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.CHEST));
        item("emerald_steel_leggings", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.LEGS));
        item("emerald_steel_boots", new ArmorBase(EMERALD_STEEL_ARMOR, EquipmentSlot.FEET));
    }





}
