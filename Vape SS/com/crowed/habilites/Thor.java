/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.CooldownAPI;
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.block.Action;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ 
/*    */ public class Thor implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void ThorKit(PlayerInteractEvent e)
/*    */   {
/* 22 */     Player p = e.getPlayer();
/* 23 */     if ((p.getItemInHand().getType() == Material.GOLD_AXE) && (e.getAction() == Action.RIGHT_CLICK_BLOCK) && 
/* 24 */       (KitAPI.getKit(p) == "Thor")) {
/* 25 */       if (CooldownAPI.Cooldown.containsKey(p.getName())) {
/* 26 */         p.sendMessage(ChatColor.GRAY + "O Cooldown do " + ChatColor.GOLD + ChatColor.BOLD + "Thor" + ChatColor.GRAY + " acaba em: " + ChatColor.YELLOW + ChatColor.BOLD + CooldownAPI.Cooldown(p) + "s");
/* 27 */         return;
/*    */       }
/*    */       
/* 30 */       CooldownAPI.addCooldown(p, 6);
/* 31 */       Location loc = p.getTargetBlock(null, 25).getLocation();
/* 32 */       p.getWorld().strikeLightning(loc);
/* 33 */       e.setCancelled(true);
/* 34 */       p.damage(0.0D);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Thor.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */