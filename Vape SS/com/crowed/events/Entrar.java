/*     */ package com.crowed.events;
/*     */ 
/*     */ import ca.wacos.nametagedit.NametagAPI;
/*     */ import com.crowed.api.StatsManager;
/*     */ import com.crowed.api.WarpsAPI;
/*     */ import com.crowed.comandos.Evento;
/*     */ import com.crowed.comandos.Habilitar;
/*     */ import com.crowed.manager.Manager;
/*     */ import com.crowed.score.Updater;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.player.PlayerJoinEvent;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ 
/*     */ public class Entrar implements org.bukkit.event.Listener
/*     */ {
/*     */   @EventHandler
/*     */   public static void EntrarNoServidor(PlayerJoinEvent event)
/*     */   {
/*  23 */     event.setJoinMessage(null);
/*  24 */     Player p = event.getPlayer();
/*  25 */     p.getInventory().clear();
/*  26 */     WarpsAPI.Ir(p, "Spawn");
/*  27 */     Proteção.setImortalidade(p, true);
/*  28 */     com.crowed.api.KitAPI.TirarKit(p);
/*  29 */     Updater.UpdateScore(p);
/*  30 */     TagNoServidor(p);
/*  31 */     Evento.participantes.remove(p.getName());
/*  32 */     p.getInventory().setArmorContents(null);
/*  33 */     p.setFoodLevel(20);
/*  34 */     p.setGameMode(GameMode.SURVIVAL);
/*  35 */     StatsManager.RemoverKS(p);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public static void TagNoServidor(Player p)
/*     */   {
/*  42 */     if (p.hasPermission("tag.dono")) {
/*  43 */       NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_RED + ChatColor.BOLD + "DONO " + ChatColor.DARK_RED, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  44 */       p.setDisplayName(ChatColor.DARK_RED + ChatColor.BOLD + "DONO " + ChatColor.DARK_RED + p.getName());
/*  45 */       return;
/*     */     }
/*  47 */     if (p.hasPermission("tag.admin+")) {
/*  48 */       NametagAPI.setNametagHard(p.getName(), ChatColor.RED + ChatColor.BOLD + "ADMIN+ " + ChatColor.RED, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  49 */       p.setDisplayName(ChatColor.RED + ChatColor.BOLD + "ADMIN+" + ChatColor.RED + p.getName());
/*  50 */       return;
/*     */     }
/*  52 */     if (p.hasPermission("tag.admin")) {
/*  53 */       NametagAPI.setNametagHard(p.getName(), ChatColor.RED + ChatColor.BOLD + "ADMIN " + ChatColor.RED, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  54 */       p.setDisplayName(ChatColor.RED + ChatColor.BOLD + "ADMIN " + ChatColor.RED + p.getName());
/*  55 */       return;
/*     */     }
/*  57 */     if (p.hasPermission("tag.gerente")) {
/*  58 */       NametagAPI.setNametagHard(p.getName(), ChatColor.RED + ChatColor.BOLD + "GERENTE " + ChatColor.RED, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  59 */       p.setDisplayName(ChatColor.RED + ChatColor.BOLD + "GERENTE " + ChatColor.RED + p.getName());
/*  60 */       return;
/*     */     }
/*  62 */     if (p.hasPermission("tag.mod+")) {
/*  63 */       NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+ " + ChatColor.DARK_PURPLE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  64 */       p.setDisplayName(ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+ " + ChatColor.DARK_PURPLE + p.getName());
/*  65 */       return;
/*     */     }
/*  67 */     if (p.hasPermission("tag.mod")) {
/*  68 */       NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD " + ChatColor.DARK_PURPLE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  69 */       p.setDisplayName(ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD " + ChatColor.DARK_PURPLE + p.getName());
/*  70 */       return;
/*     */     }
/*  72 */     if (p.hasPermission("tag.trial")) {
/*  73 */       NametagAPI.setNametagHard(p.getName(), ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "TRIAL " + ChatColor.LIGHT_PURPLE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  74 */       p.setDisplayName(ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "TRIAL " + ChatColor.LIGHT_PURPLE + p.getName());
/*  75 */       return;
/*     */     }
/*  77 */     if (p.hasPermission("tag.youtuber+")) {
/*  78 */       NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_AQUA + ChatColor.BOLD + "YT+ " + ChatColor.DARK_AQUA, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  79 */       p.setDisplayName(ChatColor.DARK_AQUA + ChatColor.BOLD + "YT+ " + ChatColor.DARK_AQUA + p.getName());
/*  80 */       return;
/*     */     }
/*  82 */     if (p.hasPermission("tag.helper")) {
/*  83 */       NametagAPI.setNametagHard(p.getName(), ChatColor.BLUE + ChatColor.BOLD + "HELPER " + ChatColor.BLUE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  84 */       p.setDisplayName(ChatColor.BLUE + ChatColor.BOLD + "HELPER " + ChatColor.BLUE + p.getName());
/*  85 */       return;
/*     */     }
/*  87 */     if (p.hasPermission("tag.builder")) {
/*  88 */       NametagAPI.setNametagHard(p.getName(), ChatColor.YELLOW + ChatColor.BOLD + "BUILDER " + ChatColor.YELLOW, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  89 */       p.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "BUILDER " + ChatColor.YELLOW + p.getName());
/*  90 */       return;
/*     */     }
/*  92 */     if (p.hasPermission("tag.builder+")) {
/*  93 */       NametagAPI.setNametagHard(p.getName(), ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+ " + ChatColor.YELLOW, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  94 */       p.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+ " + ChatColor.YELLOW + p.getName());
/*  95 */       return;
/*     */     }
/*  97 */     if (p.hasPermission("tag.youtuber")) {
/*  98 */       NametagAPI.setNametagHard(p.getName(), ChatColor.AQUA + "YT" + ChatColor.BOLD + "YT " + ChatColor.AQUA, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  99 */       p.setDisplayName(ChatColor.AQUA + ChatColor.BOLD + "YT " + ChatColor.AQUA + p.getName());
/* 100 */       return;
/*     */     }
/* 102 */     if ((p.hasPermission("tag.pro")) || (Habilitar.pro)) {
/* 103 */       NametagAPI.setNametagHard(p.getName(), ChatColor.GOLD + ChatColor.BOLD + "PRO " + ChatColor.GOLD, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 104 */       p.setDisplayName(ChatColor.GOLD + ChatColor.BOLD + "PRO " + ChatColor.GOLD + p.getName());
/* 105 */       return;
/*     */     }
/* 107 */     if ((p.hasPermission("tag.mvp")) || (Habilitar.mvp)) {
/* 108 */       NametagAPI.setNametagHard(p.getName(), ChatColor.BLUE + ChatColor.BOLD + "MVP " + ChatColor.BLUE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 109 */       p.setDisplayName(ChatColor.BLUE + ChatColor.BOLD + "MVP " + ChatColor.BLUE + p.getName());
/* 110 */       return;
/*     */     }
/* 112 */     if ((p.hasPermission("tag.vip")) || (Habilitar.vip)) {
/* 113 */       NametagAPI.setNametagHard(p.getName(), ChatColor.GREEN + ChatColor.BOLD + "VIP " + ChatColor.GREEN, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 114 */       p.setDisplayName(ChatColor.GREEN + ChatColor.BOLD + "VIP " + ChatColor.GREEN + p.getName());
/* 115 */       return;
/*     */     }
/* 117 */     NametagAPI.setNametagHard(p.getName(), ChatColor.GRAY, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 118 */     p.setDisplayName(ChatColor.GRAY + p.getName());
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\Entrar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */