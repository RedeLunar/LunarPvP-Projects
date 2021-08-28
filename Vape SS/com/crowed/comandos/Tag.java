/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import ca.wacos.nametagedit.NametagAPI;
/*     */ import com.crowed.api.InteractiveChat;
/*     */ import com.crowed.manager.Manager;
/*     */ import com.crowed.utils.Strings;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ 
/*     */ public class Tag
/*     */   implements CommandExecutor
/*     */ {
/*     */   public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
/*     */   {
/*  19 */     Player p = (Player)sender;
/*     */     
/*  21 */     if (command.getName().equalsIgnoreCase("tag")) {
/*  22 */       if (args.length == 0) {
/*  23 */         if (p.hasPermission("tag.dono")) {
/*  24 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO", "/tag dono", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO");
/*     */         }
/*  26 */         if (p.hasPermission("tag.admin")) {
/*  27 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.RED + ChatColor.BOLD + "ADMIN", "/tag admin", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.RED + ChatColor.BOLD + "ADMIN+");
/*     */         }
/*  29 */         if (p.hasPermission("tag.gerente")) {
/*  30 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.RED + ChatColor.BOLD + "GERENTE", "/tag gerente", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.RED + ChatColor.BOLD + "GERENTE");
/*     */         }
/*  32 */         if (p.hasPermission("tag.mod+")) {
/*  33 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+", "/tag mod+", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+");
/*     */         }
/*  35 */         if (p.hasPermission("tag.mod")) {
/*  36 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD", "/tag mod", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD");
/*     */         }
/*  38 */         if (p.hasPermission("tag.trial")) {
/*  39 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "TRIAL", "/tag trial", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "TRIAL");
/*     */         }
/*  41 */         if (p.hasPermission("tag.helper")) {
/*  42 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.BLUE + ChatColor.BOLD + "HELPER", "/tag helper", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.BLUE + ChatColor.BOLD + "HELPER");
/*     */         }
/*  44 */         if (p.hasPermission("tag.builder+")) {
/*  45 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+", "/tag builder+", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+");
/*     */         }
/*  47 */         if (p.hasPermission("tag.builder")) {
/*  48 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.YELLOW + ChatColor.BOLD + "BUILDER", "/tag builder", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.YELLOW + ChatColor.BOLD + "BUILDER");
/*     */         }
/*  50 */         if (p.hasPermission("tag.youtuber+")) {
/*  51 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.DARK_AQUA + ChatColor.BOLD + "YOUTUBER+", "/tag youtuber+", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.DARK_AQUA + ChatColor.BOLD + "YOUTUBER+");
/*     */         }
/*  53 */         if (p.hasPermission("tag.semiyt")) {
/*  54 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.YELLOW + ChatColor.BOLD + "SEMIYT", "/tag semiyt", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.YELLOW + ChatColor.BOLD + "SEMI-YT");
/*     */         }
/*  56 */         if (p.hasPermission("tag.youtuber")) {
/*  57 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.AQUA + ChatColor.BOLD + "YOUTUBER", "/tag youtuber", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.AQUA + ChatColor.BOLD + "YOUTUBER");
/*     */         }
/*  59 */         if ((p.hasPermission("tag.pro")) || (Habilitar.pro)) {
/*  60 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.GOLD + ChatColor.BOLD + "PRO", "/tag pro", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.GOLD + ChatColor.BOLD + "PRO");
/*     */         }
/*  62 */         if ((p.hasPermission("tag.mvp")) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  63 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.BLUE + ChatColor.BOLD + "MVP", "/tag mvp", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.BLUE + ChatColor.BOLD + "MVP");
/*     */         }
/*  65 */         if ((p.hasPermission("tag.vip")) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  66 */           InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.GREEN + ChatColor.BOLD + "VIP", "/tag vip", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.GREEN + ChatColor.BOLD + "VIP");
/*     */         }
/*  68 */         InteractiveChat.command(p.getName(), ChatColor.WHITE + "- " + ChatColor.GRAY + ChatColor.BOLD + "NORMAL", "/tag normal", ChatColor.WHITE + "Clique para selecionar a tag " + ChatColor.WHITE + ChatColor.BOLD + "NORMAL");
/*  69 */         p.sendMessage(" ");
/*  70 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Para usar uma tag digite: " + ChatColor.YELLOW + "/tag <tag>");
/*  71 */         return true;
/*     */       }
/*  73 */       if (args[0].equalsIgnoreCase("normal")) {
/*  74 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.BOLD + "NORMAL");
/*     */         
/*     */ 
/*  77 */         NametagAPI.setNametagHard(p.getName(), ChatColor.GRAY, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  78 */         p.setDisplayName(ChatColor.GRAY + p.getName());
/*     */         
/*  80 */         return true;
/*     */       }
/*  82 */       if (args[0].equalsIgnoreCase("vip")) {
/*  83 */         if ((p.hasPermission("tag.vip")) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  84 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.GREEN + ChatColor.BOLD + "VIP");
/*     */           
/*  86 */           NametagAPI.setNametagHard(p.getName(), ChatColor.GREEN + ChatColor.BOLD + "VIP " + ChatColor.GREEN, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  87 */           p.setDisplayName(ChatColor.GREEN + ChatColor.BOLD + "VIP " + ChatColor.GREEN + p.getName());
/*     */           
/*  89 */           return true;
/*     */         }
/*  91 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/*  94 */       if (args[0].equalsIgnoreCase("mvp")) {
/*  95 */         if ((p.hasPermission("tag.mvp")) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  96 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.BLUE + ChatColor.BOLD + "MVP");
/*     */           
/*  98 */           NametagAPI.setNametagHard(p.getName(), ChatColor.BLUE + ChatColor.BOLD + "MVP " + ChatColor.BLUE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/*  99 */           p.setDisplayName(ChatColor.BLUE + ChatColor.BOLD + "MVP " + ChatColor.BLUE + p.getName());
/*     */           
/* 101 */           return true;
/*     */         }
/* 103 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 106 */       if (args[0].equalsIgnoreCase("pro")) {
/* 107 */         if ((p.hasPermission("tag.pro")) || (Habilitar.pro)) {
/* 108 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.GOLD + ChatColor.BOLD + "PRO");
/*     */           
/* 110 */           NametagAPI.setNametagHard(p.getName(), ChatColor.GOLD + ChatColor.BOLD + "PRO " + ChatColor.GOLD, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 111 */           p.setDisplayName(ChatColor.GOLD + ChatColor.BOLD + "PRO " + ChatColor.GOLD + p.getName());
/*     */           
/* 113 */           return true;
/*     */         }
/* 115 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 118 */       if (args[0].equalsIgnoreCase("semiyt")) {
/* 119 */         if (p.hasPermission("tag.semiyt")) {
/* 120 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.YELLOW + ChatColor.BOLD + "SEMI-YT");
/*     */           
/* 122 */           NametagAPI.setNametagHard(p.getName(), ChatColor.YELLOW + ChatColor.BOLD + "SEMIYT " + ChatColor.YELLOW, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 123 */           p.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "SEMIYT " + ChatColor.YELLOW + p.getName());
/*     */           
/* 125 */           return true;
/*     */         }
/* 127 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 130 */       if (args[0].equalsIgnoreCase("youtuber")) {
/* 131 */         if (p.hasPermission("tag.youtuber")) {
/* 132 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.AQUA + ChatColor.BOLD + "YOUTUBER");
/*     */           
/* 134 */           NametagAPI.setNametagHard(p.getName(), ChatColor.AQUA + ChatColor.BOLD + "YT " + ChatColor.AQUA, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 135 */           p.setDisplayName(ChatColor.AQUA + ChatColor.BOLD + "YT " + ChatColor.AQUA + p.getName());
/*     */           
/* 137 */           return true;
/*     */         }
/* 139 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 142 */       if (args[0].equalsIgnoreCase("builder")) {
/* 143 */         if (p.hasPermission("tag.builder")) {
/* 144 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.YELLOW + ChatColor.BOLD + "BUILDER");
/*     */           
/* 146 */           NametagAPI.setNametagHard(p.getName(), ChatColor.YELLOW + ChatColor.BOLD + "BUILDER " + ChatColor.YELLOW, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 147 */           p.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "BUILDER " + ChatColor.YELLOW + p.getName());
/*     */           
/* 149 */           return true;
/*     */         }
/* 151 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 154 */       if (args[0].equalsIgnoreCase("builder+")) {
/* 155 */         if (p.hasPermission("tag.builder+")) {
/* 156 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+");
/*     */           
/* 158 */           NametagAPI.setNametagHard(p.getName(), ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+ " + ChatColor.YELLOW, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 159 */           p.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "BUILDER+ " + ChatColor.YELLOW + p.getName());
/*     */           
/* 161 */           return true;
/*     */         }
/* 163 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 166 */       if (args[0].equalsIgnoreCase("youtuber+")) {
/* 167 */         if (p.hasPermission("tag.youtuber+")) {
/* 168 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.DARK_AQUA + ChatColor.BOLD + "YOUTUBER+");
/*     */           
/* 170 */           NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_AQUA + ChatColor.BOLD + "YT+ " + ChatColor.DARK_AQUA, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 171 */           p.setDisplayName(ChatColor.DARK_AQUA + ChatColor.BOLD + "YT+ " + ChatColor.DARK_AQUA + p.getName());
/*     */           
/* 173 */           return true;
/*     */         }
/* 175 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 178 */       if (args[0].equalsIgnoreCase("helper")) {
/* 179 */         if (p.hasPermission("tag.helper")) {
/* 180 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.BLUE + ChatColor.BOLD + "HELPER");
/*     */           
/* 182 */           NametagAPI.setNametagHard(p.getName(), ChatColor.BLUE + ChatColor.BOLD + "HELPER " + ChatColor.BLUE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 183 */           p.setDisplayName(ChatColor.BLUE + ChatColor.BOLD + "HELPER " + ChatColor.BLUE + p.getName());
/*     */           
/* 185 */           return true;
/*     */         }
/* 187 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 190 */       if (args[0].equalsIgnoreCase("trial")) {
/* 191 */         if (p.hasPermission("tag.trial")) {
/* 192 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "TRIAL");
/*     */           
/* 194 */           NametagAPI.setNametagHard(p.getName(), ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "TRIAL " + ChatColor.LIGHT_PURPLE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 195 */           p.setDisplayName(ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "TRIAL " + ChatColor.LIGHT_PURPLE + p.getName());
/*     */           
/* 197 */           return true;
/*     */         }
/* 199 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 202 */       if (args[0].equalsIgnoreCase("mod")) {
/* 203 */         if (p.hasPermission("tag.mod")) {
/* 204 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD");
/*     */           
/* 206 */           NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD " + ChatColor.DARK_PURPLE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 207 */           p.setDisplayName(ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD " + ChatColor.DARK_PURPLE + p.getName());
/*     */           
/* 209 */           return true;
/*     */         }
/* 211 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 214 */       if (args[0].equalsIgnoreCase("mod+")) {
/* 215 */         if (p.hasPermission("tag.mod+")) {
/* 216 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+");
/*     */           
/* 218 */           NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+ " + ChatColor.DARK_PURPLE, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 219 */           p.setDisplayName(ChatColor.DARK_PURPLE + ChatColor.BOLD + "MOD+ " + ChatColor.DARK_PURPLE + p.getName());
/*     */           
/* 221 */           return true;
/*     */         }
/* 223 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 226 */       if (args[0].equalsIgnoreCase("gerente")) {
/* 227 */         if (p.hasPermission("tag.gerente")) {
/* 228 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.RED + ChatColor.BOLD + "GERENTE");
/*     */           
/* 230 */           NametagAPI.setNametagHard(p.getName(), ChatColor.RED + ChatColor.BOLD + "GERENTE " + ChatColor.RED, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 231 */           p.setDisplayName(ChatColor.RED + ChatColor.BOLD + "GERENTE " + ChatColor.RED + p.getName());
/*     */           
/* 233 */           return true;
/*     */         }
/* 235 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 238 */       if (args[0].equalsIgnoreCase("admin")) {
/* 239 */         if (p.hasPermission("tag.admin")) {
/* 240 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.RED + ChatColor.BOLD + "ADMIN");
/*     */           
/* 242 */           NametagAPI.setNametagHard(p.getName(), ChatColor.RED + ChatColor.BOLD + "ADMIN " + ChatColor.RED, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 243 */           p.setDisplayName(ChatColor.RED + ChatColor.BOLD + "ADMIN " + ChatColor.RED + p.getName());
/*     */           
/* 245 */           return true;
/*     */         }
/* 247 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 250 */       if (args[0].equalsIgnoreCase("dono")) {
/* 251 */         if (p.hasPermission("tag.dono")) {
/* 252 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO");
/* 253 */           NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_RED + ChatColor.BOLD + "DONO " + ChatColor.DARK_RED, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 254 */           p.setDisplayName(ChatColor.DARK_RED + ChatColor.BOLD + "DONO " + ChatColor.DARK_RED + p.getName());
/* 255 */           return true;
/*     */         }
/* 257 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */       
/* 260 */       if (args[0].equalsIgnoreCase("gabrielandshooyu")) {
/* 261 */         if (p.hasPermission("tag.developer")) {
/* 262 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Sua tag foi alterada para " + ChatColor.DARK_AQUA + ChatColor.BOLD + "DEVELOPER");
/* 263 */           NametagAPI.setNametagHard(p.getName(), ChatColor.DARK_AQUA + ChatColor.BOLD + "DEV " + ChatColor.DARK_AQUA, ChatColor.GRAY + " [" + Manager.prefix(p) + ChatColor.GRAY + "]");
/* 264 */           p.setDisplayName(ChatColor.DARK_AQUA + ChatColor.BOLD + "DEV " + ChatColor.DARK_AQUA + p.getName());
/* 265 */           return true;
/*     */         }
/* 267 */         p.sendMessage(Strings.permissaotag);
/*     */       }
/*     */     }
/*     */     
/* 271 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Tag.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */