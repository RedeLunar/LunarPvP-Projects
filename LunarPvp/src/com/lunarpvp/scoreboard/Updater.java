package com.lunarpvp.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

import com.lunarpvp.api.KitAPI;
import com.lunarpvp.api.TagsAPI;
import com.lunarpvp.eventos.KillsDeathsMoney;
import com.lunarpvp.main.Main;
import com.lunarpvp.managers.Groups;


public class Updater{
	
	public Updater() {
		
	}
	public void run(){
		new BukkitRunnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				Main.bk.next();
				for (Player p : Bukkit.getOnlinePlayers()){
					update(p.getScoreboard());
				}
				
			}
		}.runTaskTimer(Main.instance, 0, 3);
	}
	
	public static void UpdateScore(Player p){
		
	    ScoreboardAPI score = new ScoreboardAPI("§b§lLunar§f§lPvP");
	    score.adicionarLinha("§6    ", Integer.valueOf(18));
	    score.adicionarLinha("    §fGrupo: " + Groups.gettag(p), Integer.valueOf(16));
	    score.adicionarLinha("    §fLiga: §7(§f-§7)", Integer.valueOf(11));
	    score.adicionarLinha("    §fKit: §b " + KitAPI.getKit(p), Integer.valueOf(12));
	    score.adicionarLinha("    §1", Integer.valueOf(15));
	    score.adicionarLinha("    §fMatou: §b" + KillsDeathsMoney.getKills(p), Integer.valueOf(6));
	    score.adicionarLinha("    §fMorreu: §b" + KillsDeathsMoney.getDeaths(p), Integer.valueOf(4));
	    score.adicionarLinha("    §fXp: §b0", Integer.valueOf(9));
	    score.adicionarLinha("    §fCoins: §b0", Integer.valueOf(8));
	    score.adicionarLinha("    §1", Integer.valueOf(7));
	    score.adicionarLinha("    §fKS: §b0", Integer.valueOf(3));
	    score.adicionarLinha("    §1", Integer.valueOf(2));
	    score.adicionarLinha("   ", Integer.valueOf(1));
	    score.setarScoreboard();
		p.setScoreboard(score.pegarScoreboard());
		
	}
	public void update(final Scoreboard score){
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Objective obj = score.getObjective("mcodes");
				obj.setDisplayName(Main.bk.getText());
				
			}
		});
		th.start();
	}
}