package net.shuyanmc.mpem.events;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.shuyanmc.mpem.AsyncHandler;
import net.shuyanmc.mpem.particles.AsyncParticleHandler;
@AsyncHandler
public class ModEventHandlers {
    public static void register(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(ModEventHandlers::onCommonSetup);
        forgeEventBus.addListener(AsyncParticleHandler::onServerTick);
    }
    
    private static void onCommonSetup(FMLCommonSetupEvent event) {
        AsyncParticleHandler.init();
    }
}