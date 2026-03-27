package net.mcreator.enderworld.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.enderworld.endbiomes.TheEndBiomes;

@EventBusSubscriber
public class EnderworldModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:end_forest")), 5d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:end_forest")), ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:end_forest")), 3d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:end_forest")), ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:end_forest")), 2d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:shulker_garden")), 5d);
			TheEndBiomes.addHighlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:endermite_meadow")), 3d);
			TheEndBiomes.addMidlandsBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:endermite_meadow")), ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:end_forest")), 2d);
			TheEndBiomes.addBarrensBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:endermite_meadow")), ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enderworld:end_forest")), 1d);
		});
	}
}