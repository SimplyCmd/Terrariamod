package com.ryorama.terrariamod.items;

import com.ryorama.terrariamod.TerrariaMod;
import com.ryorama.terrariamod.blocks.BlocksT;
import com.ryorama.terrariamod.items.weapons.CopperShortSword;
import com.ryorama.terrariamod.world.features.CopperOreFeature;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemsT {
			
	public static ItemT WOOD = new ItemT(new FabricItemSettings().group(ItemGroup.MISC).maxCount(999)).setRarity(2);
	public static ItemT COPPER_BAR = new ItemT(new FabricItemSettings().group(ItemGroup.MISC).maxCount(999)).setRarity(2);
	public static ItemT GEL = new ItemT(new FabricItemSettings().group(ItemGroup.MISC).maxCount(999)).setRarity(2);
	public static CopperShortSword COPPER_SHORTSWORD = (CopperShortSword) new CopperShortSword().setRarity(3);
	
	public static void init() {
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "wood"), WOOD);
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "copper_bar"), COPPER_BAR);
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "gel"), GEL);
		
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "copper_shortsword"), COPPER_SHORTSWORD);
		
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "grass_block"), new BlockItemT(BlocksT.GRASS_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).maxCount(999)).setRarity(2));
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "dirt_block"), new BlockItemT(BlocksT.DIRT_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).maxCount(999)).setRarity(2));
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "stone_block"), new BlockItemT(BlocksT.STONE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).maxCount(999)));
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "copper_ore"), new BlockItemT(BlocksT.COPPER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).maxCount(999)));
		Registry.register(Registry.ITEM, new Identifier(TerrariaMod.modid, "ash"), new BlockItemT(BlocksT.ASH, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).maxCount(999)));

	}
	
	public static ItemStack gel(int amount, String color) {
		ItemStack stack = GEL.stack(amount);
		CompoundTag tag;
		if (!stack.hasTag()) {
			tag = new CompoundTag();
		} else {
			System.out.println("Has tag");
			tag = stack.getTag();
		}
		tag.putString("GelColor", color);
		stack.setTag(tag);
		return stack;
	}
}
