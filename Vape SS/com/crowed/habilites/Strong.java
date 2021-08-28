/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.CooldownAPI;
/*    */ import com.crowed.api.KitAPI;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Strong implements Listener
/*    */ {
/* 22 */   public static HashMap<Player, ItemStack[]> salvarArmadura = new HashMap();
/* 23 */   public static HashMap<Player, ItemStack[]> salvarInventario = new HashMap();
/*    */   
/* 25 */   public static ArrayList<Player> fulliron = new ArrayList();
/*    */   
/*    */   @EventHandler
/*    */   public void interagir(PlayerInteractEvent e) {
/* 29 */     final Player p = e.getPlayer();
/* 30 */     if ((KitAPI.getKit(p) == "Strong") && (CooldownAPI.Cooldown.containsKey(p.getName())) && (p.getItemInHand().getType() == Material.WATCH)) {
/* 31 */       e.setCancelled(true);
/* 32 */       p.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.YELLOW + ChatColor.BOLD + "Strong" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(p) + "s");
/*    */     }
/* 34 */     else if ((KitAPI.getKit(p) == "Strong") && (!CooldownAPI.Cooldown.containsKey(p.getName())) && (p.getItemInHand().getType() == Material.WATCH)) {
/* 35 */       salvarInventario.put(p, p.getInventory().getContents());
/* 36 */       salvarArmadura.put(p, p.getInventory().getArmorContents());
/*    */       
/* 38 */       p.getInventory().setArmorContents(null);
/* 39 */       ItemStack Peito = new ItemStack(Material.IRON_CHESTPLATE);
/*    */       
/*    */ 
/* 42 */       ItemStack Calça = new ItemStack(Material.IRON_LEGGINGS);
/*    */       
/*    */ 
/* 45 */       ItemStack Bota = new ItemStack(Material.IRON_BOOTS);
/*    */       
/*    */ 
/* 48 */       ItemStack Capacete = new ItemStack(Material.IRON_HELMET);
/*    */       
/*    */ 
/*    */ 
/* 52 */       p.getInventory().setChestplate(Peito);
/* 53 */       p.getInventory().setLeggings(Calça);
/* 54 */       p.getInventory().setHelmet(Capacete);
/* 55 */       p.getInventory().setBoots(Bota);
/* 56 */       p.updateInventory();
/* 57 */       CooldownAPI.addCooldown(p, 40);
/*    */       
/* 59 */       p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está " + ChatColor.YELLOW + ChatColor.BOLD + "Fulliron" + ChatColor.GRAY + " por 10 segundos.");
/* 60 */       fulliron.add(p);
/*    */       
/* 62 */       if (fulliron.contains(p)) {
/* 63 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable()
/*    */         {
/*    */           public void run() {
/* 66 */             if (Strong.fulliron.contains(p)) {
/* 67 */               p.sendMessage("§aA Sua armadura foi retirada!");
/* 68 */               p.getInventory().setArmorContents(null);
/*    */               
/* 70 */               p.closeInventory();
/* 71 */               p.getInventory().remove(Material.IRON_CHESTPLATE);
/* 72 */               p.getInventory().remove(Material.IRON_LEGGINGS);
/* 73 */               p.getInventory().remove(Material.IRON_BOOTS);
/* 74 */               p.getInventory().remove(Material.IRON_HELMET);
/* 75 */               p.getInventory().remove(Material.IRON_SWORD);
/*    */               
/* 77 */               p.getInventory().setArmorContents((ItemStack[])Strong.salvarArmadura.get(p));
/*    */             }
/*    */             
/*    */           }
/* 81 */         }, 200L);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Strong.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */