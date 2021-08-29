package com.lunarpvp.kits;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.lunarpvp.api.KitAPI;



public class Madman implements Listener {
	
	@EventHandler
	public void bater(EntityDamageByEntityEvent e) {
		if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
			Player p = (Player)e.getEntity();
			Player t = (Player)e.getDamager();
			
			if ((KitAPI.getKit(t) == "Madman") && (t.getItemInHand().getType() == Material.STONE_SWORD)) {
				if (new Random().nextInt(100) <= 40) {
					p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 10*20, 3));
				}
 			}
		}
	}

}
