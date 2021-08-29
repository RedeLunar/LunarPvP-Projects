package com.lunarpvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Discord
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("discord")) {}
    p.sendMessage("§f      §9§lDISCORD     ");
    p.sendMessage("§f");
    p.sendMessage("§7Link: §ehttps://discord.gg/MZdYgn");
    return false;
  }
}
