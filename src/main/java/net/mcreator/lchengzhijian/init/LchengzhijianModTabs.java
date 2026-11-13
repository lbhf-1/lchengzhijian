/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.lchengzhijian.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.lchengzhijian.LchengzhijianMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LchengzhijianModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LchengzhijianMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(LchengzhijianModItems.LVCHENGZHIJIAN.get());
			tabData.accept(LchengzhijianModItems.LVCHENGTOUKUI_HELMET.get());
			tabData.accept(LchengzhijianModItems.LVCHENGTOUKUI_CHESTPLATE.get());
			tabData.accept(LchengzhijianModItems.LVCHENGTOUKUI_LEGGINGS.get());
			tabData.accept(LchengzhijianModItems.LVCHENGTOUKUI_BOOTS.get());
		}
	}
}