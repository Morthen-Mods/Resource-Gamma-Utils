package net.morthen.resource_gamma_util.utils;

import net.irisshaders.iris.api.v0.IrisApi;

public class IrisUtils {
    public static boolean isIrisLoaded() {
        try {
            Class.forName("net.irisshaders.iris.Iris", false, IrisUtils.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static boolean isShaderEnabled() {
        if (isIrisLoaded()) {
            return IrisApi.getInstance().getConfig().areShadersEnabled();
        }
        return false;
    }
}
