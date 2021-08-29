package com.lunarpvp.kitdiario;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Entregador implements Listener {

	public ArrayList<String> lista = new ArrayList<>();
	
	@EventHandler
	public void evento1(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Player) {
			Player p = (Player) e.getDamager();
			if (e.getEntity() instanceof Villager) {
				Villager v = (Villager) e.getEntity();
				if (v.hasMetadata("EntregadorVillager")) {
					if(p.isOp() && p.getItemInHand().getType().equals(Material.STICK)) {
						v.setHealth(0.0);
						p.sendMessage("§cEntregador removido com sucesso! caso queira setar novamente use §f/setentregador");
						return;
					}
					e.setCancelled(true);
				}
			}
		}
	}

	@EventHandler
	public void evento1(EntityDamageEvent e) {
		if (e.getEntity() instanceof Villager) {
			Villager v = (Villager) e.getEntity();
			if (v.hasMetadata("EntregadorVillager")) {
				e.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void clicarNoVillager(PlayerInteractEntityEvent e) {
		if(e.getRightClicked() instanceof Villager) {
			Player p = e.getPlayer();
			Villager v = (Villager) e.getRightClicked();
			if (v.hasMetadata("EntregadorVillager")) {
				e.setCancelled(true);
				if(lista.contains(p.getName())) {
					p.sendMessage("§cVocê já recebeu seu kit hoje!");
					return;
				}
				p.chat("/kitdiario");
			}
		}
	}
	
}
