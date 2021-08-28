/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Bc
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 16 */     Player p = (Player)sender;
/* 17 */     if (p.hasPermission("cmd.bc")) {
/* 18 */       if ((command.getName().equalsIgnoreCase("bc")) || ((command.getName().equalsIgnoreCase("broadcast")) && (p.hasPermission("cmd.bc")))) {
/* 19 */         if (argumentos.length >= 1) {
/* 20 */           String bcast = "";
/* 21 */           for (int x = 0; x < argumentos.length; x++) {
/* 22 */             bcast = bcast + argumentos[x] + " ";
/*    */           }
/* 24 */           bcast = ChatColor.translateAlternateColorCodes('§', bcast).replaceAll("&", "§");
/* 25 */           Bukkit.broadcastMessage(ChatColor.DARK_RED + ChatColor.BOLD + "BROADCAST " + ChatColor.WHITE + "» " + ChatColor.GRAY + bcast);
/*    */         } else {
/* 27 */           sender.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /bc ou /broadcast <aviso>");
/*    */         }
/*    */       }
/*    */     } else {
/* 31 */       p.sendMessage(Strings.permissaocomando);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Bc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */