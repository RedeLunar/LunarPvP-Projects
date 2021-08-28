/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.Listener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Sc
/*    */   implements Listener, CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
/*    */   {
/* 21 */     if (!(sender instanceof Player))
/*    */     {
/* 23 */       sender.sendMessage(ChatColor.RED + "Voce precisa ser um player !");
/* 24 */       return true;
/*    */     }
/* 26 */     if (cmd.getName().equalsIgnoreCase("sc"))
/*    */     {
/* 28 */       if (args.length == 0) {
/* 29 */         sender.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /sc <mensagem>");
/*    */       }
/* 31 */       if (args.length > 0)
/*    */       {
/* 33 */         Player p = (Player)sender;
/* 34 */         StringBuilder string = new StringBuilder();
/* 35 */         for (int i = 0; i < args.length; i++) {
/* 36 */           string.append(args[i] + " ");
/*    */         }
/* 38 */         String mensagem = string.toString();
/*    */         
/*    */         Player[] arrayOfPlayer;
/* 41 */         int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
/* 42 */         for (int i = 0; i < j; i++)
/*    */         {
/* 44 */           Player staff = arrayOfPlayer[i];
/* 45 */           if (!sender.hasPermission("cmd.sc")) {
/* 46 */             sender.sendMessage(Strings.permissaocomando);
/* 47 */             return true;
/*    */           }
/* 49 */           if (staff.hasPermission("cmd.sc")) {
/* 50 */             staff.sendMessage(ChatColor.GRAY + "[" + ChatColor.GOLD + ChatColor.BOLD + "StaffChat" + ChatColor.GRAY + "] " + p.getDisplayName() + ChatColor.GRAY + " (" + Manager.prefix(staff) + ChatColor.GRAY + ")" + ChatColor.WHITE + " » §7" + mensagem);
/*    */           }
/*    */         }
/*    */       }
/*    */     }
/* 55 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Sc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */