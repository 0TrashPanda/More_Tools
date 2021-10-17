package jonahdepro.more.tools.registry;


import net.minecraft.util.registry.Registry;
import jonahdepro.more.tools.MoreTools;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;

public class ModItems {
    
	public static final Item TIN_INGOT = new Item(new Item.Settings().group(MoreTools.GROUP));
    public static final Item JONAH_INGOT = new Item(new Item.Settings().group(MoreTools.GROUP));
    public static final Item RAW_TIN = new Item(new Item.Settings().group(MoreTools.GROUP));
    public static final Item RAW_MYTHRIL = new Item(new Item.Settings().group(MoreTools.GROUP));

    public static void registeritems() {
            Registry.register(Registry.ITEM, new Identifier("moretools", "tin_ingot"), TIN_INGOT);
            Registry.register(Registry.ITEM, new Identifier("moretools", "jonah_ingot"), JONAH_INGOT);
            Registry.register(Registry.ITEM, new Identifier("moretools", "raw_tin"), RAW_TIN);
            Registry.register(Registry.ITEM, new Identifier("moretools", "raw_mythril"), RAW_MYTHRIL);
            Registry.register(Registry.ITEM, new Identifier("moretools", "tin_pickaxe"), new PickaxeBase(new ToolMaterialTin(), 0, 0, null));
    }

}
