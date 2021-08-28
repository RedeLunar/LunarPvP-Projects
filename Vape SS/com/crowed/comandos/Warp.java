/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.api.API;
/*     */ import com.crowed.api.KitAPI;
/*     */ import com.crowed.api.WarpsAPI;
/*     */ import com.crowed.events.Proteção;
/*     */ import com.crowed.menus.WarpsMenus;
/*     */ import com.crowed.score.Updater;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.enchantments.Enchantment;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ import org.bukkit.potion.PotionEffect;
/*     */ import org.bukkit.potion.PotionEffectType;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class Warp implements CommandExecutor, Listener
/*     */ {
/*  31 */   public static ArrayList<Player> noExecut = new ArrayList();
/*     */   
/*     */   public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args)
/*     */   {
/*  35 */     final Player p = (Player)Sender;
/*     */     
/*  37 */     if (Cmd.getName().equalsIgnoreCase("warp"))
/*     */     {
/*  39 */       if (Args.length == 0) {
/*  40 */         WarpsMenus.inventory(p);
/*  41 */         return true;
/*     */       }
/*  43 */       if (Args[0].equalsIgnoreCase("fps1")) {
/*  44 */         p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
/*  45 */         p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/*  46 */         p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 99999, 99999));
/*     */         
/*  48 */         p.closeInventory();
/*  49 */         p.getInventory().clear();
/*  50 */         p.getInventory().setArmorContents(null);
/*  51 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo enviado para a warp" + ChatColor.YELLOW + ChatColor.GOLD + " FPS Sem Armadura" + ChatColor.WHITE + "!");
/*  52 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */           public void run() {
/*  54 */             p.setGameMode(GameMode.SURVIVAL);
/*  55 */             p.removePotionEffect(PotionEffectType.BLINDNESS);
/*  56 */             p.removePotionEffect(PotionEffectType.SLOW);
/*  57 */             p.removePotionEffect(PotionEffectType.CONFUSION);
/*  58 */             p.setHealth(20.0D);
/*  59 */             p.setMaxHealth(20.0D);
/*     */             
/*  61 */             p.closeInventory();
/*  62 */             p.getInventory().clear();
/*  63 */             p.getInventory().setArmorContents(null);
/*  64 */             WarpsAPI.Ir(p, "Fps1");
/*  65 */             API.setWarp(p, "Fps1");
/*  66 */             KitAPI.setKit(p, "FpsComArmadura");
/*  67 */             Updater.UpdateScore(p);
/*  68 */             WarpsAPI.iniciarFPS();
/*     */             
/*  70 */             ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/*  71 */             for (int i = 0; i < 36; i++) {
/*  72 */               p.getInventory().setItem(i, sopa);
/*  73 */               p.updateInventory();
/*     */             }
/*  75 */             Proteção.setImortalidade(p, true);
/*     */             
/*     */ 
/*  78 */             p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/*  79 */             p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/*  80 */             p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/*     */             
/*  82 */             ItemStack Espada = new ItemStack(Material.STONE_SWORD);
/*  83 */             Espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
/*  84 */             ItemMeta kEspada = Espada.getItemMeta();
/*  85 */             kEspada.setDisplayName("");
/*  86 */             Espada.setItemMeta(kEspada);
/*     */             
/*  88 */             p.getInventory().setItem(0, Espada);
/*     */           }
/*  90 */         }, 60L);
/*     */       }
/*  92 */       if (Args[0].equalsIgnoreCase("fps2")) {
/*  93 */         p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
/*  94 */         p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/*  95 */         p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 99999, 99999));
/*     */         
/*  97 */         p.closeInventory();
/*  98 */         p.getInventory().clear();
/*  99 */         p.getInventory().setArmorContents(null);
/* 100 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo enviado para a warp" + ChatColor.YELLOW + ChatColor.GOLD + " FPS Com Armadura" + ChatColor.WHITE + "!");
/* 101 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable()
/*     */         {
/*     */           public void run() {
/* 104 */             p.setGameMode(GameMode.SURVIVAL);
/* 105 */             p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 106 */             p.removePotionEffect(PotionEffectType.SLOW);
/* 107 */             p.removePotionEffect(PotionEffectType.CONFUSION);
/* 108 */             p.setHealth(20.0D);
/* 109 */             p.setMaxHealth(20.0D);
/*     */             
/* 111 */             p.closeInventory();
/* 112 */             p.getInventory().clear();
/* 113 */             p.getInventory().setArmorContents(null);
/* 114 */             WarpsAPI.iniciarFPS();
/* 115 */             WarpsAPI.Ir(p, "Fps2");
/* 116 */             API.setWarp(p, "Fps2");
/* 117 */             KitAPI.setKit(p, "FpsSemArmadura");
/* 118 */             Updater.UpdateScore(p);
/*     */             
/* 120 */             ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 121 */             for (int i = 0; i < 36; i++) {
/* 122 */               p.getInventory().setItem(i, sopa);
/* 123 */               p.updateInventory();
/*     */             }
/* 125 */             Proteção.setImortalidade(p, true);
/*     */             
/*     */ 
/* 128 */             p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 129 */             p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 130 */             p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/*     */             
/* 132 */             ItemStack Espada = new ItemStack(Material.STONE_SWORD);
/* 133 */             Espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
/* 134 */             ItemMeta kEspada = Espada.getItemMeta();
/* 135 */             kEspada.setDisplayName("");
/* 136 */             Espada.setItemMeta(kEspada);
/*     */             
/* 138 */             p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
/* 139 */             p.getInventory().setItem(0, Espada);
/*     */           }
/* 141 */         }, 60L);
/*     */       }
/* 143 */       if (Args[0].equalsIgnoreCase("challenge")) {
/* 144 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo enviado para a warp " + ChatColor.YELLOW + ChatColor.BOLD + " LAVACHALLENGE " + ChatColor.WHITE + "!");
/* 145 */         p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
/* 146 */         p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/* 147 */         p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 99999, 99999));
/*     */         
/* 149 */         p.closeInventory();
/* 150 */         p.getInventory().clear();
/* 151 */         p.getInventory().setArmorContents(null);
/*     */         
/* 153 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */           public void run() {
/* 155 */             Updater.UpdateScore(p);
/* 156 */             p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 157 */             p.removePotionEffect(PotionEffectType.SLOW);
/* 158 */             p.removePotionEffect(PotionEffectType.CONFUSION);
/* 159 */             p.setHealth(20.0D);
/* 160 */             p.setMaxHealth(20.0D);
/*     */             
/* 162 */             p.setGameMode(GameMode.SURVIVAL);
/* 163 */             p.closeInventory();
/* 164 */             p.getInventory().clear();
/* 165 */             p.getInventory().setArmorContents(null);
/* 166 */             WarpsAPI.removerFPS();
/* 167 */             Proteção.setImortalidade(p, true);
/*     */             
/* 169 */             WarpsAPI.Ir(p, "Challenge");
/* 170 */             API.setWarp(p, "Challenge");
/* 171 */             KitAPI.setKit(p, "Challenge");
/* 172 */             Updater.UpdateScore(p);
/*     */             
/*     */ 
/* 175 */             ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 176 */             for (int i = 0; i < 36; i++) {
/* 177 */               p.getInventory().setItem(i, sopa);
/* 178 */               p.updateInventory();
/*     */             }
/* 180 */             p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 181 */             p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 182 */             p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/*     */           }
/*     */           
/* 185 */         }, 60L);
/*     */       }
/* 187 */       if (Args[0].equalsIgnoreCase("knockback")) {
/* 188 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo enviado para a warp " + ChatColor.YELLOW + ChatColor.BOLD + " KNOCKBACK " + ChatColor.WHITE + "!");
/* 189 */         p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
/* 190 */         p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/* 191 */         p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 99999, 99999));
/*     */         
/* 193 */         p.closeInventory();
/* 194 */         p.getInventory().clear();
/* 195 */         p.getInventory().setArmorContents(null);
/*     */         
/* 197 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */           public void run() {
/* 199 */             Updater.UpdateScore(p);
/* 200 */             p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 201 */             p.removePotionEffect(PotionEffectType.SLOW);
/* 202 */             p.removePotionEffect(PotionEffectType.CONFUSION);
/* 203 */             p.setHealth(20.0D);
/* 204 */             p.setMaxHealth(20.0D);
/*     */             
/* 206 */             p.setGameMode(GameMode.SURVIVAL);
/* 207 */             p.closeInventory();
/* 208 */             p.getInventory().clear();
/* 209 */             p.getInventory().setArmorContents(null);
/* 210 */             WarpsAPI.removerFPS();
/* 211 */             Proteção.setImortalidade(p, true);
/*     */             
/* 213 */             WarpsAPI.Ir(p, "Knockback");
/* 214 */             API.setWarp(p, "Knockback");
/* 215 */             KitAPI.setKit(p, "Knockback");
/* 216 */             Updater.UpdateScore(p);
/*     */             
/* 218 */             ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 219 */             for (int i = 0; i < 36; i++) {
/* 220 */               p.getInventory().setItem(i, sopa);
/* 221 */               p.updateInventory();
/*     */             }
/*     */             
/* 224 */             ItemStack Espada = new ItemStack(Material.STICK);
/* 225 */             ItemMeta kEspada = Espada.getItemMeta();
/* 226 */             kEspada.setDisplayName("§eKnockBack");
/* 227 */             kEspada.addEnchant(Enchantment.KNOCKBACK, 5, true);
/* 228 */             Espada.setItemMeta(kEspada);
/*     */             
/* 230 */             p.getInventory().setItem(0, Espada);
/* 231 */             p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 232 */             p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 233 */             p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/*     */           }
/*     */           
/* 236 */         }, 60L);
/*     */       }
/* 238 */       if (Args[0].equalsIgnoreCase("fisherman")) {
/* 239 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo enviado para a warp " + ChatColor.YELLOW + ChatColor.BOLD + " FISHERMAN " + ChatColor.WHITE + "!");
/* 240 */         p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
/* 241 */         p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/* 242 */         p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 99999, 99999));
/*     */         
/* 244 */         p.closeInventory();
/* 245 */         p.getInventory().clear();
/* 246 */         p.getInventory().setArmorContents(null);
/*     */         
/* 248 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */           public void run() {
/* 250 */             Updater.UpdateScore(p);
/* 251 */             p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 252 */             p.removePotionEffect(PotionEffectType.SLOW);
/* 253 */             p.removePotionEffect(PotionEffectType.CONFUSION);
/* 254 */             p.setHealth(20.0D);
/* 255 */             p.setMaxHealth(20.0D);
/*     */             
/* 257 */             p.setGameMode(GameMode.SURVIVAL);
/* 258 */             p.closeInventory();
/* 259 */             p.getInventory().clear();
/* 260 */             p.getInventory().setArmorContents(null);
/* 261 */             WarpsAPI.removerFPS();
/* 262 */             Proteção.setImortalidade(p, true);
/*     */             
/* 264 */             WarpsAPI.Ir(p, "Fisherman");
/* 265 */             API.setWarp(p, "Fisherman");
/* 266 */             KitAPI.setKit(p, "Fisherman");
/* 267 */             Updater.UpdateScore(p);
/*     */             
/* 269 */             ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 270 */             for (int i = 0; i < 36; i++) {
/* 271 */               p.getInventory().setItem(i, sopa);
/* 272 */               p.updateInventory();
/*     */             }
/*     */             
/* 275 */             ItemStack Espada = new ItemStack(Material.FISHING_ROD);
/* 276 */             ItemMeta kEspada = Espada.getItemMeta();
/* 277 */             kEspada.setDisplayName("§eFisherman");
/* 278 */             Espada.setItemMeta(kEspada);
/*     */             
/* 280 */             p.getInventory().setItem(0, Espada);
/* 281 */             p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 282 */             p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 283 */             p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/*     */           }
/*     */           
/* 286 */         }, 60L);
/*     */       }
/* 288 */       if (Args[0].equalsIgnoreCase("textura")) {
/* 289 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo enviado para a warp " + ChatColor.YELLOW + ChatColor.BOLD + " TEXTURA " + ChatColor.WHITE + "!");
/* 290 */         p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
/* 291 */         p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/* 292 */         p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 99999, 99999));
/*     */         
/* 294 */         p.closeInventory();
/* 295 */         p.getInventory().clear();
/* 296 */         p.getInventory().setArmorContents(null);
/*     */         
/* 298 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */           public void run() {
/* 300 */             Updater.UpdateScore(p);
/* 301 */             p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 302 */             p.removePotionEffect(PotionEffectType.SLOW);
/* 303 */             p.removePotionEffect(PotionEffectType.CONFUSION);
/* 304 */             p.setHealth(20.0D);
/* 305 */             p.setMaxHealth(20.0D);
/*     */             
/* 307 */             p.setGameMode(GameMode.SURVIVAL);
/* 308 */             p.closeInventory();
/* 309 */             p.getInventory().clear();
/* 310 */             p.getInventory().setArmorContents(null);
/* 311 */             WarpsAPI.removerFPS();
/* 312 */             Proteção.setImortalidade(p, true);
/*     */             
/* 314 */             WarpsAPI.Ir(p, "Textura");
/* 315 */             API.setWarp(p, "Textura");
/* 316 */             KitAPI.setKit(p, "Textura");
/* 317 */             Updater.UpdateScore(p);
/*     */             
/*     */ 
/* 320 */             ItemStack Espada = new ItemStack(Material.STONE_SWORD);
/* 321 */             ItemMeta kEspada = Espada.getItemMeta();
/* 322 */             kEspada.setDisplayName("§eEspada");
/* 323 */             Espada.setItemMeta(kEspada);
/*     */             
/* 325 */             ItemStack Espada1 = new ItemStack(Material.WOOD_SWORD);
/* 326 */             ItemMeta kEspada1 = Espada1.getItemMeta();
/* 327 */             kEspada1.setDisplayName("§eEspada1");
/* 328 */             Espada1.setItemMeta(kEspada1);
/*     */             
/* 330 */             ItemStack Espada2 = new ItemStack(Material.GOLD_SWORD);
/* 331 */             ItemMeta kEspada2 = Espada2.getItemMeta();
/* 332 */             kEspada2.setDisplayName("§eEspada2");
/* 333 */             Espada2.setItemMeta(kEspada2);
/*     */             
/* 335 */             ItemStack Espada3 = new ItemStack(Material.IRON_SWORD);
/* 336 */             ItemMeta kEspada3 = Espada3.getItemMeta();
/* 337 */             kEspada3.setDisplayName("§eEspada3");
/* 338 */             Espada3.setItemMeta(kEspada3);
/*     */             
/* 340 */             ItemStack Espada4 = new ItemStack(Material.DIAMOND_SWORD);
/* 341 */             ItemMeta kEspada4 = Espada4.getItemMeta();
/* 342 */             kEspada4.setDisplayName("§eEspada4");
/* 343 */             Espada4.setItemMeta(kEspada4);
/*     */             
/* 345 */             ItemStack Fisherman = new ItemStack(Material.FISHING_ROD);
/* 346 */             ItemMeta kFisherman = Fisherman.getItemMeta();
/* 347 */             kFisherman.setDisplayName("§eFisherman");
/* 348 */             Fisherman.setItemMeta(kFisherman);
/*     */             
/* 350 */             ItemStack Kangaroo = new ItemStack(Material.FIREWORK);
/* 351 */             ItemMeta kKangaroo = Kangaroo.getItemMeta();
/* 352 */             kKangaroo.setDisplayName("§eKangaroo");
/* 353 */             Kangaroo.setItemMeta(kKangaroo);
/*     */             
/* 355 */             p.getInventory().setItem(0, Espada);
/* 356 */             p.getInventory().setItem(1, Espada1);
/* 357 */             p.getInventory().setItem(2, Espada2);
/* 358 */             p.getInventory().setItem(3, Espada3);
/* 359 */             p.getInventory().setItem(4, Espada4);
/* 360 */             p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 1, (short)0));
/* 361 */             p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 1, (short)0));
/* 362 */             p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 1, (short)0));
/*     */           }
/*     */           
/* 365 */         }, 60L);
/*     */       }
/* 367 */       if (Args[0].equalsIgnoreCase("voidchallenge")) {
/* 368 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo enviado para a warp " + ChatColor.YELLOW + ChatColor.BOLD + " VOIDCHALLENGE " + ChatColor.WHITE + "!");
/* 369 */         p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 99999, 99999));
/* 370 */         p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/* 371 */         p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 99999, 99999));
/*     */         
/* 373 */         p.closeInventory();
/* 374 */         p.getInventory().clear();
/* 375 */         p.getInventory().setArmorContents(null);
/*     */         
/* 377 */         Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*     */           public void run() {
/* 379 */             Updater.UpdateScore(p);
/* 380 */             p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 381 */             p.removePotionEffect(PotionEffectType.SLOW);
/* 382 */             p.removePotionEffect(PotionEffectType.CONFUSION);
/* 383 */             p.setHealth(20.0D);
/* 384 */             p.setMaxHealth(20.0D);
/*     */             
/* 386 */             p.setGameMode(GameMode.SURVIVAL);
/* 387 */             p.closeInventory();
/* 388 */             p.getInventory().clear();
/* 389 */             p.getInventory().setArmorContents(null);
/* 390 */             WarpsAPI.removerFPS();
/* 391 */             Proteção.setImortalidade(p, true);
/*     */             
/* 393 */             WarpsAPI.Ir(p, "VoidChallenge");
/* 394 */             API.setWarp(p, "VoidChallenge");
/* 395 */             KitAPI.setKit(p, "VoidChallenge");
/* 396 */             Updater.UpdateScore(p);
/*     */             
/*     */ 
/* 399 */             ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
/* 400 */             for (int i = 0; i < 36; i++) {
/* 401 */               p.getInventory().setItem(i, sopa);
/* 402 */               p.updateInventory();
/*     */             }
/* 404 */             p.getInventory().setItem(13, API.criarItem(p, Material.RED_MUSHROOM, "", new String[0], 64, (short)0));
/* 405 */             p.getInventory().setItem(14, API.criarItem(p, Material.BROWN_MUSHROOM, "", new String[0], 64, (short)0));
/* 406 */             p.getInventory().setItem(15, API.criarItem(p, Material.BOWL, "", new String[0], 64, (short)0));
/*     */           }
/*     */           
/* 409 */         }, 60L);
/*     */       }
/*     */     }
/*     */     
/* 413 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Warp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */