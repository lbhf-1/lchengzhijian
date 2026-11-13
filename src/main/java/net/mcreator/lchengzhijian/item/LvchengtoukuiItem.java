package net.mcreator.lchengzhijian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

public abstract class LvchengtoukuiItem extends ArmorItem {
	public LvchengtoukuiItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 44;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{3, 6, 8, 3}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 38;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "lvchengtoukui";
			}

			@Override
			public float getToughness() {
				return 3.8f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.16f;
			}
		}, type, properties);
	}

	public static class Helmet extends LvchengtoukuiItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "lchengzhijian:textures/models/armor/lu_cheng__layer_1.png";
		}
	}

	public static class Chestplate extends LvchengtoukuiItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "lchengzhijian:textures/models/armor/lu_cheng__layer_1.png";
		}
	}

	public static class Leggings extends LvchengtoukuiItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "lchengzhijian:textures/models/armor/lu_cheng__layer_2.png";
		}
	}

	public static class Boots extends LvchengtoukuiItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "lchengzhijian:textures/models/armor/lu_cheng__layer_1.png";
		}
	}
}