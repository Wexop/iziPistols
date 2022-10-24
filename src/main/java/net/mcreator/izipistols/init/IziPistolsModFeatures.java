
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.izipistols.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.izipistols.world.features.ores.SolidPistolOrFeature;
import net.mcreator.izipistols.world.features.ores.RandompistoloreFeature;
import net.mcreator.izipistols.world.features.ores.HotSolidPistolStoneFeature;
import net.mcreator.izipistols.world.features.ores.BulletpackFeature;
import net.mcreator.izipistols.IziPistolsMod;

@Mod.EventBusSubscriber
public class IziPistolsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, IziPistolsMod.MODID);
	public static final RegistryObject<Feature<?>> BULLETPACK = REGISTRY.register("bulletpack", BulletpackFeature::feature);
	public static final RegistryObject<Feature<?>> RANDOMPISTOLORE = REGISTRY.register("randompistolore", RandompistoloreFeature::feature);
	public static final RegistryObject<Feature<?>> SOLID_PISTOL_OR = REGISTRY.register("solid_pistol_or", SolidPistolOrFeature::feature);
	public static final RegistryObject<Feature<?>> HOT_SOLID_PISTOL_STONE = REGISTRY.register("hot_solid_pistol_stone",
			HotSolidPistolStoneFeature::feature);
}
