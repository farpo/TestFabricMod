package eu.ansquare.trymod.entities.renderers;

import eu.ansquare.trymod.Trymod;
import eu.ansquare.trymod.client.TrymodClient;
import eu.ansquare.trymod.entities.SurikataEntity;
import eu.ansquare.trymod.entities.models.SurikataEntityModel;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SalmonEntityModel;
import net.minecraft.util.Identifier;

public class SurikataEntityRenderer extends MobEntityRenderer<SurikataEntity, SurikataEntityModel> {
    public SurikataEntityRenderer(EntityRendererFactory.Context context){
        super(context, new SurikataEntityModel(context.getPart(TrymodClient.SURIKATA_MODEL_LAYER)), 0.5f);
    }
    @Override
    public Identifier getTexture(SurikataEntity entity){
        return new Identifier(Trymod.MODID, "textures/entity/surikata/surikata.png");
    }
}
