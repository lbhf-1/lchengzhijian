/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lchengzhijian.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.lchengzhijian.item.LvchengzhijianItem;
import net.mcreator.lchengzhijian.item.LvchengtoukuiItem;
import net.mcreator.lchengzhijian.LchengzhijianMod;

public class LchengzhijianModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LchengzhijianMod.MODID);
	public static final RegistryObject<Item> LVCHENGZHIJIAN;
	public static final RegistryObject<Item> LVCHENGTOUKUI_HELMET;
	public static final RegistryObject<Item> LVCHENGTOUKUI_CHESTPLATE;
	public static final RegistryObject<Item> LVCHENGTOUKUI_LEGGINGS;
	public static final RegistryObject<Item> LVCHENGTOUKUI_BOOTS;
	static {
		LVCHENGZHIJIAN = REGISTRY.register("lvchengzhijian", LvchengzhijianItem::new);
		LVCHENGTOUKUI_HELMET = REGISTRY.register("lvchengtoukui_helmet", LvchengtoukuiItem.Helmet::new);
		LVCHENGTOUKUI_CHESTPLATE = REGISTRY.register("lvchengtoukui_chestplate", LvchengtoukuiItem.Chestplate::new);
		LVCHENGTOUKUI_LEGGINGS = REGISTRY.register("lvchengtoukui_leggings", LvchengtoukuiItem.Leggings::new);
		LVCHENGTOUKUI_BOOTS = REGISTRY.register("lvchengtoukui_boots", LvchengtoukuiItem.Boots::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}