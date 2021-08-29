package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;






import com.lunarpvp.api.KitAPI;
import com.lunarpvp.api.WarpsAPI;
import com.lunarpvp.main.Main;
import com.lunarpvp.scoreboard.Updater;

public class Spawn extends WarpsAPI implements CommandExecutor {
	
	public static ItemStack kits;
	public static ItemMeta kitsmeta;
	public static ItemStack warps;
	public static ItemMeta warpsmeta;
	public static ItemStack click;
	public static ItemMeta clickmeta;
	public static ItemStack parkour;
	public static ItemMeta parkourmeta;
	public static ItemStack loja;
	public static ItemMeta lojameta;

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§bPrecisa ser um Player para usar esse comando");
			return true;
		}
		final Player p = (Player)sender;
		if (args.length == 0) {
			segundos.add(p.getName());
			p.sendMessage("§b§lLunar§f§lPvP: §7Não se mova enquanto é teleportado!");
			p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 500, 100));
			p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 500, 100));
			Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
				@Override
				public void run() {
					if (segundos.contains(p.getName())) {
					p.sendMessage("  ");	
					p.sendMessage("§b§lLunar§f§lPvP: §7Você foi teleportado até o §aSPAWN");
					p.sendMessage("  ");	
					p.getInventory().clear();
					ir(p, "spawn");
					p.setLevel(0);
					segundos.remove(p.getName());
		            KitAPI.KitDelay.remove(p.getName());
					KitAPI.RemoveKit(p);
					p.getInventory().clear();
					p.getInventory().setHelmet(new ItemStack(Material.AIR));
					p.getInventory().setChestplate(new ItemStack(Material.AIR));
					p.getInventory().setLeggings(new ItemStack(Material.AIR));
					p.getInventory().setBoots(new ItemStack(Material.AIR));
					Updater.UpdateScore(p);
			        for (PotionEffect effect : p.getActivePotionEffects()) {
 		                 p.removePotionEffect(effect.getType());
					p.setHealth(20);
				    kits = new ItemStack(Material.ENDER_CHEST);
				    kitsmeta = kits.getItemMeta();
				    kitsmeta.setDisplayName("§6Kits");
				    kits.setItemMeta(kitsmeta);
				    
				    warps = new ItemStack(Material.BOOK);
				    warpsmeta = warps.getItemMeta();
				    warpsmeta.setDisplayName("§6Warps");
				    warps.setItemMeta(warpsmeta);
				    
				    loja = new ItemStack(Material.DIAMOND);
				    lojameta = loja.getItemMeta();
				    lojameta.setDisplayName("§6Loja");
				    loja.setItemMeta(lojameta);
				    
				    
				    p.getInventory().setItem(4, kits);
				    p.getInventory().setItem(2, warps);
				    p.getInventory().setItem(6, loja);

					}
					}
				}
			}, 5*20);
		}else {
			if (args[0].equalsIgnoreCase("set")) {
			    if (p.hasPermission("set.arena")) {
			    	Set(p, "spawn");
			    	p.sendMessage("§b§lLunar§f§lPvP: §7Você setou o §aSPAWN");
			}
		}
	 }
		return false;
	}
}