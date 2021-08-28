/*     */ package com.crowed.menus;
/*     */ 
/*     */ import com.crowed.comandos.Habilitar;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Sound;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.Inventory;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KitsMenus
/*     */ {
/*     */   public static void menuentory(Player p)
/*     */   {
/*  22 */     Inventory menu = Bukkit.createInventory(p, 54, "§7Kits");
/*     */     
/*  24 */     ItemStack kits = new ItemStack(Material.PAPER, 1, (short)10);
/*  25 */     ItemMeta kkits = kits.getItemMeta();
/*  26 */     kkits.setDisplayName("§eKits");
/*  27 */     kits.setItemMeta(kkits);
/*     */     
/*  29 */     ItemStack Warps = new ItemStack(Material.GLASS, 1, (short)8);
/*  30 */     ItemMeta kWarps = Warps.getItemMeta();
/*  31 */     kWarps.setDisplayName("§fWarps");
/*  32 */     Warps.setItemMeta(kWarps);
/*     */     
/*  34 */     ItemStack loja = new ItemStack(Material.getMaterial(351), 1, (short)8);
/*  35 */     ItemMeta kloja = loja.getItemMeta();
/*  36 */     kloja.setDisplayName("§fMenu");
/*  37 */     loja.setItemMeta(kloja);
/*     */     
/*  39 */     ItemStack vidro = new ItemStack(Material.getMaterial(160), 1, (short)0);
/*  40 */     ItemMeta kvidro = vidro.getItemMeta();
/*  41 */     kvidro.setDisplayName(ChatColor.GRAY);
/*  42 */     vidro.setItemMeta(kvidro);
/*     */     
/*  44 */     menu.setItem(0, vidro);
/*  45 */     menu.setItem(1, vidro);
/*  46 */     menu.setItem(2, vidro);
/*  47 */     menu.setItem(3, vidro);
/*  48 */     menu.setItem(4, vidro);
/*  49 */     menu.setItem(5, vidro);
/*  50 */     menu.setItem(6, vidro);
/*  51 */     menu.setItem(7, vidro);
/*  52 */     menu.setItem(8, vidro);
/*  53 */     menu.setItem(46, vidro);
/*  54 */     menu.setItem(45, vidro);
/*  55 */     menu.setItem(46, vidro);
/*  56 */     menu.setItem(47, vidro);
/*  57 */     menu.setItem(51, vidro);
/*  58 */     menu.setItem(52, vidro);
/*  59 */     menu.setItem(53, vidro);
/*     */     
/*  61 */     menu.setItem(49, kits);
/*  62 */     menu.setItem(48, Warps);
/*  63 */     menu.setItem(50, loja);
/*     */     
/*  65 */     if ((p.hasPermission("kit.pvp")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  66 */       ItemStack pvp = new ItemStack(Material.STONE_SWORD);
/*  67 */       ItemMeta kpvp = pvp.getItemMeta();
/*  68 */       ArrayList<String> desc = new ArrayList();
/*  69 */       kpvp.setDisplayName("§ePvP");
/*  70 */       desc.add("§7Treine seu pvp sem habilidade.");
/*  71 */       kpvp.setLore(desc);
/*  72 */       pvp.setItemMeta(kpvp);
/*  73 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/*  75 */     if ((p.hasPermission("kit.kangaroo")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.pro)) {
/*  76 */       ItemStack pvp = new ItemStack(Material.FIREWORK);
/*  77 */       ItemMeta kpvp = pvp.getItemMeta();
/*  78 */       ArrayList<String> desc = new ArrayList();
/*  79 */       kpvp.setDisplayName("§eKangaroo");
/*  80 */       desc.add("§7Ganhe double jump.");
/*  81 */       kpvp.setLore(desc);
/*  82 */       pvp.setItemMeta(kpvp);
/*  83 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/*  85 */     if ((p.hasPermission("kit.specialist")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/*  86 */       ItemStack pvp = new ItemStack(Material.ENCHANTED_BOOK);
/*  87 */       ItemMeta kpvp = pvp.getItemMeta();
/*  88 */       ArrayList<String> desc = new ArrayList();
/*  89 */       kpvp.setDisplayName("§eSpecialist");
/*  90 */       desc.add("§7Encante itens usando um livro.");
/*  91 */       kpvp.setLore(desc);
/*  92 */       pvp.setItemMeta(kpvp);
/*  93 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/*  95 */     if ((p.hasPermission("kit.stomper")) || (Habilitar.fullkit)) {
/*  96 */       ItemStack pvp = new ItemStack(Material.LEATHER_BOOTS);
/*  97 */       ItemMeta kpvp = pvp.getItemMeta();
/*  98 */       ArrayList<String> desc = new ArrayList();
/*  99 */       kpvp.setDisplayName("§eStomper");
/* 100 */       desc.add("§7Pule de lugar altos e mate players ao seu redor.");
/* 101 */       kpvp.setLore(desc);
/* 102 */       pvp.setItemMeta(kpvp);
/* 103 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 105 */     if ((p.hasPermission("kit.gladiator")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 106 */       ItemStack pvp = new ItemStack(Material.IRON_FENCE);
/* 107 */       ItemMeta kpvp = pvp.getItemMeta();
/* 108 */       ArrayList<String> desc = new ArrayList();
/* 109 */       kpvp.setDisplayName("§eGladiator");
/* 110 */       desc.add("§7Tire 1v1 nas alturas !");
/* 111 */       kpvp.setLore(desc);
/* 112 */       pvp.setItemMeta(kpvp);
/* 113 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 115 */     if ((p.hasPermission("kit.viper")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 116 */       ItemStack pvp = new ItemStack(Material.SPIDER_EYE);
/* 117 */       ItemMeta kpvp = pvp.getItemMeta();
/* 118 */       ArrayList<String> desc = new ArrayList();
/* 119 */       kpvp.setDisplayName("§eViper");
/* 120 */       desc.add("§7Evenenem seus inimigos !");
/* 121 */       kpvp.setLore(desc);
/* 122 */       pvp.setItemMeta(kpvp);
/* 123 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 125 */     if ((p.hasPermission("kit.snail")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 126 */       ItemStack pvp = new ItemStack(Material.WEB);
/* 127 */       ItemMeta kpvp = pvp.getItemMeta();
/* 128 */       ArrayList<String> desc = new ArrayList();
/* 129 */       kpvp.setDisplayName("§eSnail");
/* 130 */       desc.add("§7Deixem seus inimigos lentos !");
/* 131 */       kpvp.setLore(desc);
/* 132 */       pvp.setItemMeta(kpvp);
/* 133 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 135 */     if ((p.hasPermission("kit.ninja")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 136 */       ItemStack pvp = new ItemStack(Material.EMERALD);
/* 137 */       ItemMeta kpvp = pvp.getItemMeta();
/* 138 */       ArrayList<String> desc = new ArrayList();
/* 139 */       kpvp.setDisplayName("§eNinja");
/* 140 */       desc.add("§7Teleporte ate seus imigos !");
/* 141 */       kpvp.setLore(desc);
/* 142 */       pvp.setItemMeta(kpvp);
/* 143 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 145 */     if ((p.hasPermission("kit.anchor")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 146 */       ItemStack pvp = new ItemStack(Material.ANVIL);
/* 147 */       ItemMeta kpvp = pvp.getItemMeta();
/* 148 */       ArrayList<String> desc = new ArrayList();
/* 149 */       kpvp.setDisplayName("§eAnchor");
/* 150 */       desc.add("§7Tire o Knockback de seus inimigos !");
/* 151 */       kpvp.setLore(desc);
/* 152 */       pvp.setItemMeta(kpvp);
/* 153 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 155 */     if ((p.hasPermission("kit.thor")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 156 */       ItemStack pvp = new ItemStack(Material.GOLD_AXE);
/* 157 */       ItemMeta kpvp = pvp.getItemMeta();
/* 158 */       ArrayList<String> desc = new ArrayList();
/* 159 */       kpvp.setDisplayName("§eThor");
/* 160 */       desc.add("§7Taque raios em seus imigos !");
/* 161 */       kpvp.setLore(desc);
/* 162 */       pvp.setItemMeta(kpvp);
/* 163 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 165 */     if ((p.hasPermission("kit.switcher")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp)) {
/* 166 */       ItemStack pvp = new ItemStack(Material.SNOW_BALL);
/* 167 */       ItemMeta kpvp = pvp.getItemMeta();
/* 168 */       ArrayList<String> desc = new ArrayList();
/* 169 */       kpvp.setDisplayName("§eSwitcher");
/* 170 */       desc.add("§7Troque de lugar com seus imigos !");
/* 171 */       kpvp.setLore(desc);
/* 172 */       pvp.setItemMeta(kpvp);
/* 173 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 175 */     if ((p.hasPermission("kit.fisherman")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 176 */       ItemStack pvp = new ItemStack(Material.FISHING_ROD);
/* 177 */       ItemMeta kpvp = pvp.getItemMeta();
/* 178 */       ArrayList<String> desc = new ArrayList();
/* 179 */       kpvp.setDisplayName("§eFisherman");
/* 180 */       desc.add("§7Fisgue seus inimigos !");
/* 181 */       kpvp.setLore(desc);
/* 182 */       pvp.setItemMeta(kpvp);
/* 183 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 185 */     if ((p.hasPermission("kit.magma")) || (Habilitar.fullkit)) {
/* 186 */       ItemStack pvp = new ItemStack(Material.MAGMA_CREAM);
/* 187 */       ItemMeta kpvp = pvp.getItemMeta();
/* 188 */       ArrayList<String> desc = new ArrayList();
/* 189 */       kpvp.setDisplayName("§eMagma");
/* 190 */       desc.add("§7Coloque fogos em seus inimigos !");
/* 191 */       kpvp.setLore(desc);
/* 192 */       pvp.setItemMeta(kpvp);
/* 193 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 195 */     if ((p.hasPermission("kit.critical")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 196 */       ItemStack pvp = new ItemStack(Material.IRON_BLOCK);
/* 197 */       ItemMeta kpvp = pvp.getItemMeta();
/* 198 */       ArrayList<String> desc = new ArrayList();
/* 199 */       kpvp.setDisplayName("§eCritical");
/* 200 */       desc.add("§7Da golpes fatais em seus inimigos !");
/* 201 */       kpvp.setLore(desc);
/* 202 */       pvp.setItemMeta(kpvp);
/* 203 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 205 */     if ((p.hasPermission("kit.ajnin")) || (Habilitar.fullkit) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 206 */       ItemStack pvp = new ItemStack(Material.NETHER_STAR);
/* 207 */       ItemMeta kpvp = pvp.getItemMeta();
/* 208 */       ArrayList<String> desc = new ArrayList();
/* 209 */       kpvp.setDisplayName("§eAjnin");
/* 210 */       desc.add("§7Nao deixem seus inimigos escaparem !");
/* 211 */       kpvp.setLore(desc);
/* 212 */       pvp.setItemMeta(kpvp);
/* 213 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 215 */     if ((p.hasPermission("kit.boxer")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 216 */       ItemStack pvp = new ItemStack(Material.QUARTZ);
/* 217 */       ItemMeta kpvp = pvp.getItemMeta();
/* 218 */       ArrayList<String> desc = new ArrayList();
/* 219 */       kpvp.setDisplayName("§eMadman");
/* 220 */       desc.add("§7De mais dano em seus imigos , e receba menos dano !");
/* 221 */       kpvp.setLore(desc);
/* 222 */       pvp.setItemMeta(kpvp);
/* 223 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 225 */     if ((p.hasPermission("kit.monk")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 226 */       ItemStack pvp = new ItemStack(Material.BLAZE_ROD);
/* 227 */       ItemMeta kpvp = pvp.getItemMeta();
/* 228 */       ArrayList<String> desc = new ArrayList();
/* 229 */       kpvp.setDisplayName("§eMonk");
/* 230 */       desc.add("§7Desarme seus inimigos");
/* 231 */       kpvp.setLore(desc);
/* 232 */       pvp.setItemMeta(kpvp);
/* 233 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 235 */     if ((p.hasPermission("kit.madman")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 236 */       ItemStack pvp = new ItemStack(Material.FERMENTED_SPIDER_EYE);
/* 237 */       ItemMeta kpvp = pvp.getItemMeta();
/* 238 */       ArrayList<String> desc = new ArrayList();
/* 239 */       kpvp.setDisplayName("§eMadman");
/* 240 */       desc.add("§7Ganhem 2v1 facil");
/* 241 */       kpvp.setLore(desc);
/* 242 */       pvp.setItemMeta(kpvp);
/* 243 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 245 */     if ((p.hasPermission("kit.strong")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 246 */       ItemStack pvp = new ItemStack(Material.WATCH);
/* 247 */       ItemMeta kpvp = pvp.getItemMeta();
/* 248 */       ArrayList<String> desc = new ArrayList();
/* 249 */       kpvp.setDisplayName("§eStrong");
/* 250 */       desc.add("§7Fique fulliron por 10 segundos !");
/* 251 */       kpvp.setLore(desc);
/* 252 */       pvp.setItemMeta(kpvp);
/* 253 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 255 */     if ((p.hasPermission("kit.viking")) || (Habilitar.fullkit) || (Habilitar.pro)) {
/* 256 */       ItemStack pvp = new ItemStack(Material.IRON_AXE);
/* 257 */       ItemMeta kpvp = pvp.getItemMeta();
/* 258 */       ArrayList<String> desc = new ArrayList();
/* 259 */       kpvp.setDisplayName("§eViking");
/* 260 */       desc.add("§7De mais dano com esse machado !");
/* 261 */       kpvp.setLore(desc);
/* 262 */       pvp.setItemMeta(kpvp);
/* 263 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 265 */     if ((p.hasPermission("kit.grappler")) || (Habilitar.fullkit)) {
/* 266 */       ItemStack pvp = new ItemStack(Material.LEASH);
/* 267 */       ItemMeta kpvp = pvp.getItemMeta();
/* 268 */       ArrayList<String> desc = new ArrayList();
/* 269 */       kpvp.setDisplayName("§eGrappler");
/* 270 */       desc.add("§7De mais dano com esse machado !");
/* 271 */       kpvp.setLore(desc);
/* 272 */       pvp.setItemMeta(kpvp);
/* 273 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 275 */     if ((p.hasPermission("kit.hulk")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 276 */       ItemStack pvp = new ItemStack(Material.SADDLE);
/* 277 */       ItemMeta kpvp = pvp.getItemMeta();
/* 278 */       ArrayList<String> desc = new ArrayList();
/* 279 */       kpvp.setDisplayName("§eHulk");
/* 280 */       desc.add("§7Puxe seus inimigos para cima !");
/* 281 */       kpvp.setLore(desc);
/* 282 */       pvp.setItemMeta(kpvp);
/* 283 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 285 */     if ((p.hasPermission("kit.phantom")) || (Habilitar.fullkit)) {
/* 286 */       ItemStack pvp = new ItemStack(Material.FEATHER);
/* 287 */       ItemMeta kpvp = pvp.getItemMeta();
/* 288 */       ArrayList<String> desc = new ArrayList();
/* 289 */       kpvp.setDisplayName("§ePhantom");
/* 290 */       desc.add("§7Utilize sua pena para voar como um pássaro !");
/* 291 */       kpvp.setLore(desc);
/* 292 */       pvp.setItemMeta(kpvp);
/* 293 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/* 295 */     if ((p.hasPermission("kit.sumo")) || (Habilitar.fullkit) || (Habilitar.vip) || (Habilitar.mvp) || (Habilitar.pro)) {
/* 296 */       ItemStack pvp = new ItemStack(Material.APPLE);
/* 297 */       ItemMeta kpvp = pvp.getItemMeta();
/* 298 */       ArrayList<String> desc = new ArrayList();
/* 299 */       kpvp.setDisplayName("§eSumo");
/* 300 */       desc.add("§7Jogue seus inimigos para o alto utilizando seu peso !");
/* 301 */       kpvp.setLore(desc);
/* 302 */       pvp.setItemMeta(kpvp);
/* 303 */       menu.addItem(new ItemStack[] { pvp });
/*     */     }
/*     */     
/* 306 */     p.openInventory(menu);
/* 307 */     p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\menus\KitsMenus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */