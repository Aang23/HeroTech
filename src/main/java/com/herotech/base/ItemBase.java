package com.herotech.base;

import com.herotech.main.Main;
import com.herotech.mod.ModItems;
import com.herotech.util.ModelRegister;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements ModelRegister
{
	public ItemBase(String name)
	{
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.HEROTECHTAB);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
