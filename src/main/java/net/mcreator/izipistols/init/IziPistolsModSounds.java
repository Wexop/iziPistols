
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.izipistols.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.izipistols.IziPistolsMod;

public class IziPistolsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, IziPistolsMod.MODID);
	public static final RegistryObject<SoundEvent> TIR_PISTOLET = REGISTRY.register("tir_pistolet",
			() -> new SoundEvent(new ResourceLocation("izi_pistols", "tir_pistolet")));
}
