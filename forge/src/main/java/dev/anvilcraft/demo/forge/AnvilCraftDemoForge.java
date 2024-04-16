package dev.anvilcraft.demo.forge;

import dev.anvilcraft.demo.AnvilCraftDemo;
import net.minecraftforge.fml.common.Mod;

@Mod(AnvilCraftDemo.MOD_ID)
public class AnvilCraftDemoForge {
    public AnvilCraftDemoForge() {
        AnvilCraftDemo.init();
    }
}