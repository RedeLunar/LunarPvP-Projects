package com.lunarpvp.eventos;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class Respawnar implements Listener {
	
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	public static ItemStack warps;
	public static ItemMeta warpsmeta;
	public static ItemStack loja;
	public static ItemMeta lojameta;
	
	@EventHandler
	public void Respawnar(PlayerRespawnEvent e) {
		Player p = e.getPlayer();

	    kits = new ItemStack(Material.ENDER_CHEST);
	    kitsmeta = kits.getItemMeta();
	    kitsmeta.setDisplayName("�6Kits");
	    kits.setItemMeta(kitsmeta);
	    
	    
	    warps = new ItemStack(Material.BOOK);
	    warpsmeta = warps.getItemMeta();
	    warpsmeta.setDisplayName("�6Warps");
	    warps.setItemMeta(warpsmeta);
	    
	    loja = new ItemStack(Material.DIAMOND);
	    lojameta = loja.getItemMeta();
	    lojameta.setDisplayName("�6Loja");
	    loja.setItemMeta(lojameta);


	    p.getInventory().setItem(4, kits);
	    p.getInventory().setItem(2, warps);
	    p.getInventory().setItem(6, loja);
	    p.updateInventory();
	    p.setGameMode(GameMode.SURVIVAL);
	    

	}

	}

