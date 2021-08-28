/*    */ package com.crowed.menus;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ public class Menus implements org.bukkit.event.Listener
/*    */ {
/*    */   @org.bukkit.event.EventHandler
/*    */   public void onBauKit(PlayerInteractEvent e)
/*    */   {
/* 16 */     Player p = e.getPlayer();
/* 17 */     if ((p.getItemInHand().getType().equals(Material.PAPER)) && (p.getItemInHand().getItemMeta().hasDisplayName()) && (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + ChatColor.BOLD + "Kits -" + ChatColor.GRAY + " (Clique)"))) {
/* 18 */       e.setCancelled(true);
/* 19 */       if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
/* 20 */         KitsMenus.menuentory(p);
/* 21 */         p.playSound(p.getLocation(), org.bukkit.Sound.LEVEL_UP, 1.0F, 1.0F);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @org.bukkit.event.EventHandler
/*    */   public void onWarps(PlayerInteractEvent e) {
/* 28 */     Player p = e.getPlayer();
/* 29 */     if ((p.getItemInHand().getType().equals(Material.GLASS)) && (p.getItemInHand().getItemMeta().hasDisplayName()) && (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + ChatColor.BOLD + "Warps -" + ChatColor.GRAY + " (Clique)"))) {
/* 30 */       e.setCancelled(true);
/* 31 */       if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
/* 32 */         WarpsMenus.inventory(p);
/* 33 */         p.playSound(p.getLocation(), org.bukkit.Sound.LEVEL_UP, 1.0F, 1.0F);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @org.bukkit.event.EventHandler
/*    */   public void onExtras(PlayerInteractEvent e) {
/* 40 */     Player p = e.getPlayer();
/* 41 */     if ((p.getItemInHand().getType().equals(Material.MINECART)) && (p.getItemInHand().getItemMeta().hasDisplayName()) && (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + ChatColor.BOLD + "Menu -" + ChatColor.GRAY + " (Clique)"))) {
/* 42 */       e.setCancelled(true);
/* 43 */       if ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) {
/* 44 */         MenuMenus.inventory(p);
/* 45 */         p.playSound(p.getLocation(), org.bukkit.Sound.LEVEL_UP, 1.0F, 1.0F);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\Menus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */