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
/*    */ public class Habilitar
/*    */   implements CommandExecutor
/*    */ {
/*    */   public static boolean fullkit;
/*    */   public static boolean vip;
/*    */   public static boolean pro;
/*    */   public static boolean mvp;
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] argumentos)
/*    */   {
/* 21 */     Player p = (Player)sender;
/*    */     
/* 23 */     if (command.getName().equalsIgnoreCase("habilitar")) {
/* 24 */       if (!p.hasPermission("cmd.habilitar")) {
/* 25 */         p.sendMessage(Strings.permissaocomando);
/* 26 */         return true;
/*    */       }
/* 28 */       if (argumentos.length == 0) {
/* 29 */         p.sendMessage(ChatColor.GRAY + "Use /habilitar <VIP , PRO, MVP, FULLKIT>");
/* 30 */         return true;
/*    */       }
/* 32 */       if (argumentos[0].equalsIgnoreCase("fullkit")) {
/* 33 */         if (fullkit) {
/* 34 */           p.sendMessage(ChatColor.RED + "O FullKit ja esta habilitado");
/* 35 */           return true;
/*    */         }
/* 37 */         p.sendMessage(ChatColor.GREEN + "Você habilitou o FullKit para todos .");
/* 38 */         Bukkit.broadcastMessage(ChatColor.YELLOW + "O FullKit Foi habilitado para todos , Aproveitem ..");
/* 39 */         fullkit = true;
/* 40 */         return true;
/*    */       }
/*    */       
/* 43 */       if (argumentos[0].equalsIgnoreCase("vip")) {
/* 44 */         if (vip) {
/* 45 */           p.sendMessage(ChatColor.RED + "O Vip ja esta habilitado.");
/* 46 */           return true;
/*    */         }
/* 48 */         p.sendMessage(ChatColor.GREEN + "Você habilitou o Vip para todos .");
/* 49 */         Bukkit.broadcastMessage(ChatColor.YELLOW + "O Vip Foi habilitado para todos , Aproveitem ..");
/* 50 */         vip = true;
/* 51 */         return true;
/*    */       }
/*    */       
/* 54 */       if (argumentos[0].equalsIgnoreCase("pro")) {
/* 55 */         if (pro) {
/* 56 */           p.sendMessage(ChatColor.RED + "O Pro ja esta habilitado.");
/* 57 */           return true;
/*    */         }
/* 59 */         p.sendMessage(ChatColor.GREEN + "Você habilitou o FullKit para todos .");
/* 60 */         Bukkit.broadcastMessage(ChatColor.YELLOW + "O Pro Foi habilitado para todos , Aproveitem ..");
/* 61 */         pro = true;
/* 62 */         return true;
/*    */       }
/*    */       
/* 65 */       if (argumentos[0].equalsIgnoreCase("mvp")) {
/* 66 */         if (mvp) {
/* 67 */           p.sendMessage(ChatColor.RED + "O Mvp ja esta habilitado.");
/* 68 */           return true;
/*    */         }
/* 70 */         p.sendMessage(ChatColor.GREEN + "Você habilitou o Mvp para todos .");
/* 71 */         Bukkit.broadcastMessage(ChatColor.YELLOW + "O Mvp Foi habilitado para todos , Aproveitem ..");
/* 72 */         mvp = true;
/* 73 */         return true;
/*    */       }
/*    */       
/* 76 */       if (argumentos.length == 0) {
/* 77 */         p.sendMessage(ChatColor.GRAY + "Use /habilitar <VIP , PRO, MVP, FULLKIT>");
/* 78 */         return true;
/*    */       }
/*    */     }
/*    */     
/* 82 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Habilitar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */