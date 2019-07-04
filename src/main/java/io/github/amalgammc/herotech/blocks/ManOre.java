package io.github.amalgammc.herotech.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

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
