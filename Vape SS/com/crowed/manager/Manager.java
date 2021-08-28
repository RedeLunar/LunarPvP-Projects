/*     */ package com.crowed.manager;
/*     */ 
/*     */ import com.crowed.api.StatsManager;
/*     */ import com.crowed.comandos.Habilitar;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.Listener;
/*     */ 
/*     */ public abstract class Manager implements Listener, CommandExecutor
/*     */ {
/*     */   public static String Rank(Player p)
/*     */   {
/*  16 */     double rank = StatsManager.getXp(p);
/*  17 */     if (rank <= 70.0D) {
/*  18 */       return ChatColor.WHITE + "Unranked";
/*     */     }
/*  20 */     if (rank <= 120.0D) {
/*  21 */       return ChatColor.WHITE + "Ranked";
/*     */     }
/*  23 */     if (rank <= 190.0D)
/*     */     {
/*  25 */       return ChatColor.GREEN + "Apprentice";
/*     */     }
/*  27 */     if (rank <= 240.0D)
/*     */     {
/*  29 */       return ChatColor.YELLOW + "Starter";
/*     */     }
/*  31 */     if (rank <= 400.0D)
/*     */     {
/*  33 */       return ChatColor.DARK_AQUA + "Expert";
/*     */     }
/*  35 */     if (rank <= 540.0D)
/*     */     {
/*  37 */       return ChatColor.RED + "Ruby";
/*     */     }
/*  39 */     if (rank <= 670.0D)
/*     */     {
/*  41 */       return ChatColor.BLUE + "Experient";
/*     */     }
/*  43 */     if (rank <= 730.0D)
/*     */     {
/*  45 */       return ChatColor.GOLD + "Gold";
/*     */     }
/*  47 */     if (rank <= 900.0D)
/*     */     {
/*  49 */       return ChatColor.DARK_GREEN + "Emerald";
/*     */     }
/*  51 */     if (rank <= 1200.0D)
/*     */     {
/*  53 */       return ChatColor.DARK_PURPLE + "Elite";
/*     */     }
/*  55 */     if (rank <= 1500.0D)
/*     */     {
/*  57 */       return ChatColor.LIGHT_PURPLE + "Safira";
/*     */     }
/*  59 */     if (rank <= 1700.0D)
/*     */     {
/*  61 */       return ChatColor.DARK_RED + "Supreme";
/*     */     }
/*  63 */     if (rank <= 2000.0D)
/*     */     {
/*  65 */       return ChatColor.AQUA + "Legendary";
/*     */     }
/*  67 */     return ChatColor.AQUA + "Legendary";
/*     */   }
/*     */   
/*  70 */   public static String prefix(Player p) { double prefix = StatsManager.getXp(p);
/*  71 */     if (prefix <= 70.0D)
/*     */     {
/*  73 */       return ChatColor.WHITE + "⚊";
/*     */     }
/*  75 */     if (prefix <= 120.0D)
/*     */     {
/*  77 */       return ChatColor.WHITE + "�?";
/*     */     }
/*  79 */     if (prefix <= 190.0D)
/*     */     {
/*  81 */       return ChatColor.GREEN + "☰";
/*     */     }
/*  83 */     if (prefix <= 240.0D)
/*     */     {
/*  85 */       return ChatColor.YELLOW + "☴";
/*     */     }
/*  87 */     if (prefix <= 400.0D)
/*     */     {
/*  89 */       return ChatColor.DARK_AQUA + "☷";
/*     */     }
/*  91 */     if (prefix <= 540.0D)
/*     */     {
/*  93 */       return ChatColor.RED + "✰";
/*     */     }
/*  95 */     if (prefix <= 670.0D)
/*     */     {
/*  97 */       return ChatColor.BLUE + "�?�";
/*     */     }
/*  99 */     if (prefix <= 730.0D)
/*     */     {
/* 101 */       return ChatColor.GOLD + "✶";
/*     */     }
/* 103 */     if (prefix <= 900.0D)
/*     */     {
/* 105 */       return ChatColor.DARK_GREEN + "✠";
/*     */     }
/* 107 */     if (prefix <= 1200.0D)
/*     */     {
/* 109 */       return ChatColor.DARK_PURPLE + "✸";
/*     */     }
/* 111 */     if (prefix <= 1500.0D)
/*     */     {
/* 113 */       return ChatColor.LIGHT_PURPLE + "�?�";
/*     */     }
/* 115 */     if (prefix <= 1700.0D)
/*     */     {
/* 117 */       return ChatColor.DARK_RED + "✹";
/*     */     }
/* 119 */     if (prefix <= 2000.0D)
/*     */     {
/* 121 */       return ChatColor.AQUA + "✶";
/*     */     }
/* 123 */     return ChatColor.AQUA + "✶";
/*     */   }
/*     */   
/*     */   public static String RankAndPrefix(Player p)
/*     */   {
/* 128 */     double rankandprefix = StatsManager.getXp(p);
/* 129 */     if (rankandprefix <= 70.0D)
/*     */     {
/* 131 */       return ChatColor.WHITE + "⚊ Unranked";
/*     */     }
/* 133 */     if (rankandprefix <= 120.0D)
/*     */     {
/* 135 */       return ChatColor.WHITE + "�? Ranked";
/*     */     }
/* 137 */     if (rankandprefix <= 190.0D)
/*     */     {
/* 139 */       return ChatColor.GREEN + "☰  Apprentice";
/*     */     }
/* 141 */     if (rankandprefix <= 240.0D)
/*     */     {
/* 143 */       return ChatColor.YELLOW + "☴  Starter";
/*     */     }
/* 145 */     if (rankandprefix <= 400.0D)
/*     */     {
/* 147 */       return ChatColor.DARK_AQUA + "☷ Expert";
/*     */     }
/* 149 */     if (rankandprefix <= 540.0D)
/*     */     {
/* 151 */       return ChatColor.RED + "✰ Ruby";
/*     */     }
/* 153 */     if (rankandprefix <= 670.0D)
/*     */     {
/* 155 */       return ChatColor.BLUE + "�?� Experient";
/*     */     }
/* 157 */     if (rankandprefix <= 730.0D)
/*     */     {
/* 159 */       return ChatColor.GOLD + "✶ Gold";
/*     */     }
/* 161 */     if (rankandprefix <= 900.0D)
/*     */     {
/* 163 */       return ChatColor.DARK_GREEN + "✠ Emerald";
/*     */     }
/* 165 */     if (rankandprefix <= 1200.0D)
/*     */     {
/* 167 */       return ChatColor.DARK_PURPLE + "✸ Elite";
/*     */     }
/* 169 */     if (rankandprefix <= 1500.0D)
/*     */     {
/* 171 */       return ChatColor.LIGHT_PURPLE + "�?� Safira";
/*     */     }
/* 173 */     if (rankandprefix <= 1700.0D)
/*     */     {
/* 175 */       return ChatColor.DARK_RED + "✹ Supreme";
/*     */     }
/* 177 */     if (rankandprefix <= 2000.0D)
/*     */     {
/* 179 */       return ChatColor.AQUA + "✶ Legendary";
/*     */     }
/* 181 */     return ChatColor.AQUA + "✶ Legendary";
/*     */   }
/*     */   
/* 184 */   public static String GrupoJoin(Player p) { if (p.hasPermission("join.dono")) {
/* 185 */       return ChatColor.DARK_RED + ChatColor.BOLD + "DONO";
/*     */     }
/* 187 */     if (p.hasPermission("join.admin")) {
/* 188 */       return ChatColor.RED + ChatColor.BOLD + "ADMIN";
/*     */     }
/* 190 */     if (p.hasPermission("join.gerente")) {
/* 191 */       return ChatColor.RED + ChatColor.BOLD + "GERENTE";
/*     */     }
/* 193 */     if (p.hasPermission("join.developer")) {
/* 194 */       return ChatColor.DARK_AQUA + ChatColor.BOLD + "DEVELOPER";
/*     */     }
/* 196 */     if (p.hasPermission("join.mod+")) {
/* 197 */       return ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+";
/*     */     }
/* 199 */     if (p.hasPermission("join.mod")) {
/* 200 */       return ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD";
/*     */     }
/* 202 */     if (p.hasPermission("join.trial")) {
/* 203 */       return ChatColor.DARK_PURPLE + ChatColor.BOLD + "TRIAL";
/*     */     }
/* 205 */     if (p.hasPermission("join.helper")) {
/* 206 */       return ChatColor.BLUE + ChatColor.BOLD + "HELPER";
/*     */     }
/* 208 */     if (p.hasPermission("join.builder+")) {
/* 209 */       return ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+";
/*     */     }
/* 211 */     if (p.hasPermission("join.builder")) {
/* 212 */       return ChatColor.YELLOW + ChatColor.BOLD + "BUILDER";
/*     */     }
/* 214 */     if (p.hasPermission("join.youtuber+")) {
/* 215 */       return ChatColor.DARK_AQUA + ChatColor.BOLD + "YOUTUBER+";
/*     */     }
/* 217 */     if (p.hasPermission("join.youtuber")) {
/* 218 */       return ChatColor.AQUA + ChatColor.BOLD + "YOUTUBER";
/*     */     }
/* 220 */     if ((p.hasPermission("join.mvp")) || (Habilitar.mvp)) {
/* 221 */       return ChatColor.BLUE + ChatColor.BOLD + "MVP";
/*     */     }
/* 223 */     if ((p.hasPermission("join.pro")) || (Habilitar.pro)) {
/* 224 */       return ChatColor.GOLD + ChatColor.BOLD + "PRO";
/*     */     }
/* 226 */     if ((p.hasPermission("join.vip")) || (Habilitar.vip)) {
/* 227 */       return ChatColor.GREEN + ChatColor.BOLD + "VIP";
/*     */     }
/* 229 */     if (p.hasPermission("join.normal")) {
/* 230 */       return ChatColor.GRAY + ChatColor.BOLD + "NORMAL";
/*     */     }
/* 232 */     return ChatColor.GRAY + ChatColor.BOLD + "NORMAL";
/*     */   }
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/* 237 */     Comando(sender, cmd, args);
/* 238 */     return false;
/*     */   }
/*     */   
/*     */   public abstract void Comando(CommandSender paramCommandSender, Command paramCommand, String[] paramArrayOfString);
/*     */   
/*     */   public static String Verde(Player p)
/*     */   {
/* 245 */     double rankandprefix = StatsManager.getXp(p);
/* 246 */     if (rankandprefix <= 70.0D)
/*     */     {
/* 248 */       return ChatColor.GREEN + "*" + ChatColor.WHITE + "⚊ Unranked";
/*     */     }
/* 250 */     if (rankandprefix <= 120.0D)
/*     */     {
/* 252 */       return ChatColor.GREEN + "*" + ChatColor.WHITE + "�? Ranked";
/*     */     }
/* 254 */     if (rankandprefix <= 190.0D)
/*     */     {
/* 256 */       return ChatColor.GREEN + "*" + ChatColor.GREEN + "☰  Apprentice";
/*     */     }
/* 258 */     if (rankandprefix <= 240.0D)
/*     */     {
/* 260 */       return ChatColor.GREEN + "*" + ChatColor.YELLOW + "☴  Starter";
/*     */     }
/* 262 */     if (rankandprefix <= 400.0D)
/*     */     {
/* 264 */       return ChatColor.GREEN + "*" + ChatColor.DARK_AQUA + "☷ Expert";
/*     */     }
/* 266 */     if (rankandprefix <= 540.0D)
/*     */     {
/* 268 */       return ChatColor.GREEN + "*" + ChatColor.RED + "✰ Ruby";
/*     */     }
/* 270 */     if (rankandprefix <= 670.0D)
/*     */     {
/* 272 */       return ChatColor.GREEN + "*" + ChatColor.BLUE + "�?� Experient";
/*     */     }
/* 274 */     if (rankandprefix <= 730.0D)
/*     */     {
/* 276 */       return ChatColor.GREEN + "*" + ChatColor.GOLD + "✶ Gold";
/*     */     }
/* 278 */     if (rankandprefix <= 900.0D)
/*     */     {
/* 280 */       return ChatColor.GREEN + "*" + ChatColor.DARK_GREEN + "✠ Emerald";
/*     */     }
/* 282 */     if (rankandprefix <= 1200.0D)
/*     */     {
/* 284 */       return ChatColor.GREEN + "*" + ChatColor.DARK_PURPLE + "✸ Elite";
/*     */     }
/* 286 */     if (rankandprefix <= 1500.0D)
/*     */     {
/* 288 */       return ChatColor.GREEN + "*" + ChatColor.LIGHT_PURPLE + "�?� Safira";
/*     */     }
/* 290 */     if (rankandprefix <= 1700.0D)
/*     */     {
/* 292 */       return ChatColor.GREEN + "*" + ChatColor.DARK_RED + "✹ Supreme";
/*     */     }
/* 294 */     if (rankandprefix <= 2000.0D)
/*     */     {
/* 296 */       return ChatColor.GREEN + "*" + ChatColor.AQUA + "✶ Legendary";
/*     */     }
/* 298 */     return ChatColor.GREEN + "*" + ChatColor.AQUA + "✶ Legendary";
/*     */   }
/*     */   
/*     */   public static String ProximoPorXp(Player p) {
/* 302 */     double rankandprefix = StatsManager.getXp(p);
/* 303 */     if (rankandprefix <= 70.0D)
/*     */     {
/* 305 */       return "§eXP para o Proximo rank: " + ChatColor.WHITE + "§f 120 XP's";
/*     */     }
/* 307 */     if (rankandprefix <= 120.0D)
/*     */     {
/* 309 */       return "§eXP para o Proximo rank: " + ChatColor.WHITE + "§f 190 XP's";
/*     */     }
/* 311 */     if (rankandprefix <= 190.0D)
/*     */     {
/* 313 */       return "§eXP para o Proximo rank: " + ChatColor.GREEN + "§f 240 XP's";
/*     */     }
/* 315 */     if (rankandprefix <= 240.0D)
/*     */     {
/* 317 */       return "§eXP para o Proximo rank: " + ChatColor.YELLOW + "§f 400 XP's";
/*     */     }
/* 319 */     if (rankandprefix <= 400.0D)
/*     */     {
/* 321 */       return "§eXP para o Proximo rank: " + ChatColor.DARK_AQUA + "§f 540 XP's";
/*     */     }
/* 323 */     if (rankandprefix <= 540.0D)
/*     */     {
/* 325 */       return "§eXP para o Proximo rank: " + ChatColor.RED + "§f 670 XP's";
/*     */     }
/* 327 */     if (rankandprefix <= 670.0D)
/*     */     {
/* 329 */       return "§eXP para o Proximo rank: " + ChatColor.BLUE + "§f 730 XP's";
/*     */     }
/* 331 */     if (rankandprefix <= 730.0D)
/*     */     {
/* 333 */       return "§eXP para o Proximo rank: " + ChatColor.GOLD + "§f 900 XP's";
/*     */     }
/* 335 */     if (rankandprefix <= 900.0D)
/*     */     {
/* 337 */       return "§eXP para o Proximo rank: " + ChatColor.DARK_GREEN + "§f 1200 XP's";
/*     */     }
/* 339 */     if (rankandprefix <= 1200.0D)
/*     */     {
/* 341 */       return "§eXP para o Proximo rank: " + ChatColor.DARK_PURPLE + "§f 1500 XP's";
/*     */     }
/* 343 */     if (rankandprefix <= 1500.0D)
/*     */     {
/* 345 */       return "§eXP para o Proximo rank: " + ChatColor.LIGHT_PURPLE + "§f 1700 XP's";
/*     */     }
/* 347 */     if (rankandprefix <= 1700.0D)
/*     */     {
/* 349 */       return "§eXP para o Proximo rank: " + ChatColor.DARK_RED + "§f 2000 XP's";
/*     */     }
/* 351 */     if (rankandprefix <= 2000.0D)
/*     */     {
/* 353 */       return "§fParabens Você zerou todos seus ranks !";
/*     */     }
/* 355 */     return "§fParabens Você zerou todos seus ranks !";
/*     */   }
/*     */   
/*     */   public static String ProximoRank(Player p) {
/* 359 */     double rankandprefix = StatsManager.getXp(p);
/* 360 */     if (rankandprefix <= 70.0D)
/*     */     {
/* 362 */       return "§eProximo rank: " + ChatColor.WHITE + "�? Ranked";
/*     */     }
/* 364 */     if (rankandprefix <= 120.0D)
/*     */     {
/* 366 */       return "§eProximo rank: " + ChatColor.WHITE + "☰  Apprentice";
/*     */     }
/* 368 */     if (rankandprefix <= 190.0D)
/*     */     {
/* 370 */       return "§eProximo rank: " + ChatColor.GREEN + "☴  Starter";
/*     */     }
/* 372 */     if (rankandprefix <= 240.0D)
/*     */     {
/* 374 */       return "§eProximo rank: " + ChatColor.YELLOW + "☷ Expert";
/*     */     }
/* 376 */     if (rankandprefix <= 400.0D)
/*     */     {
/* 378 */       return "§eProximo rank: " + ChatColor.DARK_AQUA + "✰ Ruby";
/*     */     }
/* 380 */     if (rankandprefix <= 540.0D)
/*     */     {
/* 382 */       return "§eProximo rank: " + ChatColor.RED + "�?� Experient";
/*     */     }
/* 384 */     if (rankandprefix <= 670.0D)
/*     */     {
/* 386 */       return "§eProximo rank: " + ChatColor.BLUE + "✶ Gold";
/*     */     }
/* 388 */     if (rankandprefix <= 730.0D)
/*     */     {
/* 390 */       return "§eProximo rank: " + ChatColor.GOLD + "✠ Emerald";
/*     */     }
/* 392 */     if (rankandprefix <= 900.0D)
/*     */     {
/* 394 */       return "§eProximo rank: " + ChatColor.DARK_GREEN + "✸ Elite";
/*     */     }
/* 396 */     if (rankandprefix <= 1200.0D)
/*     */     {
/* 398 */       return "§eProximo rank: " + ChatColor.DARK_PURPLE + "�?� Safira";
/*     */     }
/* 400 */     if (rankandprefix <= 1500.0D)
/*     */     {
/* 402 */       return "§eProximo rank: " + ChatColor.LIGHT_PURPLE + "✹ Supreme";
/*     */     }
/* 404 */     if (rankandprefix <= 1700.0D)
/*     */     {
/* 406 */       return "§eProximo rank: " + ChatColor.DARK_RED + "✶ Legendary";
/*     */     }
/* 408 */     if (rankandprefix <= 2000.0D)
/*     */     {
/* 410 */       return " ";
/*     */     }
/* 412 */     return " ";
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\manager\Manager.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */