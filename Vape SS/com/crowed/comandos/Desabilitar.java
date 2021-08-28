/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Desabilitar
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] argumentos)
/*    */   {
/* 16 */     Player p = (Player)sender;
/*    */     
/* 18 */     if (command.getName().equalsIgnoreCase("desabilitar")) {
/* 19 */       if (!p.hasPermission("cmd.desabilitar")) {
/* 20 */         p.sendMessage(Strings.permissaocomando);
/* 21 */         return true;
/*    */       }
/* 23 */       if (argumentos.length == 0) {
/* 24 */         p.sendMessage(ChatColor.GRAY + "Use /desabilitar <VIP , PRO, MVP, FULLKIT>");
/* 25 */         return true;
/*    */       }
/* 27 */       if (argumentos[0].equalsIgnoreCase("fullkit"))
/*    */       {
/* 29 */         if (!Habilitar.fullkit) {
/* 30 */           p.sendMessage(ChatColor.RED + "O Fullkit nao esta Habilitado !");
/*    */         } else {
/* 32 */           p.sendMessage(ChatColor.GRAY + "Voce removeu o fullkit para todos !");
/* 33 */           Bukkit.broadcastMessage(ChatColor.GRAY + "O Beneficio " + ChatColor.GOLD + "[" + ChatColor.YELLOW + ChatColor.BOLD + " FULLKIT " + ChatColor.GOLD + "]" + ChatColor.GRAY + " foi removido para todos !");
/* 34 */           Habilitar.fullkit = false;
/* 35 */           return true;
/*    */         }
/*    */       }
/* 38 */       if (argumentos[0].equalsIgnoreCase("vip")) {
/* 39 */         if (!Habilitar.vip) {
/* 40 */           p.sendMessage(ChatColor.RED + "O Vip nao esta Habilitado");
/* 41 */           return true;
/*    */         }
/* 43 */         p.sendMessage(ChatColor.GREEN + "Você desabilitou o FullKit para todos .");
/* 44 */         Bukkit.broadcastMessage(ChatColor.YELLOW + "O Vip Foi desabilitado para todos !");
/* 45 */         Habilitar.vip = false;
/* 46 */         return true;
/*    */       }
/*    */       
/* 49 */       if (argumentos[0].equalsIgnoreCase("pro")) {
/* 50 */         if (!Habilitar.pro) {
/* 51 */           p.sendMessage(ChatColor.RED + "O Pro nao esta Habilitado");
/* 52 */           return true;
/*    */         }
/* 54 */         p.sendMessage(ChatColor.GREEN + "Você desabilitou o FullKit para todos .");
/* 55 */         Bukkit.broadcastMessage(ChatColor.YELLOW + "O Pro Foi desabilitado para todos !");
/* 56 */         Habilitar.pro = false;
/* 57 */         return true;
/*    */       }
/*    */       
/* 60 */       if (argumentos[0].equalsIgnoreCase("mvp")) {
/* 61 */         if (!Habilitar.mvp) {
/* 62 */           p.sendMessage(ChatColor.RED + "O Mvp nao esta Habilitado");
/* 63 */           return true;
/*    */         }
/* 65 */         p.sendMessage(ChatColor.GREEN + "Você desabilitou o Mvp para todos .");
/* 66 */         Bukkit.broadcastMessage(ChatColor.YELLOW + "O Mvp Foi desabilitado para todos !");
/* 67 */         Habilitar.mvp = false;
/* 68 */         return true;
/*    */       }
/*    */       
/* 71 */       if (argumentos.length == 0) {
/* 72 */         p.sendMessage(ChatColor.GRAY + "Use /desabilitar <VIP , PRO, MVP, FULLKIT>");
/* 73 */         return true;
/*    */       }
/*    */     }
/*    */     
/* 77 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Desabilitar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */