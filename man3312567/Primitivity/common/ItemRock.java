package man3312567.Primitivity.common;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemRock extends Item{

	public ItemRock(int id) {
		super(id);
		this.maxStackSize = 16;
		
	}
	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("primitivity:rock");
	}

}
