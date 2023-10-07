package net.xanthian.bedrockbreakers.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.xanthian.bedrockbreakers.item.ModItems;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(BlockBehaviour.class)
public class BlockBehaviourMixin {

    /**
     * Nokko, Edited by Xanthian 2023
     **/

    @Unique
    final float bedrock_breaking$effectiveHardness = 150.0F;
    @Unique
    final float bedrock_breaking$effectiveHardness2 = 300.0F;

    @Inject(at = @At(value = "JUMP", opcode = Opcodes.IFNE, shift = At.Shift.AFTER),
            method ="Lnet/minecraft/world/level/block/state/BlockBehaviour;getDestroyProgress(" +
                    "Lnet/minecraft/world/level/block/state/BlockState;" +
                    "Lnet/minecraft/world/entity/player/Player;" +
                    "Lnet/minecraft/world/level/BlockGetter;" +
                    "Lnet/minecraft/core/BlockPos;)F",
            cancellable = true,
            locals = LocalCapture.CAPTURE_FAILSOFT
    )
    public void allowBedrockBreaking(BlockState state, Player player, BlockGetter world, BlockPos pos, CallbackInfoReturnable<Float> cir, float hardness) {
        ItemStack stack = player.getMainHandItem();
        if (stack.getItem() == ModItems.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND_BREAKER.get()) {
            if (state.getBlock() == Blocks.BEDROCK) {
            cir.setReturnValue(player.getDigSpeed(state, pos) / bedrock_breaking$effectiveHardness);
            } else {
                cir.setReturnValue(-100.0F);
            }

        } else if (stack.getItem() == ModItems.OBSIDIAN_INFUSED_DIAMOND_BREAKER.get()) {
            if (state.getBlock() == Blocks.BEDROCK) {
                cir.setReturnValue(player.getDigSpeed(state, pos) / bedrock_breaking$effectiveHardness2);
            } else {
                cir.setReturnValue(-100.0F);
            }
        }
    }
}