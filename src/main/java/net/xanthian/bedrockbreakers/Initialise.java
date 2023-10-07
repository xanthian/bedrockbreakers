package net.xanthian.bedrockbreakers;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.xanthian.bedrockbreakers.block.ModBlocks;
import net.xanthian.bedrockbreakers.item.ModItems;


@Mod(Initialise.MOD_ID)
@Mod.EventBusSubscriber
public class Initialise {

    public static final String MOD_ID = "bedrockbreakers";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::buildCreativeModeTabs);

        ModBlocks.BLOCKS.register(modEventBus);

        ModItems.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void buildCreativeModeTabs(BuildCreativeModeTabContentsEvent event) {
        ResourceKey<CreativeModeTab> tab = event.getTabKey();
        if (tab == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.getEntries().putAfter(new ItemStack(Items.NETHERITE_PICKAXE), new ItemStack(ModItems.OBSIDIAN_INFUSED_DIAMOND_BREAKER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ModItems.OBSIDIAN_INFUSED_DIAMOND_BREAKER.get()), new ItemStack(ModItems.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tab == CreativeModeTabs.NATURAL_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Items.BEDROCK), new ItemStack(ModBlocks.PURE_BEDROCK.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ModBlocks.PURE_BEDROCK.get()), new ItemStack(ModBlocks.BEDROCK_STAIRS.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ModBlocks.BEDROCK_STAIRS.get()), new ItemStack(ModBlocks.BEDROCK_SLAB.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ModBlocks.BEDROCK_SLAB.get()), new ItemStack(ModBlocks.BEDROCK_WALL.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(Items.OBSIDIAN), new ItemStack(ModBlocks.PURE_OBSIDIAN.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
        if (tab == CreativeModeTabs.INGREDIENTS) {
            event.getEntries().putAfter(new ItemStack(Items.DIAMOND), new ItemStack(ModItems.OBSIDIAN_INFUSED_DIAMOND.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(ModItems.OBSIDIAN_INFUSED_DIAMOND.get()), new ItemStack(ModItems.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}