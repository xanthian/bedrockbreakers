package net.xanthian.bedrockbreakers;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.bedrockbreakers.block.ModBlocks;
import net.xanthian.bedrockbreakers.item.ModItems;
import net.xanthian.bedrockbreakers.item.Breakers;
import net.fabricmc.api.ModInitializer;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "bedrockbreakers";

    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID, "bedrockbreakers"))
            .icon(() -> new ItemStack(Breakers.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER))
            .displayName(Text.translatable("bedrockbreakers.group.bedrockbreakers"))
            .entries((context, entries) -> {
                entries.add(Breakers.OBSIDIAN_INFUSED_DIAMOND_BREAKER);
                entries.add(ModBlocks.PURE_OBSIDIAN);
                entries.add(ModItems.OBSIDIAN_INFUSED_DIAMOND);
                entries.add(ModBlocks.PURE_BEDROCK);
                entries.add(Breakers.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER);
                entries.add(ModItems.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND);
            })
            .build();

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        Breakers.registerModItems();
        ModBlocks.registerBlocks();
    }
}