package com.github.littleemptydoll.lasthope.client.model;

import com.github.littleemptydoll.lasthope.registry.definition.BlockDefinition;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;

public class ItemModelGenerator {
    private ItemModelGenerator() {}

    public static void register(
            ItemModelProvider provider,
            BlockDefinition definition){
        registerSimple(provider, definition);
    }

    private static void registerSimple(
            ItemModelProvider provider,
            BlockDefinition definition
    ) {
        provider.withExistingParent(
                definition.block().getId().getPath(),
                provider.modLoc(
                        AssetPaths.getBlockModelPath(definition)
                )
        );
    }
}
