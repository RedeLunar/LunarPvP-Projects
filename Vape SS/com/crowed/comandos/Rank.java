/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Rank
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 14 */     Player p = (Player)sender;
/*    */     
/* 16 */     if ((command.getName().equalsIgnoreCase("rank")) && 
/* 17 */       (argumentos.length == 0)) {
/* 18 */       p.sendMessage(" ");
/* 19 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.AQUA + "✶" + ChatColor.GRAY + "]" + ChatColor.AQUA + " Legendary");
/* 20 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.DARK_RED + "✹" + ChatColor.GRAY + "]" + ChatColor.DARK_RED + " Supreme");
/* 21 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.LIGHT_PURPLE + "�?�" + ChatColor.GRAY + "]" + ChatColor.LIGHT_PURPLE + " Safira");
/* 22 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.DARK_PURPLE + "✸" + ChatColor.GRAY + "]" + ChatColor.DARK_PURPLE + " Elite");
/* 23 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.DARK_GREEN + "✠" + ChatColor.GRAY + "]" + ChatColor.DARK_GREEN + " Emerald");
/* 24 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.GOLD + "✶" + ChatColor.GRAY + "]" + ChatColor.GOLD + " Gold");
/* 25 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.BLUE + "�?�" + ChatColor.GRAY + "]" + ChatColor.BLUE + " Experient");
/* 26 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.RED + "✰" + ChatColor.GRAY + "]" + ChatColor.RED + " Ruby");
/* 27 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.DARK_AQUA + "☷" + ChatColor.GRAY + "]" + ChatColor.DARK_AQUA + " Expert");
/* 28 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.YELLOW + "☴" + ChatColor.GRAY + "]" + ChatColor.YELLOW + " Starter");
/* 29 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.GREEN + "☰" + ChatColor.GRAY + "]" + ChatColor.GREEN + " Apprentice");
/* 30 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.WHITE + "�?" + ChatColor.GRAY + "]" + ChatColor.WHITE + " Ranked");
/* 31 */       p.sendMessage(ChatColor.GRAY + "[" + ChatColor.WHITE + "⚊" + ChatColor.GRAY + "]" + ChatColor.WHITE + " Unranked");
/* 32 */       p.sendMessage(" ");
/* 33 */       p.sendMessage(ChatColor.GREEN + "Esse é o nosso sistema de Rank , você upará com xps , para conseguir esses Xps voçês terao que matar os jogadores , boa sorte !");
/* 34 */       p.sendMessage(" ");
/* 35 */       p.sendMessage(ChatColor.YELLOW + "Rank atual: " + Manager.RankAndPrefix(p));
/* 36 */       p.sendMessage(Manager.ProximoRank(p));
/* 37 */       p.sendMessage(Manager.ProximoPorXp(p));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Rank.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */