package dev.anvilcraft.addon;

import dev.anvilcraft.addon.api.registry.ExampleModRegistrate;
import dev.anvilcraft.addon.data.ExampleModDatagen;
import dev.anvilcraft.addon.init.ModBlocks;
import dev.anvilcraft.addon.init.ModCreativeModeTab;
import dev.anvilcraft.addon.init.ModItems;

public class ExampleMod {
    public static final String MOD_ID = "anvilcraft_addon_example";

    public static final ExampleModRegistrate REGISTRATE = ExampleModRegistrate.create(MOD_ID);

    public static void init() {
        // common init
        ModItems.register();
        ModBlocks.register();
        ModCreativeModeTab.register();

        // datagen init
        ExampleModDatagen.init();

        // fabric exclusive, squeeze this in here to register before stuff is used
        REGISTRATE.registerRegistrate();
    }
}
