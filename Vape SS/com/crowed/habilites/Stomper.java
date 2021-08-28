/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Entity;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ public class Stomper implements Listener
/*    */ {
/* 22 */   public static ArrayList<String> delay = new ArrayList();
/*    */   
/*    */   @EventHandler
/*    */   public void clicar(PlayerInteractEvent e) {
/* 26 */     final Player p = e.getPlayer();
/* 27 */     if ((KitAPI.getKit(p) == "Stomper") && 
/* 28 */       (p.getItemInHand().getType() == Material.EMERALD) && (e.getAction() == Action.RIGHT_CLICK_AIR)) {
/* 29 */       if (delay.contains(p.getName())) {
/* 30 */         p.sendMessage("§cVocê esta em cooldown.");
/* 31 */         return;
/*    */       }
/* 33 */       p.setVelocity(new Vector(0, 3, 0).setY(3));
/* 34 */       delay.add(p.getName());
/* 35 */       org.bukkit.Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*    */       {
/*    */         public void run()
/*    */         {
/* 39 */           if (Stomper.delay.contains(p.getName())) {
/* 40 */             Stomper.delay.remove(p.getName());
/* 41 */             if (KitAPI.getKit(p) == "Stomper") {
/* 42 */               p.sendMessage("§bVocê saiu do cooldown. Pode usar o kit novamente.");
/*    */             }
/*    */           }
/*    */         }
/* 46 */       }, 800L);
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   @EventHandler
/*    */   public void stompar(EntityDamageEvent e)
/*    */   {
/* 54 */     if (!(e.getEntity() instanceof Player)) {
/* 55 */       return;
/*    */     }
/* 57 */     Player p = (Player)e.getEntity();
/* 58 */     if ((e.getCause() == EntityDamageEvent.DamageCause.FALL) && 
/* 59 */       (KitAPI.getKit(p) == "Stomper"))
/*    */     {
/* 61 */       for (Iterator localIterator = p.getNearbyEntities(4.0D, 1.5D, 4.0D).iterator(); localIterator.hasNext();)
/*    */       {
/*    */         Entity entidade;
/* 64 */         if (((entidade = (Entity)localIterator.next()) instanceof Player))
/*    */         {
/* 66 */           Player stompado = (Player)entidade;
/* 67 */           if (e.getDamage() <= 4.0D)
/*    */           {
/* 69 */             e.setCancelled(true);
/* 70 */             return;
/*    */           }
/* 72 */           if (stompado.isSneaking()) {
/* 73 */             stompado.damage(6.0D, p);
/* 74 */             stompado.sendMessage("§cVoce foi stompado por: " + p.getDisplayName());
/*    */           }
/*    */           else {
/* 77 */             stompado.damage(e.getDamage(), p);
/*    */           }
/*    */         }
/*    */       }
/* 81 */       e.setDamage(4.0D);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Stomper.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */