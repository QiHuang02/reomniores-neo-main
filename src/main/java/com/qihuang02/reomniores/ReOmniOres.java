package com.qihuang02.reomniores;

import com.mojang.logging.LogUtils;
import com.qihuang02.reomniores.blocks.ROOBlock;
import com.qihuang02.reomniores.items.ROOBlockItem;
import com.qihuang02.reomniores.items.ROOItem;
import com.qihuang02.reomniores.tabs.ROOCreativeTab;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ReOmniOres.MODID)
public class ReOmniOres {
    public static final String MODID = "reomniores";
    private static final Logger LOGGER = LogUtils.getLogger();

    public ReOmniOres() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        ROOBlock.BLOCKS.register(modEventBus);
        ROOBlockItem.ITEMS.register(modEventBus);
        ROOItem.ITEMS.register(modEventBus);
        ROOCreativeTab.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
