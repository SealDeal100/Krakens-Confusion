
package net.mcreator.krakensconfusion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyEnergyOrbItem extends Item {
	public EmptyEnergyOrbItem() {
		super(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
