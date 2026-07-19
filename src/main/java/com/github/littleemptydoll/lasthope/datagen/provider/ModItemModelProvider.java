package com.github.littleemptydoll.lasthope.datagen.provider;

import com.github.littleemptydoll.lasthope.client.model.ItemModelGenerator;
import com.github.littleemptydoll.lasthope.datagen.DatagenConstants;
import com.github.littleemptydoll.lasthope.registry.ModBlocks;
import com.github.littleemptydoll.lasthope.registry.definition.BlockDefinition;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DatagenConstants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (BlockDefinition definition : ModBlocks.getBlockDefinitions()) {
            ItemModelGenerator.register(this, definition);
        }
    }
}
