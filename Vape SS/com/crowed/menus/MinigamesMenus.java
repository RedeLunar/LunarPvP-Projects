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
/*    */ public class MinigamesMenus
/*    */ {
/*    */   public static void inventory(Player p)
/*    */   {
/* 17 */     Inventory menu = Bukkit.createInventory(p, 54, "§7Minigames");
/*    */     
/* 19 */     ItemStack kits = new ItemStack(Material.getMaterial(351), 1, (short)8);
/* 20 */     ItemMeta kkits = kits.getItemMeta();
/* 21 */     kkits.setDisplayName("§fKits");
/* 22 */     kits.setItemMeta(kkits);
/*    */     
/* 24 */     ItemStack Warps = new ItemStack(Material.getMaterial(351), 1, (short)8);
/* 25 */     ItemMeta kWarps = Warps.getItemMeta();
/* 26 */     kWarps.setDisplayName("§fWarps");
/* 27 */     Warps.setItemMeta(kWarps);
/*    */     
/* 29 */     ItemStack loja = new ItemStack(Material.getMaterial(351), 1, (short)10);
/* 30 */     ItemMeta kloja = loja.getItemMeta();
/* 31 */     kloja.setDisplayName("§eLojas");
/* 32 */     loja.setItemMeta(kloja);
/*    */     
/* 34 */     ItemStack vidro = new ItemStack(Material.getMaterial(160), 1, (short)0);
/* 35 */     ItemMeta kvidro = vidro.getItemMeta();
/* 36 */     kvidro.setDisplayName("§7 ");
/* 37 */     vidro.setItemMeta(kvidro);
/*    */     
/* 39 */     ItemStack test = new ItemStack(Material.NAME_TAG);
/* 40 */     ItemMeta ktest = test.getItemMeta();
/* 41 */     ktest.setDisplayName("§eCPS ");
/* 42 */     test.setItemMeta(ktest);
/*    */     
/* 44 */     ItemStack voidl = new ItemStack(Material.ANVIL);
/* 45 */     ItemMeta kvoidl = voidl.getItemMeta();
/* 46 */     kvoidl.setDisplayName("§eVoidChallenge ");
/* 47 */     voidl.setItemMeta(kvoidl);
/*    */     
/*    */ 
/* 50 */     ItemStack Voltar = new ItemStack(Material.getMaterial(171), 1, (short)14);
/* 51 */     ItemMeta kVoltar = Voltar.getItemMeta();
/* 52 */     kVoltar.setDisplayName("§c§l<");
/* 53 */     Voltar.setItemMeta(kVoltar);
/*    */     
/* 55 */     menu.setItem(0, Voltar);
/* 56 */     menu.setItem(1, vidro);
/* 57 */     menu.setItem(2, vidro);
/* 58 */     menu.setItem(3, vidro);
/* 59 */     menu.setItem(4, vidro);
/* 60 */     menu.setItem(5, vidro);
/* 61 */     menu.setItem(6, vidro);
/* 62 */     menu.setItem(7, vidro);
/* 63 */     menu.setItem(8, vidro);
/* 64 */     menu.setItem(46, vidro);
/* 65 */     menu.setItem(45, vidro);
/* 66 */     menu.setItem(46, vidro);
/* 67 */     menu.setItem(47, vidro);
/* 68 */     menu.setItem(51, vidro);
/* 69 */     menu.setItem(52, vidro);
/* 70 */     menu.setItem(53, vidro);
/*    */     
/* 72 */     menu.setItem(20, test);
/* 73 */     menu.setItem(24, voidl);
/*    */     
/* 75 */     menu.setItem(49, vidro);
/* 76 */     menu.setItem(48, vidro);
/* 77 */     menu.setItem(50, vidro);
/*    */     
/* 79 */     p.openInventory(menu);
/* 80 */     p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\MinigamesMenus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */