package com.herotech.mod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.MAN_ORE, new ItemStack(ModItems.MAN_INGOT, 1), 2F);
		GameRegistry.addSmelting(ModBlocks.PALLADIUM_ORE, new ItemStack(ModItems.PALLADIUM_INGOT, 1), 2F);
		GameRegistry.addSmelting(ModBlocks.VIBRANIUM_ORE, new ItemStack(ModItems.VIBRANIUM_INGOT, 1), 2F);
		GameRegistry.addSmelting(ModBlocks.TITANIUM_ORE, new ItemStack(ModItems.TITANIUM_INGOT, 1), 2F);
	}
}
