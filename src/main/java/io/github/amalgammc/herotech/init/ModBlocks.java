package io.github.amalgammc.herotech.init;

import java.util.ArrayList;
import java.util.List;

import io.github.amalgammc.herotech.blocks.ManBlock;
import io.github.amalgammc.herotech.blocks.ManOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MAN_BLOCK = new ManBlock("man_block", Material.IRON);
	public static final Block MAN_ORE = new ManOre("man_ore", Material.ROCK);
}
