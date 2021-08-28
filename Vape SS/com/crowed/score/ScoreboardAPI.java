/*    */ package com.crowed.score;
/*    */ 
/*    */ import com.google.common.base.Splitter;
/*    */ import java.util.AbstractMap.SimpleEntry;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import org.bukkit.scoreboard.Objective;
/*    */ import org.bukkit.scoreboard.Scoreboard;
/*    */ import org.bukkit.scoreboard.Team;
/*    */ 
/*    */ public class ScoreboardAPI
/*    */ {
/*    */   public Scoreboard Scoreboard;
/*    */   public String Titulo;
/*    */   public Map<String, Integer> Scores;
/*    */   public List<Team> Times;
/*    */   public Objective Objetivo;
/*    */   
/*    */   public ScoreboardAPI(String Titulo)
/*    */   {
/* 23 */     this.Scoreboard = org.bukkit.Bukkit.getScoreboardManager().getNewScoreboard();
/* 24 */     this.Titulo = Titulo;
/* 25 */     this.Scores = com.google.common.collect.Maps.newLinkedHashMap();
/* 26 */     this.Times = com.google.common.collect.Lists.newArrayList();
/*    */   }
/*    */   
/*    */   public void adicionarLinha(String Mensagem, Integer Score) {
/* 30 */     com.google.common.base.Preconditions.checkArgument(Mensagem.length() < 500, "Não passe de 500 caracteres!");
/* 31 */     Mensagem = Substituir(Mensagem);
/* 32 */     this.Scores.put(Mensagem, Score);
/*    */   }
/*    */   
/*    */   public String Substituir(String Mensagem) {
/* 36 */     while (this.Scores.containsKey(Mensagem)) {
/* 37 */       Mensagem = Mensagem + "§r";
/*    */     }
/* 39 */     if (Mensagem.length() > 70)
/* 40 */       Mensagem = Mensagem.substring(0, 69);
/* 41 */     return Mensagem;
/*    */   }
/*    */   
/*    */   public Map.Entry<Team, String> criarTimes(String Mensagem)
/*    */   {
/* 46 */     String Resultado = "";
/* 47 */     if (Mensagem.length() <= 16) {
/* 48 */       return new AbstractMap.SimpleEntry(null, Mensagem);
/*    */     }
/* 50 */     Team Time = this.Scoreboard.registerNewTeam("text-" + this.Scoreboard.getTeams().size());
/* 51 */     Iterator MensagemSplit = Splitter.fixedLength(16).split(Mensagem).iterator();
/* 52 */     Time.setPrefix((String)MensagemSplit.next());
/* 53 */     Resultado = (String)MensagemSplit.next();
/*    */     
/* 55 */     if (Mensagem.length() > 32)
/* 56 */       Time.setSuffix((String)MensagemSplit.next());
/* 57 */     this.Times.add(Time);
/* 58 */     return new AbstractMap.SimpleEntry(Time, Resultado);
/*    */   }
/*    */   
/*    */   public void setarScoreboard()
/*    */   {
/* 63 */     this.Objetivo = this.Scoreboard.registerNewObjective("mcodes", "dummy");
/* 64 */     this.Objetivo.setDisplayName(this.Titulo);
/* 65 */     this.Objetivo.setDisplaySlot(org.bukkit.scoreboard.DisplaySlot.SIDEBAR);
/* 66 */     int index = this.Scores.size();
/* 67 */     for (Map.Entry Mensagem : this.Scores.entrySet()) {
/* 68 */       Map.Entry Time = criarTimes((String)Mensagem.getKey());
/* 69 */       Integer Score = 
/* 70 */         Integer.valueOf(Mensagem.getValue() != null ? ((Integer)Mensagem.getValue()).intValue() : index);
/* 71 */       String Jogador = (String)Time.getValue();
/*    */       
/* 73 */       if (Time.getKey() != null)
/* 74 */         ((Team)Time.getKey()).addEntry(Jogador);
/* 75 */       this.Objetivo.getScore(Jogador).setScore(Score.intValue());
/* 76 */       index--;
/*    */     }
/*    */   }
/*    */   
/*    */   public void resetarScoreboard() {
/* 81 */     if (this.Objetivo != null) {
/* 82 */       this.Objetivo.unregister();
/*    */     }
/* 84 */     this.Scores.clear();
/* 85 */     for (Team Times : this.Times)
/* 86 */       Times.unregister();
/* 87 */     this.Times.clear();
/*    */   }
/*    */   
/*    */   public Scoreboard pegarScoreboard() {
/* 91 */     return this.Scoreboard;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\score\ScoreboardAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */