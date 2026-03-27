package net.mcreator.enderworld.mixin;

import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.core.Holder;

import net.mcreator.enderworld.init.EnderworldModBiomes;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;

@Mixin(NoiseGeneratorSettings.class)
public class NoiseGeneratorSettingsMixin implements EnderworldModBiomes.EnderworldModNoiseGeneratorSettings {
	@Unique
	private Holder<DimensionType> enderworld_dimensionTypeReference;

	@WrapMethod(method = "surfaceRule")
	public SurfaceRules.RuleSource surfaceRule(Operation<SurfaceRules.RuleSource> original) {
		SurfaceRules.RuleSource retval = original.call();
		if (this.enderworld_dimensionTypeReference != null) {
			retval = EnderworldModBiomes.adaptSurfaceRule(retval, this.enderworld_dimensionTypeReference);
		}
		return retval;
	}

	@Override
	public void setenderworldDimensionTypeReference(Holder<DimensionType> dimensionType) {
		this.enderworld_dimensionTypeReference = dimensionType;
	}
}