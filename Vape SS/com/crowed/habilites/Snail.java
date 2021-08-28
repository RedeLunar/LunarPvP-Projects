/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.Random;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.potion.PotionEffect;
/*    */ import org.bukkit.potion.PotionEffectType;
/*    */ 
/*    */ public class Snail
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onPosion(EntityDamageByEntityEvent e)
/*    */   {
/* 18 */     if (((e.getDamager() instanceof Player)) && ((e.getEntity() instanceof Player))) {
/* 19 */       Player p = (Player)e.getEntity();
/* 20 */       Player d = (Player)e.getDamager();
/* 21 */       if (KitAPI.getKit(d) == "Snail") {
/* 22 */         Random r = new Random();
/* 23 */         int rand = r.nextInt(100);
/* 24 */         if (rand >= 67) {
/* 25 */           p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 80, 0));
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Snail.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */