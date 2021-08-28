/*    */ package com.crowed.bans.events;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerChatEvent;
/*    */ import org.bukkit.event.player.PlayerLoginEvent;
/*    */ import org.bukkit.event.player.PlayerLoginEvent.Result;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Eventos
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   void chatevent(PlayerChatEvent evento)
/*    */   {
/* 60 */     Player jogador = evento.getPlayer();
/*    */     
/* 62 */     if (Config.getConfig().getMute().get("Mute." + jogador.getUniqueId()) != null) {
/* 63 */       API.sendMsg(jogador, ChatColor.GRAY + "Você está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Mutado.");
/*    */       
/* 65 */       API.sendSound(jogador, Sound.ANVIL_USE, 10);
/* 66 */       evento.setCancelled(true);
/*    */     }
/* 68 */     else if (Config.getConfig().getTempMute().get("TempMute." + jogador.getUniqueId()) != null) {
/* 69 */       API.sendMsg(jogador, ChatColor.GRAY + "Você está " + ChatColor.DARK_RED + ChatColor.BOLD + "TEMPORARIAMENTE" + ChatColor.GRAY + " Mutado.");
/* 70 */       API.sendSound(jogador, Sound.ANVIL_USE, 10);
/* 71 */       evento.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void loginEvent(PlayerLoginEvent evento) {
/* 77 */     Player jogador = evento.getPlayer();
/* 78 */     if (Config.getConfig().getBans().get("Bans." + jogador.getUniqueId()) != null) {
/* 79 */       evento.disallow(PlayerLoginEvent.Result.KICK_OTHER, ChatColor.GRAY + "§7Você foi §4§lPERMANENTEMENTE §7banido do servidor!" + "\n" + "\n" + "§7Username banido: §6§l" + Config.getConfig().getBans().get(new StringBuilder("Bans.").append(jogador.getUniqueId()).append(".Nome").toString()) + "\n" + "§7Banido por: §6§l" + Config.getConfig().getBans().get(new StringBuilder("Bans.").append(jogador.getUniqueId()).append(".Banido por").toString()) + "\n" + "§7Motivo: §6§l" + Config.getConfig().getBans().get(new StringBuilder("Bans.").append(jogador.getUniqueId()).append(".Motivo").toString()) + "\n" + "§7Vencimento : §6§lNUNCA" + "\n" + "§7Data do banimento: §6§l" + Config.getConfig().getBans().get(new StringBuilder("Bans.").append(jogador.getUniqueId()).append(".Data do banimento").toString()) + "\n" + "§7Compre seu §6§lUNBAN §7em nossa loja: §6§nem breve");
/*    */     }
/* 81 */     else if (Config.getConfig().getIpBans().get("IPBans." + jogador.getUniqueId()) != null) {
/* 82 */       evento.disallow(PlayerLoginEvent.Result.KICK_OTHER, ChatColor.GRAY + "§7Você foi §4§lPERMANENTEMENTE §7 banido por ip do servidor!" + "\n" + "\n" + "§7Username banido: §6§l" + Config.getConfig().getIpBans().get(new StringBuilder("IPBans.").append(jogador.getUniqueId()).append(".Nome").toString()) + "\n" + "§7IP banido: §6§l" + Config.getConfig().getIpBans().get(new StringBuilder("IPBans.").append(jogador.getUniqueId()).append(".IP do Jogador").toString()) + "\n" + "§7Banido por: §6§l" + Config.getConfig().getIpBans().get(new StringBuilder("IPBans.").append(jogador.getUniqueId()).append(".Banido por").toString()) + "\n" + "§7Motivo: §6§l" + Config.getConfig().getIpBans().get(new StringBuilder("IPBans.").append(jogador.getUniqueId()).append(".Motivo").toString()) + "\n" + "§7Vencimento : §6§lNUNCA" + "\n" + "§7Data do banimento: §6§l" + Config.getConfig().getIpBans().get(new StringBuilder("IPBans.").append(jogador.getUniqueId()).append(".Data do banimento").toString()) + "\n" + "§7Compre seu §6§lUNBAN §7em nossa loja: §6§nem breve");
/*    */     }
/* 84 */     else if (evento.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
/* 85 */       evento.setKickMessage("§c§lWHITELIST ATIVADA...\n§7Estamos em manutenção!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\events\Eventos.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */