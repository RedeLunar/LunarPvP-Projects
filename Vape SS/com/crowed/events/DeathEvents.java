/*     */ package com.crowed.events;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.api.API;
/*     */ import com.crowed.api.KitAPI;
/*     */ import com.crowed.api.StatsManager;
/*     */ import com.crowed.api.WarpsAPI;
/*     */ import com.crowed.score.Updater;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.util.List;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.entity.PlayerDeathEvent;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class DeathEvents implements org.bukkit.event.Listener
/*     */ {
/*     */   @org.bukkit.event.EventHandler
/*     */   public void death(PlayerDeathEvent e)
/*     */   {
/*  22 */     final Player p = e.getEntity();
/*  23 */     Player d = e.getEntity().getKiller();
/*  24 */     WarpsAPI.Ir(p, "Spawn");
/*  25 */     API.setWarp(p, "Spawn");
/*  26 */     Proteção.setImortalidade(p, true);
/*  27 */     Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */       public void run() {
/*  29 */         p.spigot().respawn();
/*     */       }
/*  31 */     }, 1L);
/*  32 */     Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */       public void run() {
/*  34 */         WarpsAPI.Ir(p, "Spawn");
/*  35 */         API.setWarp(p, "Spawn");
/*  36 */         API.itensSpawn(p);
/*  37 */         Proteção.setImortalidade(p, true);
/*     */       }
/*  39 */     }, 2L);
/*     */     
/*  41 */     if (KitAPI.getKit(p) != "1v1") {
/*  42 */       WarpsAPI.Ir(p, "Spawn");
/*  43 */       API.setWarp(p, "Spawn");
/*  44 */       KitAPI.TirarKit(p);
/*     */       
/*  46 */       if (d != null)
/*     */       {
/*  48 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você morreu para o Jogador: " + ChatColor.GREEN + ChatColor.BOLD + d.getName());
/*  49 */         p.sendMessage(ChatColor.BLUE + ChatColor.BOLD + "Coins: " + ChatColor.GRAY + "-4");
/*     */         
/*  51 */         d.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você matou o Jogador: " + ChatColor.RED + ChatColor.BOLD + p.getName());
/*  52 */         d.sendMessage(ChatColor.BLUE + ChatColor.BOLD + "XP's: " + ChatColor.GRAY + "+1");
/*  53 */         d.sendMessage(ChatColor.BLUE + ChatColor.BOLD + "Coins: " + ChatColor.GRAY + "+20");
/*     */         
/*     */ 
/*  56 */         StatsManager.setKills(d);
/*  57 */         StatsManager.setDeaths(p);
/*  58 */         StatsManager.setCoins(d, 20);
/*  59 */         StatsManager.setXp(d, 1);
/*  60 */         StatsManager.RemoverKS(p);
/*     */         
/*     */ 
/*  63 */         Updater.UpdateScore(p);
/*  64 */         Updater.UpdateScore(d);
/*     */         
/*  66 */         e.setDeathMessage(null);
/*  67 */         e.getDrops().clear();
/*     */         
/*  69 */         if (StatsManager.getKillStreak(d) == 5) {
/*  70 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l5");
/*     */         }
/*  72 */         if (StatsManager.getKillStreak(d) == 10) {
/*  73 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l10");
/*     */         }
/*  75 */         if (StatsManager.getKillStreak(d) == 15) {
/*  76 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l15");
/*     */         }
/*  78 */         if (StatsManager.getKillStreak(d) == 20) {
/*  79 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l20");
/*     */         }
/*  81 */         if (StatsManager.getKillStreak(d) == 25) {
/*  82 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l25");
/*     */         }
/*  84 */         if (StatsManager.getKillStreak(d) == 30) {
/*  85 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l30");
/*     */         }
/*  87 */         if (StatsManager.getKillStreak(d) == 35) {
/*  88 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l35");
/*     */         }
/*  90 */         if (StatsManager.getKillStreak(d) == 40) {
/*  91 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l40");
/*     */         }
/*  93 */         if (StatsManager.getKillStreak(d) == 45) {
/*  94 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l45");
/*     */         }
/*  96 */         if (StatsManager.getKillStreak(d) == 50) {
/*  97 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l50");
/*     */         }
/*  99 */         if (StatsManager.getKillStreak(d) == 55) {
/* 100 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l55");
/*     */         }
/* 102 */         if (StatsManager.getKillStreak(d) == 60) {
/* 103 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l60");
/*     */         }
/* 105 */         if (StatsManager.getKillStreak(d) == 65) {
/* 106 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l65");
/*     */         }
/* 108 */         if (StatsManager.getKillStreak(d) == 70) {
/* 109 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l70");
/*     */         }
/* 111 */         if (StatsManager.getKillStreak(d) == 75) {
/* 112 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l75");
/*     */         }
/* 114 */         if (StatsManager.getKillStreak(d) == 80) {
/* 115 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l80");
/*     */         }
/* 117 */         if (StatsManager.getKillStreak(d) == 85) {
/* 118 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l85");
/*     */         }
/* 120 */         if (StatsManager.getKillStreak(d) == 90) {
/* 121 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l90");
/*     */         }
/* 123 */         if (StatsManager.getKillStreak(d) == 95) {
/* 124 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l95");
/*     */         }
/* 126 */         if (StatsManager.getKillStreak(d) == 100) {
/* 127 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l100");
/*     */         }
/* 129 */         if (StatsManager.getKillStreak(d) == 105) {
/* 130 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l105");
/*     */         }
/* 132 */         if (StatsManager.getKillStreak(d) == 110) {
/* 133 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l110");
/*     */         }
/* 135 */         if (StatsManager.getKillStreak(d) == 115) {
/* 136 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l115");
/*     */         }
/* 138 */         if (StatsManager.getKillStreak(d) == 120) {
/* 139 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l120");
/*     */         }
/* 141 */         if (StatsManager.getKillStreak(d) == 125) {
/* 142 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l125");
/*     */         }
/* 144 */         if (StatsManager.getKillStreak(d) == 130) {
/* 145 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l130");
/*     */         }
/* 147 */         if (StatsManager.getKillStreak(d) == 135) {
/* 148 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l135");
/*     */         }
/* 150 */         if (StatsManager.getKillStreak(d) == 140) {
/* 151 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l140");
/*     */         }
/* 153 */         if (StatsManager.getKillStreak(d) == 145) {
/* 154 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l145");
/*     */         }
/* 156 */         if (StatsManager.getKillStreak(d) == 150) {
/* 157 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l150");
/*     */         }
/* 159 */         if (StatsManager.getKillStreak(d) == 155) {
/* 160 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l155");
/*     */         }
/* 162 */         if (StatsManager.getKillStreak(d) == 160) {
/* 163 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l160");
/*     */         }
/* 165 */         if (StatsManager.getKillStreak(d) == 165) {
/* 166 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l165");
/*     */         }
/* 168 */         if (StatsManager.getKillStreak(d) == 170) {
/* 169 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l170");
/*     */         }
/* 171 */         if (StatsManager.getKillStreak(d) == 175) {
/* 172 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l175");
/*     */         }
/* 174 */         if (StatsManager.getKillStreak(d) == 180) {
/* 175 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l180");
/*     */         }
/* 177 */         if (StatsManager.getKillStreak(d) == 185) {
/* 178 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l185");
/*     */         }
/* 180 */         if (StatsManager.getKillStreak(d) == 190) {
/* 181 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l190");
/*     */         }
/* 183 */         if (StatsManager.getKillStreak(d) == 195) {
/* 184 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l195");
/*     */         }
/* 186 */         if (StatsManager.getKillStreak(d) == 200) {
/* 187 */           Bukkit.broadcastMessage("§e§l" + d.getName() + " §7está com um killstreak de §a§l200");
/*     */         }
/*     */       } else {
/* 190 */         e.setDeathMessage(null);
/* 191 */         e.getDrops().clear();
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\DeathEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */