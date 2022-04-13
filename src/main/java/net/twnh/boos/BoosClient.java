package net.twnh.boos;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.twnh.boos.Entity.Model.TestEntityModel;
import net.twnh.boos.Entity.Renderer.TestEntityRenderer;

@Environment(EnvType.CLIENT)
public class BoosClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_TEST_LAYER = new EntityModelLayer(new Identifier("boos", "test_entity"), "main");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(Boos.TEST_ENTITY, TestEntityRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(MODEL_TEST_LAYER, TestEntityModel::getTexturedModelData);
    }
}
