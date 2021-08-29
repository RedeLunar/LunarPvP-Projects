package com.lunarpvp.eventos;

import org.bukkit.entity.Player;

import com.lunarpvp.main.Main;


public class KillsDeathsMoney {
	
	public static void addKill(Player p, int i) {
		int Value = Main.getInstance().stats.getInt(p.getUniqueId() + ".Kills");
		Main.getInstance().stats.set(p.getUniqueId() + ".Kills", Integer.valueOf(Value + 1));
		Main.getInstance().save();
	}
	
	public static void addDeaths(Player p, int i) {
		int Value = Main.getInstance().stats.getInt(p.getUniqueId() + ".Deaths");
		Main.getInstance().stats.set(p.getUniqueId() + ".Deaths", Integer.valueOf(Value + 1));
		Main.getInstance().save();
	}
	
	public static void addMoney(Player p, int i) {
		int Value = Main.getInstance().stats.getInt(p.getUniqueId() + ".Money");
		Main.getInstance().stats.set(p.getUniqueId() + ".Money", Integer.valueOf(Value + 100));
		Main.getInstance().save();
	}
	public static void removermoney(Player p, int i) {
		int Value = Main.getInstance().stats.getInt(p.getUniqueId() + ".Money");
		if ((Value - 60) > 0) {
			Main.getInstance().stats.set(p.getUniqueId() + ".Money", Integer.valueOf(Value - 60));
		} else {
			Main.getInstance().stats.set(p.getUniqueId() + ".Money", Integer.valueOf(0));
		}
		Main.getInstance().save();
	}
	
	public static int getKills(Player p) {
		return Main.getInstance().stats.getInt(p.getUniqueId() + ".Kills");
	}
	
	public static int getDeaths(Player p) {
		return Main.getInstance().stats.getInt(p.getUniqueId() + ".Deaths");
	}
	
	public static int getMoney(Player p) {
		return Main.getInstance().stats.getInt(p.getUniqueId() + ".Money");
	}

}
