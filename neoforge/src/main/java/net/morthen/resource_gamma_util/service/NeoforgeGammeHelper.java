package net.morthen.resource_gamma_util.service;

import net.irisshaders.iris.api.v0.IrisApi;
import net.neoforged.fml.ModList;

public class NeoforgeGammeHelper implements IGammaHelper {
    @Override
    public boolean isIrisLoaded() {
        return ModList.get().isLoaded("iris");
    }

    @Override
    public boolean isShaderEnabled() {
        if (isIrisLoaded()) return IrisApi.getInstance().getConfig().areShadersEnabled();
        return false;
    }
}
