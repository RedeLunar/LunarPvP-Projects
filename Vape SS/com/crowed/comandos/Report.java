/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.KitAPI;
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
/*    */ public class Report
/*    */   implements CommandExecutor
/*    */ {
/*    */   public ArrayList<String> reported;
/*    */   private Main plugin;
/*    */   
/*    */   public Report(Main plugin)
/*    */   {
/* 27 */     this.reported = new ArrayList();
/* 28 */     this.plugin = plugin;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
/*    */   {
/* 34 */     final Player p = (Player)sender;
/* 35 */     if (!(sender instanceof Player)) {
/* 36 */       sender.sendMessage("§cVoce nao pode usar isso no console");
/* 37 */       return false;
/*    */     }
/* 39 */     if (commandLabel.equalsIgnoreCase("report")) {
/* 40 */       if (args.length >= 2) {
/* 41 */         Player target = p.getServer().getPlayer(args[0]);
/* 42 */         if (target != null) {
/* 43 */           if (this.reported.contains(p.getName())) {
/* 44 */             p.sendMessage("§7Voce ja efetuou um report, por favor aguarde!");
/* 45 */             return true;
/*    */           }
/* 47 */           String reportMsg = StringUtils.join(Arrays.copyOfRange(args, 1, args.length), " ");
/* 48 */           this.reported.add(p.getName());
/* 49 */           p.sendMessage("§aSeu report sobre §6" + target.getName() + " foi enviado com sucesso. Pelo motivo" + reportMsg + " ");
/*    */           Player[] arrayOfPlayer;
/* 51 */           int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) {
/* 52 */             Player s = arrayOfPlayer[i];
/* 53 */             if (s.hasPermission("ver.report")) {
/* 54 */               s.playSound(s.getLocation(), Sound.LEVEL_UP, 15.0F, 1.0F);
/* 55 */               s.sendMessage("§c");
/* 56 */               s.sendMessage("§c§m--->-----------------------------<---");
/* 57 */               s.sendMessage("§c");
/* 58 */               s.sendMessage("§c             §e§lNOVO REPORT!§e              ");
/* 59 */               s.sendMessage("§c");
/* 60 */               s.sendMessage("   §eAcusado: §c" + target.getName());
/* 61 */               s.sendMessage("    §eReport de: §a" + p.getName());
/* 62 */               s.sendMessage("     §eMotivo: §e" + reportMsg);
/* 63 */               s.sendMessage("      §eKit: §a" + KitAPI.getKit(target));
/* 64 */               s.sendMessage("§c");
/* 65 */               s.sendMessage("§c§m--->-----------------------------<---");
/* 66 */               s.sendMessage("§c");
/* 67 */               Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this.plugin, new Runnable()
/*    */               {
/*    */                 public void run() {
/* 70 */                   Report.this.reported.remove(p.getName());
/*    */                 }
/* 72 */               }, 300L);
/*    */             }
/*    */           }
/*    */         }
/*    */         else {
/* 77 */           p.sendMessage("§cEste jogador nao esta conectado!");
/*    */         }
/*    */       }
/*    */       else {
/* 81 */         p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Use /report <nick> <motivo>");
/*    */       }
/*    */     }
/* 84 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Report.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */