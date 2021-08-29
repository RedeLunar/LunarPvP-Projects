package com.lunarpvp.managers;


import org.bukkit.entity.Player;

public class Grupos {
	
	public static String getRank(Player p) {
		if (p.hasPermission("rank.dono")) {
			return "§4§lDONO§f ";
		}
		if (p.hasPermission("rank.gerente")) {
			return "§c§lGERENTE§f ";
		}
		if (p.hasPermission("rank.admin")) {
			return "§c§lADMIN§f ";
		}
		if (p.hasPermission("rank.admin+")) {
			return "§c§lADMIN+§f ";
		}
		if (p.hasPermission("rank.mod+")) {
			return "§5§lMOD+§f ";
		}
		if (p.hasPermission("rank.coordenador")) {
			return "§b§lCOORDENADOR§f ";
		}
		if (p.hasPermission("rank.mod")) {
			return "§5§lMOD§f ";
		}
		if (p.hasPermission("rank.trial")) {
			return "§d§lTRIAL§f ";
		}
		if (p.hasPermission("rank.ajudante")) {
			return "§e§lAJUDANTE§f ";
		}
		if (p.hasPermission("rank.youtuber")) {
			return "§b§lYOUTUBER§f ";
		}
		if (p.hasPermission("rank.real")) {
			return "§a§lREAL§f ";
		}
		if (p.hasPermission("rank.fake")) {
			return "§e§lFAKE§f ";
		}
		if (p.hasPermission("rank.semiyt")) {
			return "§e§lSEMIYT§f ";
		}
		if (p.hasPermission("rank.normal")) {
			return "§7NORMAL";
		}
		return "§7NORMAL";
		}
}
