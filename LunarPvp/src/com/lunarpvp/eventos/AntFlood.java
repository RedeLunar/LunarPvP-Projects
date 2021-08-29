package com.lunarpvp.eventos;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import com.lunarpvp.main.Main;


public class AntFlood implements Listener
{
    public static HashMap<Player, Long> chat;
    
    static {
        AntFlood.chat = new HashMap<Player, Long>();
    }
    
    public AntFlood(final Main main) {
    }
    
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = false)
    public void aAntiSpam(final AsyncPlayerChatEvent e) {
        final Player p = e.getPlayer();
        if (!AntFlood.chat.containsKey(p)) {
            final int zeitconfig = 2000;
            final long time = System.currentTimeMillis() + zeitconfig;
            if (p.hasPermission("lunarpvp.flodar")) {
                return;
            }
            AntFlood.chat.put(p, time);
        }
        else if (AntFlood.chat.get(p) <= System.currentTimeMillis()) {
            if (p.hasPermission("lunarpvp.flodar")) {
                return;
            }
            final int zeitconfig = 2000;
            final long time = System.currentTimeMillis() + zeitconfig;
            AntFlood.chat.put(p, time);
        }
        else {
            if (AntFlood.chat.get(p) < System.currentTimeMillis() || p.hasPermission("lunarpvp.flodar")) {
                return;
            }
            p.sendMessage("§b§lLunar§f§lPvP: §7Aguarde para digitar §cNOVAMENTE");
            e.setCancelled(true);
        }
    }
}
