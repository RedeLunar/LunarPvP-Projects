/*    */ package com.crowed.comandos;
/*    */ 
/*    */ import com.crowed.Main;
/*    */ import com.crowed.api.API;
/*    */ import com.crowed.api.KitAPI;
/*    */ import com.crowed.api.WarpsAPI;
/*    */ import com.crowed.events.Proteção;
/*    */ import com.crowed.score.Updater;
/*    */ import com.crowed.utils.Strings;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.potion.PotionEffect;
/*    */ import org.bukkit.potion.PotionEffectType;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Spawn implements CommandExecutor
/*    */ {
/*    */   public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args)
/*    */   {
/* 25 */     final Player p = (Player)Sender;
/* 26 */     if (Cmd.getName().equalsIgnoreCase("spawn"))
/*    */     {
/* 28 */       p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você está sendo " + ChatColor.YELLOW + ChatColor.BOLD + "TELEPORTADO" + ChatColor.GRAY + " para o Spawn!");
/* 29 */       p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 9999, 9999));
/* 30 */       p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 9999, 9999));
/* 31 */       p.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 99999, 99999));
/*    */       
/* 33 */       Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
/*    */         public void run() {
/*    */           Player[] arrayOfPlayer;
/* 36 */           int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) { Player players = arrayOfPlayer[i];
/* 37 */             Updater.UpdateScore(players);
/*    */           }
/* 39 */           API.tirarEfeitos(p);
/* 40 */           API.tirarArmadura(p);
/*    */           
/* 42 */           p.getInventory().clear();
/* 43 */           Proteção.setImortalidade(p, true);
/* 44 */           WarpsAPI.Ir(p, "Spawn");
/* 45 */           API.setWarp(p, "Spawn");
/* 46 */           WarpsAPI.removerFPS();
/* 47 */           p.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você foi " + ChatColor.YELLOW + ChatColor.BOLD + "TELEPORTADO" + ChatColor.GRAY + " com sucesso!");
/* 48 */           API.itensSpawn(p);
/* 49 */           KitAPI.TirarKit(p);
/* 50 */           Updater.UpdateScore(p);
/*    */           
/* 52 */           p.removePotionEffect(PotionEffectType.SLOW);
/* 53 */           p.removePotionEffect(PotionEffectType.BLINDNESS);
/* 54 */           p.removePotionEffect(PotionEffectType.CONFUSION);
/*    */           
/* 56 */           p.setHealth(20.0D);
/* 57 */           p.setMaxHealth(20.0D);
/*    */         }
/*    */         
/* 60 */       }, 60L);
/*    */     }
/* 62 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\comandos\Spawn.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */