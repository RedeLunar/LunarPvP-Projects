/*     */ package com.crowed.bans.events;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.configuration.file.YamlConfiguration;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ 
/*     */ 
/*     */ public class Config
/*     */ {
/*  12 */   public static Config Config = new Config();
/*     */   
/*     */   FileConfiguration kStats;
/*     */   
/*     */   File Stats;
/*     */   
/*     */   FileConfiguration kDamageCoins;
/*     */   
/*     */   File DamageCoins;
/*     */   
/*     */   FileConfiguration kRanks;
/*     */   
/*     */   File Ranks;
/*     */   
/*     */   FileConfiguration kBans;
/*     */   
/*     */   File Bans;
/*     */   
/*     */   FileConfiguration kIpBans;
/*     */   
/*     */   File IpBans;
/*     */   
/*     */   public FileConfiguration kTempBans;
/*     */   
/*     */   File TempBans;
/*     */   FileConfiguration kMute;
/*     */   File Mute;
/*     */   public FileConfiguration kTempMute;
/*     */   File TempMute;
/*     */   FileConfiguration kFeast;
/*     */   File Feast;
/*     */   FileConfiguration kTroll;
/*     */   File Troll;
/*     */   FileConfiguration kJogadores;
/*     */   File Jogadores;
/*     */   FileConfiguration kAuth;
/*     */   File auth;
/*     */   FileConfiguration kManutencao;
/*     */   File Manutencao;
/*     */   
/*     */   public static Config getConfig()
/*     */   {
/*  54 */     return Config;
/*     */   }
/*     */   
/*     */   public void setupConfig(Plugin plugin) {
/*  58 */     if (!plugin.getDataFolder().exists()) {
/*  59 */       plugin.getDataFolder().mkdir();
/*     */     }
/*  61 */     this.Stats = new File(plugin.getDataFolder(), "Status.yml");
/*     */     
/*  63 */     if (this.Stats.exists()) {
/*     */       try {
/*  65 */         this.Stats.createNewFile();
/*     */       } catch (IOException e) {
/*  67 */         e.printStackTrace();
/*     */       }
/*     */     }
/*  70 */     this.kStats = YamlConfiguration.loadConfiguration(this.Stats);
/*     */     
/*  72 */     this.DamageCoins = new File(plugin.getDataFolder(), "DamageCoins.yml");
/*     */     
/*  74 */     if (this.DamageCoins.exists()) {
/*     */       try {
/*  76 */         this.DamageCoins.createNewFile();
/*     */       } catch (IOException e) {
/*  78 */         e.printStackTrace();
/*     */       }
/*     */     }
/*  81 */     this.kDamageCoins = YamlConfiguration.loadConfiguration(this.DamageCoins);
/*     */     
/*  83 */     this.Ranks = new File(plugin.getDataFolder(), "Ranks.yml");
/*     */     
/*  85 */     if (this.Ranks.exists()) {
/*     */       try {
/*  87 */         this.Ranks.createNewFile();
/*     */       } catch (IOException e) {
/*  89 */         e.printStackTrace();
/*     */       }
/*     */     }
/*  92 */     this.kRanks = YamlConfiguration.loadConfiguration(this.Ranks);
/*     */     
/*  94 */     this.Bans = new File(plugin.getDataFolder(), "Bans.yml");
/*     */     
/*  96 */     if (this.Bans.exists()) {
/*     */       try {
/*  98 */         this.Bans.createNewFile();
/*     */       } catch (IOException e) {
/* 100 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 103 */     this.kBans = YamlConfiguration.loadConfiguration(this.Bans);
/*     */     
/* 105 */     this.TempBans = new File(plugin.getDataFolder(), "TempBans.yml");
/*     */     
/* 107 */     if (this.TempBans.exists()) {
/*     */       try {
/* 109 */         this.TempBans.createNewFile();
/*     */       } catch (IOException e) {
/* 111 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 114 */     this.kTempBans = YamlConfiguration.loadConfiguration(this.TempBans);
/*     */     
/* 116 */     this.Mute = new File(plugin.getDataFolder(), "Mute.yml");
/*     */     
/* 118 */     if (this.Mute.exists()) {
/*     */       try {
/* 120 */         this.Mute.createNewFile();
/*     */       } catch (IOException e) {
/* 122 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 125 */     this.kMute = YamlConfiguration.loadConfiguration(this.Mute);
/*     */     
/* 127 */     this.TempMute = new File(plugin.getDataFolder(), "TempMute.yml");
/*     */     
/* 129 */     if (this.TempMute.exists()) {
/*     */       try {
/* 131 */         this.TempMute.createNewFile();
/*     */       } catch (IOException e) {
/* 133 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 136 */     this.kTempMute = YamlConfiguration.loadConfiguration(this.TempMute);
/*     */     
/* 138 */     this.IpBans = new File(plugin.getDataFolder(), "IpBans.yml");
/*     */     
/* 140 */     if (this.IpBans.exists()) {
/*     */       try {
/* 142 */         this.IpBans.createNewFile();
/*     */       } catch (IOException e) {
/* 144 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 147 */     this.kIpBans = YamlConfiguration.loadConfiguration(this.IpBans);
/*     */     
/* 149 */     this.Feast = new File(plugin.getDataFolder(), "Feast.yml");
/*     */     
/* 151 */     if (this.Feast.exists()) {
/*     */       try {
/* 153 */         this.Feast.createNewFile();
/*     */       } catch (IOException e) {
/* 155 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 158 */     this.kFeast = YamlConfiguration.loadConfiguration(this.Feast);
/*     */     
/* 160 */     this.Troll = new File(plugin.getDataFolder(), "Troll.yml");
/*     */     
/* 162 */     if (this.Troll.exists()) {
/*     */       try {
/* 164 */         this.Troll.createNewFile();
/*     */       } catch (IOException e) {
/* 166 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 169 */     this.kTroll = YamlConfiguration.loadConfiguration(this.Troll);
/*     */     
/* 171 */     this.Jogadores = new File(plugin.getDataFolder(), "Jogadores.yml");
/*     */     
/* 173 */     if (this.Jogadores.exists()) {
/*     */       try {
/* 175 */         this.Jogadores.createNewFile();
/*     */       } catch (IOException e) {
/* 177 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 180 */     this.kJogadores = YamlConfiguration.loadConfiguration(this.Jogadores);
/*     */     
/* 182 */     this.auth = new File(plugin.getDataFolder(), "auth.yml");
/*     */     
/* 184 */     if (this.auth.exists()) {
/*     */       try {
/* 186 */         this.auth.createNewFile();
/*     */       } catch (IOException e) {
/* 188 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 191 */     this.kAuth = YamlConfiguration.loadConfiguration(this.auth);
/*     */     
/* 193 */     this.Manutencao = new File(plugin.getDataFolder(), "Manutencao.yml");
/*     */     
/* 195 */     if (this.Manutencao.exists()) {
/*     */       try {
/* 197 */         this.Manutencao.createNewFile();
/*     */       } catch (IOException e) {
/* 199 */         e.printStackTrace();
/*     */       }
/*     */     }
/* 202 */     this.kManutencao = YamlConfiguration.loadConfiguration(this.Manutencao);
/*     */   }
/*     */   
/* 205 */   public FileConfiguration getStats() { return this.kStats; }
/*     */   
/*     */   public FileConfiguration getDC() {
/* 208 */     return this.kDamageCoins;
/*     */   }
/*     */   
/* 211 */   public FileConfiguration getRank() { return this.kRanks; }
/*     */   
/*     */   public FileConfiguration getBans() {
/* 214 */     return this.kBans;
/*     */   }
/*     */   
/* 217 */   public FileConfiguration getIpBans() { return this.kIpBans; }
/*     */   
/*     */   public FileConfiguration getTempBans() {
/* 220 */     return this.kTempBans;
/*     */   }
/*     */   
/* 223 */   public FileConfiguration getMute() { return this.kMute; }
/*     */   
/*     */   public FileConfiguration getTempMute() {
/* 226 */     return this.kTempMute;
/*     */   }
/*     */   
/* 229 */   public FileConfiguration getWarp() { return this.kFeast; }
/*     */   
/*     */   public FileConfiguration getTroll() {
/* 232 */     return this.kTroll;
/*     */   }
/*     */   
/* 235 */   public FileConfiguration getJogadores() { return this.kJogadores; }
/*     */   
/*     */   public FileConfiguration getAuth() {
/* 238 */     return this.kAuth;
/*     */   }
/*     */   
/* 241 */   public FileConfiguration getManutencao() { return this.kManutencao; }
/*     */   
/*     */   public void saveStats()
/*     */   {
/*     */     try {
/* 246 */       this.kStats.save(this.Stats);
/*     */     } catch (IOException e) {
/* 248 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveDamageCoins() {
/* 253 */     try { this.kDamageCoins.save(this.DamageCoins);
/*     */     } catch (IOException e) {
/* 255 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveRanks() {
/* 260 */     try { this.kRanks.save(this.Ranks);
/*     */     } catch (IOException e) {
/* 262 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveBans() {
/* 267 */     try { this.kBans.save(this.Bans);
/*     */     } catch (IOException e) {
/* 269 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveTempBans() {
/* 274 */     try { this.kTempBans.save(this.TempBans);
/*     */     } catch (IOException e) {
/* 276 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveMute() {
/* 281 */     try { this.kMute.save(this.Mute);
/*     */     } catch (IOException e) {
/* 283 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveTempMute() {
/* 288 */     try { this.kTempMute.save(this.TempMute);
/*     */     } catch (IOException e) {
/* 290 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveIpBans() {
/* 295 */     try { this.kIpBans.save(this.IpBans);
/*     */     } catch (IOException e) {
/* 297 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveFeast() {
/* 302 */     try { this.kFeast.save(this.Feast);
/*     */     } catch (IOException e) {
/* 304 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveTroll() {
/* 309 */     try { this.kTroll.save(this.Troll);
/*     */     } catch (IOException e) {
/* 311 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveJogadores() {
/* 316 */     try { this.kJogadores.save(this.Jogadores);
/*     */     } catch (IOException e) {
/* 318 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveAuth() {
/* 323 */     try { this.kAuth.save(this.auth);
/*     */     } catch (IOException e) {
/* 325 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */   
/*     */   public void saveManutencao() {
/* 330 */     try { this.kManutencao.save(this.Manutencao);
/*     */     } catch (IOException e) {
/* 332 */       e.printStackTrace();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\events\Config.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */