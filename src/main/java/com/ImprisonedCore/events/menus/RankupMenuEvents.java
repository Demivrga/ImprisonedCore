package com.ImprisonedCore.events.menus;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.ImprisonedCore.CoreMain;
import com.ImprisonedCore.database.DatabaseManager;
import com.ImprisonedCore.menus.Rankup;
import com.ImprisonedCore.menus.items.RankupItems;
import com.ImprisonedCore.menus.items.MenuItems;

public class RankupMenuEvents implements Listener {

	public CoreMain pl;
	
	public RankupMenuEvents(CoreMain instance) {
		this.pl = instance;
	}
	
	@EventHandler
	public void RankupMenuActions(InventoryClickEvent ev) {

		Player p = (Player) ev.getWhoClicked();
		UUID u = p.getUniqueId();
		Inventory inv = ev.getClickedInventory();

		if (ev.getCurrentItem() != null) {
			if (ev.getCurrentItem().equals(MenuItems.ArrowBack())) {
				if (ev.getInventory().getTitle().equals(Rankup.RankupTitle + " A")) {
					p.openInventory(Rankup.RankupB());
				}
				if (ev.getInventory().getTitle().equals(Rankup.RankupTitle + " B")) {
					p.openInventory(Rankup.RankupC());
				}
				if (ev.getInventory().getTitle().equals(Rankup.RankupTitle + " C")) {
					p.openInventory(Rankup.RankupD());
				}
			}

			if (ev.getCurrentItem().equals(MenuItems.ArrowForward())) {
				if (ev.getInventory().getTitle().equals(Rankup.RankupTitle + " B")) {
					p.openInventory(Rankup.RankupA());
				}
				if (ev.getInventory().getTitle().equals(Rankup.RankupTitle + " C")) {
					p.openInventory(Rankup.RankupB());
				}
				if (ev.getInventory().getTitle().equals(Rankup.RankupTitle + " D")) {
					p.openInventory(Rankup.RankupC());
				}
			}

			if (ev.getCurrentItem().equals(RankupItems.RankD())) {
				if (DatabaseManager.PlayerRank(u).equals("E-Prisoner")) {
					if (DatabaseManager.PlayerMoney(u) >= 2500.0) {
						// Do rank up stuff
						DatabaseManager.updatePlayerRank(u, "D-Prisoner");
						DatabaseManager.updatePlayerMoney(u, DatabaseManager.PlayerMoney(u) - 2500);
						// Send Message
					} else {
						ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lInsufficent Funds!"));
						ItemUpdate(inv, 13, RankupItems.RankD());
					}
				} else {
					ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lWrong Rank!"));
					ItemUpdate(inv, 13, RankupItems.RankD());
				}
			}

			if (ev.getCurrentItem().equals(RankupItems.RankC())) {
				if (DatabaseManager.PlayerRank(u).equals("D-Prisoner")) {
					if (DatabaseManager.PlayerMoney(u) >= 10500.0) {
						// Do rank up stuff
						DatabaseManager.updatePlayerRank(u, "C-Prisoner");
						DatabaseManager.updatePlayerMoney(u, DatabaseManager.PlayerMoney(u) - 10500);
						// Send Message
					} else {
						ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lInsufficent Funds!"));
						ItemUpdate(inv, 13, RankupItems.RankC());
					}
				} else {
					ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lWrong Rank!"));
					ItemUpdate(inv, 13, RankupItems.RankC());
				}
			}

			if (ev.getCurrentItem().equals(RankupItems.RankB())) {
				if (DatabaseManager.PlayerRank(u).equals("C-Prisoner")) {
					if (DatabaseManager.PlayerMoney(u) >= 25000.0) {
						// Do rank up stuff
						DatabaseManager.updatePlayerRank(u, "B-Prisoner");
						DatabaseManager.updatePlayerMoney(u, DatabaseManager.PlayerMoney(u) - 25000);
						// Send Message
					} else {
						ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lInsufficent Funds!"));
						ItemUpdate(inv, 13, RankupItems.RankB());
					}
				} else {
					ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lWrong Rank!"));
					ItemUpdate(inv, 13, RankupItems.RankB());
				}
			}

			if (ev.getCurrentItem().equals(RankupItems.RankA())) {
				if (DatabaseManager.PlayerRank(u).equals("B-Prisoner")) {
					if (DatabaseManager.PlayerMoney(u) >= 45000.0) {
						// Do rank up stuff
						DatabaseManager.updatePlayerRank(u, "A-Prisoner");
						DatabaseManager.updatePlayerMoney(u, DatabaseManager.PlayerMoney(u) - 45000);
						// Send Message
					} else {
						ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lInsufficent Funds!"));
						ItemUpdate(inv, 13, RankupItems.RankA());
					}
				} else {
					ev.getInventory().setItem(13, MenuItems.Error("&4&lERROR!", "&4&lWrong Rank!"));
					ItemUpdate(inv, 13, RankupItems.RankA());
				}
			}
		}
	}
	
	public void ItemUpdate(final Inventory inv, final int slot, final ItemStack old) {
		Bukkit.getScheduler().runTaskLater(this.pl, new Runnable() {
			public void run() {

				if (inv != null) {
					inv.setItem(slot, old);

				}
			}
		}, 40L);
	}
}
