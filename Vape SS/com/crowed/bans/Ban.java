/*     */ package com.crowed.bans;
/*     */ 
/*     */ import com.crowed.api.HorarioAPI;
/*     */ import com.crowed.bans.events.API;
/*     */ import com.crowed.bans.events.Config;
/*     */ import com.crowed.utils.Strings;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.OfflinePlayer;
/*     */ import org.bukkit.Sound;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class Ban
/*     */   implements CommandExecutor
/*     */ {
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  22 */     if (!(sender instanceof Player)) {
/*  23 */       return true;
/*     */     }
/*  25 */     Player jogador = (Player)sender;
/*  26 */     if (cmd.getName().equalsIgnoreCase("ban")) {
/*  27 */       if (!jogador.hasPermission("cmd.bans")) {
/*  28 */         API.sendMsg(jogador, Strings.permissaocomando);
/*  29 */         return true;
/*     */       }
/*  31 */       if (args.length == 0) {
/*  32 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/ban <jogador> <motivo>");
/*     */         
/*  34 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  35 */         return true;
/*     */       }
/*  37 */       Player vitima = Bukkit.getPlayer(args[0]);
/*  38 */       if (vitima == null) {
/*  39 */         OfflinePlayer vitimaoff = Bukkit.getOfflinePlayer(args[0]);
/*  40 */         if (vitimaoff.getName() == jogador.getName()) {
/*  41 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Voce nao pode usar esse comando em vc mesmo !");
/*  42 */           API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  43 */           return true;
/*     */         }
/*  45 */         if (vitimaoff.getName().equals("aiCrowedCodes_")) {
/*  46 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de banir o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " TranquilliYT");
/*  47 */           API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  48 */           return true;
/*     */         }
/*  50 */         if (Config.getConfig().getBans().get("Bans." + vitimaoff.getUniqueId()) != null) {
/*  51 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName() + ChatColor.GRAY + " Já está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Banido !");
/*  52 */           API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  53 */           return true;
/*     */         }
/*  55 */         if (Config.getConfig().getIpBans().get("IPBans." + vitimaoff.getUniqueId()) != null) {
/*  56 */           API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName() + ChatColor.GRAY + " Já está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Banido pelo seu IP!");
/*  57 */           API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  58 */           return true;
/*     */         }
/*  60 */         String Motivo = "";
/*  61 */         for (int i = 1; i < args.length; i++) {
/*  62 */           Motivo = Motivo + args[i] + " ";
/*     */         }
/*  64 */         double l = Config.getConfig().getBans().getDouble("Players Banidos");
/*  65 */         API.sendBC(ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " baniu " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName() + ChatColor.GRAY + ". Motivo: " + ChatColor.GOLD + ChatColor.BOLD + Motivo);
/*  66 */         API.sendMsg(jogador, ChatColor.GRAY + "Você baniu o jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName() + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " .");
/*  67 */         API.sendStaff(ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " baniu o jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitimaoff.getName() + ChatColor.GRAY + ". Motivo: " + ChatColor.YELLOW + ChatColor.BOLD + Motivo);
/*     */         
/*  69 */         Config.getConfig().getBans().set("Players Banidos", Double.valueOf(l + 1.0D));
/*  70 */         Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Nome", vitimaoff.getName());
/*  71 */         Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Banido por", jogador.getName());
/*  72 */         Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Motivo", Motivo);
/*  73 */         Config.getConfig().getBans().set("Bans." + vitimaoff.getUniqueId() + ".Data do banimento", HorarioAPI.getHorario());
/*  74 */         Config.getConfig().saveBans();
/*  75 */         return true;
/*     */       }
/*  77 */       if (vitima.getName() == jogador.getName()) {
/*  78 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Voce nao pode usar esse comando em vc mesmo !");
/*  79 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  80 */         return true;
/*     */       }
/*  82 */       if (Config.getConfig().getBans().get("Bans." + vitima.getUniqueId()) != null) {
/*  83 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " Já está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Banido !");
/*  84 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  85 */         return true;
/*     */       }
/*  87 */       if (Config.getConfig().getIpBans().get("IPBans." + vitima.getUniqueId()) != null) {
/*  88 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " Já está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Banido pelo seu IP!");
/*  89 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  90 */         return true;
/*     */       }
/*  92 */       if (vitima.getName().equals("aiMarcelloCodes")) {
/*  93 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de banir o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " aiMarcelloCodes");
/*  94 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/*  95 */         return true;
/*     */       }
/*  97 */       if (args.length == 1) {
/*  98 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/ban <jogador> <motivo>");
/*  99 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 100 */         return true;
/*     */       }
/* 102 */       String Motivo = "";
/* 103 */       for (int i = 1; i < args.length; i++) {
/* 104 */         Motivo = Motivo + args[i] + " ";
/*     */       }
/* 106 */       double l = Config.getConfig().getBans().getDouble("Players Banidos");
/* 107 */       API.sendMsg(jogador, ChatColor.GRAY + "Você baniu o jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " .");
/* 108 */       API.sendBC(ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " baniu " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + ". Motivo: " + ChatColor.YELLOW + ChatColor.BOLD + Motivo);
/* 109 */       API.sendStaff(ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " baniu o jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + ". Motivo: " + ChatColor.YELLOW + ChatColor.BOLD + Motivo);
/* 110 */       vitima.kickPlayer("§7Você foi §4§lPERMANENTEMENTE §7banido do servidor!\n\n§7Username banido: §6§l" + vitima.getName() + "\n" + "§7Banido por: §6§l" + jogador.getName() + "\n" + "§7Motivo: §6§l" + Motivo + "\n" + "§7Vencimento : §6§lNUNCA" + "\n" + "§7Data do banimento: §6§l" + HorarioAPI.getHorario() + "\n" + "§7Compre seu §6§lUNBAN §7em nossa loja: §6§nEm Breve");
/*     */       
/* 112 */       Config.getConfig().getBans().set("Players Banidos", Double.valueOf(l + 1.0D));
/* 113 */       Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Nome", vitima.getName());
/* 114 */       Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Banido por", jogador.getName());
/* 115 */       Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Motivo", Motivo);
/* 116 */       Config.getConfig().getBans().set("Bans." + vitima.getUniqueId() + ".Data do banimento", HorarioAPI.getHorario());
/* 117 */       Config.getConfig().saveBans();
/* 118 */       return true;
/*     */     }
/* 120 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\Ban.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */