package com.herotech.keybinds;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

import com.herotech.mod.ModBlocks;
import com.herotech.mod.ModItems;

import java.util.Objects;

public class Keybindings 
{
	public static final KeyBinding FIRE = new KeyBinding(null, KeyConflictContext.IN_GAME, Keyboard.KEY_R, null);
	
	 public static void init() 
	 {
	        ClientRegistry.registerKeyBinding(FIRE);
	        MinecraftForge.EVENT_BUS.register(new Keybindings());
	 }
	 	@SubscribeEvent
	    public void onKeyPress(InputEvent.KeyInputEvent event)
	 	{
	 		 EntityPlayer player = Minecraft.getMinecraft().player;
	 		 
	        if(FIRE.isPressed())
	        {
	        	 ItemStack stack = player.getHeldItemMainhand();
	        	 
	        	 player.sendMessage(new TextComponentString("[\247bHT\247f] Weapon Reloaded!"));
	        }
	    }
}
