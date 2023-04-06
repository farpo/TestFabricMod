package eu.ansquare.trymod;

import eu.ansquare.trymod.blocks.Gnblock;
import eu.ansquare.trymod.entities.SurikataEntity;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Material;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.*;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Trymod implements ModInitializer {
    public static final String MODID = "trymod";

    public static final EntityType<SurikataEntity> SURIKATA = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier(MODID, "surikata"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SurikataEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());
    @Override
    public void onInitialize() {
        BlockInit.init();
        ItemInit.init();
        FabricDefaultAttributeRegistry.register(SURIKATA, SurikataEntity.createMobAttributes());
    }
}
