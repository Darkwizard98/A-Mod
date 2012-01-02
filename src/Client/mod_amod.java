package net.minecraft.src;

import java.util.*;

public class mod_amod extends BaseModMp
{
	
	public static Block ore1 = new ore1(255, 0).setHardness(1.0f).setResistance(6000.0F).setLightValue(1.0F).setBlockName("ore1");
	public static Block ore2 = new ore2(254, 0).setHardness(1.0f).setResistance(6000.0F).setLightValue(0.0F).setBlockName("ore1");
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
		Item1.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/items/ls.png");
		Item2.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/items/ds.png");
		Item3.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/items/wtf.png");
		Item4.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/items/eingot.png");
		ore1.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/imgz/blocks/lsore.png");
		ore2.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/imgz/blocks/dsore.png");
	    Pick.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/pick.png");
	    Spade.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/spade.png");
	    Axe.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/axe.png");
	    Sword.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/tools/sword.png");
		Helmet.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/Helmet.png");
		ChestPlate.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/ChestPlate.png");
		Legs.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/Legs.png");
		Boots.iconIndex = ModLoader.addOverride("/gui/items.png", "/armor/Boots.png");
	    ModLoader.AddName(Item1, "LightStone Ball");
	    ModLoader.AddName(Item2, "DarkStone Ball");
	    ModLoader.AddName(Item3, "Mixture");
	    ModLoader.AddName(Item4, "Mixture Ingot");
	    ModLoader.AddName(ore1, "LightStone Ore");
	    ModLoader.AddName(ore2, "DarkStone Ore");
	    ModLoader.AddName(Pick, "Pickaxe");
	    ModLoader.AddName(Spade, "Shovel");
	    ModLoader.AddName(Axe, "Axe");
	    ModLoader.AddName(Sword, "Sword");
		ModLoader.AddName(Helmet, "Helmet");
		ModLoader.AddName(ChestPlate, "ChestPlate");
		ModLoader.AddName(Legs, "Legs");
		ModLoader.AddName(Boots, "Boots");
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
	      
	      ModLoader.RegisterEntityID(EntityDarkstoneMonster.class, "Darkstone Monster", 100);
	      


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
	
	public void GenerateNether(World world, Random rand, int chunkX, int chunkZ)
	{
	       for(int i = 0; i < 15; i++)
	        {
	            int randPosX = chunkX + rand.nextInt(16);
	            int randPosY = rand.nextInt(128);
	            int randPosZ = chunkZ + rand.nextInt(16);
	            (new WorldGenMinable(mod_amod.ore2.blockID, 20)).generate(world, rand, randPosX, randPosY, randPosZ);
	        }
	}
	public void AddRenderer (Map map)
	{
		map.put(EntityDarkstoneMonster.class, new RenderBiped(new ModelBiped(), 0.5F));
	}
	
	public String Version()
	{
		return "0.6.5 R1";
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "0.6 R1";
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		
	}
}
