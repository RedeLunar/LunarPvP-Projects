/*    */ package com.crowed.bans.events;
/*    */ 
/*    */ import java.util.ArrayList;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.enchantments.Enchantment;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class API
/*    */ {
/* 12 */   public static ArrayList<Player> Online = new ArrayList();
/* 13 */   public static ArrayList<Player> Combate = new ArrayList();
/* 14 */   public static ArrayList<Player> ScoreBoard = new ArrayList();
/* 15 */   public static ArrayList<Player> ModoSilent = new ArrayList();
/* 16 */   public static ArrayList<Player> ModoAdmin = new ArrayList();
/*    */   
/*    */   public static boolean FeastSpawn;
/* 19 */   public static int FeastSpawnTime = 300;
/*    */   
/* 21 */   public static String CMD = "comando.";
/* 22 */   public static String TAG = "api.tag.";
/* 23 */   public static String VERCMDS = "api.ver.cmds";
/* 24 */   public static String ENTRARFULL = "api.entrar.full";
/* 25 */   public static String VERADMINS = "api.ver.admin";
/*    */   
/*    */   public static void sendMsg(CommandSender jogador, String Msg)
/*    */   {
/* 29 */     jogador.sendMessage(Msg);
/*    */   }
/*    */   
/*    */   public static void sendBC(String Msg)
/*    */   {
/* 34 */     Bukkit.broadcastMessage(Msg);
/*    */   }
/*    */   
/*    */   public static void sendSound(Player jogador, Sound som, int time) {
/* 38 */     jogador.playSound(jogador.getLocation(), som, time, time);
/*    */   }
/*    */   
/*    */   public static void sendEnchant(Player jogador, Enchantment encantamento, int level) {
/* 42 */     jogador.getItemInHand().addUnsafeEnchantment(encantamento, level);
/*    */   }
/*    */   
/*    */ 
/*    */   public static void sendStaff(String Msg)
/*    */   {
/*    */     Player[] arrayOfPlayer;
/* 49 */     int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) { Player jogadores = arrayOfPlayer[i];
/* 50 */       if (jogadores.hasPermission("kitpvp.bans")) {
/* 51 */         sendMsg(jogadores, Msg);
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\bans\events\API.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */