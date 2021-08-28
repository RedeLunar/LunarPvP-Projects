/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import ca.wacos.nametagedit.NametagAPI;
/*     */ import com.crowed.manager.Manager;
/*     */ import com.crowed.score.Updater;
/*     */ import com.crowed.utils.Strings;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ 
/*     */ public class GroupSet
/*     */   implements CommandExecutor
/*     */ {
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  20 */     Player p = (Player)sender;
/*  21 */     if ((sender instanceof Player)) {
/*  22 */       if (cmd.getName().equalsIgnoreCase("groupset")) {
/*  23 */         if (!sender.hasPermission("cmd.groupset")) {
/*  24 */           sender.sendMessage(Strings.permissaocomando);
/*  25 */           return true;
/*     */         }
/*  27 */         if (args.length == 0) {
/*  28 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /groupset <player> <grupo>");
/*  29 */           return true;
/*     */         }
/*  31 */         args.length;
/*     */         
/*     */ 
/*  34 */         if (args.length == 2) {
/*  35 */           Player playe = Bukkit.getPlayer(args[0]);
/*  36 */           if (playe == null) {
/*  37 */             p.sendMessage(Strings.playeroffiline);
/*  38 */             return true;
/*     */           }
/*  40 */           String grupo = args[1];
/*  41 */           Player player = Bukkit.getPlayer(args[0]);
/*  42 */           if (grupo.equalsIgnoreCase("normal")) {
/*  43 */             p.kickPlayer("§cSeu grupo foi alterado para §7§lMEMBRO \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/*  44 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Default");
/*  45 */             player.setDisplayName("§7" + player.getName());
/*  46 */             NametagAPI.setPrefix(player.getName(), "§7");
/*  47 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/*  48 */             Updater.UpdateScore(player);
/*  49 */             return true;
/*     */           }
/*  51 */           if (grupo.equalsIgnoreCase("vip")) {
/*  52 */             p.kickPlayer("§cSeu grupo foi alterado para §a§lVIP \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/*  53 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Vip");
/*  54 */             player.setDisplayName("§a§lVIP §a" + player.getName());
/*  55 */             NametagAPI.setPrefix(player.getName(), "§a§lVIP §a");
/*  56 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/*  57 */             Updater.UpdateScore(player);
/*  58 */             return true;
/*     */           }
/*  60 */           if (grupo.equalsIgnoreCase("pro")) {
/*  61 */             p.kickPlayer("§cSeu grupo foi alterado para §6§lPRO \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/*  62 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Pro");
/*  63 */             player.setDisplayName("§6§lPRO §6" + player.getName());
/*  64 */             NametagAPI.setPrefix(player.getName(), "§6§lPRO §6");
/*  65 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/*  66 */             Updater.UpdateScore(player);
/*  67 */             return true;
/*     */           }
/*  69 */           if (grupo.equalsIgnoreCase("mvp")) {
/*  70 */             p.kickPlayer("§cSeu grupo foi alterado para §9§lMVP \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/*  71 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mvp");
/*  72 */             player.setDisplayName("§9§lMVP §9" + player.getName());
/*  73 */             NametagAPI.setPrefix(player.getName(), "§9§lMVP §9");
/*  74 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/*  75 */             Updater.UpdateScore(player);
/*     */           }
/*  77 */           if (grupo.equalsIgnoreCase("youtuber")) {
/*  78 */             p.kickPlayer("§cSeu grupo foi alterado para §b§lYoutuber \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/*  79 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Youtuber");
/*  80 */             player.setDisplayName("§b§lYT §b" + player.getName());
/*  81 */             NametagAPI.setPrefix(player.getName(), "§b§lYT §b");
/*  82 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/*  83 */             Updater.UpdateScore(player);
/*  84 */             return true;
/*     */           }
/*  86 */           if (grupo.equalsIgnoreCase("youtuber+")) {
/*  87 */             p.kickPlayer("§cSeu grupo foi alterado para §3§lYoutuber+ \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/*  88 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set YoutuberPlus");
/*  89 */             player.setDisplayName("§3§lYT+ §3" + player.getName());
/*  90 */             NametagAPI.setPrefix(player.getName(), "§3§lYT+ §3");
/*  91 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/*  92 */             Updater.UpdateScore(player);
/*  93 */             return true;
/*     */           }
/*  95 */           if (grupo.equalsIgnoreCase("builder")) {
/*  96 */             p.kickPlayer("§cSeu grupo foi alterado para §e§lBuilder \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/*  97 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Builder");
/*  98 */             player.setDisplayName("§e§lBUILDER §e" + player.getName());
/*  99 */             NametagAPI.setPrefix(player.getName(), "§e§lBUILDER §e");
/* 100 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 101 */             Updater.UpdateScore(player);
/* 102 */             return true;
/*     */           }
/* 104 */           if (grupo.equalsIgnoreCase("builder+")) {
/* 105 */             p.kickPlayer("§cSeu grupo foi alterado para §e§lBuilder+ \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 106 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Builder+");
/* 107 */             player.setDisplayName("§e§lBUILDER+ §e" + player.getName());
/* 108 */             NametagAPI.setPrefix(player.getName(), "§e§lBUILDER+ §e");
/* 109 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 110 */             Updater.UpdateScore(player);
/* 111 */             return true;
/*     */           }
/* 113 */           if (grupo.equalsIgnoreCase("helper")) {
/* 114 */             p.kickPlayer("§cSeu grupo foi alterado para §9§lHELPER \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 115 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Helper");
/* 116 */             player.setDisplayName("§9§lHELPER §9" + player.getName());
/* 117 */             NametagAPI.setPrefix(player.getName(), "§9§lHELPER §9");
/* 118 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 119 */             Updater.UpdateScore(player);
/* 120 */             return true;
/*     */           }
/* 122 */           if (grupo.equalsIgnoreCase("trial")) {
/* 123 */             p.kickPlayer("§cSeu grupo foi alterado para §5§lTRIAL \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 124 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Trial");
/* 125 */             player.setDisplayName("§5§lTRIAL §5" + player.getName());
/* 126 */             NametagAPI.setPrefix(player.getName(), "§5§lTRIAL §5");
/* 127 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 128 */             Updater.UpdateScore(player);
/* 129 */             return true;
/*     */           }
/* 131 */           if (grupo.equalsIgnoreCase("mod")) {
/* 132 */             p.kickPlayer("§cSeu grupo foi alterado para §5§lMOD \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 133 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mod");
/* 134 */             player.setDisplayName("§5§lMOD §5" + player.getName());
/* 135 */             NametagAPI.setPrefix(player.getName(), "§5§lMOD §5");
/* 136 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 137 */             Updater.UpdateScore(player);
/* 138 */             return true;
/*     */           }
/* 140 */           if (grupo.equalsIgnoreCase("mod+")) {
/* 141 */             p.kickPlayer("§cSeu grupo foi alterado para §5§lMOD+ \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 142 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Mod+");
/* 143 */             player.chat("/tag mod+");
/* 144 */             Updater.UpdateScore(player);
/* 145 */             return true;
/*     */           }
/* 147 */           if (grupo.equalsIgnoreCase("gerente")) {
/* 148 */             p.kickPlayer("§cSeu grupo foi alterado para §c§lGERENTE \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 149 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Gerente");
/* 150 */             player.setDisplayName("§c§lGERENTE §c" + player.getName());
/* 151 */             NametagAPI.setPrefix(player.getName(), "§c§lGERENTE §c");
/* 152 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 153 */             Updater.UpdateScore(player);
/* 154 */             return true;
/*     */           }
/* 156 */           if (grupo.equalsIgnoreCase("admin")) {
/* 157 */             p.kickPlayer("§cSeu grupo foi alterado para §c§lADMIN \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 158 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Admin");
/* 159 */             player.setDisplayName("§c§lADMIN §c" + player.getName());
/* 160 */             NametagAPI.setPrefix(player.getName(), "§c§lADMIN §c");
/* 161 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 162 */             Updater.UpdateScore(player);
/* 163 */             return true;
/*     */           }
/* 165 */           if (grupo.equalsIgnoreCase("dono")) {
/* 166 */             p.kickPlayer("§cSeu grupo foi alterado para §4§lDONO \n§c para evitar Bugs possiveis \n§cvocê foi kickado do servidor!");
/* 167 */             Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pex user " + player.getName() + " group set Dono");
/* 168 */             player.setDisplayName("§4§lDONO §4" + player.getName());
/* 169 */             NametagAPI.setPrefix(player.getName(), "§4§lDONO §4");
/* 170 */             NametagAPI.setSuffix(player.getName(), "§7 " + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 171 */             Updater.UpdateScore(player);
/* 172 */             return true;
/*     */           }
/*     */         }
/*     */       } else {
/* 176 */         sender.sendMessage(Strings.servidormensagem + "§7Use /groupset <nick> <grupo> §7!");
/* 177 */         return true;
/*     */       }
/*     */     }
/* 180 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\GroupSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */