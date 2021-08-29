package com.lunarpvp.comandos;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.lunarpvp.eventos.KillsDeathsMoney;
import com.lunarpvp.main.Main;



public class Admin implements CommandExecutor, Listener {
	
	public static ArrayList<String> admin = new ArrayList<>();
	public static HashMap<String, ItemStack[]> saveinv = new HashMap<String, ItemStack[]>();
	public static HashMap<String, ItemStack[]> savearmor = new HashMap<String, ItemStack[]>();
	
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("�bPrecisa ser um Player para usar esse comando");
			return true;
		}
		if (!(sender.hasPermission("lunarpvp.admin"))) {
			sender.sendMessage("�b�lLunar�f�lPvP: �7Voc� n�o possui permiss�o suficiente!");
			return true;
		}
		Player p = (Player)sender;
		if (args.length == 0) {
           if (!admin.contains(p.getName())) {
           p.sendMessage("�b�lLunar�f�lPvP: �7Voc� entrou no modo �a�lADMIN");
           for (Player s : Bukkit.getOnlinePlayers()) {
        	   if (!s.hasPermission("lunarpvp.admin")) {
        	       s.hidePlayer(p);
                   }
                }
		        p.setGameMode(GameMode.CREATIVE);
	            admin.add(p.getName());
	            saveinv.put(p.getName(), p.getInventory().getContents());
	            savearmor.put(p.getName(), p.getInventory().getArmorContents());
		        p.setAllowFlight(true);
		        p.getInventory().clear();
			    
			    ItemStack estrela = new ItemStack(Material.NETHER_STAR);
			    ItemMeta estrelameta = estrela.getItemMeta();
			    estrelameta.setDisplayName("�a�lTroca Rapida!");
			    estrela.setItemMeta(estrelameta);
			    
			    ItemStack vine = new ItemStack(Material.VINE);
			    ItemMeta vines = vine.getItemMeta();
			    vines.setDisplayName("�f�l");
			    vine.setItemMeta(vines);
			    
			    ItemStack barra = new ItemStack(Material.IRON_FENCE);
			    ItemMeta barrameta = barra.getItemMeta();
			    barrameta.setDisplayName("�a�lPrender!");
			    barra.setItemMeta(barrameta);
			    
			    ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
			    ItemMeta sopameta = sopa.getItemMeta();
			    sopameta.setDisplayName("�a�lTestar Auto-Soup!");
			    sopa.setItemMeta(sopameta);
			    
			    ItemStack etiqueta = new ItemStack(Material.NAME_TAG);
			    ItemMeta etiquetameta = etiqueta.getItemMeta();
			    etiquetameta.setDisplayName("�a�lInforma�oes do player!");
			    etiqueta.setItemMeta(etiquetameta);
			    
			    ItemStack kb = new ItemStack(Material.STICK);
			    ItemMeta kbmeta = kb.getItemMeta();
				kbmeta.addEnchant(Enchantment.KNOCKBACK, 5, true);
			    kbmeta.setDisplayName("�a�lTeste o KnockBack");
			    kb.setItemMeta(kbmeta);
			    
			    p.getInventory().setItem(0, kb);
			    p.getInventory().setItem(2, estrela);
			    p.getInventory().setItem(4, barra);
			    p.getInventory().setItem(6, sopa);
			    p.getInventory().setItem(8, etiqueta);
			    p.updateInventory();
			    
		     } else {
		    	 p.sendMessage("�b�lLunar�f�lPvP: �7Voc� saiu do modo �c�lADMIN");

		    	 p.getInventory().clear();
		    	 admin.remove(p.getName());
		           for (Player s : Bukkit.getOnlinePlayers()) {
		        	   if (!s.hasPermission("lunarpvp.admin")) {
		        	       s.showPlayer(p);
		         }
		       }
		           p.setGameMode(GameMode.SURVIVAL);
		           p.getInventory().setContents(saveinv.get(p.getName()));
		           p.getInventory().setArmorContents(savearmor.get(p.getName()));
		     }
		    }
		return false;
   }
	@EventHandler
	public void prender(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.IRON_FENCE && admin.contains(e.getPlayer().getName())) {
			Player p = e.getPlayer();
			Player t = (Player)e.getRightClicked();
			p.chat("/arena " + t.getName());
    }	
  }
	@EventHandler
	public void InteragirEtiqueta(PlayerInteractEntityEvent e) {
		if (e.getPlayer().getItemInHand().getType() == Material.NAME_TAG && admin.contains(e.getPlayer().getName()) && e.getRightClicked() instanceof Player) {
			Player p = e.getPlayer();
			Player t = (Player)e.getRightClicked();
			Damageable hp = t;
			p.sendMessage("�b�lInformacoes do Player �7" + t.getName());
			p.sendMessage("�b�lVida �7" + (int)hp.getHealth());
			p.sendMessage("�b�lSopas �7" + getMaterial(t, Material.MUSHROOM_SOUP));
			p.sendMessage("�b�lKills �7" + KillsDeathsMoney.getKills(t));
			p.sendMessage("�b�lDeaths �7" + KillsDeathsMoney.getDeaths(t));
			p.sendMessage("�b�lMoney �7" + KillsDeathsMoney.getMoney(t));
			p.sendMessage("�b�lP �7" + t.getAddress().getHostString());
      }
  }
	
	public static int getMaterial(Player p, Material m) {
		int value = 0;
		for (ItemStack item : p.getInventory().getContents()) {
			if (item != null && item.getType() == m && item.getAmount() > 0) {
				value += item.getAmount();
				
			}
		}
		return value;
	}
	@EventHandler
	public void AutoSoup(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.MUSHROOM_SOUP && admin.contains(e.getPlayer().getName())) {
			Player p = e.getPlayer();
			Player t = (Player)e.getRightClicked();
			p.openInventory(t.getInventory());
		    ItemStack s = new ItemStack(Material.MUSHROOM_SOUP);
		    ItemMeta smeta = s.getItemMeta();
		    smeta.setDisplayName("�a�lAutoSoup!");
		    s.setItemMeta(smeta);
			t.getInventory().setItem(9, s);
			t.getInventory().setItem(10, new ItemStack(Material.AIR));
			t.getInventory().setItem(11, new ItemStack(Material.AIR));
			t.getInventory().setItem(12, new ItemStack(Material.AIR));
			t.getInventory().setItem(13, new ItemStack(Material.AIR));
			t.getInventory().setItem(14, new ItemStack(Material.AIR));
			t.getInventory().setItem(15, new ItemStack(Material.AIR));
			t.getInventory().setItem(16, new ItemStack(Material.AIR));
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					t.getInventory().setItem(10, s);
				}
			}, 25);
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					t.getInventory().setItem(11, s);
				}
			}, 50);
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					t.getInventory().setItem(12, s);
				}
			}, 75);
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					t.getInventory().setItem(13, s);
				}
			}, 100);
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					t.getInventory().setItem(14, s);
				}
			}, 125);
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					t.getInventory().setItem(15, s);
				}
			}, 150);
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					t.getInventory().setItem(16, s);
				}
			}, 175);
   }
  }
	@SuppressWarnings("deprecation")
	@EventHandler
	public void TrocaRapida(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if (e.getMaterial() == Material.NETHER_STAR && admin.contains(p.getName())) {
			for (Player s : Bukkit.getOnlinePlayers()) {
			    if (!s.hasPermission("lunarpvp.admin")) {
			    s.showPlayer(p);
			    p.setGameMode(GameMode.SURVIVAL);
		 }
		}
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
			@Override
			public void run() {
				for (Player s : Bukkit.getOnlinePlayers()) {
				    if (!s.hasPermission("lunarpvp.admin")) {
				    s.hidePlayer(p);
				    p.setGameMode(GameMode.CREATIVE);
				    }
				}
			}
		}, 15L);
	}
  }
	@EventHandler
	public void Abririnv(PlayerInteractEntityEvent e) {
		if (e.getRightClicked() instanceof Player && e.getPlayer().getItemInHand().getType() == Material.AIR && admin.contains(e.getPlayer().getName())) {
			Player t = (Player)e.getRightClicked();
			e.getPlayer().openInventory(t.getInventory());
		}
	}
}