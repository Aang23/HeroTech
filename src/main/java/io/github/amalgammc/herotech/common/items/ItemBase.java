package io.github.amalgammc.herotech.common.items;

import io.github.amalgammc.herotech.HeroTech;
import io.github.amalgammc.herotech.init.ModItems;
import io.github.amalgammc.herotech.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		HeroTech.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
