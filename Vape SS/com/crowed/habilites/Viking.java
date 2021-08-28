/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Viking implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void Bater(EntityDamageByEntityEvent e)
/*    */   {
/* 15 */     if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player))) {
/* 16 */       Player t = (Player)e.getDamager();
/* 17 */       if ((com.crowed.api.KitAPI.getKit(t) == "Viking") && (t.getItemInHand().getType() == Material.STONE_AXE)) {
/* 18 */         e.setDamage(e.getDamage() + 2.0D);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Viking.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */