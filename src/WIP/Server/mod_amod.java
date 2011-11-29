package net.minecraft.src;

import java.util.*;

public class mod_amod extends BaseModMp
{
	
	public static Block ore1 = new ore1(255, 0).setHardness(1.0f).setResistance(6000.0F).setLightValue(1.0F).setBlockName("ore1");
	public static final Item Pick = new ItemPickaxe(2001, EnumToolMaterial.EMERALD).setItemName("asdf");
	public static final Item Spade = new ItemSpade(2002, EnumToolMaterial.EMERALD).setItemName("sdfa");
	public static final Item Axe = new ItemAxe(2003, EnumToolMaterial.EMERALD).setItemName("dfas");
	public static final Item Sword = new ItemSword(2005, EnumToolMaterial.EMERALD).setItemName("adsf");
	public static final Item Item1 = new Item(30000).setItemName("Item1");
	
	public static Item Helmet = (new ItemArmor(2006, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 0).setItemName("Helmet"));
	public static Item ChestPlate = (new ItemArmor(2007, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 1).setItemName("ChestPlate"));
	public static Item Legs = (new ItemArmor(2008, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 2).setItemName("Legs"));			
	public static Item Boots = (new ItemArmor(2009, EnumArmorMaterial.DIAMOND, ModLoader.AddArmor("Armor"), 3).setItemName("Boots"));
	
	public mod_amod()
	{
		ModLoader.RegisterBlock(ore1);
		Item1.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/items/ls.png");
		ore1.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/imgz/blocks/lsore.png");
	    Pick.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/pick.png");
	    Spade.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/spade.png");
	    Axe.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/axe.png");
	    Sword.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/sword.png");
	      ModLoader.AddRecipe(new ItemStack(Pick, 1), new Object[] {
	          "***", " P ", " P ", Character.valueOf('*'), mod_amod.Item1, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Axe, 1), new Object[] {
	          "** ", "*P ", " P ", Character.valueOf('*'), mod_amod.Item1, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Spade, 1), new Object[] {
	          " * ", " P ", " P ", Character.valueOf('*'), mod_amod.Item1, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Sword, 1), new Object[] {
	          " * ", " * ", " P ", Character.valueOf('*'), mod_amod.Item1, Character.valueOf('P'), Item.stick
	          });
	      ModLoader.AddRecipe(new ItemStack(Helmet, 1), new Object[] {
	          " * ", " * ", "   ", Character.valueOf('*'), Block.dirt
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
        }
    }   
	
	public String Version()
	{
		return "0.6 ALPHA";
	}
}
