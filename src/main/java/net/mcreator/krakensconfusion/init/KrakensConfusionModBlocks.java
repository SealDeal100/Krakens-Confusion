
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.krakensconfusion.block.ObsidianCompactorBlock;
import net.mcreator.krakensconfusion.block.ObsidianAlloyerBlock;
import net.mcreator.krakensconfusion.block.ObsidianAlloyBlockBlock;
import net.mcreator.krakensconfusion.block.EnergyBlockBlock;
import net.mcreator.krakensconfusion.block.CompressedDiamondBlockBlock;
import net.mcreator.krakensconfusion.block.AlternateWorldPortalBlock;
import net.mcreator.krakensconfusion.KrakensConfusionMod;

public class KrakensConfusionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KrakensConfusionMod.MODID);
	public static final RegistryObject<Block> OBSIDIAN_ALLOY_BLOCK = REGISTRY.register("obsidian_alloy_block", () -> new ObsidianAlloyBlockBlock());
	public static final RegistryObject<Block> OBSIDIAN_COMPACTOR = REGISTRY.register("obsidian_compactor", () -> new ObsidianCompactorBlock());
	public static final RegistryObject<Block> OBSIDIAN_ALLOYER = REGISTRY.register("obsidian_alloyer", () -> new ObsidianAlloyerBlock());
	public static final RegistryObject<Block> ENERGY_BLOCK = REGISTRY.register("energy_block", () -> new EnergyBlockBlock());
	public static final RegistryObject<Block> ALTERNATE_WORLD_PORTAL = REGISTRY.register("alternate_world_portal", () -> new AlternateWorldPortalBlock());
	public static final RegistryObject<Block> COMPRESSED_DIAMOND_BLOCK = REGISTRY.register("compressed_diamond_block", () -> new CompressedDiamondBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
