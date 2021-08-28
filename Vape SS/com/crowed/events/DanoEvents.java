/*    */ package com.crowed.events;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class DanoEvents implements org.bukkit.event.Listener
/*    */ {
/*    */   @org.bukkit.event.EventHandler
/*    */   public void DanoDasEspadas(EntityDamageByEntityEvent e)
/*    */   {
/* 13 */     if (((e.getDamager() instanceof Player)) && (((Player)e.getDamager() instanceof Player))) {
/* 14 */       Player p = (Player)e.getDamager();
/* 15 */       if (((e.getEntity() instanceof Player)) && (p.getItemInHand().getType() == Material.STONE_SWORD)) {
/* 16 */         e.setDamage(e.getDamage() * 0.6D);
/* 17 */         return;
/*    */       }
/* 19 */       if (p.getItemInHand().getType() == Material.WOOD_SWORD) {
/* 20 */         e.setDamage(e.getDamage() * 0.5D);
/* 21 */         return;
/*    */       }
/* 23 */       if (p.getItemInHand().getType() == Material.DIAMOND_SWORD) {
/* 24 */         e.setDamage(e.getDamage() * 0.7D);
/* 25 */         return;
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\DanoEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */