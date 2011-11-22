package net.minecraft.src;

public class mod_TestItem extends BaseMod
{
	public static final Item TestItem = new Item(30000).setItemName("TestItem");
	
public mod_TestItem()
{
	TestItem.iconIndex = ModLoader.addOverride("gui/items.png", "/testi.png");
	ModLoader.AddName(TestItem, "Test Item");
	ModLoader.AddRecipe(new ItemStack(TestItem, 1), new Object[] {
		"XPX", "PSP", "XPX", Character.valueOf('P'), Item.porkCooked, Character.valueOf('X'), Item.redstone,
		Character.valueOf('S'), Item.swordStone
	});
}
	
public String Version()
{
	return "1.0";
}
	
}
