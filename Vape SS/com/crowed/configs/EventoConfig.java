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
/*    */ public class EventoConfig
/*    */ {
/* 14 */   public static EventoConfig pasta = new EventoConfig();
/*    */   FileConfiguration Evento;
/*    */   File FileEvento;
/*    */   
/* 18 */   public static EventoConfig getConfig() { return pasta; }
/*    */   
/*    */   public void ConfigEnable(Plugin plugin) {
/* 21 */     if (!plugin.getDataFolder().exists()) {
/* 22 */       plugin.getDataFolder().mkdir();
/*    */     }
/* 24 */     this.FileEvento = new File(plugin.getDataFolder(), "Evento.yml");
/* 25 */     if (this.FileEvento.exists()) {
/*    */       try {
/* 27 */         this.FileEvento.createNewFile();
/*    */       } catch (IOException e) {
/* 29 */         e.printStackTrace();
/*    */       }
/*    */     }
/* 32 */     this.Evento = YamlConfiguration.loadConfiguration(this.FileEvento);
/*    */   }
/*    */   
/* 35 */   public FileConfiguration config() { return this.Evento; }
/*    */   
/*    */   public void saveConfigs() {
/*    */     try {
/* 39 */       this.Evento.save(this.FileEvento);
/*    */     } catch (IOException e) {
/* 41 */       e.printStackTrace();
/*    */     }
/*    */   }
/*    */   
/*    */   public class Evento
/*    */   {
/*    */     public Evento() {}
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\configs\EventoConfig.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */