package net.xanthian.bedrockbreakers.item;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Rarity;
import net.xanthian.bedrockbreakers.Initialise;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item OBSIDIAN_INFUSED_DIAMOND = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON));
    public static final Item BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND = new Item(new FabricItemSettings().rarity(Rarity.RARE));

    public static void registerModItems() {
        registerItem("obsidian_infused_diamond",OBSIDIAN_INFUSED_DIAMOND);
        registerItem("bedrock_plated_obsidian_infused_diamond",BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
}