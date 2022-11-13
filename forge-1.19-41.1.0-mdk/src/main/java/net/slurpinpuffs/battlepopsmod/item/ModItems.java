package net.slurpinpuffs.battlepopsmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.slurpinpuffs.battlepopsmod.BattlepopsMod;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BattlepopsMod.MODID);
	
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", 
			() -> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB).food(new FoodProperties.Builder().alwaysEat().fast()
					.nutrition(4).saturationMod(2.0f).effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 200, 0), 1f).build())));
	
	public static final RegistryObject<Item> APPLE_LOLLIPOP = ITEMS.register("apple_lollipop", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)
			.food(new FoodProperties.Builder().alwaysEat().fast().nutrition(5).saturationMod(2.4f).build())));
	
	public static final RegistryObject<Item> APPLE_BATTLEPOP = ITEMS.register("apple_battlepop", () -> new BattlepopItem
			(Tiers.WOOD, 2, 0f, new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB).stacksTo(1).durability(25)));
	
	public static final RegistryObject<Item> HEART_OF_NEW_BEGINNINGS = ITEMS.register("heart_of_new_beginnings", () -> 
			new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> GOLDEN_APPLE_LOLLIPOP = ITEMS.register("golden_apple_lollipop", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)
			.food(new FoodProperties.Builder().alwaysEat().fast().nutrition(5).saturationMod(2.4f)
					.effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 2400, 1), 1f)
					.effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 125, 0), 1f).build())));
	
	public static final RegistryObject<Item> GOLDEN_APPLE_BATTLEPOP = ITEMS.register("golden_apple_battlepop", () -> new BattlepopItem
			(Tiers.WOOD, 4, -1f, new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB).stacksTo(1).durability(93)));
	
	public static final RegistryObject<Item> SKULL_BATTLEPOP = ITEMS.register("skull_battlepop", () -> new SkullBattlepopItem
			(Tiers.WOOD, 5, -3.4f, new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB).stacksTo(1).durability(250)));
	
	public static final RegistryObject<Item> SKULL_LOLLIPOP = ITEMS.register("skull_lollipop", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)
			.food(new FoodProperties.Builder().alwaysEat().fast().nutrition(5).saturationMod(2.4f)
					.effect(() -> new MobEffectInstance(MobEffects.WITHER, 400, 2), 1f).build())));
	
	public static final RegistryObject<Item> HEART_OF_GOLD = ITEMS.register("heart_of_gold", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> HEART_OF_DECAY = ITEMS.register("heart_of_decay", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> BASIC_CANDY = ITEMS.register("basic_candy", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> SOUL_CANDY = ITEMS.register("soul_candy", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> THOUSAND_SOUL_CANDY = ITEMS.register("thousand_soul_candy", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> MYSTERIOUS_CANDY = ITEMS.register("mysterious_candy", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> SOUL_SUGAR = ITEMS.register("soul_sugar", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	public static final RegistryObject<Item> THOUSAND_SOUL_SUGAR = ITEMS.register("thousand_soul_sugar", () -> 
	new Item(new Item.Properties().tab(ModCreativeModeTab.BATTLEPOPS_TAB)));
	
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
