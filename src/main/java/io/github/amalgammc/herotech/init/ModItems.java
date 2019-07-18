package io.github.amalgammc.herotech.init;

import io.github.amalgammc.herotech.common.items.ArmorBaseModel;
import io.github.amalgammc.herotech.common.items.ItemBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MAN_INGOT = new ItemBase("man_ingot");
	public static final Item ARC_REACTOR = new ItemBase("arc_reactor");

	//MK6 SUIT
	public static final Item MK6_HELMET = new ArmorBaseModel("mk6_helmet", ModMaterials.ARMOR_MATERIAL_MK6, 1, EntityEquipmentSlot.HEAD);
	public static final Item MK6_CHESTPLATE = new ArmorBaseModel("mk6_chestplate", ModMaterials.ARMOR_MATERIAL_MK6, 1, EntityEquipmentSlot.CHEST);
	public static final Item MK6_LEGGINGS = new ArmorBaseModel("mk6_leggings", ModMaterials.ARMOR_MATERIAL_MK6, 2, EntityEquipmentSlot.LEGS);
	public static final Item MK6_BOOTS = new ArmorBaseModel("mk6_boots", ModMaterials.ARMOR_MATERIAL_MK6, 1, EntityEquipmentSlot.FEET);
	
	
}
