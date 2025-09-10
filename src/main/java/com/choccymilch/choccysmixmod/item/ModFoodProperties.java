package com.choccymilch.choccysmixmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

public class ModFoodProperties {
    public static final FoodProperties CHEESE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .fast().build();

    public static final FoodProperties CARAMEL = new FoodProperties.Builder().nutrition(3).saturationModifier(0.4f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 100, 2), 1.0f)
            .build();

    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 2), 1.0f).build();

    public static final FoodProperties CARAMEL_APPLE = new FoodProperties.Builder().nutrition(6).saturationModifier(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 2), 1.0f)
            .usingConvertsTo(Items.STICK).build();

    public static final FoodProperties LOADED_POTATO = new FoodProperties.Builder().nutrition(5).saturationModifier(0.7f)
            .build();

    public static final FoodProperties RAW_BACON = new FoodProperties.Builder().nutrition(3).saturationModifier(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 100, 2), 0.35f).build();

    public static final FoodProperties COOKED_BACON = new FoodProperties.Builder().nutrition(7).saturationModifier(0.8f)
            .build();

    public static final FoodProperties CANDIED_BACON = new FoodProperties.Builder().nutrition(6).saturationModifier(0.7f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300, 2), 1.0f).build();

    public static final FoodProperties CHOCCY_MILCH = new FoodProperties.Builder().nutrition(8).saturationModifier(0.8f)
            .usingConvertsTo(Items.GLASS_BOTTLE).build();


}


