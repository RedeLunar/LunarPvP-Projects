package com.lunarpvp.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Youtuber
  implements Listener, CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("youtuber")) {}
    p.sendMessage("§f      §6§lREQUISITOS     ");
    p.sendMessage("§f");
    p.sendMessage("§b§lYT");
    p.sendMessage("§f200 inscritos");
    p.sendMessage("§f20 likes");
    p.sendMessage("§f150 views");
    return false;
  }
}
