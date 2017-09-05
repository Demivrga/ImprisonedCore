package com.ImprisonedCore.commands;

import java.util.UUID;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ImprisonedCore.database.DatabaseManager;
import com.ImprisonedCore.menus.Rankup;
import com.ImprisonedCore.util.Ranks;

public class RankupCommand implements CommandExecutor {

	public boolean onCommand(CommandSender cs, Command cmd, String lbl, String[] args) {

		Player p = (Player) cs;
		UUID u = p.getUniqueId();

		if (lbl.equalsIgnoreCase("rankup")) {

			if (DatabaseManager.PlayerRank(u).equals(Ranks.A)) {
				p.openInventory(Rankup.RankupA());
			}

			if (DatabaseManager.PlayerRank(u).equals(Ranks.B)) {
				p.openInventory(Rankup.RankupA());
			}

			if (DatabaseManager.PlayerRank(u).equals(Ranks.C)) {
				p.openInventory(Rankup.RankupB());
			}

			if (DatabaseManager.PlayerRank(u).equals(Ranks.D)) {
				p.openInventory(Rankup.RankupC());
			}

		}
		return false;

	}
}
