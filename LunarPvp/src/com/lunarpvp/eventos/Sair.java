package com.lunarpvp.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.lunarpvp.api.KitAPI;

public class Sair implements Listener{
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player p = e.getPlayer();
		
		e.setQuitMessage("§7[§c-§7] §f" + p.getName());
		KitAPI.RemoveKit(p);
	}

}
