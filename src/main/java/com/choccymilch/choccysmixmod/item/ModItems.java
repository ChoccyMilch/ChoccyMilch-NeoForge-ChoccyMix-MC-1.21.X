package com.choccymilch.choccysmixmod.item;

import com.choccymilch.choccysmixmod.ChoccysMixMod;
import com.choccymilch.choccysmixmod.item.custom.MagicGraterItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChoccysMixMod.MOD_ID);

    // Food items
    public static final DeferredItem<Item> CHEESE = ITEMS.registerSimpleItem("cheese", new Item.Properties().food(new FoodProperties.Builder()
                    // Heals 3 hearts.
                    .nutrition(3)
                    .saturationModifier(0.3f)
                    .alwaysEdible().build()
            )
    );

    public static final DeferredItem<Item> APPLE_PIE = ITEMS.registerItem("apple_pie", Item::new,
            new Item.Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(8)
                                            .saturationModifier(0.8f)
                                            .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1000, 2), 1.0f).build()
                            )

    );

    public static final DeferredItem<Item> CARAMEL = ITEMS.registerItem("caramel", Item::new,
            new Item.Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(2)
                                            .saturationModifier(0.2f)
                                            .alwaysEdible()
                                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2), 1.0f).build()
                            )

    );

    public static final DeferredItem<Item> CARAMEL_APPLE = ITEMS.registerItem("caramel_apple", Item::new,
            new Item.Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                            .Builder()
                                            .nutrition(6)
                                            .saturationModifier(0.6f)
                                            .alwaysEdible()
                                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500, 2), 1.0f).build()
                            )

    );

    public static final DeferredItem<Item> RAW_BACON = ITEMS.registerSimpleItem("raw_bacon", new Item.Properties().food(new FoodProperties.Builder()
                    // Heals 3 hearts.
                    .nutrition(3)
                    .saturationModifier(0.3f)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 500, 0), 0.3F)
                    .build()
            )
    );

    public static final DeferredItem<Item> COOKED_BACON = ITEMS.registerSimpleItem("cooked_bacon", new Item.Properties().food(new FoodProperties.Builder()
                    // Heals 3 hearts.
                    .nutrition(7)
                    .saturationModifier(0.9f)
                    .build()
            )
    );

    public static final DeferredItem<Item> CHOCCY_MILCH = ITEMS.registerItem("choccy_milch", Item::new,
            new Item.Properties()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodProperties
                                    .Builder()
                                    .nutrition(2)
                                    .saturationModifier(0.2f)
                                    .alwaysEdible()
                                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500, 2), 1.0f)
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 400, 2), 1.0f)
                                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 2), 1.0f)
                                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 400, 2), 1.0f)
                                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 200, 2), 1.0f).build()
                            )

    );

    // Crafting/Ingredient items
    public static final DeferredItem<Item> CURD = ITEMS.registerItem("cheese_curd", Item::new, new Item.Properties());

    public static final DeferredItem<Item> CHEESIUM = ITEMS.registerItem("cheesium", Item::new, new Item.Properties());

    public static final DeferredItem<Item> CHEDDARITE = ITEMS.registerItem("cheddarite", Item::new, new Item.Properties());

    public static final DeferredItem<Item> RAW_CHEDDARITE = ITEMS.registerItem("raw_cheddarite", Item::new, new Item.Properties());

    // Equipment/Tools items
    public static final DeferredItem<Item> MAGIC_CHEESE_GRATER = ITEMS.registerItem("magic_cheese_grater", MagicGraterItem::new, new Item.Properties().durability(32));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
