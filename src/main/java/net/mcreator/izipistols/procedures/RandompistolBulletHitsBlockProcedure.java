package net.mcreator.izipistols.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import net.mcreator.izipistols.block.RandompistoloreBlock;
import net.mcreator.izipistols.IziPistolsModElements;

import java.util.Map;

@IziPistolsModElements.ModElement.Tag
public class RandompistolBulletHitsBlockProcedure extends IziPistolsModElements.ModElement {
	public RandompistolBulletHitsBlockProcedure(IziPistolsModElements instance) {
		super(instance, 30);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RandompistolBulletHitsBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RandompistolBulletHitsBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RandompistolBulletHitsBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RandompistolBulletHitsBlock!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double chance = 0;
		double roll = 0;
		chance = (double) Math.random();
		roll = (double) Math.random();
		if (((chance) >= 0.9)) {
			if (((roll) >= 0.5)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIAMOND_BLOCK.getDefaultState(), 3);
			} else if ((((roll) >= 0) && ((roll) < 0.5))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.EMERALD_BLOCK.getDefaultState(), 3);
			}
		} else if ((((chance) >= 0.7) && ((chance) < 0.9))) {
			if (((roll) >= 0.75)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.IRON_BLOCK.getDefaultState(), 3);
			} else if ((((roll) >= 0.5) && ((roll) < 0.75))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.REDSTONE_BLOCK.getDefaultState(), 3);
			} else if ((((roll) >= 0.25) && ((roll) < 0.5))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GOLD_BLOCK.getDefaultState(), 3);
			} else if ((((roll) >= 0) && ((roll) < 0.25))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.LAPIS_BLOCK.getDefaultState(), 3);
			}
		} else if ((((chance) >= 0.4) && ((chance) < 0.7))) {
			if (((roll) >= 0.75)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.IRON_ORE.getDefaultState(), 3);
			} else if ((((roll) >= 0.5) && ((roll) < 0.75))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIAMOND_ORE.getDefaultState(), 3);
			} else if ((((roll) >= 0.25) && ((roll) < 0.5))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.EMERALD_ORE.getDefaultState(), 3);
			} else if ((((roll) >= 0) && ((roll) < 0.25))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.TNT.getDefaultState(), 3);
			}
		} else if ((((chance) >= 0.1) && ((chance) < 0.4))) {
			if (((roll) >= 0.75)) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.OAK_LOG.getDefaultState(), 3);
			} else if ((((roll) >= 0.5) && ((roll) < 0.75))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
			} else if ((((roll) >= 0.25) && ((roll) < 0.5))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.STONE.getDefaultState(), 3);
			} else if ((((roll) >= 0) && ((roll) < 0.25))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SAND.getDefaultState(), 3);
			}
		} else if ((((chance) >= 0) && ((chance) < 0.1))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), RandompistoloreBlock.block.getDefaultState(), 3);
		}
	}
}
