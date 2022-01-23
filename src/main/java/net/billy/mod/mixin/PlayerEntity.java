package net.billy.mod.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntity extends LivingEntity{

    private int killCount;


    protected PlayerEntity(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
        //TODO Auto-generated constructor stub
    }
    private void addKills(int amount){
        killCount += amount;
    }
}
