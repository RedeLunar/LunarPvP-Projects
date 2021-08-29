package com.lunarpvp.managers;

import org.bukkit.entity.Player;

public class Groups {
	
	public static String gettag(Player p) {
		if (p.hasPermission("tag.dono")) {
			return "§4§lDONO";
		}
		if (p.hasPermission("tag.gerente")) {
			return "§c§lGERENTE";
		}
		if (p.hasPermission("tag.admin+")) {
			return "§c§lADMIN+";
		}
		if (p.hasPermission("tag.admin")) {
			return "§c§lADMIN";
		}
		if (p.hasPermission("tag.coordenador")) {
			return "§b§lCOORDENADOR";
		}
		if (p.hasPermission("tag.mod+")) {
			return "§5§lMOD+";
		}
		if (p.hasPermission("tag.mod")) {
			return "§5§lMOD";
		}
		if (p.hasPermission("tag.trial")) {
			return "§d§lTRIAL";
		}
		if (p.hasPermission("tag.helper")) {
			return "§e§HELPER";
		}
		if (p.hasPermission("tag.youtuber")) {
			return "§b§lYOUTUBER";
		}
		if (p.hasPermission("tag.real")) {
			return "§a§lREAL";
		}
		if (p.hasPermission("tag.fake")) {
			return "§e§lFAKE";
		}
		if (p.hasPermission("tag.developer")) {
			return "§3DEV";
		}
		if (p.hasPermission("tag.builder")) {
			return "§2BUILDER";
		}
		if (p.hasPermission("tag.normal")) {
			return "§7NORMAL";
		}
		return "§7NORMAL";
	}

}
