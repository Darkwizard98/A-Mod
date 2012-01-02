package net.minecraft.src;

import java.util.List;

public class BiomeGenDarkstone extends BiomeGenBase
{

    public BiomeGenDarkstone(int i)
    {
        super(i);
        spawnableCreatureList.clear();
        spawnableMonsterList.add (new SpawnListEntry(net.minecraft.src.EntityDarkstoneMonster.class, 8, 4, 8));
        spawnableWaterCreatureList.clear();
        topBlock = (byte)mod_amod.ore2.blockID;
        fillerBlock = (byte)Block.stone.blockID;
    }

}