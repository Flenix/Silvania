package co.uk.silvania.Silvania.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemStainedWood extends ItemBlock {

	public ItemStainedWood(int par1) {
		super(par1);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		
		String name = "";
		switch(itemstack.getItemDamage()) {
			case 0: {
				name = "wwhite";
				break;
			}
			case 1: {
				name = "worange";
				break;
			}
			case 2: {
				name = "wmagenta";
				break;
			}
			case 3: {
				name = "wlightblue";
				break;
			}
			case 4: {
				name = "wyellow";
				break;
			}
			case 5: {
				name = "wlime";
				break;
			}
			case 6: {
				name = "wpink";
				break;
			}
			case 7: {
				name = "wgrey";
				break;
			}
			case 8: {
				name = "wlightgrey";
				break;
			}
			case 9: {
				name = "wcyan";
				break;
			}
			case 10: {
				name = "wpurple";
				break;
			}
			case 11: {
				name = "wblue";
				break;
			}
			case 12: {
				name = "wbrown";
				break;
			}
			case 13: {
				name = "wgreen";
				break;
			}
			case 14: {
				name = "wred";
				break;
			}
			case 15: {
				name = "wblack";
				break;
			}
			default: name = "broken";
		}
		return getUnlocalizedName() + "." + name;
	}
	
	public int getMetadata(int par1) {
		return par1;
	}

}
