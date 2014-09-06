package Talismans2;

import net.minecraft.creativetab.CreativeTabs;
import Talismans2.creativeTab.CreativeTabTalismans;
import Talismans2.init.ModItems;
import Talismans2.lib.Modinfo;
import Talismans2.module.thaumcraft.ThaumcraftRecipes;
import Talismans2.module.thaumcraft.ThaumonomiconResearch;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Gigabit101
 */

@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version)
public class Talismans2 {
	
	//Loads Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);
	
	@Mod.EventHandler
	public void preinit (FMLPreInitializationEvent event){
		//Loads ModItems
		ModItems.init();
	}
	
	@Mod.EventHandler
	public void init (FMLInitializationEvent event){
		//Load Thaumcraft Recipes
		ThaumcraftRecipes.init();
	}
	
	@Mod.EventHandler
	public void postinit (FMLPostInitializationEvent event){
		//Load Thaumonomicon Tab
		ThaumonomiconResearch.addResearchTab();
		//Load Thaumcraft Research
		ThaumonomiconResearch.addResearch();
	}
	
}
