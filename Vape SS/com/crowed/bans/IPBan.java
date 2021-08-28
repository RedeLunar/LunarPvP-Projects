/*    */ package com.crowed.bans;
/*    */ 
/*    */ import com.crowed.api.HorarioAPI;
/*    */ import com.crowed.bans.events.API;
/*    */ import com.crowed.bans.events.Config;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.net.InetSocketAddress;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class IPBan implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 21 */     if (!(sender instanceof Player)) {
/* 22 */       return true;
/*    */     }
/* 24 */     Player jogador = (Player)sender;
/* 25 */     if (cmd.getName().equalsIgnoreCase("ipban")) {
/* 26 */       if (!jogador.hasPermission("cmd.bans")) {
/* 27 */         API.sendMsg(jogador, Strings.permissaocomando);
/* 28 */         return true;
/*    */       }
/* 30 */       if (args.length == 0) {
/* 31 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/ipban <jogador> <motivo>");
/* 32 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 33 */         return true;
/*    */       }
/* 35 */       Player vitima = Bukkit.getPlayer(args[0]);
/* 36 */       if (vitima == null) {
/* 37 */         API.sendMsg(jogador, Strings.playeroffiline);
/* 38 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 39 */         return true;
/*    */       }
/* 41 */       if (vitima.getName() == jogador.getName()) {
/* 42 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Voce nao pode usar esse comando em vc mesmo !");
/* 43 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 44 */         return true;
/*    */       }
/* 46 */       if (vitima.getName().equals("aiMarcelloCodes")) {
/* 47 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de banir (ip) o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " aiMarcelloCodes");
/* 48 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 49 */         return true;
/*    */       }
/* 51 */       if (vitima.getName().equals("aiMarcelloCodes")) {
/* 52 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de banir (ip) o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " aiMarcelloCodes");
/* 53 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 54 */         return true;
/*    */       }
/* 56 */       if (Config.getConfig().getBans().get("Bans." + vitima.getUniqueId()) != null) {
/* 57 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " Já está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Banido !");
/* 58 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 59 */         return true;
/*    */       }
/* 61 */       if (Config.getConfig().getIpBans().get("IPBans." + vitima.getUniqueId()) != null) {
/* 62 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " Já está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Banido pelo seu IP!");
/* 63 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 64 */         return true;
/*    */       }
/* 66 */       if (args.length == 1) {
/* 67 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/ipban <jogador> <motivo>");
/* 68 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 69 */         return true;
/*    */       }
/* 71 */       String Motivo = "";
/* 72 */       for (int i = 1; i < args.length; i++) {
/* 73 */         Motivo = Motivo + args[i] + " ";
/*    */       }
/* 75 */       API.sendMsg(jogador, ChatColor.GRAY + "Você baniu o (ip) jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.DARK_RED + ChatColor.BOLD + " PERMANENTEMENTE" + ChatColor.GRAY + " .");
/* 76 */       API.sendStaff(ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " baniu (ip) do jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + ". Motivo: " + ChatColor.YELLOW + ChatColor.BOLD + Motivo);
/* 77 */       vitima.kickPlayer("§7Você foi §4§lPERMANENTEMENTE §7ip banido do servidor!\n\n§7Username banido: §6§l" + vitima.getName() + "\n" + "§7IP banido: §6§l" + vitima.getAddress().getHostString() + "\n" + "§7Banido por: §6§l" + jogador.getName() + "\n" + "§7Motivo: §6§l" + Motivo + "\n" + "§7Vencimento : §6§lNUNCA" + "\n" + "§7Data do banimento: §6§l" + HorarioAPI.getHorario() + "\n" + "§7Compre seu §6§lUNBAN §7em nossa loja: §6§nem breve");
/*    */       
/* 79 */       Config.getConfig().getIpBans().set("IPBans." + vitima.getUniqueId() + ".Nome", vitima.getName());
/* 80 */       Config.getConfig().getIpBans().set("IPBans." + vitima.getUniqueId() + ".Banido por", jogador.getName());
/* 81 */       Config.getConfig().getIpBans().set("IPBans." + vitima.getUniqueId() + ".Motivo", Motivo);
/* 82 */       Config.getConfig().getIpBans().set("IPBans." + vitima.getUniqueId() + ".IP do Jogador", vitima.getAddress().getHostString());
/* 83 */       Config.getConfig().getIpBans().set("IPBans." + vitima.getUniqueId() + ".Data do banimento", HorarioAPI.getHorario());
/* 84 */       Config.getConfig().saveIpBans();
/* 85 */       Bukkit.banIP(vitima.getAddress().getHostString());
/* 86 */       return true;
/*    */     }
/* 88 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\IPBan.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */