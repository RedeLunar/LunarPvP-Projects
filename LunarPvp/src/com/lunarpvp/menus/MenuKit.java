package com.lunarpvp.menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;



public class MenuKit implements Listener, CommandExecutor {
	
	
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static java.util.List<String> Lore(String string)
      {
        String[] split = string.split(" ");
        string = "";
        ChatColor color = ChatColor.GOLD;
            ArrayList<String> newString = new ArrayList();
        for (int i = 0; i < split.length; i++)
        {
          if ((string.length() > 20) || (string.endsWith(".")))
          {
            newString.add(color + string);
            if ((string.endsWith("."))) {
              newString.add("");
            }
            string = "";
          }
          string = string + (string.length() == 0 ? "" : " ") + split[i];
        }
        newString.add(string);
        return newString;
      }
    
	public static ItemStack vidro;
	public static ItemMeta vidrometa;
	public static ItemStack vidro1;
	public static ItemMeta vidro1meta;
	public static ItemStack bolo;
	public static ItemMeta bolometa;
	public static ItemStack loja;
	public static ItemMeta lojameta;
	public static ItemStack corante;
	public static ItemMeta corantemeta;
	public static ItemStack pvp;
	public static ItemMeta pvpmeta;
	public static ItemStack kangaroo;
	public static ItemMeta kangaroometa;
	public static ItemStack viper;
	public static ItemMeta vipermeta;
	public static ItemStack snail;
	public static ItemMeta snailmeta;
	public static ItemStack reaper;
	public static ItemMeta reapermeta;
	public static ItemStack Fisherman;
	public static ItemMeta Fishermanmeta;
	public static ItemStack stomper;
	public static ItemMeta stompermeta;
	public static ItemStack viking;
	public static ItemMeta vikingmeta;
	public static ItemStack ninja;
	public static ItemMeta ninjameta;
	public static ItemStack boxer;
	public static ItemMeta boxermeta;
	public static ItemStack deshfire;
	public static ItemMeta deshfiremeta;
	public static ItemStack deshviper;
	public static ItemMeta deshvipermeta;
	public static ItemStack ff;
	public static ItemMeta ffmeta;
	public static ItemStack hulk;
	public static ItemMeta hulkmeta;
	public static ItemStack madman;
	public static ItemMeta madmanmeta;
	public static ItemStack ryu;
	public static ItemMeta ryumeta;
	public static ItemStack seya;
	public static ItemMeta seyameta;
	public static ItemStack sonic;
	public static ItemMeta sonicmeta;
	public static ItemStack specialist;
	public static ItemMeta specialistmeta;
	public static ItemStack titan;
	public static ItemMeta titanmeta;
	public static ItemStack turtle;
	public static ItemMeta turtlemeta;
	public static ItemStack urgal;
	public static ItemMeta urgalmeta;
	public static ItemStack thor;
	public static ItemMeta thormeta;
	public static ItemStack timelord;
	public static ItemMeta timelordmeta;
	public static ItemStack phantom;
	public static ItemMeta phantommeta;
	public static ItemStack poseidon;
	public static ItemMeta poseidonmeta;
	public static ItemStack quickdropper;
	public static ItemMeta quickdroppermeta;
	public static ItemStack Camel;
	public static ItemMeta Camelmeta;
	public static ItemStack burstmaster;
	public static ItemMeta burstmastermeta;
	public static ItemStack Gladiator;
	public static ItemMeta Gladiatormeta;
	public static ItemStack livro;
	public static ItemMeta livrometa;
	public static ItemStack ar;
	public static ItemMeta armeta;
	public static ItemStack close;
	public static ItemMeta closemeta;
	public static ItemStack arrow;
	public static ItemMeta arrowmeta;
	public static ItemStack arrow2;
	public static ItemMeta arrow2meta;
	
	   @EventHandler
	   public void Clicar(PlayerInteractEvent e)
	   {
	     Player p = e.getPlayer();
	     if (((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) &&
	       (p.getItemInHand().getType() == Material.ENDER_CHEST) &&
	       (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6Kits"))) {
	       p.chat("/kits");
	     }
    }
	   @EventHandler
	   public void Admins(PlayerInteractEvent e)
	   {
	     Player p = e.getPlayer();
	     if (((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) &&
	       (p.getItemInHand().getType() == Material.DIAMOND) &&
	       (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§6Loja"))) {
	       p.chat("/lojakits");
	     }
    }
	   
	   @EventHandler
	   public void Clicar4(PlayerInteractEvent e)
	   {
	     Player p = e.getPlayer();
	     if (((e.getAction() == Action.RIGHT_CLICK_AIR) || (e.getAction() == Action.RIGHT_CLICK_BLOCK)) &&
	       (p.getItemInHand().getType() == Material.BONE) &&
	       (p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§e§l➜ §7Testar Click"))) {
	       p.chat("/ct");
	     }
    }
	@EventHandler
	public void Execute(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§7▸ Kits (Página 1)")) {
				if (e.getCurrentItem().isSimilar(vidro)) {
					e.setCancelled(true);
					p.closeInventory();
				}
			}
		}
	}
	@EventHandler
	public void Execute5(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§7▸ Kits (Página 1)")) {
				if (e.getCurrentItem().isSimilar(bolo)) {
					e.setCancelled(true);
					p.closeInventory();
				}
			}
		}
	}
	@EventHandler
	public void Execute1(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Player p = (Player)e.getWhoClicked();
			Inventory Inv = e.getInventory();
			if (Inv.getTitle().equalsIgnoreCase("§7▸ Kits (Página 1)")) {
				if (e.getCurrentItem().isSimilar(vidro)) {
					e.setCancelled(true);
					p.closeInventory();				
			}
			if (e.getCurrentItem().isSimilar(pvp)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit pvp");
			}
			if (e.getCurrentItem().isSimilar(kangaroo)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit kangaroo");
			}
			if (e.getCurrentItem().isSimilar(viper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit viper");
			}
			if (e.getCurrentItem().isSimilar(snail)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit snail");
			}
			if (e.getCurrentItem().isSimilar(reaper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit reaper");
			}
			if (e.getCurrentItem().isSimilar(Fisherman)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit fisherman");
			}
			if (e.getCurrentItem().isSimilar(stomper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit stomper");
			}
			if (e.getCurrentItem().isSimilar(viking)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit viking");
			}
			if (e.getCurrentItem().isSimilar(ninja)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(boxer)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit boxer");
			}
			if (e.getCurrentItem().isSimilar(deshfire)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit deshfire");
			}
			if (e.getCurrentItem().isSimilar(deshviper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit deshviper");
			}
			if (e.getCurrentItem().isSimilar(ff)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit forcefield");
			}
			if (e.getCurrentItem().isSimilar(hulk)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit hulk");
			}
			if (e.getCurrentItem().isSimilar(madman)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit madman");
			}
			if (e.getCurrentItem().isSimilar(ryu)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit ryu");
			}
			if (e.getCurrentItem().isSimilar(seya)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit seya");
			}
			if (e.getCurrentItem().isSimilar(sonic)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit sonic");
			}
			if (e.getCurrentItem().isSimilar(specialist)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit specialist");
			}
			if (e.getCurrentItem().isSimilar(titan)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit titan");
			}
			if (e.getCurrentItem().isSimilar(quickdropper)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit quickdropper");
			}
			if (e.getCurrentItem().isSimilar(turtle)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit turtle");
			}
			
			if (e.getCurrentItem().isSimilar(urgal)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit urgal");
			}
			if (e.getCurrentItem().isSimilar(corante)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kits2");
			}
			if (e.getCurrentItem().isSimilar(thor)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit thor");
			}
			if (e.getCurrentItem().isSimilar(timelord)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit timelord");
			}
			if (e.getCurrentItem().isSimilar(phantom)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit phantom");
			}
			if (e.getCurrentItem().isSimilar(poseidon)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit poseidon");
			}
			if (e.getCurrentItem().isSimilar(phantom)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit phantom");
			}
			if (e.getCurrentItem().isSimilar(Camel)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit Camel");
			}
			if (e.getCurrentItem().isSimilar(burstmaster)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit burstmaster");
			}
			if (e.getCurrentItem().isSimilar(Gladiator)) {
				e.setCancelled(true);
				p.closeInventory();
				p.chat("/kit Gladiator");
			}
			if (e.getCurrentItem().isSimilar(ar)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(vidro1)) {
				e.setCancelled(true);
				p.closeInventory();
			}
			if (e.getCurrentItem().isSimilar(arrow)) {
				e.setCancelled(true);
				p.closeInventory();
				p.playSound(p.getLocation(), Sound.NOTE_PLING, 1,0F);
				p.chat("/kits2");
			}
			if (e.getCurrentItem().isSimilar(arrow2)) {
				e.setCancelled(true);
				p.closeInventory();
				p.sendMessage("§cEste Menu Não Possui Páginas Anteriores!");
			}
			if (e.getCurrentItem().isSimilar(close)) {
				e.setCancelled(true);
				p.closeInventory();
				p.sendMessage("§cMenu de §fKITS§c Fechado!");
			}
				
		}
	  }
	}
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§cVoce precisa ser um player");
			return true;
		}
		Player p = (Player)sender;
		Inventory kit = Bukkit.createInventory(p, 54, "§7▸ Kits (Página 1)");
		
	    vidro1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 4);
	    vidro1meta = vidro1.getItemMeta();
	    vidro1meta.setDisplayName("§c-");
	    vidro1.setItemMeta(vidro1meta);
	    
	    close = new ItemStack(Material.getMaterial(351), 1, (short)1);
	    closemeta = close.getItemMeta();
	    closemeta.setDisplayName("§c▸ Fechar");
	    close.setItemMeta(closemeta);
	    
	    ar = new ItemStack(Material.STAINED_GLASS_PANE);
	    armeta = ar.getItemMeta();
	    armeta.setDisplayName("§0-");
	    ar.setItemMeta(armeta);
	    
	    arrow = new ItemStack(Material.ARROW);
	    arrowmeta = arrow.getItemMeta();
	    arrowmeta.setDisplayName("§a▸ Próxima Página");
	    arrow.setItemMeta(arrowmeta);
	    
	    arrow2 = new ItemStack(Material.ARROW);
	    arrow2meta = arrow2.getItemMeta();
	    arrow2meta.setDisplayName("§c▸ Não existem Paginas Anteriores");
	    arrow2.setItemMeta(arrow2meta);
	    
	    vidro = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
	    vidrometa = vidro.getItemMeta();
	    vidrometa.setDisplayName("§cVoce não Possui este Kit");
	    vidro.setItemMeta(vidrometa);
		
	    livro = new ItemStack(Material.BOOK);
	    livrometa = livro.getItemMeta();
	    livrometa.setDisplayName("§a▸ Kits");
	    livro.setItemMeta(livrometa);
	    
	    pvp = new ItemStack(Material.STONE_SWORD);
	    pvpmeta = pvp.getItemMeta();
	    pvpmeta.setDisplayName("§e▸ PvP");
	    pvpmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    pvp.setItemMeta(pvpmeta);
	    
	    kangaroo = new ItemStack(Material.FIREWORK);
	    kangaroometa = kangaroo.getItemMeta();
	    kangaroometa.setDisplayName("§e▸ Kangaroo");
	    kangaroometa.setLore(Lore("§a▸ Selecionar §aKit"));
	    kangaroo.setItemMeta(kangaroometa);
	    
	    viper = new ItemStack(Material.SPIDER_EYE);
	    vipermeta = viper.getItemMeta();
	    vipermeta.setDisplayName("§e▸ Viper");
	    vipermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    viper.setItemMeta(vipermeta);
	    
	    snail = new ItemStack(Material.WEB);
	    snailmeta = snail.getItemMeta();
	    snailmeta.setDisplayName("§e▸ Snail");
	    snailmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    snail.setItemMeta(snailmeta);

	    reaper = new ItemStack(Material.WOOD_HOE);
	    reapermeta = reaper.getItemMeta();
	    reapermeta.setDisplayName("§e▸ Reaper");
	    reapermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    reaper.setItemMeta(reapermeta);
	    
	    Fisherman = new ItemStack(Material.COOKED_FISH);
	    Fishermanmeta = Fisherman.getItemMeta();
	    Fishermanmeta.setDisplayName("§e▸ Fisherman");
	    Fishermanmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    Fisherman.setItemMeta(Fishermanmeta);
	    
	    stomper = new ItemStack(Material.CHAINMAIL_BOOTS);
	    stompermeta = stomper.getItemMeta();
	    stompermeta.setDisplayName("§e▸ Stomper");
	    stompermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    stomper.setItemMeta(stompermeta);
	    
	    viking = new ItemStack(Material.IRON_AXE);
	    vikingmeta = viking.getItemMeta();
	    vikingmeta.setDisplayName("§e▸ Viking");
	    vikingmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    viking.setItemMeta(vikingmeta);
	    
	    boxer = new ItemStack(Material.QUARTZ);
	    boxermeta = boxer.getItemMeta();
	    boxermeta.setDisplayName("§e▸ Boxer");
	    boxermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    boxer.setItemMeta(boxermeta);

	    deshfire = new ItemStack(Material.REDSTONE);
	    deshfiremeta = deshfire.getItemMeta();
	    deshfiremeta.setDisplayName("§e▸ Deshfire");
	    deshfiremeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    deshfire.setItemMeta(deshfiremeta);
	    
	    deshviper = new ItemStack(Material.EMERALD);
	    deshvipermeta = deshviper.getItemMeta();
	    deshvipermeta.setDisplayName("§e▸ Deshviper");
	    deshvipermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    deshviper.setItemMeta(deshvipermeta);
	    
	    ff = new ItemStack(Material.IRON_INGOT);
	    ffmeta = ff.getItemMeta();
	    ffmeta.setDisplayName("§e▸ Forcefield");
	    ffmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    ff.setItemMeta(ffmeta);
	    
	    hulk = new ItemStack(Material.SADDLE);
	    hulkmeta = hulk.getItemMeta();
	    hulkmeta.setDisplayName("§e▸ Hulk");
	    hulkmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    hulk.setItemMeta(hulkmeta);
	    
	    ryu = new ItemStack(Material.BEACON);
	    ryumeta = ryu.getItemMeta();
	    ryumeta.setDisplayName("§e▸ Ryu");
	    ryumeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    ryu.setItemMeta(ryumeta);
	    
	    seya = new ItemStack(Material.LEATHER_CHESTPLATE);
	    seyameta = seya.getItemMeta();
	    seyameta.setDisplayName("§e▸ Seya");
	    seyameta.setLore(Lore("§a▸ Selecionar §aKit"));
	    seya.setItemMeta(seyameta);
	    
	    sonic = new ItemStack(Material.GOLD_INGOT);
	    sonicmeta = sonic.getItemMeta();
	    sonicmeta.setDisplayName("§e▸ Sonic");
	    sonicmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    sonic.setItemMeta(sonicmeta);
	    
	    specialist = new ItemStack(Material.ENCHANTMENT_TABLE);
	    specialistmeta = specialist.getItemMeta();
	    specialistmeta.setDisplayName("§e▸ Specialist");
	    specialistmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    specialist.setItemMeta(specialistmeta);
	    
	    titan = new ItemStack(Material.BEDROCK);
	    titanmeta = titan.getItemMeta();
	    titanmeta.setDisplayName("§e▸ Titan");
	    titanmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    titan.setItemMeta(titanmeta);
	    
	    turtle = new ItemStack(Material.DIAMOND_BOOTS);
	    turtlemeta = turtle.getItemMeta();
	    turtlemeta.setDisplayName("§e▸ Turtle");
	    turtlemeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    turtle.setItemMeta(turtlemeta);

	    urgal = new ItemStack(Material.POTION);
	    urgalmeta = urgal.getItemMeta();
	    urgalmeta.setDisplayName("§e▸ Urgal");
	    urgalmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    urgal.setItemMeta(urgalmeta);
	    
	    ninja = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)14);
	    ninjameta = ninja.getItemMeta();
	    ninjameta.setDisplayName("§e▸ Ninja");
	    ninjameta.setLore(Lore("§cManutençao"));
	    ninja.setItemMeta(ninjameta);
	    
	    thor = new ItemStack(Material.STONE_AXE);
	    thormeta = thor.getItemMeta();
	    thormeta.setDisplayName("§e▸ Thor");
	    thormeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    thor.setItemMeta(thormeta);
	    
	    timelord = new ItemStack(Material.WATCH);
	    timelordmeta = timelord.getItemMeta();
	    timelordmeta.setDisplayName("§e▸ TimeLord");
	    timelordmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    timelord.setItemMeta(timelordmeta);

	    quickdropper = new ItemStack(Material.BOWL);
	    quickdroppermeta = quickdropper.getItemMeta();
	    quickdroppermeta.setDisplayName("§e▸ QuickDropper");
	    quickdroppermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    quickdropper.setItemMeta(quickdroppermeta);
	    
	    poseidon = new ItemStack(Material.WATER);
	    poseidonmeta = poseidon.getItemMeta();
	    poseidonmeta.setDisplayName("§e▸ Poseidon");
	    poseidonmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    poseidon.setItemMeta(poseidonmeta);
	    
	    phantom = new ItemStack(Material.FEATHER);
	    phantommeta = phantom.getItemMeta();
	    phantommeta.setDisplayName("§e▸ Phantom");
	    phantommeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    phantom.setItemMeta(phantommeta);
	    
	    Camel = new ItemStack(Material.SANDSTONE);
	    Camelmeta = Camel.getItemMeta();
	    Camelmeta.setDisplayName("§e▸ Camel");
	    Camelmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    Camel.setItemMeta(Camelmeta);
	    
	    burstmaster = new ItemStack(Material.STONE_HOE);
	    burstmastermeta = burstmaster.getItemMeta();
	    burstmastermeta.setDisplayName("§e▸ BurstMaster");
	    burstmastermeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    burstmaster.setItemMeta(burstmastermeta);
	    
	    madman = new ItemStack(Material.POTION, 1, (short)8232);
	    madmanmeta = madman.getItemMeta();
	    madmanmeta.setDisplayName("§e▸ Madman");
	    madmanmeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    madman.setItemMeta(madmanmeta);
	    
	    Gladiator = new ItemStack(Material.IRON_FENCE);
	    Gladiatormeta = Gladiator.getItemMeta();
	    Gladiatormeta.setDisplayName("§e▸ Gladiator");
	    Gladiatormeta.setLore(Lore("§a▸ Selecionar §aKit"));
	    Gladiator.setItemMeta(Gladiatormeta);
	    
	    for (int i =0; i != 54; i++) {
	    	  kit.setItem(0, close); 
	    	  kit.setItem(1, vidro1); 
	    	  kit.setItem(2, ar); 
	    	  kit.setItem(3, vidro1); 
	    	  kit.setItem(4, ar); 
	    	  kit.setItem(5, vidro1); 
	    	  kit.setItem(6, ar); 
	    	  kit.setItem(7, vidro1); 
	    	  kit.setItem(8, ar); 
	    	  kit.setItem(9, ar); 
	    	  kit.setItem(10, ar); 
	    	  kit.setItem(11, ar); 
	    	  kit.setItem(12, vidro1); 
	    	  kit.setItem(13, livro); 
	    	  kit.setItem(14, vidro1); 
	    	  kit.setItem(15, ar); 
	    	  kit.setItem(16, ar); 
	    	  kit.setItem(17, ar); 
	    	  kit.setItem(18, vidro1); 
	    	  kit.setItem(26, vidro1); 
	    	  kit.setItem(27, arrow2); 
	    	  kit.setItem(35, arrow); 
	    	  kit.setItem(36, ar); 
	    	  kit.setItem(44, ar); 
	    	  kit.setItem(45, ar); 
	    	  kit.setItem(46, vidro1); 
	    	  kit.setItem(47, ar); 
	    	  kit.setItem(48, vidro1); 
	    	  kit.setItem(49, ar); 
	    	  kit.setItem(50, vidro1); 
	    	  kit.setItem(51, ar); 
	    	  kit.setItem(52, vidro1); 
	    	  kit.setItem(53, ar); 
	    }
	    if (p.hasPermission("kit.pvp")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(pvp);
	    }
		if (p.hasPermission("kit.kangaroo")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(kangaroo);
	    }
		if (p.hasPermission("kit.viper")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(viper);
	    }
		if (p.hasPermission("kit.snail")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(snail);
	    }
		if (p.hasPermission("kit.reaper")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(reaper);
	    }
		if (p.hasPermission("kit.fisherman")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(Fisherman);
	    }
		if (p.hasPermission("kit.stomper")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(stomper);
	    }
		if (p.hasPermission("kit.viking")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(viking);
	    }
		if (p.hasPermission("kit.ninja")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(ninja);
	    }
		if (p.hasPermission("kit.boxer")) {
	    	kit.removeItem(vidro);
	    	kit.addItem(boxer);
		}
		if (p.hasPermission("kit.deshfire")) {
	    	kit.removeItem(vidro);
			kit.addItem(deshfire);
		}
		if (p.hasPermission("kit.deshviper")) {
	    	kit.removeItem(vidro);
			kit.addItem(deshviper);
		}
		if (p.hasPermission("kit.forcefield")) {
		    	kit.removeItem(vidro);
			kit.addItem(ff);
		}
		if (p.hasPermission("kit.hulk")) {
	    	kit.removeItem(vidro);
			kit.addItem(hulk);
		}
		if (p.hasPermission("kit.ryu")) {
	    	kit.removeItem(vidro);
			kit.addItem(ryu);
		}
		if (p.hasPermission("kit.sonic")) {
	    	kit.removeItem(vidro);
			kit.addItem(sonic);
		}
		if (p.hasPermission("kit.specialist")) {
	    	kit.removeItem(vidro);
			kit.addItem(specialist);
		}
		if (p.hasPermission("kit.titan")) {
	    	kit.removeItem(vidro);
			kit.addItem(titan);
		}
		if (p.hasPermission("kit.turtle")) {
	    	kit.removeItem(vidro);
			kit.addItem(turtle);
		}
		if (p.hasPermission("kit.urgal")) {
	    	kit.removeItem(vidro);
			kit.addItem(urgal);
		}
		if (p.hasPermission("kit.madman")) {
	    	kit.removeItem(vidro);
			kit.addItem(madman);
		}
		if (p.hasPermission("kit.thor")) {
	    	kit.removeItem(vidro);
			kit.addItem(thor);
		}
		if (p.hasPermission("kit.timelord")) {
	    	kit.removeItem(vidro);
			kit.addItem(timelord);
		}
		if (p.hasPermission("kit.quickdropper")) {
	    	kit.removeItem(vidro);
			kit.addItem(quickdropper);
		}
		if (p.hasPermission("kit.poseidon")) {
	    	kit.removeItem(vidro);
			kit.addItem(poseidon);
		}
		if (p.hasPermission("kit.phantom")) {
	    	kit.removeItem(vidro);
			kit.addItem(phantom);
		}
		if (p.hasPermission("kit.Camel")) {
	    	kit.removeItem(vidro);
			kit.addItem(Camel);
		}
		if (p.hasPermission("kit.burstmaster")) {
	    	kit.removeItem(vidro);
			kit.addItem(burstmaster);
		}
		if (p.hasPermission("kit.seya")) {
	    	kit.removeItem(vidro);
			kit.addItem(seya);
		}
		if (p.hasPermission("kit.Gladiator")) {
	    	kit.removeItem(vidro);
			kit.addItem(Gladiator);
		}
		
		
	    p.openInventory(kit);
	    return false;
	}
}