package com.slurpinpuffs.slurpmodtutorial.init;

import com.google.common.base.Supplier;
import com.slurpinpuffs.slurpmodtutorial.SlurpModTutorial;
import com.slurpinpuffs.slurpmodtutorial.item.BattlepopItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			SlurpModTutorial.MOD_ID);

	public static final RegistryObject<Item> TEST_ITEM = register("test_item", 
			() -> new Item(new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB).food(new FoodProperties.Builder().alwaysEat().fast()
					.nutrition(4).saturationMod(2.0f).effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 200, 0), 1f).build())));
	
	public static final RegistryObject<Item> APPLE_LOLLIPOP = register("apple_lollipop", () -> new Item(new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB)
			.food(new FoodProperties.Builder().alwaysEat().fast().nutrition(5).saturationMod(2.4f).build())));
	
	public static final RegistryObject<Item> APPLE_BATTLEPOP = register("apple_battlepop", () -> new BattlepopItem
			(Tiers.WOOD, 2, 0f, new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB).stacksTo(1).durability(25)));
	
	public static final RegistryObject<Item> HEART_OF_NEW_BEGINNINGS = register("heart_of_new_beginnings", () -> 
			new Item(new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> GOLDEN_APPLE_LOLLIPOP = register("golden_apple_lollipop", () -> new Item(new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB)
			.food(new FoodProperties.Builder().alwaysEat().fast().nutrition(5).saturationMod(2.4f)
					.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1f)
					.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 125, 0), 1f).build())));
	
	public static final RegistryObject<Item> GOLDEN_APPLE_BATTLEPOP = register("golden_apple_battlepop", () -> new BattlepopItem
			(Tiers.WOOD, 4, -1f, new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB).stacksTo(1).durability(93)));
	
	public static final RegistryObject<Item> HEART_OF_GOLD = register("heart_of_gold", () -> 
	new Item(new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item){
		return ITEMS.register(name, item);
	}

}
