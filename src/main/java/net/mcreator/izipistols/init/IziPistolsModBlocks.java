
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.izipistols.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.izipistols.block.SolidPistolOrBlock;
import net.mcreator.izipistols.block.RandompistoloreBlock;
import net.mcreator.izipistols.block.BulletpackBlock;
import net.mcreator.izipistols.IziPistolsMod;

public class IziPistolsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IziPistolsMod.MODID);
	public static final RegistryObject<Block> BULLETPACK = REGISTRY.register("bulletpack", () -> new BulletpackBlock());
	public static final RegistryObject<Block> RANDOMPISTOLORE = REGISTRY.register("randompistolore", () -> new RandompistoloreBlock());
	public static final RegistryObject<Block> SOLID_PISTOL_OR = REGISTRY.register("solid_pistol_or", () -> new SolidPistolOrBlock());
}
