package cn.hwoxu.nodark.mixin;

import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(FogRenderer.DarknessFogFunction.class)
public abstract class DarkEffectMixin implements FogRenderer.MobEffectFogFunction {
    @Override
    public boolean isEnabled(LivingEntity p_234206_, float p_234207_) {
        return false;
    }

}