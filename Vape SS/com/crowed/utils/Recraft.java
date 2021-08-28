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
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ public class Recraft implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void Escrever(SignChangeEvent e)
/*    */   {
/* 20 */     if (e.getLine(0).equalsIgnoreCase("recraft")) {
/* 21 */       e.setLine(0, "");
/* 22 */       e.setLine(1, "§c➜ §7Recraft");
/* 23 */       e.setLine(2, "§c➜ §7Recraft");
/* 24 */       e.setLine(3, "");
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void Inv(PlayerInteractEvent e)
/*    */   {
/* 31 */     Player p = e.getPlayer();
/* 32 */     if ((e.getAction() == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK) && (((e.getClickedBlock() != null) && (e.getClickedBlock().getType() == Material.WALL_SIGN)) || 
/* 33 */       (e.getClickedBlock().getType() == Material.SIGN_POST))) {
/* 34 */       Sign s = (Sign)e.getClickedBlock().getState();
/* 35 */       String[] lines = s.getLines();
/* 36 */       if ((lines.length > 0) && (lines[0].equals("")) && 
/* 37 */         (lines.length > 1) && (lines[1].equals("§c➜ §7Recraft")) && 
/* 38 */         (lines.length > 2) && (lines[2].equals("§c➜ §7Recraft")) && 
/* 39 */         (lines.length > 3) && (lines[3].equals(""))) {
/* 40 */         Inventory inv = org.bukkit.Bukkit.createInventory(p, 27, "§3§lRecraft");
/* 41 */         ItemStack cogu1 = new ItemStack(Material.RED_MUSHROOM, 64);
/* 42 */         ItemMeta cogu1meta = cogu1.getItemMeta();
/* 43 */         cogu1meta.setDisplayName("");
/* 44 */         cogu1.setItemMeta(cogu1meta);
/*    */         
/* 46 */         ItemStack cogu2 = new ItemStack(Material.BROWN_MUSHROOM, 64);
/* 47 */         ItemMeta cogu2meta = cogu2.getItemMeta();
/* 48 */         cogu2meta.setDisplayName("");
/* 49 */         cogu2.setItemMeta(cogu2meta);
/*    */         
/* 51 */         ItemStack potes = new ItemStack(Material.BOWL, 64);
/* 52 */         ItemMeta potesmeta = potes.getItemMeta();
/* 53 */         potesmeta.setDisplayName("");
/* 54 */         potes.setItemMeta(potesmeta);
/*    */         
/* 56 */         inv.setItem(0, cogu2);
/* 57 */         inv.setItem(1, potes);
/* 58 */         inv.setItem(2, cogu1);
/* 59 */         inv.setItem(5, cogu1);
/* 60 */         inv.setItem(4, potes);
/* 61 */         inv.setItem(3, cogu2);
/* 62 */         inv.setItem(6, cogu2);
/* 63 */         inv.setItem(7, potes);
/* 64 */         inv.setItem(8, cogu1);
/* 65 */         inv.setItem(9, cogu2);
/* 66 */         inv.setItem(10, potes);
/* 67 */         inv.setItem(11, cogu1);
/* 68 */         inv.setItem(12, cogu2);
/* 69 */         inv.setItem(13, potes);
/* 70 */         inv.setItem(14, cogu1);
/* 71 */         inv.setItem(15, cogu2);
/* 72 */         inv.setItem(16, potes);
/* 73 */         inv.setItem(17, cogu1);
/* 74 */         inv.setItem(18, cogu2);
/* 75 */         inv.setItem(19, potes);
/* 76 */         inv.setItem(20, cogu1);
/* 77 */         inv.setItem(21, cogu2);
/* 78 */         inv.setItem(22, potes);
/* 79 */         inv.setItem(23, cogu1);
/* 80 */         inv.setItem(24, cogu2);
/* 81 */         inv.setItem(25, potes);
/* 82 */         inv.setItem(26, cogu1);
/*    */         
/*    */ 
/* 85 */         p.openInventory(inv);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\utils\Recraft.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */