package com.lunarpvp.login;

import java.util.HashMap;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class JoinLogin implements Listener {

	static HashMap<String, Double> Lox = new HashMap<>();
	static HashMap<String, Double> Loz = new HashMap<>();
	static HashMap<String, Double> Loy = new HashMap<>();

	@EventHandler
	public void join(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		CheckLogin.Seg.put(p.getName(), 0);
		p.teleport(p.getWorld().getSpawnLocation());
		Lox.remove(p.getName());
		Loz.remove(p.getName());
		Loy.remove(p.getName());
		if (!Variaveis.fazendoLogin.contains(p.getName())) {
			Variaveis.fazendoLogin.add(p.getName());
		}
		CheckLogin.checkLogin(p);
	}

	@EventHandler
	public void klogin(PlayerCommandPreprocessEvent e) {
		if (Variaveis.fazendoLogin.contains(e.getPlayer().getName())) {
			if (e.getMessage().toLowerCase().startsWith("/logar")
					|| e.getMessage().toLowerCase().startsWith("/registrar")) {
				e.setCancelled(false);
			} else {
				e.setCancelled(true);
			}
		}
	}

	@EventHandler
	public void Move(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if (Variaveis.fazendoLogin.contains(p.getName())) {
			Location pl = p.getLocation();
			if (Lox.get(p.getName()) == null) {
				Lox.put(p.getName(), pl.getX());
			}
			if (Loy.get(p.getName()) == null) {
				Loy.put(p.getName(), pl.getY());
			}
			if (Loz.get(p.getName()) == null) {
				Loz.put(p.getName(), pl.getZ());
			}
			if (Lox.get(p.getName()) != pl.getX() || Loy.get(p.getName()) != pl.getY()
					|| Loz.get(p.getName()) != pl.getZ()) {
				p.teleport(p.getWorld().getSpawnLocation());
			}
			// e.setCancelled(true);
		}
	}
}
