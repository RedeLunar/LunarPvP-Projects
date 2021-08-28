/*    */ package com.crowed.authme;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.configs.AuthConfig;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.io.BufferedReader;
/*    */ import java.io.InputStreamReader;
/*    */ import java.net.URL;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Login
/*    */   implements Listener
/*    */ {
/*    */   public static boolean premium(String nome)
/*    */   {
/*    */     try
/*    */     {
/* 29 */       URL url = new URL("https://minecraft.net/haspaid.jsp?user=" + nome);
/*    */       
/* 31 */       String prem = new BufferedReader(new InputStreamReader(url.openStream())).readLine().toUpperCase();
/*    */       
/* 33 */       boolean premium = Boolean.valueOf(prem).booleanValue();
/* 34 */       if (premium) {
/* 35 */         return true;
/*    */       }
/*    */     }
/*    */     catch (Exception e)
/*    */     {
/* 40 */       return false;
/*    */     }
/* 42 */     return false;
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void aoLogin(PlayerJoinEvent e) {
/* 47 */     final Player p = e.getPlayer();
/* 48 */     Main.login.add(p.getName());
/* 49 */     if (AuthConfig.getConfig().config().contains("Login." + p.getName().toLowerCase() + ".senha")) {
/* 50 */       Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable()
/*    */       {
/*    */         public void run() {
/* 53 */           if (Main.login.contains(p.getName())) {
/* 54 */             for (int i = 1; i < 100; i++) {
/* 55 */               p.sendMessage(" ");
/*    */             }
/* 57 */             p.sendMessage(Strings.servidormensagem + ChatColor.GREEN + "Para se Logar Use " + ChatColor.YELLOW + "/login <senha>");
/*    */           }
/*    */         }
/* 60 */       }, 0L, 100L);
/*    */     }
/* 62 */     if (!AuthConfig.getConfig().config().contains("Login." + p.getName().toLowerCase() + ".senha")) {
/* 63 */       Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
/*    */         public void run() {
/* 65 */           if (Main.login.contains(p.getName())) {
/* 66 */             for (int i = 1; i < 100; i++) {
/* 67 */               p.sendMessage(" ");
/*    */             }
/* 69 */             p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Para se Registrar " + ChatColor.YELLOW + "/register <senha>");
/*    */           }
/*    */         }
/* 72 */       }, 0L, 100L);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\authme\Login.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */