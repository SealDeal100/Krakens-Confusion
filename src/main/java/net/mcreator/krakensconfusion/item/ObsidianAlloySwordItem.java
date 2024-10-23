
package net.mcreator.krakensconfusion.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.krakensconfusion.procedures.ObsidianAlloySwordHitProcedure;
import net.mcreator.krakensconfusion.init.KrakensConfusionModItems;

public class ObsidianAlloySwordItem extends SwordItem {
	public ObsidianAlloySwordItem() {
		super(new Tier() {
			public int getUses() {
				return 3037;
			}

			public float getSpeed() {
				return 1f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(KrakensConfusionModItems.OBSIDIAN_ALLOY_INGOT.get()));
			}
		}, 3, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		ObsidianAlloySwordHitProcedure.execute(entity);
		return retval;
	}
}
