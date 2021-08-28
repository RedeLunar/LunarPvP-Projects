/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.player.PlayerCommandPreprocessEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class ClickTest implements CommandExecutor, Listener
/*     */ {
/*  20 */   public static ArrayList<String> emcps = new ArrayList();
/*  21 */   public static ArrayList<String> fazendocps = new ArrayList();
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  25 */     final Player p = (Player)sender;
/*  26 */     if (!(sender instanceof Player)) {
/*  27 */       p.sendMessage(ChatColor.RED + "Você precisa ser um player !");
/*  28 */       return true;
/*     */     }
/*  30 */     if (cmd.getName().equalsIgnoreCase("cps")) {
/*  31 */       if (fazendocps.contains(p.getName())) {
/*  32 */         p.sendMessage(ChatColor.GRAY + "Você ja esta fazendo ClickTest !");
/*  33 */         return true;
/*     */       }
/*  35 */       fazendocps.add(p.getName());
/*  36 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/*  39 */           p.sendMessage(ChatColor.GREEN + "Iniciando Seu CPS em: " + ChatColor.YELLOW + "5" + ChatColor.GREEN + " segundos.");
/*     */         }
/*  41 */       }, 0L);
/*  42 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/*  45 */           p.sendMessage(ChatColor.GREEN + "Iniciando Seu CPS em: " + ChatColor.YELLOW + "4" + ChatColor.GREEN + " segundos.");
/*     */         }
/*  47 */       }, 20L);
/*  48 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/*  51 */           p.sendMessage(ChatColor.GREEN + "Iniciando Seu CPS em: " + ChatColor.YELLOW + "3" + ChatColor.GREEN + " segundos.");
/*     */         }
/*  53 */       }, 40L);
/*  54 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/*  57 */           p.sendMessage(ChatColor.GREEN + "Iniciando Seu CPS em: " + ChatColor.YELLOW + "2" + ChatColor.GREEN + " segundos.");
/*     */         }
/*  59 */       }, 60L);
/*  60 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/*  63 */           p.sendMessage(ChatColor.GREEN + "Iniciando Seu CPS em: " + ChatColor.YELLOW + "1" + ChatColor.GREEN + " segundos.");
/*     */         }
/*  65 */       }, 80L);
/*  66 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/*  69 */           p.sendMessage(ChatColor.GREEN + "CPS Iniciado .");
/*  70 */           ClickTest.emcps.add(p.getName());
/*     */         }
/*  72 */       }, 100L);
/*  73 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
/*     */       {
/*     */         public void run() {
/*  76 */           if (p.getLevel() >= 200) {
/*  77 */             Bukkit.broadcast(ChatColor.GRAY + "O Jogador " + ChatColor.YELLOW + p.getName() + ChatColor.GREEN + " §7Esta usando Macro/AutoClicker/Progamas de clicks, CPS: " + p.getLevel(), "covercpsmacro");
/*  78 */             ClickTest.emcps.remove(p.getName());
/*  79 */             ClickTest.fazendocps.remove(p.getName());
/*     */           }
/*  81 */           p.sendMessage(ChatColor.GREEN + "Seu CPS acabou!");
/*  82 */           p.sendMessage(ChatColor.GREEN + "Você fez " + ChatColor.YELLOW + p.getLevel() + ChatColor.GREEN + " Em 7 segundos !");
/*  83 */           ClickTest.emcps.remove(p.getName());
/*  84 */           ClickTest.fazendocps.remove(p.getName());
/*  85 */           p.setLevel(0);
/*     */         }
/*  87 */       }, 250L);
/*     */     }
/*  89 */     return false;
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void comandos(PlayerCommandPreprocessEvent e) {
/*  94 */     Player p = e.getPlayer();
/*  95 */     if ((emcps.contains(p.getName())) && (e.getMessage().startsWith("/"))) {
/*  96 */       e.setCancelled(true);
/*  97 */       p.sendMessage(ChatColor.RED + "Você nao pode digitar em quando estiver fazendo CPS.");
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void click(PlayerInteractEvent e) {
/* 103 */     Player p = e.getPlayer();
/* 104 */     if ((emcps.contains(p.getName())) && (e.getAction() == Action.LEFT_CLICK_AIR)) {
/* 105 */       p.setLevel(p.getLevel() + 1);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\ClickTest.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */