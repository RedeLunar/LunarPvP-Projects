package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.lunarpvp.api.KitAPI;
import com.lunarpvp.api.WarpsAPI;
import com.lunarpvp.main.Main;
import com.lunarpvp.scoreboard.Updater;


public class aMain extends WarpsAPI implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§bPrecisa ser um Player para usar esse comando");
			return true;
		}
		final Player p = (Player)sender;
		if (args.length == 0) {
		if (KitAPI.getKit(p) != "Nenhum") {
			p.sendMessage("§cVocê ja pegou um kit!");
			return true;
		}
		if (KitAPI.getKit(p) == "Nenhum") {
			segundos.add(p.getDisplayName());
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@SuppressWarnings("deprecation")
				@Override
				public void run() {
					if (segundos.contains(p.getDisplayName())) {
					p.sendMessage("§b§lLunar§f§lPvP: §7Você entrou na warp §eMAIN");
					p.playSound(p.getLocation(), Sound.NOTE_PLING, 1.0F, 1.0F);
					ir(p, "main");
					p.setLevel(0);
					segundos.remove(p.getDisplayName());
					KitAPI.aMain(p);
					Updater.UpdateScore(p);
			        for (PotionEffect effect : p.getActivePotionEffects()) {
 		            p.removePotionEffect(effect.getType());
			        }
					p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 999999999, 1));
					p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 1));
					p.setHealth(20);
					  }
				  }
			}, 2L);
			}
		} else {
			if (args[0].equalsIgnoreCase("set")) {
			    if (p.hasPermission("lunarpvp.set")) {
			    	Set(p, "main");
			    	p.sendMessage("§b§lLunar§f§lPvP: §7Você setou a warp §eMAIN");
			}
		  }
		}
		return false;
	}
 }