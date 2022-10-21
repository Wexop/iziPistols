package net.mcreator.izipistols.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import net.mcreator.izipistols.item.WoodpistolItem;
import net.mcreator.izipistols.item.TestItem;
import net.mcreator.izipistols.item.TNTPistolItem;
import net.mcreator.izipistols.item.StonepistoItem;
import net.mcreator.izipistols.item.RandompistolItem;
import net.mcreator.izipistols.item.NetherpistolItem;
import net.mcreator.izipistols.item.IronpistolItem;
import net.mcreator.izipistols.item.GoldpistolItem;
import net.mcreator.izipistols.item.EyepistolItem;
import net.mcreator.izipistols.item.EmeraudpistolItem;
import net.mcreator.izipistols.item.DiamspistolItem;
import net.mcreator.izipistols.item.BulletItem;
import net.mcreator.izipistols.item.BlazepistolItem;
import net.mcreator.izipistols.IziPistolsModElements;

import java.util.Map;

@IziPistolsModElements.ModElement.Tag
public class RandompistoloreBlockDestroyedByPlayerProcedure extends IziPistolsModElements.ModElement {
	public RandompistoloreBlockDestroyedByPlayerProcedure(IziPistolsModElements instance) {
		super(instance, 31);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure RandompistoloreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure RandompistoloreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure RandompistoloreBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure RandompistoloreBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double chance = 0;
		double roll = 0;
		chance = (double) Math.random();
		chance = (double) Math.random();
		if (((chance) >= 0.9)) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(EmeraudpistolItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
			for (int index0 = 0; index0 < (int) (64); index0++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BulletItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((chance) >= 0.75) && ((chance) < 0.9))) {
			if (!world.getWorld().isRemote) {
				ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(RandompistolItem.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.addEntity(entityToSpawn);
			}
			for (int index1 = 0; index1 < (int) (64); index1++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BulletItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((chance) >= 0.6) && ((chance) < 0.75))) {
			if (((chance) >= 0.75)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(DiamspistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if ((((chance) >= 0.5) && ((chance) < 0.75))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(TNTPistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if ((((chance) >= 0.25) && ((chance) < 0.5))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(EyepistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if ((((chance) >= 0) && ((chance) < 0.25))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BlazepistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
			for (int index2 = 0; index2 < (int) (32); index2++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BulletItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((chance) >= 0.4) && ((chance) < 0.6))) {
			if (((chance) >= 0.75)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(GoldpistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if ((((chance) >= 0) && ((chance) < 0.75))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(IronpistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((chance) >= 0.1) && ((chance) < 0.4))) {
			if (((chance) >= 0.75)) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(StonepistoItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if ((((chance) >= 0.5) && ((chance) < 0.75))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(WoodpistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if ((((chance) >= 0.25) && ((chance) < 0.5))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(TestItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			} else if ((((chance) >= 0) && ((chance) < 0.25))) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(NetherpistolItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		} else if ((((chance) >= 0) && ((chance) < 0.1))) {
			for (int index3 = 0; index3 < (int) (128); index3++) {
				if (!world.getWorld().isRemote) {
					ItemEntity entityToSpawn = new ItemEntity(world.getWorld(), x, y, z, new ItemStack(BulletItem.block, (int) (1)));
					entityToSpawn.setPickupDelay(10);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
