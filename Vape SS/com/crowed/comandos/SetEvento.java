/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.api.API;
/*    */ import com.crowed.configs.EventoConfig;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.Random;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.Listener;
/*    */ 
/*    */ public class SetEvento implements Listener, CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
/*    */   {
/* 23 */     Player p = (Player)sender;
/* 24 */     if ((p.hasPermission("cmd.setevento")) && (label.equalsIgnoreCase("setevento"))) {
/* 25 */       EventoConfig.getConfig();
/* 26 */       p.sendMessage(Strings.servidormensagem + ChatColor.GREEN + "Evento setado com sucesso !");
/* 27 */       API.setWarp(p, "Evento");
/* 28 */       EventoConfig.getConfig().config().set("evento.x", Double.valueOf(p.getLocation().getX()));
/* 29 */       EventoConfig.getConfig().config().set("evento.y", Double.valueOf(p.getLocation().getY()));
/* 30 */       EventoConfig.getConfig().config().set("evento.z", Double.valueOf(p.getLocation().getZ()));
/* 31 */       p.getWorld();
/* 32 */       EventoConfig.getConfig().config().set("evento.pitch", Float.valueOf(p.getLocation().getPitch()));
/* 33 */       EventoConfig.getConfig().config().set("evento.yam", Float.valueOf(p.getLocation().getYaw()));
/* 34 */       EventoConfig.getConfig().config().set("evento.world", p.getLocation().getWorld().getName());
/* 35 */       EventoConfig.getConfig().saveConfigs();
/*    */     }
/* 37 */     return false;
/*    */   }
/*    */   
/* 40 */   public static void Evento(Player p) { Random dice = new Random();
/*    */     
/* 42 */     int number = dice.nextInt(4);
/* 43 */     switch (number) {
/*    */     case 0: 
/* 45 */       World w = Bukkit.getServer().getWorld(EventoConfig.getConfig().config().getString("evento.world"));
/* 46 */       double x = EventoConfig.getConfig().config().getDouble("evento.x");
/* 47 */       double y = EventoConfig.getConfig().config().getDouble("evento.y");
/* 48 */       double z = EventoConfig.getConfig().config().getDouble("evento.z");
/* 49 */       Location lobby = new Location(w, x, y, z);
/* 50 */       lobby.setPitch((float)EventoConfig.getConfig().config().getDouble("evento.pitch"));
/* 51 */       lobby.setYaw((float)EventoConfig.getConfig().config().getDouble("evento.yaw"));
/*    */       
/* 53 */       p.teleport(lobby);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\SetEvento.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */