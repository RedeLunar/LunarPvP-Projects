/*    */ package com.crowed.authme;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.API;
/*    */ import com.crowed.configs.AuthConfig;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Logar
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3)
/*    */   {
/* 24 */     if (cmd.getName().equalsIgnoreCase("login")) {
/* 25 */       Player p = (Player)sender;
/* 26 */       if (arg3.length == 1) {
/* 27 */         if (arg3[0].equalsIgnoreCase((String)AuthConfig.getConfig().config().get("Login." + p.getName().toLowerCase() + ".senha"))) {
/* 28 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você foi logado !");
/* 29 */           Main.login.remove(p.getName());
/* 30 */           for (int i = 1; i < 100; i++) {
/* 31 */             p.sendMessage(" ");
/*    */           }
/* 33 */           p.sendMessage(ChatColor.GREEN + "Bem-vindo ao servidor " + ChatColor.YELLOW + p.getName());
/* 34 */           p.sendMessage(ChatColor.GREEN + "O servidor se encontra em fase Beta ,");
/* 35 */           p.sendMessage(ChatColor.GREEN + "Se Ocorrer um Bug , Caso vc ache bugs Reporte ,");
/* 36 */           p.sendMessage(ChatColor.GREEN + "Aproveite o servidor ! " + ChatColor.YELLOW + p.getName());
/* 37 */           API.itensSpawn(p);
/* 38 */           return true;
/*    */         }
/* 40 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Essa senha nao foi encontrada , em nosso banco de dados .");
/*    */       }
/*    */     }
/* 43 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\authme\Logar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */