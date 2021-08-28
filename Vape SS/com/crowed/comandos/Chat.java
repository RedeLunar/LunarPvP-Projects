/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.AsyncPlayerChatEvent;
/*    */ import org.bukkit.event.player.PlayerChatEvent;
/*    */ 
/*    */ public class Chat implements Listener, CommandExecutor
/*    */ {
/* 17 */   public static boolean onoff = true;
/*    */   
/*    */   @EventHandler
/*    */   public void onPlayerChat(AsyncPlayerChatEvent e)
/*    */   {
/* 22 */     if ((!e.getPlayer().hasPermission("falar.chat")) && (!onoff)) {
/* 23 */       e.setCancelled(true);
/* 24 */       e.getPlayer().sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O Chat esta desativado !");
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onPlayeronoff(PlayerChatEvent e)
/*    */   {
/* 31 */     if ((!e.getPlayer().hasPermission("falar.chat")) && (!onoff)) {
/* 32 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
/* 37 */     Player p = (Player)sender;
/* 38 */     if (cmd.getName().equalsIgnoreCase("chat")) {
/* 39 */       if (sender.hasPermission("cmd.chat")) {
/* 40 */         if (args.length == 0) {
/* 41 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /chat <on , off , clear>");
/*    */         }
/* 43 */         if ((args.length > 0) && 
/* 44 */           (args.length == 1)) {
/* 45 */           if (args[0].equalsIgnoreCase("off")) {
/* 46 */             onoff = false;
/* 47 */             Bukkit.broadcastMessage(Strings.servidormensagem + ChatColor.GRAY + "O Chat foi " + ChatColor.RED + ChatColor.BOLD + "Desativado" + ChatColor.GRAY + " !");
/*    */           }
/* 49 */           else if (args[0].equalsIgnoreCase("on")) {
/* 50 */             onoff = true;
/* 51 */             Bukkit.broadcastMessage(Strings.servidormensagem + ChatColor.GRAY + "O Chat foi " + ChatColor.GREEN + ChatColor.BOLD + "Ativado" + ChatColor.GRAY + " !");
/*    */           }
/* 53 */           if (args[0].equalsIgnoreCase("clear")) {
/* 54 */             for (int i = 1; i < 100; i++) {
/* 55 */               Bukkit.broadcastMessage(" ");
/*    */             }
/* 57 */             p.sendMessage(ChatColor.GREEN + "Chat foi limpo com sucesso !");
/*    */           }
/*    */         }
/*    */       }
/*    */       else {
/* 62 */         sender.sendMessage(Strings.permissaocomando);
/*    */       }
/*    */     } else {
/* 65 */       sender.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /chat <on , off>");
/*    */     }
/* 67 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Chat.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */