package net.xanthian.bedrockbreakers;

import net.xanthian.bedrockbreakers.block.Blocks;
import net.xanthian.bedrockbreakers.item.Items;
import net.xanthian.bedrockbreakers.item.Breakers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Init  implements ModInitializer {

    public static final String MOD_ID = "bedrockbreakers";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup OID = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "oid"),
            () -> new ItemStack(Breakers.OBSIDIAN_INFUSED_DIAMOND_BREAKER));

    @Override
    public void onInitialize() {

        Items.registerModItems();
        Breakers.registerModItems();
        Blocks.registerBlocks();
    }
}