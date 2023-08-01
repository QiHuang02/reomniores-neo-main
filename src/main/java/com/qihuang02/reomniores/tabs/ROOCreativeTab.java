package com.qihuang02.reomniores.tabs;

import com.qihuang02.reomniores.ReOmniOres;
import com.qihuang02.reomniores.items.ROOBlockItem;
import com.qihuang02.reomniores.items.ROOItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ROOCreativeTab {
    public static final String REOOMNIORES_TAB_STRING = "creativetab.reomniores_tab";
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReOmniOres.MODID);

    public static final RegistryObject<CreativeModeTab> REOMNIORES_TAB = CREATIVE_MODE_TABS.register("reomniores_tab",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> new ItemStack(ROOItem.NETHERITE_GEAR.get()))
                    .title(Component.translatable(REOOMNIORES_TAB_STRING))
                    .displayItems((Parameters, output) -> {


                        output.acceptAll(ROOBlockItem.ITEMS.getEntries().stream()
                                .map(RegistryObject::get)
                                .map(b -> (new ItemStack(b)))
                                .toList());
                        output.acceptAll(ROOItem.ITEMS.getEntries().stream()
                                .map(RegistryObject::get)
                                .map(b -> (new ItemStack(b)))
                                .toList());

                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
