package io.github.amalgammc.herotech.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ManOre extends BlockBase 
{
	public ManOre(String name, Material material) 
	{
		super(name, material);
		
		this.setSoundType(SoundType.STONE);
		this.setHardness(5.0F);
		this.setResistance(15.0F);
		this.setHarvestLevel("pickaxe", 1);
	}
}
