/*    */ package com.crowed.bans;
/*    */ 
/*    */ import com.crowed.bans.events.API;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class Kick
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 19 */     if (!(sender instanceof Player)) {
/* 20 */       return true;
/*    */     }
/* 22 */     Player jogador = (Player)sender;
/* 23 */     if (cmd.getName().equalsIgnoreCase("kick")) {
/* 24 */       if (!jogador.hasPermission("cmd.kick")) {
/* 25 */         API.sendMsg(jogador, Strings.permissaocomando);
/* 26 */         return true;
/*    */       }
/* 28 */       if (args.length == 0) {
/* 29 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/kick <jogador> <motivo>");
/* 30 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 31 */         return true;
/*    */       }
/* 33 */       Player vitima = Bukkit.getPlayer(args[0]);
/* 34 */       if (vitima == null) {
/* 35 */         API.sendMsg(jogador, Strings.playeroffiline);
/* 36 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 37 */         return true;
/*    */       }
/* 39 */       if (vitima.getName().equals("aiMarcelloCodes")) {
/* 40 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de Kickar o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " aiMarcelloCodes");
/* 41 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 42 */         return true;
/*    */       }
/* 44 */       if (vitima.getName().equals("aiMarcelloCodes")) {
/* 45 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de Kickar o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " aiMarcelloCodes");
/* 46 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 47 */         return true;
/*    */       }
/* 49 */       if (vitima.getName() == jogador.getName()) {
/* 50 */         API.sendMsg(jogador, "§cVocê não pode kikar a si mesmo!");
/* 51 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 52 */         return true;
/*    */       }
/* 54 */       if (args.length == 1) {
/* 55 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/kick <jogador> <motivo>");
/* 56 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 57 */         return true;
/*    */       }
/* 59 */       String Motivo = "";
/* 60 */       for (int i = 1; i < args.length; i++) {
/* 61 */         Motivo = Motivo + args[i] + " ";
/*    */       }
/* 63 */       API.sendMsg(jogador, ChatColor.GRAY + "Você kickou o jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + "§f.");
/* 64 */       API.sendStaff(ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " kickou o jogador " + ChatColor.GOLD + ChatColor.BOLD + vitima.getName() + ". Motivo: " + ChatColor.GOLD + ChatColor.BOLD + Motivo);
/* 65 */       vitima.kickPlayer("§7Você foi Kickado do servidor!\n\n§7kickado: " + ChatColor.GOLD + ChatColor.BOLD + vitima.getName() + "\n" + "§7Staff: " + ChatColor.GOLD + ChatColor.BOLD + jogador.getName() + "\n" + "§7Motivo: " + ChatColor.GOLD + ChatColor.BOLD + Motivo);
/* 66 */       return true;
/*    */     }
/* 68 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\Kick.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */