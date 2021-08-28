/*    */ package com.crowed.menus;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MenuMenus
/*    */ {
/*    */   public static void inventory(Player p)
/*    */   {
/* 17 */     Inventory menu = Bukkit.createInventory(p, 54, "§7Menu");
/*    */     
/* 19 */     ItemStack kits = new ItemStack(Material.PAPER, 1, (short)8);
/* 20 */     ItemMeta kkits = kits.getItemMeta();
/* 21 */     kkits.setDisplayName("§fKits");
/* 22 */     kits.setItemMeta(kkits);
/*    */     
/* 24 */     ItemStack Warps = new ItemStack(Material.GLASS, 1, (short)8);
/* 25 */     ItemMeta kWarps = Warps.getItemMeta();
/* 26 */     kWarps.setDisplayName("§fWarps");
/* 27 */     Warps.setItemMeta(kWarps);
/*    */     
/* 29 */     ItemStack Menu = new ItemStack(Material.getMaterial(351), 1, (short)10);
/* 30 */     ItemMeta kMenu = Menu.getItemMeta();
/* 31 */     kMenu.setDisplayName("§eMenu");
/* 32 */     Menu.setItemMeta(kMenu);
/*    */     
/* 34 */     ItemStack menus = new ItemStack(Material.MINECART);
/* 35 */     ItemMeta kmenus = menus.getItemMeta();
/* 36 */     kmenus.setDisplayName("§eMenus");
/* 37 */     menus.setItemMeta(kmenus);
/*    */     
/*    */ 
/*    */ 
/* 41 */     ItemStack Minigames = new ItemStack(Material.NAME_TAG);
/* 42 */     ItemMeta kMinigames = Minigames.getItemMeta();
/* 43 */     kMinigames.setDisplayName("§eMinigames");
/* 44 */     Minigames.setItemMeta(kMinigames);
/*    */     
/* 46 */     ItemStack info = new ItemStack(Material.PAPER);
/* 47 */     ItemMeta kinfo = info.getItemMeta();
/* 48 */     kinfo.setDisplayName("§eInformaçoes");
/* 49 */     info.setItemMeta(kinfo);
/*    */     
/* 51 */     ItemStack vidro = new ItemStack(Material.getMaterial(160), 1, (short)0);
/* 52 */     ItemMeta kvidro = vidro.getItemMeta();
/* 53 */     kvidro.setDisplayName("§7 ");
/* 54 */     vidro.setItemMeta(kvidro);
/*    */     
/* 56 */     ItemStack loja = new ItemStack(Material.DIAMOND);
/* 57 */     ItemMeta kloja = loja.getItemMeta();
/* 58 */     kloja.setDisplayName("§eLojas");
/* 59 */     loja.setItemMeta(kloja);
/*    */     
/* 61 */     menu.setItem(0, vidro);
/* 62 */     menu.setItem(1, vidro);
/* 63 */     menu.setItem(2, vidro);
/* 64 */     menu.setItem(3, vidro);
/* 65 */     menu.setItem(4, vidro);
/* 66 */     menu.setItem(5, vidro);
/* 67 */     menu.setItem(6, vidro);
/* 68 */     menu.setItem(7, vidro);
/* 69 */     menu.setItem(8, vidro);
/* 70 */     menu.setItem(46, vidro);
/* 71 */     menu.setItem(45, vidro);
/* 72 */     menu.setItem(46, vidro);
/* 73 */     menu.setItem(47, vidro);
/* 74 */     menu.setItem(51, vidro);
/* 75 */     menu.setItem(52, vidro);
/* 76 */     menu.setItem(53, vidro);
/*    */     
/*    */ 
/*    */ 
/* 80 */     menu.setItem(24, loja);
/* 81 */     menu.setItem(22, info);
/* 82 */     menu.setItem(20, Minigames);
/*    */     
/* 84 */     menu.setItem(49, kits);
/* 85 */     menu.setItem(48, Warps);
/* 86 */     menu.setItem(50, Menu);
/*    */     
/* 88 */     p.openInventory(menu);
/* 89 */     p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\MenuMenus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */