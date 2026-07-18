package com.github.littleemptydoll.lasthope.registry;

import com.github.littleemptydoll.lasthope.LastHope;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    // Реестр всех предметов нашего мода.
    // Всё, что будет зарегистрированно здесь, автоматически получит id
    // вида "lasthope:<имя_предмета>"
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LastHope.MODID);

    private ModItems() {
    }

    // Вспомогательный метод для регистрации предмета блока
    public static DeferredItem<BlockItem> registerBlockItem(
            String name,
            DeferredBlock<? extends Block> block )
    {
        return ITEMS.registerSimpleBlockItem(name, block);
    }

    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
