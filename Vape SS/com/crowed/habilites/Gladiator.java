/*     */ package com.crowed.habilites;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.api.CooldownAPI;
/*     */ import com.crowed.api.KitAPI;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.List;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.EventPriority;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.entity.PlayerDeathEvent;
/*     */ import org.bukkit.event.player.PlayerCommandPreprocessEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEntityEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.event.player.PlayerQuitEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ import org.bukkit.potion.PotionEffect;
/*     */ import org.bukkit.potion.PotionEffectType;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class Gladiator implements Listener
/*     */ {
/*  36 */   public boolean generateGlass = true;
/*     */   
/*  38 */   public static ArrayList<Player> noExecut = new ArrayList();
/*  39 */   public static HashMap<String, Location> oldl = new HashMap();
/*  40 */   public static HashMap<String, String> fighting = new HashMap();
/*  41 */   public HashMap<Integer, ArrayList<Location>> blocks = new HashMap();
/*  42 */   public static HashMap<Player, Location> localizacao = new HashMap();
/*  43 */   public static HashMap<Location, Block> bloco = new HashMap();
/*  44 */   public HashMap<Integer, String[]> players = new HashMap();
/*  45 */   public HashMap<String, Integer> tasks = new HashMap();
/*  46 */   int nextID = 0;
/*     */   
/*     */   public static int id1;
/*     */   public static int id2;
/*     */   
/*     */   @EventHandler
/*     */   public void OnGladiat0orKit(PlayerInteractEntityEvent event)
/*     */   {
/*  54 */     final Player p = event.getPlayer();
/*  55 */     if ((event.getRightClicked() instanceof Player)) {
/*  56 */       final Player r = (Player)event.getRightClicked();
/*  57 */       if ((p.getItemInHand().getType() == Material.IRON_FENCE) && (KitAPI.getKit(p) == "Gladiator") && (CooldownAPI.Cooldown.containsKey(p.getName()))) {
/*  58 */         p.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.GOLD + ChatColor.BOLD + "Gladiator" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(p) + "s");
/*  59 */         return;
/*     */       }
/*  61 */       if ((p.getItemInHand().getType() == Material.IRON_FENCE) && (KitAPI.getKit(p) == "Gladiator") && (!CooldownAPI.Cooldown.containsKey(p.getName()))) {
/*  62 */         event.setCancelled(true);
/*  63 */         Location loc = new Location(p.getWorld(), p.getLocation().getBlockX(), p.getLocation().getBlockY() + 70, p.getLocation().getBlockZ());
/*  64 */         localizacao.put(p, loc);
/*  65 */         localizacao.put(r, loc);
/*  66 */         Location loc2 = new Location(p.getWorld(), p.getLocation().getBlockX() + 8, p.getLocation().getBlockY() + 73, p.getLocation().getBlockZ() + 8);
/*  67 */         Location loc3 = new Location(p.getWorld(), p.getLocation().getBlockX() - 8, p.getLocation().getBlockY() + 73, p.getLocation().getBlockZ() - 8);
/*  68 */         if ((fighting.containsKey(p.getName())) || (fighting.containsKey(r.getName())))
/*     */         {
/*  70 */           event.setCancelled(true);
/*  71 */           return;
/*     */         }
/*  73 */         Integer currentID = Integer.valueOf(this.nextID);
/*  74 */         this.nextID += 1;
/*  75 */         ArrayList<String> list = new ArrayList();
/*  76 */         list.add(p.getName());
/*  77 */         list.add(r.getName());
/*  78 */         this.players.put(currentID, (String[])list.toArray(new String[1]));
/*  79 */         oldl.put(p.getName(), p.getLocation());
/*  80 */         oldl.put(r.getName(), r.getLocation());
/*  81 */         if (this.generateGlass)
/*     */         {
/*  83 */           List<Location> cuboid = new ArrayList();
/*  84 */           cuboid.clear();
/*     */           int bZ;
/*  86 */           for (int bX = -10; bX <= 10; bX++) {
/*  87 */             for (bZ = -10; bZ <= 10; bZ++) {
/*  88 */               for (int bY = -1; bY <= 10; bY++)
/*     */               {
/*  90 */                 Block b = loc.clone().add(bX, bY, bZ).getBlock();
/*  91 */                 if (!b.isEmpty())
/*     */                 {
/*  93 */                   event.setCancelled(true);
/*  94 */                   p.sendMessage("§cVocê não pode puxar para o Gladiator neste local!");
/*  95 */                   return;
/*     */                 }
/*  97 */                 if (bY == 10) {
/*  98 */                   cuboid.add(loc.clone().add(bX, bY, bZ));
/*  99 */                 } else if (bY == -1) {
/* 100 */                   cuboid.add(loc.clone().add(bX, bY, bZ));
/* 101 */                 } else if ((bX == -10) || (bZ == -10) || (bX == 10) || (bZ == 10)) {
/* 102 */                   cuboid.add(loc.clone().add(bX, bY, bZ));
/*     */                 }
/*     */               }
/*     */             }
/*     */           }
/* 107 */           for (Location loc1 : cuboid)
/*     */           {
/* 109 */             loc1.getBlock().setType(Material.GLASS);
/* 110 */             bloco.put(loc1, loc1.getBlock());
/*     */           }
/* 112 */           loc2.setYaw(135.0F);
/* 113 */           p.teleport(loc2);
/* 114 */           loc3.setYaw(-45.0F);
/* 115 */           r.teleport(loc3);
/* 116 */           p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 110, 5));
/* 117 */           r.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 110, 5));
/* 118 */           p.getInventory().remove(Material.IRON_FENCE);
/* 119 */           r.getInventory().remove(Material.IRON_FENCE);
/* 120 */           p.sendMessage(ChatColor.RED + "Você puxou um jogador para um duelo, portanto o item de seu kit foi removido !");
/* 121 */           p.sendMessage(ChatColor.RED + "Assim que o duelo for finalizado, o item voltará para o seu inventário!");
/* 122 */           CooldownAPI.addCooldown(p, 35);
/* 123 */           noExecut.add(p);
/* 124 */           noExecut.add(r);
/* 125 */           fighting.put(p.getName(), r.getName());
/* 126 */           fighting.put(r.getName(), p.getName());
/* 127 */           id2 = Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable()
/*     */           {
/*     */             public void run()
/*     */             {
/* 131 */               if ((Gladiator.fighting.containsKey(p.getName())) && (((String)Gladiator.fighting.get(p.getName())).equalsIgnoreCase(r.getName())) && (Gladiator.fighting.containsKey(r.getName()))) { ((String)Gladiator.fighting.get(r.getName())).equalsIgnoreCase(p.getName());
/*     */               }
/*     */               
/*     */             }
/* 135 */           }, 2400L);
/* 136 */           id1 = Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable()
/*     */           {
/*     */             public void run()
/*     */             {
/* 140 */               if ((Gladiator.fighting.containsKey(p.getName())) && (((String)Gladiator.fighting.get(p.getName())).equalsIgnoreCase(r.getName())) && (Gladiator.fighting.containsKey(r.getName())) && (((String)Gladiator.fighting.get(r.getName())).equalsIgnoreCase(p.getName())))
/*     */               {
/* 142 */                 Gladiator.fighting.remove(p.getName());
/* 143 */                 Gladiator.fighting.remove(r.getName());
/* 144 */                 Gladiator.noExecut.remove(p);
/* 145 */                 Gladiator.noExecut.remove(r);
/* 146 */                 p.teleport((Location)Gladiator.oldl.get(p.getName()));
/* 147 */                 r.teleport((Location)Gladiator.oldl.get(r.getName()));
/* 148 */                 Gladiator.oldl.remove(p.getName());
/* 149 */                 Gladiator.oldl.remove(r.getName());
/* 150 */                 Location loc = (Location)Gladiator.localizacao.get(p);
/* 151 */                 List<Location> cuboid = new ArrayList();
/*     */                 int bZ;
/* 153 */                 for (int bX = -10; bX <= 10; bX++) {
/* 154 */                   for (bZ = -10; bZ <= 10; bZ++) {
/* 155 */                     for (int bY = -1; bY <= 10; bY++) {
/* 156 */                       if (bY == 10) {
/* 157 */                         cuboid.add(loc.clone().add(bX, bY, bZ));
/* 158 */                       } else if (bY == -1) {
/* 159 */                         cuboid.add(loc.clone().add(bX, bY, bZ));
/* 160 */                       } else if ((bX == -10) || (bZ == -10) || (bX == 10) || (bZ == 10)) {
/* 161 */                         cuboid.add(loc.clone().add(bX, bY, bZ));
/*     */                       }
/*     */                     }
/*     */                   }
/*     */                 }
/* 166 */                 for (Location loc1 : cuboid)
/*     */                 {
/* 168 */                   loc1.getBlock().setType(Material.AIR);
/* 169 */                   ((Block)Gladiator.bloco.get(loc1)).setType(Material.AIR);
/*     */                 }
/*     */               }
/*     */             }
/* 173 */           }, 100000L);
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onPlayerInteractGlad(PlayerInteractEvent e) {
/* 181 */     Player p = e.getPlayer();
/* 182 */     if ((p.getItemInHand().getType() == Material.IRON_FENCE) || (KitAPI.getKit(p) == "Gladiator"))
/*     */     {
/* 184 */       e.setCancelled(true);
/* 185 */       p.updateInventory();
/* 186 */       return;
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler(priority=EventPriority.MONITOR)
/*     */   public void onPlyaerInteract(final PlayerInteractEvent e) {
/* 192 */     if ((e.getAction() == Action.LEFT_CLICK_BLOCK) && (e.getClickedBlock().getType() == Material.GLASS) && (e.getPlayer().getGameMode() != GameMode.CREATIVE) && (fighting.containsKey(e.getPlayer().getName()))) {
/* 193 */       e.setCancelled(true);
/* 194 */       e.getClickedBlock().setType(Material.GLASS);
/* 195 */       Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/* 199 */           if (Gladiator.fighting.containsKey(e.getPlayer().getName())) {
/* 200 */             e.getClickedBlock().setType(Material.GLASS);
/*     */           }
/*     */         }
/* 203 */       }, 30L);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler(priority=EventPriority.HIGHEST)
/*     */   public void onPlayerLeft(PlayerQuitEvent e)
/*     */   {
/* 210 */     Player p = e.getPlayer();
/* 211 */     if (fighting.containsKey(p.getName()))
/*     */     {
/* 213 */       Player t = Bukkit.getServer().getPlayer((String)fighting.get(p.getName()));
/* 214 */       fighting.remove(t.getName());
/* 215 */       fighting.remove(p.getName());
/* 216 */       noExecut.remove(p);
/* 217 */       noExecut.remove(t);
/* 218 */       ItemStack Item = new ItemStack(Material.IRON_FENCE);
/* 219 */       ItemMeta kItem = Item.getItemMeta();
/* 220 */       kItem.setDisplayName(KitAPI.getKit(p));
/* 221 */       Item.setItemMeta(kItem);
/*     */       
/* 223 */       fighting.remove(t.getName());
/* 224 */       fighting.remove(p.getName());
/* 225 */       noExecut.remove(p);
/* 226 */       noExecut.remove(t);
/* 227 */       if (KitAPI.getKit(p) == "Gladiator") {
/* 228 */         p.getInventory().setItem(1, Item);
/*     */       }
/* 230 */       if (KitAPI.getKit(t) == "Gladiator") {
/* 231 */         t.getInventory().setItem(1, Item);
/*     */       }
/* 233 */       Location old = (Location)oldl.get(t.getName());
/* 234 */       t.teleport(old);
/* 235 */       Bukkit.getScheduler().cancelTask(id1);
/* 236 */       Bukkit.getScheduler().cancelTask(id2);
/* 237 */       t.removePotionEffect(PotionEffectType.WITHER);
/* 238 */       Location loc = (Location)localizacao.get(p);
/* 239 */       List<Location> cuboid = new ArrayList();
/*     */       int bZ;
/* 241 */       for (int bX = -10; bX <= 10; bX++) {
/* 242 */         for (bZ = -10; bZ <= 10; bZ++) {
/* 243 */           for (int bY = -1; bY <= 10; bY++) {
/* 244 */             if (bY == 10) {
/* 245 */               cuboid.add(loc.clone().add(bX, bY, bZ));
/* 246 */             } else if (bY == -1) {
/* 247 */               cuboid.add(loc.clone().add(bX, bY, bZ));
/* 248 */             } else if ((bX == -10) || (bZ == -10) || (bX == 10) || (bZ == 10)) {
/* 249 */               cuboid.add(loc.clone().add(bX, bY, bZ));
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 254 */       for (Location loc1 : cuboid)
/*     */       {
/* 256 */         loc1.getBlock().setType(Material.AIR);
/* 257 */         ((Block)bloco.get(loc1)).setType(Material.AIR);
/*     */       }
/* 259 */       for (Location loc1 : cuboid)
/*     */       {
/* 261 */         loc1.getBlock().setType(Material.AIR);
/* 262 */         ((Block)bloco.get(loc1)).setType(Material.AIR);
/*     */       }
/* 264 */       for (Location loc1 : cuboid)
/*     */       {
/* 266 */         loc1.getBlock().setType(Material.AIR);
/* 267 */         ((Block)bloco.get(loc1)).setType(Material.AIR);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   @EventHandler(priority=EventPriority.HIGHEST)
/*     */   public void onDeathGladiator(PlayerDeathEvent e)
/*     */   {
/* 276 */     Player p = e.getEntity();
/* 277 */     if (fighting.containsKey(p.getName())) {
/* 278 */       Player k = Bukkit.getServer().getPlayer((String)fighting.get(p.getName()));
/* 279 */       Location old = (Location)oldl.get(p.getName());
/* 280 */       k.teleport(old);
/* 281 */       Bukkit.getScheduler().cancelTask(id1);
/* 282 */       Bukkit.getScheduler().cancelTask(id2);
/* 283 */       k.removePotionEffect(PotionEffectType.WITHER);
/* 284 */       k.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 10));
/*     */       
/* 286 */       ItemStack Item = new ItemStack(Material.IRON_FENCE);
/* 287 */       ItemMeta kItem = Item.getItemMeta();
/* 288 */       kItem.setDisplayName(KitAPI.getKit(p));
/* 289 */       Item.setItemMeta(kItem);
/*     */       
/* 291 */       fighting.remove(k.getName());
/* 292 */       fighting.remove(p.getName());
/* 293 */       noExecut.remove(p);
/* 294 */       noExecut.remove(k);
/* 295 */       if (KitAPI.getKit(p) == "Gladiator") {
/* 296 */         p.getInventory().setItem(1, Item);
/*     */       }
/* 298 */       if (KitAPI.getKit(k) == "Gladiator") {
/* 299 */         k.getInventory().setItem(1, Item);
/*     */       }
/* 301 */       Location loc = (Location)localizacao.get(p);
/* 302 */       List<Location> cuboid = new ArrayList();
/* 303 */       cuboid.clear();
/*     */       int bZ;
/* 305 */       for (int bX = -10; bX <= 10; bX++) {
/* 306 */         for (bZ = -10; bZ <= 10; bZ++) {
/* 307 */           for (int bY = -1; bY <= 10; bY++) {
/* 308 */             if (bY == 10) {
/* 309 */               cuboid.add(loc.clone().add(bX, bY, bZ));
/* 310 */             } else if (bY == -1) {
/* 311 */               cuboid.add(loc.clone().add(bX, bY, bZ));
/* 312 */             } else if ((bX == -10) || (bZ == -10) || (bX == 10) || (bZ == 10)) {
/* 313 */               cuboid.add(loc.clone().add(bX, bY, bZ));
/*     */             }
/*     */           }
/*     */         }
/*     */       }
/* 318 */       for (Location loc1 : cuboid)
/*     */       {
/* 320 */         loc1.getBlock().setType(Material.AIR);
/* 321 */         if (bloco.containsKey(loc1)) {
/* 322 */           ((Block)bloco.get(loc1)).setType(Material.AIR);
/*     */         }
/*     */       }
/* 325 */       return;
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/* 330 */   public void processocommand(PlayerCommandPreprocessEvent e) { Player p = e.getPlayer();
/* 331 */     if ((noExecut.contains(p)) && 
/* 332 */       (!e.getMessage().toLowerCase().startsWith("/report")) && 
/* 333 */       (p.hasPermission("cover.falarnogladiator"))) {
/* 334 */       e.setCancelled(true);
/* 335 */       p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Proibido digitar comandos na hora do Gladiator!");
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Gladiator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */