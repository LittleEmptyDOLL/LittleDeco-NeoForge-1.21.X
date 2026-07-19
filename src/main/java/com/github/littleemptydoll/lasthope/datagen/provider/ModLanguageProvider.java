package com.github.littleemptydoll.lasthope.datagen.provider;

import com.github.littleemptydoll.lasthope.datagen.DatagenConstants;
import com.github.littleemptydoll.lasthope.registry.ModBlocks;
import com.github.littleemptydoll.lasthope.registry.definition.BlockDefinition;
import com.github.littleemptydoll.lasthope.util.NameUtils;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, DatagenConstants.MOD_ID, DatagenConstants.EN_US);
    }

    @Override
    protected void addTranslations() {
        for (BlockDefinition definition : ModBlocks.getBlockDefinitions()) {
            add(
                    definition.block().get(),
                    NameUtils.toDisplayName(definition.block().getId().getPath())
            );
        }
    }
}
