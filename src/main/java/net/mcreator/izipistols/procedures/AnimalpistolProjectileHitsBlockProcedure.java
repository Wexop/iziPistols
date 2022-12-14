package net.mcreator.izipistols.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.animal.horse.ZombieHorse;
import net.minecraft.world.entity.animal.horse.TraderLlama;
import net.minecraft.world.entity.animal.horse.SkeletonHorse;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.Turtle;
import net.minecraft.world.entity.animal.Squid;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.animal.Pig;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Cat;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class AnimalpistolProjectileHitsBlockProcedure {
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
					Entity entityToSpawn = new Cow(EntityType.COW, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.5 && roll < 0.75) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Chicken(EntityType.CHICKEN, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.25 && roll < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Pig(EntityType.PIG, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Sheep(EntityType.SHEEP, _level);
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
					Entity entityToSpawn = new Cat(EntityType.CAT, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.5 && roll < 0.75) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Wolf(EntityType.WOLF, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.25 && roll < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Horse(EntityType.HORSE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Fox(EntityType.FOX, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (random1 >= 0.13 && random1 < 0.2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Goat(EntityType.GOAT, _level);
				entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else if (random1 >= 0.08 && random1 < 0.13) {
			if (roll >= 0.75 && roll < 1) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Bat(EntityType.BAT, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.5 && roll < 0.75) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Bee(EntityType.BEE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else if (roll >= 0.25 && roll < 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Turtle(EntityType.TURTLE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Squid(EntityType.SQUID, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (random1 >= 0.04 && random1 < 0.08) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new TraderLlama(EntityType.TRADER_LLAMA, _level);
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
						Entity entityToSpawn = new Cow(EntityType.COW, _level);
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
						Entity entityToSpawn = new Chicken(EntityType.CHICKEN, _level);
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
						Entity entityToSpawn = new Pig(EntityType.PIG, _level);
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
						Entity entityToSpawn = new Sheep(EntityType.SHEEP, _level);
						entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
									null, null);
						world.addFreshEntity(entityToSpawn);
					}
				}
			}
		} else if (random1 >= 0.01 && random1 < 0.02) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new Axolotl(EntityType.AXOLOTL, _level);
				entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		} else {
			if (roll >= 0.5) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new ZombieHorse(EntityType.ZOMBIE_HORSE, _level);
					entityToSpawn.moveTo(x, yCalculated, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new SkeletonHorse(EntityType.SKELETON_HORSE, _level);
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
