/*     */ package com.crowed.comandos;
/*     */ 
/*     */ import com.crowed.Main;
/*     */ import com.crowed.events.Proteção;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandExecutor;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class Evento
/*     */   implements CommandExecutor
/*     */ {
/*  18 */   public boolean comecou = false;
/*  19 */   public static ArrayList<String> participantes = new ArrayList();
/*  20 */   public boolean evento = false;
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*     */   {
/*  24 */     if (!(sender instanceof Player)) {
/*  25 */       return true;
/*     */     }
/*  27 */     final Player p = (Player)sender;
/*  28 */     if ((p.hasPermission("cmd.evento")) && 
/*  29 */       (cmd.getName().equalsIgnoreCase("evento"))) {
/*  30 */       if (!this.evento) {
/*  31 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "O Evento esta fechado ou não esta ocorrendo.");
/*  32 */         return true;
/*     */       }
/*  34 */       if (participantes.contains(p.getName())) {
/*  35 */         p.sendMessage("§7Você ja esta no evento.");
/*  36 */         return true;
/*     */       }
/*  38 */       if (this.evento) {
/*  39 */         Proteção.setImortalidade(p, true);
/*  40 */         p.sendMessage("§7Você entrou no evento.");
/*  41 */         participantes.add(p.getName());
/*  42 */         return true;
/*     */       }
/*     */     }
/*     */     
/*  46 */     if (args[0].equalsIgnoreCase("iniciar")) {
/*  47 */       this.evento = true;
/*  48 */       Bukkit.broadcastMessage("     " + Strings.servidor);
/*  49 */       Bukkit.broadcastMessage(" ");
/*  50 */       Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento aberto.");
/*  51 */       Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Quer participar? Dê /evento");
/*  52 */       Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/*  53 */       Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Iniciando em: " + ChatColor.GREEN + "3 minutos.");
/*     */       
/*  55 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*     */       {
/*     */         public void run() {
/*  58 */           Bukkit.broadcastMessage("     " + Strings.servidor);
/*  59 */           Bukkit.broadcastMessage(" ");
/*  60 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento aberto.");
/*  61 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Quer participar? Dê /evento");
/*  62 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Participantes: " + ChatColor.GREEN + Evento.participantes.size());
/*  63 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/*  64 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Iniciando em: " + ChatColor.GREEN + "2 minutos.");
/*     */         }
/*     */         
/*  67 */       }, 1200L);
/*     */       
/*  69 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/*  73 */           Bukkit.broadcastMessage("     " + Strings.servidor);
/*  74 */           Bukkit.broadcastMessage(" ");
/*  75 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento aberto.");
/*  76 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Quer participar? Dê /evento");
/*  77 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Participantes: " + ChatColor.GREEN + Evento.participantes.size());
/*  78 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/*  79 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Iniciando em: " + ChatColor.GREEN + "1 minutos.");
/*     */         }
/*     */         
/*  82 */       }, 2400L);
/*     */       
/*  84 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/*  88 */           Bukkit.broadcastMessage("     " + Strings.servidor);
/*  89 */           Bukkit.broadcastMessage(" ");
/*  90 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento aberto.");
/*  91 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Quer participar? Dê /evento");
/*  92 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Participantes: " + ChatColor.GREEN + Evento.participantes.size());
/*  93 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/*  94 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Iniciando em: " + ChatColor.GREEN + "30 segundos.");
/*     */         }
/*     */         
/*  97 */       }, 3000L);
/*     */       
/*  99 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/* 103 */           Bukkit.broadcastMessage("     " + Strings.servidor);
/* 104 */           Bukkit.broadcastMessage(" ");
/* 105 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento aberto.");
/* 106 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Quer participar? Dê /evento");
/* 107 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Participantes: " + ChatColor.GREEN + Evento.participantes.size());
/* 108 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/* 109 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Iniciando em: " + ChatColor.GREEN + "20 segundos.");
/*     */         }
/*     */         
/* 112 */       }, 3200L);
/*     */       
/* 114 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/* 118 */           Bukkit.broadcastMessage("     " + Strings.servidor);
/* 119 */           Bukkit.broadcastMessage(" ");
/* 120 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento aberto.");
/* 121 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Quer participar? Dê /evento");
/* 122 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Participantes: " + ChatColor.GREEN + Evento.participantes.size());
/* 123 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/* 124 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Iniciando em: " + ChatColor.GREEN + "10 segundos.");
/*     */         }
/*     */         
/* 127 */       }, 3400L);
/*     */       
/* 129 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/* 133 */           Bukkit.broadcastMessage("     " + Strings.servidor);
/* 134 */           Bukkit.broadcastMessage(" ");
/* 135 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento aberto.");
/* 136 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Quer participar? Dê /evento");
/* 137 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Participantes: " + ChatColor.GREEN + Evento.participantes.size());
/* 138 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/* 139 */           Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Iniciando em: " + ChatColor.GREEN + "5 segundos.");
/*     */         }
/*     */         
/* 142 */       }, 3500L);
/*     */       
/* 144 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
/*     */       {
/*     */         public void run()
/*     */         {
/* 148 */           if (Evento.participantes.size() >= 2) {
/* 149 */             Bukkit.broadcastMessage("     " + Strings.servidor);
/* 150 */             Bukkit.broadcastMessage(" ");
/* 151 */             Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Evento Iniciado.");
/* 152 */             Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Boa sorte aos participantes.");
/* 153 */             Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Participantes: " + ChatColor.GREEN + Evento.participantes.size());
/* 154 */             Bukkit.broadcastMessage(" " + ChatColor.YELLOW + "Prêmio: " + ChatColor.GREEN + "Receberá no final do evento.");
/* 155 */             Proteção.setImortalidade(p, false);
/* 156 */             Evento.this.evento = false;
/* 157 */             Evento.this.comecou = true;
/*     */           } else {
/* 159 */             Bukkit.broadcastMessage("§cEvento fechado.");
/* 160 */             Bukkit.broadcastMessage("§cMotivo: §eFalta de jogadores.");
/* 161 */             Evento.this.evento = false;
/* 162 */             Evento.this.comecou = false;
/*     */           }
/*     */         }
/* 165 */       }, 3600L);
/*     */     }
/* 167 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Evento.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */