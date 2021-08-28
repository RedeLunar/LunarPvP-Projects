/*    */ package com.crowed.events;
/*    */ 
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerQuitEvent;
/*    */ 
/*    */ public class Sair implements Listener
/*    */ {
/*    */   @org.bukkit.event.EventHandler
/*    */   public static void SairDoServidor(PlayerQuitEvent event)
/*    */   {
/* 11 */     event.setQuitMessage(null);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\Sair.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */