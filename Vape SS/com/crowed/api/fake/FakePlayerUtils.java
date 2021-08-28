/*     */ package com.crowed.api.fake;
/*     */ 
/*     */ import ca.wacos.nametagedit.NametagAPI;
/*     */ import com.crowed.Main;
/*     */ import com.crowed.manager.Manager;
/*     */ import java.lang.reflect.Field;
/*     */ import java.util.Collection;
/*     */ import java.util.UUID;
/*     */ import java.util.concurrent.ExecutionException;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ import net.minecraft.server.v1_7_R4.EntityPlayer;
/*     */ import net.minecraft.server.v1_7_R4.MathHelper;
/*     */ import net.minecraft.server.v1_7_R4.PacketPlayOutEntityDestroy;
/*     */ import net.minecraft.server.v1_7_R4.PacketPlayOutEntityHeadRotation;
/*     */ import net.minecraft.server.v1_7_R4.PacketPlayOutEntityMetadata;
/*     */ import net.minecraft.server.v1_7_R4.PacketPlayOutNamedEntitySpawn;
/*     */ import net.minecraft.server.v1_7_R4.PacketPlayOutPlayerInfo;
/*     */ import net.minecraft.server.v1_7_R4.PlayerConnection;
/*     */ import net.minecraft.util.com.google.common.cache.LoadingCache;
/*     */ import net.minecraft.util.com.mojang.authlib.GameProfile;
/*     */ import net.minecraft.util.com.mojang.authlib.properties.Property;
/*     */ import net.minecraft.util.com.mojang.authlib.properties.PropertyMap;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
/*     */ import org.bukkit.entity.Player;
/*     */ 
/*     */ public class FakePlayerUtils
/*     */ {
/*     */   public static void changePlayerName(Player player, String name)
/*     */   {
/*  33 */     changePlayerName(player, name, true);
/*     */   }
/*     */   
/*     */   public static void changePlayerName(Player player, String name, boolean respawn) {
/*  37 */     Player[] players = ((Main)Main.getPlugin(Main.class)).getServer().getOnlinePlayers();
/*  38 */     EntityPlayer entityPlayer = ((CraftPlayer)player).getHandle();
/*  39 */     GameProfile playerProfile = entityPlayer.getProfile();
/*  40 */     if (respawn) {
/*  41 */       removeFromTab(player, players);
/*     */     }
/*     */     try {
/*  44 */       Field field = playerProfile.getClass().getDeclaredField("name");
/*  45 */       field.setAccessible(true);
/*  46 */       field.set(playerProfile, name);
/*  47 */       field.setAccessible(false);
/*  48 */       entityPlayer.getClass().getDeclaredField("displayName").set(entityPlayer, name);
/*  49 */       entityPlayer.getClass().getDeclaredField("listName").set(entityPlayer, name);
/*     */     }
/*     */     catch (Exception localException) {}
/*     */     
/*  53 */     if (respawn) {
/*  54 */       respawnPlayer(player, players);
/*     */     }
/*  56 */     NametagAPI.setPrefix(player.getName(), "§7");
/*  57 */     NametagAPI.setSuffix(player.getName(), " §7" + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/*  58 */     player.setDisplayName("§7" + player.getName());
/*     */   }
/*     */   
/*     */   public static void removePlayerSkin(Player player) {
/*  62 */     removePlayerSkin(player, true);
/*     */   }
/*     */   
/*     */   public static void removePlayerSkin(Player player, boolean respawn) {
/*  66 */     EntityPlayer entityPlayer = ((CraftPlayer)player).getHandle();
/*  67 */     GameProfile playerProfile = entityPlayer.getProfile();
/*  68 */     playerProfile.getProperties().clear();
/*  69 */     if (respawn) {
/*  70 */       respawnPlayer(player, ((Main)Main.getPlugin(Main.class)).getServer().getOnlinePlayers());
/*     */     }
/*     */   }
/*     */   
/*     */   public static void changePlayerSkin(Player player, String name, UUID uuid) {
/*  75 */     changePlayerSkin(player, name, uuid, true);
/*     */   }
/*     */   
/*     */   public static void changePlayerSkin(Player player, String name, UUID uuid, boolean respawn) {
/*  79 */     EntityPlayer entityPlayer = ((CraftPlayer)player).getHandle();
/*  80 */     GameProfile playerProfile = entityPlayer.getProfile();
/*  81 */     playerProfile.getProperties().clear();
/*     */     try {
/*  83 */       playerProfile.getProperties().put("textures", 
/*  84 */         (Property)CustomPlayerAPI.Textures.get(new GameProfile(uuid, name)));
/*     */     }
/*     */     catch (ExecutionException localExecutionException) {}
/*     */     
/*  88 */     if (respawn) {
/*  89 */       respawnPlayer(player, ((Main)Main.getPlugin(Main.class)).getServer().getOnlinePlayers());
/*     */     }
/*     */   }
/*     */   
/*     */   public void addToTab(Player player, Collection<? extends Player> players) {
/*  94 */     PacketPlayOutPlayerInfo addPlayerInfo = PacketPlayOutPlayerInfo.addPlayer(((CraftPlayer)player).getHandle());
/*  95 */     PacketPlayOutPlayerInfo updatePlayerInfo = 
/*  96 */       PacketPlayOutPlayerInfo.updateDisplayName(((CraftPlayer)player).getHandle());
/*  97 */     for (Player online : players) {
/*  98 */       if (online.canSee(player)) {
/*  99 */         ((CraftPlayer)online).getHandle().playerConnection.sendPacket(addPlayerInfo);
/* 100 */         ((CraftPlayer)online).getHandle().playerConnection.sendPacket(updatePlayerInfo);
/* 101 */         NametagAPI.setPrefix(player.getName(), "§7");
/* 102 */         NametagAPI.setSuffix(player.getName(), " §7" + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 103 */         player.setDisplayName("§7" + player.getName());
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void removeFromTab(Player player, Player[] players) {
/* 109 */     PacketPlayOutPlayerInfo removePlayerInfo = 
/* 110 */       PacketPlayOutPlayerInfo.removePlayer(((CraftPlayer)player).getHandle());
/* 111 */     Player[] arrayOfPlayer; int j = (arrayOfPlayer = players).length; for (int i = 0; i < j; i++) { Player online = arrayOfPlayer[i];
/* 112 */       if (online.canSee(player)) {
/* 113 */         ((CraftPlayer)online).getHandle().playerConnection.sendPacket(removePlayerInfo);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static void respawnPlayer(Player player, Player[] players) {
/* 119 */     EntityPlayer entityPlayer = ((CraftPlayer)player).getHandle();
/* 120 */     PacketPlayOutEntityDestroy destroy = new PacketPlayOutEntityDestroy(new int[] { entityPlayer.getId() });
/* 121 */     PacketPlayOutNamedEntitySpawn spawn = new PacketPlayOutNamedEntitySpawn(entityPlayer);
/* 122 */     PacketPlayOutPlayerInfo addPlayerInfo = PacketPlayOutPlayerInfo.addPlayer(((CraftPlayer)player).getHandle());
/* 123 */     PacketPlayOutEntityMetadata metadata = new PacketPlayOutEntityMetadata(entityPlayer.getId(), 
/* 124 */       entityPlayer.getDataWatcher(), true);
/* 125 */     PacketPlayOutEntityHeadRotation headRotation = new PacketPlayOutEntityHeadRotation(entityPlayer, 
/* 126 */       (byte)MathHelper.d(entityPlayer.getHeadRotation() * 256.0F / 360.0F));
/* 127 */     PacketPlayOutPlayerInfo removePlayerInfo = 
/* 128 */       PacketPlayOutPlayerInfo.removePlayer(((CraftPlayer)player).getHandle());
/* 129 */     Player[] arrayOfPlayer; int j = (arrayOfPlayer = players).length; for (int i = 0; i < j; i++) { Player online = arrayOfPlayer[i];
/* 130 */       if (online.canSee(player)) {
/* 131 */         ((CraftPlayer)online).getHandle().playerConnection.sendPacket(removePlayerInfo);
/* 132 */         ((CraftPlayer)online).getHandle().playerConnection.sendPacket(addPlayerInfo);
/* 133 */         if (online.getUniqueId() != player.getUniqueId()) {
/* 134 */           ((CraftPlayer)online).getHandle().playerConnection.sendPacket(destroy);
/* 135 */           ((CraftPlayer)online).getHandle().playerConnection.sendPacket(spawn);
/* 136 */           ((CraftPlayer)online).getHandle().playerConnection.sendPacket(metadata);
/* 137 */           ((CraftPlayer)online).getHandle().playerConnection.sendPacket(headRotation);
/* 138 */           NametagAPI.setPrefix(player.getName(), "§7");
/* 139 */           NametagAPI.setSuffix(player.getName(), " §7" + ChatColor.GRAY + "[" + Manager.prefix(player) + ChatColor.GRAY + "]");
/* 140 */           player.setDisplayName("§7" + player.getName());
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static boolean validateName(String username) {
/* 147 */     Pattern pattern = Pattern.compile("[a-zA-Z0-9_]{1,16}");
/* 148 */     Matcher matcher = pattern.matcher(username);
/* 149 */     return matcher.matches();
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\fake\FakePlayerUtils.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */