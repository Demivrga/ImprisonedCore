package com.ImprisonedCore.commands;

import java.util.UUID;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ImprisonedCore.database.DatabaseManager;

public class BalanceCommand implements CommandExecutor {

	public boolean onCommand(CommandSender cs, Command cmd, String lbl, String[] args) {

		Player p = (Player) cs;
		UUID u = p.getUniqueId();

		if (lbl.equalsIgnoreCase("balance")) {
			p.sendMessage("Current Balance: $" + DatabaseManager.PlayerMoney(u));

		}

		if (lbl.equalsIgnoreCase("bal")) {
			p.sendMessage("Current Balance: $" + DatabaseManager.PlayerMoney(u));

		}

		if (lbl.equalsIgnoreCase("money")) {
			p.sendMessage("Current Balance: $" + DatabaseManager.PlayerMoney(u));

		}

		if (lbl.equalsIgnoreCase("$")) {
			p.sendMessage("Current Balance: $" + DatabaseManager.PlayerMoney(u));

		}

		if (lbl.equalsIgnoreCase("cash")) {
			p.sendMessage("Current Balance: $" + DatabaseManager.PlayerMoney(u));

		}
		return false;

	}
}
