package com.slurpinpuffs.slurpmodtutorial.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.slurpinpuffs.slurpmodtutorial.SlurpModTutorial;
import com.slurpinpuffs.slurpmodtutorial.entity.ModEntityTypes;
import com.slurpinpuffs.slurpmodtutorial.entity.custom.RedVelvetSweetieEntity;
import com.slurpinpuffs.slurpmodtutorial.entity.custom.SweetieEntity;

@Mod.EventBusSubscriber(modid = SlurpModTutorial.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
	
	@SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.SWEETIE.get(), SweetieEntity.setAttributes());
	}
    @SubscribeEvent
        public static void entityAttributeEvent1(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.RED_VELVET_SWEETIE.get(), RedVelvetSweetieEntity.setAttributes());    
    }
}
