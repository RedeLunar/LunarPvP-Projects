/*    */ package com.crowed.events;
/*    */ 
/*    */ import com.crowed.utils.ImortalEnum;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Proteção
/*    */   implements Listener
/*    */ {
/* 17 */   private static HashMap<Player, ImortalEnum> imortal = new HashMap();
/*    */   
/*    */   @EventHandler
/* 20 */   public void dano(EntityDamageEvent e) { if (((e.getEntity() instanceof Player)) && (e.getCause() != EntityDamageEvent.DamageCause.LAVA)) {
/* 21 */       Player p = (Player)e.getEntity();
/* 22 */       if (isImortal(p))
/* 23 */         e.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void entityDamage(EntityDamageByEntityEvent e) {
/* 29 */     Player d = (Player)e.getEntity();
/* 30 */     if ((e.getCause() == EntityDamageEvent.DamageCause.FALL) && 
/* 31 */       (isImortal(d))) {
/* 32 */       e.setCancelled(true);
/*    */     }
/* 34 */     if ((e.getDamager() instanceof Player)) {
/* 35 */       Player p = (Player)e.getDamager();
/* 36 */       if (isImortal(p)) {
/* 37 */         e.setCancelled(true);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static ImortalEnum getImortal(Player p)
/*    */   {
/* 44 */     return (ImortalEnum)imortal.get(p);
/*    */   }
/*    */   
/*    */   public static boolean isImortal(Player p)
/*    */   {
/* 49 */     if (getImortal(p) == ImortalEnum.ON) {
/* 50 */       return true;
/*    */     }
/* 52 */     return false;
/*    */   }
/*    */   
/*    */   public static void setImortalidade(Player p, boolean i)
/*    */   {
/* 57 */     if (i) {
/* 58 */       imortal.put(p, ImortalEnum.ON);
/*    */     } else {
/* 60 */       imortal.put(p, ImortalEnum.OFF);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\Proteção.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */