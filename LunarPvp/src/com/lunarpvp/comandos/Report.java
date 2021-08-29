package com.lunarpvp.comandos;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.lunarpvp.main.Main;



public class Report
  implements CommandExecutor
{
	
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	public ArrayList<String> reported = new ArrayList();
	  
	  
  private Main plugin;
  
  public Report(Main plugin)
  {
    this.plugin = plugin;
  }
  
  @SuppressWarnings("deprecation")
public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    final Player p = (Player)sender;
    if (!(sender instanceof Player))
    {
      sender.sendMessage("§cVocê Não Pode usar isso No Console!");
      return false;
    }
    if (commandLabel.equalsIgnoreCase("report")) {
      if (args.length >= 2)
      {
        Player target = p.getServer().getPlayer(args[0]);
        if (target != null)
        {
          if (this.reported.contains(p.getName()))
          {
            p.sendMessage("§b§lLunar§f§lPvP: §7Aguarde para reportar novamente!");
            return true;
          }
          String reportMsg = StringUtils.join(
            Arrays.copyOfRange(args, 1, args.length), " ");
          this.reported.add(p.getName());
          Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§b[REPORT]{nl} §fVocê reportou um §aPLAYER");
          Player[] arrayOfPlayer;
          int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
          for (int i = 0; i < j; i++)
          {
            Player s = arrayOfPlayer[i];
            if (s.hasPermission("lunarpvp.report"))
            {
              s.playSound(s.getLocation(), Sound.ANVIL_USE, 15.0F, 1.0F);
              s.sendMessage("      §c§lDENUNCIA     ");
              s.sendMessage("");
              s.sendMessage("§fAcusado: §e" + target.getName());
              s.sendMessage("§fMotivo: §e" + reportMsg);
              s.sendMessage("§fVitima: §e" + p.getName());
              Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + s.getName() + " §b[REPORT]{nl} §fNova denuncia §aABERTA");
              Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
              {

                public void run()
                {
                  Report.this.reported.remove(p.getName());
                }
              }, 300L);
            }
          }
        }
        else
        {
          p.sendMessage("§b§lLunar§f§lPvP: §7Jogador não §bENCONTRADO");
        }
      }
      else
      {
        p.sendMessage("§b§lLunar§f§lPvP: §7Use isso corretamente: §e/report (nick) (motivo)");
      }
    }
    return false;
  }
}
