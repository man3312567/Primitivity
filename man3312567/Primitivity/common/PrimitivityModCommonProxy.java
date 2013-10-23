package man3312567.Primitivity.common;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.world.World;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class PrimitivityModCommonProxy implements IGuiHandler{ 
public void registerRenderInformation() 
{
}
@Override
public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { 
return null;
}
@Override
public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) { 
return null;
}

public void registerTiles(){
	
	
	//For registering TileEntities
	
}

public void registerBlocks(){
	//For registering Blocks
	//Copper
	GameRegistry.registerBlock(PrimitivityMod.copperOre, "copperOre");
	LanguageRegistry.addName(PrimitivityMod.copperOre, "\u00a72Copper Ore");
	//Tin
	GameRegistry.registerBlock(PrimitivityMod.tinOre, "tinOre");
	LanguageRegistry.addName(PrimitivityMod.tinOre, "\u00a72Tin Ore");
	//Smelter
	GameRegistry.registerBlock(PrimitivityMod.alloySmelterIdle);
	LanguageRegistry.addName(PrimitivityMod.alloySmelterIdle, "\u00a72Alloy Smelter");
	GameRegistry.registerBlock(PrimitivityMod.alloySmelterActive);
	
	

	
}

public void registerItems(){
	LanguageRegistry.addName(PrimitivityMod.slingshot, "\u00a72Slingshot");
	LanguageRegistry.addName(PrimitivityMod.rock, "\u00a72Rock");
	
	

}
public void registerCreativeTabs(){
	LanguageRegistry.instance().addStringLocalization("itemGroup.Primitivity", "en_US", "\u00a72Primitivity");
	
}
public void registerRecipes(){
	GameRegistry.addShapelessRecipe(new ItemStack (PrimitivityMod.rock), new ItemStack (Block.cobblestone));
	GameRegistry.addRecipe(new ItemStack(PrimitivityMod.slingshot), "x x", " x ", " x ", 'x', new ItemStack(Item.stick));
	GameRegistry.addRecipe(new ItemStack(PrimitivityMod.slingshot), "   ", " x ", "xsx", 'x', new ItemStack(Item.stick), 's', new ItemStack(Item.flintAndSteel)); 
}


}