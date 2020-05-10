package fr.eazyender.jobspl.gui;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Biome;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import fr.eazyender.jobspl.files.FileAgriculteurConfig;
import fr.eazyender.jobspl.files.FileBucheronConfig;
import fr.eazyender.jobspl.files.FileChasseurConfig;
import fr.eazyender.jobspl.files.FileMineurConfig;
import fr.eazyender.jobspl.files.PlayerJobsStats;

public class GuiJobs implements Listener {
	
	public static void createGui(Player player){
		
		Inventory inv = Bukkit.createInventory(null, 54 , "§f§lMétiers : §8" + player.getDisplayName());
		
		List<String> str_mineur = new ArrayList<String>();
		str_mineur.add("§7Niveau : " + PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 1));
		long currentxpm = PlayerJobsStats.getPlayerJobsStats().getAStatsXP(player, 1);
		long necessaryxpm = FileMineurConfig.fileMineurConfig.getXpNecessary((int) (PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 1) + 1));
		int percentagexpm = (int) ((float)(currentxpm) / necessaryxpm * 100);
		str_mineur.add("§7Progression " + generateBar(percentagexpm) + " §7" + percentagexpm + "%");
		ItemStack mineur = getCustomItemWithLore(Material.IRON_PICKAXE,"§5§lMineur",false,1,str_mineur);
		inv.setItem(19, mineur);
		
		List<String> str_chasseur = new ArrayList<String>();
		str_chasseur.add("§7Niveau : " + PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 2));
		long currentxpc = PlayerJobsStats.getPlayerJobsStats().getAStatsXP(player, 2);
		long necessaryxpc = FileChasseurConfig.filechasseurConfig.getXpNecessary((int) (PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 2) + 1));
		int percentagexpc = (int) ((float)(currentxpc) / necessaryxpc * 100);
		str_chasseur.add("§7Progression " + generateBar(percentagexpc) + " §7" + percentagexpc + "%");
		ItemStack chasseur = getCustomItemWithLore(Material.IRON_SWORD,"§5§lChasseur",false,1,str_chasseur);
		inv.setItem(21, chasseur);

		List<String> str_bucheron = new ArrayList<String>();
		str_bucheron.add("§7Niveau : " + PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 3));
		long currentxpb = PlayerJobsStats.getPlayerJobsStats().getAStatsXP(player, 3);
		long necessaryxpb = FileBucheronConfig.filebucheronConfig.getXpNecessary((int) (PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 3) + 1));
		int percentagexpb = (int) ((float)(currentxpb) / necessaryxpb * 100);
		str_bucheron.add("§7Progression " + generateBar(percentagexpb) + " §7" + percentagexpb + "%");
		ItemStack bucheron = getCustomItemWithLore(Material.IRON_AXE,"§5§lBucheron",false,1,str_bucheron);
		inv.setItem(23, bucheron);
		
		List<String> str_agriculteur = new ArrayList<String>();
		str_agriculteur.add("§7Niveau : " + PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 4));
		long currentxpa = PlayerJobsStats.getPlayerJobsStats().getAStatsXP(player, 4);
		long necessaryxpa = FileAgriculteurConfig.fileagriculteurConfig.getXpNecessary((int) (PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, 4) + 1));
		int percentagexpa = (int) ((float)(currentxpa) / necessaryxpa * 100);
		str_agriculteur.add("§7Progression " + generateBar(percentagexpa) + " §7" + percentagexpa + "%");
		ItemStack agriculteur = getCustomItemWithLore(Material.IRON_HOE,"§5§lAgriculteur",false,1,str_agriculteur);
		inv.setItem(25, agriculteur);
		
		player.playSound(player.getLocation(), Sound.BLOCK_LAVA_POP, 1, 1);
		player.openInventory(inv);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		
		Inventory inv = event.getInventory();
		Player player = (Player) event.getWhoClicked();
		ItemStack current = event.getCurrentItem();
		
		if(current != null) {
			
			if(event.getView().getTitle().equalsIgnoreCase("§f§lMétiers : §8" + player.getDisplayName())) {
				
				if(current.getType() == Material.IRON_PICKAXE) {
					player.playSound(player.getLocation(), Sound.BLOCK_LAVA_POP, 1, 1);
					createJob(player,1);
				}else if(current.getType() == Material.IRON_SWORD) {
					player.playSound(player.getLocation(), Sound.BLOCK_LAVA_POP, 1, 1);
					createJob(player,2);
				}else if(current.getType() == Material.IRON_AXE) {
					player.playSound(player.getLocation(), Sound.BLOCK_LAVA_POP, 1, 1);
					createJob(player,3);
				}else if(current.getType() == Material.IRON_HOE) {
					player.playSound(player.getLocation(), Sound.BLOCK_LAVA_POP, 1, 1);
					createJob(player,4);
				}
			
				event.setCancelled(true);
				
			}
			
			if(event.getView().getTitle().equalsIgnoreCase("§f§lMineur Stats : §8" + player.getDisplayName())
					||event.getView().getTitle().equalsIgnoreCase("§f§lChasseur Stats : §8" + player.getDisplayName())
					||event.getView().getTitle().equalsIgnoreCase("§f§lBucheron Stats : §8" + player.getDisplayName())
					||event.getView().getTitle().equalsIgnoreCase("§f§lAgriculteur Stats : §8" + player.getDisplayName())) {
				event.setCancelled(true);
			}
			
			
		}
		
	}
	
	public static void createJob(Player player,int id){
		
		Inventory inv;
		if(id == 1) {
			inv = Bukkit.createInventory(null, 54 , "§f§lMineur Stats : §8" + player.getDisplayName());}
		else if(id == 2) {
			inv = Bukkit.createInventory(null, 54 , "§f§lChasseur Stats : §8" + player.getDisplayName());}
		else if(id == 3) {
			inv = Bukkit.createInventory(null, 54 , "§f§lBucheron Stats : §8" + player.getDisplayName());}
		else if(id == 4) {
			inv = Bukkit.createInventory(null, 54 , "§f§lAgriculteur Stats : §8" + player.getDisplayName());}
		else {
			inv = Bukkit.createInventory(null, 54 , "§f§lBug relaunch : §8" + player.getDisplayName());}
		
		int level = (int) PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(player, id);	
		int Ilevel = 50 - level;
		
		for(int i = 0; i <= level; i++) {
			ItemStack greenglass = getCustomItemWithLore(Material.GREEN_GLAZED_TERRACOTTA,"§a§lLevel §2" + i,false,i,null);
			inv.setItem(i, greenglass);
		}
		for(int i = level + 1; i <= 50; i++) {
			ItemStack redglass = getCustomItemWithLore(Material.RED_GLAZED_TERRACOTTA,"§c§lLevel §4" + i,false,i,null);
			inv.setItem(i, redglass);
		}
		
		player.openInventory(inv);
	}
	
	private static String generateBar(int percentage) {
		String str = "";
		if(percentage >= 0 && percentage <= 100) {
			if(percentage >= 0 && percentage < 10) {str = "§e----------";}
			else if(percentage >= 10 && percentage < 20) {str = "§a-§e---------";}
			else if(percentage >= 20 && percentage < 30) {str = "§a--§e-------";}
			else if(percentage >= 30 && percentage < 40) {str = "§a---§e-------";}
			else if(percentage >= 40 && percentage < 50) {str = "§a----§e------";}
			else if(percentage >= 50 && percentage < 60) {str = "§a-----§e-----";}
			else if(percentage >= 60 && percentage < 70) {str = "§a------§e----";}
			else if(percentage >= 70 && percentage < 80) {str = "§a-------§e---";}
			else if(percentage >= 80 && percentage < 90) {str = "§a--------§e--";}
			else if(percentage >= 90 && percentage < 100) {str = "§a---------§e-";}
			else if(percentage == 100) {str = "§a----------";}
			return str;
		}else {
			return str;
		}
	}
	
	public static ItemStack getCustomItemWithLore(Material material, String customName, boolean EnchantEffect, int nbr, List<String> lore) {
		
		ItemStack item = new ItemStack(material, nbr);
		ItemMeta itemMeta = item.getItemMeta();
		if(lore != null) {
		itemMeta.setLore(lore);
		}
		if(customName != null) {itemMeta.setDisplayName(customName);}
		if(EnchantEffect) {itemMeta.addEnchant(Enchantment.DAMAGE_ALL, 200, true);itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);}
		item.setItemMeta(itemMeta);
		
		
		return item;
		
	}

}
