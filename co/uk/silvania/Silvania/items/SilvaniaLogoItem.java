package co.uk.silvania.Silvania.items;

import co.uk.silvania.Silvania.Silvania;
import co.uk.silvania.Silvania.CommonProxy;
import net.minecraft.item.Item;

public class SilvaniaLogoItem extends Item {

	public SilvaniaLogoItem(int id) {
		super(id);
		this.setMaxStackSize(1);
		this.setIconIndex(0);
		this.setCreativeTab(Silvania.tabSilvania);
	}
	
    public String getTextureFile() {
    	return CommonProxy.ITEMS_PNG;
    }

}
