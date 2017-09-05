package com.ImprisonedCore;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.ImprisonedCore.commands.BalanceCommand;
import com.ImprisonedCore.commands.RankupCommand;
import com.ImprisonedCore.commands.ListCommand;
import com.ImprisonedCore.events.PrisonerChatEvent;
import com.ImprisonedCore.events.PrisonerJoinEvent;
import com.ImprisonedCore.events.PrisonerMenuEvent;
import com.ImprisonedCore.events.menus.OnlineMenuEvents;
import com.ImprisonedCore.events.menus.RankupMenuEvents;

public class CoreMain extends JavaPlugin {
	PluginManager pm = Bukkit.getPluginManager();

	public void onEnable() {

		System.out.println("[ImprisonedCore] has been ENABLED");

		this.getCommand("bal").setExecutor(new BalanceCommand());
		this.getCommand("balance").setExecutor(new BalanceCommand());
		this.getCommand("money").setExecutor(new BalanceCommand());
		this.getCommand("cash").setExecutor(new BalanceCommand());
		this.getCommand("$").setExecutor(new BalanceCommand());

		this.getCommand("online").setExecutor(new ListCommand());
		this.getCommand("who").setExecutor(new ListCommand());
		this.getCommand("list").setExecutor(new ListCommand());
		this.getCommand("players").setExecutor(new ListCommand());
		this.getCommand("glist").setExecutor(new ListCommand());
		this.getCommand("whom").setExecutor(new ListCommand());

		this.getCommand("rankup").setExecutor(new RankupCommand());

		pm.registerEvents(new PrisonerJoinEvent(), this);
		pm.registerEvents(new PrisonerChatEvent(), this);
		pm.registerEvents(new PrisonerMenuEvent(), this);
		pm.registerEvents(new RankupMenuEvents(this), this);
		pm.registerEvents(new OnlineMenuEvents(), this);

	}

	public void onDisable() {

		System.out.println("[ImprisonedCore] has been DISABLED");

	}
}
