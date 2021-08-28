/*    */ package com.crowed.habilites;
/*    */ 
/*    */ import com.crowed.api.KitAPI;
/*    */ import java.util.ArrayList;
/*    */ import java.util.HashMap;
/*    */ import org.bukkit.Location;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.block.Block;
/*    */ import org.bukkit.block.BlockFace;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.EventPriority;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerInteractEvent;
/*    */ import org.bukkit.event.player.PlayerMoveEvent;
/*    */ import org.bukkit.util.Vector;
/*    */ 
/*    */ public class Kangaroo
/*    */   implements Listener
/*    */ {
/* 21 */   public static HashMap<String, Integer> Kangaroo = new HashMap();
/* 22 */   public static ArrayList<String> F = new ArrayList();
/*    */   
/*    */   @EventHandler(priority=EventPriority.HIGH)
/*    */   public void Clicar(PlayerInteractEvent e) {
/* 26 */     Player p = e.getPlayer();
/* 27 */     if ((KitAPI.getKit(p) == "Kangaroo") && (e.getMaterial() == Material.FIREWORK)) {
/* 28 */       e.setCancelled(true);
/* 29 */       if (p.isSneaking()) {
/* 30 */         if (!F.contains(p.getName())) {
/* 31 */           p.setVelocity(p.getLocation().getDirection().multiply(1.2D));
/* 32 */           p.setVelocity(new Vector(p.getVelocity().getX(), 0.5D, p.getVelocity().getZ()));
/* 33 */           Kangaroo.put(p.getName(), Integer.valueOf(1));
/*    */         }
/* 35 */         else if (((Integer)Kangaroo.get(p.getName())).intValue() != 2) {
/* 36 */           p.setVelocity(p.getLocation().getDirection().multiply(1.2D));
/* 37 */           p.setVelocity(new Vector(p.getVelocity().getX(), 0.5D, p.getVelocity().getZ()));
/* 38 */           Kangaroo.put(p.getName(), Integer.valueOf(2));
/*    */         }
/*    */         
/*    */       }
/* 42 */       else if (!F.contains(p.getName())) {
/* 43 */         p.setVelocity(new Vector(p.getVelocity().getX(), 1.0D, p.getVelocity().getZ()));
/* 44 */         Kangaroo.put(p.getName(), Integer.valueOf(1));
/*    */       }
/* 46 */       else if (((Integer)Kangaroo.get(p.getName())).intValue() != 2) {
/* 47 */         p.setVelocity(new Vector(p.getVelocity().getX(), 1.0D, p.getVelocity().getZ()));
/* 48 */         Kangaroo.put(p.getName(), Integer.valueOf(2));
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   @EventHandler
/*    */   public void andar(PlayerMoveEvent e)
/*    */   {
/* 56 */     Player p = e.getPlayer();
/* 57 */     Block b = p.getLocation().getBlock();
/* 58 */     if (KitAPI.getKit(p) == "Kangaroo") {
/* 59 */       if (b.getRelative(BlockFace.DOWN).getType() == Material.AIR) {
/* 60 */         F.add(p.getName());
/*    */       } else {
/* 62 */         if (b.getType() == Material.AIR) {
/* 63 */           Kangaroo.put(p.getName(), Integer.valueOf(0));
/* 64 */           F.remove(p.getName());
/*    */         }
/* 66 */         if ((b.getRelative(BlockFace.DOWN).getType() != Material.AIR) || (b.getType() != Material.AIR)) {
/* 67 */           Kangaroo.put(p.getName(), Integer.valueOf(0));
/* 68 */           F.remove(p.getName());
/*    */         }
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\habilites\Kangaroo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */