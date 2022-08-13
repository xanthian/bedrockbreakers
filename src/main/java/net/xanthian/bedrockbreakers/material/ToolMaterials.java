package net.xanthian.bedrockbreakers.material;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import net.xanthian.bedrockbreakers.item.Items;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {

    OBSIDIAN_INFUSED_DIAMOND(-1, 2000, 3F, 2F, 0, () -> Ingredient.ofItems(Items.OBSIDIAN_INFUSED_DIAMOND)),
    BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND(-1, 4000, 4F, 1F, 0, () -> Ingredient.ofItems(Items.BEDROCK_PLATED_OBSIDIAN_INFUSED_DIAMOND));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ToolMaterials(int miningLevel, int itemDurability,
                          float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }
    void Materials(int i, int i1, float v, float v1, int i2, Object o) {
    }
    public int getDurability() {
        return this.itemDurability;
    }
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }
    public float getAttackDamage() {
        return this.attackDamage;
    }
    public int getMiningLevel() {
        return this.miningLevel;
    }
    public int getEnchantability() {
        return this.enchantability;
    }
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

}