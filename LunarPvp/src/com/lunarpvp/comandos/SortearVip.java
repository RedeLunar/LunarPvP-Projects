package com.lunarpvp.comandos;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import com.lunarpvp.main.Main;
import com.lunarpvp.managers.ListaVip;


public class SortearVip implements CommandExecutor {

 @Override
 public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
  if (sender.hasPermission("lunarpvp.sortearvip")) {

   final ArrayList < String > Vip = new ArrayList < > ();
   for (ListaVip s: ListaVip.values()) {
    if (!Vip.contains(s.name())) {
     Vip.add(s.name().toLowerCase());

    }

   }
   Bukkit.broadcastMessage("               §b§lLunar§f§lPvP         ");
   Bukkit.broadcastMessage("");
   Bukkit.broadcastMessage("          §fO Staff: §e" + sender.getName());
   Bukkit.broadcastMessage("          §fIniciou um sorteio de §a§lVIP");
   Bukkit.broadcastMessage("               §b§lLunar§f§lPvP            ");
   new BukkitRunnable() {

    @SuppressWarnings("deprecation")
    public void run() {
     ArrayList < Player > Players = new ArrayList < > ();

     for (Player all: Bukkit.getOnlinePlayers()) {
      if (!Players.contains(all)) {
       Players.add(all);
      }
     }

     Player random = Players.get(new Random().nextInt(Players.size()));
     Bukkit.broadcastMessage("               §b§lLunar§f§lPvP         ");
     Bukkit.broadcastMessage("");
     Bukkit.broadcastMessage("          §fSorteio de §a§lVIP §ffinalizado  ");
     Bukkit.broadcastMessage("");
     Random r = new Random();
     int x = r.nextInt(Vip.size());
     Bukkit.broadcastMessage("          §fGanhador: §e " + random.getName());
     Bukkit.broadcastMessage("          §fPacote ganho: §e" + Vip.get(x));
     Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + random.getName() + " group set " + Vip.get(x));
     Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm bc §fO Jogador: §e[" + random.getName() + "]§f{nl} §fVenceu o sorteio, VIP: §e[" + Vip.get(x)+ "]");
     
     random.sendMessage("§b§lLunar§f§lPvP: §7Parabens você ganhou o sorteio de §a§lVIP§7, vip ganho: §e" + Vip.get(x));



    }

   }.runTaskLater(Main.instance, 20 * 10);

  }
  return false;
 }

}