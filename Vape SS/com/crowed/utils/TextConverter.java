/*    */ package com.crowed.utils;
/*    */ 
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class TextConverter
/*    */ {
/*    */   public static String convert(String text)
/*    */   {
/*  9 */     if ((text == null) || (text.length() == 0)) {
/* 10 */       return "\"\"";
/*    */     }
/* 12 */     int len = text.length();
/* 13 */     StringBuilder sb = new StringBuilder(len + 4);
/*    */     
/* 15 */     sb.append('"');
/* 16 */     for (int i = 0; i < len; i++)
/*    */     {
/* 18 */       char c = text.charAt(i);
/* 19 */       switch (c)
/*    */       {
/*    */       case '"': 
/*    */       case '\\': 
/* 23 */         sb.append('\\');
/* 24 */         sb.append(c);
/* 25 */         break;
/*    */       case '/': 
/* 27 */         sb.append('\\');
/* 28 */         sb.append(c);
/* 29 */         break;
/*    */       case '\b': 
/* 31 */         sb.append("\\b");
/* 32 */         break;
/*    */       case '\t': 
/* 34 */         sb.append("\\t");
/* 35 */         break;
/*    */       case '\n': 
/* 37 */         sb.append("\\n");
/* 38 */         break;
/*    */       case '\f': 
/* 40 */         sb.append("\\f");
/* 41 */         break;
/*    */       case '\r': 
/* 43 */         sb.append("\\r");
/* 44 */         break;
/*    */       default: 
/* 46 */         if (c < ' ')
/*    */         {
/* 48 */           String t = "000" + Integer.toHexString(c);
/* 49 */           sb.append("\\u" + t.substring(t.length() - 4));
/*    */         }
/*    */         else
/*    */         {
/* 53 */           sb.append(c);
/*    */         }
/*    */         break;
/*    */       }
/*    */     }
/* 58 */     sb.append('"');
/* 59 */     return sb.toString();
/*    */   }
/*    */   
/*    */   public static String setPlayerName(Player player, String text)
/*    */   {
/* 64 */     return text.replaceAll("(?i)\\{PLAYER\\}", player.getName());
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\utils\TextConverter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */