package com.herotech.items;


import java.util.List;

import com.herotech.main.Main;
import com.herotech.mod.ModItems;
import com.herotech.util.ModelRegister;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class VibraniumPickaxe extends ItemPickaxe implements ModelRegister
{	
	public VibraniumPickaxe(String name, ToolMaterial material) 
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
