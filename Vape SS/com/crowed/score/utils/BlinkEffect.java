/*    */ package com.crowed.score.utils;
/*    */ 
/*    */ public class BlinkEffect
/*    */ {
/*  5 */   private int i = 1;
/*  6 */   private String texto = "§a§lVape§f§lMc";
/*    */   
/*    */ 
/*    */ 
/*    */   public void next()
/*    */   {
/* 12 */     if (this.i == 1) {
/* 13 */       this.texto = "§a§lVape§f§lMc";
/*    */     }
/* 15 */     if (this.i == 2) {
/* 16 */       this.texto = "§b§lVape§f§lMc";
/*    */     }
/* 18 */     if (this.i == 3) {
/* 19 */       this.texto = "§c§lVape§f§lMc";
/*    */     }
/* 21 */     if (this.i == 4) {
/* 22 */       this.texto = "§d§lVape§f§lMc";
/*    */     }
/* 24 */     if (this.i == 5) {
/* 25 */       this.texto = "§e§lVape§f§lMc";
/*    */     }
/* 27 */     if (this.i == 6) {
/* 28 */       this.texto = "§f§lVape§e§lMc";
/*    */     }
/* 30 */     if (this.i == 7) {
/* 31 */       this.texto = "§2§lVape§f§lMc";
/*    */     }
/* 33 */     if (this.i == 8) {
/* 34 */       this.texto = "§3§lVape§f§lMc";
/*    */     }
/* 36 */     if (this.i == 9) {
/* 37 */       this.texto = "§4§lVape§f§lMc";
/*    */     }
/* 39 */     if (this.i == 10) {
/* 40 */       this.texto = "§5§lVape§f§lMc";
/*    */     }
/* 42 */     if (this.i == 11) {
/* 43 */       this.texto = "§5§lVape§f§lMc";
/*    */     }
/* 45 */     if (this.i == 12) {
/* 46 */       this.texto = "§6§lVape§f§lMc";
/*    */     }
/* 48 */     if (this.i == 13) {
/* 49 */       this.texto = "§7§lVape§f§lMc";
/*    */     }
/* 51 */     if (this.i == 14) {
/* 52 */       this.texto = "§8§lVape§f§lMc";
/*    */     }
/* 54 */     if (this.i == 15) {
/* 55 */       this.texto = "§9§lVape§f§lMc";
/*    */     }
/* 57 */     if (this.i == 16) {
/* 58 */       this.texto = "§1§lVape§f§lMc";
/*    */     }
/* 60 */     if (this.i == 17) {
/* 61 */       this.texto = "§e§lVape§k§lMc";
/*    */     }
/* 63 */     if (this.i == 18) {
/* 64 */       this.texto = "§k§lVape§f§lMc";
/*    */     }
/* 66 */     if (this.i == 18) {
/* 67 */       this.texto = "§e§lVape§f§lMc";
/*    */     }
/* 69 */     if (this.i == 19) {
/* 70 */       this.texto = "§e§lVape§f§lMc";
/* 71 */       this.i = 0;
/*    */     }
/* 73 */     this.i += 1;
/*    */   }
/*    */   
/*    */   public String getText()
/*    */   {
/* 78 */     return this.texto;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\score\utils\BlinkEffect.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */