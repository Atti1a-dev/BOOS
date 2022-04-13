package net.twnh.boos.Entity.Render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.twnh.boos.Entity.EyeEntity;
import net.twnh.boos.Entity.Model.EyeEntityModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EyeEntityRenderer extends GeoEntityRenderer<EyeEntity> {
    public EyeEntityRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new EyeEntityModel());
    }
}
