package net.wjph2k10.wjphtest;

import net.fabricmc.api.ModInitializer;
import net.wjph2k10.wjphtest.item.ModItems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WjphTest implements ModInitializer {
	public static final String MOD_ID = "wjphtest";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

	}
}