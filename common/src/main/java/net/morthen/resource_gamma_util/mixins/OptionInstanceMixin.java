package net.morthen.resource_gamma_util.mixins;

import net.minecraft.client.OptionInstance;
import net.minecraft.network.chat.Component;
import net.morthen.resource_gamma_util.GammaConstants;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(OptionInstance.class)
public class OptionInstanceMixin<T> {

    @Shadow(remap = false)
    @Final
    private Component caption;

    @Inject(method = "get", at = @At("HEAD"), cancellable = true, remap = false)
    public void resource_gamma_util$set(CallbackInfoReturnable<T> cir) {
        if (caption.equals(Component.translatable("options.gamma")) && GammaConstants.gammaEnabled) {
            cir.setReturnValue((T) GammaConstants.customGamma);
        }
    }
}
