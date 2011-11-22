package net.minecraft.src;

import java.util.*;

public class mod_ore1 extends BaseMod
{

	public static Block ore1 = new ore1(255, 0).setHardness(1.0f).setResistance(6000.0F).setLightValue(1.0F).setBlockName("ore1");

	public String Version()
	{
		return "1.0";
	}
	
	public mod_ore1()
	{
		ModLoader.RegisterBlock(ore1);
		ore1.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/lsore.png");
		ModLoader.AddName(ore1, "LightStone Ore");
	}
    public void GenerateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        for(int i = 0; i < 15; i++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(40);
            int randPosZ = chunkZ + rand.nextInt(16);
            (new WorldGenMinable(mod_ore1.ore1.blockID, 10)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }   


}

