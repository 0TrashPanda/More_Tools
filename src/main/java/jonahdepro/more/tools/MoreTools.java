package jonahdepro.more.tools;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import jonahdepro.more.tools.registry.ModBlocks;
import jonahdepro.more.tools.registry.ModItems;

public class MoreTools implements ModInitializer {

	public static final Logger LOGGER = LogManager.getLogger("moretools");

	@Override
	public void onInitialize() {
		ModItems.registeritems();
		ModBlocks.registeritems();
		worldGen.brood();

	}
}