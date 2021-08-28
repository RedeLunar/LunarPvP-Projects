/*    */ package com.crowed.api.fake;
/*    */ 
/*    */ import java.util.concurrent.TimeUnit;
/*    */ import net.minecraft.server.v1_7_R4.Entity;
/*    */ import net.minecraft.server.v1_7_R4.EntityHuman;
/*    */ import net.minecraft.server.v1_7_R4.EntityLiving;
/*    */ import net.minecraft.server.v1_7_R4.MinecraftServer;
/*    */ import net.minecraft.server.v1_7_R4.WorldServer;
/*    */ import net.minecraft.util.com.google.common.cache.CacheBuilder;
/*    */ import net.minecraft.util.com.google.common.cache.CacheLoader;
/*    */ import net.minecraft.util.com.google.common.cache.LoadingCache;
/*    */ import net.minecraft.util.com.mojang.authlib.GameProfile;
/*    */ import net.minecraft.util.com.mojang.authlib.minecraft.MinecraftSessionService;
/*    */ import net.minecraft.util.com.mojang.authlib.properties.Property;
/*    */ import net.minecraft.util.com.mojang.authlib.properties.PropertyMap;
/*    */ import org.bukkit.World;
/*    */ import org.bukkit.craftbukkit.v1_7_R4.CraftServer;
/*    */ import org.bukkit.craftbukkit.v1_7_R4.CraftWorld;
/*    */ 
/*    */ public class CustomPlayerAPI
/*    */ {
/* 22 */   public static final LoadingCache<GameProfile, Property> Textures = CacheBuilder.newBuilder()
/* 23 */     .expireAfterWrite(30L, TimeUnit.MINUTES).build(new CacheLoader() {
/*    */     public Property load(GameProfile key) throws Exception {
/* 25 */       return CustomPlayerAPI.loadTextures(key);
/*    */     }
/* 23 */   });
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 28 */   private static MinecraftServer nmsServer = ((CraftServer)org.bukkit.Bukkit.getServer()).getServer();
/*    */   
/*    */   private static final Property loadTextures(GameProfile profile) {
/* 31 */     MinecraftServer.getServer().av().fillProfileProperties(profile, true);
/* 32 */     return (Property)net.minecraft.util.com.google.common.collect.Iterables.getFirst(profile.getProperties().get("textures"), null);
/*    */   }
/*    */   
/*    */   public static MinecraftServer getNmsServer() {
/* 36 */     return nmsServer;
/*    */   }
/*    */   
/*    */   public static WorldServer getNmsWorld(World world) {
/* 40 */     return ((CraftWorld)world).getHandle();
/*    */   }
/*    */   
/*    */   public static void setHeadYaw(Entity en, float yaw) {
/* 44 */     if (!(en instanceof EntityLiving)) {
/* 45 */       return;
/*    */     }
/* 47 */     EntityLiving handle = (EntityLiving)en;
/* 48 */     while (yaw < -180.0F) {
/* 49 */       yaw += 360.0F;
/*    */     }
/* 51 */     while (yaw >= 180.0F) {
/* 52 */       yaw -= 360.0F;
/*    */     }
/* 54 */     handle.aO = yaw;
/* 55 */     if (!(handle instanceof EntityHuman)) {
/* 56 */       handle.aM = yaw;
/*    */     }
/* 58 */     handle.aP = yaw;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\fake\CustomPlayerAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */