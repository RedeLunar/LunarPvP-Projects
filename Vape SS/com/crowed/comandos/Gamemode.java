/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.GameMode;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Gamemode
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 16 */     Player p = (Player)sender;
/*    */     
/* 18 */     if (p.hasPermission("cover.gamemode")) {
/* 19 */       if (argumentos.length == 0) {
/* 20 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /gm <1 , 0> ou /gamemode <1 , 0>");
/* 21 */         return;
/*    */       }
/* 23 */       if (command.getName().equalsIgnoreCase("gm")) {
/* 24 */         if (argumentos[0].equalsIgnoreCase("1")) {
/* 25 */           p.setGameMode(GameMode.CREATIVE);
/* 26 */           p.sendMessage(ChatColor.GREEN + "O Seu gamemode foi alterado para Creative");
/* 27 */           return;
/*    */         }
/* 29 */         if (argumentos[0].equalsIgnoreCase("0")) {
/* 30 */           p.setGameMode(GameMode.SURVIVAL);
/* 31 */           p.sendMessage(ChatColor.RED + "O Seu gamemode foi alterado para Survival");
/*    */         }
/*    */       }
/*    */     }
/*    */     else {
/* 36 */       p.sendMessage(Strings.permissaocomando);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Gamemode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */