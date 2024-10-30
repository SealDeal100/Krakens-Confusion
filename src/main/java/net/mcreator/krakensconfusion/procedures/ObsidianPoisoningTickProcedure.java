package net.mcreator.krakensconfusion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.krakensconfusion.init.KrakensConfusionModMobEffects;
import net.mcreator.krakensconfusion.init.KrakensConfusionModGameRules;

public class ObsidianPoisoningTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double seconds = 0;
		seconds = 80 - ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(KrakensConfusionModMobEffects.OBSIDIAN_POISONING.get()) ? _livEnt.getEffect(KrakensConfusionModMobEffects.OBSIDIAN_POISONING.get()).getAmplifier() : 0) - 1) * 20;
		if (seconds < 0) {
			seconds = 0;
		}
		if (entity.getPersistentData().getDouble("obsidian_poisoning_timer") >= seconds) {
			entity.getPersistentData().putDouble("obsidian_poisoning_timer", 0);
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("krakens_confusion:obsidian_poisoning_damage")))),
					(world.getLevelData().getGameRules().getInt(KrakensConfusionModGameRules.OBSIDIAN_POISONING_DAMAGE_AMOUNT)));
		} else {
			entity.getPersistentData().putDouble("obsidian_poisoning_timer", (entity.getPersistentData().getDouble("obsidian_poisoning_timer") + 1));
		}
	}
}
