package com.ImprisonedCore.menus.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.ImprisonedCore.database.DatabaseManager;
import com.ImprisonedCore.util.MsgUtil;

public class MenuItems {

	public static ItemStack ArrowBack() {

		// Create the ItemStack and get the ItemMeta
		ItemStack ArrowBack = new ItemStack(Material.ARROW);
		ItemMeta ArrowBackMeta = ArrowBack.getItemMeta();

		// Set Lore/Name/Anything Else here
		ArrowBackMeta.setDisplayName("Previous Page");

		// Append the Meta to the Item
		ArrowBack.setItemMeta(ArrowBackMeta);

		// Return the Item
		return ArrowBack;

	}

	public static ItemStack ArrowForward() {

		// Create the ItemStack and get the ItemMeta
		ItemStack ArrowForward = new ItemStack(Material.SPECTRAL_ARROW);
		ItemMeta ArrowForwardMeta = ArrowForward.getItemMeta();

		// Set Lore/Name/Anything Else here
		ArrowForwardMeta.setDisplayName("Next Page");

		// Append the Meta to the Item
		ArrowForward.setItemMeta(ArrowForwardMeta);

		// Return the Item
		return ArrowForward;

	}
	
	public static ItemStack Error(String itemName, String reason) {

		// Create the ItemStack and get the ItemMeta
		ItemStack Error = new ItemStack(Material.BARRIER);
		ItemMeta ErrorMeta = Error.getItemMeta();

		// Set Lore/Name/Anything Else here
		ErrorMeta.setDisplayName(MsgUtil.translate(itemName));

		//Lore
		List<String> lore = new ArrayList<String>();
		lore.add(MsgUtil.translate("&7Your transaction failed because&f:"));
		lore.add(MsgUtil.translate(reason));
		
		ErrorMeta.setLore(lore);
		
		// Append the Meta to the Item
		Error.setItemMeta(ErrorMeta);

		// Return the Item
		return Error;

	}

	public static ItemStack PlayersHead(Player p) {

		// Create the ItemStack and get the ItemMeta
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		SkullMeta skullmeta = (SkullMeta) skull.getItemMeta();

		// Set Lore/Name/Anything Else here
		skullmeta.setOwner(p.getDisplayName().toString());
		skullmeta.setDisplayName(MsgUtil.translate("&8&l"+p.getDisplayName()));
		
		//Lore
		List<String> lore = new ArrayList<String>();
		lore.add(MsgUtil.translate("&7&nRank&f: &r&f"+ DatabaseManager.PlayerRank(p.getUniqueId())));
		lore.add(MsgUtil.translate("&e&nMoney&f: &r&f"+ DatabaseManager.PlayerMoney(p.getUniqueId())));
		
		skullmeta.setLore(lore);
		
		// Append the Meta to the Item
		skull.setItemMeta(skullmeta);
		
		// Return the Item
		return skull;

	}
	
	public static ItemStack PlayersOnlineHead(Player p) {

		// Create the ItemStack and get the ItemMeta
		ItemStack skull = new ItemStack(Material.SKULL_ITEM, 1, (byte) 3);
		SkullMeta skullmeta = (SkullMeta) skull.getItemMeta();

		// Set Lore/Name/Anything Else here
		skullmeta.setOwner(p.getDisplayName().toString());
		skullmeta.setDisplayName(MsgUtil.translate("&8&l"+p.getDisplayName()));
		
		//Lore
		List<String> lore = new ArrayList<String>();
		lore.add(MsgUtil.translate("&7&nRank&f: &r&f"+ DatabaseManager.PlayerRank(p.getUniqueId())));
		lore.add(MsgUtil.translate("&e&nMoney&f: &r&f"+ DatabaseManager.PlayerMoney(p.getUniqueId())));
		lore.add(" ");
		lore.add(MsgUtil.translate("&7Click to Message!"));
		
		skullmeta.setLore(lore);
		
		// Append the Meta to the Item
		skull.setItemMeta(skullmeta);
		
		// Return the Item
		return skull;

	}
	
	public static ItemStack Air() {

		// Create the ItemStack and get the ItemMeta
		ItemStack skull = new ItemStack(Material.AIR);
		
		// Return the Item
		return skull;

	}

}
