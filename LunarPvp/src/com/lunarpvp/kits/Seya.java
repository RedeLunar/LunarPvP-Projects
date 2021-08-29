package com.lunarpvp.kits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.lunarpvp.api.KitAPI;


public class Seya implements Listener {
	
	  public HashMap<String, Long> cooldown = new HashMap<>();
	  public static ArrayList<Player> Seya = new ArrayList<>();
	  
	  @EventHandler
	  public void Armadura(PlayerInteractEvent e)
	  {
	    Player p = e.getPlayer();
	    if (((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) && 
	      (KitAPI.getKit(p) == "Seya") && 
	      (p.getItemInHand().getType() == Material.DIAMOND)) {
	      if ((!this.cooldown.containsKey(p.getName())) || (((Long)this.cooldown.get(p.getName())).longValue() <= System.currentTimeMillis()))
	      {
	        p.sendMessage("�bARMADURA DE PEGASUS!");
	        e.setCancelled(true);
	        p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 500, 1));
	        p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 500, 1));
	        p.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 500, 1));
	        p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 500, 1));
	        p.playSound(p.getLocation(), Sound.IRONGOLEM_DEATH, 1.0F, 1.0F);
	        this.cooldown.put(p.getName(), Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(60L)));
	      }
	      else
	      {
	        p.sendMessage("�cFaltam �a" + TimeUnit.MILLISECONDS.toSeconds(((Long)this.cooldown.get(p.getName())).longValue() - System.currentTimeMillis()) + "�c segundos para usar novamente!");
	        e.setCancelled(true);
	        return;
	      }
	    }
	  }
	  
	  @EventHandler
	  public void DanoQueda(EntityDamageEvent e)
	  {
	    if (((e.getEntity() instanceof Player)) && 
	      (e.getCause() == EntityDamageEvent.DamageCause.FALL))
	    {
	      Player p = (Player)e.getEntity();
	      if (KitAPI.getKit(p) == "Seya") {
	        e.setDamage(e.getDamage());
	      }
	    }
	  }
	}
