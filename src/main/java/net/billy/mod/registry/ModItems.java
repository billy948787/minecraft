package net.billy.mod.registry;

import net.billy.mod.billymod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    

    public static final Item RUBY = new Item(new Item.Settings().group(billymod.ITEM_GROUP));

    public static final BlockItem ANGRY_BLOCK = new BlockItem(ModBlocks.ANGRY_BLOCK, new Item.Settings().group(billymod.ITEM_GROUP));


    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(billymod.MOD_ID,"ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(billymod.MOD_ID,"angry_block"), ANGRY_BLOCK);
        
    }
    
}

