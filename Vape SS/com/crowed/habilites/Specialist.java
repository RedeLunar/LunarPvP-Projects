/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Specialist implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onSpecialist(PlayerInteractEvent e)
/*    */   {
/* 15 */     Player p = e.getPlayer();
/* 16 */     if ((com.crowed.api.KitAPI.getKit(p) == "Specialist") && (p.getItemInHand().getType() == Material.ENCHANTED_BOOK)) {
/* 17 */       p.openEnchanting(p.getLocation(), true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Specialist.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */