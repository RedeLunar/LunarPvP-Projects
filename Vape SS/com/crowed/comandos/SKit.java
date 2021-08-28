/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Entity;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ 
/*    */ 
/*    */ public class SKit
/*    */   implements Listener, CommandExecutor
/*    */ {
/* 19 */   public HashMap<String, ItemStack[]> kit = new HashMap();
/*    */   
/* 21 */   public HashMap<String, ItemStack[]> armadura = new HashMap();
/*    */   
/*    */   public boolean isInt(String s)
/*    */   {
/*    */     try
/*    */     {
/* 27 */       Integer.parseInt(s);
/* 28 */       return true;
/*    */     }
/*    */     catch (NumberFormatException localNumberFormatException) {}
/* 31 */     return false;
/*    */   }
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args)
/*    */   {
/* 36 */     Player p = (Player)sender;
/* 37 */     if ((cmd.getName().equalsIgnoreCase("skit")) && (p.hasPermission("cmd.skit"))) {
/* 38 */       if (args.length == 0) {
/* 39 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /skit <Criar> <aplicar> <nome> <distancia>");
/* 40 */         return true;
/*    */       }
/* 42 */       if (args[0].equalsIgnoreCase("criar")) {
/* 43 */         if (args.length == 1) {
/* 44 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /skit criar <nome> ");
/* 45 */           return true;
/*    */         }
/* 47 */         String name = args[1];
/* 48 */         this.kit.put(name, p.getInventory().getContents());
/* 49 */         this.armadura.put(name, p.getInventory().getArmorContents());
/* 50 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O kit " + args[1] + " foi criado com Sucesso!");
/* 51 */         return true;
/*    */       }
/* 53 */       if (args[0].equalsIgnoreCase("aplicar")) {
/* 54 */         if (args.length <= 2) {
/* 55 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /skit aplicar <kit> <distancia>");
/* 56 */           return true;
/*    */         }
/* 58 */         String name = args[1];
/* 59 */         if ((!this.kit.containsKey(name)) && (!this.armadura.containsKey(name))) {
/* 60 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O kit " + name + " se encontra inexistente no sistema!");
/* 61 */           return true;
/*    */         }
/* 63 */         if (isInt(args[2])) {
/* 64 */           int numero = Integer.parseInt(args[2]);
/* 65 */           for (Entity ent : p.getNearbyEntities(numero, numero, numero))
/* 66 */             if ((ent instanceof Player))
/*    */             {
/* 68 */               Player plr = (Player)ent;
/* 69 */               plr.getInventory().setArmorContents((ItemStack[])this.armadura.get(name));
/* 70 */               plr.getInventory().setContents((ItemStack[])this.kit.get(name));
/*    */             }
/* 72 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O kit " + ChatColor.YELLOW + ChatColor.BOLD + args[1] + ChatColor.GRAY + " foi aplicado para todos !");
/* 73 */           return true;
/*    */         }
/*    */       }
/*    */     }
/* 77 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\SKit.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */