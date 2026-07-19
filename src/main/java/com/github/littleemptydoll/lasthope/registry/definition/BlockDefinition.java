package com.github.littleemptydoll.lasthope.registry.definition;

import com.github.littleemptydoll.lasthope.client.model.ModelType;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;

public record BlockDefinition(
        DeferredBlock<? extends Block> block,
        // Поведение
        ModelType modelType,
        // Ресурсы
        AssetFolder assetFolder
) {
}
