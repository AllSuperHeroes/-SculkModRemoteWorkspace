
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SculkModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item SCULK = register(SculkModModBlocks.SCULK, SculkModModTabs.TAB_SCULK_MOD);
	public static final Item SCULKCATALYST = register(SculkModModBlocks.SCULKCATALYST, SculkModModTabs.TAB_SCULK_MOD);
	public static final Item SCULK_SHRIEKER = register(SculkModModBlocks.SCULK_SHRIEKER, SculkModModTabs.TAB_SCULK_MOD);
	public static final Item WARDEN = register(
			new SpawnEggItem(SculkModModEntities.WARDEN, -15128267, -11699040, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("warden_spawn_egg"));

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
