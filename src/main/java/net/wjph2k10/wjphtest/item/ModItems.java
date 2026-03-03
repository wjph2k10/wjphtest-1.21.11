package net.wjph2k10.wjphtest.item;

import net.wjph2k10.wjphtest.WjphTest;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item PHTHALUM_ARCANUS = registerItem("phthalum_arcanus",
            setting -> new AxeItem(ToolMaterial.NETHERITE, 6, -3.2f, setting));

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(WjphTest.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(WjphTest.MOD_ID, name)))));
    }
    public static void registerModItems() {
        WjphTest.LOGGER.info("Registering Items for " + WjphTest.MOD_ID);
    }
}