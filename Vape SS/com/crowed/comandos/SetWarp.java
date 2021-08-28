/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.api.WarpsAPI;
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class SetWarp
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 17 */     Player player = (Player)sender;
/*    */     
/* 19 */     if ((command.getName().equalsIgnoreCase("set")) && 
/* 20 */       (player.hasPermission("cmd.set"))) {
/* 21 */       if (argumentos.length == 0) {
/* 22 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /set <fps1 , fps2, challenge, knockback, void, spawn>");
/* 23 */         return;
/*    */       }
/* 25 */       if (argumentos[0].equalsIgnoreCase("fps1")) {
/* 26 */         WarpsAPI.Set(player, "Fps1");
/* 27 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "Fps1" + ChatColor.GRAY + " Com sucesso !");
/* 28 */         return;
/*    */       }
/* 30 */       if (argumentos[0].equalsIgnoreCase("fps2")) {
/* 31 */         WarpsAPI.Set(player, "Fps2");
/* 32 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "Fps2" + ChatColor.GRAY + " Com sucesso !");
/* 33 */         return;
/*    */       }
/* 35 */       if (argumentos[0].equalsIgnoreCase("challenge")) {
/* 36 */         WarpsAPI.Set(player, "Challenge");
/* 37 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "Challenge" + ChatColor.GRAY + " Com sucesso !");
/* 38 */         return;
/*    */       }
/* 40 */       if (argumentos[0].equalsIgnoreCase("spawn")) {
/* 41 */         WarpsAPI.Set(player, "Spawn");
/* 42 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "Spawn" + ChatColor.GRAY + " Com sucesso !");
/* 43 */         return;
/*    */       }
/* 45 */       if (argumentos[0].equalsIgnoreCase("knockback")) {
/* 46 */         WarpsAPI.Set(player, "Knockback");
/* 47 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "Spawn" + ChatColor.GRAY + " Com sucesso !");
/* 48 */         return;
/*    */       }
/* 50 */       if (argumentos[0].equalsIgnoreCase("fisherman")) {
/* 51 */         WarpsAPI.Set(player, "Fisherman");
/* 52 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "Fisherman" + ChatColor.GRAY + " Com sucesso !");
/* 53 */         return;
/*    */       }
/* 55 */       if (argumentos[0].equalsIgnoreCase("texturas")) {
/* 56 */         WarpsAPI.Set(player, "Texturas");
/* 57 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "Textura" + ChatColor.GRAY + " Com sucesso !");
/* 58 */         return;
/*    */       }
/* 60 */       if (argumentos[0].equalsIgnoreCase("void")) {
/* 61 */         WarpsAPI.Set(player, "VoidChallenge");
/* 62 */         player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce setou a Warp " + ChatColor.YELLOW + ChatColor.BOLD + "VoidChallenge" + ChatColor.GRAY + " Com sucesso !");
/* 63 */         return;
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\SetWarp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */