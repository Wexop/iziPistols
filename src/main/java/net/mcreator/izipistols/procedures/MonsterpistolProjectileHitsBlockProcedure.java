package net.mcreator.izipistols.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Giant;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.izipistols.init.IziPistolsModEntities;
import net.mcreator.izipistols.entity.MobPowderEntity;

public class MonsterpistolProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double random1 = 0;
		double roll = 0;
		double yCalculated = 0;
		random1 = Math.random();
		roll = Math.random();
		yCalculated = y + 1;
		if (random1 >= 0.35 && random1 < 1) {
			if (roll >= 0.75 && roll < 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.5 && roll < 0.75) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Skeleton(EntityType.SKELETON, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.25 && roll < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Creeper(EntityType.CREEPER, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Spider(EntityType.SPIDER, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (random1 >= 0.2 && random1 < 0.35) {
			if (roll >= 0.75 && roll < 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Piglin(EntityType.PIGLIN, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.5 && roll < 0.75) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new PiglinBrute(EntityType.PIGLIN_BRUTE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.25 && roll < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new EnderMan(EntityType.ENDERMAN, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MobPowderEntity(IziPistolsModEntities.MOB_POWDER.get(), _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (random1 >= 0.13 && random1 < 0.2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Blaze(EntityType.BLAZE, _level);
				entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (random1 >= 0.08 && random1 < 0.13) {
			if (roll >= 0.75 && roll < 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new MagmaCube(EntityType.MAGMA_CUBE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.5 && roll < 0.75) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ZombieVillager(EntityType.ZOMBIE_VILLAGER, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.25 && roll < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Pillager(EntityType.PILLAGER, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ZombifiedPiglin(EntityType.ZOMBIFIED_PIGLIN, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (random1 >= 0.04 && random1 < 0.08) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Evoker(EntityType.EVOKER, _level);
				entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (random1 >= 0.02 && random1 < 0.04) {
			if (roll >= 0.75 && roll < 1) {
				for (int index0 = 0; index0 < (int) (5); index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
						entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else if (roll >= 0.5 && roll < 0.75) {
				for (int index1 = 0; index1 < (int) (5); index1++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Skeleton(EntityType.SKELETON, _level);
						entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else if (roll >= 0.25 && roll < 0.5) {
				for (int index2 = 0; index2 < (int) (5); index2++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Creeper(EntityType.CREEPER, _level);
						entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			} else {
				for (int index3 = 0; index3 < (int) (5); index3++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Spider(EntityType.SPIDER, _level);
						entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (random1 >= 0.01 && random1 < 0.02) {
			for (int index4 = 0; index4 < (int) (5); index4++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Blaze(EntityType.BLAZE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else {
			if (roll >= 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Slime(EntityType.SLIME, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Giant(EntityType.GIANT, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
