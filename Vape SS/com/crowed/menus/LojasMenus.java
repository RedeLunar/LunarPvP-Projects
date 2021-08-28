/*    */ package com.crowed.menus;
/*    */ 
/*    */ import com.crowed.api.StatsManager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.inventory.InventoryClickEvent;
/*    */ import org.bukkit.inventory.Inventory;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.meta.ItemMeta;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LojasMenus
/*    */ {
/*    */   public static void inventory(Player p)
/*    */   {
/* 22 */     Inventory menu = Bukkit.createInventory(p, 54, "§7Lojas");
/*    */     
/* 24 */     ItemStack kits = new ItemStack(Material.PAPER, 1, (short)8);
/* 25 */     ItemMeta kkits = kits.getItemMeta();
/* 26 */     kkits.setDisplayName("§fKits");
/* 27 */     kits.setItemMeta(kkits);
/*    */     
/* 29 */     ItemStack Warps = new ItemStack(Material.GLASS, 1, (short)8);
/* 30 */     ItemMeta kWarps = Warps.getItemMeta();
/* 31 */     kWarps.setDisplayName("§fWarps");
/* 32 */     Warps.setItemMeta(kWarps);
/*    */     
/* 34 */     ItemStack loja = new ItemStack(Material.getMaterial(351), 1, (short)10);
/* 35 */     ItemMeta kloja = loja.getItemMeta();
/* 36 */     kloja.setDisplayName("§eLojas");
/* 37 */     loja.setItemMeta(kloja);
/*    */     
/* 39 */     ItemStack vidro = new ItemStack(Material.getMaterial(160), 1, (short)0);
/* 40 */     ItemMeta kvidro = vidro.getItemMeta();
/* 41 */     kvidro.setDisplayName("§7 ");
/* 42 */     vidro.setItemMeta(kvidro);
/*    */     
/* 44 */     ItemStack Voltar = new ItemStack(Material.getMaterial(171), 1, (short)14);
/* 45 */     ItemMeta kVoltar = Voltar.getItemMeta();
/* 46 */     kVoltar.setDisplayName("§c§l<");
/* 47 */     Voltar.setItemMeta(kVoltar);
/*    */     
/*    */ 
/* 50 */     menu.setItem(0, Voltar);
/* 51 */     menu.setItem(1, vidro);
/* 52 */     menu.setItem(2, vidro);
/* 53 */     menu.setItem(3, vidro);
/* 54 */     menu.setItem(4, vidro);
/* 55 */     menu.setItem(5, vidro);
/* 56 */     menu.setItem(6, vidro);
/* 57 */     menu.setItem(7, vidro);
/* 58 */     menu.setItem(8, vidro);
/* 59 */     menu.setItem(46, vidro);
/* 60 */     menu.setItem(45, vidro);
/* 61 */     menu.setItem(46, vidro);
/* 62 */     menu.setItem(47, vidro);
/* 63 */     menu.setItem(51, vidro);
/* 64 */     menu.setItem(52, vidro);
/* 65 */     menu.setItem(53, vidro);
/*    */     
/* 67 */     menu.setItem(49, vidro);
/* 68 */     menu.setItem(48, vidro);
/* 69 */     menu.setItem(50, vidro);
/*    */     
/* 71 */     p.openInventory(menu);
/* 72 */     p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
/*    */   }
/*    */   
/*    */   public static void comprarkit(Player p, InventoryClickEvent menu, String kit, Material material, String nomekitpermissão, int preço, String preçostring) {
/* 76 */     if (menu.getCurrentItem().getType() == material) {
/* 77 */       if (StatsManager.getXp(p) == preço) {
/* 78 */         if (!p.hasPermission("kit." + nomekitpermissão)) {
/* 79 */           Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + p.getName() + " add kit." + nomekitpermissão);
/* 80 */           StatsManager.RemoveXp(p, preço);
/* 81 */           p.closeInventory();
/* 82 */           p.sendMessage(Strings.servidormensagem + ChatColor.GREEN + "Kit comprado com sucesso.");
/*    */         } else {
/* 84 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você ja possui esse kit.");
/*    */         }
/*    */       } else {
/* 87 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você não possui coins suficiente.");
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\LojasMenus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */