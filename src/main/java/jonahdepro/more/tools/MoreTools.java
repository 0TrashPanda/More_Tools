package jonahdepro.more.tools;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jonahdepro.more.tools.registry.ModBlocks;
import jonahdepro.more.tools.registry.ModItems;


public class MoreTools implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("moretools");

	

	@Override
	public void onInitialize() {
		ModItems.registeritems();
		ModBlocks.registeritems();
	}
}