package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Tell
  implements CommandExecutor
{
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("tell"))
    {
      if (args.length == 0)
      {
        sender.sendMessage("§b§lLunar§f§lPvP: §7Use isso corretamente: §e/tell (nick) (msg)");
        return true;
      }
      if (args.length == 1)
      {
        sender.sendMessage("§b§lLunar§f§lPvP: §7Digite uma §bMSG");
        return true;
      }
      if (args.length > 1)
      {
        Player target = Bukkit.getPlayerExact(args[0]);
        if ((target == null) || (!(target instanceof Player)))
        {
          sender.sendMessage("§b§lLunar§f§lPvP: §7Jogador não §bENCONTRADO");
          return true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < args.length; i++) {
          sb.append(args[i] + " ");
        }
        String msg = sb.toString();
        target.sendMessage(String.format("§a >> %s §6enviou para voce §c>> §7%s", new Object[] { sender.getName(), msg }));
        sender.sendMessage(String.format("§b >> Voce para §a%s §c>> §7%s", new Object[] { target.getName(), msg }));
      }
    }
    return false;
  }
}
