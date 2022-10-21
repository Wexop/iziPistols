
package net.mcreator.izipistols.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.mcreator.izipistols.init.IziPistolsModItems;
import net.mcreator.izipistols.init.IziPistolsModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class NetherpistolEntity extends AbstractArrow implements ItemSupplier {
	public NetherpistolEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(IziPistolsModEntities.NETHERPISTOL.get(), world);
	}

	public NetherpistolEntity(EntityType<? extends NetherpistolEntity> type, Level world) {
		super(type, world);
	}

	public NetherpistolEntity(EntityType<? extends NetherpistolEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public NetherpistolEntity(EntityType<? extends NetherpistolEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(IziPistolsModItems.BULLET.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(IziPistolsModItems.BULLET.get());
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static NetherpistolEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		NetherpistolEntity entityarrow = new NetherpistolEntity(IziPistolsModEntities.NETHERPISTOL.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("izi_pistols:tir_pistolet")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static NetherpistolEntity shoot(LivingEntity entity, LivingEntity target) {
		NetherpistolEntity entityarrow = new NetherpistolEntity(IziPistolsModEntities.NETHERPISTOL.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(0.3);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("izi_pistols:tir_pistolet")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}