package org.omnix.stupot.item;

import org.omnix.stupot.Stupidpotatoes;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STUPID_POTATO = register("stupid_potato",
            new Item(new Item.Settings()));

    private static Item register(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(Stupidpotatoes.MOD_ID, name),
                item
        );
    }

    public static void registerModItems() {
        Stupidpotatoes.LOGGER.info("Registering Mod Items for " + Stupidpotatoes.MOD_ID);

        Item unused = STUPID_POTATO;
    }
}