/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.Random;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.entity.EntityDamageByEntityEvent;
/*    */ import org.bukkit.inventory.ItemStack;
/*    */ import org.bukkit.potion.PotionEffect;
/*    */ import org.bukkit.potion.PotionEffectType;
/*    */ 
/*    */ public class Madman implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void bater(EntityDamageByEntityEvent e)
/*    */   {
/* 19 */     if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player))) {
/* 20 */       Player p = (Player)e.getEntity();
/* 21 */       Player t = (Player)e.getDamager();
/*    */       
/* 23 */       if ((KitAPI.getKit(t) == "Madman") && (t.getItemInHand().getType() == Material.STONE_SWORD) && 
/* 24 */         (new Random().nextInt(100) <= 40)) {
/* 25 */         p.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 200, 3));
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Madman.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */