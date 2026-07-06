package net.morthen.resource_gamma_util;

import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(GammaConstants.MOD_ID)
public class ResourceGammaUtils {
    public ResourceGammaUtils(FMLJavaModLoadingContext context) {
        System.out.println("Gamma Loaded");
    }

    @Mod.EventBusSubscriber(modid = GammaConstants.MOD_ID, value = Dist.CLIENT)
    public static class ModClientHandler {

        @SubscribeEvent
        public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
            event.register(GammaConstants.TOGGLE);
        }

        @SubscribeEvent
        public static void registerClientEvent(TickEvent.ClientTickEvent.Post event) {
            GammaConstants.useHotkey(Minecraft.getInstance());
        }
    }
}
