/*    */ package com.crowed.events;
/*    */ 
/*    */ import com.crowed.api.API;
/*    */ import com.crowed.api.WarpsAPI;
/*    */ import com.crowed.comandos.Evento;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.entity.Player.Spigot;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.player.PlayerRespawnEvent;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Respawn implements org.bukkit.event.Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void respawn(PlayerRespawnEvent e)
/*    */   {
/* 19 */     final Player p = e.getPlayer();
/* 20 */     p.getInventory().clear();
/* 21 */     API.itensSpawn(p);
/* 22 */     com.crowed.api.KitAPI.TirarKit(p);
/* 23 */     WarpsAPI.Ir(p, "Spawn");
/* 24 */     API.setWarp(p, "Spawn");
/* 25 */     p.teleport(p.getWorld().getSpawnLocation());
/* 26 */     p.getInventory().setArmorContents(null);
/* 27 */     Evento.participantes.remove(p.getName());
/*    */     
/* 29 */     org.bukkit.Bukkit.getScheduler().scheduleSyncDelayedTask(com.crowed.Main.getPlugin(), new Runnable() {
/*    */       public void run() {
/* 31 */         p.spigot().respawn();
/*    */       }
/* 33 */     }, 1L);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\Respawn.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */