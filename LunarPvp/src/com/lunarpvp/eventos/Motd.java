package com.lunarpvp.eventos;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

public class Motd implements Listener{
	
	@EventHandler
	public void Motd(ServerListPingEvent e) {
		e.setMotd("§b§lLunar§f§lPvP §7(1.7 e 1.8)\n§fVenha jogar §bkitpvp");
	}
	

	}


