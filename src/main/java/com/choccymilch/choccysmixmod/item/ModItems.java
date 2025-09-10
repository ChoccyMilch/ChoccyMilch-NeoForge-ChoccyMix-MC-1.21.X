package com.choccymilch.choccysmixmod.item;

import com.choccymilch.choccysmixmod.ChoccysMixMod;
import com.choccymilch.choccysmixmod.item.custom.ChoccyMilch;
import com.choccymilch.choccysmixmod.item.custom.MagicGraterItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChoccysMixMod.MOD_ID);

    // Food items
    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));
    public static final DeferredItem<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().food(ModFoodProperties.APPLE_PIE)));
    public static final DeferredItem<Item> CARAMEL = ITEMS.register("caramel", () -> new Item(new Item.Properties().food(ModFoodProperties.CARAMEL)));
    public static final DeferredItem<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple", () -> new Item(new Item.Properties().food(ModFoodProperties.CARAMEL_APPLE)));
    public static final DeferredItem<Item> RAW_BACON = ITEMS.register("raw_bacon", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BACON)));
    public static final DeferredItem<Item> COOKED_BACON = ITEMS.register("cooked_bacon", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BACON)));
    public static final DeferredItem<Item> CANDIED_BACON = ITEMS.register("candied_bacon", () -> new Item(new Item.Properties().food(ModFoodProperties.CANDIED_BACON)));
    public static final DeferredItem<Item> CHOCCY_MILCH = ITEMS.register("choccy_milch", () -> new ChoccyMilch(new Item.Properties().food(ModFoodProperties.CHOCCY_MILCH)));
    public static final DeferredItem<Item> LOADED_POTATO = ITEMS.register("loaded_potato", () -> new Item(new Item.Properties().food(ModFoodProperties.LOADED_POTATO)));

    // Crafting/Ingredient items
    public static final DeferredItem<Item> CURD = ITEMS.register("cheese_curd", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHEESIUM = ITEMS.register("cheesium", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHEDDARITE = ITEMS.register("cheddarite", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_CHEDDARITE = ITEMS.register("raw_cheddarite", () -> new Item(new Item.Properties()));

    // Equipment/Tools items
    public static final DeferredItem<Item> MAGIC_CHEESE_GRATER = ITEMS.register("magic_cheese_grater", () -> new MagicGraterItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
