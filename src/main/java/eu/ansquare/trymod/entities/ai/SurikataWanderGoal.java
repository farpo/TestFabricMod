package eu.ansquare.trymod.entities.ai;

import eu.ansquare.trymod.entities.SurikataEntity;
import net.minecraft.entity.ai.NoPenaltyTargeting;
import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.util.math.Vec3d;

public class SurikataWanderGoal extends Goal {

    public SurikataEntity entity;

    public SurikataWanderGoal(SurikataEntity entity){
        this.entity = entity;
    }
    @Override
    public boolean canStart() {
        return entity.isOnGround();
    }
    public void start(){
        Vec3d targetPos = NoPenaltyTargeting.find(entity, 5, 1);
        Vec3d dirVec = targetPos.subtract(entity.getPos()).normalize();
        Vec3d velVec = new Vec3d(dirVec.getX() * 0.6f, 0, dirVec.getZ() * 0.6f);
        this.entity.setVelocity(velVec);
        entity.setBodyYaw((float) -(Math.atan2(dirVec.getX(), dirVec.getZ()) * 180f / Math.PI));
        entity.setYaw((float) -(Math.atan2(dirVec.getX(), dirVec.getZ()) * 180f / Math.PI));
    }
}
