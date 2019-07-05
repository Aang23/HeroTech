package io.github.amalgammc.herotech.common.blocks;

import io.github.amalgammc.herotech.HeroTech;
import io.github.amalgammc.herotech.init.ModBlocks;
import io.github.amalgammc.herotech.init.ModItems;
import io.github.amalgammc.herotech.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setTranslationKey(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		HeroTech.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
