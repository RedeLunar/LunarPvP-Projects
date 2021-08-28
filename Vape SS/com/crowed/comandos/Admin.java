/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.api.API;
/*     */ import com.crowed.api.KitAPI;
/*     */ import com.crowed.api.StatsManager;
/*     */ import com.crowed.events.Proteção;
/*     */ import com.crowed.manager.Manager;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.net.InetSocketAddress;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.GameMode;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.enchantments.Enchantment;
/*     */ import org.bukkit.entity.Damageable;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.player.PlayerInteractEntityEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.event.player.PlayerQuitEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ import org.bukkit.util.Vector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Admin
/*     */   implements CommandExecutor, Listener
/*     */ {
/*  43 */   public static ArrayList<String> hacks = new ArrayList();
/*     */   
/*     */ 
/*  46 */   public static ArrayList<Player> emAdmin = new ArrayList();
/*  47 */   public static HashMap<String, ItemStack[]> salvarinv = new HashMap();
/*  48 */   public static HashMap<String, ItemStack[]> salrvararmor = new HashMap();
/*  49 */   public static HashMap<String, ItemStack[]> salvarinventarioautosoup = new HashMap();
/*  50 */   public static ArrayList<String> aotestarautosoup = new ArrayList();
/*     */   
/*     */ 
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  55 */     if (!(sender instanceof Player)) {
/*  56 */       return true;
/*     */     }
/*  58 */     Player p = (Player)sender;
/*  59 */     if (cmd.getName().equalsIgnoreCase("admin")) {
/*  60 */       if (p.hasPermission("cmd.admin")) {
/*  61 */         if (!emAdmin.contains(p)) {
/*  62 */           emAdmin.add(p);
/*  63 */           salvarinv.put(p.getName(), p.getInventory().getContents());
/*  64 */           salrvararmor.put(p.getName(), p.getInventory().getArmorContents());
/*  65 */           Proteção.setImortalidade(p, true);
/*  66 */           p.getInventory().clear();
/*  67 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce entrou no modo admin");
/*  68 */           p.setHealth(20.0D);
/*  69 */           p.setFireTicks(0);
/*  70 */           p.setGameMode(GameMode.CREATIVE);
/*  71 */           API.darItem(p, Material.MAGMA_CREAM, 1, ChatColor.YELLOW + ChatColor.BOLD + "Trocar - " + ChatColor.GRAY + "(Clique para Sair/Voltar)", 1);
/*  72 */           API.darItem(p, Material.PAPER, 1, ChatColor.YELLOW + ChatColor.BOLD + "Informaçoes - " + ChatColor.GRAY + "(Clique para checar)", 5);
/*  73 */           API.darItem(p, Material.FEATHER, 1, ChatColor.YELLOW + ChatColor.BOLD + "Nofall - " + ChatColor.GRAY + "(Clique para testar nofall)", 3);
/*  74 */           API.darItemEnchant(p, Material.STICK, 1, ChatColor.YELLOW + ChatColor.BOLD + "KnockBack - " + ChatColor.GRAY + "(Clique para testar knockback)", 7, Enchantment.KNOCKBACK, 17, true);
/*  75 */           API.darItem(p, Material.BEDROCK, 1, ChatColor.YELLOW + ChatColor.BOLD + "Cage - " + ChatColor.GRAY + "(Clique para prender o Player)", 4);
/*  76 */           p.updateInventory();
/*     */           
/*  78 */           if (p.hasPermission("cover.admin")) { Player[] onlinePlayers;
/*  79 */             int length = (onlinePlayers = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < length; i++) {
/*  80 */               Player todos = onlinePlayers[i];
/*  81 */               todos.hidePlayer(p);
/*     */             }
/*     */           }
/*     */         }
/*     */         else {
/*  86 */           emAdmin.remove(p);
/*  87 */           p.getInventory().clear();
/*  88 */           p.getInventory().setContents((ItemStack[])salvarinv.get(p.getName()));
/*  89 */           p.getInventory().setArmorContents((ItemStack[])salrvararmor.get(p.getName()));
/*  90 */           p.updateInventory();
/*  91 */           p.setHealth(20.0D);
/*  92 */           p.setFireTicks(0);
/*  93 */           p.setGameMode(GameMode.SURVIVAL);
/*  94 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce saiu do modo admin");
/*     */           Player[] onlinePlayers2;
/*  96 */           int length2 = (onlinePlayers2 = Bukkit.getOnlinePlayers()).length; for (int j = 0; j < length2; j++) {
/*  97 */             Player todos = onlinePlayers2[j];
/*  98 */             todos.showPlayer(p);
/*     */           }
/*     */         }
/*     */       }
/*     */       else {
/* 103 */         p.sendMessage(Strings.permissaocomando);
/*     */       }
/*     */     }
/* 106 */     return false;
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Sair(PlayerQuitEvent e) {
/* 111 */     Player p = e.getPlayer();
/* 112 */     if (emAdmin.contains(p)) {
/* 113 */       emAdmin.remove(p);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void InfoPlayer(PlayerInteractEntityEvent e) {
/* 119 */     if (!(e.getRightClicked() instanceof Player)) {
/* 120 */       return;
/*     */     }
/* 122 */     Player p = e.getPlayer();
/* 123 */     Player t = (Player)e.getRightClicked();
/* 124 */     if ((emAdmin.contains(p)) && (p.getInventory().getItemInHand().getType() == Material.PAPER)) {
/* 125 */       Damageable hp = t;
/* 126 */       p.sendMessage(" ");
/* 127 */       p.sendMessage("         " + ChatColor.GOLD + ChatColor.BOLD + "§6»  " + ChatColor.RED + ChatColor.BOLD + "CHECANDO" + ChatColor.GOLD + ChatColor.BOLD + " §6«          ");
/* 128 */       p.sendMessage(" ");
/* 129 */       p.sendMessage(ChatColor.WHITE + "- " + "§7NickName: §6" + t.getDisplayName());
/* 130 */       p.sendMessage(ChatColor.WHITE + "- " + "§7Vida: §6" + (int)hp.getHealth());
/* 131 */       p.sendMessage(ChatColor.WHITE + "- " + "§7Kit: §6" + KitAPI.getKit(t));
/* 132 */       p.sendMessage(ChatColor.WHITE + "- " + "§7Rank: §6" + Manager.RankAndPrefix(t));
/* 133 */       p.sendMessage(ChatColor.WHITE + "- " + "§7Matou: §6" + StatsManager.getKills(t));
/* 134 */       p.sendMessage(ChatColor.WHITE + "- " + "§7Morreu: §6" + StatsManager.getDeaths(t));
/* 135 */       p.sendMessage(ChatColor.WHITE + "- " + "§7Xp: §6" + StatsManager.getXp(t));
/* 136 */       p.sendMessage(ChatColor.WHITE + "- " + "§7Coins: §6" + StatsManager.getCoins(t));
/* 137 */       p.sendMessage(ChatColor.WHITE + "- " + "§7IP: §6" + t.getAddress().getHostString());
/* 138 */       p.sendMessage(" ");
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Trocar(PlayerInteractEvent e) {
/* 144 */     final Player p = e.getPlayer();
/* 145 */     if ((emAdmin.contains(p)) && ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) && (p.getItemInHand().getType() == Material.MAGMA_CREAM)) {
/* 146 */       e.setCancelled(true);
/* 147 */       BukkitScheduler scheduler = Bukkit.getScheduler();
/* 148 */       scheduler.scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/* 151 */           p.chat("/admin");
/*     */         }
/* 153 */       }, 0L);
/* 154 */       scheduler.scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/* 157 */           p.chat("/admin");
/*     */         }
/* 159 */       }, 15L);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Nofall(PlayerInteractEntityEvent e)
/*     */   {
/* 166 */     if (!(e.getRightClicked() instanceof Player)) {
/* 167 */       return;
/*     */     }
/* 169 */     Player p = e.getPlayer();
/* 170 */     Player t = (Player)e.getRightClicked();
/* 171 */     if (emAdmin.contains(p)) {
/* 172 */       if (p.getInventory().getItemInHand().getType() == Material.FEATHER) {
/* 173 */         t.setVelocity(new Vector(0, 2, 0));
/*     */       }
/* 175 */       if (p.getInventory().getItemInHand().getType() == Material.AIR) {
/* 176 */         p.openInventory(t.getInventory());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Sair(PlayerInteractEvent e) {
/* 183 */     Player p = e.getPlayer();
/* 184 */     if ((emAdmin.contains(p)) && ((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) && (p.getItemInHand().getType() == Material.REDSTONE)) {
/* 185 */       p.chat("/admin");
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Cage(PlayerInteractEntityEvent e) {
/* 191 */     if (!(e.getRightClicked() instanceof Player)) {
/* 192 */       return;
/*     */     }
/* 194 */     Player p = e.getPlayer();
/* 195 */     Player t = (Player)e.getRightClicked();
/*     */     
/* 197 */     if ((emAdmin.contains(p)) && (p.getItemInHand().getType() == Material.BEDROCK)) {
/* 198 */       t.getLocation().add(0.0D, 13.0D, 0.0D).getBlock().setType(Material.BEDROCK);
/* 199 */       t.getLocation().add(0.0D, 11.0D, 1.0D).getBlock().setType(Material.BEDROCK);
/* 200 */       t.getLocation().add(1.0D, 11.0D, 0.0D).getBlock().setType(Material.BEDROCK);
/* 201 */       t.getLocation().add(0.0D, 11.0D, -1.0D).getBlock().setType(Material.BEDROCK);
/* 202 */       t.getLocation().add(-1.0D, 11.0D, 0.0D).getBlock().setType(Material.BEDROCK);
/* 203 */       t.getLocation().add(0.0D, 10.0D, 0.0D).getBlock().setType(Material.BEDROCK);
/* 204 */       t.teleport(t.getLocation().add(0.0D, 11.0D, -0.07D));
/* 205 */       p.teleport(t.getLocation().add(3.0D, 0.0D, 0.05D));
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Admin.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */