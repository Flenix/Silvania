package co.uk.silvania.Silvania.blocks;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemRPDecorBlocks extends ItemBlock {

	public ItemRPDecorBlocks(int par1) {
		super(par1);
		this.setHasSubtypes(true);
	}
	
	public String getUnlocalizedName(ItemStack itemstack) {
		
		String name = "";
		switch(itemstack.getItemDamage()) {
			case 0: {
				name = "calcite";
				break;
			}
			case 1: {
				name = "graphite";
				break;
			}
			case 2: {
				name = "calcitebricks";
				break;
			}
			case 3: {
				name = "graphitecobble";
				break;
			}
			case 4: {
				name = "graphitebrick";
				break;
			}
			case 5: {
				name = "chiseledgraphitebrick";
				break;
			}
			case 6: {
				name = "graphitepaver";
				break;
			}
			case 7: {
				name = "calcitecobble";
				break;
			}
			case 8: {
				name = "chiseledcalcitebrick";
				break;
			}
			case 9: {
				name = "calcitepaver";
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
