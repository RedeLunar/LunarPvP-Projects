package com.lunarpvp.main;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

























import javax.lang.model.element.VariableElement;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;






































































































import com.lunarpvp.api.AntiMoveAPI;
import com.lunarpvp.api.KitAPI;
import com.lunarpvp.api.TagsAPI;
import com.lunarpvp.api.WarpsAPI;
import com.lunarpvp.comandos.Admin;
import com.lunarpvp.comandos.Aplicar;
import com.lunarpvp.comandos.Aviso;
import com.lunarpvp.comandos.Build;
import com.lunarpvp.comandos.ClearChat;
import com.lunarpvp.comandos.ComandoSair;
import com.lunarpvp.comandos.Discord;
import com.lunarpvp.comandos.Fps;
import com.lunarpvp.comandos.Gamemode;
import com.lunarpvp.comandos.Kit;
import com.lunarpvp.comandos.Novidades;
import com.lunarpvp.comandos.Potion;
import com.lunarpvp.comandos.Reiniciar;
import com.lunarpvp.comandos.Report;
import com.lunarpvp.comandos.SetArena;
import com.lunarpvp.comandos.SetarCargo;
import com.lunarpvp.comandos.SortearVip;
import com.lunarpvp.comandos.Spawn;
import com.lunarpvp.comandos.StaffChat;
import com.lunarpvp.comandos.Tag;
import com.lunarpvp.comandos.Tell;
import com.lunarpvp.comandos.Tp;
import com.lunarpvp.comandos.Youtuber;
import com.lunarpvp.comandos.aMain;
import com.lunarpvp.eventos.AntDivulgaçao;
import com.lunarpvp.eventos.AntFlood;
import com.lunarpvp.eventos.BloquearComandos;
import com.lunarpvp.eventos.ChatForm;
import com.lunarpvp.eventos.Entrar;
import com.lunarpvp.eventos.Geral;
import com.lunarpvp.eventos.KillsDeathsMoney;
import com.lunarpvp.eventos.MatarMorrer;
import com.lunarpvp.eventos.Motd;
import com.lunarpvp.eventos.Nerfar;
import com.lunarpvp.eventos.QuebrarItem;
import com.lunarpvp.eventos.Respawnar;
import com.lunarpvp.eventos.Sair;
import com.lunarpvp.eventos.TomarSopa;
import com.lunarpvp.jump.Ferro;
import com.lunarpvp.jump.Redstone;
import com.lunarpvp.kitdiario.Entregador;
import com.lunarpvp.kitdiario.EntregadorSet;
import com.lunarpvp.kits.Boxer;
import com.lunarpvp.kits.BurstMaster;
import com.lunarpvp.kits.Camel;
import com.lunarpvp.kits.Deshfire;
import com.lunarpvp.kits.Deshviper;
import com.lunarpvp.kits.Fisherman;
import com.lunarpvp.kits.Forcefield;
import com.lunarpvp.kits.Hulk;
import com.lunarpvp.kits.Kangaroo;
import com.lunarpvp.kits.Madman;
import com.lunarpvp.kits.Gladiator;
import com.lunarpvp.kits.Ninja;
import com.lunarpvp.kits.Phantom;
import com.lunarpvp.kits.Poseidon;
import com.lunarpvp.kits.Reaper;
import com.lunarpvp.kits.Ryu;
import com.lunarpvp.kits.Seya;
import com.lunarpvp.kits.Snail;
import com.lunarpvp.kits.Sonic;
import com.lunarpvp.kits.Specialist;
import com.lunarpvp.kits.Stomper;
import com.lunarpvp.kits.TimeLord;
import com.lunarpvp.kits.Titan;
import com.lunarpvp.kits.Turtle;
import com.lunarpvp.kits.Urgal;
import com.lunarpvp.kits.Viking;
import com.lunarpvp.kits.Viper;
import com.lunarpvp.login.Comandos;
import com.lunarpvp.login.JoinLogin;
import com.lunarpvp.login.Variaveis;
import com.lunarpvp.menus.MenuDiario;
import com.lunarpvp.menus.MenuKit;
import com.lunarpvp.menus.MenuLoja;
import com.lunarpvp.menus.MenuWarp;
import com.lunarpvp.menus.MenuWarp2;
import com.lunarpvp.placas.Sopa;
import com.lunarpvp.scoreboard.BlinkEffect;
import com.lunarpvp.scoreboard.Updater;

public class Main extends JavaPlugin{
	
	
	  public static Updater up = new Updater();
	   public static BlinkEffect bk = new BlinkEffect();
	   public static Main instance;
       public static Plugin plugin;

   	public File stats1;
   	public YamlConfiguration stats;
   	public File warps1;
   	public YamlConfiguration warps;
   	public File loja1;
   	public YamlConfiguration loja;
   	public File arenas1;
   	public YamlConfiguration arenas;
	  
  public static Main getInstance() { return instance; }
  
   public static Plugin getPlugin()
   {
     return plugin;
  }
		
	public void onEnable() {
		Variaveis.m = this;
		saveConfig();
		File stats = new File(getDataFolder(), "stats.yml");
		if (!stats.exists())
			saveResource("stats.yml", false);
		stats1 = new File(getDataFolder(), "stats.yml");
		this.stats = YamlConfiguration.loadConfiguration(stats1);
		File warps = new File(getDataFolder(), "warps.yml");
		if (!warps.exists())
			saveResource("warps.yml", false);
		warps1 = new File(getDataFolder(), "warps.yml");
		this.warps = YamlConfiguration.loadConfiguration(warps1);
		File loja = new File(getDataFolder(), "loja.yml");
		if (!loja.exists())
			saveResource("loja.yml", false);
		loja1 = new File(getDataFolder(), "loja.yml");
		this.loja = YamlConfiguration.loadConfiguration(loja1);
		this.warps = YamlConfiguration.loadConfiguration(warps1);
		File arenas = new File(getDataFolder(), "arenas.yml");
		if (!arenas.exists())
			saveResource("arenas.yml", false);
		arenas1 = new File(getDataFolder(), "arenas.yml");
		this.arenas = YamlConfiguration.loadConfiguration(arenas1);
		save();
		
	    plugin = this;
	    instance = this;
		instance = this;
	
		Bukkit.getConsoleSender().sendMessage("§fPlugin §bLUNARPVP §fativado!");
		Comandos();
		Eventos();
		
	}

	void Comandos() {
		getCommand("novidades").setExecutor(new Novidades());
		getCommand("discord").setExecutor(new Discord());
		getCommand("aviso").setExecutor(new Aviso());
     	getCommand("kit").setExecutor(new Kit());
     	getCommand("kits").setExecutor(new MenuKit());
		getCommand("aplicar").setExecutor(new Aplicar());
		getCommand("setarena").setExecutor(new SetArena());
		getCommand("gm").setExecutor(new Gamemode());
		getCommand("spawn").setExecutor(new Spawn());
		getCommand("reiniciar").setExecutor(new Reiniciar());
		getCommand("tp").setExecutor(new Tp());
		getCommand("tphere").setExecutor(new Tp());
		getCommand("cc").setExecutor(new ClearChat());
		getCommand("tag").setExecutor(new Tag());
		getCommand("lojakits").setExecutor(new MenuLoja());
		getCommand("warps").setExecutor(new MenuWarp());
		getCommand("registrar").setExecutor(new Comandos());
		getCommand("potion").setExecutor(new Potion());
		getCommand("logar").setExecutor(new Comandos());
		getCommand("trocarsenha").setExecutor(new Comandos());
		getCommand("fps").setExecutor(new Fps());
		getCommand("report").setExecutor(new Report(instance));
		getCommand("youtuber").setExecutor(new Youtuber());
		getCommand("admin").setExecutor(new Admin());
		getCommand("setarcargo").setExecutor(new SetarCargo());
		getCommand("setentregador").setExecutor(new EntregadorSet());
		getCommand("build").setExecutor(new Build());
		getCommand("sair").setExecutor(new ComandoSair());
		getCommand("main").setExecutor(new aMain());
		getCommand("kitdiario").setExecutor(new MenuDiario());
		getCommand("warps2").setExecutor(new MenuWarp2());
		getCommand("sortearvip").setExecutor(new SortearVip());
		getCommand("sc").setExecutor(new StaffChat());
		getCommand("tell").setExecutor(new Tell());
	}
	
	void Eventos() {
		PluginManager eventos = Bukkit.getPluginManager();
		eventos.registerEvents(new Entrar(), this);
		eventos.registerEvents(new JoinLogin(), this);
		eventos.registerEvents(new Sair(), this);
		eventos.registerEvents(new Geral(), this);
		eventos.registerEvents(new AntiMoveAPI(), this);
		eventos.registerEvents(new MenuDiario(), this);
		eventos.registerEvents(new Entregador(), this);
		eventos.registerEvents(new BloquearComandos(), this);
		eventos.registerEvents(new AntDivulgaçao(), this);
		eventos.registerEvents(new AntFlood(instance), this);
		eventos.registerEvents(new BloquearComandos(), this);
		eventos.registerEvents(new Build(), this);
		eventos.registerEvents(new Sopa(), this);
		eventos.registerEvents(new Motd(), this);
		eventos.registerEvents(new MenuLoja(), this);
		eventos.registerEvents(new MenuWarp(), this);
		eventos.registerEvents(new WarpsAPI(), this);
		eventos.registerEvents(new Ferro(instance), this);
		eventos.registerEvents(new Redstone(instance), this);
		eventos.registerEvents(new ChatForm(), this);
		eventos.registerEvents(new MenuKit(), this);
		eventos.registerEvents(new TagsAPI(), this);
		eventos.registerEvents(new MatarMorrer(), this);
		eventos.registerEvents(new QuebrarItem(), this);
		eventos.registerEvents(new TomarSopa(), this);
		eventos.registerEvents(new Nerfar(), this);
		eventos.registerEvents(new Respawnar(), this);
		eventos.registerEvents(new Kangaroo(), this);
		eventos.registerEvents(new Gladiator(), this);
		eventos.registerEvents(new Madman(), this);
		eventos.registerEvents(new Deshviper(), this);
		eventos.registerEvents(new Deshfire(), this);
		eventos.registerEvents(new Hulk(), this);
		eventos.registerEvents(new Ninja(), this);
		eventos.registerEvents(new Camel(), this);
		eventos.registerEvents(new BurstMaster(), this);
		eventos.registerEvents(new Forcefield(), this);
		eventos.registerEvents(new Boxer(), this);
		eventos.registerEvents(new Fisherman(), this);
		eventos.registerEvents(new Phantom(), this);
		eventos.registerEvents(new Poseidon(), this);
		eventos.registerEvents(new Reaper(), this);
		eventos.registerEvents(new Ryu(), this);
		eventos.registerEvents(new Seya(), this);
		eventos.registerEvents(new Snail(), this);
		eventos.registerEvents(new Sonic(), this);
		eventos.registerEvents(new Specialist(), this);
		eventos.registerEvents(new Stomper(), this);
		eventos.registerEvents(new TimeLord(), this);
		eventos.registerEvents(new Titan(), this);
		eventos.registerEvents(new Turtle(), this);
		eventos.registerEvents(new Urgal(), this);
		eventos.registerEvents(new Viking(), this);
		eventos.registerEvents(new Viper(), this);
	}
	public void save() {
		try {
			this.stats.save(this.stats1);
			this.warps.save(this.warps1);
			this.loja.save(this.loja1);
			this.arenas.save(this.arenas1);
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
	public static void Segundos1() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getInstance(), new Runnable() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				for (Player s : Bukkit.getOnlinePlayers()) {
					if (KitAPI.KitDelay.containsKey(s.getName())) {
						KitAPI.KitDelay.put(s.getName(), KitAPI.KitDelay.get(s.getName()) - 1);
					}
				}
				
			}
		}, 0, 20);
	}
}





