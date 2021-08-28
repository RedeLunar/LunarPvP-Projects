/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.CooldownAPI;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.entity.Entity;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageEvent;
/*    */ import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ public class Sumo implements Listener
/*    */ {
/* 24 */   public ArrayList<String> Cima = new ArrayList();
/*    */   
/* 26 */   private ArrayList<Block> remover = new ArrayList();
/* 27 */   public static ArrayList<Player> noExecut = new ArrayList();
/*    */   
/*    */   @EventHandler
/*    */   public void Clicar(PlayerInteractEvent e)
/*    */   {
/* 32 */     Player p = e.getPlayer();
/* 33 */     if ((p instanceof Player)) {
/* 34 */       p.getItemInHand().equals(Integer.valueOf(260));
/*    */       
/* 36 */       if (!e.getAction().name().contains("RIGHT")) {
/* 37 */         return;
/*    */       }
/* 39 */       if ((p.getItemInHand().getTypeId() == 260) && (com.crowed.api.KitAPI.getKit(p) == "Sumo")) {
/* 40 */         if (noExecut.contains(p)) {
/* 41 */           return;
/*    */         }
/* 43 */         e.setCancelled(true);
/* 44 */         if (!CooldownAPI.Cooldown.containsKey(p.getName())) {
/* 45 */           Location Local = e.getPlayer().getLocation();
/* 46 */           Local = Local.getWorld().getHighestBlockAt(Local).getLocation().add(0.0D, 22.0D, 0.0D);
/* 47 */           for (int x = 0; x <= 0; x++) {
/* 48 */             for (int z = 0; z <= 0; z++)
/*    */             {
/* 50 */               final Block a = Local.add(x, 0.0D, z).getBlock();
/* 51 */               a.setType(Material.DIRT);
/* 52 */               e.getPlayer().teleport(Local.add(0.0D, 1.0D, 0.0D));
/* 53 */               CooldownAPI.addCooldown(p, 35);
/* 54 */               this.Cima.add(p.getName());
/* 55 */               org.bukkit.Bukkit.getServer().getScheduler().runTaskLater(Main.getPlugin(), new Runnable()
/*    */               {
/*    */                 public void run()
/*    */                 {
/* 59 */                   a.setType(Material.AIR);
/* 60 */                   Sumo.this.remover.remove(a);
/*    */                 }
/*    */                 
/* 63 */               }, 50L);
/*    */             }
/*    */           }
/*    */         } else {
/* 67 */           p.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.YELLOW + ChatColor.BOLD + "Sumo" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(p) + "s");
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */ 
/*    */   @EventHandler
/*    */   public void Cair(EntityDamageEvent e)
/*    */   {
/* 77 */     if (!(e.getEntity() instanceof Player)) {
/* 78 */       return;
/*    */     }
/* 80 */     Player p = (Player)e.getEntity();
/* 81 */     if ((e.getCause() == EntityDamageEvent.DamageCause.FALL) && 
/* 82 */       (this.Cima.contains(p.getName()))) {
/* 83 */       e.setCancelled(true);
/* 84 */       for (Entity Altura : p.getNearbyEntities(8.0D, 8.0D, 8.0D)) {
/* 85 */         if ((Altura instanceof Player)) {
/* 86 */           Player Pular = (Player)Altura;
/* 87 */           Vector v = p.getLocation().getDirection().multiply(0).setY(2.0D);
/* 88 */           Pular.setVelocity(v);
/*    */         }
/*    */       }
/* 91 */       this.Cima.remove(p.getName());
/* 92 */       e.setDamage(9.0D);
/* 93 */       return;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Sumo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */