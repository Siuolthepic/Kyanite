package com.dev.siuolplex;

import com.dev.siuolplex.blocks.Blocks;
import com.dev.siuolplex.items.Items;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ArmorAugmentation implements ModInitializer {
	public static final ItemGroup ARMORAUGMENT = FabricItemGroupBuilder.build(new Identifier("kyanite","augmentedarmor"), () -> new ItemStack(Items.REFINED_KYANITE));

	public void onInitialize() {
		System.out.println("Kyanite - Starting Initialization");
		Items.init();
		Blocks.init();
		LootTables.init();
		OreGen.init();
		System.out.println("Kyanite - Finished Initialization");
	}
}
