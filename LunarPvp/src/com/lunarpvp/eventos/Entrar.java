package com.lunarpvp.eventos;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



import com.lunarpvp.scoreboard.Updater;


public class Entrar implements Listener{
	
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	
	public static ItemStack warps;
	public static ItemMeta warpsmeta;
	
	public static ItemStack loja;
	public static ItemMeta lojameta;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		e.setJoinMessage("§7[§a+§7] §7" + p.getName());
		p.getInventory().clear();
		
		p.sendMessage("     §b§lLunar§f§lPvP     ");
		p.sendMessage(" ");
		p.sendMessage("§fSeja bem vindo §a" + p.getName());
		p.sendMessage("§fAo LunarPVP");
		p.sendMessage("§fNos trabalhamos para melhorar sua §a§lJOGABILIDADE");
		p.sendMessage("§fContamos com 2 developers.");
		p.sendMessage("§fPlugins proprios!");
		p.sendMessage("§f ");
		p.sendMessage("§fPara ver as novidades use §e/novidades");
		
		Updater.UpdateScore(p);
		
		    kits = new ItemStack(Material.ENDER_CHEST);
		    kitsmeta = kits.getItemMeta();
		    kitsmeta.setDisplayName("§6Kits");
		    kits.setItemMeta(kitsmeta);
		    
		    warps = new ItemStack(Material.BOOK);
		    warpsmeta = warps.getItemMeta();
		    warpsmeta.setDisplayName("§6Warps");
		    warps.setItemMeta(warpsmeta);
		    
		    loja = new ItemStack(Material.DIAMOND);
		    lojameta = loja.getItemMeta();
		    lojameta.setDisplayName("§6Loja");
		    loja.setItemMeta(lojameta);
		    
		    p.getInventory().setItem(4, kits);
		    p.getInventory().setItem(2, warps);
		    p.getInventory().setItem(6, loja);
		
	}

}
