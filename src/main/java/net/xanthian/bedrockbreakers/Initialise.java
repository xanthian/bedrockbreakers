package net.xanthian.bedrockbreakers;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.bedrockbreakers.block.ModBlocks;
import net.xanthian.bedrockbreakers.item.ModItems;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "bedrockbreakers";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "bedrockbreakers"));

    @Override
    public void onInitialize() {

        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.OBSIDIAN_INFUSED_DIAMOND))
                .displayName(Text.translatable("bedrockbreakers.group.bedrockbreakers"))
                .entries((context, entries) -> {
                    entries.add(ModBlocks.PURE_OBSIDIAN);
                    entries.add(ModItems.OBSIDIAN_INFUSED_DIAMOND);
                    entries.add(ModItems.OBSIDIAN_INFUSED_DIAMOND_BREAKER);
                    entries.add(ModBlocks.PURE_OBSIDIAN_SLAB);
                    entries.add(ModBlocks.PURE_OBSIDIAN_STAIRS);
                    entries.add(ModBlocks.PURE_OBSIDIAN_WALL);
                    entries.add(ModBlocks.PURE_BEDROCK);
                    entries.add(ModItems.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND);
                    entries.add(ModItems.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER);
                    entries.add(ModBlocks.PURE_BEDROCK_SLAB);
                    entries.add(ModBlocks.PURE_BEDROCK_STAIRS);
                    entries.add(ModBlocks.PURE_BEDROCK_WALL);
                })
                .build());

        ModItems.registerModItems();
        ModBlocks.registerBlocks();
    }
}