package org.omnix.stupot.item;

import org.omnix.stupot.Stupidpotatoes;

import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STUPID_POTATO = register("stupid_potato");

    private static Item register(String name) {
        Identifier id = Identifier.of(Stupidpotatoes.MOD_ID, name);

        Item item = new Item(
                new Item.Settings()
                        .registryKey(RegistryKey.of(RegistryKeys.ITEM, id))
        );

        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {
        Stupidpotatoes.LOGGER.info("Registering Mod Items for " + Stupidpotatoes.MOD_ID);
    }
}