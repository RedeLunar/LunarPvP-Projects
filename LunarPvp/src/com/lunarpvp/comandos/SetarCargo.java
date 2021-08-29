package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetarCargo implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("setarcargo")) {
			if (!(sender.hasPermission("lunarpvp.setarcargo"))) {
				sender.sendMessage("§b§lLunar§f§lPvP: §7Você não possui permissão suficiente!");
				return true;
			}
			if(args.length == 1) {
				
			}
			if(args.length == 2) {
				String grupo = args[1];
				Player player = Bukkit.getPlayer(args[0]);
				if(grupo.equalsIgnoreCase("normal")) {
					p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lNORMAL");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Normal");
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §7§lNORMAL");
					player.chat("/tag normal");
					return true;
				}
					if(grupo.equalsIgnoreCase("fake")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lFAKE");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Fake");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §e§lFAKE");
						player.chat("/tag fake");
						return true;
				}
					if(grupo.equalsIgnoreCase("real")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lREAL");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Real");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §a§lREAL");
						player.chat("/tag real");
						return true;
				}
					if(grupo.equalsIgnoreCase("helper")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lHELPER");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Helper");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §a§lHELPER");
						player.chat("/tag helper");
						return true;
				}
					if(grupo.equalsIgnoreCase("youtuber")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lYOUTUBER");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Yt");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §b§lYOUTUBER");
						player.chat("/tag youtuber");
						return true;
				}
					if(grupo.equalsIgnoreCase("mod")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lMOD");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mod");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §5§lMOD");
						player.chat("/tag mod");
						return true;
				}
					if(grupo.equalsIgnoreCase("mod+")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lMOD+");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mod+");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §5§lMOD+");
						player.chat("/tag mod+");
						return true;
				}
					if(grupo.equalsIgnoreCase("admin+")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lADMIN+");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Admin+");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §c§lADMIN+");
						player.chat("/tag admin+");
						return true;
				}
					if(grupo.equalsIgnoreCase("trial")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lTRIAL");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Trial");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §d§lTRIAL");
						player.chat("/tag trial");
						return true;
				}
					if(grupo.equalsIgnoreCase("admin")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para ADMIN");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Admin");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §c§lADMIN");
						player.chat("/tag admin");
						return true;
				}
					if(grupo.equalsIgnoreCase("gerente")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para GERENTE");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Gerente");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §c§lGERENTE");
						player.chat("/tag gerente");
						return true;
				}
					if(grupo.equalsIgnoreCase("dono")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §4§lDONO");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §4§lDONO");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Dono");
						player.chat("/tag master");
						return true;
					}
					if(grupo.equalsIgnoreCase("builder")) {
						p.sendMessage("§3O Player " + player.getName() + "§3(" + player.getUniqueId() + "§3)" +  " §3Alterado para §f§lBUILDER");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Builder");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §6" + player.getName() + "{nl} §7Tornou-se §2§lBUILDER");
						player.chat("/tag builder");
						return true;
					}
				} else {
					p.sendMessage("§b§lLunar§f§lPvP: §7Use isso corretamente: §e/setarcargo (nick) (cargo)");
					return true;
				}
				}
		return false;
	}
}
