package fr.eazyender.jobspl.events;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.Plugin;

import fr.eazyender.jobspl.JobsPlMain;
import fr.eazyender.jobspl.files.FileAgriculteurConfig;
import fr.eazyender.jobspl.files.FileBucheronConfig;
import fr.eazyender.jobspl.files.FileChasseurConfig;
import fr.eazyender.jobspl.files.FileMineurConfig;
import fr.eazyender.jobspl.files.JobXpValue;
import fr.eazyender.jobspl.files.PlayerJobsStats;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class PlayerBreakBlocks implements Listener {
	
	@EventHandler
	  public void onPlayerBreakBlock(BlockBreakEvent e) { 
		
		if(e.getBlock() != null && e.isDropItems()) {
			Player p = e.getPlayer();
			int level1 = (int) PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(p, 1);
			int level3 = (int) PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(p, 3);
			int level4 = (int) PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(p, 4);
			/** Mineur */
			if(e.getBlock().getType().equals(Material.COAL_ORE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Coal();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Coal();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}else if(e.getBlock().getType().equals(Material.STONE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Stone();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Stone();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}else if(e.getBlock().getType().equals(Material.IRON_ORE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Iron();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Iron();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}else if(e.getBlock().getType().equals(Material.GOLD_ORE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Gold();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Gold();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}else if(e.getBlock().getType().equals(Material.REDSTONE_ORE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Redstone();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Redstone();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}else if(e.getBlock().getType().equals(Material.LAPIS_ORE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Lapiz();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Lapiz();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}else if(e.getBlock().getType().equals(Material.DIAMOND_ORE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Diamond();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Diamond();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}else if(e.getBlock().getType().equals(Material.EMERALD_ORE) && !PlayerPlaceBlocks.instance.getMineurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getMineurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Emerald();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 1, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Emerald();
				double coef = FileMineurConfig.fileMineurConfig.getCoef(level1);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,1);
			}
			
			/**Bucheron */
			
			else if(e.getBlock().getType().equals(Material.LOG) && !PlayerPlaceBlocks.instance.getBucheronV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getBucheronV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Log1();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 3, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoenyPerBlock_Log1();
				double coef = FileBucheronConfig.filebucheronConfig.getCoef(level3);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));;
				actualizePlayer(p,3);
			}else if(e.getBlock().getType().equals(Material.LOG_2) && !PlayerPlaceBlocks.instance.getBucheronV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getBucheronV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Log2();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 3, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Log2();
				double coef = FileBucheronConfig.filebucheronConfig.getCoef(level3);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,3);
			}

			/** Agriculteur */
			
			else if(e.getBlock().getType().equals(Material.POTATO) && e.getBlock().getData() == 7) {
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Potato();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 4, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Potato();
				double coef = FileAgriculteurConfig.fileagriculteurConfig.getCoef(level4);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,4);
			}else if(e.getBlock().getType().equals(Material.CROPS)&& e.getBlock().getData() == 7) {
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Ble();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 4, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Ble();
				double coef = FileAgriculteurConfig.fileagriculteurConfig.getCoef(level4);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,4);
			}else if(e.getBlock().getType().equals(Material.CARROT)&& e.getBlock().getData() == 7) {
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Carotte();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 4, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Carotte();
				double coef = FileAgriculteurConfig.fileagriculteurConfig.getCoef(level4);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,4);
			}else if(e.getBlock().getType().equals(Material.BEETROOT_SEEDS)&& e.getBlock().getData() == 3) {
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Betterave();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 4, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Betterave();
				double coef = FileAgriculteurConfig.fileagriculteurConfig.getCoef(level4);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,4);
			}else if(e.getBlock().getType().equals(Material.NETHER_WARTS)&& e.getBlock().getData() == 3) {
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_NetherVerrue();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 4, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_NetherVerrue();
				double coef = FileAgriculteurConfig.fileagriculteurConfig.getCoef(level4);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,4);
			}else if(e.getBlock().getType().equals(Material.MELON_BLOCK) && !PlayerPlaceBlocks.instance.getAgriculteurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getAgriculteurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Melon();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 4, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Melon();
				double coef = FileAgriculteurConfig.fileagriculteurConfig.getCoef(level4);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,4);
			}else if(e.getBlock().getType().equals(Material.PUMPKIN) && !PlayerPlaceBlocks.instance.getAgriculteurV().contains(e.getBlock())) {
				PlayerPlaceBlocks.instance.getAgriculteurV().remove(e.getBlock());
				int xpPerBlock = JobXpValue.getJobXpValue().getXpPerBlock_Pumpkin();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 4, xpPerBlock);
				int moneyPerBlock = JobXpValue.getJobXpValue().getMoneyPerBlock_Pumpkin();
				double coef = FileAgriculteurConfig.fileagriculteurConfig.getCoef(level4);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerBlock*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerBlock + " xp et " + moneyPerBlock*coef + "$"));
				actualizePlayer(p,4);
			}
			
		}
		
	}
	
	public void actualizePlayer(Player p,int idJob) {
		long xp = PlayerJobsStats.getPlayerJobsStats().getAStatsXP(p, idJob);
		int level = (int) PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(p, idJob);
			if(level >= 50) {
				PlayerJobsStats.getPlayerJobsStats().setLevel(p, idJob, 50);
				PlayerJobsStats.getPlayerJobsStats().setXP(p, idJob, 0);
				
			}else {
		long xpNecessary = 99999999;
		String command = "Default";
		
		switch(idJob) {
		case 1:xpNecessary = FileMineurConfig.fileMineurConfig.getXpNecessary(level + 1);command = FileMineurConfig.fileMineurConfig.getCommandOfALevel(level + 1);
			break;
		case 2:xpNecessary = FileChasseurConfig.filechasseurConfig.getXpNecessary(level + 1);command = FileChasseurConfig.filechasseurConfig.getCommandOfALevel(level + 1);
			break;
		case 3:xpNecessary = FileBucheronConfig.filebucheronConfig.getXpNecessary(level + 1);command = FileBucheronConfig.filebucheronConfig.getCommandOfALevel(level + 1);
			break;
		case 4:xpNecessary = FileAgriculteurConfig.fileagriculteurConfig.getXpNecessary(level + 1);command = FileAgriculteurConfig.fileagriculteurConfig.getCommandOfALevel(level + 1);
			break;
		default:xpNecessary = FileMineurConfig.fileMineurConfig.getXpNecessary(level + 1);command = FileMineurConfig.fileMineurConfig.getCommandOfALevel(level + 1);
			break;
		}
		
		if(xp >= xpNecessary) {
			PlayerJobsStats.getPlayerJobsStats().setXP(p, idJob, 0);
			PlayerJobsStats.getPlayerJobsStats().addLevel(p, idJob, 1);
			
			ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
			command = command.replaceAll("%player%", p.getDisplayName());
			Bukkit.dispatchCommand(console, command);
			
		}}
	}


}
