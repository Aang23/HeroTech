package io.github.amalgammc.herotech.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModBlocks.MAN_ORE, new ItemStack(ModItems.MAN_INGOT, 1), 2F);
	}
}
