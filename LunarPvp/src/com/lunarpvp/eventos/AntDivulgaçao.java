package com.lunarpvp.eventos;

import org.bukkit.craftbukkit.v1_7_R4.entity.*;

import net.minecraft.server.v1_7_R4.*;

import org.bukkit.event.server.*;
import org.bukkit.event.*;
import org.bukkit.*;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.event.weather.*;
import org.bukkit.event.player.*;
import org.bukkit.event.entity.*;
import org.bukkit.help.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.event.block.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.entity.*;
import org.bukkit.entity.Entity;

import com.lunarpvp.main.Main;

public class AntDivulgaçao implements Listener {
	
	@EventHandler
	public void Drop(ItemSpawnEvent e) {
		e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.SMOKE, 1);
	}
	
	  @EventHandler
	  public void onPlayerColor(SignChangeEvent e)
	  {
	    if (e.getLine(0).contains("&")) {
	      e.setLine(0, e.getLine(0).replace("&", "§"));
	    }
	    if (e.getLine(1).contains("&")) {
	      e.setLine(1, e.getLine(1).replace("&", "§"));
	    }
	    if (e.getLine(2).contains("&")) {
	      e.setLine(2, e.getLine(2).replace("&", "§"));
	    }
	    if (e.getLine(3).contains("&")) {
	      e.setLine(3, e.getLine(3).replace("&", "§"));
	    }
	  }
    
  // @EventHandler
  //  public void onVoidDeath(final PlayerMoveEvent e) {
  //      final Player p = e.getPlayer();
  //      final Location l = p.getLocation();
  //      if (l.getBlockY() <= 0) {
  //         p.setHealth(0);
  //      }
  //  }
    
    
    @EventHandler
    public void onCreeperSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Creeper) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSkeletonSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Skeleton) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSpiderSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Spider) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onWitherSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Wither) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void nuncaChover(WeatherChangeEvent evento)
    {
      evento.setCancelled(true);
    }
    
    @EventHandler
    public void onZombieSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Zombie) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void aoPing(final ServerListPingEvent e) {
        if (Bukkit.hasWhitelist()) {
            e.setMotd("§b§lLunar§f§lPvP: §7Servidor em §c§lMANUTENÇÃO");
        }
    }
    
    @EventHandler
    public void onCheio(final PlayerLoginEvent event) {
        final Player p = event.getPlayer();
        if (event.getResult() == PlayerLoginEvent.Result.KICK_FULL) {
            if (p.hasPermission("lunarpvp.slotextra")) {
                event.setResult(PlayerLoginEvent.Result.ALLOWED);
            }
            else {
                event.setKickMessage("§cDesculpe, o servidor está lotado.");
            }
        }
        else if (event.getResult() == PlayerLoginEvent.Result.KICK_WHITELIST) {
            event.setKickMessage("\n \n §cEstamos em manutenção, para sua melhor jogabilidade, retorne em breve!");
        }
    }
    
    @SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
    public void banAds(final PlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (!p.hasPermission("lunarpvp.sitefalar") 
        				&& (e.getMessage().contains(".net")
        				|| e.getMessage().contains("Entre agora")
        				|| e.getMessage().contains("meu server")
        				|| e.getMessage().contains("(.)")
        				|| e.getMessage().contains(".host")
        				|| e.getMessage().contains(".minesv")
        				|| e.getMessage().contains(".playbr")
        				|| e.getMessage().contains(".cookiehosting")
        				|| e.getMessage().contains(".playmine")
        				|| e.getMessage().contains(".com")
        				|| e.getMessage().contains(".server")
        				|| e.getMessage().contains(".me")
        				|| e.getMessage().contains(".io")
        				|| e.getMessage().contains(".com")
        				|| e.getMessage().contains(".com.br")
        				|| e.getMessage().contains(".pro")
        				|| e.getMessage().contains(".nu")
        				|| e.getMessage().contains(".tk")
        				// Dominios, com virgula.
        				|| e.getMessage().contains("(,)")
        				|| (e.getMessage().contains(",net")
        				|| e.getMessage().contains(",host")
        				|| e.getMessage().contains(",minesv")
        				|| e.getMessage().contains(",playbr")
        				|| e.getMessage().contains(",cookiehosting")
        				|| e.getMessage().contains(",playmine")
        				|| e.getMessage().contains(",com")
        				|| e.getMessage().contains(",server")
        				|| e.getMessage().contains(",me")
        				|| e.getMessage().contains(",io")
        				|| e.getMessage().contains(",com")
        				|| e.getMessage().contains(",com.br")
        				|| e.getMessage().contains(",pro")
        				|| e.getMessage().contains(",nu")
        				|| e.getMessage().contains(",tk")))) {
            e.setCancelled(true);
            p.sendMessage("§cNão divulgue servidores ou sites aqui, você será temporariamente banido.");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "mute " + p.getName() + "[AUTOMUTE] Divulgação de links/servidores");
        }
    }
    
    @SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
    public void banofensa(final PlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (!p.hasPermission("lunarpvp.xingar") 
        				&& (e.getMessage().contains("filho da puta")
        				|| e.getMessage().contains("vadia")
        				|| e.getMessage().contains("sua mãe")
        				|| e.getMessage().contains("sua mae")
        				|| e.getMessage().contains("aql puta")
        				|| e.getMessage().contains("seu lixo")
        				|| e.getMessage().contains("puta"))) {
            e.setCancelled(true);
            p.sendMessage("§cVocê usou alguns argumentos indevidos, contra jogadores(a) por isso, sera mutado temporariamente.");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tempmute " + p.getName() + " 25 m [AutoMute] Uso de argumentos indevidos, contra Player.");
        }
    }
    
    @EventHandler
    public void onSlimeSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Slime) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onGhastSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Ghast) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onPigZombieSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof PigZombie) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onEndermanSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Enderman) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onCaveSpiderSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof CaveSpider) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSheepSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Sheep) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onCowSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Cow) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onChickenSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Chicken) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void onSquidSpawn(final CreatureSpawnEvent e) {
        if (e.getEntity() instanceof Squid) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void clicarBussola(final PlayerInteractEvent e) {
        boolean parar = false;
        if (e.getPlayer().getItemInHand().getType() == Material.COMPASS) {
            for (final Entity entidades : e.getPlayer().getNearbyEntities(100.0, 150.0, 100.0)) {
                if (entidades instanceof Player && e.getPlayer().getLocation().distance(entidades.getLocation()) >= 9.0) {
                    if (entidades.getLocation().getY() > 170.0) {
                        return;
                    }
                    parar = true;
                    e.getPlayer().setCompassTarget(entidades.getLocation());
                    e.getPlayer().sendMessage(" §7» Bússola apontando para o jogador(a): §e" + ((Player)entidades).getName());
                    return;
                }
            }
            if (!parar) {
                e.getPlayer().sendMessage(" §7» Nenhum jogador(a) foi encontrado!");
                e.getPlayer().setCompassTarget(new Location(e.getPlayer().getWorld(), 0.0, 100.0, 0.0));
            }
        }
    }
    
    @EventHandler
    public void onEntityDamageByEntity1(final EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player) {
            final Player d = (Player)e.getDamager();
            if (d.getItemInHand().getType() == Material.DIAMOND_SWORD 
            		|| d.getItemInHand().getType() == Material.WOOD_SWORD 
            		|| d.getItemInHand().getType() == Material.STONE_SWORD 
            		|| d.getItemInHand().getType() == Material.FISHING_ROD 
            		|| d.getItemInHand().getType() == Material.STONE_AXE
            		|| d.getItemInHand().getType() == Material.BOW 
            		|| d.getItemInHand().getType() == Material.IRON_SWORD 
            		|| d.getItemInHand().getType() == Material.DIAMOND_AXE) {
                d.getItemInHand().setDurability((short)0);
            }
        }
    }
    
    @EventHandler
    public void onPickup(final PlayerPickupItemEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void onDrop(final PlayerDropItemEvent e) {
        e.setCancelled(true);
        if (e.getItemDrop().getItemStack().getType() == Material.LEATHER_CHESTPLATE) {
            e.setCancelled(false);
        }
        if (e.getItemDrop().getItemStack().getType() == Material.MUSHROOM_SOUP) {
            e.setCancelled(false);
        }
        if (e.getItemDrop().getItemStack().getType() == Material.RED_MUSHROOM) {
            e.setCancelled(false);
        }
        if (e.getItemDrop().getItemStack().getType() == Material.BROWN_MUSHROOM) {
            e.setCancelled(false);
        }
        if (e.getItemDrop().getItemStack().getType() == Material.BOWL) {
            e.setCancelled(false);
        }
        if (e.getItemDrop().getItemStack().getType() == Material.COMPASS) {
            e.setCancelled(true);
        }
    }
    
    @EventHandler
    public void dropar(final ItemSpawnEvent e) {
        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), (Runnable)new Runnable() {
            @Override
            public void run() {
                e.getEntity().remove();
            }
        }, 80L);
    }
    
    @EventHandler
    public void entityDamagePedra(final EntityDamageByEntityEvent e) {
        if (e.getDamager() instanceof Player && ((Player)e.getDamager()) instanceof Player) {
            final Player p = (Player)e.getDamager();
            if (e.getEntity() instanceof Player && p.getItemInHand().getType() == Material.STONE_SWORD) {
                e.setDamage(e.getDamage() * 0.6);
                return;
            }
            if (p.getItemInHand().getType() == Material.WOOD_SWORD) {
                e.setDamage(e.getDamage() * 0.5);
                return;
            }
            if (p.getItemInHand().getType() == Material.DIAMOND_SWORD) {
                e.setDamage(e.getDamage() * 0.7);
            }
        }
    }
    
    @EventHandler
    public void achivments(final PlayerAchievementAwardedEvent e) {
        e.setCancelled(true);
    }
    
    @EventHandler
    public void nohunger(final FoodLevelChangeEvent event) {
        event.setCancelled(true);
        event.setFoodLevel(20);
    }
    
    @EventHandler(priority = EventPriority.HIGH)
    public void onCreeperExplosion(final EntityExplodeEvent event) {
        event.setCancelled(true);
    }
    
    @EventHandler
    public void onUnknown(final PlayerCommandPreprocessEvent event) {
        if (event.isCancelled()) {
            return;
        }
        final Player p = event.getPlayer();
        final String msg = event.getMessage().split(" ")[0];
        final HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(msg);
        if (topic == null) {
            event.setCancelled(true);
            p.sendMessage("§b§lLunar§f§lPvP: §7Comando §cERRADO");
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm amsg " + p.getName() +  "§4[ERRO] §fComando não listado");
        }
    }
}