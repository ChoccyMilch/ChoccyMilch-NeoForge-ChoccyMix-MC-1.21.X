package com.choccymilch.choccysmixmod.item;

import com.choccymilch.choccysmixmod.ChoccysMixMod;
import com.choccymilch.choccysmixmod.item.custom.DrinkableItem;
import com.choccymilch.choccysmixmod.item.custom.FuelItem;
import com.choccymilch.choccysmixmod.item.custom.MagicGraterItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ChoccysMixMod.MOD_ID);

    // Food items
    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese", () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.cheese.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> APPLE_PIE = ITEMS.register("apple_pie", () -> new Item(new Item.Properties().food(ModFoodProperties.APPLE_PIE)){
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.apple_pie.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> CARAMEL = ITEMS.register("caramel", () -> new Item(new Item.Properties().food(ModFoodProperties.CARAMEL)) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.caramel.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> CARAMEL_APPLE = ITEMS.register("caramel_apple", () -> new Item(new Item.Properties().food(ModFoodProperties.CARAMEL_APPLE)){
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.caramel_apple.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> RAW_BACON = ITEMS.register("raw_bacon", () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BACON)) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.raw_bacon.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> COOKED_BACON = ITEMS.register("cooked_bacon", () -> new Item(new Item.Properties().food(ModFoodProperties.COOKED_BACON)) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.cooked_bacon.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> CANDIED_BACON = ITEMS.register("candied_bacon", () -> new Item(new Item.Properties().food(ModFoodProperties.CANDIED_BACON)) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.candied_bacon.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> CHOCCY_MILCH = ITEMS.register("choccy_milch", () -> new DrinkableItem(new Item.Properties().food(ModFoodProperties.CHOCCY_MILCH)));
    public static final DeferredItem<Item> LOADED_POTATO = ITEMS.register("loaded_potato", () -> new Item(new Item.Properties().food(ModFoodProperties.LOADED_POTATO)) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.loaded_potato.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> HOT_SAUCE = ITEMS.register("hot_sauce", () -> new DrinkableItem(new Item.Properties().food(ModFoodProperties.HOT_SAUCE)) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.hot_sauce.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    // Crafting/Ingredient items
    public static final DeferredItem<Item> CURD = ITEMS.register("cheese_curd", () -> new Item(new Item.Properties()) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.curd.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> CHEESIUM = ITEMS.register("cheesium", () -> new Item(new Item.Properties()) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.cheesium.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> CHEDDARITE = ITEMS.register("cheddarite", () -> new Item(new Item.Properties()) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.cheddarite.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> RAW_CHEDDARITE = ITEMS.register("raw_cheddarite", () -> new Item(new Item.Properties()) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.raw_cheddarite.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });
    public static final DeferredItem<Item> JET_FUEL = ITEMS.register("jet_fuel", () -> new FuelItem(new Item.Properties(), 800) {
        @Override
        public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
            tooltipComponents.add(Component.translatable("tooltip.choccysmixmod.jet_fuel.tooltip"));
            super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        }
    });

    // Equipment/Tools items
    public static final DeferredItem<Item> MAGIC_CHEESE_GRATER = ITEMS.register("magic_cheese_grater", () -> new MagicGraterItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
