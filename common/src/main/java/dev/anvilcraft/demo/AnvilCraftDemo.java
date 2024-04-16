package dev.anvilcraft.demo;

import dev.anvilcraft.demo.data.AnvilCraftDemoDatagen;
import dev.anvilcraft.demo.init.ModBlocks;
import dev.anvilcraft.demo.init.ModCreativeModeTab;
import dev.anvilcraft.demo.init.ModItems;
import dev.dubhe.anvilcraft.api.registry.AnvilCraftRegistrate;

public class AnvilCraftDemo {
    public static final String MOD_ID = "anvilcraft_demo";

    public static final AnvilCraftRegistrate REGISTRATE = AnvilCraftRegistrate.create(MOD_ID);

    public static void init() {
        // common init
        ModItems.register();
        ModBlocks.register();
        ModCreativeModeTab.register();

        // datagen init
        AnvilCraftDemoDatagen.init();

        // fabric exclusive, squeeze this in here to register before stuff is used
        REGISTRATE.registerRegistrate();
    }
}
