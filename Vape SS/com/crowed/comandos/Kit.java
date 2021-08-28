/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import com.crowed.api.KitAPI;
/*     */ import com.crowed.manager.Manager;
/*     */ import com.crowed.utils.Strings;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class Kit
/*     */   extends Manager
/*     */ {
/*     */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*     */   {
/*  16 */     Player p = (Player)sender;
/*     */     
/*  18 */     if (!(sender instanceof Player)) {
/*  19 */       sender.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /kit (kit)");
/*  20 */       return;
/*     */     }
/*  22 */     if (argumentos.length == 0) {
/*  23 */       p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /kit (kit)");
/*  24 */       return;
/*     */     }
/*  26 */     if (argumentos[0].equalsIgnoreCase("pvp")) {
/*  27 */       if ((p.hasPermission("kit.pvp")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  28 */         if (KitAPI.getKit(p) == "Nenhum") {
/*  29 */           KitAPI.PvP(p);
/*  30 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lPvP");
/*  31 */           return;
/*     */         }
/*  33 */         p.sendMessage(Strings.pegoukit);
/*  34 */         return;
/*     */       }
/*     */       
/*  37 */       p.sendMessage(Strings.permissaokit);
/*  38 */       return;
/*     */     }
/*     */     
/*  41 */     if (argumentos[0].equalsIgnoreCase("kangaroo")) {
/*  42 */       if ((p.hasPermission("kit.kangaroo")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  43 */         if (KitAPI.getKit(p) == "Nenhum") {
/*  44 */           KitAPI.Kangaroo(p);
/*  45 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lKangaroo");
/*  46 */           return;
/*     */         }
/*  48 */         p.sendMessage(Strings.pegoukit);
/*  49 */         return;
/*     */       }
/*     */       
/*  52 */       p.sendMessage(Strings.permissaokit);
/*  53 */       return;
/*     */     }
/*     */     
/*  56 */     if (argumentos[0].equalsIgnoreCase("specialist")) {
/*  57 */       if ((p.hasPermission("kit.specialist")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  58 */         if (KitAPI.getKit(p) == "Nenhum") {
/*  59 */           KitAPI.Specialist(p);
/*  60 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lSpecialist");
/*  61 */           return;
/*     */         }
/*  63 */         p.sendMessage(Strings.pegoukit);
/*  64 */         return;
/*     */       }
/*     */       
/*  67 */       p.sendMessage(Strings.permissaokit);
/*  68 */       return;
/*     */     }
/*     */     
/*  71 */     if (argumentos[0].equalsIgnoreCase("stomper")) {
/*  72 */       if ((p.hasPermission("kit.stomper")) || (Habilitar.fullkit)) {
/*  73 */         if (KitAPI.getKit(p) == "Nenhum") {
/*  74 */           KitAPI.Stomper(p);
/*  75 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lStomper");
/*  76 */           return;
/*     */         }
/*  78 */         p.sendMessage(Strings.pegoukit);
/*  79 */         return;
/*     */       }
/*     */       
/*  82 */       p.sendMessage(Strings.permissaokit);
/*  83 */       return;
/*     */     }
/*     */     
/*  86 */     if (argumentos[0].equalsIgnoreCase("gladiator")) {
/*  87 */       if ((p.hasPermission("kit.gladiator")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  88 */         if (KitAPI.getKit(p) == "Nenhum") {
/*  89 */           KitAPI.Gladiator(p);
/*  90 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lGladiator");
/*  91 */           return;
/*     */         }
/*  93 */         p.sendMessage(Strings.pegoukit);
/*  94 */         return;
/*     */       }
/*     */       
/*  97 */       p.sendMessage(Strings.permissaokit);
/*  98 */       return;
/*     */     }
/*     */     
/* 101 */     if (argumentos[0].equalsIgnoreCase("snail")) {
/* 102 */       if ((p.hasPermission("kit.snail")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 103 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 104 */           KitAPI.Snail(p);
/* 105 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lSnail");
/* 106 */           return;
/*     */         }
/* 108 */         p.sendMessage(Strings.pegoukit);
/* 109 */         return;
/*     */       }
/*     */       
/* 112 */       p.sendMessage(Strings.permissaokit);
/* 113 */       return;
/*     */     }
/*     */     
/* 116 */     if (argumentos[0].equalsIgnoreCase("viper")) {
/* 117 */       if ((p.hasPermission("kit.viper")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 118 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 119 */           KitAPI.Viper(p);
/* 120 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lViper");
/* 121 */           return;
/*     */         }
/* 123 */         p.sendMessage(Strings.pegoukit);
/* 124 */         return;
/*     */       }
/*     */       
/* 127 */       p.sendMessage(Strings.permissaokit);
/* 128 */       return;
/*     */     }
/*     */     
/* 131 */     if (argumentos[0].equalsIgnoreCase("ninja")) {
/* 132 */       if ((p.hasPermission("kit.ninja")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 133 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 134 */           KitAPI.Ninja(p);
/* 135 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lNinja");
/* 136 */           return;
/*     */         }
/* 138 */         p.sendMessage(Strings.pegoukit);
/* 139 */         return;
/*     */       }
/*     */       
/* 142 */       p.sendMessage(Strings.permissaokit);
/* 143 */       return;
/*     */     }
/*     */     
/* 146 */     if (argumentos[0].equalsIgnoreCase("fisherman")) {
/* 147 */       if ((p.hasPermission("kit.fisherman")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 148 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 149 */           KitAPI.Fisherman(p);
/* 150 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lFisherman");
/* 151 */           return;
/*     */         }
/* 153 */         p.sendMessage(Strings.pegoukit);
/* 154 */         return;
/*     */       }
/*     */       
/* 157 */       p.sendMessage(Strings.permissaokit);
/* 158 */       return;
/*     */     }
/*     */     
/* 161 */     if (argumentos[0].equalsIgnoreCase("switcher")) {
/* 162 */       if ((p.hasPermission("kit.switcher")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 163 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 164 */           KitAPI.Switcher(p);
/* 165 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lSwitcher");
/* 166 */           return;
/*     */         }
/* 168 */         p.sendMessage(Strings.pegoukit);
/* 169 */         return;
/*     */       }
/*     */       
/* 172 */       p.sendMessage(Strings.permissaokit);
/* 173 */       return;
/*     */     }
/*     */     
/* 176 */     if (argumentos[0].equalsIgnoreCase("thor")) {
/* 177 */       if ((p.hasPermission("kit.thor")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 178 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 179 */           KitAPI.Thor(p);
/* 180 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lThor");
/* 181 */           return;
/*     */         }
/* 183 */         p.sendMessage(Strings.pegoukit);
/* 184 */         return;
/*     */       }
/*     */       
/* 187 */       p.sendMessage(Strings.permissaokit);
/* 188 */       return;
/*     */     }
/*     */     
/* 191 */     if (argumentos[0].equalsIgnoreCase("anchor")) {
/* 192 */       if ((p.hasPermission("kit.anchor")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 193 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 194 */           KitAPI.Anchor(p);
/* 195 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lAnchor");
/* 196 */           return;
/*     */         }
/* 198 */         p.sendMessage(Strings.pegoukit);
/* 199 */         return;
/*     */       }
/*     */       
/* 202 */       p.sendMessage(Strings.permissaokit);
/* 203 */       return;
/*     */     }
/*     */     
/* 206 */     if (argumentos[0].equalsIgnoreCase("magma")) {
/* 207 */       if ((p.hasPermission("kit.magma")) || (Habilitar.fullkit)) {
/* 208 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 209 */           KitAPI.Magma(p);
/* 210 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lMagma");
/* 211 */           return;
/*     */         }
/* 213 */         p.sendMessage(Strings.pegoukit);
/* 214 */         return;
/*     */       }
/*     */       
/* 217 */       p.sendMessage(Strings.permissaokit);
/* 218 */       return;
/*     */     }
/*     */     
/* 221 */     if (argumentos[0].equalsIgnoreCase("critical")) {
/* 222 */       if ((p.hasPermission("kit.critical")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 223 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 224 */           KitAPI.Critical(p);
/* 225 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lCritical");
/* 226 */           return;
/*     */         }
/* 228 */         p.sendMessage(Strings.pegoukit);
/* 229 */         return;
/*     */       }
/*     */       
/* 232 */       p.sendMessage(Strings.permissaokit);
/* 233 */       return;
/*     */     }
/*     */     
/* 236 */     if (argumentos[0].equalsIgnoreCase("ajnin")) {
/* 237 */       if ((p.hasPermission("kit.ajnin")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 238 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 239 */           KitAPI.Ajnin(p);
/* 240 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lAjnin");
/* 241 */           return;
/*     */         }
/* 243 */         p.sendMessage(Strings.pegoukit);
/* 244 */         return;
/*     */       }
/*     */       
/* 247 */       p.sendMessage(Strings.permissaokit);
/* 248 */       return;
/*     */     }
/*     */     
/* 251 */     if (argumentos[0].equalsIgnoreCase("boxer")) {
/* 252 */       if ((p.hasPermission("kit.boxer")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 253 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 254 */           KitAPI.Boxer(p);
/* 255 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lBoxer");
/* 256 */           return;
/*     */         }
/* 258 */         p.sendMessage(Strings.pegoukit);
/* 259 */         return;
/*     */       }
/*     */       
/* 262 */       p.sendMessage(Strings.permissaokit);
/* 263 */       return;
/*     */     }
/*     */     
/* 266 */     if (argumentos[0].equalsIgnoreCase("madman")) {
/* 267 */       if ((p.hasPermission("kit.madman")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 268 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 269 */           KitAPI.Madman(p);
/* 270 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lMadman");
/* 271 */           return;
/*     */         }
/* 273 */         p.sendMessage(Strings.pegoukit);
/* 274 */         return;
/*     */       }
/*     */       
/* 277 */       p.sendMessage(Strings.permissaokit);
/* 278 */       return;
/*     */     }
/*     */     
/* 281 */     if (argumentos[0].equalsIgnoreCase("monk")) {
/* 282 */       if ((p.hasPermission("kit.monk")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 283 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 284 */           KitAPI.Monk(p);
/* 285 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lMonk");
/* 286 */           return;
/*     */         }
/* 288 */         p.sendMessage(Strings.pegoukit);
/* 289 */         return;
/*     */       }
/*     */       
/* 292 */       p.sendMessage(Strings.permissaokit);
/* 293 */       return;
/*     */     }
/*     */     
/* 296 */     if (argumentos[0].equalsIgnoreCase("strong")) {
/* 297 */       if ((p.hasPermission("kit.strong")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 298 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 299 */           KitAPI.Strong(p);
/* 300 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lStrong");
/* 301 */           return;
/*     */         }
/* 303 */         p.sendMessage(Strings.pegoukit);
/* 304 */         return;
/*     */       }
/*     */       
/* 307 */       p.sendMessage(Strings.permissaokit);
/* 308 */       return;
/*     */     }
/*     */     
/* 311 */     if (argumentos[0].equalsIgnoreCase("viking")) {
/* 312 */       if ((p.hasPermission("kit.viking")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 313 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 314 */           KitAPI.Viking(p);
/* 315 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lViking");
/* 316 */           return;
/*     */         }
/* 318 */         p.sendMessage(Strings.pegoukit);
/* 319 */         return;
/*     */       }
/*     */       
/* 322 */       p.sendMessage(Strings.permissaokit);
/* 323 */       return;
/*     */     }
/*     */     
/* 326 */     if (argumentos[0].equalsIgnoreCase("grappler")) {
/* 327 */       if ((p.hasPermission("kit.grappler")) || (Habilitar.fullkit)) {
/* 328 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 329 */           KitAPI.Grappler(p);
/* 330 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lGrappler");
/* 331 */           return;
/*     */         }
/* 333 */         p.sendMessage(Strings.pegoukit);
/* 334 */         return;
/*     */       }
/*     */       
/* 337 */       p.sendMessage(Strings.permissaokit);
/* 338 */       return;
/*     */     }
/*     */     
/* 341 */     if ((argumentos[0].equalsIgnoreCase("hulk")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 342 */       if (p.hasPermission("kit.hulk")) {
/* 343 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 344 */           KitAPI.Hulk(p);
/* 345 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lHulk");
/* 346 */           return;
/*     */         }
/* 348 */         p.sendMessage(Strings.pegoukit);
/* 349 */         return;
/*     */       }
/*     */       
/* 352 */       p.sendMessage(Strings.permissaokit);
/* 353 */       return;
/*     */     }
/*     */     
/* 356 */     if (argumentos[0].equalsIgnoreCase("phantom")) {
/* 357 */       if ((p.hasPermission("kit.phantom")) || (Habilitar.fullkit)) {
/* 358 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 359 */           KitAPI.Phantom(p);
/* 360 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lPhantom");
/* 361 */           return;
/*     */         }
/* 363 */         p.sendMessage(Strings.pegoukit);
/* 364 */         return;
/*     */       }
/*     */       
/* 367 */       p.sendMessage(Strings.permissaokit);
/* 368 */       return;
/*     */     }
/*     */     
/* 371 */     if ((argumentos[0].equalsIgnoreCase("sumo")) || (Habilitar.fullkit)) {
/* 372 */       if ((p.hasPermission("kit.sumo")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 373 */         if (KitAPI.getKit(p) == "Nenhum") {
/* 374 */           KitAPI.Sumo(p);
/* 375 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce selecionou o kit §e§lSumo");
/* 376 */           return;
/*     */         }
/* 378 */         p.sendMessage(Strings.pegoukit);
/* 379 */         return;
/*     */       }
/*     */       
/* 382 */       p.sendMessage(Strings.permissaokit);
/* 383 */       return;
/*     */     }
/*     */     
/* 386 */     p.sendMessage(Strings.servidor + ChatColor.GRAY + "O Kit §e§l" + argumentos[0] + ChatColor.GRAY + " Nao existe!");
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Kit.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */