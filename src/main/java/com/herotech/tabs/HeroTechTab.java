package com.herotech.tabs;

import com.herotech.mod.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class HeroTechTab extends CreativeTabs
{
	public HeroTechTab(String label)
	{
		super("HeroTech");
		setBackgroundImageName("herotechtab.png");
	}

	public ItemStack createIcon() 
	{
		return new ItemStack(ModItems.ARC_REACTOR);
	}
}
