package net.minecraft.src;

import java.util.List;

public class BiomeGenDarkstone extends BiomeGenBase
{

    public BiomeGenDarkstone(int i)
    {
        super(i);
        spawnableCreatureList.clear();
        spawnableMonsterList.clear();
        spawnableWaterCreatureList.clear();
        topBlock = (byte)mod_amod.ore2.blockID;
        fillerBlock = (byte)Block.stone.blockID;
    }

}