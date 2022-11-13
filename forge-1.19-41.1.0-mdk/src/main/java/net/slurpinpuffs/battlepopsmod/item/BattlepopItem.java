package net.slurpinpuffs.battlepopsmod.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class BattlepopItem extends SwordItem {

	public BattlepopItem(Tier tier, int damage, float attackSpeed, Properties properties) {
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
}
