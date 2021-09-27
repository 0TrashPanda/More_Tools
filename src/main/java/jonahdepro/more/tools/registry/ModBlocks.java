package jonahdepro.more.tools.registry;


import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TIN_ORE = new TinOre(FabricBlockSettings.of(Material.STONE).strength(0.8f).breakByTool(FabricToolTags.PICKAXES, 1).requiresTool());

    public static void registeritems() {
            Registry.register(Registry.BLOCK, new Identifier("moretools", "tin_ore"),TIN_ORE);
            Registry.register(Registry.ITEM, new Identifier("moretools", "tin_ore"), new BlockItem(TIN_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
    }

}