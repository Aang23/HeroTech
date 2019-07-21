package com.herotech.util.handlers;

import com.herotech.main.Main;
import com.herotech.mod.ModBlocks;
import com.herotech.mod.ModEntities;
import com.herotech.mod.ModItems;
import com.herotech.util.ModelRegister;
import com.herotech.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof ModelRegister)
			{
				((ModelRegister)item).registerModels();
			}
		}
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof ModelRegister)
			{
				((ModelRegister)block).registerModels();
			}
		}
		for(Entity e : ModEntities.ENTITY)
		{
			if(e instanceof ModelRegister)
			{
				((ModelRegister)e).registerModels();
			}
		}
	}
}
