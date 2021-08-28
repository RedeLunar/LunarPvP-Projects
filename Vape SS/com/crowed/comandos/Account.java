/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.api.StatsManager;
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Account
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 17 */     Player p = (Player)sender;
/*    */     
/* 19 */     if ((command.getName().equalsIgnoreCase("account")) || (command.getName().equalsIgnoreCase("acc"))) {
/* 20 */       if (argumentos.length == 0) {
/* 21 */         p.sendMessage(" ");
/* 22 */         p.sendMessage(ChatColor.GRAY + "UUID da sua conta: " + ChatColor.YELLOW + p.getUniqueId());
/* 23 */         p.sendMessage(" ");
/* 24 */         p.sendMessage(ChatColor.GRAY + "Nick: " + ChatColor.YELLOW + p.getName());
/* 25 */         p.sendMessage(ChatColor.GRAY + "Grupo: " + ChatColor.YELLOW + GrupoJoin(p));
/* 26 */         p.sendMessage(ChatColor.GRAY + "Rank:  " + ChatColor.YELLOW + RankAndPrefix(p));
/* 27 */         p.sendMessage(ChatColor.GRAY + "Xp:  " + ChatColor.YELLOW + StatsManager.getXp(p));
/* 28 */         p.sendMessage(ChatColor.GRAY + "Coins:  " + ChatColor.YELLOW + StatsManager.getCoins(p));
/* 29 */         p.sendMessage(" ");
/*    */       }
/* 31 */       if (argumentos.length == 1) {
/* 32 */         Player player = Bukkit.getPlayer(argumentos[0]);
/* 33 */         if (player == null) {
/* 34 */           p.sendMessage(Strings.playeroffiline);
/* 35 */           return;
/*    */         }
/* 37 */         p.sendMessage(" ");
/* 38 */         p.sendMessage(ChatColor.GRAY + "UUID da sua conta: " + ChatColor.YELLOW + player.getUniqueId());
/* 39 */         p.sendMessage(" ");
/* 40 */         p.sendMessage(ChatColor.GRAY + "Nick: " + ChatColor.YELLOW + player.getName());
/* 41 */         p.sendMessage(ChatColor.GRAY + "Grupo: " + ChatColor.YELLOW + GrupoJoin(player));
/* 42 */         p.sendMessage(ChatColor.GRAY + "Rank:  " + ChatColor.YELLOW + RankAndPrefix(player));
/* 43 */         p.sendMessage(ChatColor.GRAY + "Xp:  " + ChatColor.YELLOW + StatsManager.getXp(player));
/* 44 */         p.sendMessage(ChatColor.GRAY + "Coins:  " + ChatColor.YELLOW + StatsManager.getCoins(player));
/* 45 */         p.sendMessage(" ");
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Account.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */