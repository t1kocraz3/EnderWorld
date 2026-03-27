package net.mcreator.enderworld.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReinforcedIronRodItem extends Item {
	public ReinforcedIronRodItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON));
	}
}