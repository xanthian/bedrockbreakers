package net.xanthian.bedrockbreakers.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.bedrockbreakers.Initialise;

public class ModBlocks {

    public static final Block PURE_OBSIDIAN = new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN));
    public static final StairsBlock PURE_OBSIDIAN_STAIRS = new StairsBlock(ModBlocks.PURE_OBSIDIAN.getDefaultState(), FabricBlockSettings.copy(ModBlocks.PURE_OBSIDIAN).requiresTool());
    public static final SlabBlock PURE_OBSIDIAN_SLAB = new SlabBlock(FabricBlockSettings.copy(ModBlocks.PURE_OBSIDIAN).requiresTool());
    public static final WallBlock PURE_OBSIDIAN_WALL = new WallBlock(FabricBlockSettings.copy(ModBlocks.PURE_OBSIDIAN).requiresTool());
    public static final Block PURE_BEDROCK = new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN));
    public static final StairsBlock PURE_BEDROCK_STAIRS = new StairsBlock(ModBlocks.PURE_BEDROCK.getDefaultState(), FabricBlockSettings.copy(ModBlocks.PURE_BEDROCK).requiresTool());
    public static final SlabBlock PURE_BEDROCK_SLAB = new SlabBlock(FabricBlockSettings.copy(ModBlocks.PURE_BEDROCK).requiresTool());
    public static final WallBlock PURE_BEDROCK_WALL = new WallBlock(FabricBlockSettings.copy(ModBlocks.PURE_BEDROCK).requiresTool());

    public static void registerBlocks() {
        registerBlock("pure_obsidian", PURE_OBSIDIAN);
        registerBlock("pure_obsidian_stairs", PURE_OBSIDIAN_STAIRS);
        registerBlock("pure_obsidian_slab", PURE_OBSIDIAN_SLAB);
        registerBlock("pure_obsidian_wall", PURE_OBSIDIAN_WALL);
        registerBlock("pure_bedrock", PURE_BEDROCK);
        registerBlock("pure_bedrock_stairs", PURE_BEDROCK_STAIRS);
        registerBlock("pure_bedrock_slab", PURE_BEDROCK_SLAB);
        registerBlock("pure_bedrock_wall", PURE_BEDROCK_WALL);
    }

    private static void registerBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}