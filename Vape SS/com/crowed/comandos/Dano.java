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
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ 
/*    */ 
/*    */ public class Dano
/*    */   implements CommandExecutor, Listener
/*    */ {
/* 19 */   public static boolean Dano = false;
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] argumentos)
/*    */   {
/* 23 */     Player p = (Player)sender;
/*    */     
/* 25 */     if (p.hasPermission("cover.dano")) {
/* 26 */       if (command.getName().equalsIgnoreCase("dano")) {
/* 27 */         if (argumentos.length == 0) {
/* 28 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /dano <ON , OFF>");
/* 29 */           return true;
/*    */         }
/* 31 */         if (argumentos[0].equalsIgnoreCase("on")) {
/* 32 */           if (Dano) {
/* 33 */             p.sendMessage(ChatColor.GREEN + "O Dano ja esta ativado !");
/* 34 */             return true;
/*    */           }
/* 36 */           Dano = true;
/* 37 */           p.sendMessage(ChatColor.GREEN + "Você ativou o dano !");
/* 38 */           Bukkit.broadcastMessage(ChatColor.GREEN + "O Dano do servidor Foi desativado !");
/* 39 */           return true;
/*    */         }
/* 41 */         if (argumentos[0].equalsIgnoreCase("off")) {
/* 42 */           if (!Dano) {
/* 43 */             p.sendMessage(ChatColor.RED + "O Dano ja esta desativado !");
/*    */           }
/* 45 */           Dano = false;
/* 46 */           p.sendMessage(ChatColor.RED + "Você desativou o dano !");
/* 47 */           Bukkit.broadcastMessage(ChatColor.RED + "O Dano do servidor Foi desativado !");
/* 48 */           return true;
/*    */         }
/*    */       }
/*    */     } else {
/* 52 */       p.sendMessage(Strings.permissaocomando);
/* 53 */       return true;
/*    */     }
/* 55 */     return false;
/*    */   }
/*    */   
/*    */   @EventHandler
/* 59 */   public void onDamage(EntityDamageByEntityEvent e) { if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player)) && 
/* 60 */       (!Dano)) {
/* 61 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void aoDano(EntityDamageEvent e) {
/* 67 */     if (((e.getEntity() instanceof Player)) && 
/* 68 */       (!Dano)) {
/* 69 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Dano.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */