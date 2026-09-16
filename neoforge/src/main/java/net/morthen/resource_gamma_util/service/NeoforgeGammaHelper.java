package net.morthen.resource_gamma_util.service;

import net.irisshaders.iris.api.v0.IrisApi;
import net.morthen.resource_gamma_util.GammaConstants;
import net.morthen.resource_gamma_util.ResourceGammaUtils;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoforgeGammaHelper implements IGammaHelper {
    @Override
    public boolean isIrisLoaded() {
        try {
            Class.forName("net.irisshaders.iris.Iris", false, ResourceGammaUtils.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    @Override
    public boolean isShaderEnabled() {
        if (isIrisLoaded()) {
            return IrisApi.getInstance().getConfig().areShadersEnabled();
        }
        return false;
    }
}
