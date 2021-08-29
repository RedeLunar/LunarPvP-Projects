package com.lunarpvp.eventos;

import org.bukkit.Effect;
import org.bukkit.Sound;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.weather.WeatherChangeEvent;



public class Geral implements Listener{
	
	@EventHandler
	public void semChuva(WeatherChangeEvent e) {
		e.setCancelled(true);
	}
	
	@EventHandler
	public void semFome(FoodLevelChangeEvent e) {
		e.setFoodLevel(20);
		e.setCancelled(true);
	}
	
	@EventHandler
	public void Drop(ItemSpawnEvent e) {
		e.getEntity().remove();
		e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.SMOKE, 1);
		e.getEntity().getWorld().playSound(e.getEntity().getLocation(), Sound.LAVA_POP, 1.0F, 1.0F);
	}

}
