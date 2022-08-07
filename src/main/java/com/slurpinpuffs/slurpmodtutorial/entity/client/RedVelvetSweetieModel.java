package com.slurpinpuffs.slurpmodtutorial.entity.client;

import com.slurpinpuffs.slurpmodtutorial.SlurpModTutorial;
import com.slurpinpuffs.slurpmodtutorial.entity.custom.RedVelvetSweetieEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RedVelvetSweetieModel extends AnimatedGeoModel<RedVelvetSweetieEntity>{

	@Override
	public ResourceLocation getAnimationResource(RedVelvetSweetieEntity animatable) {
		return new ResourceLocation(SlurpModTutorial.MOD_ID, "animations/red-velvet-sweetie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RedVelvetSweetieEntity object) {
		return new ResourceLocation(SlurpModTutorial.MOD_ID, "geo/red_velvet_sweetie_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RedVelvetSweetieEntity object) {
		return new ResourceLocation(SlurpModTutorial.MOD_ID, "textures/entity/redvelvetsweetie/redvelvetsweetie.png");
	}

}
