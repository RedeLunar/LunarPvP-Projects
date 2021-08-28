/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.KitAPI;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerFishEvent;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Fisherman implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void NaoQuebrarOFisherman(PlayerInteractEvent e)
/*    */   {
/* 18 */     Player p = e.getPlayer();
/*    */     
/* 20 */     if ((p.getItemInHand().getType() == Material.FISHING_ROD) && (
/* 21 */       (e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK))) {
/* 22 */       p.getItemInHand().setDurability((short)0);
/* 23 */       p.updateInventory();
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void Pescar(PlayerFishEvent e)
/*    */   {
/* 30 */     Player p = e.getPlayer();
/* 31 */     if (((e.getCaught() instanceof Player)) && (KitAPI.getKit(p) == "Fisherman")) {
/* 32 */       Player t = (Player)e.getCaught();
/* 33 */       t.teleport(p);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Fisherman.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */