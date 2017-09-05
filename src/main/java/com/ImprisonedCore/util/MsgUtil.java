package com.ImprisonedCore.util;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MsgUtil {
	
	public static void message(Player p, String message) {
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
	}

	public static void prefixmsg(Player p, String message) {
		p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&lImprisoned &8&l|&7 " + message));
	}
	
	public static String prefix(String message) {
		return ChatColor.translateAlternateColorCodes('&', "&8&lImprisoned &8&l|&7 " + message);
	}

	public static String translate(String message) {
		return ChatColor.translateAlternateColorCodes('&', message);
	}
}
