package dev.anvilcraft.demo.init;

import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.item.Item;

import static dev.anvilcraft.demo.AnvilCraftDemo.REGISTRATE;

public class ModItems {

    static {
        REGISTRATE.creativeModeTab(ModCreativeModeTab.EXAMPLE_TAB);
    }

    public static final ItemEntry<Item> EXAMPLE_ITEM = REGISTRATE
            .item("example_item", Item::new).register();

    public static void register() {

    }
}
