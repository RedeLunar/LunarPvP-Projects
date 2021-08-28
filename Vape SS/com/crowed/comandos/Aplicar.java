/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.manager.Manager;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Aplicar
/*    */   extends Manager
/*    */ {
/* 20 */   public static String builder = Main.getInstance().getConfig().getString("Builder").replace("&", "§");
/* 21 */   public static String helper = Main.getInstance().getConfig().getString("Helper").replace("&", "§");
/* 22 */   public static String trial = Main.getInstance().getConfig().getString("Trial").replace("&", "§");
/* 23 */   public static String detector = Main.getInstance().getConfig().getString("GcDetector").replace("&", "§");
/*    */   
/*    */ 
/*    */   public void Comando(CommandSender sender, Command command, String[] argumentos)
/*    */   {
/* 28 */     Player p = (Player)sender;
/*    */     
/* 30 */     if (command.getName().equalsIgnoreCase("aplicar")) {
/* 31 */       if (argumentos.length == 0) {
/* 32 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + ChatColor.GRAY + "/aplicar <BUILDER , HELPER , TRIAL , GCDETECTOR>");
/* 33 */         return;
/*    */       }
/* 35 */       if (argumentos[0].equalsIgnoreCase("builder")) {
/* 36 */         p.sendMessage(" ");
/* 37 */         p.sendMessage(ChatColor.GRAY + "Formulario: " + builder);
/* 38 */         p.sendMessage(ChatColor.GRAY + "Espere nossa resposta em seu Email ou Skype!");
/* 39 */         p.sendMessage(ChatColor.DARK_RED + ChatColor.BOLD + "INFO: " + ChatColor.GRAY + "Nao faça + de uma vez o Formulario !");
/* 40 */         p.sendMessage(" ");
/* 41 */         return;
/*    */       }
/* 43 */       if (argumentos[0].equalsIgnoreCase("helper")) {
/* 44 */         p.sendMessage(" ");
/* 45 */         p.sendMessage(ChatColor.GRAY + "Formulario: " + helper);
/* 46 */         p.sendMessage(ChatColor.GRAY + "Espere nossa resposta em seu Email ou Skype!");
/* 47 */         p.sendMessage(ChatColor.DARK_RED + ChatColor.BOLD + "INFO: " + ChatColor.GRAY + "Nao faça + de uma vez o Formulario !");
/* 48 */         p.sendMessage(" ");
/* 49 */         return;
/*    */       }
/* 51 */       if (argumentos[0].equalsIgnoreCase("trial")) {
/* 52 */         p.sendMessage(" ");
/* 53 */         p.sendMessage(ChatColor.GRAY + "Formulario: " + trial);
/* 54 */         p.sendMessage(ChatColor.GRAY + "Espere nossa resposta em seu Email ou Skype !");
/* 55 */         p.sendMessage(ChatColor.DARK_RED + ChatColor.BOLD + "INFO: " + ChatColor.GRAY + "Nao faça + de uma vez o Formulario !");
/* 56 */         p.sendMessage(" ");
/* 57 */         return;
/*    */       }
/* 59 */       if (argumentos[0].equalsIgnoreCase("gcdetector")) {
/* 60 */         p.sendMessage(" ");
/* 61 */         p.sendMessage(ChatColor.GRAY + "Formulario: " + detector);
/* 62 */         p.sendMessage(ChatColor.GRAY + "Espere nossa resposta em seu Email ou Skype !");
/* 63 */         p.sendMessage(ChatColor.DARK_RED + ChatColor.BOLD + "INFO: " + ChatColor.GRAY + "Nao faça + de uma vez o Formulario !");
/* 64 */         p.sendMessage(" ");
/* 65 */         return;
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Aplicar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */