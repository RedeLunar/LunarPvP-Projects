package com.lunarpvp.comandos;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;





import com.lunarpvp.api.KitAPI;
import com.lunarpvp.main.Main;


public class Kit implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§bPrecisa ser um Player para usar esse comando");
			return true;
		}
		Player p = (Player)sender;
		if (args.length == 0) {
			p.sendMessage("§cUse /kit <kit> ou /kits");
			return true;
		} else {
			if (args[0].equalsIgnoreCase("pvp")) {
				if (p.hasPermission("kit.pvp")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.PvP(p);
						p.sendMessage("§7Voce pegou o kit: §bPvP");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit PvP{nl} §fSelecionado!");
			
						return true;
						
					} else {
						p.sendMessage("§cVoce ja esta usando um Kit");
						return true;
					}
					
				} else {
					p.sendMessage("§cVoce nao tem permissao!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("kangaroo")) {
				if (p.hasPermission("kit.kangaroo")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Kangaroo(p);
						p.sendMessage("§7Voce pegou o kit: §bKangaroo");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Kangaroo{nl} §fSelecionado!");
				
						return true;
						
					} else {
						p.sendMessage("§cVoce ja esta usando um Kit");
						return true;
					}
					
				} else {
					p.sendMessage("§cVoce nao tem permissao!");
					return true;
				}
			}
			if (args[0].equalsIgnoreCase("viper")) {
				if (p.hasPermission("kit.viper")) {
					if (KitAPI.getKit(p) == "Nenhum" ) {
						KitAPI.Viper(p);
						p.sendMessage("§7Voce pegou o kit: §bViper");
						Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Viper{nl} §fSelecionado!");
				
						return true;
						
					} else {
						p.sendMessage("§cVoce ja esta usando um Kit");
						return true;
					}
					
				} else {
					p.sendMessage("§cVoce nao tem permissao!");
					return true;
				}
			}
				if (args[0].equalsIgnoreCase("Snail")) {
					if (p.hasPermission("kit.snail")) {
						if (KitAPI.getKit(p) == "Nenhum" ) {
							KitAPI.Snail(p);
							p.sendMessage("§7Voce pegou o kit: §bSnail");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Snail{nl} §fSelecionado!");
			
							return true;
							
						} else {
							p.sendMessage("§cVoce ja esta usando um Kit");
							return true;
						}
						
					} else {
						p.sendMessage("§cVoce nao tem permissao!");
						return true;
					}
				}
				if (args[0].equalsIgnoreCase("Reaper")) {
					if (p.hasPermission("kit.reaper")) {
						if (KitAPI.getKit(p) == "Nenhum" ) {
							KitAPI.Reaper(p);
							p.sendMessage("§7Voce pegou o kit: §bReaper");
							Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Reaper{nl} §fSelecionado!");
							return true;
							
						} else {
							p.sendMessage("§cVoce ja esta usando um Kit");
							return true;
						}
						
					} else {
						p.sendMessage("§cVoce nao tem permissao!");
						return true;
					   }
					}
					if (args[0].equalsIgnoreCase("Fisherman")) {
						if (p.hasPermission("kit.fisherman")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Fisherman(p);
								p.sendMessage("§7Voce pegou o kit: §bFisherman");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Fisherman{nl} §fSelecionado!");

								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Stomper")) {
						if (Main.getInstance().loja.getString(p.getUniqueId() + ".Stomper").equals("true") ||p.hasPermission("kit.stomper")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Stomper(p);
								p.sendMessage("§7Voce pegou o kit: §bStomper");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Stomper{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Viking")) {
						if (p.hasPermission("kit.viking")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Vinking(p);
								p.sendMessage("§7Voce pegou o kit: §bViking");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Viking{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Boxer")) {
						if (p.hasPermission("kit.Boxer")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Boxer(p);
								p.sendMessage("§7Voce pegou o kit: §bBoxer");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Boxer{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Deshfire")) {
						if (p.hasPermission("kit.Deshfire")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Deshfire(p);
								p.sendMessage("§7Voce pegou o kit: §bDeshfire");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Deshfire{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Deshviper")) {
						if (p.hasPermission("kit.Deshviper")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Deshviper(p);
								p.sendMessage("§7Voce pegou o kit: §bDeshviper");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Deshviper{nl} §fSelecionado!");

								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Forcefield")) {
						if (p.hasPermission("kit.Forcefield")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Forcefield(p);
								p.sendMessage("§7Voce pegou o kit: §bForcefield");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Forcefield{nl} §fSelecionado!");

								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Hulk")) {
						if (p.hasPermission("kit.Hulk")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Hulk(p);
								p.sendMessage("§7Voce pegou o kit: §bHulk");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Hulk{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Madman")) {
						if (p.hasPermission("kit.Madman")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Madman(p);
								p.sendMessage("§7Voce pegou o kit: §bMadman");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Madman{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Ryu")) {
						if (p.hasPermission("kit.Ryu")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Ryu(p);
								p.sendMessage("§7Voce pegou o kit: §bRyu");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Ryu{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Seya")) {
						if (p.hasPermission("kit.Seya")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Seya(p);
								p.sendMessage("§7Voce pegou o kit: §bSeya");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Seya{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Sonic")) {
						if (p.hasPermission("kit.Sonic")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Sonic(p);
								p.sendMessage("§7Voce pegou o kit: §bSonic");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Sonic{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Specialist")) {
						if (p.hasPermission("kit.Specialist")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.specialist(p);
								p.sendMessage("§7Voce pegou o kit: §bSpecialist");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Specialist{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Titan")) {
						if (p.hasPermission("kit.Titan")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Titan(p);
								p.sendMessage("§7Voce pegou o kit: §bTitan");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Titan{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Turtle")) {
						if (p.hasPermission("kit.Turtle")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Turtle(p);
								p.sendMessage("§7Voce pegou o kit: §bTurtle");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Turtle{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Urgal")) {
						if (Main.getInstance().loja.getString(p.getUniqueId() + ".Urgal").equals("true") ||p.hasPermission("kit.Urgal")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Urgal(p);
								p.sendMessage("§7Voce pegou o kit: §bUrgal");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Urgal{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("TimeLord")) {
						if (p.hasPermission("kit.TimeLord")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.TimeLord(p);
								p.sendMessage("§7Voce pegou o kit: §bTimeLord");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit TimeLord{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("QuickDropper")) {
						if (p.hasPermission("kit.QuickDropper")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.quickdropper(p);
								p.sendMessage("§7Voce pegou o kit: §bQuickDropper");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit QuickDropper{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Poseidon")) {
						if (Main.getInstance().loja.getString(p.getUniqueId() + ".Poseidon").equals("true") ||p.hasPermission("kit.Poseidon")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Poseidon(p);
								p.sendMessage("§7Voce pegou o kit: §bPoseidon");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Poseidon{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Phantom")) {
						if (Main.getInstance().loja.getString(p.getUniqueId() + ".Phantom").equals("true") ||p.hasPermission("kit.Phantom")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Phantom(p);
								p.sendMessage("§7Voce pegou o kit: §bPhantom");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Phantom{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Camel")) {
						if (p.hasPermission("kit.Camel")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Camel(p);
								p.sendMessage("§7Voce pegou o kit: §bCamel");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Camel{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("BurstMaster")) {
						if (p.hasPermission("kit.BurstMaster")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.BurstMaster(p);
								p.sendMessage("§7Voce pegou o kit: §bBurstMaster");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit BurstMaster{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
					if (args[0].equalsIgnoreCase("Gladiator")) {
						if (p.hasPermission("kit.Gladiator")) {
							if (KitAPI.getKit(p) == "Nenhum" ) {
								KitAPI.Gladiator(p);
								p.sendMessage("§7Voce pegou o kit: §bGladiator");
								Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "tm msg " + p.getName() + "§aKit Gladiator{nl} §fSelecionado!");
								return true;
								
							} else {
								p.sendMessage("§cVoce ja esta usando um Kit");
								return true;
						    }
							
						} else {
							p.sendMessage("§cVoce nao tem permissao!");
							return true;
						}
					}
			p.sendMessage("§cEsse kit §b" + args[0] + " §cnao existe");
			
		      }    		
		return false;
	}
  }