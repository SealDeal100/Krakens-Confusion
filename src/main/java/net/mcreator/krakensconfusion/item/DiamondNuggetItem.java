
package net.mcreator.krakensconfusion.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondNuggetItem extends Item {
	public DiamondNuggetItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
