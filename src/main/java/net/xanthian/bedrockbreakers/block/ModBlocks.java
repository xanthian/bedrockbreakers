package net.xanthian.bedrockbreakers.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.bedrockbreakers.Initialise;

import net.xanthian.bedrockbreakers.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static final RegistryObject<Block> PURE_OBSIDIAN = register("pure_obsidian",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PURE_BEDROCK = register("pure_bedrock",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BEDROCK_STAIRS = register("pure_bedrock_stairs",
            () -> new StairBlock(ModBlocks.PURE_BEDROCK.get().defaultBlockState(),BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BEDROCK_SLAB = register("pure_bedrock_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BEDROCK_WALL = register("pure_bedrock_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()));

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {

        });
    }
}