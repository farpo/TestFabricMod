package eu.ansquare.trymod.entities.models;

import eu.ansquare.trymod.Trymod;
import eu.ansquare.trymod.entities.SurikataEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SurikataGeckoModel extends AnimatedGeoModel<SurikataEntity> {
    private static final Identifier modelResource = new Identifier(Trymod.MODID, "geo/surikata.geo.json");
    private static final Identifier textureResource = new Identifier(Trymod.MODID, "textures/entity/surikata/surikata_darkbrown.png");
    private static final Identifier animationResource = new Identifier(Trymod.MODID, "animations/surikata.animation.json");

    @Override
    public Identifier getModelResource(SurikataEntity object) {
        return modelResource;
    }
    @Override
    public Identifier getTextureResource(SurikataEntity object) {
        return textureResource;
    }

    @Override
    public Identifier getAnimationResource(SurikataEntity animatable) {
        return animationResource;
    }
}
