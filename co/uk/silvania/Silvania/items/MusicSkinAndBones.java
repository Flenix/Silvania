package co.uk.silvania.Silvania.items;

import co.uk.silvania.Silvania.Silvania;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemRecord;

public class MusicSkinAndBones extends ItemRecord {
	
    public final String recordName;
    public final String recordArtist;

	public MusicSkinAndBones(int id, String artist, String name) {
		super(id, name);
		this.recordArtist = artist;
        this.recordName = name;
        this.maxStackSize = 1;
        this.setCreativeTab(Silvania.tabSilvania);
	}
	
	@Override
    public String getRecordTitle()
    {
        return this.recordArtist + " - " + this.recordName;
    }
	
	public String getSoundFile() {
		return "/mods/Silvania/resources/audio/skinandbones.ogg";
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("Silvania:SkinAndBones");
    }

}
