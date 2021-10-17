package jonahdepro.more.tools.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialTin implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        return 8.0f;
    }

    @Override
    public int getDurability() {
        return 9001;
    }

    @Override
    public int getEnchantability() {
        return 1000;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 32.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

}
