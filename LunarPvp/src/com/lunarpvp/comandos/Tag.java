package com.lunarpvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import com.lunarpvp.api.TagsAPI;


public class Tag implements CommandExecutor, Listener {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Comando apenas para jogadores");
			return true;
		}
		Player p = (Player) sender;
		if(args.length == 0) {
			if(p.hasPermission("tag.dono")) {
				p.sendMessage("§fVocê possui o cargo §4§lDONO §fentão você tem acesso a todas as tags!");
				return true;
			}
			if(p.hasPermission("tag.admin+")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§c§lADMIN+");
				p.sendMessage("§c§lADMIN");
				p.sendMessage("§5§lMOD+");
				p.sendMessage("§5§lMOD");
				p.sendMessage("§e§lHELPER");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.mod")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§5§lMOD");
				p.sendMessage("§e§lHELPER");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.gerente")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§c§lGERENTE");
				p.sendMessage("§c§lADMIN+");
				p.sendMessage("§c§lADMIN");
				p.sendMessage("§5§lMOD+");
				p.sendMessage("§5§lMOD");
				p.sendMessage("§e§lHELPER");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.admin")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§c§lADMIN");
				p.sendMessage("§5§lMOD+");
				p.sendMessage("§5§lMOD");
				p.sendMessage("§e§lHELPER");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.mod+")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§5§lMOD+");
				p.sendMessage("§5§lMOD");
				p.sendMessage("§e§lHELPER");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.trial")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§d§lTRIAL");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.youtuber")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§bYOUTUBER");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.real")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§aREAL");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.coordenador")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§b§lCOORDENADOR");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.dev")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§3§lDEV");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.fake")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§eFAKE");
				p.sendMessage("§7NORMAL");
				return true;
			}
			if(p.hasPermission("tag.semiyt")) {
				p.sendMessage("§fTodas as tags disponiveis a §aVOCÊ");
				p.sendMessage("§e§lSEMIYT");
				p.sendMessage("§7NORMAL");
				return true;
			}
			p.sendMessage("§7NORMAL");
			return true;
		}
		
	
		
		                                 // // // // // // // 
		// // // // // // // // // // //                     // // // // // // // // // // // 
		                                // // // // // // // 
		
		if(p.hasPermission("tag.dono")) {
			if(args[0].equalsIgnoreCase("dono")) {
				TagsAPI.setarTag(p, "§4§lDONO §f");
				p.setPlayerListName("§4§lDONO §f" + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §4§lDONO");
				
				return true;
			 }
			}
		if (p.hasPermission("tag.subdono")) {
			if(args[0].equalsIgnoreCase("subdono")) {
				TagsAPI.setarTag(p, "§c§lSUBDONO §f");
				p.setPlayerListName("§c§lSUBD§f " + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §c§lSUBDONO");
				
				return true;
			 }
			}
		if (p.hasPermission("tag.semiyt")) {
			if(args[0].equalsIgnoreCase("semiyt")) {
				TagsAPI.setarTag(p, "§e§lSEMIYT §f");
				p.setPlayerListName("§e§lSEMIYT§f " + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §e§lSEMIYT");
				
				return true;
			 }
			}
		if (p.hasPermission("tag.gerente")) {
			if(args[0].equalsIgnoreCase("gerente")) {
				TagsAPI.setarTag(p, "§c§lGERENTE §f");
				p.setPlayerListName("§cGER" + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §c§lGERENTE");
				
				return true;
			 }
			}
		if (p.hasPermission("tag.admin+")) {
			if(args[0].equalsIgnoreCase("admin+")) {
				TagsAPI.setarTag(p, "§c§lADMIN+ §f");
				p.setPlayerListName("§c§lADM+ §f" + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §c§lADM+");
				
				return true;
			 }
			}
		if (p.hasPermission("tag.admin")) {
			if(args[0].equalsIgnoreCase("admin")) {
				TagsAPI.setarTag(p, "§c§lADMIN §f");
				p.setPlayerListName("§c§lADM §f" + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §c§lADMIN");
				
				return true;
			 }
			}
		if (p.hasPermission("tag.mod+")) {
			if(args[0].equalsIgnoreCase("mod+")) {
				TagsAPI.setarTag(p, "§5§lMOD+ §f");
				p.setPlayerListName("§5MOD+ §f" + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §5§lMOD+");
				
				return true;
			 }
			}
		     if (p.hasPermission("tag.mod")) {
			 if(args[0].equalsIgnoreCase("mod")) {
				TagsAPI.setarTag(p, "§5§lMOD §5");
				p.setPlayerListName("§5MOD§f " + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §5§lMOD");
				
				return true;
			 }
			}
		     if (p.hasPermission("tag.coordenador")) {
				 if(args[0].equalsIgnoreCase("coordenador")) {
					TagsAPI.setarTag(p, "§b§lCOORDENADOR §f");
					p.setPlayerListName("§bCORD §f" + p.getName());
					p.sendMessage("§3§lCARGOS: §fTag alterada para §b§lCOORDENADOR");
					
					return true;
				 }
		     }
		 	if (p.hasPermission("tag.dev")) {
				if(args[0].equalsIgnoreCase("dev")) {
					TagsAPI.setarTag(p, "§3§lDEV §f");
					p.setPlayerListName("§3DEV§f " + p.getName());
					p.sendMessage("§3§lCARGOS: §fTag alterada para §3§lDEV");
					
					return true;
				 }
				}
		     if (p.hasPermission("tag.trial")) {
			 if(args[0].equalsIgnoreCase("trial")) {
				TagsAPI.setarTag(p, "§d§lTRIAL §d");
				p.setPlayerListName("§d§lTRIAL§f " + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §d§lTRIAL");
				
				return true;
			 }
			}
		     if (p.hasPermission("tag.youtuber")) {
			 if(args[0].equalsIgnoreCase("youtuber")) {
				TagsAPI.setarTag(p, "§b§lYOUTUBER §b");
				p.setPlayerListName("§bYT§f " + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §b§lYOUTUBER");
				
				return true;
			 }
			}
		     if (p.hasPermission("tag.real")) {
			 if(args[0].equalsIgnoreCase("real")) {
				TagsAPI.setarTag(p, "§a§lREAL §f");
				p.setPlayerListName("§aREAL §f" + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §a§lREAL");
				
				return true;
			 }
			}
		     if (p.hasPermission("tag.fake")) {
			 if(args[0].equalsIgnoreCase("fake")) {
				TagsAPI.setarTag(p, "§e§lFAKE§f ");
				p.setPlayerListName("§eFAKE§f " + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §e§lFAKE");
				
				return true;
			 }
			}
		     if (p.hasPermission("tag.normal")) {
			 if(args[0].equalsIgnoreCase("normal")) {
				TagsAPI.setarTag(p, "§7§lNormal §7");
				p.setPlayerListName("§7" + p.getName());
				p.sendMessage("§3§lCARGOS: §fTag alterada para §7§lNORMAL");
				
				return true;
			 }
			}
		return false;
	}
}
