package io.github.amalgammc.herotech;

import org.apache.commons.logging.Log;

import com.google.common.base.Function;
import io.github.amalgammc.herotech.init.ModRecipes;
import io.github.amalgammc.herotech.proxy.CommonProxy;
import io.github.amalgammc.herotech.util.Reference;
import io.github.amalgammc.herotech.world.ModWorldGen;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.IModel;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION)
public class Main
{      
    @Instance 
    public static Main instance;
    
    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;
    
    @EventHandler
    public static void preInit(FMLPreInitializationEvent event)
    {
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }
    
    @EventHandler
    public static void init(FMLInitializationEvent event)
    {
    	ModRecipes.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event)
    {
    	
    }
}
