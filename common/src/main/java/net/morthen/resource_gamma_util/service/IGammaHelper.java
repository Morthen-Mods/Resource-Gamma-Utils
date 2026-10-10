package net.morthen.resource_gamma_util.service;

import net.morthen.resource_gamma_util.GammaConstants;

import java.util.ServiceLoader;

public interface IGammaHelper {
    IGammaHelper INSTANCE = load(IGammaHelper.class);

    boolean isIrisLoaded();
    boolean isShaderEnabled();

    static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        GammaConstants.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
