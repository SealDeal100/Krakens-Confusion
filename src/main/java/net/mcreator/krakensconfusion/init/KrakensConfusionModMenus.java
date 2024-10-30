
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.krakensconfusion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.krakensconfusion.world.inventory.AlloyUiMenu;
import net.mcreator.krakensconfusion.KrakensConfusionMod;

public class KrakensConfusionModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KrakensConfusionMod.MODID);
	public static final RegistryObject<MenuType<AlloyUiMenu>> ALLOY_UI = REGISTRY.register("alloy_ui", () -> IForgeMenuType.create(AlloyUiMenu::new));
}
