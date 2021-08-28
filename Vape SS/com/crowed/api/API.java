/*     */ package com.crowed.api;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.enchantments.Enchantment;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ import org.bukkit.inventory.meta.ItemMeta;
/*     */ import org.bukkit.potion.PotionEffectType;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class API
/*     */ {
/*  26 */   public static String mensagem1 = Main.getInstance().getConfig().getString("Mensagem1").replace("&", "§");
/*  27 */   public static String mensagem2 = Main.getInstance().getConfig().getString("Mensagem2").replace("&", "§");
/*  28 */   public static String mensagem3 = Main.getInstance().getConfig().getString("Mensagem3").replace("&", "§");
/*  29 */   public static String mensagem4 = Main.getInstance().getConfig().getString("Mensagem4").replace("&", "§");
/*  30 */   public static String mensagem5 = Main.getInstance().getConfig().getString("Mensagem5").replace("&", "§");
/*     */   
/*     */ 
/*  33 */   public static HashMap<Player, String> warp = new HashMap();
/*     */   
/*     */   public static String getWarp(Player p)
/*     */   {
/*  37 */     if (warp.containsKey(p)) {
/*  38 */       return (String)warp.get(p);
/*     */     }
/*  40 */     return "Spawn";
/*     */   }
/*     */   
/*     */   public static void setWarp(Player p, String Warp) {
/*  44 */     warp.put(p, Warp);
/*     */   }
/*     */   
/*     */   public static void itensSpawn(Player p) {
/*  48 */     ItemStack bau = new ItemStack(Material.PAPER);
/*  49 */     ItemMeta baum = bau.getItemMeta();
/*  50 */     baum.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "Kits -" + ChatColor.GRAY + " (Clique)");
/*  51 */     bau.setItemMeta(baum);
/*     */     
/*  53 */     ItemStack warp = new ItemStack(Material.GLASS);
/*  54 */     ItemMeta warpm = warp.getItemMeta();
/*  55 */     warpm.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "Warps -" + ChatColor.GRAY + " (Clique)");
/*  56 */     warp.setItemMeta(warpm);
/*     */     
/*  58 */     ItemStack menu = new ItemStack(Material.MINECART);
/*  59 */     ItemMeta menum = menu.getItemMeta();
/*  60 */     menum.setDisplayName(ChatColor.YELLOW + ChatColor.BOLD + "Menu -" + ChatColor.GRAY + " (Clique)");
/*  61 */     menu.setItemMeta(menum);
/*     */     
/*  63 */     ItemStack servidor = new ItemStack(Material.VINE);
/*  64 */     ItemMeta servidorm = servidor.getItemMeta();
/*  65 */     servidorm.setDisplayName(Strings.servidor);
/*  66 */     servidor.setItemMeta(servidorm);
/*     */     
/*  68 */     p.getInventory().setItem(4, bau);
/*  69 */     p.getInventory().setItem(3, warp);
/*  70 */     p.getInventory().setItem(5, menu);
/*     */   }
/*     */   
/*     */   public static void addItemInvPlayer(Player p, Material material, String nome, int quantidade, int slot)
/*     */   {
/*  75 */     ItemStack bau = new ItemStack(material, quantidade);
/*  76 */     ItemMeta baum = bau.getItemMeta();
/*  77 */     baum.setDisplayName(nome);
/*  78 */     bau.setItemMeta(baum);
/*     */     
/*  80 */     p.getInventory().setItem(slot, bau);
/*     */   }
/*     */   
/*     */   public static void addItemInvPlayerEncantado(Player p, Material material, String nome, int quantidade, int slot, Enchantment encantamento, int nivel) {
/*  84 */     ItemStack bau = new ItemStack(material, quantidade);
/*  85 */     ItemMeta baum = bau.getItemMeta();
/*  86 */     baum.setDisplayName(nome);
/*  87 */     baum.addEnchant(encantamento, nivel, true);
/*  88 */     bau.setItemMeta(baum);
/*     */     
/*  90 */     p.getInventory().setItem(slot, bau);
/*     */   }
/*     */   
/*     */   public static ItemStack criarItem(Player p, Material material, String nome, String[] lore, int quantidade, short cor)
/*     */   {
/*  95 */     ItemStack item = new ItemStack(material, quantidade, cor);
/*  96 */     ItemMeta kitem = item.getItemMeta();
/*  97 */     kitem.setDisplayName(nome);
/*  98 */     kitem.setLore(Arrays.asList(lore));
/*  99 */     item.setItemMeta(kitem);
/*     */     
/* 101 */     return item;
/*     */   }
/*     */   
/* 104 */   public static void tirarEfeitos(Player p) { p.removePotionEffect(PotionEffectType.ABSORPTION);
/* 105 */     p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 106 */     p.removePotionEffect(PotionEffectType.CONFUSION);
/* 107 */     p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
/* 108 */     p.removePotionEffect(PotionEffectType.FAST_DIGGING);
/* 109 */     p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
/* 110 */     p.removePotionEffect(PotionEffectType.HARM);
/* 111 */     p.removePotionEffect(PotionEffectType.HEAL);
/* 112 */     p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
/* 113 */     p.removePotionEffect(PotionEffectType.HUNGER);
/* 114 */     p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
/* 115 */     p.removePotionEffect(PotionEffectType.INVISIBILITY);
/* 116 */     p.removePotionEffect(PotionEffectType.JUMP);
/* 117 */     p.removePotionEffect(PotionEffectType.NIGHT_VISION);
/* 118 */     p.removePotionEffect(PotionEffectType.POISON);
/* 119 */     p.removePotionEffect(PotionEffectType.REGENERATION);
/* 120 */     p.removePotionEffect(PotionEffectType.SATURATION);
/* 121 */     p.removePotionEffect(PotionEffectType.SLOW);
/* 122 */     p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
/* 123 */     p.removePotionEffect(PotionEffectType.SPEED);
/* 124 */     p.removePotionEffect(PotionEffectType.WATER_BREATHING);
/* 125 */     p.removePotionEffect(PotionEffectType.WEAKNESS);
/* 126 */     p.removePotionEffect(PotionEffectType.WITHER);
/*     */   }
/*     */   
/* 129 */   public static void tirarArmadura(Player p) { p.getInventory().setHelmet(new ItemStack(Material.AIR));
/* 130 */     p.getInventory().setChestplate(new ItemStack(Material.AIR));
/* 131 */     p.getInventory().setLeggings(new ItemStack(Material.AIR));
/* 132 */     p.getInventory().setBoots(new ItemStack(Material.AIR));
/*     */   }
/*     */   
/*     */   public static void darItem(Player p, Material mat, int quantidade, String nome, int lugar) {
/* 136 */     ItemStack item = new ItemStack(mat, quantidade);
/* 137 */     ItemMeta itemmeta = item.getItemMeta();
/* 138 */     itemmeta.setDisplayName(nome);
/* 139 */     item.setItemMeta(itemmeta);
/* 140 */     p.getInventory().setItem(lugar, item);
/*     */   }
/*     */   
/*     */   public static void darItemEnchant(Player p, Material mat, int quantidade, String nome, int lugar, Enchantment enchant, int level, boolean trueorfalse) {
/* 144 */     ItemStack item = new ItemStack(mat, quantidade);
/* 145 */     ItemMeta itemmeta = item.getItemMeta();
/* 146 */     itemmeta.addEnchant(enchant, level, trueorfalse);
/* 147 */     itemmeta.setDisplayName(nome);
/* 148 */     item.setItemMeta(itemmeta);
/* 149 */     p.getInventory().setItem(lugar, item);
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\API.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */