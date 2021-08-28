package com.crowed;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.crowed.api.API;
import com.crowed.api.StatsManager;
import com.crowed.api.TabAPI;
import com.crowed.api.WarpsAPI;
import com.crowed.authme.Logar;
import com.crowed.authme.Login;
import com.crowed.authme.Register;
import com.crowed.bans.Ban;
import com.crowed.bans.IPBan;
import com.crowed.bans.Kick;
import com.crowed.bans.Mute;
import com.crowed.bans.Unban;
import com.crowed.bans.events.Config;
import com.crowed.bans.events.Eventos;
import com.crowed.comandos.Account;
import com.crowed.comandos.Admin;
import com.crowed.comandos.Aplicar;
import com.crowed.comandos.Arena;
import com.crowed.comandos.Bc;
import com.crowed.comandos.Build;
import com.crowed.comandos.Chat;
import com.crowed.comandos.ClickTest;
import com.crowed.comandos.Conectado;
import com.crowed.comandos.Dano;
import com.crowed.comandos.Desabilitar;
import com.crowed.comandos.Evento;
import com.crowed.comandos.Fake;
import com.crowed.comandos.Gamemode;
import com.crowed.comandos.GroupSet;
import com.crowed.comandos.Habilitar;
import com.crowed.comandos.Kit;
import com.crowed.comandos.Manutençao;
import com.crowed.comandos.Ping;
import com.crowed.comandos.PvP;
import com.crowed.comandos.Rank;
import com.crowed.comandos.Report;
import com.crowed.comandos.SKit;
import com.crowed.comandos.Sc;
import com.crowed.comandos.SetEvento;
import com.crowed.comandos.SetRank;
import com.crowed.comandos.SetWarp;
import com.crowed.comandos.Spawn;
import com.crowed.comandos.Tag;
import com.crowed.comandos.Tell;
import com.crowed.comandos.Tp;
import com.crowed.comandos.Warp;
import com.crowed.comandos.Youtuber;
import com.crowed.configs.ArenaConfig;
import com.crowed.configs.AuthConfig;
import com.crowed.configs.EventoConfig;
import com.crowed.configs.WarpsConfig;
import com.crowed.events.ChatFloodEvents;
import com.crowed.events.DanoEvents;
import com.crowed.events.DeathEvents;
import com.crowed.events.DropEvents;
import com.crowed.events.Entrar;
import com.crowed.events.EventoAuthEvents;
import com.crowed.events.Principais;
import com.crowed.events.Proteção;
import com.crowed.events.Respawn;
import com.crowed.events.Sair;
import com.crowed.habilites.Ajnin;
import com.crowed.habilites.Anchor;
import com.crowed.habilites.Boxer;
import com.crowed.habilites.Critical;
import com.crowed.habilites.Fisherman;
import com.crowed.habilites.Gladiator;
import com.crowed.habilites.Grappler;
import com.crowed.habilites.Hulk;
import com.crowed.habilites.Kangaroo;
import com.crowed.habilites.Madman;
import com.crowed.habilites.Magma;
import com.crowed.habilites.Monk;
import com.crowed.habilites.Ninja;
import com.crowed.habilites.Phantom;
import com.crowed.habilites.Snail;
import com.crowed.habilites.Specialist;
import com.crowed.habilites.Stomper;
import com.crowed.habilites.Strong;
import com.crowed.habilites.Sumo;
import com.crowed.habilites.Switcher;
import com.crowed.habilites.Thor;
import com.crowed.habilites.Viking;
import com.crowed.habilites.Viper;
import com.crowed.jump.Diamante;
import com.crowed.jump.Esmeralda;
import com.crowed.jump.Ferro;
import com.crowed.jump.Redstone;
import com.crowed.menus.IntercanbioMenus;
import com.crowed.menus.Menus;
import com.crowed.score.Updater;
import com.crowed.score.utils.BlinkEffect;
import com.crowed.utils.Challenge;
import com.crowed.utils.FpsEnum;
import com.crowed.utils.Recraft;
import com.crowed.utils.Sopas;
import com.crowed.utils.Strings;

public class Main extends JavaPlugin {
	
	public static ArrayList<String> login = new ArrayList<>();
	
	public static FpsEnum estado;
	public static Updater up = new Updater();
	public static BlinkEffect bk = new BlinkEffect();
	
	public static Main instance;
	public static Main getInstance() {
		return instance;
	}
	public static Plugin plugin;
	public static Plugin getPlugin() {
		return plugin;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable() {
		instance = this;
		plugin = this;
		saveDefaultConfig();
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "O Servidor foi iniciado corretamente!");
		Eventos();
		Comandos();
		EventosKits();
		LoadEventosExtras();
		up.run();
		PvP.pvp = true;
		Dano.Dano = true;
		for (Player player : Bukkit.getOnlinePlayers()) {
			player.kickPlayer(ChatColor.DARK_RED + "" + ChatColor.BOLD + "REINCIANDO" + "\n" + "\n" + ChatColor.GRAY + "            Estamos reiniciando para melhorar sua jogabilidade" + "\n" + ChatColor.GRAY + "O Servidor se encontra em Beta " + "\n" + "Bugs? PorFavor nos informen pelo skype: aiCrowedCodes" + "\n" +ChatColor.GRAY + "Mais informaçoes em nosso site: §nem dev");
		}
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
		       public void run()
		       {
		         String[] msg = {Strings.servidormensagem + API.mensagem1,
		        		 Strings.servidormensagem + API.mensagem2,
		        		 Strings.servidormensagem + API.mensagem3,
		        		 Strings.servidormensagem + API.mensagem4,
		        		 Strings.servidormensagem + API.mensagem5};
		         
		         Bukkit.getServer().broadcastMessage(msg[new java.util.Random().nextInt(msg.length)]);
		       }
			     }, 40L, 1900L);
		for (World world : Bukkit.getServer().getWorlds()) {
			world.setGameRuleValue("doDaylightCycle", "false");
		}
		}
	
	@Override
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "O Servidor foi desligado corretamente !");
	}
	
	void Eventos() {
		Bukkit.getPluginManager().registerEvents(new Challenge(), this);
		Bukkit.getPluginManager().registerEvents(new TabAPI(), this);
		Bukkit.getPluginManager().registerEvents(new SKit(), this);
		Bukkit.getPluginManager().registerEvents(new PvP(), this);
		Bukkit.getPluginManager().registerEvents(new Dano(), this);
		Bukkit.getPluginManager().registerEvents(new Login(), this);
		Bukkit.getPluginManager().registerEvents(new Eventos(), this);
		Bukkit.getPluginManager().registerEvents(new EventoAuthEvents(), this);
		Bukkit.getPluginManager().registerEvents(new SetEvento(), this);
		Bukkit.getPluginManager().registerEvents(new Arena(), this);
		Bukkit.getPluginManager().registerEvents(new Admin(), this);
		Bukkit.getPluginManager().registerEvents(new IntercanbioMenus(), this);
		Bukkit.getPluginManager().registerEvents(new Menus(), this);
		Bukkit.getPluginManager().registerEvents(new Entrar(), this);
		Bukkit.getPluginManager().registerEvents(new Sair(), this);
		Bukkit.getPluginManager().registerEvents(new Eventos(), this);
		Bukkit.getPluginManager().registerEvents(new Build(), this);
		Bukkit.getPluginManager().registerEvents(new WarpsAPI(), this);
		Bukkit.getPluginManager().registerEvents(new Warp(), this);
		Bukkit.getPluginManager().registerEvents(new DeathEvents(), this);
		Bukkit.getPluginManager().registerEvents(new Respawn(), this);
		Bukkit.getPluginManager().registerEvents(new Proteção(), this);
		Bukkit.getPluginManager().registerEvents(new Principais(), this);
		Bukkit.getPluginManager().registerEvents(new Chat(), this);
		Bukkit.getPluginManager().registerEvents(new Sopas(), this);
		Bukkit.getPluginManager().registerEvents(new Recraft(), this);
		Bukkit.getPluginManager().registerEvents(new DropEvents(), this);
		Bukkit.getPluginManager().registerEvents(new DanoEvents(), this);
		Bukkit.getPluginManager().registerEvents(new ChatFloodEvents(), this);
		Bukkit.getPluginManager().registerEvents(new ClickTest(), this);
		Bukkit.getPluginManager().registerEvents(new Sc(), this);
		Bukkit.getPluginManager().registerEvents(new Diamante(this), this);
		Bukkit.getPluginManager().registerEvents(new Esmeralda(this), this);
		Bukkit.getPluginManager().registerEvents(new Ferro(this), this);
		Bukkit.getPluginManager().registerEvents(new Redstone(this), this);
		Bukkit.getPluginManager().registerEvents(new Manutençao(), this);
	}
	
	void EventosKits() {
		Bukkit.getPluginManager().registerEvents(new Grappler(), this);
		Bukkit.getPluginManager().registerEvents(new Hulk(), this);
		Bukkit.getPluginManager().registerEvents(new Phantom(), this);
		Bukkit.getPluginManager().registerEvents(new Sumo(), this);
		Bukkit.getPluginManager().registerEvents(new Ajnin(), this);
		Bukkit.getPluginManager().registerEvents(new Boxer(), this);
		Bukkit.getPluginManager().registerEvents(new Madman(), this);
		Bukkit.getPluginManager().registerEvents(new Monk(), this);
		Bukkit.getPluginManager().registerEvents(new Strong(), this);
		Bukkit.getPluginManager().registerEvents(new Viking(), this);
		Bukkit.getPluginManager().registerEvents(new Critical(), this);
		Bukkit.getPluginManager().registerEvents(new Magma(), this);
		Bukkit.getPluginManager().registerEvents(new Thor(), this);
		Bukkit.getPluginManager().registerEvents(new Switcher(), this);
		Bukkit.getPluginManager().registerEvents(new Thor(), this);
		Bukkit.getPluginManager().registerEvents(new Fisherman(), this);
		Bukkit.getPluginManager().registerEvents(new Anchor(), this);
		Bukkit.getPluginManager().registerEvents(new Ninja(), this);
		Bukkit.getPluginManager().registerEvents(new Gladiator(), this);
		Bukkit.getPluginManager().registerEvents(new Kangaroo(), this);
		Bukkit.getPluginManager().registerEvents(new Specialist(), this);
		Bukkit.getPluginManager().registerEvents(new Stomper(), this);
		Bukkit.getPluginManager().registerEvents(new Snail(), this);
		Bukkit.getPluginManager().registerEvents(new Viper(), this);
	}
	
	void Comandos() {
		getCommand("desabilitar").setExecutor(new Desabilitar());	
		getCommand("habilitar").setExecutor(new Habilitar());	
		getCommand("cps").setExecutor(new ClickTest());
		getCommand("report").setExecutor(new Report(this));
		getCommand("sc").setExecutor(new Sc());
		getCommand("acc").setExecutor(new Account());
		getCommand("account").setExecutor(new Account());
		getCommand("ping").setExecutor(new Ping());
		getCommand("tell").setExecutor(new Tell());
		getCommand("groupset").setExecutor(new GroupSet());
		getCommand("fake").setExecutor(new Fake());
		getCommand("skit").setExecutor(new SKit());
		getCommand("pvp").setExecutor(new PvP());
		getCommand("dano").setExecutor(new Dano());
		getCommand("register").setExecutor(new Register());
		getCommand("login").setExecutor(new Logar());
		getCommand("ip").setExecutor(new Conectado());
		getCommand("aplicar").setExecutor(new Aplicar());
		getCommand("setevento").setExecutor(new SetEvento());
		getCommand("setarena").setExecutor(new Arena());
		getCommand("admin").setExecutor(new Admin());
		getCommand("setrank").setExecutor(new SetRank());
		getCommand("rank").setExecutor(new Rank());
		getCommand("manutencao").setExecutor(new Manutençao());
		getCommand("groupset").setExecutor(new GroupSet());
		getCommand("chat").setExecutor(new Chat());
		getCommand("broadcast").setExecutor(new Bc());
		getCommand("bc").setExecutor(new Bc());
		getCommand("kit").setExecutor(new Kit());
		getCommand("spawn").setExecutor(new Spawn());
		getCommand("set").setExecutor(new SetWarp());
		getCommand("warp").setExecutor(new Warp());
		getCommand("youtuber").setExecutor(new Youtuber());
		getCommand("tag").setExecutor(new Tag());
		getCommand("ban").setExecutor(new Ban());
		getCommand("ipban").setExecutor(new IPBan());
		getCommand("kick").setExecutor(new Kick());
		getCommand("mute").setExecutor(new Mute());
		getCommand("unban").setExecutor(new Unban());
		getCommand("build").setExecutor(new Build());
		getCommand("gm").setExecutor(new Gamemode());
		getCommand("tp").setExecutor(new Tp());
		getCommand("tphere").setExecutor(new Tp());
		getCommand("tpall").setExecutor(new Tp());
		getCommand("evento").setExecutor(new Evento());
		
	}
	
	void LoadEventosExtras() {
		EventoConfig.getConfig().ConfigEnable(this);
		AuthConfig.getConfig().ConfigEnable(this);
		ArenaConfig.getConfig().ConfigEnable(this);
		WarpsConfig.getConfig().ConfigEnable(this);
		Config.getConfig().setupConfig(this);
		new StatsManager();
	}
}
