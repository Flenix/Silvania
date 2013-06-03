package co.uk.silvania.Silvania.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemRPInvertedLightBlocks extends ItemBlock {

	public ItemRPInvertedLightBlocks(int par1) {
		super(par1);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		
		String name = "";
		switch(itemstack.getItemDamage()) {
			case 0: {
				name = "iwhite";
				break;
			}
			case 1: {
				name = "iorange";
				break;
			}
			case 2: {
				name = "imagenta";
				break;
			}
			case 3: {
				name = "ilightblue";
				break;
			}
			case 4: {
				name = "iyellow";
				break;
			}
			case 5: {
				name = "ilime";
				break;
			}
			case 6: {
				name = "ipink";
				break;
			}
			case 7: {
				name = "igrey";
				break;
			}
			case 8: {
				name = "ilightgrey";
				break;
			}
			case 9: {
				name = "icyan";
				break;
			}
			case 10: {
				name = "ipurple";
				break;
			}
			case 11: {
				name = "iblue";
				break;
			}
			case 12: {
				name = "ibrown";
				break;
			}
			case 13: {
				name = "igreen";
				break;
			}
			case 14: {
				name = "ired";
				break;
			}
			case 15: {
				name = "iblack";
				break;
			}
			default: name = "broken";
		}
		return "rpLightBlocks" + "." + name;
	}
	
	public int getMetadata(int par1) {
		return par1;
	}

}
