
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.krakensconfusion.item.ObsidianSwordItem;
import net.mcreator.krakensconfusion.item.ObsidianAlloySwordItem;
import net.mcreator.krakensconfusion.item.ObsidianAlloyIngotItem;
import net.mcreator.krakensconfusion.item.FireballItem;
import net.mcreator.krakensconfusion.item.EnergyOrbItem;
import net.mcreator.krakensconfusion.item.EmptyEnergyOrbItem;
import net.mcreator.krakensconfusion.item.DiamondNuggetItem;
import net.mcreator.krakensconfusion.item.DiamondCarrotItem;
import net.mcreator.krakensconfusion.item.ArrowLaserItem;
import net.mcreator.krakensconfusion.KrakensConfusionMod;

public class KrakensConfusionModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KrakensConfusionMod.MODID);
	public static final RegistryObject<Item> FIREBALL = REGISTRY.register("fireball", () -> new FireballItem());
	public static final RegistryObject<Item> ARROW_LASER = REGISTRY.register("arrow_laser", () -> new ArrowLaserItem());
	public static final RegistryObject<Item> DIAMOND_CARROT = REGISTRY.register("diamond_carrot", () -> new DiamondCarrotItem());
	public static final RegistryObject<Item> DIAMOND_NUGGET = REGISTRY.register("diamond_nugget", () -> new DiamondNuggetItem());
	public static final RegistryObject<Item> OBSIDIAN_ALLOY_INGOT = REGISTRY.register("obsidian_alloy_ingot", () -> new ObsidianAlloyIngotItem());
	public static final RegistryObject<Item> OBSIDIAN_ALLOY_SWORD = REGISTRY.register("obsidian_alloy_sword", () -> new ObsidianAlloySwordItem());
	public static final RegistryObject<Item> OBSIDIAN_ALLOY_BLOCK = block(KrakensConfusionModBlocks.OBSIDIAN_ALLOY_BLOCK);
	public static final RegistryObject<Item> OBSIDIAN_COMPACTOR = block(KrakensConfusionModBlocks.OBSIDIAN_COMPACTOR);
	public static final RegistryObject<Item> OBSIDIAN_ALLOYER = block(KrakensConfusionModBlocks.OBSIDIAN_ALLOYER);
	public static final RegistryObject<Item> ENERGY_ORB = REGISTRY.register("energy_orb", () -> new EnergyOrbItem());
	public static final RegistryObject<Item> EMPTY_ENERGY_ORB = REGISTRY.register("empty_energy_orb", () -> new EmptyEnergyOrbItem());
	public static final RegistryObject<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", () -> new ObsidianSwordItem());
	public static final RegistryObject<Item> ENERGY_BLOCK = block(KrakensConfusionModBlocks.ENERGY_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
