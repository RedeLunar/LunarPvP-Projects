/*    */ package com.crowed.configs;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AuthConfig
/*    */ {
/* 15 */   public static AuthConfig pasta = new AuthConfig();
/*    */   
/*    */   FileConfiguration Auth;
/*    */   
/* 19 */   public static AuthConfig getConfig() { return pasta; }
/*    */   
/*    */   public void ConfigEnable(Plugin plugin) {
/* 22 */     if (!plugin.getDataFolder().exists()) {
/* 23 */       plugin.getDataFolder().mkdir();
/*    */     }
/* 25 */     this.FileAuth = new File(plugin.getDataFolder(), "Auth.yml");
/* 26 */     if (this.FileAuth.exists()) {
/*    */       try {
/* 28 */         this.FileAuth.createNewFile();
/*    */       } catch (IOException e) {
/* 30 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 33 */     this.Auth = YamlConfiguration.loadConfiguration(this.FileAuth);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 38 */   public static Plugin getPlugin() { return plugin; }
/*    */   
/*    */   File FileAuth;
/*    */   public static Plugin plugin;
/* 42 */   public FileConfiguration config() { return this.Auth; }
/*    */   
/*    */   public void saveConfigs() {
/*    */     try {
/* 46 */       this.Auth.save(this.FileAuth);
/*    */     } catch (IOException e) {
/* 48 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public class Auth
/*    */   {
/*    */     public Auth() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\configs\AuthConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */