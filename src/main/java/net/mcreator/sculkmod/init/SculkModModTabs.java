
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SculkModModTabs {
	public static CreativeModeTab TAB_SCULK_MOD;

	public static void load() {
		TAB_SCULK_MOD = new CreativeModeTab("tabsculk_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SculkModModBlocks.SCULK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
