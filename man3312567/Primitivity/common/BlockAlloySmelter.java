package man3312567.Primitivity.common;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;

public class BlockAlloySmelter extends BlockContainer{
	
	private final boolean isActive;

	public BlockAlloySmelter(int id, boolean isActive) {
		super(id, Material.rock);
	
	this.isActive = isActive;
		
	}
	

}
