package net.xanthian.bedrockbreakers.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.xanthian.bedrockbreakers.item.Breakers;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(AbstractBlock.class)
public class AbstractBlockMixin {

    /**
     * @author Nokko, Edited by Xanthian 2022
     **/

    final float effectiveHardness = 75.0F;
    final float effectiveHardness2 = 150.0F;

    @Inject(at = @At(value = "JUMP", opcode = Opcodes.IFNE, shift = At.Shift.AFTER),
            method = "Lnet/minecraft/block/AbstractBlock;calcBlockBreakingDelta(" +
                    "Lnet/minecraft/block/BlockState;" +
                    "Lnet/minecraft/entity/player/PlayerEntity;" +
                    "Lnet/minecraft/world/BlockView;" +
                    "Lnet/minecraft/util/math/BlockPos;)F",
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILSOFT
    )
    public void allowBedrockBreaking(BlockState state, PlayerEntity player, BlockView world, BlockPos pos, CallbackInfoReturnable<Float> cir, float hardness) {
        ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

        if (state.getBlock() == Blocks.BEDROCK && (stack.getItem() == Breakers.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER)) {
            cir.setReturnValue(player.getBlockBreakingSpeed(state) / effectiveHardness);
        } else if (state.getBlock() == Blocks.BEDROCK && (stack.getItem() == Breakers.OBSIDIAN_INFUSED_DIAMOND_BREAKER)) {
            cir.setReturnValue(player.getBlockBreakingSpeed(state) / effectiveHardness2);
        }
    }

   // public void allowReinforcedDeepSlateBreaking(BlockState state, PlayerEntity player, BlockView world, BlockPos pos, CallbackInfoReturnable<Float> cir, float hardness) {
     //   ItemStack stack = player.getStackInHand(Hand.MAIN_HAND);

       // if (state.getBlock() == ModBlocks.REINFORCED_DEEPSLATE && (stack.getItem() == Breakers.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER)) {
         //   cir.setReturnValue(player.getBlockBreakingSpeed(state) / effectiveHardness);

        //}
    //}
}
