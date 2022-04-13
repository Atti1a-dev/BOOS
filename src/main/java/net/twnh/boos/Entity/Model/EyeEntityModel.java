package net.twnh.boos.Entity.Model;

import net.minecraft.util.Identifier;
import net.twnh.boos.Boos;
import net.twnh.boos.Entity.EyeEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EyeEntityModel extends AnimatedGeoModel<EyeEntity> {
    @Override
    public Identifier getModelLocation(EyeEntity object) {
        return new Identifier(Boos.MOD_ID, "geo/eye_boss.geo.json");
    }

    @Override
    public Identifier getTextureLocation(EyeEntity object) {
        return new Identifier(Boos.MOD_ID, "textures/entity/eyeboss/eye_boss.png");
    }

    @Override
    public Identifier getAnimationFileLocation(EyeEntity object) {
        return new Identifier(Boos.MOD_ID, "animations/eye_boss.animation.json");
    }
}
