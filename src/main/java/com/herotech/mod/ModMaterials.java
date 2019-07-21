package com.herotech.mod;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModMaterials
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final ToolMaterial VIB = EnumHelper.addToolMaterial("material_vib", 2, 250, 
			7.2F, 2.3F, 10);
}
