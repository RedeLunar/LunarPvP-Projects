/*    */ package com.crowed.api;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import java.util.HashMap;
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ 
/*    */ public class CooldownAPI
/*    */ {
/* 14 */   public static HashMap<String, Long> Cooldown = new HashMap();
/*    */   
/*    */   public static void addCooldown(Player jogador, int Tempo) {
/* 17 */     Cooldown.put(jogador.getName(), Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(Tempo)));
/*    */     
/* 19 */     Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*    */       public void run() {
/* 21 */         CooldownAPI.tirarCooldown(CooldownAPI.this);
/*    */       }
/* 23 */     }, Tempo * 20);
/*    */   }
/*    */   
/*    */   public static void tirarCooldown(Player p)
/*    */   {
/* 28 */     Cooldown.remove(p.getName());
/*    */   }
/*    */   
/*    */   public static boolean SemCooldown(Player p) {
/* 32 */     if ((!Cooldown.containsKey(p.getName())) || (((Long)Cooldown.get(p.getName())).longValue() <= System.currentTimeMillis())) {
/* 33 */       return true;
/*    */     }
/* 35 */     return false;
/*    */   }
/*    */   
/*    */   public static long Cooldown(Player p) {
/* 39 */     long tempo = TimeUnit.MILLISECONDS.toSeconds(((Long)Cooldown.get(p.getName())).longValue() - System.currentTimeMillis());
/*    */     
/* 41 */     if ((Cooldown.containsKey(p.getName())) || (((Long)Cooldown.get(p.getName())).longValue() > System.currentTimeMillis())) {
/* 42 */       return tempo;
/*    */     }
/* 44 */     return 0L;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\CooldownAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */