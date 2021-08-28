/*    */ package com.crowed.configs;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.configuration.file.YamlConfiguration;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ArenaConfig
/*    */ {
/* 15 */   public static ArrayList<String> login = new ArrayList();
/*    */   
/* 17 */   public static ArenaConfig pasta = new ArenaConfig();
/*    */   FileConfiguration Arenas;
/*    */   File FileArenas;
/*    */   
/* 21 */   public static ArenaConfig getConfig() { return pasta; }
/*    */   
/*    */   public void ConfigEnable(Plugin plugin) {
/* 24 */     if (!plugin.getDataFolder().exists()) {
/* 25 */       plugin.getDataFolder().mkdir();
/*    */     }
/* 27 */     this.FileArenas = new File(plugin.getDataFolder(), "Arenas.yml");
/* 28 */     if (this.FileArenas.exists()) {
/*    */       try {
/* 30 */         this.FileArenas.createNewFile();
/*    */       } catch (IOException e) {
/* 32 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 35 */     this.Arenas = YamlConfiguration.loadConfiguration(this.FileArenas);
/*    */   }
/*    */   
/* 38 */   public FileConfiguration config() { return this.Arenas; }
/*    */   
/*    */   public void saveConfigs() {
/*    */     try {
/* 42 */       this.Arenas.save(this.FileArenas);
/*    */     } catch (IOException e) {
/* 44 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public class Arenas
/*    */   {
/*    */     public Arenas() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\configs\ArenaConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */