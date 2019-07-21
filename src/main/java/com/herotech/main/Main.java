package com.herotech.main;

import com.herotech.keybinds.Keybindings;
import com.herotech.mod.ModRecipes;
import com.herotech.proxy.CommonProxy;
import com.herotech.tabs.HeroTechTab;
import com.herotech.util.Reference;
import com.herotech.world.ModWorldGen;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{	
	public static final CreativeTabs HEROTECHTAB = new HeroTechTab("herotechtab");
	
	@Instance
	public static Main instance;
	
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }
    @EventHandler
    public static void init(FMLInitializationEvent event) 
    {
    	Keybindings.init();
    }
    @EventHandler
    public static void PostInit(FMLPostInitializationEvent event)
    {
    	ModRecipes.init();
    }
}