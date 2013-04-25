package co.uk.silvania.Silvania;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class MultiItemBlock extends ItemBlock {
	
    private static final String[] subNames = {
    	"White Stained Wood", "Orange Stained Wood", "Magenta Stained Wood", "Light Blue Stained Wood",
    	"Yellow Stained Wood", "Light Green Stained Wood", "Pink Stained Wood", "Dark Grey Stained Wood",
    	"Light Grey Stained Wood", "Cyan Stained Wood", "Purple Stained Wood", "Blue Stained Wood",
    	"Brown Stained Wood", "Green Stained Wood", "Red Stained Wood", "Black Stained Wood"
    };
    
    public MultiItemBlock(int id) {
    	super(id);
    	this.setHasSubtypes(true);
    	this.setItemName("stainedWood");
    }
    
    @Override
    public int getMetadata (int damageValue) {
    	return damageValue;
    }
    
    @Override
    public String getItemNameIS(ItemStack itemstack) {
    	return getItemName() + "." + subNames[itemstack.getItemDamage()];
    }
}
