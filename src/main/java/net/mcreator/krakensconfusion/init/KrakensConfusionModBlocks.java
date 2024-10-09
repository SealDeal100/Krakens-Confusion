
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.krakensconfusion.block.SkbidiBlock;
import net.mcreator.krakensconfusion.KrakensConfusionMod;

public class KrakensConfusionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KrakensConfusionMod.MODID);
	public static final RegistryObject<Block> SKBIDI = REGISTRY.register("skbidi", () -> new SkbidiBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
