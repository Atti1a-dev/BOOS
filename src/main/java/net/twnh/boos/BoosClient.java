package net.twnh.boos;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.twnh.boos.Entity.Model.TestEntityModel;
import net.twnh.boos.Entity.Render.EyeEntityRenderer;
import net.twnh.boos.Entity.Render.TestEntityRenderer;
import software.bernie.example.registry.EntityRegistry;

@Environment(EnvType.CLIENT)
public class BoosClient implements ClientModInitializer {
    public static final EntityModelLayer MODEL_TEST_LAYER = new EntityModelLayer(new Identifier(Boos.MOD_ID, "test_entity"), "main");

    @Override
    public void onInitializeClient() {
        // Test Entity
        EntityRendererRegistry.register(Boos.TEST_ENTITY, TestEntityRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(MODEL_TEST_LAYER, TestEntityModel::getTexturedModelData);

        // Eye Boss
        EntityRendererRegistry.register(Boos.EYE_ENTITY, EyeEntityRenderer::new);
    }
}
