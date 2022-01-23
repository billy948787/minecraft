package net.billy.mod;

import net.billy.mod.registry.ModBlocks;
import net.billy.mod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class billymod implements ModInitializer {

public static final String MOD_ID = "billymod";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier("billymod","allitems"),
	() -> new ItemStack(ModItems.RUBY)
	);

	

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
	
	}
}
