package net.mcreator.enderworld.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class EnderniteOreBlock extends Block {
	public EnderniteOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GILDED_BLACKSTONE).strength(25f, 10f).requiresCorrectToolForDrops());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}