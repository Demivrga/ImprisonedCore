package com.ImprisonedCore.events.menus;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.ImprisonedCore.menus.Online;
import com.ImprisonedCore.menus.items.MenuItems;

public class OnlineMenuEvents implements Listener {

	@EventHandler
	public void OnlineMenuActions(InventoryClickEvent ev) {

		Player p = (Player) ev.getWhoClicked();
		
		int i = Bukkit.getOnlinePlayers().size();
		int j = (int) Math.ceil(i/45.0);

		if (ev.getCurrentItem() != null) {
			if (ev.getClickedInventory().getTitle().contains(Online.OnlineTitle)) {

				// Lets split the title up. Getting everything past the #
				// Check the page #, if it's less than 100 then open a new page
				String[] parts = ChatColor.stripColor(ev.getClickedInventory().getTitle()).split("#");
				String num = parts[1];

				if (ev.getCurrentItem().equals(MenuItems.ArrowForward())) {
					if (Integer.parseInt(num) + 1 < j) {
						p.openInventory(Online.onlinePlayers(p, Integer.parseInt(num) + 1));
					}

				}

				if (ev.getCurrentItem().equals(MenuItems.ArrowBack())) {
					if (Integer.parseInt(num) > 1) {
						p.openInventory(Online.onlinePlayers(p, Integer.parseInt(num) - 1));

					}
				}
			}

		}
	}
}