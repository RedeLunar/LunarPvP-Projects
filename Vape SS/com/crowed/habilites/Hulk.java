/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.CooldownAPI;
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEntityEvent;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ public class Hulk implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void hulk(PlayerInteractEntityEvent event)
/*    */   {
/* 22 */     if (!(event.getRightClicked() instanceof Player)) {
/* 23 */       return;
/*    */     }
/* 25 */     Player p = event.getPlayer();
/* 26 */     Player r = (Player)event.getRightClicked();
/* 27 */     if ((p.getItemInHand().getType() == Material.AIR) && (KitAPI.getKit(p) == "Hulk") && (!CooldownAPI.Cooldown.containsKey(p.getName())) && (p.getPassenger() == null) && (r.getPassenger() == null)) {
/* 28 */       p.setPassenger(r);
/* 29 */       CooldownAPI.addCooldown(p, 15);
/* 30 */       return;
/*    */     }
/* 32 */     if ((p.getItemInHand().getType() == Material.AIR) && (KitAPI.getKit(p) == "Hulk") && (CooldownAPI.Cooldown.containsKey(p.getName())) && (p.getPassenger() == null) && (r.getPassenger() == null))
/* 33 */       p.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.YELLOW + ChatColor.BOLD + "Hulk" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(p) + "s");
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public static void playerInteract(PlayerInteractEvent event) {
/* 38 */     if (!event.getAction().equals(Action.LEFT_CLICK_AIR)) {
/* 39 */       return;
/*    */     }
/* 41 */     Player player = event.getPlayer();
/* 42 */     if ((player.getPassenger() == null) || (!(player.getPassenger() instanceof Player))) {
/* 43 */       return;
/*    */     }
/* 45 */     Player pass = (Player)player.getPassenger();
/* 46 */     player.eject();
/* 47 */     pass.damage(0.0D, player);
/* 48 */     pass.setVelocity(new Vector(pass.getVelocity().getX(), 1.0D, pass.getVelocity().getZ()));
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Hulk.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */