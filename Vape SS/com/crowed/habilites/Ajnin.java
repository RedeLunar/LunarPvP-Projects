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
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.player.PlayerToggleSneakEvent;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Ajnin
/*    */   implements Listener
/*    */ {
/* 22 */   public static HashMap<Player, Player> a = new HashMap();
/* 23 */   public static ArrayList<Player> noExecut = new ArrayList();
/*    */   
/*    */   @EventHandler
/*    */   public void a(EntityDamageByEntityEvent e) {
/* 27 */     if (((e.getDamager() instanceof Player)) && ((e.getEntity() instanceof Player))) {
/* 28 */       final Player hitou = (Player)e.getDamager();
/* 29 */       final Player hitado = (Player)e.getEntity();
/* 30 */       if ((KitAPI.getKit(hitou) == "Ajnin") && (!a.containsKey(hitou))) {
/* 31 */         a.put(hitou, hitado);
/*    */         
/* 33 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*    */           public void run() {
/* 35 */             Ajnin.a.remove(hitou);
/* 36 */             Ajnin.a.remove(hitado);
/*    */           }
/* 38 */         }, 220L);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void a(PlayerToggleSneakEvent e) {
/* 45 */     Player hitou = e.getPlayer();
/* 46 */     if ((e.isSneaking()) && (KitAPI.getKit(hitou) == "Ajnin") && (CooldownAPI.Cooldown.containsKey(hitou.getName()))) {
/* 47 */       hitou.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.YELLOW + ChatColor.BOLD + "Ajnin" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(hitou) + "s");
/* 48 */       return;
/*    */     }
/*    */     
/* 51 */     if ((e.isSneaking()) && (KitAPI.getKit(hitou) == "Ajnin") && (a.containsKey(hitou))) {
/* 52 */       Player hitado = (Player)a.get(hitou);
/*    */       
/* 54 */       if (hitado != null) {
/* 55 */         if (noExecut.contains(hitado)) {
/* 56 */           hitou.sendMessage("§cEste jogador está em um pvp nas alturas!");
/* 57 */           return;
/*    */         }
/* 59 */         if (noExecut.contains(hitou)) {
/* 60 */           hitou.sendMessage("§cVocê não pode utilizar o kit Ajnin durante um pvp no Gladiator!");
/* 61 */           return;
/*    */         }
/* 63 */         if (hitou.getLocation().distance(hitado.getLocation()) < 40.0D)
/*    */         {
/* 65 */           hitado.teleport(hitou.getLocation());
/* 66 */           CooldownAPI.addCooldown(hitou, 20);
/*    */         } else {
/* 68 */           hitou.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Esse player sumiu de sua vista!");
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Ajnin.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */