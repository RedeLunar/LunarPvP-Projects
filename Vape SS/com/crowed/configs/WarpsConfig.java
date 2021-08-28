/*    */ package com.crowed.configs;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WarpsConfig
/*    */ {
/* 20 */   public static WarpsConfig pasta = new WarpsConfig();
/*    */   FileConfiguration Warps;
/*    */   File FileWarps;
/*    */   
/* 24 */   public static WarpsConfig getConfig() { return pasta; }
/*    */   
/*    */   public void ConfigEnable(Plugin plugin) {
/* 27 */     if (!plugin.getDataFolder().exists()) {
/* 28 */       plugin.getDataFolder().mkdir();
/*    */     }
/* 30 */     this.FileWarps = new File(plugin.getDataFolder(), "warps.yml");
/* 31 */     if (this.FileWarps.exists()) {
/*    */       try {
/* 33 */         this.FileWarps.createNewFile();
/*    */       } catch (IOException e) {
/* 35 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 38 */     this.Warps = YamlConfiguration.loadConfiguration(this.FileWarps);
/*    */   }
/*    */   
/* 41 */   public FileConfiguration config() { return this.Warps; }
/*    */   
/*    */   public void saveConfigs() {
/*    */     try {
/* 45 */       this.Warps.save(this.FileWarps);
/*    */     } catch (IOException e) {
/* 47 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public static class Warps
/*    */   {
/*    */     public static void Ir(Player p, String string) {}
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\configs\WarpsConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */