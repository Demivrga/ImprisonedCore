package com.ImprisonedCore.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;

import com.ImprisonedCore.menus.Judge;
import com.ImprisonedCore.menus.Online;
import com.ImprisonedCore.menus.Rankup;

public class PrisonerMenuEvent implements Listener {

	/*
	 * 
	 * This class is where the move/click events are stored for the menu's
	 * If a new menu is made, a statement is created here to ensure the contents
	 * can't be stolen by the user whom is viewing the menu.
	 * 
	 */
	
	String JudgeTitle = Judge.JudgeMenu().getTitle();

	@EventHandler
	public void MenuMove(InventoryClickEvent ev) {

		if (ev.getInventory().getName().contains(JudgeTitle)) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().contains(Rankup.RankupTitle)) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().contains(Online.OnlineTitle)) {
			ev.setCancelled(true);
		}
	}

	@EventHandler
	public void MenuDrag(InventoryDragEvent ev) {

		if (ev.getInventory().getName().contains(JudgeTitle)) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().contains(Rankup.RankupTitle)) {
			ev.setCancelled(true);
		}

		if (ev.getInventory().getName().contains(Online.OnlineTitle)) {
			ev.setCancelled(true);
		}
	}
}
