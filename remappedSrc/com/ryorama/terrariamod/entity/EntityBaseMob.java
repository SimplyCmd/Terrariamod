package com.ryorama.terrariamod.entity;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class EntityBaseMob extends LivingEntity {
	
	public EntityProps props;
	
	 public float[] ai;
	  
	  public float[] localAI;
	  
	  public boolean justHit;
	  
	  protected PlayerEntity target;
	  
	  protected Vec3d targetCenter;
	  
	  public int freezeTimer = 0;
	  
	  protected boolean wet = false;
	  
	  public boolean collideX;
	  
	  public boolean collideY;
	  
	  public boolean collideZ;
	  
	  public float velX;
	  
	  public float velY;
	  
	  public float velZ;
	  
	  public float oldVelX;
	  
	  public float oldVelY;
	  
	  public float oldVelZ;
	  
	  public int directionX = 1, directionZ = 1, directionY = 0;
	  
	  public int attackCD = 0;
	  
	  protected boolean netUpdate;
	  
	  public EntityBaseMob(EntityType<? extends LivingEntity> entityType, World worldIn) {
		    super(entityType, worldIn);
		    EntityProps props = new EntityProps();
		    initProps(props);
		    this.props = props;
		    this.ai = new float[props.maxAI];
		    this.localAI = new float[props.maxAI];
		    setNoGravity(props.noGravity);
		    this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).setBaseValue(props.lifeMax);
		    setHealth(getMaxHealth());
	  }
	  
	  protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
		  return this.props.hitSound;
	  }
		  
	  protected SoundEvent getDeathSound() {
		  return this.props.deathSound;
	  }
		
	  public abstract void AI();
		
	  public abstract void initProps(EntityProps paramEntityProps);
	  
	  public abstract void drops();
	  
	  public void tick() {
		  super.tick();
		  AI();
	  }
	  
	   public void dropLoot(DamageSource source, boolean b) {
		   drops();
	   }
	   
	   @Environment(EnvType.CLIENT)
		public boolean shouldRender(double distance) {
			double d = this.getBoundingBox().getAverageSideLength() * 4.0D;
			if (Double.isNaN(d) || d == 0.0D) {
				d = 4.0D;
			}
			d *= 64.0D;
			return distance < d * d;
		}

		@Environment(EnvType.CLIENT)
		public Box getVisibilityBoundingBox() {
			return this.getBoundingBox();
		}
		
		@Override
		public NbtCompound writeNbt(NbtCompound tag) {
			saveData(tag);
			return tag;
		}
		
		@Override
		public void readNbt(NbtCompound tag) {
			loadData(tag);
		}
		 
		public abstract NbtCompound saveData(NbtCompound tag);
		
		public abstract void loadData(NbtCompound tag);
}
