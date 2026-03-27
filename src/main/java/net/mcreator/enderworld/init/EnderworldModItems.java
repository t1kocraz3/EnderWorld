/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enderworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.enderworld.item.*;
import net.mcreator.enderworld.EnderworldMod;

import java.util.function.Function;

public class EnderworldModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EnderworldMod.MODID);
	public static final DeferredItem<Item> ENDER_TURF;
	public static final DeferredItem<Item> ENDER_DIRT;
	public static final DeferredItem<Item> ENDERNITE_ORE;
	public static final DeferredItem<Item> RAW_ENDERNITE;
	public static final DeferredItem<Item> END_BIRCH;
	public static final DeferredItem<Item> END_BIRCH_WOOD;
	public static final DeferredItem<Item> END_BIRCH_LEAVES;
	public static final DeferredItem<Item> STRIPPED_END_BIRCH;
	public static final DeferredItem<Item> STRIPPED_END_BIRCH_WOOD;
	public static final DeferredItem<Item> ENDERNITE_INGOT;
	public static final DeferredItem<Item> END_BIRCH_PLANKS;
	public static final DeferredItem<Item> END_BIRCH_SLAB;
	public static final DeferredItem<Item> END_BIRCH_STAIRS;
	public static final DeferredItem<Item> END_BIRCH_DOOR;
	public static final DeferredItem<Item> END_BIRCH_STEM;
	public static final DeferredItem<Item> END_BIRCH_FENCE;
	public static final DeferredItem<Item> END_BIRCH_TRAPDOOR;
	public static final DeferredItem<Item> REINFORCED_IRON_INGOT;
	public static final DeferredItem<Item> REINFORCED_IRON_ROD;
	public static final DeferredItem<Item> ENDERNITE_UPGRADE_SMITHING_TEMPLE;
	public static final DeferredItem<Item> ANTI_CRAFTING_TABLE;
	public static final DeferredItem<Item> ROTTEN_APPLE;
	public static final DeferredItem<Item> END_GRASS;
	public static final DeferredItem<Item> REINFORCED_ENDERNITE_INGOT;
	public static final DeferredItem<Item> GOLDEN_ROTTEN_APPLE;
	public static final DeferredItem<Item> ENDERNITE_PICKAXE;
	public static final DeferredItem<Item> REINFORCED_ENDERNITE_PICKAXE;
	public static final DeferredItem<Item> END_BIRCH_SAPLING;
	static {
		ENDER_TURF = block(EnderworldModBlocks.ENDER_TURF);
		ENDER_DIRT = block(EnderworldModBlocks.ENDER_DIRT);
		ENDERNITE_ORE = block(EnderworldModBlocks.ENDERNITE_ORE, new Item.Properties().fireResistant());
		RAW_ENDERNITE = register("raw_endernite", RawEnderniteItem::new);
		END_BIRCH = block(EnderworldModBlocks.END_BIRCH);
		END_BIRCH_WOOD = block(EnderworldModBlocks.END_BIRCH_WOOD);
		END_BIRCH_LEAVES = block(EnderworldModBlocks.END_BIRCH_LEAVES);
		STRIPPED_END_BIRCH = block(EnderworldModBlocks.STRIPPED_END_BIRCH);
		STRIPPED_END_BIRCH_WOOD = block(EnderworldModBlocks.STRIPPED_END_BIRCH_WOOD);
		ENDERNITE_INGOT = register("endernite_ingot", EnderniteIngotItem::new);
		END_BIRCH_PLANKS = block(EnderworldModBlocks.END_BIRCH_PLANKS);
		END_BIRCH_SLAB = block(EnderworldModBlocks.END_BIRCH_SLAB);
		END_BIRCH_STAIRS = block(EnderworldModBlocks.END_BIRCH_STAIRS);
		END_BIRCH_DOOR = doubleBlock(EnderworldModBlocks.END_BIRCH_DOOR);
		END_BIRCH_STEM = block(EnderworldModBlocks.END_BIRCH_STEM);
		END_BIRCH_FENCE = block(EnderworldModBlocks.END_BIRCH_FENCE);
		END_BIRCH_TRAPDOOR = block(EnderworldModBlocks.END_BIRCH_TRAPDOOR);
		REINFORCED_IRON_INGOT = register("reinforced_iron_ingot", ReinforcedIronIngotItem::new);
		REINFORCED_IRON_ROD = register("reinforced_iron_rod", ReinforcedIronRodItem::new);
		ENDERNITE_UPGRADE_SMITHING_TEMPLE = register("endernite_upgrade_smithing_temple", EnderniteUpgradeSmithingTempleItem::new);
		ANTI_CRAFTING_TABLE = block(EnderworldModBlocks.ANTI_CRAFTING_TABLE, new Item.Properties().fireResistant());
		ROTTEN_APPLE = register("rotten_apple", RottenAppleItem::new);
		END_GRASS = block(EnderworldModBlocks.END_GRASS);
		REINFORCED_ENDERNITE_INGOT = register("reinforced_endernite_ingot", ReinforcedEnderniteIngotItem::new);
		GOLDEN_ROTTEN_APPLE = register("golden_rotten_apple", GoldenRottenAppleItem::new);
		ENDERNITE_PICKAXE = register("endernite_pickaxe", EndernitePickaxeItem::new);
		REINFORCED_ENDERNITE_PICKAXE = register("reinforced_endernite_pickaxe", ReinforcedEndernitePickaxeItem::new);
		END_BIRCH_SAPLING = block(EnderworldModBlocks.END_BIRCH_SAPLING);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static DeferredItem<Item> doubleBlock(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new DoubleHighBlockItem(block.get(), prop), properties);
	}
}