package io.github.amalgammc.herotech.init;

<<<<<<< Updated upstream
import java.util.ArrayList;
import java.util.List;

import io.github.amalgammc.herotech.items.ItemBase;
import io.github.amalgammc.herotech.util.Reference;

import net.minecraft.init.SoundEvents;
=======
import io.github.amalgammc.herotech.common.items.ArmorBaseModel;
import io.github.amalgammc.herotech.common.items.ItemBase;
>>>>>>> Stashed changes
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MAN_INGOT = new ItemBase("man_ingot");
	public static final Item ARC_REACTOR = new ItemBase("arc_reactor");
	
	public static final ArmorMaterial ARMOR_MATERIAL_MAN = EnumHelper.addArmorMaterial("armor_material_man", Reference.MOD_ID + ":man_ingot", 12,
			new int[] {2, 7, 5, 3}, 10, SoundEvents.BLOCK_ANVIL_USE, 0.0F);
	
	
}
