package net.billy.mod.registry;

import net.billy.mod.billymod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ANGRY_BLOCK = new Block(FabricBlockSettings
    .of(Material.METAL)
    .breakByTool(FabricToolTags.PICKAXES,1)
    .breakByHand(false)
    .strength(5, 2000)
    .sounds(BlockSoundGroup.HONEY)
    .luminance(10));




    public static void registerBlocks(){
        Registry.register(Registry.BLOCK,new Identifier(billymod.MOD_ID,"angry_block"),ANGRY_BLOCK);
    }



}