package net.mcreator.krakensconfusion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class FireballCooldownProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double speed = 0;
		double yaw = 0;
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
		speed = 3;
		yaw = entity.getYRot();
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = EntityType.FIREBALL.spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement((speed * Math.cos((yaw + 90) * (Math.PI / 180))), (entity.getLookAngle().y), (speed * Math.sin((yaw + 90) * (Math.PI / 180))));
			}
		}
	}
}
