package net.mcreator.enderworld.item;

import net.minecraft.world.item.Item;

public class EnderniteIngotItem extends Item {
	public EnderniteIngotItem(Item.Properties properties) {
		super(properties.stacksTo(16).fireResistant());
	}
}