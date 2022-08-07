package com.slurpinpuffs.slurpmodtutorial;

import com.slurpinpuffs.slurpmodtutorial.entity.client.RedVelvetSweetieRenderer;
import com.slurpinpuffs.slurpmodtutorial.entity.client.SweetieRenderer;
import com.slurpinpuffs.slurpmodtutorial.entity.ModEntityTypes;
import com.slurpinpuffs.slurpmodtutorial.init.BlockInit;
import com.slurpinpuffs.slurpmodtutorial.init.ItemInit;

import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;

@Mod("slurpmodtutorial")

public class SlurpModTutorial {
	
	public static final String MOD_ID = "slurpmodtutorial";
	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.TEST_ITEM.get());
		}
	};
	
	private void clientSetup(final FMLClientSetupEvent event) {
		EntityRenderers.register(ModEntityTypes.SWEETIE.get(), SweetieRenderer::new);
		EntityRenderers.register(ModEntityTypes.RED_VELVET_SWEETIE.get(), RedVelvetSweetieRenderer::new);
	}
	
	public SlurpModTutorial() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		BlockInit.BLOCKS.register(bus);
		ModEntityTypes.ENTITY_TYPES.register(bus);
		
		GeckoLib.initialize();
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
