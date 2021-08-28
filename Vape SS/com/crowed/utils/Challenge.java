/*     */ package com.crowed.utils;
/*     */ 
/*     */ import com.crowed.api.API;
/*     */ import com.crowed.api.KitAPI;
/*     */ import com.crowed.api.StatsManager;
/*     */ import com.crowed.api.WarpsAPI;
/*     */ import com.crowed.score.Updater;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.block.Sign;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.block.SignChangeEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ 
/*     */ public class Challenge implements org.bukkit.event.Listener
/*     */ {
/*     */   @EventHandler
/*     */   public void Escrever(SignChangeEvent e)
/*     */   {
/*  25 */     if (e.getLine(0).equalsIgnoreCase("lavafacil")) {
/*  26 */       e.setLine(0, "");
/*  27 */       e.setLine(1, "§e§lCHALLENGE");
/*  28 */       e.setLine(2, "§7(Fácil)");
/*  29 */       e.setLine(3, "");
/*     */     }
/*     */     
/*  32 */     if (e.getLine(0).equalsIgnoreCase("lavamedio")) {
/*  33 */       e.setLine(0, "");
/*  34 */       e.setLine(1, "§e§lCHALLENGE");
/*  35 */       e.setLine(2, "§7(Difícil)");
/*  36 */       e.setLine(3, "");
/*     */     }
/*     */     
/*  39 */     if (e.getLine(0).equalsIgnoreCase("lavadificil")) {
/*  40 */       e.setLine(0, "");
/*  41 */       e.setLine(1, "§e§lCHALLENGE");
/*  42 */       e.setLine(2, "§7(Difícil)");
/*  43 */       e.setLine(3, "");
/*     */     }
/*  45 */     if (e.getLine(0).equalsIgnoreCase("lavaextremo")) {
/*  46 */       e.setLine(0, "");
/*  47 */       e.setLine(1, "§e§lCHALLENGE");
/*  48 */       e.setLine(2, "§7(Extremo)");
/*  49 */       e.setLine(3, "");
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void inv(PlayerInteractEvent e)
/*     */   {
/*  56 */     Player p = e.getPlayer();
/*  57 */     if ((e.getAction() == org.bukkit.event.block.Action.RIGHT_CLICK_BLOCK) && 
/*  58 */       (e.getClickedBlock() != null) && (
/*  59 */       (e.getClickedBlock().getType() == Material.WALL_SIGN) || (e.getClickedBlock().getType() == Material.SIGN_POST))) {
/*  60 */       Sign s = (Sign)e.getClickedBlock().getState();
/*  61 */       String[] lines = s.getLines();
/*  62 */       if ((lines.length > 0) && (lines[0].equals("")) && 
/*  63 */         (lines.length > 1) && (lines[1].equals("§e§lCHALLENGE")) && 
/*  64 */         (lines.length > 2) && (lines[2].equals("§7(Fácil)")) && 
/*  65 */         (lines.length > 3) && (lines[3].equals("")) && 
/*  66 */         (API.getWarp(p) == "Challenge")) {
/*  67 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você completou o §e§lLavaChallenge " + ChatColor.YELLOW + ChatColor.BOLD + "Facil.");
/*  68 */         StatsManager.setCoins(p, 3);
/*  69 */         p.getInventory().clear();
/*  70 */         p.getInventory().setArmorContents(null);
/*  71 */         KitAPI.TirarKit(p);
/*  72 */         WarpsAPI.Ir(p, "Challenge");
/*  73 */         API.setWarp(p, "Challenge");
/*  74 */         KitAPI.setKit(p, "Challenge");
/*  75 */         ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/*  76 */         for (int i = 0; i < 36; i++) {
/*  77 */           p.getInventory().setItem(i, sopa);
/*  78 */           p.updateInventory();
/*     */         }
/*  80 */         p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/*  81 */         p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/*  82 */         p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/*  83 */         Updater.UpdateScore(p);
/*  84 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você ganhou 3 Coins");
/*     */       }
/*     */       
/*  87 */       if ((lines.length > 0) && (lines[0].equals("")) && 
/*  88 */         (lines.length > 1) && (lines[1].equals("§e§lCHALLENGE")) && 
/*  89 */         (lines.length > 2) && (lines[2].equals("§7(Médio)")) && 
/*  90 */         (lines.length > 3) && (lines[3].equals("")) && 
/*  91 */         (API.getWarp(p) == "Challenge")) {
/*  92 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você completou o §e§lLavaChallenge " + ChatColor.YELLOW + ChatColor.BOLD + "Medio.");
/*  93 */         StatsManager.setCoins(p, 8);
/*  94 */         p.getInventory().clear();
/*  95 */         p.getInventory().setArmorContents(null);
/*  96 */         KitAPI.TirarKit(p);
/*  97 */         WarpsAPI.Ir(p, "Challenge");
/*  98 */         API.setWarp(p, "Challenge");
/*  99 */         KitAPI.setKit(p, "Challenge");
/* 100 */         ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 101 */         for (int i = 0; i < 36; i++) {
/* 102 */           p.getInventory().setItem(i, sopa);
/* 103 */           p.updateInventory();
/*     */         }
/* 105 */         p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 106 */         p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 107 */         p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/* 108 */         Updater.UpdateScore(p);
/* 109 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você ganhou 8 Coins");
/*     */       }
/* 111 */       if ((lines.length > 0) && (lines[0].equals("")) && 
/* 112 */         (lines.length > 1) && (lines[1].equals("§e§lCHALLENGE")) && 
/* 113 */         (lines.length > 2) && (lines[2].equals("§7(Difícil)")) && 
/* 114 */         (lines.length > 3) && (lines[3].equals("")) && 
/* 115 */         (API.getWarp(p) == "Challenge")) {
/* 116 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você completou o §e§lLavaChallenge " + ChatColor.YELLOW + ChatColor.BOLD + "Dificil.");
/* 117 */         StatsManager.setCoins(p, 13);
/* 118 */         p.getInventory().clear();
/* 119 */         p.getInventory().setArmorContents(null);
/* 120 */         KitAPI.TirarKit(p);
/* 121 */         WarpsAPI.Ir(p, "Challenge");
/* 122 */         API.setWarp(p, "Challenge");
/* 123 */         KitAPI.setKit(p, "Challenge");
/* 124 */         ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 125 */         for (int i = 0; i < 36; i++) {
/* 126 */           p.getInventory().setItem(i, sopa);
/* 127 */           p.updateInventory();
/*     */         }
/* 129 */         p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 130 */         p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 131 */         p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/* 132 */         Updater.UpdateScore(p);
/* 133 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você ganhou 13 Coins");
/*     */       }
/* 135 */       if ((lines.length > 0) && (lines[0].equals("")) && 
/* 136 */         (lines.length > 1) && (lines[1].equals("§e§lCHALLENGE")) && 
/* 137 */         (lines.length > 2) && (lines[2].equals("§7(Extremo)")) && 
/* 138 */         (lines.length > 3) && (lines[3].equals("")) && 
/* 139 */         (API.getWarp(p) == "Challenge")) {
/* 140 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você completou o §e§lLavaChallenge §7difícil!");
/* 141 */         Bukkit.broadcastMessage(" ");
/* 142 */         Bukkit.broadcastMessage(ChatColor.GRAY + "O Player " + ChatColor.YELLOW + ChatColor.BOLD + p.getName() + ChatColor.GRAY + " zerou o " + ChatColor.GOLD + ChatColor.BOLD + "LavaChallenge" + ChatColor.YELLOW + ChatColor.BOLD + " Extremo" + ChatColor.GRAY + " Parabens !");
/* 143 */         Bukkit.broadcastMessage(" ");
/* 144 */         StatsManager.setCoins(p, 20);
/* 145 */         p.getInventory().clear();
/* 146 */         p.getInventory().setArmorContents(null);
/* 147 */         KitAPI.TirarKit(p);
/* 148 */         WarpsAPI.Ir(p, "Challenge");
/* 149 */         API.setWarp(p, "Challenge");
/* 150 */         KitAPI.setKit(p, "Challenge");
/* 151 */         ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 152 */         for (int i = 0; i < 36; i++) {
/* 153 */           p.getInventory().setItem(i, sopa);
/* 154 */           p.updateInventory();
/*     */         }
/* 156 */         p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 157 */         p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 158 */         p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/* 159 */         Updater.UpdateScore(p);
/* 160 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você ganhou 20 Coins");
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\utils\Challenge.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */