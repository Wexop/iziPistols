package net.mcreator.izipistols.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.izipistols.IziPistolsModElements;

import java.util.Map;

@IziPistolsModElements.ModElement.Tag
public class BlazepistolBulletHitsPlayerProcedure extends IziPistolsModElements.ModElement {
	public BlazepistolBulletHitsPlayerProcedure(IziPistolsModElements instance) {
		super(instance, 25);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BlazepistolBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.IN_FIRE, (float) 5);
	}
}
