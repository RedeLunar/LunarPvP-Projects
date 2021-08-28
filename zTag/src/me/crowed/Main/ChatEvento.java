package me.crowed.Main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvento implements Listener 
{
    @EventHandler
    public void modificarchat(AsyncPlayerChatEvent evento)
    {
    	Player jogador = evento.getPlayer();
    	
    	if (jogador.hasPermission("chat.falarcolorido"))
    	{
        	evento.setFormat(jogador.getDisplayName() +  " §7» §f" + evento.getMessage().replace("&", "§").replace("%", " Porcento(s)"));
    	} else {
    		evento.setFormat(jogador.getDisplayName() +  " §7» " + evento.getMessage());
    	}
     
 }
    
}