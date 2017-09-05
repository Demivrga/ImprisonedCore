package com.ImprisonedCore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ImprisonedCore.menus.Online;

public class ListCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender cs, Command cmd, String lbl, String[] args) {

		Player p = (Player) cs;

		if (lbl.equalsIgnoreCase("online")) {
			p.openInventory(Online.onlinePlayers(p, 1));
		}

		if (lbl.equalsIgnoreCase("who")) {
			p.openInventory(Online.onlinePlayers(p, 1));
		}

		if (lbl.equalsIgnoreCase("list")) {
			p.openInventory(Online.onlinePlayers(p, 1));
		}

		if (lbl.equalsIgnoreCase("players")) {
			p.openInventory(Online.onlinePlayers(p, 1));
		}

		if (lbl.equalsIgnoreCase("glist")) {
			p.openInventory(Online.onlinePlayers(p, 1));
		}
		
		if (lbl.equalsIgnoreCase("whom")) {
			p.openInventory(Online.onlinePlayers(p, 1));
		}
		return false;

	}

}
