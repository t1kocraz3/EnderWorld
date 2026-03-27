package net.mcreator.enderworld.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.enderworld.procedures.GoldenRottenApplePlayerFinishesUsingItemProcedure;

public class GoldenRottenAppleItem extends Item {
	public GoldenRottenAppleItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.25f).alwaysEdible().build()));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		GoldenRottenApplePlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}