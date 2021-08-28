/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.events.Proteção;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Tp
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 19 */     if (!(sender instanceof Player)) {
/* 20 */       return true;
/*    */     }
/* 22 */     Player p = (Player)sender;
/* 23 */     if (p.hasPermission("cmd.tp")) {
/* 24 */       if (cmd.getName().equalsIgnoreCase("tp")) {
/* 25 */         if (args.length == 0) {
/* 26 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /tp (jogador)");
/* 27 */           return true;
/*    */         }
/* 29 */         Player alvo = Bukkit.getPlayer(args[0]);
/* 30 */         p.teleport(alvo);
/* 31 */         p.sendMessage(Strings.servidormensagem + "§7Você foi teleportado para: §e§l" + alvo.getName());
/* 32 */         if (alvo == null) {
/* 33 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Este jogador esta offline.");
/* 34 */           return true;
/*    */         }
/* 36 */         return true;
/*    */       }
/* 38 */       if (cmd.getName().equalsIgnoreCase("tphere")) {
/* 39 */         if (args.length == 0) {
/* 40 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /tphere (jogador)");
/* 41 */           return true;
/*    */         }
/* 43 */         Player alvo = Bukkit.getPlayer(args[0]);
/* 44 */         alvo.teleport(p);
/* 45 */         p.sendMessage(Strings.servidormensagem + "§7Você puxou: §e§l" + alvo.getName());
/* 46 */         alvo.sendMessage(Strings.servidormensagem + "§7Você foi puxado por: §e§l" + p.getName());
/* 47 */         if (alvo == null) {
/* 48 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Este jogador esta offline.");
/* 49 */           return true;
/*    */         }
/* 51 */         return true;
/*    */       }
/*    */       Player[] arrayOfPlayer;
/* 54 */       int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) { Player s = arrayOfPlayer[i];
/* 55 */         if (cmd.getName().equalsIgnoreCase("tpall")) {
/* 56 */           s.teleport(p);
/* 57 */           Proteção.setImortalidade(s, false);
/* 58 */           s.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O Jogador " + ChatColor.YELLOW + ChatColor.BOLD + p.getName() + ChatColor.GRAY + " Puxou todos os jogadores para esse Local !");
/*    */         } else {
/* 60 */           p.sendMessage(Strings.permissaocomando);
/*    */         }
/*    */       }
/*    */     }
/* 64 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Tp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */