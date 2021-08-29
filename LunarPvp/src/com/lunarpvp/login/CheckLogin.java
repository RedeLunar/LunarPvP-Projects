package com.lunarpvp.login;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CheckLogin {
	static HashMap<String, Integer> Seg = new HashMap<>();
	public static void checkLogin(Player p) {
		if (Variaveis.getMain().getConfig().getString(p.getName()) == null) {

			Bukkit.getScheduler().scheduleSyncRepeatingTask(Variaveis.getMain(), new Runnable() {
				public void run() {
					if (Variaveis.fazendoLogin.contains(p.getName())) {
						if(Seg.get(p.getName()) == null){
							Seg.put(p.getName(), 0);
						}
						Seg.put(p.getName(), Seg.get(p.getName()) +1);
						if(Seg.get(p.getName()) == 15){
							p.kickPlayer("§b§lLunar§f§lPvP\n §7Você demorou de mais para §aREGISTRAR");
						}
						p.sendMessage("§b§lLunar§f§lPvP: §7Use §e/registrar (senha) §7para registrar-se!");
					}
				}
			}, 0, 60);

		} else {

			Bukkit.getScheduler().scheduleSyncRepeatingTask(Variaveis.getMain(), new Runnable() {
				public void run() {

					if (Variaveis.fazendoLogin.contains(p.getName())) {
						if(Seg.get(p.getName()) == null){
							Seg.put(p.getName(), 0);
						}
						Seg.put(p.getName(), Seg.get(p.getName()) +1);
						if(Seg.get(p.getName()) == 15){
							p.kickPlayer("§b§lLunar§f§lPvP\n §7Você demorou de mais para se §aLOGAR");
						}
						p.sendMessage("§b§lLunar§f§lPvP: §7Use §e/logar (senha) §7para logar-se");
					}
				}
			}, 0, 60);

		}
	}

}
