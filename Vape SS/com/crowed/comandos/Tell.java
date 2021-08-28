/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Tell
/*    */   implements CommandExecutor
/*    */ {
/* 20 */   public static HashMap<Player, Player> gettell = new HashMap();
/* 21 */   static ArrayList<Player> telloff = new ArrayList();
/*    */   
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 25 */     Player p = (Player)sender;
/* 26 */     if (label.equalsIgnoreCase("tell")) {
/* 27 */       if (args.length == 0) {
/* 28 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /tell <");
/* 29 */         return true;
/*    */       }
/* 31 */       Player target = Bukkit.getPlayer(args[0]);
/* 32 */       if (args[0].toLowerCase().equalsIgnoreCase("on")) {
/* 33 */         telloff.remove(p);
/* 34 */         p.sendMessage(ChatColor.GREEN + "Você ativou o seu tell");
/*    */       }
/* 36 */       else if (args[0].toLowerCase().equalsIgnoreCase("off")) {
/* 37 */         telloff.add(p);
/* 38 */         p.sendMessage(ChatColor.RED + "Você desativou o seu tell");
/*    */       }
/* 40 */       if (args.length > 1) {
/* 41 */         if (target == null) {
/* 42 */           p.sendMessage(ChatColor.RED + "Voce precisa ser um player");
/* 43 */           return true;
/*    */         }
/* 45 */         if (telloff.contains(target)) {
/* 46 */           p.sendMessage("§cO tell desse player esta off");
/* 47 */           return true;
/*    */         }
/* 49 */         StringBuilder sb = new StringBuilder();
/* 50 */         for (int i = 1; i < args.length; i++) {
/* 51 */           sb.append(args[i]).append(" ");
/*    */         }
/* 53 */         String allArgs = sb.toString().trim();
/* 54 */         p.sendMessage("§7[Você -> " + target.getName() + "§7) " + allArgs);
/* 55 */         target.sendMessage("§7(" + p.getName() + " §7-> " + "Você§7) " + allArgs);
/* 56 */         gettell.put(p, target);
/* 57 */         gettell.put(target, p);
/*    */       }
/*    */     }
/* 60 */     else if (label.equalsIgnoreCase("off")) {
/* 61 */       if (args.length == 0) {
/* 62 */         p.sendMessage(ChatColor.RED + "Fale com o player no chat normal");
/* 63 */         return true;
/*    */       }
/* 65 */       if (!gettell.containsKey(p)) {
/* 66 */         p.sendMessage(ChatColor.RED + "Você não tem ninguem para responder");
/* 67 */         return true;
/*    */       }
/* 69 */       Player deslogo = (Player)gettell.get(p);
/* 70 */       if (deslogo == null) {
/* 71 */         p.sendMessage(ChatColor.RED + "Voce precisa ser um player");
/* 72 */         return true;
/*    */       }
/* 74 */       if (telloff.contains(deslogo)) {
/* 75 */         p.sendMessage(ChatColor.RED + "O Tell desse jogador esta off !");
/* 76 */         return true;
/*    */       }
/* 78 */       StringBuilder sb = new StringBuilder();
/* 79 */       for (int i = 0; i < args.length; i++) {
/* 80 */         sb.append(args[i]).append(" ");
/*    */       }
/* 82 */       String allArgs = sb.toString().trim();
/* 83 */       p.sendMessage("§7[§eVocê -> " + deslogo.getName() + "§7) " + allArgs);
/* 84 */       deslogo.sendMessage("§7(" + p.getName() + " §7-> " + "§eVocê§7) " + allArgs);
/*    */     }
/*    */     
/* 87 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Tell.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */