package com.lunarpvp.api;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.lunarpvp.main.Main;

import ca.wacos.nametagedit.NametagAPI;

public class TagsAPI implements Listener {
	public static void setarTag(Player p ,String tag) {
		new BukkitRunnable() {
			@Override
			public void run() {
				p.setDisplayName(tag + p.getName());
				NametagAPI.setPrefix(p.getName(), tag);
			}
		}.runTaskAsynchronously(Main.getInstance());
	}
	@EventHandler
	public void tag(PlayerJoinEvent e) {
		new BukkitRunnable() {
			
			@Override
			public void run() {
				Player p = e.getPlayer();
				if(p.hasPermission("tag.dono")) {
					setarTag(p, "§4§lDONO §4");
					p.setPlayerListName("§4DONO §f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.subdono")) {
					setarTag(p, "§c§lSUBDONO§f ");
					p.setPlayerListName("§c§lSUBD §f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.gerente")) {
					setarTag(p, "§c§lGERENTE §f");
					p.setPlayerListName("§cGER §f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.semiyt")) {
					setarTag(p, "§e§lSEMIYT §f");
					p.setPlayerListName("§eSYT §f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.admin")) {
					setarTag(p, "§c§lADMIN+ §f");
					p.setPlayerListName("§cADM+ §f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.admin")) {
					setarTag(p, "§c§lADMIN §f");
					p.setPlayerListName("§cADM§f " + p.getName());
					return;
				}
				if(p.hasPermission("tag.mod")) {
					setarTag(p, "§5§lMOD+ §f");
					p.setPlayerListName("§5MOD+" + p.getName());
					return;
				}
				if(p.hasPermission("tag.mod")) {
					setarTag(p, "§5§lMOD §f");
					p.setPlayerListName("§5MOD" + p.getName());
					return;
				}
				if(p.hasPermission("tag.trial")) {
					setarTag(p, "§d§lTRIAL §f");
					p.setPlayerListName("§dTRIAL §f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.youtuber")) {
					setarTag(p, "§b§lYOUTUBER §b");
					p.setPlayerListName("§bYT §f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.real")) {
					setarTag(p, "§a§lREAL §f");
					p.setPlayerListName("§aREAL f" + p.getName());
					return;
				}
				if(p.hasPermission("tag.fake")) {
					setarTag(p, "§e§lFAKE f");
					p.setPlayerListName("§eFAKE§f " + p.getName());
					return;
				}
				if(p.hasPermission("tag.normal")) {
					setarTag(p, "§7");
					p.setPlayerListName("§7" + p.getName());
					return;
				}
				setarTag(p, "§7");
				p.setPlayerListName("§7" + p.getName());
				return;
				
			}
		}.runTaskAsynchronously(Main.getInstance());
	}
}
