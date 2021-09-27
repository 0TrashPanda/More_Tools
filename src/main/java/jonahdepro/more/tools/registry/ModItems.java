package jonahdepro.more.tools.registry;


import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class ModItems {
    
	public static final Item TIN_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item JONAH_INGOT = new Item(new Item.Settings().group(ItemGroup.MISC));
    public static final Item RAW_TIN = new Item(new Item.Settings().group(ItemGroup.MISC));

    public static void registeritems() {
            Registry.register(Registry.ITEM, new Identifier("moretools", "tin_ingot"), TIN_INGOT);
            Registry.register(Registry.ITEM, new Identifier("moretools", "jonah_ingot"), JONAH_INGOT);
            Registry.register(Registry.ITEM, new Identifier("moretools", "raw_tin"), RAW_TIN);
    }

}
