package com.ImprisonedCore.menus;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import com.ImprisonedCore.menus.items.RankupItems;
import com.ImprisonedCore.menus.items.MenuItems;
import com.ImprisonedCore.util.MsgUtil;

public class Rankup {
	
	public static String RankupTitle = (MsgUtil.translate("&8&lImprisoned&f :: &7Rankup&r"));
	
	public static Inventory RankupD() {
		
		Inventory rankup = Bukkit.createInventory(null, 54, RankupTitle +" D");
		rankup.setItem(13, RankupItems.RankD());
		rankup.setItem(32, MenuItems.ArrowForward());
		return rankup;
		
	}
	
	public static Inventory RankupC() {
		
		Inventory rankup = Bukkit.createInventory(null, 54, RankupTitle +" C");
		rankup.setItem(13, RankupItems.RankC());
		rankup.setItem(30, MenuItems.ArrowBack());
		rankup.setItem(32, MenuItems.ArrowForward());
		return rankup;
		
	}
	
	public static Inventory RankupB() {
		
		Inventory rankup = Bukkit.createInventory(null, 54, RankupTitle +" B");
		rankup.setItem(13, RankupItems.RankB());
		rankup.setItem(30, MenuItems.ArrowBack());
		rankup.setItem(32, MenuItems.ArrowForward());
		return rankup;
		
	}
	
	public static Inventory RankupA() {
		
		Inventory rankup = Bukkit.createInventory(null, 54, RankupTitle +" A");
		rankup.setItem(13, RankupItems.RankA());
		rankup.setItem(30, MenuItems.ArrowBack());
		return rankup;
		
	}

}
