package net.mcreator.enderworld.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.TintedParticleLeavesBlock;
import net.minecraft.world.level.block.SoundType;

public class EndBirchLeavesBlock extends TintedParticleLeavesBlock {
	public EndBirchLeavesBlock(BlockBehaviour.Properties properties) {
		super(0f, properties.sound(SoundType.PINK_PETALS).strength(0.2f, 1f).noOcclusion().pushReaction(PushReaction.DESTROY).isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().isSuffocating((bs, br, bp) -> false)
				.isViewBlocking((bs, br, bp) -> false));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 1;
	}
}