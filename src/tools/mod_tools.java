package net.minecraft.src;
import java.util.Random;

public class mod_tools extends BaseMod
{

   //Here we declare all of our new tools.
   public static final Item Pick = new ItemPickaxe(2001, EnumToolMaterial.EMERALD).setItemName("asdf");
   public static final Item Spade = new ItemSpade(2002, EnumToolMaterial.EMERALD).setItemName("sdfa");
   public static final Item Axe = new ItemAxe(2003, EnumToolMaterial.EMERALD).setItemName("dfas");

   public mod_tools()
   {

   //Here we override all the textures, and add our own.
        //Make sure the name of your texture is the same what you write here
      Pick.iconIndex = ModLoader.addOverride("/gui/items.png", "/pick.png");
      Spade.iconIndex = ModLoader.addOverride("/gui/items.png", "/spade.png");
      Axe.iconIndex = ModLoader.addOverride("/gui/items.png", "/axe.png");

   //Here we add the in game names to all the tools.
      ModLoader.AddName(Pick, "Pickaxe");
      ModLoader.AddName(Spade, "Shovel");
      ModLoader.AddName(Axe, "Axe");

   //Here are all the recipes for each tool (all of them are made out of dirt)
      ModLoader.AddRecipe(new ItemStack(Pick, 1), new Object[] {
      "***", " * ", " * ", Character.valueOf('*'), Block.dirt
      });
      ModLoader.AddRecipe(new ItemStack(Axe, 1), new Object[] {
      "** ", "** ", " * ", Character.valueOf('*'), Block.dirt
      });
      ModLoader.AddRecipe(new ItemStack(Spade, 1), new Object[] {
      "* *", " * ", " * ", Character.valueOf('*'), Block.dirt
      });
      
   }

   public String Version()
   {
      return "1.0";
   }
}