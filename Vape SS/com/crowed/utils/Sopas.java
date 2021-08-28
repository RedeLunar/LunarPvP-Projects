/*    */ package com.crowed.utils;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.block.Sign;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.SignChangeEvent;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Sopas implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void Escrever(SignChangeEvent e)
/*    */   {
/* 19 */     if (e.getLine(0).equalsIgnoreCase("sopas")) {
/* 20 */       e.setLine(0, "");
/* 21 */       e.setLine(1, "§c➜ §7Sopas");
/* 22 */       e.setLine(2, "§c➜ §7Sopas");
/* 23 */       e.setLine(3, "");
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void inv(PlayerInteractEvent e)
/*    */   {
/* 30 */     Player p = e.getPlayer();
/* 31 */     if ((e.getAction() == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK) && 
/* 32 */       (e.getClickedBlock() != null) && (
/* 33 */       (e.getClickedBlock().getType() == Material.WALL_SIGN) || (e.getClickedBlock().getType() == Material.SIGN_POST))) {
/* 34 */       Sign s = (Sign)e.getClickedBlock().getState();
/* 35 */       String[] lines = s.getLines();
/* 36 */       if ((lines.length > 0) && (lines[0].equals("")) && 
/* 37 */         (lines.length > 1) && (lines[1].equals("§c➜ §7Sopas")) && 
/* 38 */         (lines.length > 2) && (lines[2].equals("§c➜ §7Sopas")) && 
/* 39 */         (lines.length > 3) && (lines[3].equals(""))) {
/* 40 */         Inventory inv = org.bukkit.Bukkit.createInventory(p, 54, "§3§lSopas");
/*    */         
/* 42 */         ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/*    */         
/* 44 */         for (int i = 0; i != 54; i++) {
/* 45 */           inv.setItem(i, sopa);
/*    */         }
/* 47 */         p.openInventory(inv);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\utils\Sopas.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */