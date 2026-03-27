package net.mcreator.enderworld.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class StrippedEndBirchBlock extends Block {
	public StrippedEndBirchBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_WOOD).strength(1f, 10f).ignitedByLava());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}