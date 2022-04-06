
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sculkmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SculkModModSounds {
	public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(new ResourceLocation("sculk_mod", "sculk_ctalyst_place"),
				new SoundEvent(new ResourceLocation("sculk_mod", "sculk_ctalyst_place")));
		REGISTRY.put(new ResourceLocation("sculk_mod", "sculk_catalyst_break"),
				new SoundEvent(new ResourceLocation("sculk_mod", "sculk_catalyst_break")));
		REGISTRY.put(new ResourceLocation("sculk_mod", "sculk_catalyst_step"),
				new SoundEvent(new ResourceLocation("sculk_mod", "sculk_catalyst_step")));
		REGISTRY.put(new ResourceLocation("sculk_mod", "sculk_catalyst_hit"),
				new SoundEvent(new ResourceLocation("sculk_mod", "sculk_catalyst_hit")));
		REGISTRY.put(new ResourceLocation("sculk_mod", "sculk_catalyst_fall"),
				new SoundEvent(new ResourceLocation("sculk_mod", "sculk_catalyst_fall")));
	}

	@SubscribeEvent
	public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
		for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
			event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
	}
}
