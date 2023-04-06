package eu.ansquare.trymod;

import eu.ansquare.trymod.items.Fineitem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ItemInit {
    public static Item FINE_ITEM;
    public static void init(){
        FINE_ITEM = registerItem(new Fineitem(new Item.Settings().group(ItemGroup.TOOLS)), "fine_item");
    }
    public static Item registerItem(Item item, String name){
        return Registry.register(Registry.ITEM, Trymod.MODID + ":" + name, item);
    }
}
