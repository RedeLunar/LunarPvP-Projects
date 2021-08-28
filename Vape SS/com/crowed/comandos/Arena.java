/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import com.crowed.api.API;
/*     */ import com.crowed.configs.ArenaConfig;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.util.Random;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class Arena implements org.bukkit.event.Listener, CommandExecutor
/*     */ {
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  22 */     Player p = (Player)sender;
/*  23 */     if ((p.hasPermission("cmd.setarena")) && (label.equalsIgnoreCase("setarena"))) {
/*  24 */       if (args.length == 0) {
/*  25 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /setarena <1 até 5>");
/*  26 */         return true;
/*     */       }
/*  28 */       if (args[0].equalsIgnoreCase("1")) {
/*  29 */         ArenaConfig.getConfig();
/*  30 */         API.setWarp(p, "Arena");
/*  31 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Arena " + ChatColor.YELLOW + "1" + ChatColor.GRAY + " Setada com Sucesso!");
/*  32 */         ArenaConfig.getConfig().config().set("arena1.x", Double.valueOf(p.getLocation().getX()));
/*  33 */         ArenaConfig.getConfig().config().set("arena1.y", Double.valueOf(p.getLocation().getY()));
/*  34 */         ArenaConfig.getConfig().config().set("arena1.z", Double.valueOf(p.getLocation().getZ()));
/*  35 */         p.getWorld();
/*  36 */         ArenaConfig.getConfig().config().set("arena1.pitch", Float.valueOf(p.getLocation().getPitch()));
/*  37 */         ArenaConfig.getConfig().config().set("arena1.yaw", Float.valueOf(p.getLocation().getYaw()));
/*  38 */         ArenaConfig.getConfig().config().set("arena1.world", p.getLocation().getWorld().getName());
/*  39 */         ArenaConfig.getConfig().saveConfigs();
/*     */       }
/*  41 */       if (args[0].equalsIgnoreCase("2")) {
/*  42 */         ArenaConfig.getConfig();
/*  43 */         API.setWarp(p, "Arena");
/*  44 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Arena " + ChatColor.YELLOW + "2" + ChatColor.GRAY + " Setada com Sucesso!");
/*  45 */         ArenaConfig.getConfig().config().set("arena2.x", Double.valueOf(p.getLocation().getX()));
/*  46 */         ArenaConfig.getConfig().config().set("arena2.y", Double.valueOf(p.getLocation().getY()));
/*  47 */         ArenaConfig.getConfig().config().set("arena2.z", Double.valueOf(p.getLocation().getZ()));
/*  48 */         p.getWorld();
/*  49 */         ArenaConfig.getConfig().config().set("arena2.pitch", Float.valueOf(p.getLocation().getPitch()));
/*  50 */         ArenaConfig.getConfig().config().set("arena2.yaw", Float.valueOf(p.getLocation().getYaw()));
/*  51 */         ArenaConfig.getConfig().config().set("arena2.world", p.getLocation().getWorld().getName());
/*  52 */         ArenaConfig.getConfig().saveConfigs();
/*     */       }
/*  54 */       if (args[0].equalsIgnoreCase("3")) {
/*  55 */         ArenaConfig.getConfig();
/*  56 */         API.setWarp(p, "Arena");
/*  57 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Arena " + ChatColor.YELLOW + "3" + ChatColor.GRAY + " Setada com Sucesso!");
/*  58 */         ArenaConfig.getConfig().config().set("arena3.x", Double.valueOf(p.getLocation().getX()));
/*  59 */         ArenaConfig.getConfig().config().set("arena3.y", Double.valueOf(p.getLocation().getY()));
/*  60 */         ArenaConfig.getConfig().config().set("arena3.z", Double.valueOf(p.getLocation().getZ()));
/*  61 */         p.getWorld();
/*  62 */         ArenaConfig.getConfig().config().set("arena3.pitch", Float.valueOf(p.getLocation().getPitch()));
/*  63 */         ArenaConfig.getConfig().config().set("arena3.yaw", Float.valueOf(p.getLocation().getYaw()));
/*  64 */         ArenaConfig.getConfig().config().set("arena3.world", p.getLocation().getWorld().getName());
/*  65 */         ArenaConfig.getConfig().saveConfigs();
/*     */       }
/*  67 */       if (args[0].equalsIgnoreCase("4")) {
/*  68 */         ArenaConfig.getConfig();
/*  69 */         API.setWarp(p, "Arena");
/*  70 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Arena " + ChatColor.YELLOW + "4" + ChatColor.GRAY + " Setada com Sucesso!");
/*  71 */         ArenaConfig.getConfig().config().set("arena4.x", Double.valueOf(p.getLocation().getX()));
/*  72 */         ArenaConfig.getConfig().config().set("arena4.y", Double.valueOf(p.getLocation().getY()));
/*  73 */         ArenaConfig.getConfig().config().set("arena4.z", Double.valueOf(p.getLocation().getZ()));
/*  74 */         p.getWorld();
/*  75 */         ArenaConfig.getConfig().config().set("arena4.pitch", Float.valueOf(p.getLocation().getPitch()));
/*  76 */         ArenaConfig.getConfig().config().set("arena4.yaw", Float.valueOf(p.getLocation().getYaw()));
/*  77 */         ArenaConfig.getConfig().config().set("arena4.world", p.getLocation().getWorld().getName());
/*  78 */         ArenaConfig.getConfig().saveConfigs();
/*     */       }
/*  80 */       if (args[0].equalsIgnoreCase("5")) {
/*  81 */         ArenaConfig.getConfig();
/*  82 */         API.setWarp(p, "Arena");
/*  83 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Arena " + ChatColor.YELLOW + "5" + ChatColor.GRAY + " Setada com Sucesso!");
/*  84 */         ArenaConfig.getConfig().config().set("arena5.x", Double.valueOf(p.getLocation().getX()));
/*  85 */         ArenaConfig.getConfig().config().set("arena5.y", Double.valueOf(p.getLocation().getY()));
/*  86 */         ArenaConfig.getConfig().config().set("arena5.z", Double.valueOf(p.getLocation().getZ()));
/*  87 */         p.getWorld();
/*  88 */         ArenaConfig.getConfig().config().set("arena5.pitch", Float.valueOf(p.getLocation().getPitch()));
/*  89 */         ArenaConfig.getConfig().config().set("arena5.yaw", Float.valueOf(p.getLocation().getYaw()));
/*  90 */         ArenaConfig.getConfig().config().set("arena5.world", p.getLocation().getWorld().getName());
/*  91 */         ArenaConfig.getConfig().saveConfigs();
/*     */       }
/*     */     } else {
/*  94 */       p.sendMessage(Strings.permissaocomando);
/*     */     }
/*  96 */     return false;
/*     */   }
/*     */   
/*     */   public static void ArenaRandom(Player p) {
/* 100 */     Random dice = new Random();
/*     */     
/* 102 */     int number = dice.nextInt(4);
/* 103 */     switch (number) {
/*     */     case 0: 
/* 105 */       World w = Bukkit.getServer().getWorld(ArenaConfig.getConfig().config().getString("arena1.world"));
/* 106 */       double x = ArenaConfig.getConfig().config().getDouble("arena1.x");
/* 107 */       double y = ArenaConfig.getConfig().config().getDouble("arena1.y");
/* 108 */       double z = ArenaConfig.getConfig().config().getDouble("arena1.z");
/* 109 */       Location lobby = new Location(w, x, y, z);
/* 110 */       lobby.setPitch((float)ArenaConfig.getConfig().config().getDouble("arena1.pitch"));
/* 111 */       lobby.setYaw((float)ArenaConfig.getConfig().config().getDouble("arena1.yaw"));
/*     */       
/* 113 */       p.teleport(lobby);
/*     */       
/* 115 */       break;
/*     */     case 1: 
/* 117 */       World w2 = Bukkit.getServer().getWorld(ArenaConfig.getConfig().config().getString("arena2.world"));
/* 118 */       double x2 = ArenaConfig.getConfig().config().getDouble("arena2.x");
/* 119 */       double y2 = ArenaConfig.getConfig().config().getDouble("arena2.y");
/* 120 */       double z2 = ArenaConfig.getConfig().config().getDouble("arena2.z");
/* 121 */       Location lobby2 = new Location(w2, x2, y2, z2);
/* 122 */       lobby2.setPitch((float)ArenaConfig.getConfig().config().getDouble("arena2.pitch"));
/* 123 */       lobby2.setYaw((float)ArenaConfig.getConfig().config().getDouble("arena2.yaw"));
/*     */       
/* 125 */       p.teleport(lobby2);
/*     */       
/* 127 */       break;
/*     */     case 2: 
/* 129 */       World w3 = Bukkit.getServer().getWorld(ArenaConfig.getConfig().config().getString("arena3.world"));
/* 130 */       double x3 = ArenaConfig.getConfig().config().getDouble("arena3.x");
/* 131 */       double y3 = ArenaConfig.getConfig().config().getDouble("arena3.y");
/* 132 */       double z3 = ArenaConfig.getConfig().config().getDouble("arena3.z");
/* 133 */       Location lobby3 = new Location(w3, x3, y3, z3);
/* 134 */       lobby3.setPitch((float)ArenaConfig.getConfig().config().getDouble("arena3.pitch"));
/* 135 */       lobby3.setYaw((float)ArenaConfig.getConfig().config().getDouble("arena3.yaw"));
/*     */       
/* 137 */       p.teleport(lobby3);
/*     */       
/* 139 */       break;
/*     */     case 3: 
/* 141 */       World w4 = Bukkit.getServer().getWorld(ArenaConfig.getConfig().config().getString("arena4.world"));
/* 142 */       double x4 = ArenaConfig.getConfig().config().getDouble("arena4.x");
/* 143 */       double y4 = ArenaConfig.getConfig().config().getDouble("arena4.y");
/* 144 */       double z4 = ArenaConfig.getConfig().config().getDouble("arena4.z");
/* 145 */       Location lobby4 = new Location(w4, x4, y4, z4);
/* 146 */       lobby4.setPitch((float)ArenaConfig.getConfig().config().getDouble("arena4.pitch"));
/* 147 */       lobby4.setYaw((float)ArenaConfig.getConfig().config().getDouble("arena4.yaw"));
/*     */       
/* 149 */       p.teleport(lobby4);
/*     */       
/* 151 */       break;
/*     */     case 4: 
/* 153 */       World w5 = Bukkit.getServer().getWorld(ArenaConfig.getConfig().config().getString("arena5.world"));
/* 154 */       double x5 = ArenaConfig.getConfig().config().getDouble("arena5.x");
/* 155 */       double y5 = ArenaConfig.getConfig().config().getDouble("arena5.y");
/* 156 */       double z5 = ArenaConfig.getConfig().config().getDouble("arena5.z");
/* 157 */       Location lobby5 = new Location(w5, x5, y5, z5);
/* 158 */       lobby5.setPitch((float)ArenaConfig.getConfig().config().getDouble("arena5.pitch"));
/* 159 */       lobby5.setYaw((float)ArenaConfig.getConfig().config().getDouble("arena5.yaw"));
/* 160 */       p.teleport(lobby5);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Arena.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */