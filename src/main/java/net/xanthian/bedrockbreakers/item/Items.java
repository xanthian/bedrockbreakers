package net.xanthian.bedrockbreakers.item;

import net.xanthian.bedrockbreakers.Init;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items {

    public static final Item OBSIDIAN_INFUSED_DIAMOND = registerItem("obsidian_infused_diamond",
            new Item(new FabricItemSettings().group(Init.OID)));

    public static final Item BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND = registerItem("bedrock_plated_obsidian_infused_diamond",
            new Item(new FabricItemSettings().group(Init.OID)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}

