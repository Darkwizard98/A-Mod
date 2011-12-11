package net.minecraft.src;

import java.util.Random;

public class ore2 extends Block
{
	public ore2(int i, int j)
	{
		super(i, j, Material.ground);
	}
	public int idDropped(int i, Random random, int j)
	{
		return mod_amod.Item2.shiftedIndex;
	}
	public int quantityDropped(Random random)
	{
		return 1;
	}
}
