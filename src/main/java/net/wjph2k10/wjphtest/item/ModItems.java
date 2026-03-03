package net.wjph2k10.wjphtest.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wjph2k10.wjphtest.WjphTest;

public class ModItems {

    public static final Item TESTING_ITEM = registerItem("test_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WjphTest.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WjphTest.LOGGER.info("Registering mod items for " + WjphTest.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TESTING_ITEM);
        });
    }
}
