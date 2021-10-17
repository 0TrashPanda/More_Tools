package jonahdepro.more.tools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import jonahdepro.more.tools.registry.ModBlocks;
import jonahdepro.more.tools.registry.ModItems;

public class MoreTools implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("moretools");
	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("moretools", "itemgroup"), () -> new ItemStack(ModItems.JONAH_INGOT));

	@Override
	public void onInitialize() {
		ModItems.registeritems();
		ModBlocks.registeritems();
		worldGen.generate();

	}
}