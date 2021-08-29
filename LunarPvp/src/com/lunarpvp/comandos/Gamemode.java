package com.lunarpvp.comandos;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode
  implements CommandExecutor
{

public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§bPrecisa ser um Player para usar esse comando");
			return true;
		}
    Player player = (Player)sender;
    if ((cmd.getName().equalsIgnoreCase("gm")) || (cmd.getName().equalsIgnoreCase("gamemode"))) {
      if (player.hasPermission("lunarpvp.gamemode"))
      {
        if (args.length != 1)
        {
          player.sendMessage("§b§lLunar§f§lPvP: §7Use isso corretamente: §e/gm 1/0 ou /gamemode 1/0");
          return true;
        }
        if (args.length == 1)
        {
          if (args[0].equalsIgnoreCase("0"))
          {
            player.setGameMode(GameMode.SURVIVAL);
            player.sendMessage("§b§lLunar§f§lPvP: §7Modo de jogo alterado para §c§lSURVIVAL");
          }
          if (args[0].equalsIgnoreCase("1"))
          {
            player.setGameMode(GameMode.CREATIVE);
            player.sendMessage("§b§lLunar§f§lPvP: §7Modo de jogo alterado para §b§lCREATIVE");

            {
              }
            }
          }
        }
    
      else
      {
        player.sendMessage("§b§lLunar§f§lPvP: §7Você não possui permissão suficiente!");
      }
    }
    return false;
  }
}
