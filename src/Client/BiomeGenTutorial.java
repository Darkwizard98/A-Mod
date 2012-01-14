package net.minecraft.src;

import java.util.List;

public class BiomeGenTutorial extends BiomeGenBase
{

    public BiomeGenTutorial(int i)
    {
        super(i);
        spawnableCreatureList.clear();
        spawnableMonsterList.clear();
        spawnableMonsterList.add (new SpawnListEntry(net.minecraft.src.EntityLightstoneMonster.class, 8, 4, 8));
        spawnableWaterCreatureList.clear();
        topBlock = (byte)mod_amod.ore1.blockID;
        fillerBlock = (byte)Block.stone.blockID;
    }

}