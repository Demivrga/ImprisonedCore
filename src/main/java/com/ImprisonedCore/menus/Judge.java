package com.ImprisonedCore.menus;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import com.ImprisonedCore.menus.items.JudgeItems;

public class Judge {
	
	public static Inventory JudgeMenu() {
		
		Inventory Judge = Bukkit.createInventory(null, 27, "Imprisoned :: Judge");
		
		Judge.setItem(13, JudgeItems.JudgeBook());
		
		return Judge;
		
	}

}
