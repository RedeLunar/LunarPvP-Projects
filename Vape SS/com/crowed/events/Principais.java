/*     */ package com.crowed.events;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.manager.Manager;
/*     */ import com.crowed.utils.FpsEnum;
/*     */ import com.crowed.utils.Strings;
/*     */ import org.bukkit.Location;
/*     */ import org.bukkit.Material;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.block.Block;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.entity.Damageable;
/*     */ import org.bukkit.entity.Entity;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.EventHandler;
/*     */ import org.bukkit.event.block.Action;
/*     */ import org.bukkit.event.block.SignChangeEvent;
/*     */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*     */ import org.bukkit.event.entity.FoodLevelChangeEvent;
/*     */ import org.bukkit.event.player.PlayerChatEvent;
/*     */ import org.bukkit.event.player.PlayerCommandPreprocessEvent;
/*     */ import org.bukkit.event.player.PlayerInteractEvent;
/*     */ import org.bukkit.event.player.PlayerLoginEvent;
/*     */ import org.bukkit.event.player.PlayerLoginEvent.Result;
/*     */ import org.bukkit.event.player.PlayerMoveEvent;
/*     */ import org.bukkit.event.server.ServerListPingEvent;
/*     */ import org.bukkit.event.weather.WeatherChangeEvent;
/*     */ import org.bukkit.inventory.ItemStack;
/*     */ 
/*     */ public class Principais implements org.bukkit.event.Listener
/*     */ {
/*     */   @EventHandler
/*     */   public void fome(FoodLevelChangeEvent e)
/*     */   {
/*  35 */     e.setCancelled(true);
/*  36 */     e.setFoodLevel(20);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void chuva(WeatherChangeEvent e) {
/*  41 */     if (e.toWeatherState()) {
/*  42 */       e.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  50 */   public static String motd = Main.getInstance().getConfig().getString("Motd").replace("&", "§");
/*  51 */   public static String motd2 = Main.getInstance().getConfig().getString("Motd2").replace("&", "§");
/*     */   
/*     */   @EventHandler
/*     */   public void motdDoservidor(ServerListPingEvent event)
/*     */   {
/*  56 */     event.setMotd(motd + "\n" + motd2);
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void aoChat(PlayerChatEvent e) {
/*  61 */     Player p = e.getPlayer();
/*  62 */     if (p.hasPermission("chat.cor")) {
/*  63 */       e.setFormat("§f" + p.getDisplayName() + "§7[" + Manager.prefix(p) + "§7] §7» §f" + e.getMessage().replace("&", "§").replace("%", "Porcento(s)"));
/*     */     }
/*     */     else {
/*  66 */       e.setFormat("§f" + p.getDisplayName() + "§7[" + Manager.prefix(p) + "§7] §7» §f" + e.getMessage().replace("%", "Porcento(s)"));
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Bread(PlayerMoveEvent e) {
/*  72 */     if ((Main.estado == FpsEnum.FPS1) && (e.getTo().getBlock().getRelative(org.bukkit.block.BlockFace.DOWN).getType().equals(Material.GLASS))) {
/*  73 */       Proteção.setImortalidade(e.getPlayer(), false);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Plugin(PlayerCommandPreprocessEvent e) {
/*  79 */     Player p = e.getPlayer();
/*  80 */     if ((e.getMessage().toLowerCase().startsWith("/pl")) || 
/*  81 */       (e.getMessage().toLowerCase().startsWith("/plugins")) || 
/*  82 */       (e.getMessage().toLowerCase().startsWith("//calc")) || 
/*  83 */       (e.getMessage().toLowerCase().startsWith("/bukkit:pl")) || 
/*  84 */       (e.getMessage().toLowerCase().startsWith("/bukkit:plugins")) || 
/*  85 */       (e.getMessage().toLowerCase().startsWith("/about")) || 
/*  86 */       (e.getMessage().toLowerCase().startsWith("/ver")) || 
/*  87 */       (e.getMessage().toLowerCase().startsWith("/bukkit:about")) || 
/*  88 */       (e.getMessage().toLowerCase().startsWith("/bukkit:ver")) || 
/*  89 */       (e.getMessage().toLowerCase().startsWith("/help")) || 
/*  90 */       (e.getMessage().toLowerCase().startsWith("/?")) || 
/*  91 */       (e.getMessage().toLowerCase().startsWith("/bukkit:?")) || 
/*  92 */       (e.getMessage().toLowerCase().startsWith("/help")) || 
/*  93 */       (e.getMessage().toLowerCase().startsWith("//eval")) || 
/*  94 */       (e.getMessage().toLowerCase().startsWith("/bukkit:help"))) {
/*  95 */       p.sendMessage(Strings.servidormensagem + "§e➔ §7Projeto exclusivo para o Servidor §e§lVape§f§lMc");
/*  96 */       e.setCancelled(true);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/* 101 */   public void ComandoNaoExiste(PlayerCommandPreprocessEvent e) { if (e.isCancelled()) {
/* 102 */       return;
/*     */     }
/* 104 */     Player p = e.getPlayer();
/* 105 */     String msg = e.getMessage().split(" ")[0];
/* 106 */     org.bukkit.help.HelpTopic t = org.bukkit.Bukkit.getServer().getHelpMap().getHelpTopic(msg);
/* 107 */     if (t == null) {
/* 108 */       e.setCancelled(true);
/* 109 */       p.sendMessage(Strings.servidormensagem + "§cComando Inexistente.");
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void Soup(PlayerInteractEvent e) {
/* 115 */     Player p = e.getPlayer();
/* 116 */     Damageable hp = p;
/* 117 */     if (hp.getHealth() != 20.0D) {
/* 118 */       int sopa = 7;
/* 119 */       if (((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) && (p.getItemInHand().getTypeId() == 282)) {
/* 120 */         p.setHealth(hp.getHealth() + sopa > hp.getMaxHealth() ? hp.getMaxHealth() : hp.getHealth() + sopa);
/* 121 */         p.getItemInHand().setType(Material.BOWL);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/* 127 */   public void onCheio(PlayerLoginEvent event) { Player p = event.getPlayer();
/* 128 */     if (event.getResult() == PlayerLoginEvent.Result.KICK_FULL) {
/* 129 */       if (p.hasPermission("entrar.cheio")) {
/* 130 */         event.setResult(PlayerLoginEvent.Result.ALLOWED);
/*     */       }
/*     */       else {
/* 133 */         event.setKickMessage(Strings.servidormensagem + "\n" + "\n" + "   §7O servidor esta lotado " + "\n" + "Voce deu seu lugar a um vip " + "\n" + "Voce quer ter essa permissao?" + "\n" + "\n" + "Compre vip em nosso Site : §n§o");
/*     */       }
/*     */     }
/* 136 */     else if ((event.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) && 
/* 137 */       (p.hasPermission("entrar.manutencao"))) {
/* 138 */       event.setKickMessage(Strings.servidormensagem + "\n" + "\n" + "   §7O servidor acabou de entrar em manutençao" + "\n" + "Assim que possível, nós estaremos de volta!" + "\n" + "\n" + "§7Atenciosamente, " + Strings.servidor);
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onMe(PlayerCommandPreprocessEvent e)
/*     */   {
/* 145 */     Player p = e.getPlayer();
/* 146 */     if (e.getMessage().toLowerCase().startsWith("/me")) {
/* 147 */       e.setCancelled(true);
/* 148 */       p.sendMessage(Strings.servidormensagem + "§cComando bloqueado ;(");
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/* 153 */   public void aoEscrever(SignChangeEvent e) { if (e.getLine(0).contains("&")) {
/* 154 */       e.setLine(0, e.getLine(0).replace("&", "§"));
/*     */     }
/* 156 */     if (e.getLine(1).contains("&")) {
/* 157 */       e.setLine(1, e.getLine(1).replace("&", "§"));
/*     */     }
/* 159 */     if (e.getLine(2).contains("&")) {
/* 160 */       e.setLine(2, e.getLine(2).replace("&", "§"));
/*     */     }
/* 162 */     if (e.getLine(3).contains("&")) {
/* 163 */       e.setLine(3, e.getLine(3).replace("&", "§"));
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void onEntityDamageByEntity(EntityDamageByEntityEvent e)
/*     */   {
/* 170 */     if ((e.getDamager() instanceof Player))
/*     */     {
/* 172 */       Player d = (Player)e.getDamager();
/* 173 */       if ((d.getItemInHand().getType() == Material.DIAMOND_SWORD) || 
/* 174 */         (d.getItemInHand().getType() == Material.STONE_SWORD) || 
/* 175 */         (d.getItemInHand().getType() == Material.WOOD_SWORD) || 
/* 176 */         (d.getItemInHand().getType() == Material.STONE_SWORD) || 
/* 177 */         (d.getItemInHand().getType() == Material.IRON_SWORD) || 
/* 178 */         (d.getItemInHand().getType() == Material.GOLD_SWORD) || 
/* 179 */         (d.getItemInHand().getType() == Material.FISHING_ROD) || 
/* 180 */         (d.getItemInHand().getType() == Material.DIAMOND_AXE) || 
/* 181 */         (d.getItemInHand().getType() == Material.GOLD_AXE) || 
/* 182 */         (d.getItemInHand().getType() == Material.STONE_AXE) || 
/* 183 */         (d.getItemInHand().getType() == Material.WOOD_AXE) || 
/* 184 */         (d.getItemInHand().getType() == Material.IRON_AXE)) {
/* 185 */         d.getItemInHand().setDurability((short)0);
/* 186 */         d.updateInventory();
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void noBreaking(PlayerInteractEvent e) {
/* 193 */     Player p = e.getPlayer();
/*     */     
/* 195 */     if ((p.getItemInHand().getType() == Material.FISHING_ROD) && (
/* 196 */       (e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK))) {
/* 197 */       p.getItemInHand().setDurability((short)0);
/* 198 */       p.updateInventory();
/*     */     }
/*     */   }
/*     */   
/*     */   @EventHandler
/*     */   public void clicarBussola(PlayerInteractEvent e)
/*     */   {
/* 205 */     boolean parar = false;
/* 206 */     if (e.getPlayer().getItemInHand().getType() == Material.COMPASS)
/*     */     {
/* 208 */       for (Entity entidades : e.getPlayer().getNearbyEntities(100.0D, 150.0D, 100.0D))
/*     */       {
/* 210 */         if (((entidades instanceof Player)) && (e.getPlayer().getLocation().distance(entidades.getLocation()) >= 9.0D))
/*     */         {
/* 212 */           if (entidades.getLocation().getY() > 170.0D) {
/* 213 */             return;
/*     */           }
/* 215 */           parar = true;
/* 216 */           e.getPlayer().setCompassTarget(entidades.getLocation());
/* 217 */           e.getPlayer().sendMessage("§7A Bússula apontou para o jogador: §e" + ((Player)entidades).getName());
/* 218 */           return;
/*     */         }
/*     */       }
/* 221 */       if (!parar) {
/* 222 */         e.getPlayer().sendMessage("§7A Bússula nao encontrou nenhum jogador");
/* 223 */         e.getPlayer().setCompassTarget(new Location(e.getPlayer().getWorld(), 0.0D, 100.0D, 0.0D));
/* 224 */         return;
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\Principais.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */