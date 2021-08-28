/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import ca.wacos.nametagedit.NametagAPI;
/*    */ import com.crowed.api.fake.FakeManager;
/*    */ import com.crowed.api.fake.FakePlayerUtils;
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import net.md_5.bungee.api.ChatColor;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.OfflinePlayer;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Fake
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args)
/*    */   {
/* 23 */     if ((commandSender instanceof Player)) {
/* 24 */       Player player = (Player)commandSender;
/* 25 */       if (command.getName().equalsIgnoreCase("fake")) {
/* 26 */         if (player.hasPermission("cmd.fake")) {
/* 27 */           if (args.length == 0) {
/* 28 */             player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /fake <nick/off>");
/* 29 */             return false;
/*    */           }
/*    */           
/* 32 */           if (args.length == 1) {
/* 33 */             if (args[0].toLowerCase().equals("off")) {
/* 34 */               if (FakeManager.fake.containsKey(player)) {
/*    */                 try {
/* 36 */                   FakeManager.fakes.remove(FakeManager.fake.get(player));
/* 37 */                   FakeManager.fake.remove(player);
/* 38 */                   FakePlayerUtils.changePlayerName(player, (String)FakeManager.realName.get(player));
/* 39 */                   FakeManager.realName.remove(player);
/* 40 */                   NametagAPI.setPrefix(player.getName(), "§7");
/* 41 */                   NametagAPI.setSuffix(player.getName(), " §7" + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 42 */                   player.setDisplayName("§7" + player.getName());
/* 43 */                   player.sendMessage(ChatColor.GREEN + "Seu nickname foi resetado!");
/* 44 */                   return true;
/*    */                 } catch (Exception exception) {
/* 46 */                   player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Seu fake foi resetado!");
/* 47 */                   return true;
/*    */                 }
/*    */               }
/* 50 */               player.sendMessage(ChatColor.RED + "Você não está utilizando nenhum fake!");
/*    */             }
/*    */             else {
/* 53 */               if (FakeManager.fake.containsKey(player)) {
/* 54 */                 player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você já está utilizando um fake! Remova-o com /fake #!");
/* 55 */                 return true;
/*    */               }
/* 57 */               String nickname = args[0];
/* 58 */               if (!FakePlayerUtils.validateName(nickname)) {
/* 59 */                 player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O nickname escolhido possui caractéres inválidos!");
/* 60 */                 return true;
/*    */               }
/* 62 */               if (FakeManager.fakes.contains(nickname)) {
/* 63 */                 player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Este fake já está em uso!");
/* 64 */                 return true;
/*    */               }
/*    */               try {
/* 67 */                 FakeManager.fakes.add(nickname);
/* 68 */                 FakeManager.fake.put(player, nickname);
/* 69 */                 FakeManager.realName.put(player, player.getName());
/* 70 */                 FakePlayerUtils.changePlayerName(player, nickname);
/* 71 */                 FakePlayerUtils.changePlayerSkin(player, nickname, Bukkit.getOfflinePlayer(nickname).getUniqueId());
/* 72 */                 player.sendMessage(ChatColor.GREEN + "Seu nickname foi alterado para " + nickname + "!");
/*    */               } catch (Exception exception) {
/* 74 */                 player.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Seu nickname foi alterado para " + ChatColor.YELLOW + ChatColor.BOLD + nickname + "!");
/* 75 */                 return true;
/*    */               }
/*    */             }
/*    */           }
/*    */         } else {
/* 80 */           player.sendMessage(Strings.permissaocomando);
/*    */         }
/*    */       }
/*    */     }
/*    */     
/* 85 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Fake.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */