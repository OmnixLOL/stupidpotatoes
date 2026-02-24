package org.omnix.stupot;

import net.fabricmc.api.ModInitializer;

import org.omnix.stupot.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Stupidpotatoes implements ModInitializer {
	public static final String MOD_ID = "stupidpotatoes";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}