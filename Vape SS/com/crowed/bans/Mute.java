/*    */ package com.crowed.bans;
/*    */ 
/*    */ import com.crowed.api.HorarioAPI;
/*    */ import com.crowed.bans.events.API;
/*    */ import com.crowed.bans.events.Config;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Mute
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 21 */     if (!(sender instanceof Player)) {
/* 22 */       return true;
/*    */     }
/* 24 */     Player jogador = (Player)sender;
/* 25 */     if (cmd.getName().equalsIgnoreCase("mute")) {
/* 26 */       if (!jogador.hasPermission("cmd.mute")) {
/* 27 */         API.sendMsg(jogador, Strings.permissaocomando);
/* 28 */         return true;
/*    */       }
/* 30 */       if (args.length == 0) {
/* 31 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/mute <jogador> <motivo>");
/* 32 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 33 */         return true;
/*    */       }
/* 35 */       Player vitima = Bukkit.getPlayer(args[0]);
/* 36 */       if (vitima == null) {
/* 37 */         API.sendMsg(jogador, Strings.playeroffiline);
/* 38 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 39 */         return true;
/*    */       }
/* 41 */       if (vitima.getName().equals("aiMarcelloCodes__")) {
/* 42 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de Mutar o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " aiMarcelloCodes");
/* 43 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 44 */         return true;
/*    */       }
/* 46 */       if (vitima.getName().equals("aiCrowedCodes_")) {
/* 47 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você esta bloqueado de Mutar o " + ChatColor.DARK_RED + ChatColor.BOLD + "DONO" + ChatColor.DARK_RED + " aiMarcelloCodes");
/* 48 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 49 */         return true;
/*    */       }
/* 51 */       if (vitima.getName() == jogador.getName()) {
/* 52 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Voce nao pode usar esse comando em vc mesmo !");
/* 53 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 54 */         return true;
/*    */       }
/* 56 */       if (Config.getConfig().getBans().get("Mute." + vitima.getUniqueId()) != null) {
/* 57 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "O jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + " Já está " + ChatColor.DARK_RED + ChatColor.BOLD + "PERMANENTEMENTE" + ChatColor.GRAY + " Mutado !");
/* 58 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 59 */         return true;
/*    */       }
/* 61 */       if (args.length == 1) {
/* 62 */         API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "/mute <jogador> <motivo>");
/* 63 */         API.sendSound(jogador, Sound.NOTE_PLING, 10);
/* 64 */         return true;
/*    */       }
/* 66 */       String Motivo = "";
/* 67 */       for (int i = 1; i < args.length; i++) {
/* 68 */         Motivo = Motivo + args[i] + " ";
/*    */       }
/* 70 */       API.sendMsg(jogador, Strings.servidormensagem + ChatColor.GRAY + "Você mutou o jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + ".");
/* 71 */       API.sendStaff(Strings.servidormensagem + ChatColor.GRAY + "O Staff " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + " mutou o jogador " + ChatColor.YELLOW + ChatColor.BOLD + vitima.getName() + ChatColor.GRAY + ". Motivo: " + ChatColor.YELLOW + ChatColor.BOLD + Motivo);
/* 72 */       API.sendMsg(vitima, Strings.servidormensagem + ChatColor.GRAY + "Você foi Mutado por: " + ChatColor.YELLOW + ChatColor.BOLD + jogador.getName() + ChatColor.GRAY + ". Motivo: " + ChatColor.YELLOW + ChatColor.BOLD + Motivo);
/*    */       
/* 74 */       Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Nome", vitima.getName());
/* 75 */       Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Mutado por", jogador.getName());
/* 76 */       Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Motivo", Motivo);
/* 77 */       Config.getConfig().getMute().set("Mute." + vitima.getUniqueId() + ".Data do mute", HorarioAPI.getHorario());
/* 78 */       Config.getConfig().saveMute();
/* 79 */       return true;
/*    */     }
/* 81 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\Mute.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */