package net.xanthian.bedrockbreakers.material;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;

import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import net.xanthian.bedrockbreakers.Initialise;
import net.xanthian.bedrockbreakers.item.ModItems;
import net.xanthian.bedrockbreakers.util.ModTags;

import java.util.List;

public class ModToolTiers {

    public static final Tier OBSIDIAN_INFUSED_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(-1, 2000, 0.5f, 1f, 0,
                    ModTags.Blocks.NEEDS_OBSIDIAN_INFUSED_DIAMOND_TOOL, () -> Ingredient.of(ModItems.OBSIDIAN_INFUSED_DIAMOND.get())),
            new ResourceLocation(Initialise.MOD_ID, "obsidian_infused_diamond"), List.of(), List.of(Tiers.WOOD));

    public static final Tier BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND = TierSortingRegistry.registerTier(
            new ForgeTier(-1, 4000, 0.5f, 1f, 0,
                    ModTags.Blocks.NEEDS_OBSIDIAN_INFUSED_DIAMOND_TOOL, () -> Ingredient.of(ModItems.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND.get())),
            new ResourceLocation(Initialise.MOD_ID, "bedrock_plated_obsidian_infused_diamond"), List.of(), List.of(Tiers.WOOD));

}