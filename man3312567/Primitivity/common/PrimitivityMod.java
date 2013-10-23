package man3312567.Primitivity.common; 

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.network.NetworkMod.SidedPacketHandler;
import cpw.mods.fml.common.SidedProxy;
import man3312567.Primitivity.common.PrimitivityModCommonProxy;

@NetworkMod(clientSideRequired=true,serverSideRequired=true,
clientPacketHandlerSpec = @SidedPacketHandler(channels = {"PrimitivityMod"}, packetHandler = PrimitivityModClientPacketHandler.class), //For clientside packet handling
serverPacketHandlerSpec = @SidedPacketHandler(channels = {"PrimitivityMod"}, packetHandler = PrimitivityModServerPacketHandler.class)) //For serverside packet handling


@Mod(modid="PrimitivityMod",name="Primitivity Mod",version="Release")

public class PrimitivityMod {

@Instance("PrimitivityMod") 
public static PrimitivityMod instance = new PrimitivityMod();

@SidedProxy(clientSide = "man3312567.Primitivity.common.PrimitivityModClientProxy", serverSide = "man3312567.TutorialMod.common.PrimitivityModCommonProxy") //Tells Forge the location of your proxies
public static PrimitivityModCommonProxy proxy;
public static PrimitivityModClientProxy clientproxy;



public static Block copperOre;
public static Block tinOre;
public static Item slingshot;
public static Item rock;
public static Block fireplace;



public static CreativeTabs tabPrimitivity = new CreativeTabs("Primitivity");
public ItemStack getIconItemStack(){
	return new ItemStack(slingshot);
}

EventManager eventmanager = new EventManager();


@PreInit
public void PreInit(FMLPreInitializationEvent e){
	slingshot = new ItemSlingshot(6001).setCreativeTab(tabPrimitivity).setUnlocalizedName("slingshot");
	copperOre = new BlockCopperOre(2550).setUnlocalizedName("copperOre").setCreativeTab(tabPrimitivity);
	tinOre = new BlockTinOre(2551).setUnlocalizedName("tinOre").setCreativeTab(tabPrimitivity);
	rock = new ItemRock(6002).setUnlocalizedName("rock").setCreativeTab(tabPrimitivity);
}
	

@Init
public void InitPrimitivityMod(FMLInitializationEvent event){ //Your main initialization method
proxy.registerBlocks();
proxy.registerCreativeTabs();
proxy.registerItems();
proxy.registerRecipes();

GameRegistry.registerWorldGenerator(eventmanager);
int modEntityId = 0;
EntityRegistry.registerModEntity(EntityRock.class, "Rock", ++modEntityId, this, 64, 10, true);


NetworkRegistry.instance().registerGuiHandler(this, proxy); 

}


}