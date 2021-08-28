/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Youtuber
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 15 */     Player p = (Player)sender;
/*    */     
/*    */ 
/* 18 */     if (command.getName().equalsIgnoreCase("youtuber")) {
/* 19 */       if (argumentos.length == 0) {
/* 20 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /youtuber <YT , YT+ , SEMIYT>");
/* 21 */         return;
/*    */       }
/* 23 */       if (argumentos.length == 1) {
/* 24 */         if (argumentos[0].equalsIgnoreCase("yt")) {
/* 25 */           p.sendMessage(" ");
/* 26 */           p.sendMessage(ChatColor.GRAY + "Para se tornar um " + ChatColor.AQUA + ChatColor.BOLD + "YOUTUBER" + ChatColor.GRAY + " do servidor .");
/* 27 */           p.sendMessage(ChatColor.GRAY + "Você precisa ter pelo menos 500 Subs !");
/* 28 */           p.sendMessage(ChatColor.GRAY + "E Tambem ter 50 likes em nosso video !");
/* 29 */           p.sendMessage(" ");
/* 30 */           p.sendMessage(ChatColor.GRAY + "INFO: " + ChatColor.GRAY + "Mande seu video para um cargo superior que " + ChatColor.DARK_PURPLE + "MOD" + ChatColor.GRAY + "!");
/* 31 */           p.sendMessage(" ");
/* 32 */           return;
/*    */         }
/* 34 */         if (argumentos[0].equalsIgnoreCase("yt+")) {
/* 35 */           p.sendMessage(" ");
/* 36 */           p.sendMessage(ChatColor.GRAY + "Para se tornar um " + ChatColor.DARK_AQUA + ChatColor.BOLD + "YOUTUBER+" + ChatColor.GRAY + " do servidor .");
/* 37 */           p.sendMessage(ChatColor.GRAY + "Você precisa ter pelo menos 1k Subs !");
/* 38 */           p.sendMessage(ChatColor.GRAY + "E Tambem ter 80 likes em nosso video !");
/* 39 */           p.sendMessage(" ");
/* 40 */           p.sendMessage(ChatColor.GRAY + "INFO: " + ChatColor.GRAY + "Mande seu video para um cargo superior que " + ChatColor.DARK_PURPLE + "MOD" + ChatColor.GRAY + "!");
/* 41 */           p.sendMessage(" ");
/* 42 */           return;
/*    */         }
/* 44 */         if (argumentos[0].equalsIgnoreCase("semiyt")) {
/* 45 */           p.sendMessage(" ");
/* 46 */           p.sendMessage(ChatColor.GRAY + "Para se tornar um " + ChatColor.GOLD + ChatColor.BOLD + "SEMI-YT" + ChatColor.GRAY + " do servidor .");
/* 47 */           p.sendMessage(ChatColor.GRAY + "Você precisa ter pelo menos 300 Subs !");
/* 48 */           p.sendMessage(ChatColor.GRAY + "E Tambem ter 35 likes em seu video !");
/* 49 */           p.sendMessage(" ");
/* 50 */           p.sendMessage(ChatColor.GRAY + "INFO: " + ChatColor.GRAY + "Mande seu video para um cargo superior que " + ChatColor.DARK_PURPLE + "MOD" + ChatColor.GRAY + "!");
/* 51 */           p.sendMessage(" ");
/* 52 */           return;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Youtuber.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */