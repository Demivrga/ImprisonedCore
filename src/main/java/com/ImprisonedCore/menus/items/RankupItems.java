package com.ImprisonedCore.menus.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.ImprisonedCore.util.MsgUtil;

public class RankupItems {
	
	public static ItemStack RankD() {
		
		//Create the ItemStack and get the ItemMeta
		ItemStack D = new ItemStack(Material.WOOL, 1, (byte)4);
		ItemMeta DMeta = D.getItemMeta();
		
		//Set Lore/Name/Anything Else here
		DMeta.setDisplayName("Rankup: D-Prisoner");
		
		//Append the Meta to the Item
		D.setItemMeta(DMeta);
		
		//Return the Item
		return D;
		
	}
	
	public static ItemStack RankC() {
		
		//Create the ItemStack and get the ItemMeta
		ItemStack D = new ItemStack(Material.WOOL, 1, (byte)13);
		ItemMeta DMeta = D.getItemMeta();
		
		//Set Lore/Name/Anything Else here
		DMeta.setDisplayName("Rankup: C-Prisoner");
		
		//Append the Meta to the Item
		D.setItemMeta(DMeta);
		
		//Return the Item
		return D;
		
	}
	
	public static ItemStack RankB() {
		
		//Create the ItemStack and get the ItemMeta
		ItemStack D = new ItemStack(Material.WOOL, 1, (byte)1);
		ItemMeta DMeta = D.getItemMeta();
		
		//Set Lore/Name/Anything Else here
		DMeta.setDisplayName("Rankup: B-Prisoner");
		
		//Append the Meta to the Item
		D.setItemMeta(DMeta);
		
		//Return the Item
		return D;
		
	}
	
	public static ItemStack RankA() {
		
		//Create the ItemStack and get the ItemMeta
		ItemStack D = new ItemStack(Material.WOOL, 1, (byte)3);
		ItemMeta DMeta = D.getItemMeta();
		
		//Set Lore/Name/Anything Else here
		DMeta.setDisplayName(MsgUtil.translate("&8&nRankup&f: &b&lA-Prisoner"));
		
		//Lore
		List<String> lore = new ArrayList<String>();
		lore.add(MsgUtil.translate("&5&nPrice&f:"));
		lore.add(MsgUtil.translate("&4- $45,000"));
		DMeta.setLore(lore);
		
		//Append the Meta to the Item
		D.setItemMeta(DMeta);
		
		//Return the Item
		return D;
		
	}
	

}
