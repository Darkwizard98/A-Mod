package net.minecraft.src;

public class EntityDarkstoneMonster extends EntityMob
{
	private static final ItemStack defaultHeldItem;


    public EntityDarkstoneMonster(World world)
    {
        super(world);
        texture = "/mob/awe.png";
        moveSpeed = 0.8F;
        attackStrength = 6;
    }

    public int getMaxHealth()
    {
        return 20;
    }

    protected int getTotalArmorValue()
    {
        return 2;
    }

    public void onLivingUpdate()
    {
        if(worldObj.isDaytime() && !worldObj.multiplayerWorld)
        {
            float f = getEntityBrightness(1.0F);
            if(f > 0.5F && worldObj.canBlockSeeTheSky(MathHelper.floor_double(posX), MathHelper.floor_double(posY), MathHelper.floor_double(posZ)) && rand.nextFloat() * 30F < (f - 0.4F) * 2.0F)
            {
                //setFire(8);
            }
        }
        super.onLivingUpdate();
    }
    


    protected String getLivingSound()
    {
        return "mob.ghast.moan";
    }

    protected String getHurtSound()
    {
        return "mob.ghast.scream";
    }

    protected String getDeathSound()
    {
        return "mob.ghast.death";
    }

    protected int getDropItemId()
    {
        return mod_amod.Item2.shiftedIndex;
    }

    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
    
    public ItemStack getHeldItem()
    {
        return defaultHeldItem;
    }

    static 
    {
        defaultHeldItem = new ItemStack(mod_amod.Sword, 1);
    }
}