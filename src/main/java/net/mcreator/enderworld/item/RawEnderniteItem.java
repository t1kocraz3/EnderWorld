package net.mcreator.enderworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawEnderniteItem extends Item {
	public RawEnderniteItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(16).fireResistant());
	}
}