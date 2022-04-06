
package net.mcreator.sculkmod.potion;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.sculkmod.procedures.DarknessProcedureProcedure;

public class DarknessMobEffect extends MobEffect {
	public DarknessMobEffect() {
		super(MobEffectCategory.HARMFUL, -16777216);
		setRegistryName("darkness");
	}

	@Override
	public String getDescriptionId() {
		return "effect.sculk_mod.darkness";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DarknessProcedureProcedure.execute(world, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
