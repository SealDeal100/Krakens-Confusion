
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.krakensconfusion.potion.ObsidianPoisoningMobEffect;
import net.mcreator.krakensconfusion.KrakensConfusionMod;

public class KrakensConfusionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KrakensConfusionMod.MODID);
	public static final RegistryObject<MobEffect> OBSIDIAN_POISONING = REGISTRY.register("obsidian_poisoning", () -> new ObsidianPoisoningMobEffect());
}
