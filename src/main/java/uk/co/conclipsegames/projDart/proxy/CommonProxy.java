package uk.co.conclipsegames.projDart.Proxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.projDart.Item.Materials;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
        System.out.println("I'm a mod");
        Materials.registerItems();
    }
    public void init(FMLInitializationEvent e) {

    }
    public void postInit(FMLPostInitializationEvent e) {

    }
}
