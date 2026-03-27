package net.mcreator.enderworld.block;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.SoundType;

public class EndBirchTrapdoorBlock extends TrapDoorBlock {
	public EndBirchTrapdoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.NETHER_WOOD).strength(2f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).ignitedByLava());
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 0;
	}
}