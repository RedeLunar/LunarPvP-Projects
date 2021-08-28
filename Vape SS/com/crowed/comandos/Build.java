/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.BlockBreakEvent;
/*    */ import org.bukkit.event.block.BlockPlaceEvent;
/*    */ 
/*    */ 
/*    */ public class Build
/*    */   implements CommandExecutor, Listener
/*    */ {
/* 19 */   public static ArrayList<String> embuild = new ArrayList();
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 23 */     if (!(sender instanceof Player)) {
/* 24 */       return true;
/*    */     }
/* 26 */     Player p = (Player)sender;
/* 27 */     if (cmd.getName().equalsIgnoreCase("build")) {
/* 28 */       if (p.hasPermission("cmd.build")) {
/* 29 */         if (!embuild.contains(p.getName())) {
/* 30 */           embuild.add(p.getName());
/* 31 */           p.sendMessage(Strings.servidormensagem + ChatColor.GREEN + "Você entrou no modo build.");
/* 32 */           return true;
/*    */         }
/* 34 */         embuild.remove(p.getName());
/* 35 */         p.sendMessage(Strings.servidormensagem + ChatColor.RED + "Você saiu do modo build.");
/* 36 */         return true;
/*    */       }
/*    */     } else {
/* 39 */       p.sendMessage(Strings.permissaocomando);
/*    */     }
/* 41 */     return false;
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onbloco(BlockPlaceEvent e) {
/* 46 */     Player p = e.getPlayer();
/* 47 */     if (!embuild.contains(p.getName())) {
/* 48 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void onbloco(BlockBreakEvent e) {
/* 54 */     Player p = e.getPlayer();
/* 55 */     if (!embuild.contains(p.getName())) {
/* 56 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Build.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */