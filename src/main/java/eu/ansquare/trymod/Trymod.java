package eu.ansquare.trymod;

import eu.ansquare.trymod.blocks.Gnblock;
import eu.ansquare.trymod.items.Fineitem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Trymod implements ModInitializer {

    public static final Fineitem FINE_ITEM = new Fineitem(new FabricItemSettings());
    public static final Gnblock GNBLOCK = new Gnblock(FabricBlockSettings.of(Material.METAL).strength(4.0f).breakInstantly());
    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier("trymod", "fine_item"), FINE_ITEM);
        Registry.register(Registries.BLOCK, new Identifier("trymod", "gnblock"), GNBLOCK);
        Registry.register(Registries.ITEM, new Identifier("trymod", "gnblock"), new BlockItem(GNBLOCK, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {
            content.addAfter(Items.COMPASS, FINE_ITEM);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(content -> {
            content.addAfter(Items.CRAFTING_TABLE, FINE_ITEM);
        });
    }
}
