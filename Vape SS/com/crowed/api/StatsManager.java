/*     */ package com.crowed.api;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.score.Updater;
/*     */ import java.io.File;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.OfflinePlayer;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ 
/*     */ 
/*     */ public class StatsManager
/*     */ {
/*     */   public static File file;
/*     */   public static FileConfiguration cfile;
/*     */   
/*     */   public StatsManager()
/*     */   {
/*  21 */     Plugin plugin = Main.getPlugin();
/*     */     
/*  23 */     if (!plugin.getDataFolder().exists()) {
/*  24 */       plugin.getDataFolder().mkdir();
/*     */     }
/*  26 */     file = new File(plugin.getDataFolder(), "playersstatus.yml");
/*  27 */     if (!file.exists()) {
/*     */       try {
/*  29 */         file.createNewFile();
/*     */       } catch (Exception e) {
/*  31 */         e.printStackTrace();
/*     */       }
/*     */     }
/*  34 */     cfile = YamlConfiguration.loadConfiguration(file);
/*     */   }
/*     */   
/*     */   public static void FirstJoin(Player jogador) {
/*  38 */     if (cfile.getString(jogador.getName() + ".UUID") == null) {
/*  39 */       cfile.set(jogador.getName() + ".Kills", Integer.valueOf(0));
/*  40 */       cfile.set(jogador.getName() + ".Deaths", Integer.valueOf(0));
/*  41 */       cfile.set(jogador.getName() + ".Xp", Integer.valueOf(0));
/*  42 */       cfile.set(jogador.getName() + ".Coins", Integer.valueOf(0));
/*  43 */       Save();
/*     */     }
/*     */   }
/*     */   
/*     */   public static void setKills(Player p) {
/*  48 */     cfile.set(p.getName() + ".Kills", Integer.valueOf(getKills(p) + 1));
/*  49 */     cfile.set(p.getName() + ".Ks", Integer.valueOf(getKillStreak(p) + 1));
/*  50 */     Save();
/*     */   }
/*     */   
/*  53 */   public static void addKills(Player p, int tanto) { cfile.set(p.getName() + ".Kills", Integer.valueOf(getKills(p) + tanto));
/*  54 */     Save();
/*     */   }
/*     */   
/*  57 */   public static void setKillsCmd(Player p, String valor) { cfile.set(p.getName() + ".Kills", valor);
/*  58 */     Save();
/*     */   }
/*     */   
/*     */   public static int getKills(Player p) {
/*  62 */     return cfile.getInt(p.getName() + ".Kills");
/*     */   }
/*     */   
/*     */   public static int getKillsOff(OfflinePlayer off) {
/*  66 */     return cfile.getInt(off.getName() + ".Kills");
/*     */   }
/*     */   
/*     */   public static int getKillStreak(Player p) {
/*  70 */     return cfile.getInt(p.getName() + ".Ks");
/*     */   }
/*     */   
/*     */   public static void setDeaths(Player p)
/*     */   {
/*  75 */     cfile.set(p.getName() + ".Deaths", Integer.valueOf(getDeaths(p) + 1));
/*  76 */     Save();
/*     */   }
/*     */   
/*  79 */   public static void addDeaths(Player p, double valor) { cfile.set(p.getName() + ".Deaths", Double.valueOf(valor));
/*  80 */     Save();
/*     */   }
/*     */   
/*  83 */   public static void setDeathsCmd(Player p, double valor) { cfile.set(p.getName() + ".Deaths", Double.valueOf(getDeaths(p) + valor));
/*  84 */     Save();
/*     */   }
/*     */   
/*  87 */   public static void addKillStreak(Player p, double valor) { cfile.set(p.getName() + ".Ks", Double.valueOf(valor));
/*  88 */     Save();
/*     */   }
/*     */   
/*  91 */   public static void addKillStreakCmd(Player p, double valor) { cfile.set(p.getName() + ".Ks", Double.valueOf(getDeaths(p) + valor));
/*  92 */     Save();
/*     */   }
/*     */   
/*     */   public static int getDeaths(Player p) {
/*  96 */     return cfile.getInt(p.getName() + ".Deaths");
/*     */   }
/*     */   
/*     */   public static void setXp(Player p, int Xp) {
/* 100 */     cfile.set(p.getName() + ".Xp", Integer.valueOf(getXp(p) + Xp));
/* 101 */     Save();
/*     */   }
/*     */   
/* 104 */   public static void addXp(Player p, double Xp) { cfile.set(p.getName() + ".Xp", Double.valueOf(getXp(p) + Xp));
/* 105 */     Save();
/*     */   }
/*     */   
/* 108 */   public static void setXpCmd(Player p, double Xp) { cfile.set(p.getName() + ".Xp", Double.valueOf(getXp(p) + Xp));
/* 109 */     Save();
/*     */   }
/*     */   
/*     */   public static void RemoveXp(Player p, int Xp) {
/* 113 */     if (getXp(p) <= 0) {
/* 114 */       return;
/*     */     }
/* 116 */     cfile.set(p.getName() + ".Xp", Integer.valueOf(getXp(p) - Xp));
/* 117 */     Save();
/*     */   }
/*     */   
/* 120 */   public static void setCoins(Player p, int Coins) { cfile.set(p.getName() + ".Coins", Integer.valueOf(getCoins(p) + Coins));
/* 121 */     Save();
/*     */   }
/*     */   
/* 124 */   public static void addCoins(Player p, double Coins) { cfile.set(p.getName() + ".Coins", Double.valueOf(getCoins(p) + Coins));
/* 125 */     Save();
/*     */   }
/*     */   
/* 128 */   public static void setCoinsCmd(Player p, double Coins) { cfile.set(p.getName() + ".Coins", Double.valueOf(getCoins(p) + Coins));
/* 129 */     Save();
/*     */   }
/*     */   
/*     */   public static void RemoveCoins(Player p, int Coins) {
/* 133 */     if (getCoins(p) <= 0) {
/* 134 */       return;
/*     */     }
/* 136 */     cfile.set(p.getName() + ".Coins", Integer.valueOf(getXp(p) - Coins));
/* 137 */     Save();
/*     */   }
/*     */   
/* 140 */   public static int getCoins(Player p) { return cfile.getInt(p.getName() + ".Coins"); }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void RemoverKS(Player p)
/*     */   {
/* 146 */     cfile.set(p.getName() + ".Ks", Integer.valueOf(getKillStreak(p) - getKillStreak(p)));
/*     */     Player[] arrayOfPlayer;
/* 148 */     int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) { Player players = arrayOfPlayer[i];
/* 149 */       Updater.UpdateScore(players);
/*     */     }
/* 151 */     Save();
/*     */   }
/*     */   
/*     */   public static int getXp(Player p) {
/* 155 */     return cfile.getInt(p.getName() + ".Xp");
/*     */   }
/*     */   
/*     */   public static void Save() {
/*     */     try {
/* 160 */       cfile.save(file);
/*     */     } catch (Exception e) {
/* 162 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\StatsManager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */