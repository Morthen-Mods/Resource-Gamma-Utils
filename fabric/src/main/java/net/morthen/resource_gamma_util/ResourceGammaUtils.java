package net.morthen.resource_gamma_util;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keymapping.v1.KeyMappingHelper;

public class ResourceGammaUtils implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyMappingHelper.registerKeyMapping(GammaConstants.TOGGLE);

        ClientTickEvents.END_CLIENT_TICK.register(GammaConstants::useHotkey);
    }
}
