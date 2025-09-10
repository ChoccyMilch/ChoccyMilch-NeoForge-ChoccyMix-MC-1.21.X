package com.choccymilch.choccysmixmod.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import com.choccymilch.choccysmixmod.block.ModBlocks;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;

public class MagicGraterItem extends Item {
    private static final Map<Block, Block> MAGIC_GRATER_MAP =
            Map.of(
                    ModBlocks.CHEESE_BLOCK.get(), ModBlocks.CHEESIUM_BLOCK.get()
            );
    public MagicGraterItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        // Getting the level
        Level level = context.getLevel();
        // Get the block we clicked on
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(MAGIC_GRATER_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), MAGIC_GRATER_MAP.get(clickedBlock).defaultBlockState());

                // Damage tool durability
                context.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), context.getPlayer(),
                        item -> {
                            if(context.getPlayer() != null) {
                                context.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND);
                            }
                        });

                level.playSound(null, context.getClickedPos(), SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
