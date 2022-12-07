package net.xanthian.bedrockbreakers.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.bedrockbreakers.Init;
import net.xanthian.bedrockbreakers.item.Breakers;

import java.util.Comparator;

public class ModItemGroup {

    public static void registerGroup() {
    }

    public static final net.minecraft.item.ItemGroup BEDROCK_BREAKERS =
            FabricItemGroup.builder(new Identifier(Init.MOD_ID, "bedrock_breakers"))
                    .displayName(Text.literal("Bedrock Breakers"))
                    .icon(() -> new ItemStack(Breakers.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER))
                    .entries((enabledFeatures, entries, operatorEnabled) -> {
                        entries.addAll(Registries.ITEM.getIds().stream()
                                .filter(identifier -> identifier.getNamespace().matches(Init.MOD_ID))
                                .sorted(Comparator.comparing(Identifier::getPath))
                                .map(Registries.ITEM::get)
                                .map(ItemStack::new)
                                .filter(input -> !input.isEmpty())
                                .toList());
                    })
                    .build();

}