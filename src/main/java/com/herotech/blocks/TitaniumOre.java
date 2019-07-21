package com.herotech.blocks;

import com.herotech.base.BlockBase;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TitaniumOre extends BlockBase 
{
	public TitaniumOre(String name, Material material) 
	{
		super(name, material);
		
		this.setSoundType(SoundType.STONE);
		this.setHardness(5.0F);
		this.setResistance(15.0F);
		this.setHarvestLevel("pickaxe", 2);
	}
}
