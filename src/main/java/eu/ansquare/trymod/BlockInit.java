package eu.ansquare.trymod;

import eu.ansquare.trymod.blocks.Gnblock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


import java.util.LinkedHashMap;
import java.util.Map;

public class BlockInit {
    private static final Map<Block, Identifier> BLOCKS = new LinkedHashMap<>();
    private static final Map<Item, Identifier> BLOCKITEMS = new LinkedHashMap<>();

    public static final Block GNBLOCK = createBlockAndItem("gnblock", new Gnblock(FabricBlockSettings.of(Material.METAL).strength(4.0f).breakInstantly()), ItemGroup.DECORATIONS);
    private static <T extends Block> T createBlockAndItem(String name, T block, ItemGroup itemGroup){
        BLOCKS.put(block, new Identifier(Trymod.MODID, name));
        BLOCKITEMS.put(new BlockItem(block, new Item.Settings().group(itemGroup)), BLOCKS.get(block));
        return block;
    }
    public static void init(){
        BLOCKS.keySet().forEach(block -> Registry.register(Registry.BLOCK, BLOCKS.get(block), block));
        BLOCKITEMS.keySet().forEach(item -> Registry.register(Registry.ITEM, BLOCKITEMS.get(item), item));
    }
}
