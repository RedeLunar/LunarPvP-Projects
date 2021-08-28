/*    */ package com.crowed.score;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.KitAPI;
/*    */ import com.crowed.api.StatsManager;
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.score.utils.BlinkEffect;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scheduler.BukkitRunnable;
/*    */ import org.bukkit.scoreboard.Objective;
/*    */ import org.bukkit.scoreboard.Scoreboard;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Updater
/*    */ {
/*    */   public void run()
/*    */   {
/* 31 */     new BukkitRunnable()
/*    */     {
/*    */       public void run()
/*    */       {
/* 25 */         Main.bk.next();
/* 26 */         Player[] arrayOfPlayer; int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) { Player p = arrayOfPlayer[i];
/* 27 */           Updater.this.update(p.getScoreboard());
/*    */         }
/*    */         
/*    */       }
/* 31 */     }.runTaskTimer(Main.instance, 0L, 3L);
/*    */   }
/*    */   
/*    */   public static void UpdateScore(Player p)
/*    */   {
/* 36 */     ScoreboardAPI score = new ScoreboardAPI("§e§lVape§f§lMc");
/* 37 */     score.adicionarLinha("§c    ", Integer.valueOf(13));
/* 38 */     score.adicionarLinha("§1", Integer.valueOf(12));
/* 39 */     score.adicionarLinha("§7 Grupo: " + Manager.GrupoJoin(p), Integer.valueOf(11));
/* 40 */     score.adicionarLinha("§7 Kit: §a" + KitAPI.getKit(p), Integer.valueOf(10));
/* 41 */     score.adicionarLinha("§1", Integer.valueOf(9));
/* 42 */     score.adicionarLinha("§7 Rank: " + Manager.RankAndPrefix(p), Integer.valueOf(8));
/* 43 */     score.adicionarLinha("§7 Xp: §a" + StatsManager.getXp(p), Integer.valueOf(7));
/* 44 */     score.adicionarLinha("§7 Coins: §a" + StatsManager.getCoins(p), Integer.valueOf(6));
/* 45 */     score.adicionarLinha("§1", Integer.valueOf(5));
/* 46 */     score.adicionarLinha("§7 Kills: §a" + StatsManager.getKills(p), Integer.valueOf(4));
/* 47 */     score.adicionarLinha("§7 Deaths: §c" + StatsManager.getDeaths(p), Integer.valueOf(3));
/* 48 */     score.adicionarLinha("§7 Streak: §e" + StatsManager.getKillStreak(p), Integer.valueOf(2));
/* 49 */     score.adicionarLinha("§2", Integer.valueOf(1));
/* 50 */     score.setarScoreboard();
/* 51 */     p.setScoreboard(score.pegarScoreboard());
/*    */   }
/*    */   
/*    */   public void update(final Scoreboard score) {
/* 55 */     Thread th = new Thread(new Runnable()
/*    */     {
/*    */       public void run()
/*    */       {
/* 59 */         Objective obj = score.getObjective("mcodes");
/* 60 */         obj.setDisplayName(Main.bk.getText());
/*    */       }
/*    */       
/* 63 */     });
/* 64 */     th.start();
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\score\Updater.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */