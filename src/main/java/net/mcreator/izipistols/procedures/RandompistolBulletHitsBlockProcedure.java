package net.mcreator.izipistols.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.izipistols.init.IziPistolsModBlocks;

public class RandompistolBulletHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double chance = 0;
		double roll = 0;
		chance = Math.random();
		roll = Math.random();
		if (chance >= 0.9) {
			if (roll >= 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.DIAMOND_BLOCK.defaultBlockState(), 3);
			} else if (roll >= 0 && roll < 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.EMERALD_BLOCK.defaultBlockState(), 3);
			}
		} else if (chance >= 0.7 && chance < 0.9) {
			if (roll >= 0.75) {
				world.setBlock(new BlockPos(x, y, z), Blocks.IRON_BLOCK.defaultBlockState(), 3);
			} else if (roll >= 0.5 && roll < 0.75) {
				world.setBlock(new BlockPos(x, y, z), Blocks.REDSTONE_BLOCK.defaultBlockState(), 3);
			} else if (roll >= 0.25 && roll < 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.GOLD_BLOCK.defaultBlockState(), 3);
			} else if (roll >= 0 && roll < 0.25) {
				world.setBlock(new BlockPos(x, y, z), Blocks.LAPIS_BLOCK.defaultBlockState(), 3);
			}
		} else if (chance >= 0.4 && chance < 0.7) {
			if (roll >= 0.75) {
				world.setBlock(new BlockPos(x, y, z), Blocks.IRON_ORE.defaultBlockState(), 3);
			} else if (roll >= 0.5 && roll < 0.75) {
				world.setBlock(new BlockPos(x, y, z), Blocks.DIAMOND_ORE.defaultBlockState(), 3);
			} else if (roll >= 0.25 && roll < 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.EMERALD_ORE.defaultBlockState(), 3);
			} else if (roll >= 0 && roll < 0.25) {
				world.setBlock(new BlockPos(x, y, z), Blocks.TNT.defaultBlockState(), 3);
			}
		} else if (chance >= 0.1 && chance < 0.4) {
			if (roll >= 0.75) {
				world.setBlock(new BlockPos(x, y, z), Blocks.OAK_LOG.defaultBlockState(), 3);
			} else if (roll >= 0.5 && roll < 0.75) {
				world.setBlock(new BlockPos(x, y, z), Blocks.DIRT.defaultBlockState(), 3);
			} else if (roll >= 0.25 && roll < 0.5) {
				world.setBlock(new BlockPos(x, y, z), Blocks.STONE.defaultBlockState(), 3);
			} else if (roll >= 0 && roll < 0.25) {
				world.setBlock(new BlockPos(x, y, z), Blocks.SAND.defaultBlockState(), 3);
			}
		} else if (chance >= 0 && chance < 0.1) {
			world.setBlock(new BlockPos(x, y, z), IziPistolsModBlocks.RANDOMPISTOLORE.get().defaultBlockState(), 3);
		}
	}
}
