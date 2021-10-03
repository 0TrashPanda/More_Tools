package jonahdepro.more.tools.registry;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialTin implements ToolMaterial {

    @Override
    public float getAttackDamage() {
        // TODO Auto-generated method stub
        return 8.0f;
    }

    @Override
    public int getDurability() {
        // TODO Auto-generated method stub
        return 9001;
    }

    @Override
    public int getEnchantability() {
        // TODO Auto-generated method stub
        return 1000;
    }

    @Override
    public int getMiningLevel() {
        // TODO Auto-generated method stub
        return 4;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        // TODO Auto-generated method stub
        return 32.0f;
    }

    @Override
    public Ingredient getRepairIngredient() {
        // TODO Auto-generated method stub
        return null;
    }

}
