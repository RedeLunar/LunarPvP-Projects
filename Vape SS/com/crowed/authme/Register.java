/*    */ package com.crowed.authme;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.API;
/*    */ import com.crowed.configs.AuthConfig;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Sound;
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
/*    */ 
/*    */ 
/*    */ public class Register
/*    */   implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command command, String arg2, String[] arg3)
/*    */   {
/* 27 */     Player p = (Player)sender;
/* 28 */     if (command.getName().equalsIgnoreCase("register")) {
/* 29 */       if (AuthConfig.getConfig().config().contains("Login." + p.getName().toLowerCase() + ".senha")) {
/* 30 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Essa conta ja esta registrada em nosso banco de dados.");
/* 31 */         p.playSound(p.getLocation(), Sound.EXPLODE, 5.0F, 5.0F);
/* 32 */         return true;
/*    */       }
/* 34 */       if (arg3.length == 0) {
/* 35 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Para se autenticar digite " + ChatColor.YELLOW + "/register <senha>");
/* 36 */         return true;
/*    */       }
/* 38 */       if (arg3[0].length() <= 3) {
/* 39 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "A Senha deve ter conter no minimo , 3 caracteristicas !");
/* 40 */         return true;
/*    */       }
/* 42 */       if (arg3.length == 1) {
/* 43 */         String senha = arg3[0];
/* 44 */         AuthConfig.getConfig().config().set("Login." + p.getName().toLowerCase() + ".senha", senha);
/* 45 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Voce se registrou com sucesso , Sua senha foi encaminhada para o nosso banco de dados !");
/* 46 */         Main.login.remove(p.getName());
/* 47 */         AuthConfig.getConfig().saveConfigs();
/* 48 */         for (int i = 1; i < 100; i++) {
/* 49 */           p.sendMessage(" ");
/*    */         }
/* 51 */         p.sendMessage(ChatColor.GREEN + "Bem-vindo ao servidor " + ChatColor.YELLOW + p.getName());
/* 52 */         p.sendMessage(ChatColor.GREEN + "O servidor se encontra em fase Beta ,");
/* 53 */         p.sendMessage(ChatColor.GREEN + "Se Ocorrer um Bug , Caso vc ache bugs Reporte ,");
/* 54 */         p.sendMessage(ChatColor.GREEN + "Aproveite o servidor !" + ChatColor.YELLOW + p.getName());
/* 55 */         p.sendMessage("");
/* 56 */         API.itensSpawn(p);
/* 57 */         return true;
/*    */       }
/*    */     }
/* 60 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\authme\Register.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */