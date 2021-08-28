package me.crowed.Comandos;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import ca.wacos.nametagedit.NametagAPI;


	public class Tags
	  implements Listener, CommandExecutor
	{
      public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
  		if (!(sender instanceof Player)) {
			sender.sendMessage("§c§l(!) §cSomente jogadores podem executar este comando.");
			return true;
  		}
        if (cmd.getName().equalsIgnoreCase("tag"))
        {
          Player p = (Player)sender;
          if (args.length == 0)
          {
            p.sendMessage("§7[ §bzTags §7] - §cUtilize /tag nome.");
            		
            return false;
          }
	      if (args[0].equalsIgnoreCase("normal"))
	      {
	        if (p.hasPermission("tag.normal"))
	        {
	          p.sendMessage("Voce selecionou a tag: §7NORMAL");
	          p.setDisplayName("§7" + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§7" + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§7");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      if (args[0].equalsIgnoreCase("gcdetector"))
	      {
	        if (p.hasPermission("tag.gcdetector"))
	        {
	          p.sendMessage("Voce selecionou a tag: §5§lGCDETECTOR");
	          p.setDisplayName("§5§lGCDETECTOR§5 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§5§lGCDETECTOR§5 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§5§lGCDETECTOR§5 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      if (args[0].equalsIgnoreCase("vip"))
	      {
	        if (p.hasPermission("tag.vip"))
	        {
	          p.sendMessage("Voce selecionou a tag: §a§l[VIP]");
	          p.setDisplayName("§a§l[VIP]§a " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§a§l[VIP]§a " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§a§l[VIP] ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      if (args[0].equalsIgnoreCase("miniyt"))
	      {
	        if (p.hasPermission("tag.miniyt"))
	        {
	          p.sendMessage("Voce selecionou a tag: §9§lMINIYOUTUBER");
	          p.setDisplayName("§9§lMINIYOUTUBER§9 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§9§lMINIYOUTUBER§9 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§9§lMINIYOUTUBER§9 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      if (args[0].equalsIgnoreCase("developer"))
	      {
	        if (p.hasPermission("tag.developer"))
	        {
	          p.sendMessage("Voce selecionou a tag: §4§lDEVELOPER");
	          p.setDisplayName("§4§lDEVELOPER " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§4§lDEVELOPER " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§4§lDEVELOPER§4 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      if (args[0].equalsIgnoreCase("diretor"))
	      {
	        if (p.hasPermission("tag.diretor"))
	        {
	          p.sendMessage("Voce selecionou a tag: §4§l[DIRETOR]");
	          p.setDisplayName("§4§l[DIRETOR]§4 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§4§l[DIRETOR]§4 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§4§l[DIRETOR]§4 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("youtuber"))
	      {
	        if (p.hasPermission("tag.youtuber"))
	        {
	          p.sendMessage("Voce selecionou a tag: §b§lYOUTUBER");
	          p.setDisplayName("§b§lYOUTUBER§b " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§b§lYOUTUBER§b " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§b§lYOUTUBER§b ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("youtuber+"))
	      {
	        if (p.hasPermission("tag.youtuber+"))
	        {
	          p.sendMessage("Voce selecionou a tag: §3§lYOUTUBER+");
	          p.setDisplayName("§3§lYOUTUBER+§3 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§3§lYOUTUBER+§3 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§3§lYOUTUBER+§3 ");	          		
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("ajudante"))
	      {
	        if (p.hasPermission("tag.ajudante"))
	        {
	          p.sendMessage("Voce selecionou a tag: §e§lAJUDANTE");
	          p.setDisplayName("§e§lAJUDANTE§e " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§e§lAJUDANTE§e " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§e§lAJUDANTE§e ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("builder"))
	      {
	        if (p.hasPermission("tag.builder"))
	        {
	          p.sendMessage("Voce selecionou a tag: §2§lBUILDER");
	          p.setDisplayName("§2§lBUILDER§2 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§2§lBUILDER§2 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§2§lBUILDER§2 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("admin+"))
	      {
	        if (p.hasPermission("tag.admin+"))
	        {
	          p.sendMessage("Voce selecionou a tag: §c§lADMIN+");
	          p.setDisplayName("§c§lADMIN+§c " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§c§lADMIN+§c " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§c§lADMIN+§c ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }	  
	      else if (args[0].equalsIgnoreCase("mod"))
	      {
	        if (p.hasPermission("tag.mod"))
	        {
	          p.sendMessage("Voce selecionou a tag: §2§lMODERADOR");
	          p.setDisplayName("§2§lMODERADOR§2 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§2§lMODERADOR§2 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§2§lMODERADOR§2 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("mod+"))
	      {
	        if (p.hasPermission("tag.mod+"))
	        {
	          p.sendMessage("Voce selecionou a tag: §2§lMODERADOR+");
	          p.setDisplayName("§2§lMODERADOR+§5 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§2§lMODERADOR+§5 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§2§lMODERADOR+§5 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("admin"))
	      {
	        if (p.hasPermission("tag.admin"))
	        {
	          p.sendMessage("Voce selecionou a tag: §c§lADMIN");
	          p.setDisplayName("§c§lADMIN§c " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§c§lADMIN§c " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§c§lADMIN§c ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("gerente"))
	      {
	        if (p.hasPermission("tag.gerente"))
	        {
	          p.sendMessage("Voce selecionou a tag: §c§lGERENTE");
	          p.setDisplayName("§c§lGERENTE§c " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§c§lGERENTE§c " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§c§lGERENTE§c ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("thunder"))
	      {
	        if (p.hasPermission("tag.thunder"))
	        {
	          p.sendMessage("Voce selecionou a tag: §6§lTHUNDER");
	          p.setDisplayName("§6§lTHUNDER§6 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§6§lTHUNDER§6 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§6§lTHUNDER§6 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      else if (args[0].equalsIgnoreCase("dono"))
	      {
	        if (p.hasPermission("tag.dono"))
	        {
	          p.sendMessage("Voce selecionou a tag: §4§lDONO");
	          p.setDisplayName("§4§lDONO§4 " + p.getName() + ChatColor.WHITE);
	          p.setPlayerListName("§4§lDONO§4 " + p.getName() + ChatColor.WHITE);
	          NametagAPI.setPrefix(p.getName(), "§4§lDONO§4 ");
	        }
	        else
	        {
	          p.sendMessage("§c§l(!) §cVoce nao possui permissao.");
	        }
	      }
	      return false;
	  
	  }
		return false;
	}
  }



    
 
    
 
	


