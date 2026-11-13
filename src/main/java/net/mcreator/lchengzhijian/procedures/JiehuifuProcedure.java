package net.mcreator.lchengzhijian.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.lchengzhijian.init.LchengzhijianModAttributes;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class JiehuifuProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double yichu = 0;
		if (world.isClientSide() != true) {
			if (entity.onGround() && entity.getDeltaMovement().x() == 0 && entity.getDeltaMovement().z() == 0) {
				if ((entity instanceof LivingEntity _livingEntity4 && _livingEntity4.getAttributes().hasAttribute(LchengzhijianModAttributes.JINGZHI.get())
						? _livingEntity4.getAttribute(LchengzhijianModAttributes.JINGZHI.get()).getBaseValue()
						: 0) < 60) {
					if (entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(LchengzhijianModAttributes.JINGZHI.get()))
						_livingEntity6.getAttribute(LchengzhijianModAttributes.JINGZHI.get())
								.setBaseValue(((entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(LchengzhijianModAttributes.JINGZHI.get())
										? _livingEntity5.getAttribute(LchengzhijianModAttributes.JINGZHI.get()).getBaseValue()
										: 0) + 1));
				} else {
					if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) <= 18) {
						if (entity instanceof Player _player)
							_player.getFoodData().setFoodLevel((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) + 2);
					} else {
						if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 18 && (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) < 20) {
							yichu = 2 - (20 - (entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0));
							if (entity instanceof Player _player)
								_player.getFoodData().setFoodLevel(20);
							if ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) <= 20 - yichu) {
								if (entity instanceof Player _player)
									_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + yichu));
							} else {
								if ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) > 20 - yichu && (entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) < 20) {
									if (entity instanceof Player _player)
										_player.getFoodData().setSaturation(20);
								}
							}
						} else {
							yichu = 2;
							if ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) <= 20 - yichu) {
								if (entity instanceof Player _player)
									_player.getFoodData().setSaturation((float) ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) + yichu));
							} else {
								if ((entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) > 20 - yichu && (entity instanceof Player _plr ? _plr.getFoodData().getSaturationLevel() : 0) < 20) {
									if (entity instanceof Player _player)
										_player.getFoodData().setSaturation(20);
								}
							}
						}
					}
					if (entity instanceof LivingEntity _livingEntity26 && _livingEntity26.getAttributes().hasAttribute(LchengzhijianModAttributes.JINGZHI.get()))
						_livingEntity26.getAttribute(LchengzhijianModAttributes.JINGZHI.get()).setBaseValue(0);
				}
			} else {
				if (entity instanceof LivingEntity _livingEntity27 && _livingEntity27.getAttributes().hasAttribute(LchengzhijianModAttributes.JINGZHI.get()))
					_livingEntity27.getAttribute(LchengzhijianModAttributes.JINGZHI.get()).setBaseValue(0);
			}
		}
	}
}