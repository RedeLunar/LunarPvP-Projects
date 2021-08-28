/*     */ package com.crowed.bans;
/*     */ 
/*     */ import com.crowed.bans.events.API;
/*     */ import com.crowed.bans.events.Config;
/*     */ import com.crowed.utils.Strings;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.OfflinePlayer;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class Unban implements CommandExecutor
/*     */ {
/*     */   private static String ip(OfflinePlayer vitima)
/*     */   {
/*  19 */     return (String)Config.getConfig().getIpBans().get("IPBans." + vitima.getUniqueId() + ".IP do Jogador");
/*     */   }
/*     */   
/*     */ 
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  25 */     Player jogador = (Player)sender;
/*  26 */     if (cmd.getName().equalsIgnoreCase("unban")) {
/*  27 */       if (!jogador.hasPermission("cmd.bans")) {
/*  28 */         API.sendMsg(jogador, Strings.permissaocomando);
/*  29 */         return true;
/*     */       }
/*  31 */       if (args.length == 0) {
/*  32 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/unban <Ban , Ipban , Mute , > [jogador]");
/*  33 */         return true;
/*     */       }
/*  35 */       if (args[0].equalsIgnoreCase("ban")) {
/*  36 */         if (args.length == 1) {
/*  37 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/unban <Ban> [jogador]");
/*  38 */           return true;
/*     */         }
/*  40 */         OfflinePlayer vitima = Bukkit.getOfflinePlayer(args[1]);
/*  41 */         if (Config.getConfig().getBans().get("Bans." + vitima.getUniqueId()) == null) {
/*  42 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " não está " + ChatColor.YELLOW + ChatColor.BOLD + "Banido §7.");
/*  43 */           return true;
/*     */         }
/*  45 */         if (!(sender instanceof Player)) {
/*  46 */           API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Player " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " Foi desbanido pelo: §6§lCONSOLE");
/*     */         } else {
/*  48 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você desbaniu o jogador: " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName());
/*  49 */           API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " desbaniu o jogador: " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName());
/*     */         }
/*  51 */         double l = Config.getConfig().getBans().getDouble("Players Banidos");
/*  52 */         Config.getConfig().getBans().set("Players Banidos", Double.valueOf(l - 1.0D));
/*  53 */         Config.getConfig().getBans().set("Bans." + vitima.getUniqueId(), null);
/*  54 */         Config.getConfig().saveBans();
/*  55 */         return true;
/*     */       }
/*  57 */       if (args[0].equalsIgnoreCase("ipban")) {
/*  58 */         if (args.length == 1) {
/*  59 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/unban <ipBan> [jogador]");
/*  60 */           return true;
/*     */         }
/*  62 */         OfflinePlayer vitima = Bukkit.getOfflinePlayer(args[1]);
/*  63 */         if (Config.getConfig().getIpBans().get("IPBans." + vitima.getUniqueId()) == null) {
/*  64 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " não está " + ChatColor.YELLOW + ChatColor.BOLD + "Banido (ip)§7.");
/*  65 */           return true;
/*     */         }
/*  67 */         if (!(sender instanceof Player)) {
/*  68 */           API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Player " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " Foi desbanido pelo: §6§lCONSOLE");
/*     */         } else {
/*  70 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você desbaniu o jogador: " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName());
/*  71 */           API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " desbaniu (ip) o jogador: " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName());
/*     */         }
/*  73 */         Bukkit.unbanIP(ip(vitima));
/*  74 */         Config.getConfig().getIpBans().set("IPBans." + vitima.getUniqueId(), null);
/*  75 */         Config.getConfig().saveIpBans();
/*  76 */         return true;
/*     */       }
/*  78 */       if (args[0].equalsIgnoreCase("mute")) {
/*  79 */         if (args.length == 1) {
/*  80 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/unban <Mute> [jogador]");
/*  81 */           return true;
/*     */         }
/*  83 */         Player vitima = Bukkit.getPlayer(args[1]);
/*  84 */         if (vitima == null) {
/*  85 */           OfflinePlayer vitimaoff = Bukkit.getOfflinePlayer(args[1]);
/*  86 */           if (Config.getConfig().getMute().get("Mute." + vitimaoff.getUniqueId()) == null) {
/*  87 */             API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName() + ChatColor.GRAY + " não está " + ChatColor.YELLOW + ChatColor.BOLD + "Mutado§7 .");
/*  88 */             return true;
/*     */           }
/*  90 */           if (!(sender instanceof Player)) {
/*  91 */             API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Console Desmutou o" + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName());
/*     */           } else {
/*  93 */             API.sendMsg(jogador, "Você desmutou o jogador: " + vitimaoff.getName());
/*  94 */             API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " desmutou o jogador: " + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName());
/*     */           }
/*  96 */           Config.getConfig().getMute().set("Mute." + vitimaoff.getUniqueId(), null);
/*  97 */           Config.getConfig().saveMute();
/*  98 */           return true;
/*     */         }
/* 100 */         if (Config.getConfig().getMute().get("Mute." + vitima.getUniqueId()) == null) {
/* 101 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " não está " + ChatColor.YELLOW + ChatColor.BOLD + "Mutado§7 .");
/* 102 */           return true;
/*     */         }
/* 104 */         if (!(sender instanceof Player)) {
/* 105 */           API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Console Desmutou o" + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName());
/*     */         } else {
/* 107 */           API.sendMsg(jogador, "Você desmutou o jogador: " + vitima.getName());
/* 108 */           API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " desmutou o jogador: " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName());
/*     */         }
/* 110 */         Config.getConfig().getMute().set("Mute." + vitima.getUniqueId(), null);
/* 111 */         Config.getConfig().saveMute();
/* 112 */         return true;
/*     */       }
/* 114 */       API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/unban <Ban , Ipban , Mute , > [jogador]");
/* 115 */       return true;
/*     */     }
/* 117 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\Unban.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */