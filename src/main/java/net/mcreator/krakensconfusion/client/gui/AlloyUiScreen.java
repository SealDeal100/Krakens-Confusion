package net.mcreator.krakensconfusion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.krakensconfusion.world.inventory.AlloyUiMenu;
import net.mcreator.krakensconfusion.procedures.ProgressTwentyOneToThirtyProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressThirtyOneToFourtyProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressSixtyOneToSeventyAlloyerProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressSeventyOneToEightyAlloyerProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressOneToTenAlloyerProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressNinetyOneToOneHundredAlloyerProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressFourtyOneToFiftyAlloyerProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressFiftyOneToSixtyAlloyerProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressElevenToTwentyAlloyerProcedure;
import net.mcreator.krakensconfusion.procedures.ProgressEightyOneToNinetyAlloyerProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class AlloyUiScreen extends AbstractContainerScreen<AlloyUiMenu> {
	private final static HashMap<String, Object> guistate = AlloyUiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AlloyUiScreen(AlloyUiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("krakens_confusion:textures/screens/alloy_ui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_empty.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);

		if (ProgressOneToTenAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_0.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressElevenToTwentyAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_1.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressTwentyOneToThirtyProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_2.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressThirtyOneToFourtyProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_3.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressFourtyOneToFiftyAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_4.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressFiftyOneToSixtyAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_5.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressSixtyOneToSeventyAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_6.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressSeventyOneToEightyAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_7.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressEightyOneToNinetyAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_8.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		if (ProgressNinetyOneToOneHundredAlloyerProcedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("krakens_confusion:textures/screens/progress_bar_filled_9.png"), this.leftPos + 106, this.topPos + 39, 0, 0, 54, 10, 54, 10);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.krakens_confusion.alloy_ui.label_alloying"), 7, 12, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
