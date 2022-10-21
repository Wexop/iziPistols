
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.izipistols.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.izipistols.client.renderer.MobPowderRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class IziPistolsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(IziPistolsModEntities.TEST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.STONEPISTO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.WOODPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.IRONPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.GOLDPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.DIAMSPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.EMERAUDPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.TNT_PISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.EYEPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.NETHERPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.BLAZEPISTOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.MOB_POWDER.get(), MobPowderRenderer::new);
		event.registerEntityRenderer(IziPistolsModEntities.RANDOMPISTOL.get(), ThrownItemRenderer::new);
	}
}
