
package net.mcreator.izipistols.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.izipistols.entity.MobPowderEntity;

public class MobPowderRenderer extends MobRenderer<MobPowderEntity, SpiderModel<MobPowderEntity>> {
	public MobPowderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MobPowderEntity entity) {
		return new ResourceLocation("izi_pistols:textures/entities/mobpowdervserionspider.png");
	}
}
