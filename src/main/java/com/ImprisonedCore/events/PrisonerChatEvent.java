package com.ImprisonedCore.events;

import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.ImprisonedCore.database.DatabaseManager;
import com.ImprisonedCore.util.MsgUtil;
import com.ImprisonedCore.util.Ranks;

public class PrisonerChatEvent implements Listener {

	@EventHandler
	public void PrisonerChat(AsyncPlayerChatEvent ev) {

		Player p = ev.getPlayer();
		UUID u = p.getUniqueId();

		String rank = DatabaseManager.PlayerRank(u);
		String name = p.getDisplayName();
		String message = ev.getMessage();

		if (DatabaseManager.PlayerRank(u).equals(Ranks.P)) {
			ev.setFormat(MsgUtil.translate("[&7" + rank + "&f]&7 " + name + "&f: " + message));
		}
		if (DatabaseManager.PlayerRank(u).equals(Ranks.D)) {
			ev.setFormat(MsgUtil.translate("&f[&e" + rank + "&f] " + name + ": " + message));
		}
		if (DatabaseManager.PlayerRank(u).equals(Ranks.C)) {
			ev.setFormat(MsgUtil.translate("&f[&2" + rank + "&f] " + name + ": " + message));
		}
		if (DatabaseManager.PlayerRank(u).equals(Ranks.B)) {
			ev.setFormat(MsgUtil.translate("&f[&6" + rank + "&f] " + name + ": " + message));
		}
		if (DatabaseManager.PlayerRank(u).equals(Ranks.A)) {
			ev.setFormat(MsgUtil.translate("&f[&b" + rank + "&f] " + name + ": " + message));
		}
		if (DatabaseManager.PlayerRank(u).equals(Ranks.G)) {
			ev.setFormat(MsgUtil.translate("&f[&9" + rank + "&f] &f" + name + ": &9" + message));
		}
		if (DatabaseManager.PlayerRank(u).equals(Ranks.W)) {
			ev.setFormat(MsgUtil.translate("&f[&4" + rank + "&f] &4" + name + "&f: &4" + message));
		}
	}
}
