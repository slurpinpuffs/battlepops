package com.slurpinpuffs.slurpmodtutorial.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;



public class SkullBattlepopItem extends SwordItem {

	public SkullBattlepopItem(Tier tier, int damage, float attackSpeed, Properties properties) {
		super(tier, damage, attackSpeed, properties);
	}
	//Adds Enchantment glint
	@Override
	public boolean isFoil(ItemStack stack) {
		return true;
	}
	public boolean hasEffect(ItemStack stack) {
        return true;
    }
	
	@Override
	public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
		pTarget.addEffect(new MobEffectInstance(MobEffects.WITHER, 200, 1), pAttacker);
		return super.hurtEnemy(pStack,  pTarget, pAttacker);
	}
}