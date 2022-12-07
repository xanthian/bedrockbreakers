package net.xanthian.bedrockbreakers;

import net.xanthian.bedrockbreakers.block.ModBlocks;
import net.xanthian.bedrockbreakers.item.ModItems;
import net.xanthian.bedrockbreakers.item.Breakers;
import net.fabricmc.api.ModInitializer;
import net.xanthian.bedrockbreakers.util.ModItemGroup;

public class Init  implements ModInitializer {

    public static final String MOD_ID = "bedrockbreakers";

    @Override
    public void onInitialize() {

        ModItemGroup.registerGroup();
        ModItems.registerModItems();
        Breakers.registerModItems();
        ModBlocks.registerBlocks();
    }
}