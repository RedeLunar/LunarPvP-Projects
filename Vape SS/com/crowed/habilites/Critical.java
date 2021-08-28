/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.Random;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ 
/*    */ public class Critical implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void dano(EntityDamageByEntityEvent e)
/*    */   {
/* 17 */     if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player))) {
/* 18 */       Player p = (Player)e.getEntity();
/* 19 */       Player d = (Player)e.getDamager();
/* 20 */       if (KitAPI.getKit(d) == "Critical") {
/* 21 */         Random r = new Random();
/* 22 */         int c = r.nextInt(100);
/* 23 */         if (c <= 30) {
/* 24 */           e.setDamage(e.getDamage() + 4.0D);
/* 25 */           p.getWorld().playEffect(p.getLocation(), org.bukkit.Effect.STEP_SOUND, Material.LAVA, 100);
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Critical.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */