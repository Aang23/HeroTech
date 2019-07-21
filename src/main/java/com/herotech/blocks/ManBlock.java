package com.herotech.blocks;

import com.herotech.base.BlockBase;
import com.herotech.util.ModelRegister;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ManBlock extends BlockBase
{
	public ManBlock(String name, Material material) 
	{
		super(name, material);
		
		this.setSoundType(SoundType.METAL);
		this.setHardness(5.0F);
		this.setResistance(15.0F);
		this.setHarvestLevel("pickaxe", 1);
	}
}
