/*    */ package com.crowed.api;
/*    */ 
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Calendar;
/*    */ import java.util.GregorianCalendar;
/*    */ import java.util.TimeZone;
/*    */ 
/*    */ public class HorarioAPI
/*    */ {
/* 10 */   public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
/*    */   
/*    */   public static String getHorario() {
/* 13 */     TimeZone tz = TimeZone.getTimeZone("");
/* 14 */     Calendar calendar = GregorianCalendar.getInstance(tz);
/* 15 */     SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
/* 16 */     return sdf.format(calendar.getTime());
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\api\HorarioAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */