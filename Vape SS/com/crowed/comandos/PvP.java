/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.events.Proteção;
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
/*    */ 
/*    */ public class PvP
/*    */   implements CommandExecutor, Listener
/*    */ {
/* 18 */   public static boolean pvp = false;
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 22 */     Player p = (Player)sender;
/* 23 */     if (cmd.getName().equalsIgnoreCase("pvp")) {
/* 24 */       if (p.hasPermission("cmd.pvp")) {
/* 25 */         if (args.length == 0) {
/* 26 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /pvp <ON , OFF>");
/* 27 */           return true;
/*    */         }
/* 29 */         if ((args.length == 1) && 
/* 30 */           (args[0].equalsIgnoreCase("on"))) {
/* 31 */           if (pvp) {
/* 32 */             p.sendMessage(ChatColor.GREEN + "O pvp já está ativado!");
/* 33 */             return true;
/*    */           }
/* 35 */           pvp = true;
/* 36 */           p.sendMessage(ChatColor.GREEN + "Você ativou o pvp!");
/* 37 */           Bukkit.broadcastMessage(ChatColor.GREEN + "O PvP global foi Ativado !");
/* 38 */           return true;
/*    */         }
/*    */         
/* 41 */         if (args[0].equalsIgnoreCase("off")) {
/* 42 */           if (!pvp) {
/* 43 */             p.sendMessage(ChatColor.RED + "O PvP já está desativado!");
/* 44 */             return true;
/*    */           }
/* 46 */           pvp = false;
/* 47 */           Proteção.setImortalidade(p, false);
/* 48 */           p.sendMessage(ChatColor.RED + "Você desativou o pvp!");
/* 49 */           Bukkit.broadcastMessage(ChatColor.RED + "O PvP global foi Desativado !");
/* 50 */           return true;
/*    */         }
/*    */       } else {
/* 53 */         p.sendMessage(Strings.permissaocomando);
/*    */       }
/*    */     }
/* 56 */     return false;
/*    */   }
/*    */   
/*    */   @EventHandler
/* 60 */   public void onDamage(EntityDamageByEntityEvent e) { if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player)) && 
/* 61 */       (!pvp)) {
/* 62 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\PvP.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */