package co.uk.silvania.Silvania;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import co.uk.silvania.Silvania.blocks.GlassDoor;
import co.uk.silvania.Silvania.blocks.StainedWood;
import co.uk.silvania.Silvania.items.GlassDoorItem;
import co.uk.silvania.Silvania.items.SilvaniaLogoItem;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid="Silvania", name="Silvania", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Silvania { 
	
	public static CreativeTabs tabSilvania = new CreativeTabs("tabSilvania") {
		public ItemStack getIconItemStack() {
				return new ItemStack(Silvania.silvaniaLogoItem, 1, 0);
			}
	};
	
    @Instance("Silvania")
    public static Silvania instance;

    // Says where the client and server proxy code is loaded.
    @SidedProxy(clientSide="co.uk.silvania.Silvania.client.ClientProxy", serverSide="co.uk.silvania.Silvania.CommonProxy")
    public static CommonProxy proxy;
    
    //Prepare for config!
    public static int blockSilvaniaID;
    @SideOnly(Side.CLIENT)

    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
    	//NetworkRegistry.instance().registerGuiHandler(this,  this.proxy);
    	//instance = this;    	
    }
    //Blocks - ID 2280 - 2470
    public final static Block stainedWood = new StainedWood(2280).setBlockName("stainedWood");
    public final static Block glassDoor = new GlassDoor(2281, Material.glass).setBlockName("glassDoor");
    
    //Multiblocks
    private static final String[] stainedWoodNames = {
    	"White Stained Wood", "Orange Stained Wood", "Magenta Stained Wood", "Light Blue Stained Wood",
    	"Yellow Stained Wood", "Light Green Stained Wood", "Pink Stained Wood", "Dark Grey Stained Wood",
    	"Light Grey Stained Wood", "Cyan Stained Wood", "Purple Stained Wood", "Blue Stained Wood",
    	"Brown Stained Wood", "Green Stained Wood", "Red Stained Wood", "Black Stained Wood"
    };
    
    //Liquids
    
    //Items - IDs 17300+
	public final static Item silvaniaLogoItem = new SilvaniaLogoItem(17300).setItemName("silvaniaLogoItem");
	public final static Item glassDoorItem = new GlassDoorItem(17301, Material.glass).setItemName("glassDoorItem");
    
    @Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderThings();
            //proxy.init();
            
            //Blocks
            LanguageRegistry.addName(glassDoor, "Glass Door");
                        
            GameRegistry.registerBlock(stainedWood, MultiItemBlock.class);
            GameRegistry.registerBlock(glassDoor, "glassDoor");
            
            for (int ix = 0; ix < 16; ix++) {
            	ItemStack dye = new ItemStack(Item.dyePowder, 1, ix);
            	ItemStack stainedWoodStack = new ItemStack(stainedWood, 1, ix);
            	
            	GameRegistry.addShapelessRecipe(stainedWoodStack, dye, dye);
            	LanguageRegistry.addName(stainedWoodStack, stainedWoodNames[stainedWoodStack.getItemDamage()]);
            }     
            
            //Items
            LanguageRegistry.addName(silvaniaLogoItem, "Silvania");
            LanguageRegistry.addName(glassDoorItem, "Glass Door");

            GameRegistry.registerItem(silvaniaLogoItem, "silvaniaLogoItem");
            GameRegistry.registerItem(glassDoorItem, "glassDoorItem");

            //Other
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabSilvania", "en_US", "Silvania");
    }


	@PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    		}
	}
