/*     */ package com.crowed.api;
/*     */ 
/*     */ import com.crowed.comandos.Arena;
/*     */ import com.crowed.events.Proteção;
/*     */ import com.crowed.score.Updater;
/*     */ import java.util.HashMap;
/*     */ import org.bukkit.Color;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.enchantments.Enchantment;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ import org.bukkit.inventory.meta.LeatherArmorMeta;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KitAPI
/*     */ {
/*     */   public static ItemStack sopa;
/*     */   public static ItemMeta sopam;
/*     */   public static ItemStack cogu1;
/*     */   public static ItemMeta cogu1m;
/*     */   public static ItemStack cogu2;
/*     */   public static ItemMeta cogu2m;
/*     */   public static ItemStack pote;
/*     */   public static ItemMeta potem;
/*  28 */   public static HashMap<String, String> Kit = new HashMap();
/*     */   
/*     */   public static void setKit(Player p, String kit) {
/*  31 */     Kit.put(p.getName(), kit);
/*     */   }
/*     */   
/*     */   public static String getKit(Player p) {
/*  35 */     if (Kit.containsKey(p.getName())) {
/*  36 */       return (String)Kit.get(p.getName());
/*     */     }
/*  38 */     return "Nenhum";
/*     */   }
/*     */   
/*     */   public static void TirarKit(Player p)
/*     */   {
/*  43 */     Kit.remove(p.getName());
/*     */   }
/*     */   
/*     */   public static void DarSopa(Player p) {
/*  47 */     sopa = new ItemStack(Material.MUSHROOM_SOUP);
/*  48 */     sopam = sopa.getItemMeta();
/*  49 */     sopam.setDisplayName("");
/*  50 */     sopa.setItemMeta(sopam);
/*     */     
/*  52 */     pote = new ItemStack(Material.BOWL, 64);
/*  53 */     potem = pote.getItemMeta();
/*  54 */     potem.setDisplayName("");
/*  55 */     pote.setItemMeta(potem);
/*     */     
/*  57 */     cogu1 = new ItemStack(Material.BROWN_MUSHROOM, 64);
/*  58 */     cogu1m = cogu1.getItemMeta();
/*  59 */     cogu1m.setDisplayName("");
/*  60 */     cogu1.setItemMeta(cogu1m);
/*     */     
/*  62 */     cogu2 = new ItemStack(Material.RED_MUSHROOM, 64);
/*  63 */     cogu2m = cogu2.getItemMeta();
/*  64 */     cogu2m.setDisplayName("");
/*  65 */     cogu2.setItemMeta(cogu2m);
/*     */     
/*  67 */     ItemStack Peito = new ItemStack(Material.LEATHER_CHESTPLATE);
/*  68 */     LeatherArmorMeta kPeito = (LeatherArmorMeta)Peito.getItemMeta();
/*  69 */     kPeito.setDisplayName("§ePeitoral");
/*  70 */     kPeito.setColor(Color.YELLOW);
/*  71 */     Peito.setItemMeta(kPeito);
/*  72 */     p.getInventory().setChestplate(Peito);
/*     */     
/*  74 */     ItemStack bussula = new ItemStack(Material.COMPASS);
/*  75 */     ItemMeta bussulameta = bussula.getItemMeta();
/*  76 */     bussulameta.setDisplayName("§aBussula");
/*  77 */     bussula.setItemMeta(bussulameta);
/*     */     
/*  79 */     p.getInventory().setItem(8, bussula);
/*     */     
/*  81 */     for (int i = 1; i < 35; i++) {
/*  82 */       p.getInventory().addItem(new ItemStack[] { sopa });
/*  83 */       p.getInventory().setItem(13, pote);
/*  84 */       p.getInventory().setItem(14, cogu1);
/*  85 */       p.getInventory().setItem(15, cogu2);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void PvP(Player p) {
/*  90 */     setKit(p, "PvP");
/*  91 */     Updater.UpdateScore(p);
/*  92 */     p.getInventory().clear();
/*  93 */     DarSopa(p);
/*  94 */     Arena.ArenaRandom(p);
/*  95 */     Proteção.setImortalidade(p, false);
/*  96 */     p.setAllowFlight(false);
/*     */     
/*  98 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/*  99 */     espada.addEnchantment(Enchantment.DAMAGE_ALL, 1);
/* 100 */     ItemMeta espadam = espada.getItemMeta();
/* 101 */     espadam.setDisplayName("§aEspada");
/* 102 */     espada.setItemMeta(espadam);
/*     */     
/* 104 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/*     */   public static void Kangaroo(Player p)
/*     */   {
/* 109 */     setKit(p, "Kangaroo");
/* 110 */     Updater.UpdateScore(p);
/* 111 */     p.getInventory().clear();
/* 112 */     DarSopa(p);
/* 113 */     Arena.ArenaRandom(p);
/* 114 */     Proteção.setImortalidade(p, false);
/* 115 */     p.setAllowFlight(false);
/*     */     
/* 117 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 118 */     ItemMeta espadam = espada.getItemMeta();
/* 119 */     espadam.setDisplayName("§aEspada");
/* 120 */     espada.setItemMeta(espadam);
/*     */     
/* 122 */     ItemStack kan = new ItemStack(Material.FIREWORK);
/* 123 */     ItemMeta kanm = kan.getItemMeta();
/* 124 */     kanm.setDisplayName("§eKangaroo");
/* 125 */     kan.setItemMeta(kanm);
/*     */     
/* 127 */     p.getInventory().setItem(0, espada);
/* 128 */     p.getInventory().setItem(1, kan);
/*     */   }
/*     */   
/*     */   public static void Specialist(Player p)
/*     */   {
/* 133 */     setKit(p, "Specialist");
/* 134 */     Updater.UpdateScore(p);
/* 135 */     p.getInventory().clear();
/* 136 */     DarSopa(p);
/* 137 */     Arena.ArenaRandom(p);
/* 138 */     Proteção.setImortalidade(p, false);
/* 139 */     p.setAllowFlight(false);
/*     */     
/* 141 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 142 */     ItemMeta espadam = espada.getItemMeta();
/* 143 */     espadam.setDisplayName("§aEspada");
/* 144 */     espada.setItemMeta(espadam);
/*     */     
/* 146 */     ItemStack kan = new ItemStack(Material.ENCHANTED_BOOK);
/* 147 */     ItemMeta kanm = kan.getItemMeta();
/* 148 */     kanm.setDisplayName("§eSpecialist");
/* 149 */     kan.setItemMeta(kanm);
/*     */     
/* 151 */     p.getInventory().setItem(0, espada);
/* 152 */     p.getInventory().setItem(1, kan);
/*     */   }
/*     */   
/*     */   public static void Stomper(Player p)
/*     */   {
/* 157 */     setKit(p, "Stomper");
/* 158 */     Updater.UpdateScore(p);
/* 159 */     p.getInventory().clear();
/* 160 */     DarSopa(p);
/* 161 */     Arena.ArenaRandom(p);
/* 162 */     Proteção.setImortalidade(p, false);
/* 163 */     p.setAllowFlight(false);
/*     */     
/* 165 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 166 */     ItemMeta espadam = espada.getItemMeta();
/* 167 */     espadam.setDisplayName("§aEspada");
/* 168 */     espada.setItemMeta(espadam);
/*     */     
/* 170 */     ItemStack kan = new ItemStack(Material.EMERALD);
/* 171 */     ItemMeta kanm = kan.getItemMeta();
/* 172 */     kanm.setDisplayName("§eStomper");
/* 173 */     kan.setItemMeta(kanm);
/*     */     
/* 175 */     p.getInventory().setItem(0, espada);
/* 176 */     p.getInventory().setItem(1, kan);
/*     */   }
/*     */   
/*     */   public static void Gladiator(Player p) {
/* 180 */     setKit(p, "Gladiator");
/* 181 */     Updater.UpdateScore(p);
/* 182 */     p.getInventory().clear();
/* 183 */     DarSopa(p);
/* 184 */     Arena.ArenaRandom(p);
/* 185 */     Proteção.setImortalidade(p, false);
/* 186 */     p.setAllowFlight(false);
/*     */     
/* 188 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 189 */     ItemMeta espadam = espada.getItemMeta();
/* 190 */     espadam.setDisplayName("§aEspada");
/* 191 */     espada.setItemMeta(espadam);
/*     */     
/* 193 */     ItemStack kan = new ItemStack(Material.IRON_FENCE);
/* 194 */     ItemMeta kanm = kan.getItemMeta();
/* 195 */     kanm.setDisplayName("§eGladiator");
/* 196 */     kan.setItemMeta(kanm);
/*     */     
/*     */ 
/*     */ 
/* 200 */     p.getInventory().setItem(0, espada);
/* 201 */     p.getInventory().setItem(1, kan);
/*     */   }
/*     */   
/*     */   public static void Snail(Player p) {
/* 205 */     setKit(p, "Snail");
/* 206 */     Updater.UpdateScore(p);
/* 207 */     p.getInventory().clear();
/* 208 */     DarSopa(p);
/* 209 */     Arena.ArenaRandom(p);
/* 210 */     Proteção.setImortalidade(p, false);
/* 211 */     p.setAllowFlight(false);
/*     */     
/* 213 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 214 */     ItemMeta espadam = espada.getItemMeta();
/* 215 */     espadam.setDisplayName("§aEspada");
/* 216 */     espada.setItemMeta(espadam);
/*     */     
/*     */ 
/* 219 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 222 */   public static void Viper(Player p) { setKit(p, "Viper");
/* 223 */     Updater.UpdateScore(p);
/* 224 */     p.getInventory().clear();
/* 225 */     DarSopa(p);
/* 226 */     Arena.ArenaRandom(p);
/* 227 */     Proteção.setImortalidade(p, false);
/* 228 */     p.setAllowFlight(false);
/*     */     
/* 230 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 231 */     ItemMeta espadam = espada.getItemMeta();
/* 232 */     espadam.setDisplayName("§aEspada");
/* 233 */     espada.setItemMeta(espadam);
/*     */     
/*     */ 
/* 236 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 239 */   public static void Ninja(Player p) { setKit(p, "Ninja");
/* 240 */     Updater.UpdateScore(p);
/* 241 */     p.getInventory().clear();
/* 242 */     DarSopa(p);
/* 243 */     Arena.ArenaRandom(p);
/* 244 */     Proteção.setImortalidade(p, false);
/* 245 */     p.setAllowFlight(false);
/*     */     
/* 247 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 248 */     ItemMeta espadam = espada.getItemMeta();
/* 249 */     espadam.setDisplayName("§aEspada");
/* 250 */     espada.setItemMeta(espadam);
/*     */     
/*     */ 
/* 253 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 256 */   public static void Fisherman(Player p) { setKit(p, "Fisherman");
/* 257 */     Updater.UpdateScore(p);
/* 258 */     p.getInventory().clear();
/* 259 */     DarSopa(p);
/* 260 */     Arena.ArenaRandom(p);
/* 261 */     Proteção.setImortalidade(p, false);
/* 262 */     p.setAllowFlight(false);
/*     */     
/* 264 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 265 */     ItemMeta espadam = espada.getItemMeta();
/* 266 */     espadam.setDisplayName("§aEspada");
/* 267 */     espada.setItemMeta(espadam);
/*     */     
/* 269 */     ItemStack kan = new ItemStack(Material.FISHING_ROD);
/* 270 */     ItemMeta kanm = kan.getItemMeta();
/* 271 */     kanm.setDisplayName("§eFisherman");
/* 272 */     kan.setItemMeta(kanm);
/*     */     
/*     */ 
/*     */ 
/* 276 */     p.getInventory().setItem(0, espada);
/* 277 */     p.getInventory().setItem(1, kan);
/*     */   }
/*     */   
/*     */   public static void Switcher(Player p) {
/* 281 */     setKit(p, "Switcher");
/* 282 */     Updater.UpdateScore(p);
/* 283 */     p.getInventory().clear();
/* 284 */     DarSopa(p);
/* 285 */     Arena.ArenaRandom(p);
/* 286 */     Proteção.setImortalidade(p, false);
/* 287 */     p.setAllowFlight(false);
/*     */     
/* 289 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 290 */     ItemMeta espadam = espada.getItemMeta();
/* 291 */     espadam.setDisplayName("§aEspada");
/* 292 */     espada.setItemMeta(espadam);
/*     */     
/* 294 */     ItemStack kan = new ItemStack(Material.SNOW_BALL, 64);
/* 295 */     ItemMeta kanm = kan.getItemMeta();
/* 296 */     kanm.setDisplayName("§eSwitcher");
/* 297 */     kan.setItemMeta(kanm);
/*     */     
/* 299 */     p.getInventory().setItem(0, espada);
/* 300 */     p.getInventory().setItem(1, kan);
/*     */   }
/*     */   
/* 303 */   public static void Thor(Player p) { setKit(p, "Thor");
/* 304 */     Updater.UpdateScore(p);
/* 305 */     p.getInventory().clear();
/* 306 */     DarSopa(p);
/* 307 */     Arena.ArenaRandom(p);
/* 308 */     Proteção.setImortalidade(p, false);
/* 309 */     p.setAllowFlight(false);
/*     */     
/* 311 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 312 */     ItemMeta espadam = espada.getItemMeta();
/* 313 */     espadam.setDisplayName("§aEspada");
/* 314 */     espada.setItemMeta(espadam);
/*     */     
/* 316 */     ItemStack kan = new ItemStack(Material.GOLD_AXE);
/* 317 */     ItemMeta kanm = kan.getItemMeta();
/* 318 */     kanm.setDisplayName("§eThor");
/* 319 */     kan.setItemMeta(kanm);
/*     */     
/* 321 */     p.getInventory().setItem(0, espada);
/* 322 */     p.getInventory().setItem(1, kan);
/*     */   }
/*     */   
/* 325 */   public static void Anchor(Player p) { setKit(p, "Anchor");
/* 326 */     Updater.UpdateScore(p);
/* 327 */     p.getInventory().clear();
/* 328 */     DarSopa(p);
/* 329 */     Arena.ArenaRandom(p);
/* 330 */     Proteção.setImortalidade(p, false);
/* 331 */     p.setAllowFlight(false);
/*     */     
/* 333 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 334 */     ItemMeta espadam = espada.getItemMeta();
/* 335 */     espadam.setDisplayName("§aEspada");
/* 336 */     espada.setItemMeta(espadam);
/*     */     
/* 338 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 341 */   public static void Magma(Player p) { setKit(p, "Magma");
/* 342 */     Updater.UpdateScore(p);
/* 343 */     p.getInventory().clear();
/* 344 */     DarSopa(p);
/* 345 */     Arena.ArenaRandom(p);
/* 346 */     Proteção.setImortalidade(p, false);
/* 347 */     p.setAllowFlight(false);
/*     */     
/* 349 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 350 */     ItemMeta espadam = espada.getItemMeta();
/* 351 */     espadam.setDisplayName("§aEspada");
/* 352 */     espada.setItemMeta(espadam);
/*     */     
/* 354 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 357 */   public static void Critical(Player p) { setKit(p, "Critical");
/* 358 */     Updater.UpdateScore(p);
/* 359 */     p.getInventory().clear();
/* 360 */     DarSopa(p);
/* 361 */     Arena.ArenaRandom(p);
/* 362 */     Proteção.setImortalidade(p, false);
/* 363 */     p.setAllowFlight(false);
/*     */     
/* 365 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 366 */     ItemMeta espadam = espada.getItemMeta();
/* 367 */     espadam.setDisplayName("§aEspada");
/* 368 */     espada.setItemMeta(espadam);
/*     */     
/* 370 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 373 */   public static void Ajnin(Player p) { setKit(p, "Ajnin");
/* 374 */     Updater.UpdateScore(p);
/* 375 */     p.getInventory().clear();
/* 376 */     DarSopa(p);
/* 377 */     Arena.ArenaRandom(p);
/* 378 */     Proteção.setImortalidade(p, false);
/* 379 */     p.setAllowFlight(false);
/*     */     
/* 381 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 382 */     ItemMeta espadam = espada.getItemMeta();
/* 383 */     espadam.setDisplayName("§aEspada");
/* 384 */     espada.setItemMeta(espadam);
/*     */     
/* 386 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 389 */   public static void Boxer(Player p) { setKit(p, "Boxer");
/* 390 */     Updater.UpdateScore(p);
/* 391 */     p.getInventory().clear();
/* 392 */     DarSopa(p);
/* 393 */     Arena.ArenaRandom(p);
/* 394 */     Proteção.setImortalidade(p, false);
/* 395 */     p.setAllowFlight(false);
/*     */     
/* 397 */     ItemStack espada = new ItemStack(Material.QUARTZ);
/* 398 */     ItemMeta espadam = espada.getItemMeta();
/* 399 */     espadam.setDisplayName("§aBoxer");
/* 400 */     espada.setItemMeta(espadam);
/*     */     
/* 402 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 405 */   public static void Madman(Player p) { setKit(p, "Madman");
/* 406 */     Updater.UpdateScore(p);
/* 407 */     p.getInventory().clear();
/* 408 */     DarSopa(p);
/* 409 */     Arena.ArenaRandom(p);
/* 410 */     Proteção.setImortalidade(p, false);
/* 411 */     p.setAllowFlight(false);
/*     */     
/* 413 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 414 */     ItemMeta espadam = espada.getItemMeta();
/* 415 */     espadam.setDisplayName("§aEspada");
/* 416 */     espada.setItemMeta(espadam);
/*     */     
/* 418 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 421 */   public static void Monk(Player p) { setKit(p, "Monk");
/* 422 */     Updater.UpdateScore(p);
/* 423 */     p.getInventory().clear();
/* 424 */     DarSopa(p);
/* 425 */     Arena.ArenaRandom(p);
/* 426 */     Proteção.setImortalidade(p, false);
/* 427 */     p.setAllowFlight(false);
/*     */     
/* 429 */     ItemStack monk = new ItemStack(Material.BLAZE_ROD);
/* 430 */     ItemMeta monkm = monk.getItemMeta();
/* 431 */     monkm.setDisplayName("§aMonk");
/* 432 */     monk.setItemMeta(monkm);
/*     */     
/* 434 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 435 */     ItemMeta espadam = espada.getItemMeta();
/* 436 */     espadam.setDisplayName("§aEspada");
/* 437 */     espada.setItemMeta(espadam);
/*     */     
/* 439 */     p.getInventory().setItem(1, monk);
/* 440 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 443 */   public static void Strong(Player p) { setKit(p, "Strong");
/* 444 */     Updater.UpdateScore(p);
/* 445 */     p.getInventory().clear();
/* 446 */     DarSopa(p);
/* 447 */     Arena.ArenaRandom(p);
/* 448 */     Proteção.setImortalidade(p, false);
/* 449 */     p.setAllowFlight(false);
/*     */     
/* 451 */     ItemStack monk = new ItemStack(Material.WATCH);
/* 452 */     ItemMeta monkm = monk.getItemMeta();
/* 453 */     monkm.setDisplayName("§aStrong");
/* 454 */     monk.setItemMeta(monkm);
/*     */     
/* 456 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 457 */     ItemMeta espadam = espada.getItemMeta();
/* 458 */     espadam.setDisplayName("§aEspada");
/* 459 */     espada.setItemMeta(espadam);
/*     */     
/* 461 */     p.getInventory().setItem(1, monk);
/* 462 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 465 */   public static void Viking(Player p) { setKit(p, "Viking");
/* 466 */     Updater.UpdateScore(p);
/* 467 */     p.getInventory().clear();
/* 468 */     DarSopa(p);
/* 469 */     Arena.ArenaRandom(p);
/* 470 */     Proteção.setImortalidade(p, false);
/* 471 */     p.setAllowFlight(false);
/*     */     
/* 473 */     ItemStack espada = new ItemStack(Material.IRON_AXE);
/* 474 */     ItemMeta espadam = espada.getItemMeta();
/* 475 */     espadam.setDisplayName("§aViking");
/* 476 */     espada.setItemMeta(espadam);
/*     */     
/* 478 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 481 */   public static void Grappler(Player p) { setKit(p, "Grappler");
/* 482 */     Updater.UpdateScore(p);
/* 483 */     p.getInventory().clear();
/* 484 */     DarSopa(p);
/* 485 */     Arena.ArenaRandom(p);
/* 486 */     Proteção.setImortalidade(p, false);
/* 487 */     p.setAllowFlight(false);
/*     */     
/* 489 */     ItemStack grappler = new ItemStack(Material.LEASH);
/* 490 */     ItemMeta grapplerm = grappler.getItemMeta();
/* 491 */     grapplerm.setDisplayName("§aGrappler");
/* 492 */     grappler.setItemMeta(grapplerm);
/*     */     
/* 494 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 495 */     ItemMeta espadam = espada.getItemMeta();
/* 496 */     espadam.setDisplayName("§aEspada");
/* 497 */     espada.setItemMeta(espadam);
/*     */     
/* 499 */     p.getInventory().setItem(1, grappler);
/* 500 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 503 */   public static void Hulk(Player p) { setKit(p, "Hulk");
/* 504 */     Updater.UpdateScore(p);
/* 505 */     p.getInventory().clear();
/* 506 */     DarSopa(p);
/* 507 */     Arena.ArenaRandom(p);
/* 508 */     Proteção.setImortalidade(p, false);
/* 509 */     p.setAllowFlight(false);
/*     */     
/* 511 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 512 */     ItemMeta espadam = espada.getItemMeta();
/* 513 */     espadam.setDisplayName("§aEspada");
/* 514 */     espada.setItemMeta(espadam);
/*     */     
/* 516 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 519 */   public static void Phantom(Player p) { setKit(p, "Phantom");
/* 520 */     Updater.UpdateScore(p);
/* 521 */     p.getInventory().clear();
/* 522 */     DarSopa(p);
/* 523 */     Arena.ArenaRandom(p);
/* 524 */     Proteção.setImortalidade(p, false);
/* 525 */     p.setAllowFlight(false);
/*     */     
/* 527 */     ItemStack phantom = new ItemStack(Material.FEATHER);
/* 528 */     ItemMeta phantomm = phantom.getItemMeta();
/* 529 */     phantomm.setDisplayName("§aPhantom");
/* 530 */     phantom.setItemMeta(phantomm);
/*     */     
/* 532 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 533 */     ItemMeta espadam = espada.getItemMeta();
/* 534 */     espadam.setDisplayName("§aEspada");
/* 535 */     espada.setItemMeta(espadam);
/*     */     
/* 537 */     p.getInventory().setItem(1, phantom);
/* 538 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */   
/* 541 */   public static void Sumo(Player p) { setKit(p, "Sumo");
/* 542 */     Updater.UpdateScore(p);
/* 543 */     p.getInventory().clear();
/* 544 */     DarSopa(p);
/* 545 */     Arena.ArenaRandom(p);
/* 546 */     Proteção.setImortalidade(p, false);
/* 547 */     p.setAllowFlight(false);
/*     */     
/* 549 */     ItemStack espada = new ItemStack(Material.STONE_SWORD);
/* 550 */     ItemMeta espadam = espada.getItemMeta();
/* 551 */     espadam.setDisplayName("§aEspada");
/* 552 */     espada.setItemMeta(espadam);
/*     */     
/* 554 */     p.getInventory().setItem(0, espada);
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\KitAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */