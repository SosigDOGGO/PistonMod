package com.szutyok.piston;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PistonMod.MODID, name = PistonMod.NAME, version = PistonMod.VERSION)
public class PistonMod {
    public static final String MODID = "piston";
    public static final String NAME = "Piston Mod";
    public static final String VERSION = "1.0";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info("fuckyuo DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
