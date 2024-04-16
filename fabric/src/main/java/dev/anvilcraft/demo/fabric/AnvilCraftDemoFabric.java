package dev.anvilcraft.demo.fabric;

import dev.anvilcraft.demo.AnvilCraftDemo;
import net.fabricmc.api.ModInitializer;

public class AnvilCraftDemoFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        AnvilCraftDemo.init();
    }
}