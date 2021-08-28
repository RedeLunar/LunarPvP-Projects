/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import com.crowed.api.StatsManager;
/*     */ import com.crowed.manager.Manager;
/*     */ import com.crowed.score.Updater;
/*     */ import com.crowed.utils.Strings;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class SetRank
/*     */   extends Manager
/*     */ {
/*     */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*     */   {
/*  18 */     Player p = (Player)sender;
/*     */     
/*  20 */     if ((p.hasPermission("cmd.setrank")) && 
/*  21 */       (command.getName().equalsIgnoreCase("setrank"))) {
/*  22 */       if (argumentos.length == 0) {
/*  23 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /setrank <player> <unraked , ranked , apprentice , starter , expert , ruby , experient , gold , emerald , elite , safira , supreme , legendary>");
/*  24 */         return;
/*     */       }
/*  26 */       argumentos.length;
/*     */       
/*     */ 
/*  29 */       if (argumentos.length == 2) {
/*  30 */         String darxp = argumentos[1];
/*  31 */         Player player = Bukkit.getPlayer(argumentos[0]);
/*  32 */         if (darxp.equalsIgnoreCase("unranked")) {
/*  33 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  34 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Unranked " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  35 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Unranked");
/*  36 */           Updater.UpdateScore(player);
/*  37 */           return;
/*     */         }
/*  39 */         if (darxp.equalsIgnoreCase("ranked")) {
/*  40 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  41 */           StatsManager.setXp(player, 71);
/*  42 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Ranked " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  43 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Ranked");
/*  44 */           Updater.UpdateScore(player);
/*  45 */           return;
/*     */         }
/*  47 */         if (darxp.equalsIgnoreCase("apprentice")) {
/*  48 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  49 */           StatsManager.setXp(player, 121);
/*  50 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Apprentice " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  51 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Apprentice");
/*  52 */           Updater.UpdateScore(player);
/*  53 */           return;
/*     */         }
/*  55 */         if (darxp.equalsIgnoreCase("starter")) {
/*  56 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  57 */           StatsManager.setXp(player, 191);
/*  58 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Starter " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  59 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Starter");
/*  60 */           Updater.UpdateScore(player);
/*  61 */           return;
/*     */         }
/*  63 */         if (darxp.equalsIgnoreCase("expert")) {
/*  64 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  65 */           StatsManager.setXp(player, 241);
/*  66 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Expert " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  67 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Expert");
/*  68 */           Updater.UpdateScore(player);
/*  69 */           return;
/*     */         }
/*  71 */         if (darxp.equalsIgnoreCase("ruby")) {
/*  72 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  73 */           StatsManager.setXp(player, 401);
/*  74 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Ruby " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  75 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Ruby");
/*  76 */           Updater.UpdateScore(player);
/*  77 */           return;
/*     */         }
/*  79 */         if (darxp.equalsIgnoreCase("experient")) {
/*  80 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  81 */           StatsManager.setXp(player, 541);
/*  82 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Experient " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  83 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Experient");
/*  84 */           Updater.UpdateScore(player);
/*  85 */           return;
/*     */         }
/*  87 */         if (darxp.equalsIgnoreCase("gold")) {
/*  88 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  89 */           StatsManager.setXp(player, 671);
/*  90 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Gold " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  91 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Gold");
/*  92 */           Updater.UpdateScore(player);
/*  93 */           return;
/*     */         }
/*  95 */         if (darxp.equalsIgnoreCase("emerald")) {
/*  96 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/*  97 */           StatsManager.setXp(player, 731);
/*  98 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Emerald " + "Para o player: " + ChatColor.YELLOW + player.getName());
/*  99 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Emerald");
/* 100 */           Updater.UpdateScore(player);
/* 101 */           return;
/*     */         }
/* 103 */         if (darxp.equalsIgnoreCase("elite")) {
/* 104 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/* 105 */           StatsManager.setXp(player, 901);
/* 106 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Elite " + "Para o player: " + ChatColor.YELLOW + player.getName());
/* 107 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Elite");
/* 108 */           Updater.UpdateScore(player);
/* 109 */           return;
/*     */         }
/* 111 */         if (darxp.equalsIgnoreCase("safira")) {
/* 112 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/* 113 */           StatsManager.setXp(player, 1201);
/* 114 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Safira " + "Para o player: " + ChatColor.YELLOW + player.getName());
/* 115 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.WHITE + " Safira");
/* 116 */           Updater.UpdateScore(player);
/* 117 */           return;
/*     */         }
/* 119 */         if (darxp.equalsIgnoreCase("supreme")) {
/* 120 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/* 121 */           StatsManager.setXp(player, 1501);
/* 122 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Supreme " + "Para o player: " + ChatColor.YELLOW + player.getName());
/* 123 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.DARK_RED + " Supreme");
/* 124 */           Updater.UpdateScore(player);
/* 125 */           return;
/*     */         }
/* 127 */         if (darxp.equalsIgnoreCase("legendary")) {
/* 128 */           StatsManager.RemoveXp(player, StatsManager.getXp(player));
/* 129 */           StatsManager.setXp(player, 1701);
/* 130 */           p.sendMessage(ChatColor.GREEN + "Você setou o rank" + ChatColor.WHITE + " Legendary " + "Para o player: " + ChatColor.YELLOW + player.getName());
/* 131 */           player.sendMessage(ChatColor.GREEN + "Seu rank foi promovido para " + ChatColor.DARK_AQUA + " Lengendary");
/* 132 */           Updater.UpdateScore(player);
/* 133 */           return;
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\SetRank.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */