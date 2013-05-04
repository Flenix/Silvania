package co.uk.silvania.Silvania.client;

import co.uk.silvania.Silvania.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
    
    	@Override
    	public void registerRenderThings() {
    		MinecraftForgeClient.preloadTexture("/co/uk/silvania/Silvania/blocks.png");
    		MinecraftForgeClient.preloadTexture("/co/uk/silvania/Silvania/items.png");
		
    	}
    
}