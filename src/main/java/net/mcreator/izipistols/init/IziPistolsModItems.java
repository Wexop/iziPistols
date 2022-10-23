
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.izipistols.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.izipistols.item.WoodpistolItem;
import net.mcreator.izipistols.item.TestItem;
import net.mcreator.izipistols.item.TNTPistolItem;
import net.mcreator.izipistols.item.StonepistoItem;
import net.mcreator.izipistols.item.RandompistolItem;
import net.mcreator.izipistols.item.NetherpistolItem;
import net.mcreator.izipistols.item.MonsterpistolItem;
import net.mcreator.izipistols.item.IronpistolItem;
import net.mcreator.izipistols.item.GoldpistolItem;
import net.mcreator.izipistols.item.EyepistolItem;
import net.mcreator.izipistols.item.EmeraudpistolItem;
import net.mcreator.izipistols.item.DiamspistolItem;
import net.mcreator.izipistols.item.BulletItem;
import net.mcreator.izipistols.item.BlazepistolItem;
import net.mcreator.izipistols.item.AnimalpistolItem;
import net.mcreator.izipistols.IziPistolsMod;

public class IziPistolsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IziPistolsMod.MODID);
	public static final RegistryObject<Item> TEST = REGISTRY.register("test", () -> new TestItem());
	public static final RegistryObject<Item> BULLET = REGISTRY.register("bullet", () -> new BulletItem());
	public static final RegistryObject<Item> STONEPISTO = REGISTRY.register("stonepisto", () -> new StonepistoItem());
	public static final RegistryObject<Item> WOODPISTOL = REGISTRY.register("woodpistol", () -> new WoodpistolItem());
	public static final RegistryObject<Item> IRONPISTOL = REGISTRY.register("ironpistol", () -> new IronpistolItem());
	public static final RegistryObject<Item> GOLDPISTOL = REGISTRY.register("goldpistol", () -> new GoldpistolItem());
	public static final RegistryObject<Item> DIAMSPISTOL = REGISTRY.register("diamspistol", () -> new DiamspistolItem());
	public static final RegistryObject<Item> EMERAUDPISTOL = REGISTRY.register("emeraudpistol", () -> new EmeraudpistolItem());
	public static final RegistryObject<Item> TNT_PISTOL = REGISTRY.register("tnt_pistol", () -> new TNTPistolItem());
	public static final RegistryObject<Item> EYEPISTOL = REGISTRY.register("eyepistol", () -> new EyepistolItem());
	public static final RegistryObject<Item> NETHERPISTOL = REGISTRY.register("netherpistol", () -> new NetherpistolItem());
	public static final RegistryObject<Item> BLAZEPISTOL = REGISTRY.register("blazepistol", () -> new BlazepistolItem());
	public static final RegistryObject<Item> MOB_POWDER = REGISTRY.register("mob_powder_spawn_egg",
			() -> new ForgeSpawnEggItem(IziPistolsModEntities.MOB_POWDER, -13290187, -8192000, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> BULLETPACK = block(IziPistolsModBlocks.BULLETPACK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RANDOMPISTOL = REGISTRY.register("randompistol", () -> new RandompistolItem());
	public static final RegistryObject<Item> RANDOMPISTOLORE = block(IziPistolsModBlocks.RANDOMPISTOLORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ANIMALPISTOL = REGISTRY.register("animalpistol", () -> new AnimalpistolItem());
	public static final RegistryObject<Item> MONSTERPISTOL = REGISTRY.register("monsterpistol", () -> new MonsterpistolItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
