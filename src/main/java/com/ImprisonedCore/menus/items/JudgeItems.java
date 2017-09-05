package com.ImprisonedCore.menus.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class JudgeItems {

	public static ItemStack JudgeBook() {
		
		//Create the ItemStack and get the ItemMeta
		ItemStack JudgeBook = new ItemStack(Material.BOOK_AND_QUILL);
		ItemMeta JudgeBookMeta = JudgeBook.getItemMeta();
		
		//Set Lore/Name/Anything Else here
		JudgeBookMeta.setDisplayName("Judge Book");
		
		//Append the Meta to the Item
		JudgeBook.setItemMeta(JudgeBookMeta);
		
		//Return the Item
		return JudgeBook;
		
	}

}
