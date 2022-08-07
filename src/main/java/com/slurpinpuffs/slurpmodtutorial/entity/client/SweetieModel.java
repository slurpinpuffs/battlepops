package com.slurpinpuffs.slurpmodtutorial.entity.client;

import com.slurpinpuffs.slurpmodtutorial.SlurpModTutorial;
import com.slurpinpuffs.slurpmodtutorial.entity.custom.SweetieEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SweetieModel extends AnimatedGeoModel<SweetieEntity>{

	@Override
	public ResourceLocation getAnimationResource(SweetieEntity animatable) {
		return new ResourceLocation(SlurpModTutorial.MOD_ID, "animations/sweetie.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SweetieEntity object) {
		return new ResourceLocation(SlurpModTutorial.MOD_ID, "geo/sweetie_model.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SweetieEntity object) {
		return new ResourceLocation(SlurpModTutorial.MOD_ID, "textures/entity/sweetie/sweetie.png");
	}

}
