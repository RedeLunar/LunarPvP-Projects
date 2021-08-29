package com.lunarpvp.kitdiario;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftLivingEntity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.metadata.FixedMetadataValue;

import com.lunarpvp.main.Main;

import net.minecraft.server.v1_8_R3.EntityLiving;



public class EntregadorSet implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String lb, String[] args) {
		if (s instanceof Player) {
			Player p = (Player) s;
			if (cmd.getName().equalsIgnoreCase("setentregador")) {
				p.sendMessage("§aVocê setou o entregador");
				Villager v = (Villager) p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
				v.setAdult();
				v.setAgeLock(true);
				v.setProfession(Profession.FARMER);
				v.setCustomName("§b§lLunar§f§lPvP §7 - §eKit Diario");
				v.setCustomNameVisible(true);
				v.setMetadata("EntregadorVillager", new FixedMetadataValue(Main.getInstance(), new Object()));
				
				EntityLiving handle = ((CraftLivingEntity) v).getHandle();
				handle.getDataWatcher().watch(15, (byte) 1);

			}
		}
		return true;
	}

}
