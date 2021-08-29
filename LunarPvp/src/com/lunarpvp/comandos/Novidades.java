package com.lunarpvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Novidades
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("novidades")) {}
    p.sendMessage("§f      §b§lNOVIDADES     ");
    p.sendMessage("§f");
    p.sendMessage("§7Data: §e24/08/2018");
    p.sendMessage("§eInicio do projeto do LunarPvP");
    return false;
  }
}
