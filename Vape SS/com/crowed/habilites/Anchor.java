/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.KitAPI;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ public class Anchor implements Listener
/*    */ {
/*    */   @EventHandler(priority=EventPriority.MONITOR)
/*    */   public void onPlayerHitAnchor(EntityDamageByEntityEvent e)
/*    */   {
/* 21 */     if (!(e.getEntity() instanceof Player)) {
/* 22 */       return;
/*    */     }
/* 24 */     if (!(e.getDamager() instanceof Player)) {
/* 25 */       return;
/*    */     }
/* 27 */     final Player p = (Player)e.getEntity();
/* 28 */     Player a = (Player)e.getDamager();
/* 29 */     if (KitAPI.getKit(p).equalsIgnoreCase("anchor")) {
/* 30 */       p.setVelocity(new Vector());
/* 31 */       p.playSound(p.getLocation(), Sound.ANVIL_BREAK, 4.0F, 4.0F);
/* 32 */       Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable() {
/*    */         public void run() {
/* 34 */           p.setVelocity(new Vector());
/*    */         }
/*    */         
/* 37 */       }, 1L);
/*    */     }
/* 39 */     if (KitAPI.getKit(a).equalsIgnoreCase("anchor"))
/*    */     {
/* 41 */       a.playSound(a.getLocation(), Sound.ANVIL_BREAK, 4.0F, 4.0F);
/* 42 */       p.setVelocity(new Vector());
/* 43 */       Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*    */       {
/*    */         public void run()
/*    */         {
/* 47 */           p.setVelocity(new Vector());
/*    */         }
/*    */         
/*    */ 
/* 51 */       }, 1L);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Anchor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */