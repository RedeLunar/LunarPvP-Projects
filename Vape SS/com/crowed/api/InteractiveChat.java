/*    */ package com.crowed.api;
/*    */ 
/*    */ import net.minecraft.server.v1_7_R4.ChatHoverable;
/*    */ import net.minecraft.server.v1_7_R4.ChatMessage;
/*    */ import net.minecraft.server.v1_7_R4.ChatModifier;
/*    */ import net.minecraft.server.v1_7_R4.EntityPlayer;
/*    */ import net.minecraft.server.v1_7_R4.EnumHoverAction;
/*    */ import net.minecraft.server.v1_7_R4.IChatBaseComponent;
/*    */ import net.minecraft.server.v1_7_R4.MinecraftServer;
/*    */ import net.minecraft.server.v1_7_R4.PlayerList;
/*    */ 
/*    */ public class InteractiveChat
/*    */ {
/*    */   public static void command(String player, String messageOnChat, String commandOnClick, String onHover)
/*    */   {
/* 16 */     IChatBaseComponent iChatBaseComponent = new ChatMessage(messageOnChat, new Object[0]);
/* 17 */     iChatBaseComponent.setChatModifier(new ChatModifier());
/* 18 */     iChatBaseComponent.getChatModifier().setChatClickable(new net.minecraft.server.v1_7_R4.ChatClickable(net.minecraft.server.v1_7_R4.EnumClickAction.RUN_COMMAND, commandOnClick));
/* 19 */     iChatBaseComponent.getChatModifier().a(new ChatHoverable(EnumHoverAction.SHOW_TEXT, new ChatMessage(onHover, new Object[0])));
/* 20 */     PlayerList playerList = MinecraftServer.getServer().getPlayerList();
/* 21 */     playerList.getPlayer(player).sendMessage(iChatBaseComponent);
/*    */   }
/*    */   
/*    */   public static void link(String player, String messageOnChat, String linkOnClick, String onHover) {
/* 25 */     IChatBaseComponent iChatBaseComponent = new ChatMessage(messageOnChat, new Object[0]);
/* 26 */     iChatBaseComponent.setChatModifier(new ChatModifier());
/* 27 */     iChatBaseComponent.getChatModifier().setChatClickable(new net.minecraft.server.v1_7_R4.ChatClickable(net.minecraft.server.v1_7_R4.EnumClickAction.OPEN_URL, linkOnClick));
/* 28 */     iChatBaseComponent.getChatModifier().a(new ChatHoverable(EnumHoverAction.SHOW_TEXT, new ChatMessage(onHover, new Object[0])));
/* 29 */     PlayerList playerList = MinecraftServer.getServer().getPlayerList();
/* 30 */     playerList.getPlayer(player).sendMessage(iChatBaseComponent);
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\InteractiveChat.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */