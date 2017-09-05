package com.ImprisonedCore.events;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.ImprisonedCore.database.DatabaseManager;
import com.ImprisonedCore.util.MsgUtil;

public class PrisonerJoinEvent implements Listener {

	@EventHandler
	public void PrisonerJoin(PlayerJoinEvent ev) {

		Player p = ev.getPlayer();
		UUID u = p.getUniqueId();
		
		p.updateInventory();

		/*
		 * Let's check for the player, and if they aren't there, then create
		 * some data for them inside our MongoDB.
		 */

		if (DatabaseManager.findPlayer(u) == null) {
			// Lets add them to the database
			// STOREPLAYER :: UUID, PLAYERNAME, GANG, GANGRANK, RANK, VIP, MONEY
			DatabaseManager.storePlayer(u, p.getName(), null, null, "Prisoner", 0, 101.10);

			// Lets then message them some join message
			Bukkit.broadcastMessage(MsgUtil.prefix("FRESH FISH! : " + p.getDisplayName()));
			Bukkit.broadcastMessage(MsgUtil.prefix("FRESH FISH! : " + p.getDisplayName()));
			
			Bukkit.broadcastMessage(MsgUtil.prefix("There are now a total incarcerated of: " + DatabaseManager.TotalUsers()));

		} else {
			// Checking to make sure their name hasn't change
			if (DatabaseManager.PlayerName(u).equals(p.getName())) {
				// do nothing
				
			} else {
				// If their name has changed, lets update it.
				p.sendMessage("[Imprisoned] :: We see you've changed your name, one moment while we update it!");
				DatabaseManager.updatePlayerName(u, p.getName());
			}
			MsgUtil.prefixmsg(p, "Your current rank is: &8&l"+DatabaseManager.PlayerRank(u));
		}

	}

}
