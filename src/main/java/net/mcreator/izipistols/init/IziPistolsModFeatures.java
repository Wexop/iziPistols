
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.izipistols.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.izipistols.world.features.ores.RandompistoloreFeature;
import net.mcreator.izipistols.world.features.ores.BulletpackFeature;
import net.mcreator.izipistols.IziPistolsMod;

@Mod.EventBusSubscriber
public class IziPistolsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, IziPistolsMod.MODID);
	public static final RegistryObject<Feature<?>> BULLETPACK = REGISTRY.register("bulletpack", BulletpackFeature::feature);
	public static final RegistryObject<Feature<?>> RANDOMPISTOLORE = REGISTRY.register("randompistolore", RandompistoloreFeature::feature);
}
