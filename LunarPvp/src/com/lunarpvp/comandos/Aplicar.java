package com.lunarpvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Aplicar
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("aplicar")) {}
    p.sendMessage("§f      §c§lFORMULARIO     ");
    p.sendMessage("§f");
    p.sendMessage("§7Link: §ehttp://bit.ly/ajudanteform");
    return false;
  }
}
