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
/*    */ public class Esmeralda
/*    */   implements Listener
/*    */ {
/*    */   public static Main plugin;
/*    */   
/*    */   public Esmeralda(Main main)
/*    */   {
/* 31 */     plugin = main;
/*    */   }
/*    */   
/*    */ 
/* 35 */   public static ArrayList<String> Esmeralda = new ArrayList();
/*    */   
/*    */   @EventHandler(priority=EventPriority.MONITOR)
/*    */   public void onPlayerJump1(PlayerMoveEvent e)
/*    */   {
/* 40 */     Player p = e.getPlayer();
/* 41 */     if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.EMERALD_BLOCK)
/*    */     {
/* 43 */       Esmeralda.remove(p.getName());
/* 44 */       Location loc = e.getTo().getBlock().getLocation();
/* 45 */       Vector sponge = p.getLocation().getDirection().multiply(0).setY(3);
/* 46 */       p.setVelocity(sponge);
/* 47 */       p.playSound(loc, Sound.ORB_PICKUP, 6.0F, 1.0F);
/* 48 */       p.playEffect(loc, Effect.ENDER_SIGNAL, null);
/* 49 */       p.playEffect(loc, Effect.CLICK1, null);
/* 50 */       p.playEffect(loc, Effect.BLAZE_SHOOT, null);
/* 51 */       Esmeralda.add(p.getName());
/* 52 */       return;
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onFall(EntityDamageEvent e)
/*    */   {
/* 59 */     if ((e.getEntity() instanceof Player))
/*    */     {
/* 61 */       Player p = (Player)e.getEntity();
/* 62 */       if ((e.getCause().equals(EntityDamageEvent.DamageCause.FALL)) && 
/* 63 */         (Esmeralda.contains(p.getName())))
/*    */       {
/* 65 */         e.setCancelled(true);
/* 66 */         Esmeralda.remove(p.getName());
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\jump\Esmeralda.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */