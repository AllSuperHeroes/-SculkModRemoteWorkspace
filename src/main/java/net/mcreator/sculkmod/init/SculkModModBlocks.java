
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.sculkmod.block.SculkcatalystBlock;
import net.mcreator.sculkmod.block.SculkShriekerBlock;
import net.mcreator.sculkmod.block.SculkBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SculkModModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block SCULK = register(new SculkBlock());
	public static final Block SCULKCATALYST = register(new SculkcatalystBlock());
	public static final Block SCULK_SHRIEKER = register(new SculkShriekerBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SculkBlock.registerRenderLayer();
			SculkcatalystBlock.registerRenderLayer();
			SculkShriekerBlock.registerRenderLayer();
		}
	}
}
