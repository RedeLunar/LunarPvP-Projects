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
/*    */ public class WarpsMenus
/*    */ {
/*    */   public static void inventory(Player p)
/*    */   {
/* 17 */     Inventory menu = Bukkit.createInventory(p, 54, "§7Warps");
/*    */     
/* 19 */     ItemStack kits = new ItemStack(Material.PAPER, 1, (short)8);
/* 20 */     ItemMeta kkits = kits.getItemMeta();
/* 21 */     kkits.setDisplayName("§fKits");
/* 22 */     kits.setItemMeta(kkits);
/*    */     
/* 24 */     ItemStack Warps = new ItemStack(Material.GLASS, 1, (short)10);
/* 25 */     ItemMeta kWarps = Warps.getItemMeta();
/* 26 */     kWarps.setDisplayName("§eWarps");
/* 27 */     Warps.setItemMeta(kWarps);
/*    */     
/* 29 */     ItemStack loja = new ItemStack(Material.getMaterial(351), 1, (short)8);
/* 30 */     ItemMeta kloja = loja.getItemMeta();
/* 31 */     kloja.setDisplayName("§fMenu");
/* 32 */     loja.setItemMeta(kloja);
/*    */     
/* 34 */     ItemStack vidro = new ItemStack(Material.getMaterial(160), 1, (short)0);
/* 35 */     ItemMeta kvidro = vidro.getItemMeta();
/* 36 */     kvidro.setDisplayName("§7 ");
/* 37 */     vidro.setItemMeta(kvidro);
/*    */     
/* 39 */     ItemStack fps = new ItemStack(Material.GLASS);
/* 40 */     ItemMeta kfps = fps.getItemMeta();
/* 41 */     kfps.setDisplayName("§e§lFPS");
/* 42 */     fps.setItemMeta(kfps);
/*    */     
/* 44 */     ItemStack challenge = new ItemStack(Material.LAVA_BUCKET, 1, (short)0);
/* 45 */     ItemMeta kchallenge = challenge.getItemMeta();
/* 46 */     kchallenge.setDisplayName("§e§lCHALLENGE");
/* 47 */     challenge.setItemMeta(kchallenge);
/*    */     
/* 49 */     ItemStack knock = new ItemStack(Material.STICK);
/* 50 */     ItemMeta kknock = knock.getItemMeta();
/* 51 */     kknock.setDisplayName("§e§lKNOCKBACK");
/* 52 */     knock.setItemMeta(kknock);
/*    */     
/* 54 */     ItemStack fish = new ItemStack(Material.FISHING_ROD);
/* 55 */     ItemMeta kfish = fish.getItemMeta();
/* 56 */     kfish.setDisplayName("§e§lFISHERMAN");
/* 57 */     fish.setItemMeta(kfish);
/*    */     
/* 59 */     ItemStack txt = new ItemStack(Material.MAGMA_CREAM);
/* 60 */     ItemMeta ktxt = txt.getItemMeta();
/* 61 */     ktxt.setDisplayName("§e§lTEXTURAS");
/* 62 */     txt.setItemMeta(ktxt);
/*    */     
/* 64 */     ItemStack umvum = new ItemStack(Material.BLAZE_ROD);
/* 65 */     ItemMeta kumvum = umvum.getItemMeta();
/* 66 */     kumvum.setDisplayName("§e§l1V1");
/* 67 */     umvum.setItemMeta(kumvum);
/*    */     
/* 69 */     menu.setItem(0, vidro);
/* 70 */     menu.setItem(1, vidro);
/* 71 */     menu.setItem(2, vidro);
/* 72 */     menu.setItem(3, vidro);
/* 73 */     menu.setItem(4, vidro);
/* 74 */     menu.setItem(5, vidro);
/* 75 */     menu.setItem(6, vidro);
/* 76 */     menu.setItem(7, vidro);
/* 77 */     menu.setItem(8, vidro);
/* 78 */     menu.setItem(46, vidro);
/* 79 */     menu.setItem(45, vidro);
/* 80 */     menu.setItem(46, vidro);
/* 81 */     menu.setItem(47, vidro);
/* 82 */     menu.setItem(51, vidro);
/* 83 */     menu.setItem(52, vidro);
/* 84 */     menu.setItem(53, vidro);
/*    */     
/* 86 */     menu.setItem(21, fps);
/* 87 */     menu.setItem(22, challenge);
/* 88 */     menu.setItem(23, umvum);
/* 89 */     menu.setItem(24, knock);
/* 90 */     menu.setItem(31, fish);
/* 91 */     menu.setItem(32, txt);
/*    */     
/* 93 */     menu.setItem(49, kits);
/* 94 */     menu.setItem(48, Warps);
/* 95 */     menu.setItem(50, loja);
/*    */     
/* 97 */     p.openInventory(menu);
/* 98 */     p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\WarpsMenus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */