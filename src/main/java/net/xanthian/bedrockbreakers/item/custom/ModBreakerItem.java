package net.xanthian.bedrockbreakers.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class ModBreakerItem extends PickaxeItem {
    public ModBreakerItem(ToolMaterial material) {
        super(material, 1, 1f, new FabricItemSettings());
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return state.getBlock() == Blocks.BEDROCK ? 0.5f : 0.01f;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.obsidianinfuseddiamond.breaker").formatted(Formatting.ITALIC, Formatting.RED));
    }

    @Override
    public int getEnchantability() {
        return 0;
    }
}
