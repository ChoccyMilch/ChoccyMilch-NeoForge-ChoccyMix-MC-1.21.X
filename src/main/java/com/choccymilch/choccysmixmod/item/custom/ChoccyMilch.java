package com.choccymilch.choccysmixmod.item.custom;

import com.choccymilch.choccysmixmod.item.ModFoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class ChoccyMilch extends Item {
    public ChoccyMilch(Properties properties) {
        super(properties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.DRINK;
    }
}
