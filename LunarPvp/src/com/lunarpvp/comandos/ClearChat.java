package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearChat implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		for (Player s : Bukkit.getOnlinePlayers()) {
			if (!(sender.hasPermission("lunarpvp.cc"))) {
				sender.sendMessage("§b§lLunar§f§lPvP: §7Você não possui permissão suficiente!");
				return true;
			}
		for (int i= 0; i != 100; i++) {
				s.sendMessage("  ");
		}
		  s.sendMessage("§e[CHAT] §fO Chat foi limpo!");
		}
		return false;
	}
	

}
