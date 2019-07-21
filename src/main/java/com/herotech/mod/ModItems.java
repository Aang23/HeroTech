package com.herotech.mod;

import java.util.ArrayList;
import java.util.List;

import com.herotech.base.ItemBase;
import com.herotech.items.VibraniumPickaxe;
import com.herotech.items.VibraniumSword;
import com.herotech.main.Main;
import com.herotech.util.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArrow;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSword;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MAN_INGOT = new ItemBase("man_ingot");
	public static final Item ARC_REACTOR = new ItemBase("arc_reactor");
	public static final Item PALLADIUM_INGOT = new ItemBase("pal_ingot");
	public static final Item VIBRANIUM_INGOT = new ItemBase("vib_ingot");
	public static final Item TITANIUM_INGOT = new ItemBase("tit_ingot");
	
	/**
	 * The mod tools are intended for dev use only
	 */
	public static final Item VIB_SWORD = new VibraniumSword("vib_sword", ModMaterials.VIB);
	public static final Item VIB_PICK = new VibraniumPickaxe("vib_pick", ModMaterials.VIB);
}
