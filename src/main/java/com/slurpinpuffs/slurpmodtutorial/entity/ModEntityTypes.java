package com.slurpinpuffs.slurpmodtutorial.entity;

import com.slurpinpuffs.slurpmodtutorial.SlurpModTutorial;
import com.slurpinpuffs.slurpmodtutorial.entity.custom.RedVelvetSweetieEntity;
import com.slurpinpuffs.slurpmodtutorial.entity.custom.SweetieEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES
		= DeferredRegister.create(ForgeRegistries.ENTITIES, SlurpModTutorial.MOD_ID);
	
	public static final RegistryObject<EntityType<SweetieEntity>> SWEETIE
		= ENTITY_TYPES.register("sweetie", () -> EntityType.Builder.of(SweetieEntity::new,
		MobCategory.MONSTER).sized(0.7f, 0.8f)
		.build(new ResourceLocation(SlurpModTutorial.MOD_ID, "sweetie").toString()));
	
	public static final RegistryObject<EntityType<RedVelvetSweetieEntity>> RED_VELVET_SWEETIE
	= ENTITY_TYPES.register("red_velvet_sweetie", () -> EntityType.Builder.of(RedVelvetSweetieEntity::new,
	MobCategory.MONSTER).sized(0.7f, 0.8f)
	.build(new ResourceLocation(SlurpModTutorial.MOD_ID, "red_velvet_sweetie").toString()));
	
	public static void register(IEventBus eventBus) {
		ENTITY_TYPES.register(eventBus);
	}
}
