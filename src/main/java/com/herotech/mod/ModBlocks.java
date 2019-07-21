package com.herotech.mod;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

import com.herotech.base.BlockBase;
import com.herotech.blocks.ManBlock;
import com.herotech.blocks.ManOre;
import com.herotech.blocks.PalladiumOre;
import com.herotech.blocks.TitaniumOre;
import com.herotech.blocks.VibraniumOre;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MAN_BLOCK = new ManBlock("man_block", Material.IRON);
	public static final Block MAN_ORE = new ManOre("man_ore", Material.ROCK);
	public static final Block TITANIUM_ORE = new TitaniumOre("tit_ore", Material.ROCK);
	public static final Block PALLADIUM_ORE = new PalladiumOre("pal_ore", Material.ROCK);
	public static final Block VIBRANIUM_ORE = new VibraniumOre("vib_ore", Material.ROCK);
}
