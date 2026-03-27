package net.mcreator.enderworld.item;

import net.minecraft.world.item.Item;

public class ReinforcedEnderniteIngotItem extends Item {
	public ReinforcedEnderniteIngotItem(Item.Properties properties) {
		super(properties.stacksTo(8).fireResistant());
	}
}