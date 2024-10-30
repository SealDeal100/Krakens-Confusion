
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.krakensconfusion.block.entity.ObsidianAlloyerBlockEntity;
import net.mcreator.krakensconfusion.KrakensConfusionMod;

public class KrakensConfusionModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KrakensConfusionMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> OBSIDIAN_ALLOYER = register("obsidian_alloyer", KrakensConfusionModBlocks.OBSIDIAN_ALLOYER, ObsidianAlloyerBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
