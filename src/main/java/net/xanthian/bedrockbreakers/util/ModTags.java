package net.xanthian.bedrockbreakers.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

import net.xanthian.bedrockbreakers.Initialise;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_OBSIDIAN_INFUSED_DIAMOND_TOOL = tag("needs_obsidian_infused_diamond_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Initialise.MOD_ID, name));
        }
    }
}