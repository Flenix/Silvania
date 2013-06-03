package co.uk.silvania.Silvania.items;

import co.uk.silvania.Silvania.Silvania;
import co.uk.silvania.Silvania.CommonProxy;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class SilvaniaLogoItem extends Item {

	public SilvaniaLogoItem(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setCreativeTab(Silvania.tabSilvania);
	}
	
	public void registerIcons(IconRegister iconRegister)
	{
	         itemIcon = iconRegister.registerIcon("Silvania:SilvaniaLogo");
	}

}
