package net.mcreator.krakensconfusion.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class FireballGlintProcedure {
	public static boolean execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return false;
		return (entity instanceof Player _plrCldRem1 ? _plrCldRem1.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) >= 0;
	}
}
