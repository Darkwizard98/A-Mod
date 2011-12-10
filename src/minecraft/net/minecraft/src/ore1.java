package net.minecraft.src;

import java.util.Random;

public class ore1 extends Block
{
	
	public ore1(int i, int j)
	{
		super(i, j, Material.ground);
	}
	public int idDropped(int i, Random random, int j)
	{
		return mod_amod.Item1.shiftedIndex;
	}
	public int quantityDropped(Random random)
	{
		return 1;
	}
	
	
	
	

}
