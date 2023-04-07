package eu.ansquare.trymod.entities.renderers;

import eu.ansquare.trymod.Trymod;
import eu.ansquare.trymod.client.TrymodClient;
import eu.ansquare.trymod.entities.SurikataEntity;
import eu.ansquare.trymod.entities.models.SurikataEntityModel;
import eu.ansquare.trymod.entities.models.SurikataGeckoModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SalmonEntityModel;
import net.minecraft.util.Identifier;
import software.bernie.example.client.model.entity.ExampleEntityModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SurikataEntityRenderer extends GeoEntityRenderer<SurikataEntity> {
    public SurikataEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new SurikataGeckoModel());
    }
}
