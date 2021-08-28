/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.KitAPI;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
/*    */ import org.bukkit.event.player.PlayerMoveEvent;
/*    */ 
/*    */ public class Magma implements org.bukkit.event.Listener
/*    */ {
/*    */   public static Main plugin;
/*    */   
/*    */   public Magma(Main main)
/*    */   {
/* 18 */     plugin = main;
/*    */   }
/*    */   
/*    */ 
/*    */   public Magma() {}
/*    */   
/*    */   @EventHandler
/*    */   public void viperEvent(EntityDamageByEntityEvent event)
/*    */   {
/* 27 */     if ((!(event.getEntity() instanceof Player)) || 
/* 28 */       (!(event.getDamager() instanceof Player))) {
/* 29 */       return;
/*    */     }
/* 31 */     Player player = (Player)event.getDamager();
/* 32 */     Player player1 = (Player)event.getEntity();
/* 33 */     if (KitAPI.getKit(player) != "Magma") {
/* 34 */       return;
/*    */     }
/* 36 */     if ((Math.random() > 0.4D) && (Math.random() < 0.1D))
/* 37 */       player1.setFireTicks(100);
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onPlayerMove(PlayerMoveEvent event1) {
/* 42 */     Player player11 = event1.getPlayer();
/* 43 */     if ((KitAPI.getKit(player11) == "Magma'") && (
/* 44 */       (player11.getLocation().getBlock().getType() == org.bukkit.Material.WATER) || (player11.getLocation().getBlock().getType() == org.bukkit.Material.STATIONARY_WATER))) {
/* 45 */       player11.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.POISON, 65, 0));
/* 46 */       player11.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.SLOW, 65, 0));
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void damage(EntityDamageEvent e)
/*    */   {
/* 53 */     if ((e.getEntity() instanceof Player)) {
/* 54 */       Player p = (Player)e.getEntity();
/* 55 */       if ((KitAPI.getKit(p) == "Magma") && (
/* 56 */         (e.getCause() == EntityDamageEvent.DamageCause.LAVA) || 
/* 57 */         (e.getCause() == EntityDamageEvent.DamageCause.FIRE) || 
/* 58 */         (e.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK))) {
/* 59 */         e.setCancelled(true);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Magma.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */