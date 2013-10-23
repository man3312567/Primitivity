package man3312567.Primitivity.common;
import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
public class BlockCopperOre extends Block{
	public BlockCopperOre(int par1)
    {
            super(par1, Material.iron);
    }

	public void registerIcons(IconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon("primitivity:copperOre");
	}

}
