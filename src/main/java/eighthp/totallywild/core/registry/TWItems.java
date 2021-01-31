package eighthp.totallywild.core.registry;

import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import eighthp.totallywild.core.TotallyWild;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = TotallyWild.MOD_ID, bus = Bus.MOD)
public class TWItems {
	public static final ItemSubRegistryHelper HELPER = TotallyWild.REGISTRY_HELPER.getItemSubHelper();
	
}