package com.herotech.items;

import com.herotech.main.Main;
import com.herotech.mod.ModItems;
import com.herotech.util.ModelRegister;

import net.minecraft.item.ItemSword;

public class VibraniumSword extends ItemSword implements ModelRegister
{

	public VibraniumSword(String name, ToolMaterial material) 
	{
		super(material);
		
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(Main.HEROTECHTAB);
		setMaxStackSize(1);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
