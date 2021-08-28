/*    */ package com.crowed.events;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Item;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.entity.ItemSpawnEvent;
/*    */ import org.bukkit.event.player.PlayerDropItemEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class DropEvents implements org.bukkit.event.Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void sumir(final ItemSpawnEvent e)
/*    */   {
/* 18 */     if ((e.getEntity().getItemStack().getType() == Material.STONE_SWORD) && (e.getEntity().getItemStack().getType() == Material.DIAMOND_SWORD) && (e.getEntity().getItemStack().getType() == Material.IRON_CHESTPLATE)) {
/* 19 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*    */       {
/*    */         public void run() {
/* 22 */           e.getEntity().remove();
/*    */         }
/*    */         
/* 25 */       }, 1L);
/*    */     }
/* 27 */     Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*    */     {
/*    */       public void run() {
/* 30 */         e.getEntity().remove();
/* 31 */         e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), org.bukkit.Effect.SMOKE, 10);
/*    */       }
/*    */       
/* 34 */     }, 50L);
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void CalcelarDrops(PlayerDropItemEvent e) {
/* 39 */     Material T = e.getItemDrop().getItemStack().getType();
/* 40 */     if ((T.equals(Material.CHEST)) || 
/* 41 */       (T.equals(Material.ENCHANTED_BOOK)) || 
/* 42 */       (T.equals(Material.BLAZE_ROD)) || 
/* 43 */       (T.equals(Material.LADDER)) || 
/* 44 */       (T.equals(Material.EMERALD)) || 
/* 45 */       (T.equals(Material.STONE_SWORD)) || 
/* 46 */       (T.equals(Material.FIREWORK)) || 
/* 47 */       (T.equals(Material.DIAMOND_SWORD)) || 
/* 48 */       (T.equals(Material.WOOD_HOE)) || 
/* 49 */       (T.equals(Material.FISHING_ROD)) || 
/* 50 */       (T.equals(Material.STONE_AXE)) || 
/* 51 */       (T.equals(Material.EMERALD)) || 
/* 52 */       (T.equals(Material.QUARTZ)) || 
/* 53 */       (T.equals(Material.STONE_HOE)) || 
/* 54 */       (T.equals(Material.REDSTONE_BLOCK)) || 
/* 55 */       (T.equals(Material.EMERALD_BLOCK)) || 
/* 56 */       (T.equals(Material.IRON_FENCE)) || 
/* 57 */       (T.equals(Material.DIAMOND_BLOCK)) || 
/* 58 */       (T.equals(Material.LAPIS_BLOCK)) || 
/* 59 */       (T.equals(Material.ENCHANTED_BOOK)) || 
/* 60 */       (T.equals(Material.BEDROCK)) || 
/* 61 */       (T.equals(Material.REDSTONE)) || 
/* 62 */       (T.equals(Material.GOLD_AXE)) || 
/* 63 */       (T.equals(Material.WATCH)) || 
/* 64 */       (T.equals(Material.FEATHER)) || 
/* 65 */       (T.equals(Material.DIAMOND)) || 
/* 66 */       (T.equals(Material.NAME_TAG)) || 
/* 67 */       (T.equals(Material.SLIME_BALL)) || 
/* 68 */       (T.equals(Material.MAGMA_CREAM)) || 
/* 69 */       (T.equals(Material.CHEST)) || 
/* 70 */       (T.equals(Material.EMERALD)) || 
/* 71 */       (T.equals(Material.BONE)) || 
/* 72 */       (T.equals(Material.PAPER)) || 
/* 73 */       (T.equals(Material.COMPASS)) || 
/* 74 */       (T.equals(Material.FEATHER)) || 
/* 75 */       (T.equals(Material.ENDER_PEARL)) || 
/* 76 */       (T.equals(Material.STICK)) || 
/* 77 */       (T.equals(Material.SNOW_BALL)) || 
/* 78 */       (T.equals(Material.VINE)) || 
/* 79 */       (T.equals(Material.MINECART)) || 
/* 80 */       (T.equals(Material.WRITTEN_BOOK)) || 
/* 81 */       (T.equals(Material.IRON_AXE)))
/*    */     {
/*    */ 
/* 84 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\DropEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */