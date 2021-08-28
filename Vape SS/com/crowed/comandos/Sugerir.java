/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Arrays;
/*    */ import org.apache.commons.lang.StringUtils;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.Sound;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Sugerir
/*    */   implements CommandExecutor
/*    */ {
/*    */   public ArrayList<String> reported;
/*    */   private Main plugin;
/*    */   
/*    */   public Sugerir(Main plugin)
/*    */   {
/* 26 */     this.reported = new ArrayList();
/* 27 */     this.plugin = plugin;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
/*    */   {
/* 33 */     final Player p = (Player)sender;
/* 34 */     if (!(sender instanceof Player)) {
/* 35 */       sender.sendMessage("§cVoce nao pode usar isso no console");
/* 36 */       return false;
/*    */     }
/* 38 */     if (commandLabel.equalsIgnoreCase("sugerir")) {
/* 39 */       if (args.length >= 2) {
/* 40 */         Player target = p.getServer().getPlayer(args[0]);
/* 41 */         if (target != null) {
/* 42 */           if (this.reported.contains(p.getName())) {
/* 43 */             p.sendMessage("§7Voce ja efetuou uma sugestão, por favor aguarde!");
/* 44 */             return true;
/*    */           }
/* 46 */           String reportMsg = StringUtils.join(Arrays.copyOfRange(args, 1, args.length), " ");
/* 47 */           this.reported.add(p.getName());
/* 48 */           p.sendMessage("§aSua Sugestão sobre §6" + target.getName() + " foi enviado com sucesso. Pelo motivo" + reportMsg + " ");
/*    */           Player[] arrayOfPlayer;
/* 50 */           int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) {
/* 51 */             Player s = arrayOfPlayer[i];
/* 52 */             if (s.hasPermission("ver.report")) {
/* 53 */               s.playSound(s.getLocation(), Sound.LEVEL_UP, 15.0F, 1.0F);
/* 54 */               s.sendMessage("§c");
/* 55 */               s.sendMessage("§c§m--->-----------------------------<---");
/* 56 */               s.sendMessage("§c");
/* 57 */               s.sendMessage("§c             §e§lNOVA SUGESTÃO!§e              ");
/* 58 */               s.sendMessage("§c");
/* 59 */               s.sendMessage("   §ePara: §c" + target.getName());
/* 60 */               s.sendMessage("    §ePensado por: §a" + p.getName());
/* 61 */               s.sendMessage("     §eIdeia: §e" + reportMsg);
/* 62 */               s.sendMessage("§c");
/* 63 */               s.sendMessage("§c§m--->-----------------------------<---");
/* 64 */               s.sendMessage("§c");
/* 65 */               Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
/*    */               {
/*    */                 public void run() {
/* 68 */                   Sugerir.this.reported.remove(p.getName());
/*    */                 }
/* 70 */               }, 300L);
/*    */             }
/*    */           }
/*    */         }
/*    */         else {
/* 75 */           p.sendMessage("§cEste jogador nao esta conectado!");
/*    */         }
/*    */       }
/*    */       else {
/* 79 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /sugerir <nick> <motivo>");
/*    */       }
/*    */     }
/* 82 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Sugerir.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */