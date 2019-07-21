package com.herotech.base;

import com.herotech.main.Main;
import com.herotech.mod.ModItems;
import com.herotech.util.ModelRegister;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;

public class ArmorBase extends ItemArmor implements ModelRegister
{

	public ArmorBase(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
	{
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
