/*     */ package com.crowed.events;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.BlockBreakEvent;
/*     */ import org.bukkit.event.block.BlockPlaceEvent;
/*     */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.event.inventory.InventoryOpenEvent;
/*     */ import org.bukkit.event.player.AsyncPlayerChatEvent;
/*     */ import org.bukkit.event.player.PlayerChatEvent;
/*     */ import org.bukkit.event.player.PlayerCommandPreprocessEvent;
/*     */ import org.bukkit.event.player.PlayerDropItemEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.event.player.PlayerMoveEvent;
/*     */ import org.bukkit.event.player.PlayerPickupItemEvent;
/*     */ 
/*     */ 
/*     */ public class EventoAuthEvents
/*     */   implements Listener
/*     */ {
/*     */   @EventHandler
/*     */   public void Mover(PlayerMoveEvent e)
/*     */   {
/*  28 */     Player p = e.getPlayer();
/*  29 */     if (Main.login.contains(p.getName())) {
/*  30 */       p.teleport(p);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onPickUp(PlayerPickupItemEvent event)
/*     */   {
/*  37 */     Player p = event.getPlayer();
/*  38 */     if (Main.login.contains(p.getName())) {
/*  39 */       event.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onDrop(PlayerDropItemEvent event)
/*     */   {
/*  46 */     Player p = event.getPlayer();
/*  47 */     if (Main.login.contains(p.getName())) {
/*  48 */       event.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onClickInventorySpec(InventoryClickEvent event)
/*     */   {
/*  55 */     Player p = (Player)event.getWhoClicked();
/*  56 */     if (Main.login.contains(p.getName()))
/*     */     {
/*  58 */       event.setCancelled(true);
/*  59 */       p.updateInventory();
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onOpenInventorySpec(InventoryOpenEvent event) {
/*  65 */     Player p = (Player)event.getPlayer();
/*  66 */     if (Main.login.contains(p.getName())) {
/*  67 */       event.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockBreak(BlockBreakEvent event) {
/*  73 */     Player p = event.getPlayer();
/*  74 */     if (Main.login.contains(p.getName())) {
/*  75 */       event.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onBlockPlace(BlockPlaceEvent event) {
/*  81 */     Player p = event.getPlayer();
/*  82 */     if (Main.login.contains(p.getName())) {
/*  83 */       event.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onChat(PlayerChatEvent event)
/*     */   {
/*  90 */     Player p = event.getPlayer();
/*  91 */     if (Main.login.contains(p.getName())) {
/*  92 */       event.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onDamage(EntityDamageByEntityEvent event) {
/*  98 */     if ((event.getEntity() instanceof Player)) {
/*  99 */       Player p = (Player)event.getEntity();
/* 100 */       if (Main.login.contains(p.getName())) {
/* 101 */         event.setCancelled(true);
/*     */       }
/*     */     }
/* 104 */     if ((event.getDamager() instanceof Player))
/*     */     {
/* 106 */       Player p = (Player)event.getDamager();
/* 107 */       if (Main.login.contains(p.getName())) {
/* 108 */         event.setCancelled(true);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onInteract(PlayerInteractEvent event) {
/* 115 */     Player p = event.getPlayer();
/* 116 */     if (Main.login.contains(p.getName())) {
/* 117 */       event.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Mover(AsyncPlayerChatEvent e)
/*     */   {
/* 124 */     Player p = e.getPlayer();
/* 125 */     if (Main.login.contains(p.getName())) {
/* 126 */       e.setCancelled(true);
/*     */     } else {
/* 128 */       e.setCancelled(false);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void aoCMD(PlayerCommandPreprocessEvent e)
/*     */   {
/* 135 */     Player p = e.getPlayer();
/* 136 */     String cmd = e.getMessage();
/* 137 */     if (Main.login.contains(p.getName())) {
/* 138 */       if ((cmd.startsWith("/login")) || (cmd.startsWith("/register"))) {
/* 139 */         e.setCancelled(false);
/*     */       } else {
/* 141 */         e.setCancelled(true);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\EventoAuthEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */