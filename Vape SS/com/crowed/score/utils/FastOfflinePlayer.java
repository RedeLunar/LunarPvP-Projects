/*    */ package com.crowed.score.utils;
/*    */ 
/*    */ import com.google.common.base.Charsets;
/*    */ import java.util.Map;
/*    */ import java.util.UUID;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.OfflinePlayer;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ 
/*    */ public class FastOfflinePlayer
/*    */   implements OfflinePlayer
/*    */ {
/*    */   private final String playerName;
/*    */   
/*    */   public FastOfflinePlayer(String playerName)
/*    */   {
/* 18 */     this.playerName = playerName;
/*    */   }
/*    */   
/*    */   public boolean isOnline()
/*    */   {
/* 23 */     return false;
/*    */   }
/*    */   
/*    */   public String getName()
/*    */   {
/* 28 */     return this.playerName;
/*    */   }
/*    */   
/*    */   public UUID getUniqueId()
/*    */   {
/* 33 */     return UUID.nameUUIDFromBytes(this.playerName.getBytes(Charsets.UTF_8));
/*    */   }
/*    */   
/*    */   public boolean isBanned()
/*    */   {
/* 38 */     return false;
/*    */   }
/*    */   
/*    */   public void setBanned(boolean banned)
/*    */   {
/* 43 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public boolean isWhitelisted()
/*    */   {
/* 48 */     return false;
/*    */   }
/*    */   
/*    */   public void setWhitelisted(boolean value)
/*    */   {
/* 53 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public Player getPlayer()
/*    */   {
/* 58 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public long getFirstPlayed()
/*    */   {
/* 63 */     return System.currentTimeMillis();
/*    */   }
/*    */   
/*    */   public long getLastPlayed()
/*    */   {
/* 68 */     return System.currentTimeMillis();
/*    */   }
/*    */   
/*    */   public boolean hasPlayedBefore()
/*    */   {
/* 73 */     return false;
/*    */   }
/*    */   
/*    */   public Location getBedSpawnLocation()
/*    */   {
/* 78 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public boolean isOp()
/*    */   {
/* 83 */     return false;
/*    */   }
/*    */   
/*    */   public void setOp(boolean value)
/*    */   {
/* 88 */     throw new UnsupportedOperationException();
/*    */   }
/*    */   
/*    */   public Map<String, Object> serialize()
/*    */   {
/* 93 */     throw new UnsupportedOperationException();
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\score\utils\FastOfflinePlayer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */