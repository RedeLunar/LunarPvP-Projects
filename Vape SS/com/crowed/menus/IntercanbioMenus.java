/*     */ package com.crowed.menus;
/*     */ 
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.inventory.InventoryClickEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ public class IntercanbioMenus implements org.bukkit.event.Listener
/*     */ {
/*     */   @org.bukkit.event.EventHandler
/*     */   public void CliclarLojas(InventoryClickEvent e)
/*     */   {
/*  14 */     Player p = (Player)e.getWhoClicked();
/*  15 */     if ((e.getInventory().getTitle().equalsIgnoreCase("§7Lojas")) && (e.getCurrentItem() != null) && (e.getCurrentItem().getTypeId() != 0)) {
/*  16 */       e.setCancelled(true);
/*  17 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§l<")) {
/*  18 */         e.setCancelled(true);
/*  19 */         MenuMenus.inventory(p);
/*  20 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void CliclarMinigames(InventoryClickEvent e) {
/*  27 */     Player p = (Player)e.getWhoClicked();
/*  28 */     if ((e.getInventory().getTitle().equalsIgnoreCase("§7Minigames")) && (e.getCurrentItem() != null) && (e.getCurrentItem().getTypeId() != 0)) {
/*  29 */       e.setCancelled(true);
/*  30 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§l<")) {
/*  31 */         e.setCancelled(true);
/*  32 */         MenuMenus.inventory(p);
/*  33 */         return;
/*     */       }
/*  35 */       if (e.getCurrentItem().getType() == Material.NAME_TAG) {
/*  36 */         e.setCancelled(true);
/*  37 */         p.closeInventory();
/*  38 */         p.chat("/cps");
/*  39 */         return;
/*     */       }
/*  41 */       if (e.getCurrentItem().getType() == Material.ANVIL) {
/*  42 */         e.setCancelled(true);
/*  43 */         p.closeInventory();
/*  44 */         p.chat("/warp voidchallenge");
/*  45 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void CliclarKits(InventoryClickEvent e)
/*     */   {
/*  53 */     Player p = (Player)e.getWhoClicked();
/*  54 */     if ((e.getInventory().getTitle().equalsIgnoreCase("§7Kits")) && (e.getCurrentItem() != null) && (e.getCurrentItem().getTypeId() != 0)) {
/*  55 */       e.setCancelled(true);
/*     */       
/*  57 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fWarps")) {
/*  58 */         e.setCancelled(true);
/*  59 */         WarpsMenus.inventory(p);
/*  60 */         return;
/*     */       }
/*  62 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fMenu")) {
/*  63 */         e.setCancelled(true);
/*  64 */         MenuMenus.inventory(p);
/*  65 */         return;
/*     */       }
/*  67 */       if (e.getCurrentItem().getType() == Material.STONE_SWORD) {
/*  68 */         e.setCancelled(true);
/*  69 */         p.closeInventory();
/*  70 */         p.chat("/kit pvp");
/*  71 */         return;
/*     */       }
/*  73 */       if (e.getCurrentItem().getType() == Material.FIREWORK) {
/*  74 */         e.setCancelled(true);
/*  75 */         p.closeInventory();
/*  76 */         p.chat("/kit kangaroo");
/*  77 */         return;
/*     */       }
/*  79 */       if (e.getCurrentItem().getType() == Material.ENCHANTED_BOOK) {
/*  80 */         e.setCancelled(true);
/*  81 */         p.closeInventory();
/*  82 */         p.chat("/kit specialist");
/*  83 */         return;
/*     */       }
/*  85 */       if (e.getCurrentItem().getType() == Material.IRON_FENCE) {
/*  86 */         e.setCancelled(true);
/*  87 */         p.closeInventory();
/*  88 */         p.chat("/kit gladiator");
/*  89 */         return;
/*     */       }
/*  91 */       if (e.getCurrentItem().getType() == Material.WEB) {
/*  92 */         e.setCancelled(true);
/*  93 */         p.closeInventory();
/*  94 */         p.chat("/kit snail");
/*  95 */         return;
/*     */       }
/*  97 */       if (e.getCurrentItem().getType() == Material.EMERALD) {
/*  98 */         e.setCancelled(true);
/*  99 */         p.closeInventory();
/* 100 */         p.chat("/kit ninja");
/* 101 */         return;
/*     */       }
/* 103 */       if (e.getCurrentItem().getType() == Material.SPIDER_EYE) {
/* 104 */         e.setCancelled(true);
/* 105 */         p.closeInventory();
/* 106 */         p.chat("/kit viper");
/* 107 */         return;
/*     */       }
/* 109 */       if (e.getCurrentItem().getType() == Material.ANVIL) {
/* 110 */         e.setCancelled(true);
/* 111 */         p.closeInventory();
/* 112 */         p.chat("/kit anchor");
/* 113 */         return;
/*     */       }
/* 115 */       if (e.getCurrentItem().getType() == Material.FISHING_ROD) {
/* 116 */         e.setCancelled(true);
/* 117 */         p.closeInventory();
/* 118 */         p.chat("/kit fisherman");
/* 119 */         return;
/*     */       }
/* 121 */       if (e.getCurrentItem().getType() == Material.GOLD_AXE) {
/* 122 */         e.setCancelled(true);
/* 123 */         p.closeInventory();
/* 124 */         p.chat("/kit thor");
/* 125 */         return;
/*     */       }
/* 127 */       if (e.getCurrentItem().getType() == Material.SNOW_BALL) {
/* 128 */         e.setCancelled(true);
/* 129 */         p.closeInventory();
/* 130 */         p.chat("/kit switcher");
/* 131 */         return;
/*     */       }
/* 133 */       if (e.getCurrentItem().getType() == Material.MAGMA_CREAM) {
/* 134 */         e.setCancelled(true);
/* 135 */         p.closeInventory();
/* 136 */         p.chat("/kit magma");
/* 137 */         return;
/*     */       }
/* 139 */       if (e.getCurrentItem().getType() == Material.NETHER_STAR) {
/* 140 */         e.setCancelled(true);
/* 141 */         p.closeInventory();
/* 142 */         p.chat("/kit ajnin");
/* 143 */         return;
/*     */       }
/* 145 */       if (e.getCurrentItem().getType() == Material.IRON_BLOCK) {
/* 146 */         e.setCancelled(true);
/* 147 */         p.closeInventory();
/* 148 */         p.chat("/kit critical");
/* 149 */         return;
/*     */       }
/* 151 */       if (e.getCurrentItem().getType() == Material.FERMENTED_SPIDER_EYE) {
/* 152 */         e.setCancelled(true);
/* 153 */         p.closeInventory();
/* 154 */         p.chat("/kit madman");
/* 155 */         return;
/*     */       }
/* 157 */       if (e.getCurrentItem().getType() == Material.WATCH) {
/* 158 */         e.setCancelled(true);
/* 159 */         p.closeInventory();
/* 160 */         p.chat("/kit strong");
/* 161 */         return;
/*     */       }
/* 163 */       if (e.getCurrentItem().getType() == Material.IRON_AXE) {
/* 164 */         e.setCancelled(true);
/* 165 */         p.closeInventory();
/* 166 */         p.chat("/kit viking");
/* 167 */         return;
/*     */       }
/* 169 */       if (e.getCurrentItem().getType() == Material.BLAZE_ROD) {
/* 170 */         e.setCancelled(true);
/* 171 */         p.closeInventory();
/* 172 */         p.chat("/kit monk");
/* 173 */         return;
/*     */       }
/* 175 */       if (e.getCurrentItem().getType() == Material.LEASH) {
/* 176 */         e.setCancelled(true);
/* 177 */         p.closeInventory();
/* 178 */         p.chat("/kit grappler");
/* 179 */         return;
/*     */       }
/* 181 */       if (e.getCurrentItem().getType() == Material.SADDLE) {
/* 182 */         e.setCancelled(true);
/* 183 */         p.closeInventory();
/* 184 */         p.chat("/kit hulk");
/* 185 */         return;
/*     */       }
/* 187 */       if (e.getCurrentItem().getType() == Material.FEATHER) {
/* 188 */         e.setCancelled(true);
/* 189 */         p.closeInventory();
/* 190 */         p.chat("/kit phantom");
/* 191 */         return;
/*     */       }
/* 193 */       if (e.getCurrentItem().getType() == Material.APPLE) {
/* 194 */         e.setCancelled(true);
/* 195 */         p.closeInventory();
/* 196 */         p.chat("/kit sumo");
/* 197 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void CliclarInformaçoes(InventoryClickEvent e)
/*     */   {
/* 205 */     Player p = (Player)e.getWhoClicked();
/* 206 */     if ((e.getInventory().getTitle().equalsIgnoreCase("§7Informaçoes")) && (e.getCurrentItem() != null) && (e.getCurrentItem().getTypeId() != 0)) {
/* 207 */       e.setCancelled(true);
/*     */       
/* 209 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fKits")) {
/* 210 */         e.setCancelled(true);
/* 211 */         KitsMenus.menuentory(p);
/* 212 */         return;
/*     */       }
/* 214 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§l<")) {
/* 215 */         e.setCancelled(true);
/* 216 */         MenuMenus.inventory(p);
/* 217 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void CliclarMenu(InventoryClickEvent e)
/*     */   {
/* 225 */     Player p = (Player)e.getWhoClicked();
/* 226 */     if ((e.getInventory().getTitle().equalsIgnoreCase("§7Menu")) && (e.getCurrentItem() != null) && (e.getCurrentItem().getTypeId() != 0)) {
/* 227 */       e.setCancelled(true);
/*     */       
/* 229 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fKits")) {
/* 230 */         e.setCancelled(true);
/* 231 */         KitsMenus.menuentory(p);
/* 232 */         return;
/*     */       }
/* 234 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fWarps")) {
/* 235 */         e.setCancelled(true);
/* 236 */         WarpsMenus.inventory(p);
/* 237 */         return;
/*     */       }
/* 239 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eLojas")) {
/* 240 */         e.setCancelled(true);
/* 241 */         LojasMenus.inventory(p);
/* 242 */         return;
/*     */       }
/* 244 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eMinigames")) {
/* 245 */         e.setCancelled(true);
/* 246 */         MinigamesMenus.inventory(p);
/* 247 */         return;
/*     */       }
/* 249 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§eInformaçoes")) {
/* 250 */         e.setCancelled(true);
/* 251 */         InformaçoesMenus.inventory(p);
/* 252 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void CliclarWarps(InventoryClickEvent e) {
/* 259 */     Player p = (Player)e.getWhoClicked();
/* 260 */     if ((e.getInventory().getTitle().equalsIgnoreCase("§7Warps")) && (e.getCurrentItem() != null) && (e.getCurrentItem().getTypeId() != 0)) {
/* 261 */       e.setCancelled(true);
/*     */       
/* 263 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fKits")) {
/* 264 */         e.setCancelled(true);
/* 265 */         KitsMenus.menuentory(p);
/* 266 */         return;
/*     */       }
/* 268 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§fMenu")) {
/* 269 */         e.setCancelled(true);
/* 270 */         MenuMenus.inventory(p);
/* 271 */         return;
/*     */       }
/* 273 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lFPS")) {
/* 274 */         e.setCancelled(true);
/* 275 */         FpsMenus.inventory(p);
/* 276 */         return;
/*     */       }
/* 278 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lCHALLENGE")) {
/* 279 */         e.setCancelled(true);
/* 280 */         p.chat("/warp challenge");
/* 281 */         return;
/*     */       }
/* 283 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lKNOCKBACK")) {
/* 284 */         e.setCancelled(true);
/* 285 */         p.chat("/warp knockback");
/* 286 */         return;
/*     */       }
/* 288 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lFISHERMAN")) {
/* 289 */         e.setCancelled(true);
/* 290 */         p.chat("/warp fisherman");
/* 291 */         return;
/*     */       }
/* 293 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lTEXTURAS")) {
/* 294 */         e.setCancelled(true);
/* 295 */         p.chat("/warp textura");
/* 296 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void ClicarFps(InventoryClickEvent e)
/*     */   {
/* 304 */     Player p = (Player)e.getWhoClicked();
/* 305 */     if ((e.getInventory().getTitle().equalsIgnoreCase("§7Warps")) && (e.getCurrentItem() != null) && (e.getCurrentItem().getTypeId() != 0)) {
/* 306 */       e.setCancelled(true);
/*     */       
/* 308 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lFPS - §7(Sem armadura)")) {
/* 309 */         e.setCancelled(true);
/* 310 */         p.chat("/warp fps1");
/* 311 */         return;
/*     */       }
/* 313 */       if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§e§lFPS - §7(Com armadura)")) {
/* 314 */         e.setCancelled(true);
/* 315 */         p.chat("/warp fps2");
/* 316 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\IntercanbioMenus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */