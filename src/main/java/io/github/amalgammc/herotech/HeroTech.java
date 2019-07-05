package io.github.amalgammc.herotech;

import io.github.amalgammc.herotech.common.world.ModWorldGen;
import io.github.amalgammc.herotech.init.ModRecipes;
import io.github.amalgammc.herotech.proxy.CommonProxy;
import io.github.amalgammc.herotech.proxy.IProxy;
import io.github.amalgammc.herotech.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = HeroTech.MODID, name = HeroTech.NAME, version = HeroTech.VERSION)
public class HeroTech
{
    public static final String MODID = "herotech";
    public static final String NAME = "Hero Tech";
    public static final String VERSION = "0.1";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.5.2813,)";
    public static final String UPDATEURL = "https://raw.githubusercontent.com/amalgammc/herotech/master/update.json";

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();}
    {

    }
}
