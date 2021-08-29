package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class Aviso
  implements CommandExecutor
  {
  public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
  {
    if ((commandLabel.equalsIgnoreCase("aviso")) && (sender.hasPermission("lunarpvp.aviso")))
    {
      if (args.length >= 1)
      {
        String bcast = "";
        for (int x = 0; x < args.length; x++) {
          bcast = bcast + args[x] + " ";
        }
        Player p = (Player)sender;

        bcast = ChatColor.translateAlternateColorCodes('&', bcast);
        Bukkit.broadcastMessage("§c§lAVISO: " + ChatColor.WHITE + bcast);
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §c§lAVISO{nl}§f " + bcast);
      }
      else
      {
        sender.sendMessage("§b§lLunar§f§lPvP: §7Use isso corretamente: §e/aviso (mensagem)");
      }
    }
    else {
      sender.sendMessage("§b§lLunar§f§lPvP: §7Você não possui permissão suficiente para executar este comando!");
    }
    return false;
  }
}
