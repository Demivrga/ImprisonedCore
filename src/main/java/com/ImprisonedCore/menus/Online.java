package com.ImprisonedCore.menus;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.ImprisonedCore.menus.items.MenuItems;
import com.ImprisonedCore.util.MsgUtil;

public class Online {

	public static String OnlineTitle = (MsgUtil.translate("&8&lImprisoned&f :: &7Online&r #"));

	public static Inventory onlinePlayers(Player p, int page) {
		Inventory list = Bukkit.createInventory(null, 54, OnlineTitle + page);

		// Because we only want to list 45 players on any given page.
		// We're going to use an equation to get the start of what
		// skull number needs to be on that page.

		// 45 *(1 - 1) + 1 = 1
		// 45 *(2 - 1) + 1 = 46
		// 45 *(3 - 1) + 1 = 91

		int start = 45 * (page - 1) + 1;
		int end = 45 * page;
		int i = 1;

		for (Player target : Bukkit.getOnlinePlayers()) {
			if ((i >= start) && (i <= end)) {

				list.addItem(new ItemStack[] { MenuItems.PlayersOnlineHead(target) });
			}
			i++;
		}

		list.setItem(50, MenuItems.ArrowForward());
		list.setItem(48, MenuItems.ArrowBack());
		return list;
	}

}
