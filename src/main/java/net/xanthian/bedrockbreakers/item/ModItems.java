package net.xanthian.bedrockbreakers.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.xanthian.bedrockbreakers.Initialise;
import net.xanthian.bedrockbreakers.item.custom.ModBreakerItem;
import net.xanthian.bedrockbreakers.material.ToolMaterials;

public class ModItems {

    public static final Item OBSIDIAN_INFUSED_DIAMOND = new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON));
    public static final Item BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND = new Item(new FabricItemSettings().rarity(Rarity.RARE));
    public static final Item OBSIDIAN_INFUSED_DIAMOND_BREAKER = new ModBreakerItem(ToolMaterials.OBSIDIAN_INFUSED_DIAMOND);
    public static final Item BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER = new ModBreakerItem(ToolMaterials.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND);

    public static void registerModItems() {
        registerItem("obsidian_infused_diamond", OBSIDIAN_INFUSED_DIAMOND);
        registerItem("bedrock_plated_obsidian_infused_diamond", BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND);
        registerItem("obsidian_infused_diamond_breaker", OBSIDIAN_INFUSED_DIAMOND_BREAKER);
        registerItem("bedrock_plated_obsidian_infused_diamond_breaker", BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
}