
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.krakensconfusion.KrakensConfusionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KrakensConfusionModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KrakensConfusionMod.MODID);
	public static final RegistryObject<CreativeModeTab> KRAKENS_CONFUSION = REGISTRY.register("krakens_confusion",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.krakens_confusion.krakens_confusion")).icon(() -> new ItemStack(Blocks.COBBLED_DEEPSLATE_WALL)).displayItems((parameters, tabData) -> {
				tabData.accept(KrakensConfusionModItems.FIREBALL.get());
				tabData.accept(KrakensConfusionModItems.DIAMOND_CARROT.get());
				tabData.accept(KrakensConfusionModItems.DIAMOND_NUGGET.get());
				tabData.accept(KrakensConfusionModItems.OBSIDIAN_ALLOY_INGOT.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(KrakensConfusionModItems.ARROW_LASER.get());
			}
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {

			tabData.accept(KrakensConfusionModItems.DIAMOND_NUGGET.get());
			tabData.accept(KrakensConfusionModItems.OBSIDIAN_ALLOY_INGOT.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {

			tabData.accept(KrakensConfusionModItems.DIAMOND_CARROT.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(KrakensConfusionModItems.OBSIDIAN_ALLOY_SWORD.get());

		}
	}
}