package com.slurpinpuffs.slurpmodtutorial.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.slurpinpuffs.slurpmodtutorial.SlurpModTutorial;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			SlurpModTutorial.MOD_ID);
	
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	public static final RegistryObject<Block> TEST_BLOCK = register("test_block", 
			() -> new Block(BlockBehaviour.Properties.of(Material.REPLACEABLE_FIREPROOF_PLANT, MaterialColor.COLOR_LIGHT_GREEN).noCollission().strength(1.0f).sound(SoundType.AMETHYST)),
			object -> () -> new BlockItem(object.get(),new Item.Properties().tab(SlurpModTutorial.TUTORIAL_TAB)));
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block){
		return BLOCKS.register(name, block);
	}
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block, 
			Function<RegistryObject<T>, Supplier<? extends Item>> item){
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
