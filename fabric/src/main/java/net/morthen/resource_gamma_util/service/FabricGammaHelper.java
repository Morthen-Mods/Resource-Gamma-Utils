package net.morthen.resource_gamma_util.service;

import net.fabricmc.loader.api.FabricLoader;
import net.irisshaders.iris.api.v0.IrisApi;

public class FabricGammaHelper implements IGammaHelper {

    @Override
    public boolean isIrisLoaded() {
        return FabricLoader.getInstance().isModLoaded("iris");
    }

    @Override
    public boolean isShaderEnabled() {
        if (isIrisLoaded()) {
            return IrisApi.getInstance().getConfig().areShadersEnabled();
        }
        return false;
    }
}
