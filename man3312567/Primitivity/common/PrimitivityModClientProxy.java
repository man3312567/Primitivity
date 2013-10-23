package man3312567.Primitivity.common;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import man3312567.Primitivity.common.PrimitivityModCommonProxy;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.MinecraftForgeClient;

public class PrimitivityModClientProxy extends PrimitivityModCommonProxy {

public void registerRenderInformation(){
}
public void registerRenderers() {
RenderingRegistry.registerEntityRenderingHandler(EntityRock.class, new RenderSnowball(PrimitivityMod.rock));
}
public void registerRenderThings() {
    
}

}