package net.minecraft.src;

import java.util.*;

public class mod_amod extends BaseModMp
{
	
	public static Block ore1 = new ore1(255, 0).setHardness(1.0f).setResistance(6000.0F).setLightValue(1.0F).setBlockName("ore1");
	public static Block ore2 = new ore2(254, 0).setHardness(1.0f).setResistance(6000.0F).setBlockName("ore1");
	public static final Item Pick = new ItemPickaxe(383, EnumToolMaterial.EMERALD).setItemName("asdf");
	public static final Item Spade = new ItemSpade(384, EnumToolMaterial.EMERALD).setItemName("sdfa");
	public static final Item Axe = new ItemAxe(385, EnumToolMaterial.EMERALD).setItemName("dfas");
	public static final Item Sword = new ItemSword(386, EnumToolMaterial.EMERALD).setItemName("adsf");
	public static final Item Item1 = new Item(387).setItemName("Item1");
	public static final Item Item2 = new Item(388).setItemName("Item2");
	public static final Item Item3 = new Item(389).setItemName("Item3");
	public static final Item Item4 = new Item(390).setItemName("Item3");
	public static Item Helmet = (new ItemArmor(391, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 0).setItemName("Helmet"));
	public static Item ChestPlate = (new ItemArmor(392, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 1).setItemName("ChestPlate"));
	public static Item Legs = (new ItemArmor(393, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 2).setItemName("Legs"));			
	public static Item Boots = (new ItemArmor(394, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 3).setItemName("Boots"));
	
	public mod_amod()
	{
		ModLoader.RegisterBlock(ore1);
		ModLoader.RegisterBlock(ore2);
	      ModLoader.AddRecipe(new ItemStack(Pick, 1), new Object[] {
	          "***", " P ", " P ", Character.valueOf('*'), mod_amod.Item4, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Axe, 1), new Object[] {
	          "** ", "*P ", " P ", Character.valueOf('*'), mod_amod.Item4, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Spade, 1), new Object[] {
	          " * ", " P ", " P ", Character.valueOf('*'), mod_amod.Item4, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Sword, 1), new Object[] {
	          " * ", " * ", " P ", Character.valueOf('*'), mod_amod.Item4, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Item3, 1), new Object[] {
	          " Y ", " X ", " P ", Character.valueOf('P'), Item.bucketWater, Character.valueOf('X'), mod_amod.Item1, Character.valueOf('Y'), mod_amod.Item2
	          });
	      ModLoader.AddRecipe(new ItemStack(Item4, 1), new Object[] {
	          "   ", " X ", " P ", Character.valueOf('P'), mod_amod.Item3 , Character.valueOf('X'), Item.ingotGold,
	          });
	      

	}
    
	public void GenerateSurface(World world, Random rand, int chunkX, int chunkZ)
    {
        for(int i = 0; i < 15; i++)
        {
            int randPosX = chunkX + rand.nextInt(16);
            int randPosY = rand.nextInt(40);
            int randPosZ = chunkZ + rand.nextInt(16);
            (new WorldGenMinable(mod_amod.ore1.blockID, 10)).generate(world, rand, randPosX, randPosY, randPosZ);
            (new WorldGenMinable(mod_amod.ore2.blockID, 10)).generate(world, rand, randPosX, randPosY, randPosZ);
        }
    }   
	
	public String Version()
	{
		return "0.6";
	}
}
