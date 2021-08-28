/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class Conectado
/*    */   extends Manager
/*    */ {
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 15 */     Player p = (Player)sender;
/*    */     
/* 17 */     if (command.getName().equalsIgnoreCase("ip")) {
/* 18 */       p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce esta conectado no ip: " + ChatColor.YELLOW + ChatColor.BOLD + "em breve");
/* 19 */       return;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Conectado.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */