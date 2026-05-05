package cn.hwoxu.nodark.mixin;

import net.minecraft.world.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.client.renderer.FogRenderer;
/**
 * @description: TODO
 * @author: HowXu
 * @date: 2026/5/5 15:20
 */
@Mixin(FogRenderer.BlindnessFogFunction.class)
public abstract class BlindEffectMixin implements FogRenderer.MobEffectFogFunction {

    @Override
    public boolean isEnabled(LivingEntity p_234206_, float p_234207_) {
        return false;
    }
}
