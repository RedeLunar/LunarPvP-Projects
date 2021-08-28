/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import net.minecraft.server.v1_7_R4.EntityPlayer;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Ping
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 17 */     if (command.getName().equalsIgnoreCase("ping")) {
/* 18 */       Player p = (Player)sender;
/* 19 */       if ((sender instanceof Player)) {
/* 20 */         int ping = ((CraftPlayer)p).getHandle().ping;
/* 21 */         if (argumentos.length == 0) {
/* 22 */           p.sendMessage(ChatColor.GREEN + "Seu ping atual é: " + ping + " ms");
/* 23 */           return;
/*    */         }
/* 25 */         if (argumentos.length == 1) {
/* 26 */           Player k = Bukkit.getPlayer(argumentos[0]);
/* 27 */           if (k == null) {
/* 28 */             p.sendMessage(ChatColor.RED + "Esse jogador se encontra Offiline !");
/* 29 */             return;
/*    */           }
/* 31 */           int ping2 = ((CraftPlayer)k).getHandle().ping;
/* 32 */           p.sendMessage(ChatColor.GREEN + "Ping atual de " + k.getName() + " é: " + ping2 + " ms");
/* 33 */           return;
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Ping.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */