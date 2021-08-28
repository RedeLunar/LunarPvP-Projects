/*    */ package com.crowed.events;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.AsyncPlayerChatEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ChatFloodEvents
/*    */   implements Listener
/*    */ {
/* 16 */   public static HashMap<Player, Long> chat = new HashMap();
/*    */   
/*    */   @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=false)
/*    */   public void aAntiSpam(AsyncPlayerChatEvent e)
/*    */   {
/* 21 */     Player p = e.getPlayer();
/* 22 */     if (!chat.containsKey(p)) {
/* 23 */       int zeitconfig = 2000;
/* 24 */       long time = System.currentTimeMillis() + zeitconfig;
/* 25 */       if (p.hasPermission("falar.chat")) {
/* 26 */         return;
/*    */       }
/* 28 */       chat.put(p, Long.valueOf(time));
/* 29 */     } else if (((Long)chat.get(p)).longValue() <= System.currentTimeMillis())
/*    */     {
/* 31 */       if (p.hasPermission("falar.chat")) {
/* 32 */         return;
/*    */       }
/* 34 */       int zeitconfig = 2000;
/* 35 */       long time = System.currentTimeMillis() + zeitconfig;
/* 36 */       chat.put(p, Long.valueOf(time));
/*    */     }
/*    */     else {
/* 39 */       if ((((Long)chat.get(p)).longValue() < System.currentTimeMillis()) || (p.hasPermission("falar.chat"))) {
/* 40 */         return;
/*    */       }
/* 42 */       p.sendMessage(ChatColor.RED + "Aguarde um pouco para escrever!");
/* 43 */       e.setCancelled(true);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\events\ChatFloodEvents.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */