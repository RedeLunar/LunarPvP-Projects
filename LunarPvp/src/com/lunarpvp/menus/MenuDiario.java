package com.lunarpvp.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;



public class MenuDiario implements Listener, CommandExecutor {
	
    public static java.util.List<String> Lore(String string)
    {
		return null;

    }
	
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack livro;
	public static ItemMeta livrometa;
	public static ItemStack viking;
	public static ItemMeta vikingmeta;
	
	@EventHandler
	public void Execute(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§6§lKit Diario")) {
				if (e.getCurrentItem().isSimilar(vidro)) {
					e.setCancelled(true);
					p.closeInventory();			
			}
			if (e.getCurrentItem().isSimilar(vidro)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(livro)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(viking)) {
				Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " add kit.stomper");
				e.setCancelled(true);
				p.closeInventory();
			}
			}
			}
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoce precisa ser um player");
			return true;
		}
		Player p = (Player)sender;
		Inventory warp = Bukkit.createInventory(p, 54, "§6§lKit Diario");
		
		
	    livro = new ItemStack(Material.BOOK);
	    livrometa = livro.getItemMeta();
	    livrometa.setDisplayName("§aKits");
	    livro.setItemMeta(livrometa);
	    
	    viking = new ItemStack(Material.STONE_AXE);
	    vikingmeta = viking.getItemMeta();
	    vikingmeta.setDisplayName("§fViking");
	    viking.setItemMeta(vikingmeta);


	    

	    for (int i =0; i != 54; i++) {
              warp.setItem(13, livro);
      		  warp.setItem(22, viking);
	    }
		
	    p.openInventory(warp);
	    return false;
	}
 }
