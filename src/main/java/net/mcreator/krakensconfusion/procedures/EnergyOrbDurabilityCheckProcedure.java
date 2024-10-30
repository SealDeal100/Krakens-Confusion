package net.mcreator.krakensconfusion.procedures;

import net.minecraft.world.item.ItemStack;

public class EnergyOrbDurabilityCheckProcedure {
	public static double execute(ItemStack itemstack) {
		return itemstack.getDamageValue();
	}
}
