package com.lunarpvp.eventos;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatForm implements Listener 
{
    @EventHandler
    public void modificarchat(AsyncPlayerChatEvent evento)
    {
    	Player jogador = evento.getPlayer();
    	
    	{
        	evento.setFormat("§7(§f-§7) §f" + jogador.getDisplayName() +  "§7» §f" + evento.getMessage().replace("&", "§").replace("%", "*").replace("sv lixo", "sou um cocô e tentei ofender o servidor").replace("SV LIXO", "sou um cocô e tentei ofender o servidor").replace("server lixo", "sou um cocô e tentei ofender o servidor").replace("SERVER LIXO", "sou um cocô e tentei ofender o servidor"));
    	}
     
 }
    
}
