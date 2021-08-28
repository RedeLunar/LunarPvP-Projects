/*    */ package com.crowed.api;
/*    */ 
/*    */ import com.crowed.manager.Manager;
/*    */ import net.minecraft.server.v1_7_R4.ChatSerializer;
/*    */ import net.minecraft.server.v1_7_R4.EntityPlayer;
/*    */ import net.minecraft.server.v1_7_R4.IChatBaseComponent;
/*    */ import net.minecraft.server.v1_7_R4.NetworkManager;
/*    */ import net.minecraft.server.v1_7_R4.PlayerConnection;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class TabAPI implements Listener
/*    */ {
/* 19 */   private static int VERSION = 47;
/*    */   
/*    */   @EventHandler
/* 22 */   void TabDoServidor(PlayerJoinEvent evento) { final Player player = evento.getPlayer();
/* 23 */     Bukkit.getScheduler().scheduleSyncRepeatingTask(com.crowed.Main.getPlugin(), new Runnable()
/*    */     {
/*    */       public void run() {
/* 26 */         PlayerConnection connect = ((CraftPlayer)player).getHandle().playerConnection;
/*    */         
/* 28 */         IChatBaseComponent top = ChatSerializer.a("{'extra': [{text: '', color: 'aqua'}],'color': gold, 'text': '§e§lVape§f§lMc§7 \n             \n§eKills: §7" + StatsManager.getKills(player) + " §8| §eDeaths: §7" + StatsManager.getDeaths(player) + " §8| §eKillStreak: §7" + StatsManager.getKillStreak(player) + "\n§eKit: §7" + KitAPI.getKit(player) + " §8| §ePing: §7" + ((CraftPlayer)player).getHandle().ping + " §8| §ePlayers: §7" + Bukkit.getOnlinePlayers().length + "§3/§7" + Bukkit.getMaxPlayers() + "\n'}");
/*    */         
/* 30 */         IChatBaseComponent bottom = ChatSerializer.a("{'extra': [{'color': 'aqua', 'text': '', 'underline': 'true'}], 'color': 'gold', 'text': '\n§eNick: §7" + player.getName() + " §8| §eRank: " + Manager.RankAndPrefix(player) + " §8| §e XP: §7" + StatsManager.getXp(player) + " §8| §eCoins: §7" + StatsManager.getCoins(player) + "\n§eAcesse nosso site para mais informações: §7em breve'}");
/* 31 */         if (((CraftPlayer)player).getHandle().playerConnection.networkManager.getVersion() < TabAPI.VERSION) {
/* 32 */           return;
/*    */         }
/* 34 */         connect.sendPacket(new org.spigotmc.ProtocolInjector.PacketTabHeader(top, bottom));
/*    */       }
/*    */       
/* 37 */     }, 1L, 20L);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\TabAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */