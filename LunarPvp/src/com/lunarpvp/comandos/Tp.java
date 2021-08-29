package com.lunarpvp.comandos;

import org.bukkit.command.*;
import org.bukkit.*;
import org.bukkit.entity.*;


public class Tp implements CommandExecutor
{
    @SuppressWarnings("deprecation")
	public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("tp")) {
            if (p.hasPermission("lunarpvp.tp")) {
                final Player t = Bukkit.getPlayer(args[0]);
                if (t == null) {
                    p.sendMessage("�b�lLunar�f�lPvP: �7Jogador n�o �bENCONTRADO");
                    return true;
                }
                if (args.length == 0) {
                	p.sendMessage("�b�lLunar�f�lPvP: �7Use isso corretamente: �e/tp (nick)");
                }
                p.teleport((Entity)t);
                p.sendMessage("�b�lLunar�f�lPvP: �7Voc� se teleportou at� o jogador: �b" + t.getName());
            }
            else {
                p.sendMessage("�b�lLunar�f�lPvP: �7Voc� n�o possui permiss�o suficiente!");
            }
        }
        if (cmd.getName().equalsIgnoreCase("tphere")) {
            if (p.hasPermission("lunarpvp.tp")) {
                if (args.length == 0) {
                    p.sendMessage("�b�lLunar�f�lPvP: �7Use isso corretamente: �e/tphere (nick)");
                    return true;
                }
                final Player t = Bukkit.getPlayer(args[0]);
                if (t == null) {
                    p.sendMessage("�b�lLunar�f�lPvP: �7Jogador n�o �bENCONTRADO");
                    return true;
                }
                t.teleport((Entity)p);
                p.sendMessage("�b�lLunar�f�lPvP: �7Voc� puxou o jogador: �b" + t.getName() + " �7at� �eVOC�");
            }
            else {
                p.sendMessage("�b�lLunar�f�lPvP: �7Voc� n�o possui permiss�o suficiente!");
            }
        }
		return false;
    }
}