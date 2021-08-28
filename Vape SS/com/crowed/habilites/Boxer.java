/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Boxer implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void Bater(EntityDamageByEntityEvent e)
/*    */   {
/* 15 */     if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player))) {
/* 16 */       Player t = (Player)e.getDamager();
/* 17 */       if ((com.crowed.api.KitAPI.getKit(t) == "Boxer") && (t.getItemInHand().getType() == Material.QUARTZ)) {
/* 18 */         e.setDamage(e.getDamage() + 4.5D);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Boxer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */