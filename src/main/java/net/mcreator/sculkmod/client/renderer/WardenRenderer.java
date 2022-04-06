package net.mcreator.sculkmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.sculkmod.entity.WardenEntity;
import net.mcreator.sculkmod.client.model.Modelcustom_model;

public class WardenRenderer extends MobRenderer<WardenEntity, Modelcustom_model<WardenEntity>> {
	public WardenRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(WardenEntity entity) {
		return new ResourceLocation("sculk_mod:textures/warden.png");
	}
}
