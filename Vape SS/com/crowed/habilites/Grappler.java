/*     */ package com.crowed.habilites;
/*     */ 
/*     */ import com.crowed.api.KitAPI;
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.craftbukkit.v1_7_R4.entity.CraftEntity;
/*     */ import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.entity.EntityDamageEvent;
/*     */ import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
/*     */ import org.bukkit.event.entity.PlayerLeashEntityEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.event.player.PlayerItemHeldEvent;
/*     */ import org.bukkit.event.player.PlayerMoveEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.util.Vector;
/*     */ 
/*     */ public class Grappler implements Listener
/*     */ {
/*     */   public static com.crowed.Main plugin;
/*  26 */   Map<Player, Cordinha> hooks = new HashMap();
/*     */   
/*     */   @EventHandler
/*     */   public void onSlot(PlayerItemHeldEvent e) {
/*  30 */     if (this.hooks.containsKey(e.getPlayer())) {
/*  31 */       ((Cordinha)this.hooks.get(e.getPlayer())).remove();
/*  32 */       this.hooks.remove(e.getPlayer());
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void grapplerDamageNoLeash(EntityDamageEvent event) {
/*  38 */     if (!(event.getEntity() instanceof Player)) {
/*  39 */       return;
/*     */     }
/*  41 */     Player player = (Player)event.getEntity();
/*  42 */     if (event.getCause() != EntityDamageEvent.DamageCause.FALL) {
/*  43 */       return;
/*     */     }
/*  45 */     if ((this.hooks.containsKey(player)) && 
/*  46 */       (((Cordinha)this.hooks.get(player)).isHooked()) && 
/*  47 */       (event.getDamage() > 3.0D))
/*  48 */       event.setDamage(3.0D);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onMove(PlayerMoveEvent e) {
/*  53 */     Player p = e.getPlayer();
/*  54 */     if ((this.hooks.containsKey(e.getPlayer())) && 
/*  55 */       (!e.getPlayer().getItemInHand().getType().equals(Material.LEASH)) && (KitAPI.getKit(p) == "Grappler")) {
/*  56 */       ((Cordinha)this.hooks.get(e.getPlayer())).remove();
/*  57 */       this.hooks.remove(e.getPlayer());
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onLeash(PlayerLeashEntityEvent e) {
/*  63 */     Player p = e.getPlayer();
/*  64 */     if ((e.getPlayer().getItemInHand().getType().equals(Material.LEASH)) && (KitAPI.getKit(p) == "Grappler")) {
/*  65 */       e.setCancelled(true);
/*     */       
/*  67 */       e.getPlayer().updateInventory();
/*  68 */       e.setCancelled(true);
/*  69 */       if (!this.hooks.containsKey(p)) {
/*  70 */         return;
/*     */       }
/*  72 */       if (!((Cordinha)this.hooks.get(p)).isHooked()) {
/*  73 */         return;
/*     */       }
/*  75 */       double d = ((Cordinha)this.hooks.get(p)).getBukkitEntity()
/*  76 */         .getLocation().distance(p.getLocation());
/*  77 */       double t = d;
/*  78 */       double v_x = (1.0D + 0.07D * t) * (
/*  79 */         ((Cordinha)this.hooks.get(p)).getBukkitEntity()
/*  80 */         .getLocation().getX() - p.getLocation().getX()) / t;
/*  81 */       double v_y = (1.0D + 0.03D * t) * (
/*  82 */         ((Cordinha)this.hooks.get(p)).getBukkitEntity()
/*  83 */         .getLocation().getY() - p.getLocation().getY()) / t;
/*  84 */       double v_z = (1.0D + 0.07D * t) * (
/*  85 */         ((Cordinha)this.hooks.get(p)).getBukkitEntity()
/*  86 */         .getLocation().getZ() - p.getLocation().getZ()) / t;
/*     */       
/*  88 */       Vector v = p.getVelocity();
/*  89 */       v.setX(v_x);
/*  90 */       v.setY(v_y);
/*  91 */       v.setZ(v_z);
/*  92 */       p.setVelocity(v);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onClick(PlayerInteractEvent e) {
/*  98 */     Player p = e.getPlayer();
/*  99 */     if ((e.getPlayer().getItemInHand().getType().equals(Material.LEASH)) && (KitAPI.getKit(p) == "Grappler"))
/*     */     {
/* 101 */       e.setCancelled(true);
/* 102 */       if ((e.getAction() == Action.LEFT_CLICK_AIR) || 
/* 103 */         (e.getAction() == Action.LEFT_CLICK_BLOCK)) {
/* 104 */         if (this.hooks.containsKey(p)) {
/* 105 */           ((Cordinha)this.hooks.get(p)).remove();
/*     */         }
/* 107 */         Cordinha nmsHook = new Cordinha(p.getWorld(), 
/* 108 */           ((CraftPlayer)p).getHandle());
/* 109 */         nmsHook.spawn(p.getEyeLocation().add(
/* 110 */           p.getLocation().getDirection().getX(), 
/* 111 */           p.getLocation().getDirection().getY(), 
/* 112 */           p.getLocation().getDirection().getZ()));
/* 113 */         nmsHook.move(p.getLocation().getDirection().getX() * 5.0D, p
/* 114 */           .getLocation().getDirection().getY() * 5.0D, p
/* 115 */           .getLocation().getDirection().getZ() * 5.0D);
/* 116 */         this.hooks.put(p, nmsHook);
/*     */       }
/*     */       else
/*     */       {
/* 120 */         if (!this.hooks.containsKey(p)) {
/* 121 */           return;
/*     */         }
/* 123 */         if (!((Cordinha)this.hooks.get(p)).isHooked()) {
/* 124 */           return;
/*     */         }
/* 126 */         double d = ((Cordinha)this.hooks.get(p))
/* 127 */           .getBukkitEntity().getLocation()
/* 128 */           .distance(p.getLocation());
/* 129 */         double t = d;
/* 130 */         double v_x = (1.0D + 0.2D * t) * (
/* 131 */           ((Cordinha)this.hooks.get(p))
/* 132 */           .getBukkitEntity().getLocation().getX() - p
/* 133 */           .getLocation().getX()) / t;
/* 134 */         double v_y = (1.0D + 0.03D * t) * (
/* 135 */           ((Cordinha)this.hooks.get(p))
/* 136 */           .getBukkitEntity().getLocation().getY() - p
/* 137 */           .getLocation().getY()) / t;
/* 138 */         double v_z = (1.0D + 0.2D * t) * (
/* 139 */           ((Cordinha)this.hooks.get(p))
/* 140 */           .getBukkitEntity().getLocation().getZ() - p
/* 141 */           .getLocation().getZ()) / t;
/*     */         
/* 143 */         Vector v = p.getVelocity();
/* 144 */         v.setX(v_x);
/* 145 */         v.setY(v_y);
/* 146 */         v.setZ(v_z);
/* 147 */         p.setVelocity(v);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Grappler.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */