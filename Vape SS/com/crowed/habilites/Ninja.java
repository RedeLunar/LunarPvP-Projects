/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.CooldownAPI;
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.text.DecimalFormat;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.event.player.PlayerToggleSneakEvent;
/*    */ 
/*    */ public class Ninja
/*    */   implements Listener
/*    */ {
/* 20 */   public static HashMap<Player, Player> a = new HashMap();
/*    */   
/* 22 */   public static HashMap<Player, Long> b = new HashMap();
/*    */   public static Main plugin;
/* 24 */   public static ArrayList<Player> noExecut = new ArrayList();
/*    */   
/*    */ 
/*    */ 
/*    */   @EventHandler
/*    */   public void a(EntityDamageByEntityEvent paramEntityDamageByEntityEvent)
/*    */   {
/* 31 */     if (((paramEntityDamageByEntityEvent.getDamager() instanceof Player)) && ((paramEntityDamageByEntityEvent.getEntity() instanceof Player)))
/*    */     {
/* 33 */       Player localPlayer1 = (Player)paramEntityDamageByEntityEvent.getDamager();
/* 34 */       Player localPlayer2 = (Player)paramEntityDamageByEntityEvent.getEntity();
/* 35 */       if (KitAPI.getKit(localPlayer1) == "Ninja")
/*    */       {
/* 37 */         a.put(localPlayer1, localPlayer2);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void a(PlayerToggleSneakEvent paramPlayerToggleSneakEvent)
/*    */   {
/* 45 */     Player localPlayer1 = paramPlayerToggleSneakEvent.getPlayer();
/* 46 */     if ((paramPlayerToggleSneakEvent.isSneaking()) && (KitAPI.getKit(localPlayer1) == "Ninja") && (CooldownAPI.Cooldown.containsKey(localPlayer1.getName()))) {
/* 47 */       localPlayer1.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.YELLOW + ChatColor.BOLD + "Ninja" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(localPlayer1) + "s");
/* 48 */       return;
/*    */     }
/* 50 */     if ((paramPlayerToggleSneakEvent.isSneaking()) && (KitAPI.getKit(localPlayer1) == "Ninja") && (a.containsKey(localPlayer1))) {
/* 51 */       Player localPlayer2 = (Player)a.get(localPlayer1);
/* 52 */       if ((localPlayer2 != null) && (!localPlayer2.isDead()))
/*    */       {
/* 54 */         if (noExecut.contains(localPlayer2)) {
/* 55 */           localPlayer1.sendMessage("§cEste jogador está em um duelo nas alturas!");
/* 56 */           return;
/*    */         }
/* 58 */         if (noExecut.contains(localPlayer1)) {
/* 59 */           localPlayer1.sendMessage("§cVocê não pode utilizar o kit Ninja durante um duelo no Gladiator!");
/* 60 */           return;
/*    */         }
/*    */         
/* 63 */         String str = null;
/* 64 */         if (b.get(localPlayer1) != null)
/*    */         {
/* 66 */           long l = ((Long)b.get(localPlayer1)).longValue() - System.currentTimeMillis();
/* 67 */           DecimalFormat localDecimalFormat = new DecimalFormat("##");
/* 68 */           int i = (int)l / 1000;
/* 69 */           str = localDecimalFormat.format(i);
/*    */         }
/*    */       }
/* 72 */       if ((b.get(localPlayer1) == null) || (((Long)b.get(localPlayer1)).longValue() < System.currentTimeMillis())) {
/* 73 */         if (localPlayer1.getLocation().distance(localPlayer2.getLocation()) < 100.0D) {
/* 74 */           localPlayer1.teleport(localPlayer2.getLocation());
/* 75 */           CooldownAPI.addCooldown(localPlayer1, 5);
/* 76 */           b.put(localPlayer1, Long.valueOf(System.currentTimeMillis() + 10000L));
/*    */         }
/*    */         else {
/* 79 */           localPlayer1.sendMessage("§cO último jogador hitado está muito longe!");
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Ninja.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */