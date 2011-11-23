package net.minecraft.src;

public class mod_Item1 extends BaseModMp
{
	public static final Item Item1 = new Item(30000).setItemName("Item1");
	
public mod_Item1()
{
	Item1.iconIndex = ModLoader.addOverride("/gui/items.png", "/imgz/items/ls.png");
	ModLoader.AddName(Item1, "Item1");
	ModLoader.AddRecipe(new ItemStack(Item1, 1), new Object[] {
		"XPX", "PSP", "XPX", Character.valueOf('P'), Item.porkCooked, Character.valueOf('X'), Item.redstone,
		Character.valueOf('S'), Item.swordStone
	});
}
	
public String Version()
{
	return "1.0";
}
	
}
