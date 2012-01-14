package net.minecraft.src;

import java.util.Random;

public class ore3 extends Block
{
	public ore3(int i, int j)
	{
		super(i, j, Material.ground);
	}
	public int idDropped(int i, Random random, int j)
	{
		return Block.dirt.blockID;
	}
	public int quantityDropped(Random random)
	{
		return 1;
	}
}
