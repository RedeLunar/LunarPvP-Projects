/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.KitAPI;
/*    */ import org.bukkit.Effect;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.entity.Entity;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.entity.Snowball;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ 
/*    */ public class Switcher implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void snowball(EntityDamageByEntityEvent e)
/*    */   {
/* 19 */     if (((e.getDamager() instanceof Snowball)) && 
/* 20 */       ((e.getEntity() instanceof Player)))
/*    */     {
/* 22 */       Snowball s = (Snowball)e.getDamager();
/* 23 */       if ((s.getShooter() instanceof Player))
/*    */       {
/* 25 */         Player shooter = (Player)s.getShooter();
/* 26 */         if (KitAPI.getKit(shooter) == "Switcher")
/*    */         {
/* 28 */           org.bukkit.Location shooterLoc = shooter.getLocation();
/* 29 */           shooter.teleport(e.getEntity().getLocation());
/* 30 */           e.getEntity().teleport(shooterLoc);
/* 31 */           shooter.getPlayer().getWorld().playEffect(shooterLoc, Effect.ENDER_SIGNAL, 10);
/* 32 */           shooter.getPlayer().getWorld().playEffect(shooterLoc, Effect.EXTINGUISH, 10);
/* 33 */           shooter.getWorld().playSound(shooter.getLocation(), Sound.ENDERMAN_TELEPORT, 1.0F, 1.2F);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Switcher.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */