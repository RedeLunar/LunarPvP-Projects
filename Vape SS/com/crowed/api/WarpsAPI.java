/*    */ package com.crowed.api;
/*    */ 
/*    */ import com.crowed.configs.WarpsConfig;
/*    */ import com.crowed.utils.FpsEnum;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.configuration.file.FileConfiguration;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.Listener;
/*    */ 
/*    */ public class WarpsAPI implements Listener
/*    */ {
/*    */   public static void iniciarFPS()
/*    */   {
/* 18 */     com.crowed.Main.estado = FpsEnum.FPS1;
/*    */   }
/*    */   
/*    */   public static void removerFPS()
/*    */   {
/* 23 */     com.crowed.Main.estado = FpsEnum.NORMAL;
/*    */   }
/*    */   
/*    */   public static void Set(Player p, String Warp)
/*    */   {
/* 28 */     WarpsConfig.getConfig().config().set("Warps." + Warp + ".X", Double.valueOf(p.getLocation().getX()));
/* 29 */     WarpsConfig.getConfig().config().set("Warps." + Warp + ".Y", Double.valueOf(p.getLocation().getY()));
/* 30 */     WarpsConfig.getConfig().config().set("Warps." + Warp + ".Z", Double.valueOf(p.getLocation().getZ()));
/* 31 */     WarpsConfig.getConfig().config().set("Warps." + Warp + ".Pitch", Float.valueOf(p.getLocation().getPitch()));
/* 32 */     WarpsConfig.getConfig().config().set("Warps." + Warp + ".Yaw", Float.valueOf(p.getLocation().getYaw()));
/* 33 */     WarpsConfig.getConfig().config().set("Warps." + Warp + ".World", p.getLocation().getWorld().getName());
/* 34 */     WarpsConfig.getConfig().saveConfigs();
/* 35 */     p.getWorld().setSpawnLocation(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ());
/*    */   }
/*    */   
/*    */   public static void Ir(Player p, String Warp) {
/* 39 */     if (WarpsConfig.getConfig().config().contains("Warps." + Warp))
/*    */     {
/* 41 */       double x = WarpsConfig.getConfig().config().getDouble("Warps." + Warp + ".X");
/* 42 */       double y = WarpsConfig.getConfig().config().getDouble("Warps." + Warp + ".Y");
/* 43 */       double z = WarpsConfig.getConfig().config().getDouble("Warps." + Warp + ".Z");
/* 44 */       float Pitch = (float)WarpsConfig.getConfig().config().getDouble("Warps." + Warp + ".Pitch");
/* 45 */       float Yaw = (float)WarpsConfig.getConfig().config().getDouble("Warps." + Warp + ".Yaw");
/* 46 */       World world = Bukkit.getWorld(WarpsConfig.getConfig().config().getString("Warps." + Warp + ".World"));
/* 47 */       Location loc = new Location(world, x, y, z, Yaw, Pitch);
/*    */       
/* 49 */       p.teleport(loc);
/*    */     } else {
/* 51 */       p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Essa " + ChatColor.YELLOW + ChatColor.BOLD + "WARP" + ChatColor.GRAY + " ainda nao foi setada!");
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\WarpsAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */