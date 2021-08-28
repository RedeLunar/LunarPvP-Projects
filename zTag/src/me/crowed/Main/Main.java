package me.crowed.Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.crowed.Comandos.Tags;
import me.crowed.Main.ChatEvento;

public class Main extends JavaPlugin{
	
	public static Main main;
	public static Plugin instance;
	public static Plugin plugin;
	public static Plugin getPlugin(){
		return plugin;
	}
	
	public void onEnable() {
		
		Bukkit.getConsoleSender().sendMessage("§cPLUGN DE TAG DO LIL ATIVADO");
		
		main = this;
		getCommand("tag").setExecutor(new Tags());
		getServer().getPluginManager().registerEvents(new ChatEvento(),this);
		
		
		}
	
	public void onDisable() {
		
		Bukkit.getConsoleSender().sendMessage("§cPLUGN DE TAG DO LIL DESATIVADO");
		
	}

		@SuppressWarnings("unused")
		private Main getInstace() {
			return null;
		}

	}