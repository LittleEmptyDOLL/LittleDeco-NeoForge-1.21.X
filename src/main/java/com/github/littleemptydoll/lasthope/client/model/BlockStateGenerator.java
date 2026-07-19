package com.github.littleemptydoll.lasthope.client.model;

import com.github.littleemptydoll.lasthope.registry.definition.BlockDefinition;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;

public class BlockStateGenerator {
    private BlockStateGenerator() {}

    public static void register(
            BlockStateProvider provider,
            BlockDefinition definition){
        switch (definition.modelType()) {
            case SIMPLE -> registerSimple(provider, definition);
        }
    }

    private static void registerSimple(
            BlockStateProvider provider,
            BlockDefinition definition
    ) {
        provider.simpleBlock(
                definition.block().get(),
                provider.models().getExistingFile(
                        provider.modLoc(
                                AssetPaths.getBlockModelPath(definition)
                        )
                )
        );
    }
}
