/*    */ package com.crowed.menus;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FpsMenus
/*    */ {
/*    */   public static void inventory(Player p)
/*    */   {
/* 16 */     Inventory menu = Bukkit.createInventory(p, 9, "§7Warps");
/*    */     
/* 18 */     ItemStack kits = new ItemStack(Material.getMaterial(35), 1, (short)14);
/* 19 */     ItemMeta kkits = kits.getItemMeta();
/* 20 */     kkits.setDisplayName("§e§lFPS - §7(Sem armadura)");
/* 21 */     kits.setItemMeta(kkits);
/*    */     
/* 23 */     ItemStack Warps = new ItemStack(Material.getMaterial(35), 1, (short)5);
/* 24 */     ItemMeta kWarps = Warps.getItemMeta();
/* 25 */     kWarps.setDisplayName("§e§lFPS - §7(Com armadura)");
/* 26 */     Warps.setItemMeta(kWarps);
/*    */     
/* 28 */     menu.setItem(3, kits);
/* 29 */     menu.setItem(5, Warps);
/*    */     
/* 31 */     p.openInventory(menu);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\FpsMenus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */