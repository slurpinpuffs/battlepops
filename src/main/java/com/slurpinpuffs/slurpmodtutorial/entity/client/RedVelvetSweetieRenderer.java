package com.slurpinpuffs.slurpmodtutorial.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.slurpinpuffs.slurpmodtutorial.SlurpModTutorial;
import com.slurpinpuffs.slurpmodtutorial.entity.custom.RedVelvetSweetieEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RedVelvetSweetieRenderer extends GeoEntityRenderer<RedVelvetSweetieEntity>{

	public RedVelvetSweetieRenderer(Context renderManager) {
		super(renderManager, new RedVelvetSweetieModel());
		this.shadowRadius = 0.3f;
	}
	
	@Override
    public ResourceLocation getTextureLocation(RedVelvetSweetieEntity instance) {
        return new ResourceLocation(SlurpModTutorial.MOD_ID, "textures/entity/red_velvet_sweetie_model/red_velvet_sweetie_model.png");
    }

    @Override
    public RenderType getRenderType(RedVelvetSweetieEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(1.0F, 1.0F, 1.0F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

}