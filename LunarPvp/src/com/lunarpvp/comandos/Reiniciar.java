package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import com.lunarpvp.main.Main;



public class Reiniciar implements CommandExecutor{


	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cApenas jogadores podem executar esse comando");
			return true;
		}
		Player p = (Player)sender;
		
		if (args.length == 0 && cmd.getName().equalsIgnoreCase("reiniciar")) {
		if (p.hasPermission("lunarpvp.reiniciar")) {
			p.sendMessage("§aO Servidor reiniciara em 30 segundos");
			Bukkit.broadcastMessage("§b§lREINICIAR: §fServidor sera reiniciado em 30 segundos!");
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§b§lREINICIAR: §fServidor sera reiniciado em 20 segundos!");
					
				}
			}.runTaskLater(Main.instance, 200L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§b§lREINICIAR: §fServidor sera reiniciado em 10 segundos!");
					
				}
			}.runTaskLater(Main.instance, 400L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§b§lREINICIAR: §fServidor sera reiniciado em 5 segundos!");
					
				}
			}.runTaskLater(Main.instance, 500L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§b§lREINICIAR: §fServidor sera reiniciado em 4 segundos!");
					
				}
			}.runTaskLater(Main.instance, 520L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§b§lREINICIAR: §fServidor sera reiniciado em 3 segundos!");
					
				}
			}.runTaskLater(Main.instance, 540L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§b§lREINICIAR: §fServidor sera reiniciado em 2 segundos!");
					
				}
			}.runTaskLater(Main.instance, 560L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.broadcastMessage("§cServidor reiniciando...");
					
				}
			}.runTaskLater(Main.instance, 580L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					for (Player s : Bukkit.getOnlinePlayers()) {
						s.kickPlayer("§b§lLunar§f§lPvP\n §7Estamos reiniciando\n Voltamos já\n §f@LunarMC");
					}
				}
			}.runTaskLater(Main.instance, 600L);
			
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Bukkit.shutdown();
				}
			}.runTaskLater(Main.instance, 640L);
		} else {
			p.sendMessage("§b§lLunar§f§lPvP: §7Você não possui permissão suficiente!");
	    }
	    }
	    return false;
	  }
	}
