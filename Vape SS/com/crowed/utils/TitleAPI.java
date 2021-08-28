/*     */ package com.crowed.utils;
/*     */ 
/*     */ import net.minecraft.server.v1_7_R4.ChatSerializer;
/*     */ import net.minecraft.server.v1_7_R4.EntityPlayer;
/*     */ import net.minecraft.server.v1_7_R4.IChatBaseComponent;
/*     */ import net.minecraft.server.v1_7_R4.NetworkManager;
/*     */ import net.minecraft.server.v1_7_R4.PlayerConnection;
/*     */ import org.bukkit.Bukkit;
/*     */ import org.bukkit.ChatColor;
/*     */ import org.bukkit.Server;
/*     */ import org.bukkit.command.Command;
/*     */ import org.bukkit.command.CommandSender;
/*     */ import org.bukkit.command.ConsoleCommandSender;
/*     */ import org.bukkit.configuration.file.FileConfiguration;
/*     */ import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
/*     */ import org.bukkit.entity.Player;
/*     */ import org.bukkit.event.player.PlayerJoinEvent;
/*     */ import org.bukkit.plugin.PluginDescriptionFile;
/*     */ import org.bukkit.plugin.PluginManager;
/*     */ import org.spigotmc.ProtocolInjector.PacketTitle;
/*     */ import org.spigotmc.ProtocolInjector.PacketTitle.Action;
/*     */ 
/*     */ public class TitleAPI extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener
/*     */ {
/*     */   @Deprecated
/*     */   public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String message)
/*     */   {
/*  28 */     sendTitle(player, fadeIn, stay, fadeOut, message, null);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void sendSubtitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String message)
/*     */   {
/*  34 */     sendTitle(player, fadeIn, stay, fadeOut, null, message);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static void sendFullTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle)
/*     */   {
/*  40 */     sendTitle(player, fadeIn, stay, fadeOut, title, subtitle);
/*     */   }
/*     */   
/*     */   public static void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle)
/*     */   {
/*  45 */     CraftPlayer craftPlayer = (CraftPlayer)player;
/*  46 */     if (craftPlayer.getHandle().playerConnection.networkManager.getVersion() != 47) {
/*  47 */       return;
/*     */     }
/*  49 */     if (title == null) {
/*  50 */       title = "";
/*     */     }
/*  52 */     title = ChatColor.translateAlternateColorCodes('&', title);
/*  53 */     if (subtitle == null) {
/*  54 */       subtitle = "";
/*     */     }
/*  56 */     subtitle = ChatColor.translateAlternateColorCodes('&', subtitle);
/*     */     
/*  58 */     title = title.replaceAll("%player%", player.getDisplayName());
/*  59 */     subtitle = subtitle.replaceAll("%player%", player.getDisplayName());
/*     */     
/*  61 */     IChatBaseComponent serializedTitle = ChatSerializer.a(TextConverter.convert(title));
/*  62 */     IChatBaseComponent serializedSubTitle = ChatSerializer.a(TextConverter.convert(subtitle));
/*  63 */     IChatBaseComponent title2 = serializedTitle;
/*  64 */     IChatBaseComponent subtitle2 = serializedSubTitle;
/*     */     
/*  66 */     craftPlayer.getHandle().playerConnection.sendPacket(new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.TIMES, fadeIn.intValue(), stay.intValue(), fadeOut.intValue()));
/*  67 */     if (title != null) {
/*  68 */       craftPlayer.getHandle().playerConnection.sendPacket(new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.TITLE, title2));
/*     */     }
/*  70 */     if (subtitle != null) {
/*  71 */       craftPlayer.getHandle().playerConnection.sendPacket(new ProtocolInjector.PacketTitle(ProtocolInjector.PacketTitle.Action.SUBTITLE, subtitle2));
/*     */     }
/*     */   }
/*     */   
/*     */   public static void sendTabTitle(Player player, String header, String footer)
/*     */   {
/*  77 */     CraftPlayer craftPlayer = (CraftPlayer)player;
/*  78 */     if (craftPlayer.getHandle().playerConnection.networkManager.getVersion() != 47) {
/*  79 */       return;
/*     */     }
/*  81 */     PlayerConnection connection = craftPlayer.getHandle().playerConnection;
/*  82 */     if (header == null) {
/*  83 */       header = "";
/*     */     }
/*  85 */     header = ChatColor.translateAlternateColorCodes('&', header);
/*  86 */     if (footer == null) {
/*  87 */       footer = "";
/*     */     }
/*  89 */     footer = ChatColor.translateAlternateColorCodes('&', footer);
/*     */     
/*  91 */     header = header.replaceAll("%player%", player.getDisplayName());
/*  92 */     footer = footer.replaceAll("%player%", player.getDisplayName());
/*     */     
/*  94 */     IChatBaseComponent header2 = ChatSerializer.a("{'color': 'white', 'text': '" + header + "'}");
/*  95 */     IChatBaseComponent footer2 = ChatSerializer.a("{'color': 'white', 'text': '" + footer + "'}");
/*  96 */     connection.sendPacket(new org.spigotmc.ProtocolInjector.PacketTabHeader(header2, footer2));
/*     */   }
/*     */   
/*     */   public boolean onCommand(CommandSender sender, Command command, String string, String[] args)
/*     */   {
/* 101 */     if (args.length < 6)
/*     */     {
/* 103 */       sender.sendMessage(ChatColor.RED + "Usage: /title <player> title|subtitle <fadeIn> <stay> <fadeOut> <text>");
/* 104 */       sender.sendMessage(ChatColor.RED + "Note: fadeIn, stay &, fadeOut require to be a number, works in ticks; 20 = 1 second");
/* 105 */       return false;
/*     */     }
/* 107 */     if (Bukkit.getPlayer(args[0]) == null)
/*     */     {
/* 109 */       sender.sendMessage(ChatColor.RED + "Player not found");
/* 110 */       return false;
/*     */     }
/* 112 */     Player player = Bukkit.getPlayer(args[0]);
/* 113 */     if ((!args[1].equalsIgnoreCase("title")) && (!args[1].equalsIgnoreCase("subtitle")))
/*     */     {
/* 115 */       sender.sendMessage(ChatColor.RED + "Invalid argument: " + args[1]);
/* 116 */       return false;
/*     */     }
/* 118 */     if (!isInteger(args[2]))
/*     */     {
/* 120 */       sender.sendMessage(ChatColor.RED + "Not a number: " + args[2]);
/* 121 */       return false;
/*     */     }
/* 123 */     if (!isInteger(args[3]))
/*     */     {
/* 125 */       sender.sendMessage(ChatColor.RED + "Not a number: " + args[3]);
/* 126 */       return false;
/*     */     }
/* 128 */     if (!isInteger(args[4]))
/*     */     {
/* 130 */       sender.sendMessage(ChatColor.RED + "Not a number: " + args[4]);
/* 131 */       return false;
/*     */     }
/* 133 */     StringBuilder builder = new StringBuilder();
/* 134 */     String[] arrayOfString; int j = (arrayOfString = args).length; for (int i = 0; i < j; i++) { String value = arrayOfString[i];
/* 135 */       builder.append(value).append(" ");
/*     */     }
/* 137 */     String message = builder.toString();
/* 138 */     message = message.replace(args[0] + " ", "");
/* 139 */     message = message.replace(args[1] + " ", "");
/* 140 */     message = message.replace(args[2] + " ", "");
/* 141 */     message = message.replace(args[3] + " ", "");
/* 142 */     message = message.replace(args[4] + " ", "");
/* 143 */     if (args[1].equalsIgnoreCase("title"))
/*     */     {
/* 145 */       sendTitle(player, Integer.valueOf(Integer.parseInt(args[2])), Integer.valueOf(Integer.parseInt(args[3])), Integer.valueOf(Integer.parseInt(args[4])), message, null);
/* 146 */       sender.sendMessage(ChatColor.GREEN + "Title sent");
/* 147 */       return true;
/*     */     }
/* 149 */     if (args[1].equalsIgnoreCase("subtitle"))
/*     */     {
/* 151 */       sendTitle(player, Integer.valueOf(Integer.parseInt(args[2])), Integer.valueOf(Integer.parseInt(args[3])), Integer.valueOf(Integer.parseInt(args[4])), null, message);
/* 152 */       sender.sendMessage(ChatColor.GREEN + "Title sent");
/* 153 */       return true;
/*     */     }
/* 155 */     return false;
/*     */   }
/*     */   
/*     */   public void onEnable()
/*     */   {
/* 160 */     getConfig().options().copyDefaults(true);
/* 161 */     saveConfig();
/* 162 */     Server server = getServer();
/* 163 */     ConsoleCommandSender console = server.getConsoleSender();
/*     */     
/* 165 */     console.sendMessage("");
/* 166 */     console.sendMessage(ChatColor.BLUE + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
/* 167 */     console.sendMessage("");
/* 168 */     console.sendMessage(ChatColor.AQUA + getDescription().getName());
/* 169 */     console.sendMessage(ChatColor.AQUA + "Version " + getDescription().getVersion());
/* 170 */     console.sendMessage("");
/* 171 */     console.sendMessage(ChatColor.BLUE + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
/* 172 */     console.sendMessage("");
/*     */     
/* 174 */     Bukkit.getPluginManager().registerEvents(this, this);
/*     */   }
/*     */   
/*     */   boolean isInteger(String s)
/*     */   {
/*     */     try
/*     */     {
/* 181 */       Integer.parseInt(s);
/*     */     }
/*     */     catch (NumberFormatException e)
/*     */     {
/* 185 */       return false;
/*     */     }
/* 187 */     return true;
/*     */   }
/*     */   
/*     */   @org.bukkit.event.EventHandler
/*     */   public void onPlayerJoin(PlayerJoinEvent event)
/*     */   {
/* 193 */     if (getConfig().getBoolean("Title On Join")) {
/* 194 */       sendTitle(event.getPlayer(), Integer.valueOf(20), Integer.valueOf(50), Integer.valueOf(20), getConfig().getString("Title Message"), getConfig().getString("Subtitle Message"));
/*     */     }
/* 196 */     if (getConfig().getBoolean("Tab Header Enabled")) {
/* 197 */       sendTabTitle(event.getPlayer(), getConfig().getString("Tab Header Message"), getConfig().getString("Tab Footer Message"));
/*     */     }
/*     */   }
/*     */   
/*     */   public void onDisable()
/*     */   {
/* 203 */     getLogger().info(getDescription().getName() + " has been disabled!");
/*     */   }
/*     */ }


/* Location:              C:\Users\pedro\Desktop\principal\plugins\Servidor by zXximenesPvP_\plugins\VapeMC.jar!\com\crowed\utils\TitleAPI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */