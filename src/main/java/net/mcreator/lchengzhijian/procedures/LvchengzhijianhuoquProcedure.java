package net.mcreator.lchengzhijian.procedures;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.NonNullList;

import net.mcreator.lchengzhijian.init.LchengzhijianModItems;

import javax.annotation.Nullable;

import java.util.List;

@Mod.EventBusSubscriber
public class LvchengzhijianhuoquProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (hasEntityInInventory(entity, new ItemStack(LchengzhijianModItems.LVCHENGZHIJIAN.get())) == false) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LchengzhijianModItems.LVCHENGZHIJIAN.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_HELMET.get())) == false
				&& (LchengzhijianModItems.LVCHENGTOUKUI_HELMET.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem()) == false) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_HELMET.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_CHESTPLATE.get())) == false
				&& (LchengzhijianModItems.LVCHENGTOUKUI_CHESTPLATE.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem()) == false) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_CHESTPLATE.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_LEGGINGS.get())) == false
				&& (LchengzhijianModItems.LVCHENGTOUKUI_LEGGINGS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem()) == false) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_LEGGINGS.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (hasEntityInInventory(entity, new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_BOOTS.get())) == false
				&& (LchengzhijianModItems.LVCHENGTOUKUI_BOOTS.get() == (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem()) == false) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(LchengzhijianModItems.LVCHENGTOUKUI_BOOTS.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}

	private static boolean hasEntityInInventory(Entity entity, ItemStack itemstack) {
		if (entity instanceof Player player) {
			Inventory inventory = player.getInventory();
			List<NonNullList<ItemStack>> compartments = com.google.common.collect.ImmutableList.of(inventory.items, inventory.armor, inventory.offhand);
			for (List<ItemStack> list : compartments) {
				for (ItemStack itemstack2 : list) {
					if (!itemstack2.isEmpty() && ItemStack.isSameItem(itemstack2, itemstack)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}