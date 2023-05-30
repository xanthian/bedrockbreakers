package net.xanthian.bedrockbreakers.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.bedrockbreakers.Initialise;

public class ModBlocks {

    public static final Block PURE_OBSIDIAN = new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN));
    public static final Block PURE_BEDROCK = new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.OBSIDIAN));

    public static void registerBlocks() {
        registerBlock("pure_obsidian", PURE_OBSIDIAN);
        registerBlock("pure_bedrock", PURE_BEDROCK);
    }

    private static void registerBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}