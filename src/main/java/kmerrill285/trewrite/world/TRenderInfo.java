package kmerrill285.trewrite.world;

import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.util.math.Vec3d;

public class TRenderInfo extends ActiveRenderInfo {
   public void setPosition(Vec3d position) {
      super.setPostion(position);
   }

   public void setDirection(float pitch, float yaw) {
      super.setDirection(pitch, yaw);
   }
}