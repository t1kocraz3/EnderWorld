package net.mcreator.enderworld.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class ReinforcedEndernitePickaxeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3700, 25f, 0, 27, TagKey.create(Registries.ITEM, ResourceLocation.parse("enderworld:reinforced_endernite_pickaxe_repair_items")));

	public ReinforcedEndernitePickaxeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 7f, 1f).fireResistant());
	}
}