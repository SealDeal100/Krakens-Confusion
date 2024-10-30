
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KrakensConfusionModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DO_OBSIDIAN_POISONING = GameRules.register("doObsidianPoisoning", GameRules.Category.MOBS, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.IntegerValue> OBSIDIAN_POISONING_DAMAGE_AMOUNT = GameRules.register("obsidianPoisoningDamageAmount", GameRules.Category.MOBS, GameRules.IntegerValue.create(3));
}
