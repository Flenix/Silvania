package co.uk.silvania.Silvania.blocks;

import java.util.List;

import co.uk.silvania.Silvania.CommonProxy;
import co.uk.silvania.Silvania.Silvania;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class StainedWood extends Block {
	public StainedWood (int id) {
		super(id, Material.cloth);
		this.setBlockName("stainedWood");
		this.setCreativeTab(Silvania.tabSilvania);
	}
	
	@Override
	public int getBlockTextureFromSideAndMetadata (int side, int metadata) {
		return blockIndexInTexture + metadata;
	}
	
	@Override
	public String getTextureFile () {
		return CommonProxy.BLOCK_PNG;
	}
	
	@Override
	public int damageDropped(int metadata) {
		return metadata;
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int unknown, CreativeTabs tab, List subItems) {
		for (int ix = 0; ix < 16; ix++) {
			subItems.add(new ItemStack(this, 1, ix));
		}
	}	
}
