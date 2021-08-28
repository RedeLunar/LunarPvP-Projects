/*     */ package com.crowed;
/*     */ 
/*     */ import com.crowed.api.API;
/*     */ import com.crowed.api.StatsManager;
/*     */ import com.crowed.api.WarpsAPI;
/*     */ import com.crowed.authme.Login;
/*     */ import com.crowed.authme.Register;
/*     */ import com.crowed.bans.Ban;
/*     */ import com.crowed.bans.IPBan;
/*     */ import com.crowed.bans.Kick;
/*     */ import com.crowed.bans.Mute;
/*     */ import com.crowed.bans.Unban;
/*     */ import com.crowed.bans.events.Config;
/*     */ import com.crowed.bans.events.Eventos;
/*     */ import com.crowed.comandos.Account;
/*     */ import com.crowed.comandos.Admin;
/*     */ import com.crowed.comandos.Aplicar;
/*     */ import com.crowed.comandos.Arena;
/*     */ import com.crowed.comandos.Bc;
/*     */ import com.crowed.comandos.Build;
/*     */ import com.crowed.comandos.Chat;
/*     */ import com.crowed.comandos.ClickTest;
/*     */ import com.crowed.comandos.ComprarVip;
/*     */ import com.crowed.comandos.Dano;
/*     */ import com.crowed.comandos.Desabilitar;
/*     */ import com.crowed.comandos.Evento;
/*     */ import com.crowed.comandos.Fake;
/*     */ import com.crowed.comandos.Gamemode;
/*     */ import com.crowed.comandos.GroupSet;
/*     */ import com.crowed.comandos.Habilitar;
/*     */ import com.crowed.comandos.Kit;
/*     */ import com.crowed.comandos.Manutençao;
/*     */ import com.crowed.comandos.Ping;
/*     */ import com.crowed.comandos.PvP;
/*     */ import com.crowed.comandos.Rank;
/*     */ import com.crowed.comandos.Report;
/*     */ import com.crowed.comandos.SKit;
/*     */ import com.crowed.comandos.Sc;
/*     */ import com.crowed.comandos.SetEvento;
/*     */ import com.crowed.comandos.SetRank;
/*     */ import com.crowed.comandos.SetWarp;
/*     */ import com.crowed.comandos.Spawn;
/*     */ import com.crowed.comandos.Sugerir;
/*     */ import com.crowed.comandos.Tag;
/*     */ import com.crowed.comandos.Tell;
/*     */ import com.crowed.comandos.Tp;
/*     */ import com.crowed.comandos.Warp;
/*     */ import com.crowed.comandos.Youtuber;
/*     */ import com.crowed.configs.ArenaConfig;
/*     */ import com.crowed.configs.AuthConfig;
/*     */ import com.crowed.configs.EventoConfig;
/*     */ import com.crowed.configs.WarpsConfig;
/*     */ import com.crowed.events.ChatFloodEvents;
/*     */ import com.crowed.events.DanoEvents;
/*     */ import com.crowed.events.DeathEvents;
/*     */ import com.crowed.events.DropEvents;
/*     */ import com.crowed.events.Entrar;
/*     */ import com.crowed.events.EventoAuthEvents;
/*     */ import com.crowed.events.Principais;
/*     */ import com.crowed.events.Proteção;
/*     */ import com.crowed.events.Respawn;
/*     */ import com.crowed.events.Sair;
/*     */ import com.crowed.habilites.Ajnin;
/*     */ import com.crowed.habilites.Anchor;
/*     */ import com.crowed.habilites.Boxer;
/*     */ import com.crowed.habilites.Critical;
/*     */ import com.crowed.habilites.Fisherman;
/*     */ import com.crowed.habilites.Gladiator;
/*     */ import com.crowed.habilites.Grappler;
/*     */ import com.crowed.habilites.Hulk;
/*     */ import com.crowed.habilites.Kangaroo;
/*     */ import com.crowed.habilites.Madman;
/*     */ import com.crowed.habilites.Magma;
/*     */ import com.crowed.habilites.Monk;
/*     */ import com.crowed.habilites.Ninja;
/*     */ import com.crowed.habilites.Phantom;
/*     */ import com.crowed.habilites.Snail;
/*     */ import com.crowed.habilites.Specialist;
/*     */ import com.crowed.habilites.Stomper;
/*     */ import com.crowed.habilites.Strong;
/*     */ import com.crowed.habilites.Sumo;
/*     */ import com.crowed.habilites.Switcher;
/*     */ import com.crowed.habilites.Thor;
/*     */ import com.crowed.habilites.Viking;
/*     */ import com.crowed.habilites.Viper;
/*     */ import com.crowed.jump.Diamante;
/*     */ import com.crowed.jump.Esmeralda;
/*     */ import com.crowed.jump.Ferro;
/*     */ import com.crowed.jump.Redstone;
/*     */ import com.crowed.menus.IntercanbioMenus;
/*     */ import com.crowed.menus.Menus;
/*     */ import com.crowed.score.Updater;
/*     */ import com.crowed.score.utils.BlinkEffect;
/*     */ import com.crowed.screenshare.ScreenShare;
/*     */ import com.crowed.utils.Challenge;
/*     */ import com.crowed.utils.FpsEnum;
/*     */ import com.crowed.utils.Recraft;
/*     */ import com.crowed.utils.Sopas;
/*     */ import com.crowed.utils.Strings;
/*     */ import java.util.ArrayList;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.World;
/*     */ import org.bukkit.command.ConsoleCommandSender;
/*     */ import org.bukkit.command.PluginCommand;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.plugin.Plugin;
/*     */ import org.bukkit.plugin.PluginManager;
/*     */ import org.bukkit.plugin.java.JavaPlugin;
/*     */ import org.bukkit.scheduler.BukkitScheduler;
/*     */ 
/*     */ public class Main extends JavaPlugin
/*     */ {
/* 115 */   public static ArrayList<String> login = new ArrayList();
/*     */   
/*     */   public static FpsEnum estado;
/* 118 */   public static Updater up = new Updater();
/* 119 */   public static BlinkEffect bk = new BlinkEffect();
/*     */   public static Main instance;
/*     */   public static Plugin plugin;
/*     */   
/* 123 */   public static Main getInstance() { return instance; }
/*     */   
/*     */   public static Plugin getPlugin()
/*     */   {
/* 127 */     return plugin;
/*     */   }
/*     */   
/*     */ 
/*     */   public void onEnable()
/*     */   {
/* 133 */     instance = this;
/* 134 */     plugin = this;
/* 135 */     saveDefaultConfig();
/* 136 */     Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "O Servidor foi iniciado corretamente!");
/* 137 */     Eventos();
/* 138 */     Comandos();
/* 139 */     EventosKits();
/* 140 */     LoadEventosExtras();
/* 141 */     up.run();
/* 142 */     PvP.pvp = true;
/* 143 */     Dano.Dano = true;
/* 144 */     Player[] arrayOfPlayer; int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length; for (int i = 0; i < j; i++) { Player player = arrayOfPlayer[i];
/* 145 */       player.kickPlayer(ChatColor.DARK_RED + ChatColor.BOLD + "REINCIANDO" + "\n" + "\n" + ChatColor.GRAY + "            Estamos reiniciando para melhorar sua jogabilidade" + "\n" + ChatColor.GRAY + "O Servidor se encontra em Beta " + "\n" + "Bugs? PorFavor nos informen pelo skype: aiCrowedCodes" + "\n" + ChatColor.GRAY + "Mais informaçoes em nosso site: §nem dev");
/*     */     }
/* 147 */     Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable()
/*     */     {
/*     */       public void run() {
/* 150 */         String[] msg = { Strings.servidormensagem + API.mensagem1, 
/* 151 */           Strings.servidormensagem + API.mensagem2, 
/* 152 */           Strings.servidormensagem + API.mensagem3, 
/* 153 */           Strings.servidormensagem + API.mensagem4, 
/* 154 */           Strings.servidormensagem + API.mensagem5 };
/*     */         
/* 156 */         Bukkit.getServer().broadcastMessage(msg[new java.util.Random().nextInt(msg.length)]);
/*     */       }
/* 158 */     }, 40L, 1900L);
/* 159 */     for (World world : Bukkit.getServer().getWorlds()) {
/* 160 */       world.setGameRuleValue("doDaylightCycle", "false");
/*     */     }
/*     */   }
/*     */   
/*     */   public void onDisable()
/*     */   {
/* 166 */     Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "O Servidor foi desligado corretamente !");
/*     */   }
/*     */   
/*     */   void Eventos() {
/* 170 */     Bukkit.getPluginManager().registerEvents(new Challenge(), this);
/* 171 */     Bukkit.getPluginManager().registerEvents(new com.crowed.api.TabAPI(), this);
/* 172 */     Bukkit.getPluginManager().registerEvents(new SKit(), this);
/* 173 */     Bukkit.getPluginManager().registerEvents(new PvP(), this);
/* 174 */     Bukkit.getPluginManager().registerEvents(new Dano(), this);
/* 175 */     Bukkit.getPluginManager().registerEvents(new Login(), this);
/* 176 */     Bukkit.getPluginManager().registerEvents(new Eventos(), this);
/* 177 */     Bukkit.getPluginManager().registerEvents(new EventoAuthEvents(), this);
/* 178 */     Bukkit.getPluginManager().registerEvents(new SetEvento(), this);
/* 179 */     Bukkit.getPluginManager().registerEvents(new Arena(), this);
/* 180 */     Bukkit.getPluginManager().registerEvents(new Admin(), this);
/* 181 */     Bukkit.getPluginManager().registerEvents(new IntercanbioMenus(), this);
/* 182 */     Bukkit.getPluginManager().registerEvents(new Menus(), this);
/* 183 */     Bukkit.getPluginManager().registerEvents(new Entrar(), this);
/* 184 */     Bukkit.getPluginManager().registerEvents(new Sair(), this);
/* 185 */     Bukkit.getPluginManager().registerEvents(new Eventos(), this);
/* 186 */     Bukkit.getPluginManager().registerEvents(new Build(), this);
/* 187 */     Bukkit.getPluginManager().registerEvents(new WarpsAPI(), this);
/* 188 */     Bukkit.getPluginManager().registerEvents(new Warp(), this);
/* 189 */     Bukkit.getPluginManager().registerEvents(new DeathEvents(), this);
/* 190 */     Bukkit.getPluginManager().registerEvents(new Respawn(), this);
/* 191 */     Bukkit.getPluginManager().registerEvents(new Proteção(), this);
/* 192 */     Bukkit.getPluginManager().registerEvents(new Principais(), this);
/* 193 */     Bukkit.getPluginManager().registerEvents(new Chat(), this);
/* 194 */     Bukkit.getPluginManager().registerEvents(new Sopas(), this);
/* 195 */     Bukkit.getPluginManager().registerEvents(new Recraft(), this);
/* 196 */     Bukkit.getPluginManager().registerEvents(new DropEvents(), this);
/* 197 */     Bukkit.getPluginManager().registerEvents(new DanoEvents(), this);
/* 198 */     Bukkit.getPluginManager().registerEvents(new ChatFloodEvents(), this);
/* 199 */     Bukkit.getPluginManager().registerEvents(new ClickTest(), this);
/* 200 */     Bukkit.getPluginManager().registerEvents(new Sc(), this);
/* 201 */     Bukkit.getPluginManager().registerEvents(new Diamante(this), this);
/* 202 */     Bukkit.getPluginManager().registerEvents(new Esmeralda(this), this);
/* 203 */     Bukkit.getPluginManager().registerEvents(new Ferro(this), this);
/* 204 */     Bukkit.getPluginManager().registerEvents(new Redstone(this), this);
/* 205 */     Bukkit.getPluginManager().registerEvents(new Manutençao(), this);
/*     */   }
/*     */   
/*     */   void EventosKits() {
/* 209 */     Bukkit.getPluginManager().registerEvents(new Grappler(), this);
/* 210 */     Bukkit.getPluginManager().registerEvents(new Hulk(), this);
/* 211 */     Bukkit.getPluginManager().registerEvents(new Phantom(), this);
/* 212 */     Bukkit.getPluginManager().registerEvents(new Sumo(), this);
/* 213 */     Bukkit.getPluginManager().registerEvents(new Ajnin(), this);
/* 214 */     Bukkit.getPluginManager().registerEvents(new Boxer(), this);
/* 215 */     Bukkit.getPluginManager().registerEvents(new Madman(), this);
/* 216 */     Bukkit.getPluginManager().registerEvents(new Monk(), this);
/* 217 */     Bukkit.getPluginManager().registerEvents(new Strong(), this);
/* 218 */     Bukkit.getPluginManager().registerEvents(new Viking(), this);
/* 219 */     Bukkit.getPluginManager().registerEvents(new Critical(), this);
/* 220 */     Bukkit.getPluginManager().registerEvents(new Magma(), this);
/* 221 */     Bukkit.getPluginManager().registerEvents(new Thor(), this);
/* 222 */     Bukkit.getPluginManager().registerEvents(new Switcher(), this);
/* 223 */     Bukkit.getPluginManager().registerEvents(new Thor(), this);
/* 224 */     Bukkit.getPluginManager().registerEvents(new Fisherman(), this);
/* 225 */     Bukkit.getPluginManager().registerEvents(new Anchor(), this);
/* 226 */     Bukkit.getPluginManager().registerEvents(new Ninja(), this);
/* 227 */     Bukkit.getPluginManager().registerEvents(new Gladiator(), this);
/* 228 */     Bukkit.getPluginManager().registerEvents(new Kangaroo(), this);
/* 229 */     Bukkit.getPluginManager().registerEvents(new Specialist(), this);
/* 230 */     Bukkit.getPluginManager().registerEvents(new Stomper(), this);
/* 231 */     Bukkit.getPluginManager().registerEvents(new Snail(), this);
/* 232 */     Bukkit.getPluginManager().registerEvents(new Viper(), this);
/*     */   }
/*     */   
/*     */   void Comandos() {
/* 236 */     getCommand("desabilitar").setExecutor(new Desabilitar());
/* 237 */     getCommand("habilitar").setExecutor(new Habilitar());
/* 238 */     getCommand("cps").setExecutor(new ClickTest());
/* 239 */     getCommand("report").setExecutor(new Report(this));
/* 240 */     getCommand("sc").setExecutor(new Sc());
/* 241 */     getCommand("acc").setExecutor(new Account());
/* 242 */     getCommand("account").setExecutor(new Account());
/* 243 */     getCommand("ping").setExecutor(new Ping());
/* 244 */     getCommand("tell").setExecutor(new Tell());
/* 245 */     getCommand("groupset").setExecutor(new GroupSet());
/* 246 */     getCommand("fake").setExecutor(new Fake());
/* 247 */     getCommand("skit").setExecutor(new SKit());
/* 248 */     getCommand("pvp").setExecutor(new PvP());
/* 249 */     getCommand("dano").setExecutor(new Dano());
/* 250 */     getCommand("register").setExecutor(new Register());
/* 251 */     getCommand("login").setExecutor(new com.crowed.authme.Logar());
/* 252 */     getCommand("ip").setExecutor(new com.crowed.comandos.Conectado());
/* 253 */     getCommand("aplicar").setExecutor(new Aplicar());
/* 254 */     getCommand("setevento").setExecutor(new SetEvento());
/* 255 */     getCommand("setarena").setExecutor(new Arena());
/* 256 */     getCommand("admin").setExecutor(new Admin());
/* 257 */     getCommand("setrank").setExecutor(new SetRank());
/* 258 */     getCommand("rank").setExecutor(new Rank());
/* 259 */     getCommand("manutencao").setExecutor(new Manutençao());
/* 260 */     getCommand("groupset").setExecutor(new GroupSet());
/* 261 */     getCommand("chat").setExecutor(new Chat());
/* 262 */     getCommand("broadcast").setExecutor(new Bc());
/* 263 */     getCommand("bc").setExecutor(new Bc());
/* 264 */     getCommand("kit").setExecutor(new Kit());
/* 265 */     getCommand("ss").setExecutor(new ScreenShare());
/* 266 */     getCommand("spawn").setExecutor(new Spawn());
/* 267 */     getCommand("set").setExecutor(new SetWarp());
/* 268 */     getCommand("warp").setExecutor(new Warp());
/* 269 */     getCommand("youtuber").setExecutor(new Youtuber());
/* 270 */     getCommand("comprarvip").setExecutor(new ComprarVip());
/* 271 */     getCommand("sugerir").setExecutor(new Sugerir(null));
/* 272 */     getCommand("tag").setExecutor(new Tag());
/* 273 */     getCommand("ban").setExecutor(new Ban());
/* 274 */     getCommand("ipban").setExecutor(new IPBan());
/* 275 */     getCommand("kick").setExecutor(new Kick());
/* 276 */     getCommand("mute").setExecutor(new Mute());
/* 277 */     getCommand("unban").setExecutor(new Unban());
/* 278 */     getCommand("build").setExecutor(new Build());
/* 279 */     getCommand("gm").setExecutor(new Gamemode());
/* 280 */     getCommand("tp").setExecutor(new Tp());
/* 281 */     getCommand("tphere").setExecutor(new Tp());
/* 282 */     getCommand("tpall").setExecutor(new Tp());
/* 283 */     getCommand("evento").setExecutor(new Evento());
/*     */   }
/*     */   
/*     */   void LoadEventosExtras()
/*     */   {
/* 288 */     EventoConfig.getConfig().ConfigEnable(this);
/* 289 */     AuthConfig.getConfig().ConfigEnable(this);
/* 290 */     ArenaConfig.getConfig().ConfigEnable(this);
/* 291 */     WarpsConfig.getConfig().ConfigEnable(this);
/* 292 */     Config.getConfig().setupConfig(this);
/* 293 */     new StatsManager();
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\Main.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */