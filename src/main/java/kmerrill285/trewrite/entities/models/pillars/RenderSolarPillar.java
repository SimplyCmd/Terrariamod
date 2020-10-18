package kmerrill285.trewrite.entities.models.pillars;

import kmerrill285.trewrite.entities.models.ModelPillar;
import kmerrill285.trewrite.entities.pillars.SolarPillar;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderSolarPillar extends MobRenderer<SolarPillar, ModelPillar<SolarPillar>> {
	
	 private ResourceLocation texture = new ResourceLocation("trewrite:textures/entity/solar_pillar.png");
	
	 public RenderSolarPillar(EntityRendererManager renderManagerIn)
	    {
	    	
	        super(renderManagerIn, new ModelPillar<SolarPillar>(), 4.0f);
	    }

	    /**
	     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	     * (Render<T extends Entity>) and this method has signature public void doRender(T entity, double d, double d1,
	     * double d2, float f, float f1). But JAD is pre 1.5 so doe
	     */
	    public void doRender(SolarPillar entity, double x, double y, double z, float entityYaw, float partialTicks)
	    {
//	    	BossStatus.setBossStatus(entity, true);
	        this.shadowSize = 0.25F;

	        super.doRender(entity, x, y, z, 0, partialTicks);
	    }

	    /**
	     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	     * entityLiving, partialTickTime
	     */
	    protected void preRenderCallback(SolarPillar entitylivingbaseIn, float partialTickTime)
	    {

	    }

	    /**
	     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
	     */
	    protected ResourceLocation getEntityTexture(SolarPillar entity)
	    {
	    	return texture;
	    }
	}