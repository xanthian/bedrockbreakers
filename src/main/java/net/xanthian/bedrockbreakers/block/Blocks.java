package net.xanthian.bedrockbreakers.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.xanthian.bedrockbreakers.Init;

public class Blocks {

    public static void registerBlocks() {
        final Block PURE_OBSIDIAN = new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN));
        registerBlock("pure_obsidian", PURE_OBSIDIAN);

        final Block PURE_BEDROCK = new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN));
        registerBlock("pure_bedrock", PURE_BEDROCK);
    }

    private static void registerBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Init.OID)));
    }
}