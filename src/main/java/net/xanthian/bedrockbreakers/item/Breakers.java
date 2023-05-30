package net.xanthian.bedrockbreakers.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import net.xanthian.bedrockbreakers.Initialise;
import net.xanthian.bedrockbreakers.material.ToolMaterials;

import java.util.List;

public class Breakers
{

    public static final Item OBSIDIAN_INFUSED_DIAMOND_BREAKER = registerItem("obsidian_infused_diamond_breaker",
            new PickaxeItem(ToolMaterials.OBSIDIAN_INFUSED_DIAMOND, 1, 1f, new FabricItemSettings()) {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.obsidianinfuseddiamond.breaker").formatted(Formatting.ITALIC, Formatting.RED));
                }
            });

    public static final Item BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER = registerItem("bedrock_plated_obsidian_infused_diamond_breaker",
            new PickaxeItem(ToolMaterials.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND, 1, 1f, new FabricItemSettings()) {
                @Override
                public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
                    tooltip.add(Text.translatable("tooltip.obsidianinfuseddiamond.breaker").formatted(Formatting.ITALIC, Formatting.RED));
                }
            });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerModItems() {
    }
}