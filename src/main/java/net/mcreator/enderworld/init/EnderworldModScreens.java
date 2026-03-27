/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.enderworld.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.enderworld.client.gui.AntiCraftingTableGuiScreen;

@EventBusSubscriber(Dist.CLIENT)
public class EnderworldModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(EnderworldModMenus.ANTI_CRAFTING_TABLE_GUI.get(), AntiCraftingTableGuiScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}