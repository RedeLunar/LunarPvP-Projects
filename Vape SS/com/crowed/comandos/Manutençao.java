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
/*    */ import org.bukkit.event.player.PlayerLoginEvent;
/*    */ import org.bukkit.event.player.PlayerLoginEvent.Result;
/*    */ 
/*    */ public class Manutençao implements Listener, CommandExecutor
/*    */ {
/* 17 */   public static boolean manutencao = false;
/*    */   
/*    */ 
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String lbl, String[] args)
/*    */   {
/* 22 */     Player p = (Player)sender;
/* 23 */     if (cmd.getName().equalsIgnoreCase("manutencao")) {
/* 24 */       if (!sender.hasPermission("cmd.manuteçao")) {
/* 25 */         p.sendMessage(Strings.permissaocomando);
/* 26 */         return true;
/*    */       }
/* 28 */       if (args.length == 0) {
/* 29 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "/manutencao <on , off>");
/* 30 */         return true;
/*    */       }
/* 32 */       if (args.length == 1) { Player[] arrayOfPlayer;
/* 33 */         int j; int i; if (args[0].equalsIgnoreCase("on")) {
/* 34 */           if (manutencao) {
/* 35 */             p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O Servidor ja esta em manutencao !");
/* 36 */             return true;
/*    */           }
/* 38 */           Bukkit.broadcastMessage(Strings.servidormensagem + ChatColor.GRAY + "O Servidor esta entrando em " + ChatColor.YELLOW + ChatColor.BOLD + "manutencao" + ChatColor.GRAY + "!");
/* 39 */           manutencao = true;
/* 40 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "manutencao esta sendo ativada ..");
/* 41 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "A Manuteçao foi ativada com sucesso !");
/* 42 */           j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (i = 0; i < j; i++) { Player todos = arrayOfPlayer[i];
/* 43 */             if (!sender.hasPermission("cmd.manutencao")) {
/* 44 */               todos.kickPlayer(Strings.servidor + "\n" + "\n" + "   §7O servidor acabou de entrar em manutencao" + "\n" + "Assim que possível, nós estaremos de volta!");
/* 45 */               return true;
/*    */             }
/*    */           }
/* 48 */           return true;
/*    */         }
/*    */         
/* 51 */         if (args[0].equalsIgnoreCase("on")) {
/* 52 */           if (manutencao) {
/* 53 */             p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O Servidor ja esta em manutencao !");
/* 54 */             return true;
/*    */           }
/* 56 */           Bukkit.broadcastMessage(Strings.servidormensagem + ChatColor.GRAY + "O Servidor esta entrando em " + ChatColor.YELLOW + ChatColor.BOLD + "manutencao" + ChatColor.GRAY + "!");
/* 57 */           manutencao = true;
/* 58 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "manutencao esta sendo ativada ..");
/* 59 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "A Manuteçao foi ativada com sucesso !");
/* 60 */           j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (i = 0; i < j; i++) { Player todos = arrayOfPlayer[i];
/* 61 */             if (!sender.hasPermission("cmd.manutencao")) {
/* 62 */               todos.kickPlayer(Strings.servidormensagem + "\n" + "\n" + "   §7O servidor acabou de entrar em manutencao" + "\n" + "Assim que possível, nós estaremos de volta!" + "\n" + "\n" + "§7Atenciosamente, " + Strings.servidormensagem);
/* 63 */               return true;
/*    */             }
/*    */           }
/* 66 */           return true;
/*    */         }
/*    */         
/* 69 */         if (args[0].equalsIgnoreCase("off")) {
/* 70 */           if (!manutencao) {
/* 71 */             p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O Servidor Não Está em manutencao!");
/* 72 */             return true;
/*    */           }
/* 74 */           manutencao = false;
/* 75 */           p.sendMessage("§cManutenção Desativada!");
/* 76 */           p.sendMessage("§cVoce desativou a Manutenção!");
/* 77 */           return true;
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 82 */     return false;
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void aoEntrarManutencao(PlayerLoginEvent e) {
/* 87 */     Player p = e.getPlayer();
/* 88 */     if ((manutencao) && (!p.hasPermission("entrar.manutencao"))) {
/* 89 */       e.disallow(PlayerLoginEvent.Result.KICK_OTHER, Strings.servidor + "\n" + "\n" + "   §7O servidor acabou de entrar em manutencao" + "\n" + "Assim que possível, nós estaremos de volta!" + "\n" + "\n" + "§7Atenciosamente, " + Strings.servidormensagem);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Manutençao.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */