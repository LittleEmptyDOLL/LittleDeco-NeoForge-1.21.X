package com.github.littleemptydoll.lasthope.registry;

import net.neoforged.bus.api.IEventBus;

public class ModRegistries {
    public static void register(IEventBus eventBus) {
        // Register the Deferred Register to the mod event bus so blocks get registered
        ModBlocks.register(eventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ModItems.register(eventBus);
        // Register the Deferred Register to the mod event bus so tabs get registered
        //ModCreativeTabs.register(eventBus);
    }
}
