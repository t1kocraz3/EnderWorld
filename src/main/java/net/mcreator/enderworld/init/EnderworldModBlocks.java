/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enderworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.enderworld.block.*;
import net.mcreator.enderworld.EnderworldMod;

import java.util.function.Function;

public class EnderworldModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EnderworldMod.MODID);
	public static final DeferredBlock<Block> ENDER_TURF;
	public static final DeferredBlock<Block> ENDER_DIRT;
	public static final DeferredBlock<Block> ENDERNITE_ORE;
	public static final DeferredBlock<Block> END_BIRCH;
	public static final DeferredBlock<Block> END_BIRCH_WOOD;
	public static final DeferredBlock<Block> END_BIRCH_LEAVES;
	public static final DeferredBlock<Block> STRIPPED_END_BIRCH;
	public static final DeferredBlock<Block> STRIPPED_END_BIRCH_WOOD;
	public static final DeferredBlock<Block> END_BIRCH_PLANKS;
	public static final DeferredBlock<Block> END_BIRCH_SLAB;
	public static final DeferredBlock<Block> END_BIRCH_STAIRS;
	public static final DeferredBlock<Block> END_BIRCH_DOOR;
	public static final DeferredBlock<Block> END_BIRCH_STEM;
	public static final DeferredBlock<Block> END_BIRCH_FENCE;
	public static final DeferredBlock<Block> END_BIRCH_TRAPDOOR;
	public static final DeferredBlock<Block> ANTI_CRAFTING_TABLE;
	public static final DeferredBlock<Block> END_GRASS;
	public static final DeferredBlock<Block> END_BIRCH_SAPLING;
	static {
		ENDER_TURF = register("ender_turf", EnderGrassBlock::new);
		ENDER_DIRT = register("ender_dirt", EnderDirtBlock::new);
		ENDERNITE_ORE = register("endernite_ore", EnderniteOreBlock::new);
		END_BIRCH = register("end_birch", EndBirchBlock::new);
		END_BIRCH_WOOD = register("end_birch_wood", EndBirchWoodBlock::new);
		END_BIRCH_LEAVES = register("end_birch_leaves", EndBirchLeavesBlock::new);
		STRIPPED_END_BIRCH = register("stripped_end_birch", StrippedEndBirchBlock::new);
		STRIPPED_END_BIRCH_WOOD = register("stripped_end_birch_wood", StrippedEndBirchWoodBlock::new);
		END_BIRCH_PLANKS = register("end_birch_planks", EndBirchPlanksBlock::new);
		END_BIRCH_SLAB = register("end_birch_slab", EndBirchSlabBlock::new);
		END_BIRCH_STAIRS = register("end_birch_stairs", EndBirchStairsBlock::new);
		END_BIRCH_DOOR = register("end_birch_door", EndBirchDoorBlock::new);
		END_BIRCH_STEM = register("end_birch_stem", EndBirchStemBlock::new);
		END_BIRCH_FENCE = register("end_birch_fence", EndBirchFenceBlock::new);
		END_BIRCH_TRAPDOOR = register("end_birch_trapdoor", EndBirchTrapdoorBlock::new);
		ANTI_CRAFTING_TABLE = register("anti_crafting_table", AntiCraftingTableBlock::new);
		END_GRASS = register("end_grass", EndGrassBlock::new);
		END_BIRCH_SAPLING = register("end_birch_sapling", EndBirchSaplingBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}