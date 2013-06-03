package co.uk.silvania.Silvania.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemRPLightBlocks extends ItemBlock {

	public ItemRPLightBlocks(int par1) {
		super(par1);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		
		String name = "";
		switch(itemstack.getItemDamage()) {
			case 0: {
				name = "white";
				break;
			}
			case 1: {
				name = "orange";
				break;
			}
			case 2: {
				name = "magenta";
				break;
			}
			case 3: {
				name = "lightblue";
				break;
			}
			case 4: {
				name = "yellow";
				break;
			}
			case 5: {
				name = "lime";
				break;
			}
			case 6: {
				name = "pink";
				break;
			}
			case 7: {
				name = "grey";
				break;
			}
			case 8: {
				name = "lightgrey";
				break;
			}
			case 9: {
				name = "cyan";
				break;
			}
			case 10: {
				name = "purple";
				break;
			}
			case 11: {
				name = "blue";
				break;
			}
			case 12: {
				name = "brown";
				break;
			}
			case 13: {
				name = "green";
				break;
			}
			case 14: {
				name = "red";
				break;
			}
			case 15: {
				name = "black";
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
