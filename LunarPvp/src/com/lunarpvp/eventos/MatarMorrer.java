package com.lunarpvp.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;



import com.lunarpvp.api.KitAPI;
import com.lunarpvp.api.WarpsAPI;
import com.lunarpvp.scoreboard.Updater;



public class MatarMorrer implements Listener {
	
	@EventHandler
	public void Matan�a(PlayerDeathEvent e ) {
		Player p = e.getEntity();
		WarpsAPI.ir(p, "spawn");
		if (e.getEntity().getKiller() instanceof Player) {
			Player t = (Player)p.getKiller();
			KillsDeathsMoney.addDeaths(p, 1);
			KillsDeathsMoney.addKill(t, 1);
			KillsDeathsMoney.addMoney(t, 100);
			KillsDeathsMoney.removermoney(p, 60);
			KitAPI.RemoveKit(p);
			e.setDeathMessage(null);
			p.sendMessage("�cVoc� morreu pro jogador: �e " + t.getDisplayName() + "�c-60 coins");
			t.sendMessage("�aVoc� matou o jogador: �e" + p.getDisplayName() + "�a+100 coins");
		} else {
			Updater.UpdateScore(p);
		    KitAPI.RemoveKit(p);
			e.setDeathMessage(null);
			KillsDeathsMoney.addDeaths(p, 1);
			p.sendMessage("�fVoc� �c�lMORREU");
		}
	}

}
