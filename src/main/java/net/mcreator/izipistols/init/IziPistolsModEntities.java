
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.izipistols.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.izipistols.entity.WoodpistolEntity;
import net.mcreator.izipistols.entity.TestEntity;
import net.mcreator.izipistols.entity.TNTPistolEntity;
import net.mcreator.izipistols.entity.StonepistoEntity;
import net.mcreator.izipistols.entity.SolidPistolEntity;
import net.mcreator.izipistols.entity.RandompistolEntity;
import net.mcreator.izipistols.entity.NetherpistolEntity;
import net.mcreator.izipistols.entity.MonsterpistolEntity;
import net.mcreator.izipistols.entity.MobPowderEntity;
import net.mcreator.izipistols.entity.IronpistolEntity;
import net.mcreator.izipistols.entity.GoldpistolEntity;
import net.mcreator.izipistols.entity.EyepistolEntity;
import net.mcreator.izipistols.entity.EmeraudpistolEntity;
import net.mcreator.izipistols.entity.DiamspistolEntity;
import net.mcreator.izipistols.entity.BlazepistolEntity;
import net.mcreator.izipistols.entity.AnimalpistolEntity;
import net.mcreator.izipistols.IziPistolsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IziPistolsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, IziPistolsMod.MODID);
	public static final RegistryObject<EntityType<TestEntity>> TEST = register("projectile_test",
			EntityType.Builder.<TestEntity>of(TestEntity::new, MobCategory.MISC).setCustomClientFactory(TestEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<StonepistoEntity>> STONEPISTO = register("projectile_stonepisto",
			EntityType.Builder.<StonepistoEntity>of(StonepistoEntity::new, MobCategory.MISC).setCustomClientFactory(StonepistoEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WoodpistolEntity>> WOODPISTOL = register("projectile_woodpistol",
			EntityType.Builder.<WoodpistolEntity>of(WoodpistolEntity::new, MobCategory.MISC).setCustomClientFactory(WoodpistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronpistolEntity>> IRONPISTOL = register("projectile_ironpistol",
			EntityType.Builder.<IronpistolEntity>of(IronpistolEntity::new, MobCategory.MISC).setCustomClientFactory(IronpistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldpistolEntity>> GOLDPISTOL = register("projectile_goldpistol",
			EntityType.Builder.<GoldpistolEntity>of(GoldpistolEntity::new, MobCategory.MISC).setCustomClientFactory(GoldpistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiamspistolEntity>> DIAMSPISTOL = register("projectile_diamspistol",
			EntityType.Builder.<DiamspistolEntity>of(DiamspistolEntity::new, MobCategory.MISC).setCustomClientFactory(DiamspistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EmeraudpistolEntity>> EMERAUDPISTOL = register("projectile_emeraudpistol",
			EntityType.Builder.<EmeraudpistolEntity>of(EmeraudpistolEntity::new, MobCategory.MISC).setCustomClientFactory(EmeraudpistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TNTPistolEntity>> TNT_PISTOL = register("projectile_tnt_pistol",
			EntityType.Builder.<TNTPistolEntity>of(TNTPistolEntity::new, MobCategory.MISC).setCustomClientFactory(TNTPistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EyepistolEntity>> EYEPISTOL = register("projectile_eyepistol",
			EntityType.Builder.<EyepistolEntity>of(EyepistolEntity::new, MobCategory.MISC).setCustomClientFactory(EyepistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<NetherpistolEntity>> NETHERPISTOL = register("projectile_netherpistol",
			EntityType.Builder.<NetherpistolEntity>of(NetherpistolEntity::new, MobCategory.MISC).setCustomClientFactory(NetherpistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlazepistolEntity>> BLAZEPISTOL = register("projectile_blazepistol",
			EntityType.Builder.<BlazepistolEntity>of(BlazepistolEntity::new, MobCategory.MISC).setCustomClientFactory(BlazepistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MobPowderEntity>> MOB_POWDER = register("mob_powder",
			EntityType.Builder.<MobPowderEntity>of(MobPowderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(30).setUpdateInterval(3).setCustomClientFactory(MobPowderEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<RandompistolEntity>> RANDOMPISTOL = register("projectile_randompistol",
			EntityType.Builder.<RandompistolEntity>of(RandompistolEntity::new, MobCategory.MISC).setCustomClientFactory(RandompistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AnimalpistolEntity>> ANIMALPISTOL = register("projectile_animalpistol",
			EntityType.Builder.<AnimalpistolEntity>of(AnimalpistolEntity::new, MobCategory.MISC).setCustomClientFactory(AnimalpistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MonsterpistolEntity>> MONSTERPISTOL = register("projectile_monsterpistol",
			EntityType.Builder.<MonsterpistolEntity>of(MonsterpistolEntity::new, MobCategory.MISC).setCustomClientFactory(MonsterpistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SolidPistolEntity>> SOLID_PISTOL = register("projectile_solid_pistol",
			EntityType.Builder.<SolidPistolEntity>of(SolidPistolEntity::new, MobCategory.MISC).setCustomClientFactory(SolidPistolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MobPowderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MOB_POWDER.get(), MobPowderEntity.createAttributes().build());
	}
}
