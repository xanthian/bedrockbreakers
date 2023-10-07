package net.xanthian.bedrockbreakers.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.Level;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.bedrockbreakers.Initialise;
import net.xanthian.bedrockbreakers.material.ModToolTiers;

import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Initialise.MOD_ID);

    public static final RegistryObject<Item> OBSIDIAN_INFUSED_DIAMOND = ITEMS.register("obsidian_infused_diamond",
            () -> new Item(new Properties().rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND = ITEMS.register("bedrock_plated_obsidian_infused_diamond",
            () -> new Item(new Properties().rarity(Rarity.RARE)));


    public static final RegistryObject<Item> OBSIDIAN_INFUSED_DIAMOND_BREAKER = ITEMS.register("obsidian_infused_diamond_breaker",
            () -> new PickaxeItem(ModToolTiers.OBSIDIAN_INFUSED_DIAMOND, -2, -3, new Item.Properties()) {
                @Override
                public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                    pTooltipComponents.add(Component.translatable("tooltip.obsidian_infused_diamond.breaker").withStyle(ChatFormatting.ITALIC, ChatFormatting.RED));
                }
            });

    public static final RegistryObject<Item> BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER = ITEMS.register("bedrock_plated_obsidian_infused_diamond_breaker",
            () -> new PickaxeItem(ModToolTiers.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND, -2, -3, new Item.Properties().stacksTo(1)) {
                @Override
                public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
                    super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
                    pTooltipComponents.add(Component.translatable("tooltip.obsidian_infused_diamond.breaker").withStyle(ChatFormatting.ITALIC, ChatFormatting.RED));
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}