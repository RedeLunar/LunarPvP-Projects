/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class ComprarVip
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 15 */     Player p = (Player)sender;
/*    */     
/*    */ 
/* 18 */     if (command.getName().equalsIgnoreCase("comprarvip")) {
/* 19 */       if (argumentos.length == 0) {
/* 20 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /comprarvip <VIP , MVP , PRO>");
/* 21 */         return;
/*    */       }
/* 23 */       if (argumentos.length == 1) {
/* 24 */         if (argumentos[0].equalsIgnoreCase("vip")) {
/* 25 */           p.sendMessage(" ");
/* 26 */           p.sendMessage(ChatColor.GRAY + "Para se tornar um " + ChatColor.GREEN + ChatColor.BOLD + "VIP" + ChatColor.GRAY + " do servidor .");
/* 27 */           p.sendMessage(ChatColor.GRAY + "Você precisa ir a Loja");
/* 28 */           p.sendMessage(ChatColor.GRAY + "Nesse Link: ");
/* 29 */           p.sendMessage(" ");
/* 30 */           p.sendMessage(ChatColor.GRAY + "INFO: " + ChatColor.GRAY + "Após a confirmação da compra um  " + ChatColor.RED + " ADMIN" + ChatColor.GRAY + " Irar setar sua TAG!");
/* 31 */           p.sendMessage(" ");
/* 32 */           return;
/*    */         }
/* 34 */         if (argumentos[0].equalsIgnoreCase("mvp")) {
/* 35 */           p.sendMessage(" ");
/* 36 */           p.sendMessage(ChatColor.GRAY + "Para se tornar um " + ChatColor.BLUE + ChatColor.BOLD + "MVP" + ChatColor.GRAY + " do servidor .");
/* 37 */           p.sendMessage(ChatColor.GRAY + "Você precisa ir a Loja");
/* 38 */           p.sendMessage(ChatColor.GRAY + "Nesse Link: ");
/* 39 */           p.sendMessage(" ");
/* 40 */           p.sendMessage(ChatColor.GRAY + "INFO: " + ChatColor.GRAY + "Após a confirmação da compra um  " + ChatColor.RED + " ADMIN" + ChatColor.GRAY + " Irar setar sua TAG!");
/* 41 */           p.sendMessage(" ");
/* 42 */           return;
/*    */         }
/* 44 */         if (argumentos[0].equalsIgnoreCase("pro")) {
/* 45 */           p.sendMessage(" ");
/* 46 */           p.sendMessage(ChatColor.GRAY + "Para se tornar um " + ChatColor.GOLD + ChatColor.BOLD + "PRO" + ChatColor.GRAY + " do servidor .");
/* 47 */           p.sendMessage(ChatColor.GRAY + "Você precisa ir a Loja");
/* 48 */           p.sendMessage(ChatColor.GRAY + "Nesse Link: ");
/* 49 */           p.sendMessage(" ");
/* 50 */           p.sendMessage(ChatColor.GRAY + "INFO: " + ChatColor.GRAY + "Após a confirmação da compra um  " + ChatColor.RED + " ADMIN" + ChatColor.GRAY + " Irar setar sua TAG!");
/* 51 */           p.sendMessage(" ");
/* 52 */           return;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\ComprarVip.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */