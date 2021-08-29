package com.lunarpvp.login;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Comandos implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("trocarsenha")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (args.length == 1) {
					if (!Variaveis.fazendoLogin.contains(p.getName())) {
						String SenhaNova = args[0];

						Variaveis.getMain().getConfig().set(p.getName(), SenhaNova);
						Variaveis.getMain().saveConfig();
						p.getPlayer().kickPlayer("§b§lLunar§f§PvP\n \n §fVocê alterou sua §eSENHA\n §fSenha escolida: §e" + SenhaNova);

						return true;
					}
					return true;
				} else {
					sender.sendMessage("§b§lLunar§f§lPvP: §7Use isso corretamente: §e/trocarsenha (senha nova)");
				}
			}
		}
		if (label.equalsIgnoreCase("registrar")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (args.length == 1) {
					if (Variaveis.getMain().getConfig().getString(p.getName()) == null) {
						String senha = args[0];
						p.getPlayer().kickPlayer("§b§lLunar§f§lPvP\n \n §7Você se registrou com §aSUCESSO\n §7Senha escolida: §e" + senha);
						Variaveis.getMain().getConfig().set(p.getName(), senha);
						Variaveis.getMain().saveConfig();
						if (Variaveis.fazendoLogin.contains(p.getName())) {
							Variaveis.fazendoLogin.remove(p.getName());
						}
					} else {
						p.sendMessage("§b§lLunar§f§lPvP: §7Você ja se encontra §aREGISTRADO");
					}
				} else {
					p.sendMessage("§b§lLunar§f§lPvP: §7Use §e/registrar (senha) §7para registrar-se");
				}
			}
		}
		if (label.equalsIgnoreCase("logar")) {
			if (sender instanceof Player) {
				Player p = (Player) sender;
				if (args.length == 1) {
					if (Variaveis.getMain().getConfig().getString(p.getName()) != null) {
						String senha = args[0];
						if (Variaveis.getMain().getConfig().getString(p.getName()).equalsIgnoreCase(senha)) {
							if (Variaveis.fazendoLogin.contains(p.getName())) {
								Variaveis.fazendoLogin.remove(p.getName());
								p.sendMessage("§b§lLunar§f§lPvP: §7Você se autenticou com §eSUCESSO");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getPlayer() + " §e§lAUTENTICADO!{nl} §fVocê se logou com sucesso!");
							} else {
								p.sendMessage("§b§lLunar§f§lPvP: §7Você Ja Esta Logado");
							}
						} else {
							p.sendMessage("§b§lLunar§f§lPvP: §7Senha §cERRADA");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + " §b§lLunar§f§lPvP{nl} §fSenha §cERRADA");
						}
					} else {
						p.sendMessage("§b§lLunar§f§lPvP: §7Você não esta §eREGISTRADO");
					}
				} else {
					p.sendMessage("§b§lLunar§f§lPvP: §7Use §e/logar (senha) §7para logar-se");
				}
			}
		}
		return false;
	}

}
