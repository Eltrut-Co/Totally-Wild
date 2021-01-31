package eighthp.totallywild.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;

import eighthp.totallywild.core.TotallyWild;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = TotallyWild.MOD_ID, bus = Bus.MOD)
public class TWBlocks {
	public static final BlockSubRegistryHelper HELPER = TotallyWild.REGISTRY_HELPER.getBlockSubHelper();
	
}