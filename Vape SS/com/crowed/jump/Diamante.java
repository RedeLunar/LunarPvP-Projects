/*    */ package com.crowed.jump;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.Effect;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.block.BlockFace;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
/*    */ import org.bukkit.event.player.PlayerMoveEvent;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Diamante
/*    */   implements Listener
/*    */ {
/*    */   public static Main plugin;
/*    */   
/*    */   public Diamante(Main main)
/*    */   {
/* 31 */     plugin = main;
/*    */   }
/*    */   
/*    */ 
/* 35 */   public static ArrayList<String> Diamante = new ArrayList();
/*    */   
/*    */   @EventHandler(priority=EventPriority.MONITOR)
/*    */   public void onPlayerJump1(PlayerMoveEvent e) {
/* 39 */     Player p = e.getPlayer();
/* 40 */     if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.DIAMOND_BLOCK) {
/* 41 */       Diamante.remove(p.getName());
/* 42 */       Location loc = e.getTo().getBlock().getLocation();
/* 43 */       Vector sponge = p.getLocation().getDirection().multiply(0).setY(1);
/* 44 */       p.setVelocity(sponge);
/* 45 */       p.playSound(loc, Sound.ARROW_HIT, 6.0F, 1.0F);
/* 46 */       p.playEffect(loc, Effect.ENDER_SIGNAL, null);
/* 47 */       Diamante.add(p.getName());
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onFall(EntityDamageEvent e) {
/* 53 */     if ((e.getEntity() instanceof Player)) {
/* 54 */       Player p = (Player)e.getEntity();
/* 55 */       if ((e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) && (Diamante.contains(p.getName()))) {
/* 56 */         e.setCancelled(true);
/* 57 */         Diamante.remove(p.getName());
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\jump\Diamante.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */