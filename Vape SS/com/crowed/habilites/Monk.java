/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.CooldownAPI;
/*    */ import com.crowed.api.KitAPI;
/*    */ import com.crowed.utils.Strings;
/*    */ import java.util.HashMap;
/*    */ import java.util.Random;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.player.PlayerInteractEntityEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ 
/*    */ public class Monk implements org.bukkit.event.Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void monkHabilidade(PlayerInteractEntityEvent e)
/*    */   {
/* 21 */     Player p = e.getPlayer();
/*    */     
/* 23 */     if ((e.getRightClicked() instanceof Player)) {
/* 24 */       Player jogadorClicado = (Player)e.getRightClicked();
/*    */       
/* 26 */       if ((p.getItemInHand().getType() == Material.BLAZE_ROD) && (KitAPI.getKit(p) == "Monk") && (CooldownAPI.Cooldown.containsKey(p.getName()))) {
/* 27 */         e.setCancelled(true);
/* 28 */         p.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.YELLOW + ChatColor.BOLD + "Monk" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(p) + "s");
/* 29 */         return;
/*    */       }
/* 31 */       if ((p.getItemInHand().getType() == Material.BLAZE_ROD) && (KitAPI.getKit(p) == "Monk") && (!CooldownAPI.Cooldown.containsKey(p.getName())))
/*    */       {
/*    */ 
/*    */ 
/* 35 */         int random = new Random().nextInt(jogadorClicado.getInventory().getSize() - 10 + 1 + 10);
/*    */         
/* 37 */         ItemStack ItemSelecionado = jogadorClicado.getInventory().getItem(random);
/* 38 */         ItemStack ItemMudado = jogadorClicado.getItemInHand();
/*    */         
/* 40 */         jogadorClicado.setItemInHand(ItemSelecionado);
/* 41 */         jogadorClicado.getInventory().setItem(random, ItemMudado);
/* 42 */         jogadorClicado.sendMessage(Strings.servidormensagem + ChatColor.GRAY + "Você foi monkado !");
/*    */         
/* 44 */         CooldownAPI.addCooldown(p, 15);
/*    */       }
/* 46 */       return;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Monk.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */