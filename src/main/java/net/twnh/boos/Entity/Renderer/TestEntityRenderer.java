package net.twnh.boos.Entity.Renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.twnh.boos.BoosClient;
import net.twnh.boos.Entity.Model.TestEntityModel;
import net.twnh.boos.Entity.TestEntity;

public class TestEntityRenderer extends MobEntityRenderer<TestEntity, TestEntityModel> {
    public TestEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new TestEntityModel(context.getPart(BoosClient.MODEL_TEST_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(TestEntity entity) {
        return new Identifier("boos", "textures/entity/test/test.png");
    }
}
