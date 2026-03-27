/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enderworld.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.enderworld.EnderworldMod;

@EventBusSubscriber
public class EnderworldModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnderworldMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> END_WORLD_DEBUG = REGISTRY.register("end_world_debug",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.enderworld.end_world_debug")).icon(() -> new ItemStack(EnderworldModBlocks.ENDER_TURF.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EnderworldModBlocks.ENDER_TURF.get().asItem());
				tabData.accept(EnderworldModBlocks.ENDER_DIRT.get().asItem());
				tabData.accept(EnderworldModBlocks.ENDERNITE_ORE.get().asItem());
				tabData.accept(EnderworldModItems.RAW_ENDERNITE.get());
				tabData.accept(EnderworldModBlocks.END_BIRCH.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_WOOD.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_LEAVES.get().asItem());
				tabData.accept(EnderworldModBlocks.STRIPPED_END_BIRCH.get().asItem());
				tabData.accept(EnderworldModBlocks.STRIPPED_END_BIRCH_WOOD.get().asItem());
				tabData.accept(EnderworldModItems.ENDERNITE_INGOT.get());
				tabData.accept(EnderworldModBlocks.END_BIRCH_PLANKS.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_SLAB.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_STAIRS.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_DOOR.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_STEM.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_FENCE.get().asItem());
				tabData.accept(EnderworldModBlocks.END_BIRCH_TRAPDOOR.get().asItem());
				tabData.accept(EnderworldModItems.REINFORCED_IRON_INGOT.get());
				tabData.accept(EnderworldModItems.REINFORCED_IRON_ROD.get());
				tabData.accept(EnderworldModItems.ENDERNITE_UPGRADE_SMITHING_TEMPLE.get());
				tabData.accept(EnderworldModBlocks.ANTI_CRAFTING_TABLE.get().asItem());
				tabData.accept(EnderworldModItems.ROTTEN_APPLE.get());
				tabData.accept(EnderworldModBlocks.END_GRASS.get().asItem());
				tabData.accept(EnderworldModItems.GOLDEN_ROTTEN_APPLE.get());
				tabData.accept(EnderworldModBlocks.END_BIRCH_SAPLING.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EnderworldModBlocks.ENDER_TURF.get().asItem());
			tabData.accept(EnderworldModBlocks.ENDER_DIRT.get().asItem());
			tabData.accept(EnderworldModBlocks.ENDERNITE_ORE.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_LEAVES.get().asItem());
			tabData.accept(EnderworldModBlocks.STRIPPED_END_BIRCH.get().asItem());
			tabData.accept(EnderworldModBlocks.END_GRASS.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_SAPLING.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(EnderworldModItems.RAW_ENDERNITE.get());
			tabData.accept(EnderworldModItems.ENDERNITE_INGOT.get());
			tabData.accept(EnderworldModItems.REINFORCED_IRON_INGOT.get());
			tabData.accept(EnderworldModItems.REINFORCED_IRON_ROD.get());
			tabData.accept(EnderworldModItems.ENDERNITE_UPGRADE_SMITHING_TEMPLE.get());
			tabData.accept(EnderworldModItems.REINFORCED_ENDERNITE_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(EnderworldModBlocks.END_BIRCH_WOOD.get().asItem());
			tabData.accept(EnderworldModBlocks.STRIPPED_END_BIRCH_WOOD.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_PLANKS.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_SLAB.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_STAIRS.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_DOOR.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_STEM.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_FENCE.get().asItem());
			tabData.accept(EnderworldModBlocks.END_BIRCH_TRAPDOOR.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(EnderworldModBlocks.ANTI_CRAFTING_TABLE.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(EnderworldModItems.ROTTEN_APPLE.get());
			tabData.accept(EnderworldModItems.GOLDEN_ROTTEN_APPLE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EnderworldModItems.ENDERNITE_PICKAXE.get());
			tabData.accept(EnderworldModItems.REINFORCED_ENDERNITE_PICKAXE.get());
		}
	}
}