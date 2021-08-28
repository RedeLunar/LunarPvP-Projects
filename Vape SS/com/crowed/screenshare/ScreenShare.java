/*     */ package com.crowed.screenshare;
/*     */ 
/*     */ import com.crowed.configs.WarpsConfig.Warps;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.Listener;
/*     */ import org.bukkit.event.player.PlayerQuitEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ import org.bukkit.inventory.PlayerInventory;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScreenShare
/*     */   implements CommandExecutor, Listener
/*     */ {
/*  23 */   public static ArrayList<Player> SS = new ArrayList();
/*  24 */   public static HashMap<Player, Location> LOC = new HashMap();
/*  25 */   public static HashMap<Player, ItemStack[]> Itens = new HashMap();
/*  26 */   public static HashMap<Player, ItemStack[]> Armadura = new HashMap();
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  30 */     Player p = (Player)sender;
/*  31 */     if (cmd.getName().equalsIgnoreCase("ss")) {
/*  32 */       if (!sender.hasPermission("cmd.ss")) {
/*  33 */         p.sendMessage("§e§lVape§f§lMC §6» §7Voce nao possui permissao para utilizar este comando");
/*  34 */         return true;
/*     */       }
/*  36 */       if (args.length == 0) {
/*  37 */         p.sendMessage("§e§lVape§f§lMC §6» §7Utilize /ss <Jogador>");
/*  38 */         return true;
/*     */       }
/*  40 */       Player k = Bukkit.getPlayer(args[0]);
/*  41 */       if (k == null) {
/*  42 */         p.sendMessage("§e§lVape§f§lMC §6» §7O jogador §6" + args[0] + " §7encontra-se §6§lOFFLINE");
/*  43 */         return true;
/*     */       }
/*  45 */       if ((!sender.hasPermission("cmd.ss")) && 
/*  46 */         (sender.hasPermission("cmd.blockss"))) {
/*  47 */         p.sendMessage("§e§lVape§f§lMC §6» §7Este jogador nao pode ser adicionado ao modo SS");
/*  48 */         return true;
/*     */       }
/*     */       
/*  51 */       if (k.getName() == p.getName()) {
/*  52 */         p.sendMessage("§e§lVape§f§lMC §6» §7Voce nao pode se auto-colocar no modo SS");
/*  53 */         return true;
/*     */       }
/*  55 */       if (SS.contains(p)) {
/*  56 */         p.sendMessage("§e§lVape§f§lMC §6» §7Voce ja esta em uma ScreenShare");
/*     */       }
/*  58 */       if ((!SS.contains(k)) && (!SS.contains(p))) {
/*  59 */         LOC.put(p, p.getLocation());
/*  60 */         LOC.put(k, k.getLocation());
/*  61 */         Itens.put(p, p.getInventory().getContents());
/*  62 */         Itens.put(k, k.getInventory().getContents());
/*  63 */         Armadura.put(p, p.getInventory().getArmorContents());
/*  64 */         Armadura.put(k, k.getInventory().getArmorContents());
/*  65 */         WarpsConfig.Warps.Ir(p, "SS");
/*  66 */         WarpsConfig.Warps.Ir(k, "SS");
/*  67 */         p.getInventory().clear();
/*  68 */         k.getInventory().clear();
/*  69 */         p.getInventory().setArmorContents(null);
/*  70 */         k.getInventory().setArmorContents(null);
/*  71 */         SS.add(k);
/*  72 */         SS.add(p);
/*  73 */         p.sendMessage("§e§lVape§f§lMC §6» §7Voce entrou no modo ScreenShare com o jogador §6" + k.getName() + "§7. Ambos foram teleportados para uma warp distinta. Voces agora estao em um canal privado.");
/*  74 */         k.sendMessage("§e§lVape§f§lMC §6» §7Voce foi colocado no modo ScreenShare. Voce e o staffer agora estao em uma warp distinta, conversando por um canal privado. Caso deslogue, sera banido.");
/*  75 */         return true;
/*     */       }
/*  77 */       p.teleport((Location)LOC.get(p));
/*  78 */       k.teleport((Location)LOC.get(k));
/*  79 */       p.getInventory().setContents((ItemStack[])Itens.get(p));
/*  80 */       p.getInventory().setArmorContents((ItemStack[])Armadura.get(p));
/*  81 */       k.getInventory().setContents((ItemStack[])Itens.get(k));
/*  82 */       k.getInventory().setArmorContents((ItemStack[])Armadura.get(k));
/*  83 */       SS.remove(p);
/*  84 */       SS.remove(k);
/*  85 */       p.sendMessage("§e§lVape§f§lMC §6» §7O jogador §6" + k.getName() + " §7foi retirado do modo ScreenShare. O jogo de ambos volta ao normal.");
/*  86 */       k.sendMessage("§e§lVape§f§lMC §6» §7Voce foi retirado do modo ScreenShare. Seu jogo voltou ao normal. Agora, voce esta livre para deslogar.");
/*  87 */       return true;
/*     */     }
/*     */     
/*     */ 
/*  91 */     return false;
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onQuit(PlayerQuitEvent e) {
/*  96 */     Player p = e.getPlayer();
/*  97 */     if (SS.contains(p)) {
/*  98 */       SS.remove(p);
/*  99 */       Player[] arrayOfPlayer; int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) { Player todos = arrayOfPlayer[i];
/* 100 */         SS.remove(todos);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\screenshare\ScreenShare.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */