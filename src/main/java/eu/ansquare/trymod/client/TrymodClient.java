package eu.ansquare.trymod.client;

import eu.ansquare.trymod.Trymod;
import eu.ansquare.trymod.entities.models.SurikataEntityModel;
import eu.ansquare.trymod.entities.renderers.SurikataEntityRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import software.bernie.example.registry.EntityRegistry;

@Environment(EnvType.CLIENT)
public class TrymodClient implements ClientModInitializer {
    public static final EntityModelLayer SURIKATA_MODEL_LAYER = new EntityModelLayer(new Identifier(Trymod.MODID, "surikata"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Trymod.SURIKATA, SurikataEntityRenderer::new);

    }
}
