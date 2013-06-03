package co.uk.silvania.Silvania;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import co.uk.silvania.Silvania.blocks.*;
import co.uk.silvania.Silvania.items.*;
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

    }
    //Blocks - ID 2280 - 2470
    public final static Block rpDecorBlocks = new RPDecorBlocks(215).setUnlocalizedName("rpDecorBlocks");
    public final static Block rpInvertedLightBlocks = new RPLightBlocks(758, true).setUnlocalizedName("rpLightBlocks");
    public final static Block rpLightBlocks = new RPLightBlocks(759, false).setUnlocalizedName("rpLightBlocksOff");
    public final static Block stainedWood = new StainedWood(2280).setUnlocalizedName("stainedWood");
    
    
    //Liquids
    
    //Items - IDs 17300+
	public final static Item silvaniaLogoItem = new SilvaniaLogoItem(17300).setUnlocalizedName("silvaniaLogoItem");
	public final static Item poisonedBread = new PoisonedBread(17301).setUnlocalizedName("poisonedBread");
	public final static Item poisonedSteak = new PoisonedSteak(17302).setUnlocalizedName("poisonedSteak");
	public final static Item poisonedChicken = new PoisonedChicken(17303).setUnlocalizedName("poisonedChicken");
	public final static Item poisonedPorkchop = new PoisonedPorkChop(17304).setUnlocalizedName("poisonedPorkchop");
    
    @Init
    public void load(FMLInitializationEvent event) {
            proxy.registerRenderThings();
            //proxy.init();
            
            //Blocks
            GameRegistry.registerBlock(rpDecorBlocks, ItemRPDecorBlocks.class, "Silvania" + (rpDecorBlocks.getUnlocalizedName().substring(5)));
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 0), "Calcite");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 1), "Graphite");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 2), "Calcite Bricks");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 3), "Graphite Cobblestone");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 4), "Graphite Bricks");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 5), "Chiseled Graphite Brick");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 6), "Graphite Paver");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 7), "Calcite Cobblestone");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 8), "Chiseled Calcite Brick");
            LanguageRegistry.addName(new ItemStack(rpDecorBlocks, 1, 9), "Calcite Paver");
            
            GameRegistry.registerBlock(rpLightBlocks, ItemRPLightBlocks.class, "Silvania" + (rpLightBlocks.getUnlocalizedName().substring(5)));
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 0), "White Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 1), "Orange Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 2), "Magenta Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 3), "Light Blue Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 4), "Yellow Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 5), "Lime Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 6), "Pink Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 7), "Grey Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 8), "Light Grey Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 9), "Cyan Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 10), "Purple Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 11), "Blue Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 12), "Brown Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 13), "Green Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 14), "Red Lamp");
            LanguageRegistry.addName(new ItemStack(rpLightBlocks, 1, 15), "Black Lamp");
            
            GameRegistry.registerBlock(rpInvertedLightBlocks, ItemRPInvertedLightBlocks.class, "Silvania" + (rpInvertedLightBlocks.getUnlocalizedName().substring(5)));
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 0), "Inverted White Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 1), "Inverted Orange Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 2), "Inverted Magenta Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 3), "Inverted Light Blue Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 4), "Inverted Yellow Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 5), "Inverted Lime Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 6), "Inverted Pink Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 7), "Inverted Grey Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 8), "Inverted Light Grey Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 9), "Inverted Cyan Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 10), "Inverted Purple Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 11), "Inverted Blue Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 12), "Inverted Brown Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 13), "Inverted Green Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 14), "Inverted Red Lamp");
            LanguageRegistry.addName(new ItemStack(rpInvertedLightBlocks, 1, 15), "Inverted Black Lamp");
            
            GameRegistry.registerBlock(stainedWood, ItemStainedWood.class, "Silvania" + (stainedWood.getUnlocalizedName().substring(5)));
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 0), "White Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 1), "Orange Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 2), "Magenta Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 3), "Light Blue Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 4), "Yellow Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 5), "Lime Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 6), "Pink Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 7), "Grey Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 8), "Light Grey Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 9), "Cyan Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 10), "Purple Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 11), "Blue Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 12), "Brown Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 13), "Green Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 14), "Red Wooden Planks");
            LanguageRegistry.addName(new ItemStack(stainedWood, 1, 15), "Black Wooden Planks");
            
            
            //Items
            GameRegistry.registerItem(silvaniaLogoItem, "silvaniaLogoItem");
            GameRegistry.registerItem(poisonedBread, "poisonedBread");
            GameRegistry.registerItem(poisonedSteak, "poisonedSteak");
            GameRegistry.registerItem(poisonedChicken, "poisonedChicken");
            GameRegistry.registerItem(poisonedPorkchop, "poisonedPorkchop");
            LanguageRegistry.addName(silvaniaLogoItem, "Silvania");

            //Other
            LanguageRegistry.instance().addStringLocalization("itemGroup.tabSilvania", "en_US", "Silvania");
    }


	@PostInit
    public void postInit(FMLPostInitializationEvent event) {
            // Stub Method
    		}
	}
