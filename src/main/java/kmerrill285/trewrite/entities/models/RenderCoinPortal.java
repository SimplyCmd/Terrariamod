package kmerrill285.trewrite.entities.models;

import kmerrill285.trewrite.entities.EntityCoin;
import kmerrill285.trewrite.entities.EntityCoinPortal;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderCoinPortal extends MobRenderer<EntityCoinPortal, CoinPortalModel>
{
    private ResourceLocation texture = new ResourceLocation("trewrite:textures/entity/coin_portal.png");

    public RenderCoinPortal(EntityRendererManager renderManagerIn)
    {
    	
        super(renderManagerIn, new CoinPortalModel(), 4.0f);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     */
    public void doRender(EntityCoinPortal entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
//    	BossStatus.setBossStatus(entity, true);
        this.shadowSize = 0.25F;
        
        super.doRender(entity, x, y + Math.abs(Math.cos(Math.toRadians(System.nanoTime() / 10000000.0))) / 2.0, z, 0, partialTicks);
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityCoinPortal entitylivingbaseIn, float partialTickTime)
    {
    	
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityCoinPortal entity)
    {
    	return texture;
    }
}
