package eighthp.totallywild.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("totally_wild")
@Mod.EventBusSubscriber(modid = "totally_wild", bus = Bus.MOD)
public class TotallyWild
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "totally_wild";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public static TotallyWild instance;

    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public TotallyWild() {
        modEventBus.addListener(this::doCommonStuff);
        modEventBus.addListener(this::doClientStuff);
        instance = this;
        
        REGISTRY_HELPER.register(modEventBus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    }

    private void doCommonStuff(final FMLCommonSetupEvent event) {
    }
    
    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
