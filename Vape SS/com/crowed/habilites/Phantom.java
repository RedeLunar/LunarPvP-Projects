/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.CooldownAPI;
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Color;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.inventory.meta.LeatherArmorMeta;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Phantom implements Listener
/*    */ {
/* 22 */   public static HashMap<Player, ItemStack[]> salvarArmadura = new HashMap();
/*    */   
/*    */   @EventHandler
/*    */   public void interagir(PlayerInteractEvent e) {
/* 26 */     final Player p = e.getPlayer();
/* 27 */     if ((KitAPI.getKit(p) == "Phantom") && (CooldownAPI.Cooldown.containsKey(p.getName())) && (p.getItemInHand().getType() == Material.FEATHER)) {
/* 28 */       e.setCancelled(true);
/* 29 */       p.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.YELLOW + ChatColor.BOLD + "Phantom" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(p) + "s");
/*    */     }
/* 31 */     else if ((KitAPI.getKit(p) == "Phantom") && (!CooldownAPI.Cooldown.containsKey(p.getName())) && (p.getItemInHand().getType() == Material.FEATHER))
/*    */     {
/* 33 */       salvarArmadura.put(p, p.getInventory().getArmorContents());
/*    */       
/* 35 */       p.getInventory().setArmorContents(null);
/* 36 */       ItemStack Peito = new ItemStack(Material.LEATHER_CHESTPLATE);
/* 37 */       LeatherArmorMeta kPeito = (LeatherArmorMeta)Peito.getItemMeta();
/* 38 */       kPeito.setDisplayName("");
/* 39 */       kPeito.setColor(Color.WHITE);
/* 40 */       Peito.setItemMeta(kPeito);
/*    */       
/* 42 */       ItemStack Calça = new ItemStack(Material.LEATHER_LEGGINGS);
/* 43 */       LeatherArmorMeta kCaça = (LeatherArmorMeta)Calça.getItemMeta();
/* 44 */       kCaça.setDisplayName("");
/* 45 */       kCaça.setColor(Color.WHITE);
/* 46 */       Calça.setItemMeta(kCaça);
/*    */       
/* 48 */       ItemStack Bota = new ItemStack(Material.LEATHER_BOOTS);
/* 49 */       LeatherArmorMeta kBota = (LeatherArmorMeta)Bota.getItemMeta();
/* 50 */       kBota.setDisplayName("");
/* 51 */       kBota.setColor(Color.WHITE);
/* 52 */       Bota.setItemMeta(kBota);
/*    */       
/* 54 */       ItemStack Capacete = new ItemStack(Material.LEATHER_HELMET);
/* 55 */       LeatherArmorMeta kCasapete = (LeatherArmorMeta)Capacete.getItemMeta();
/* 56 */       kCasapete.setDisplayName("");
/* 57 */       kCasapete.setColor(Color.WHITE);
/* 58 */       Capacete.setItemMeta(kCasapete);
/*    */       
/* 60 */       p.getInventory().setChestplate(Peito);
/* 61 */       p.getInventory().setLeggings(Calça);
/* 62 */       p.getInventory().setHelmet(Capacete);
/* 63 */       p.getInventory().setBoots(Bota);
/* 64 */       p.updateInventory();
/*    */       
/*    */ 
/* 67 */       p.sendMessage("§aVocê pode voar por 5 segundos!");
/* 68 */       CooldownAPI.addCooldown(p, 35);
/*    */       
/* 70 */       p.setAllowFlight(true);
/* 71 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*    */         public void run() {
/* 73 */           p.sendMessage("§cO seu modo pássaro acabou!");
/* 74 */           p.getInventory().setArmorContents(null);
/*    */           
/* 76 */           p.closeInventory();
/* 77 */           p.getInventory().remove(Material.LEATHER_BOOTS);
/* 78 */           p.getInventory().remove(Material.LEATHER_CHESTPLATE);
/* 79 */           p.getInventory().remove(Material.LEATHER_HELMET);
/* 80 */           p.getInventory().remove(Material.LEATHER_LEGGINGS);
/* 81 */           p.updateInventory();
/*    */           
/* 83 */           p.getInventory().setArmorContents((ItemStack[])Phantom.salvarArmadura.get(p));
/* 84 */           p.setAllowFlight(false);
/*    */         }
/* 86 */       }, 100L);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Phantom.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */