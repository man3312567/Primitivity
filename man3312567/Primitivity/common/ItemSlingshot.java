package man3312567.Primitivity.common;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemSlingshot extends Item{

	public ItemSlingshot(int id) {
		super(id);
		
	}
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("primitivity:slingshot");
	}
	   public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	   {
		   if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItem(PrimitivityMod.rock.itemID)){
	       par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
	       if (!par2World.isRemote)
	       {
	           par2World.spawnEntityInWorld(new EntityRock(par2World, par3EntityPlayer));
	           
	       }
	     
	       par3EntityPlayer.inventory.consumeInventoryItem(PrimitivityMod.rock.itemID);
	   }
		return par1ItemStack;
	

}
}