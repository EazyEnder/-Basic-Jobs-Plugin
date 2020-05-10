package fr.eazyender.jobspl.events;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import fr.eazyender.jobspl.files.FileAgriculteurConfig;
import fr.eazyender.jobspl.files.FileBucheronConfig;
import fr.eazyender.jobspl.files.FileChasseurConfig;
import fr.eazyender.jobspl.files.FileMineurConfig;
import fr.eazyender.jobspl.files.JobXpValue;
import fr.eazyender.jobspl.files.PlayerJobsStats;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class PlayerKillEntity implements Listener {
	
	@EventHandler
	  public void onEntityDeath(EntityDeathEvent e) { 
		LivingEntity entity = e.getEntity();
		if(entity.getKiller() instanceof Player) {
			Player p = entity.getKiller();
			int level2 = (int) PlayerJobsStats.getPlayerJobsStats().getAStatsLevel(p, 2);
			if(entity.getType() == EntityType.ZOMBIE) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Zombie();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Zombie();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.SPIDER) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Spider();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Spider();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.SKELETON) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Squeleton();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Squeleton();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.CREEPER) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Creeper();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Creeper();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.WITCH) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Witch();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Witch();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.SLIME) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Slime();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Slime();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.ENDER_DRAGON) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_EnderDragon();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_EnderDragon();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.WITHER) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Wither();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Wither();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.ENDERMITE) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Endermite();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Endermite();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.SILVERFISH) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Silverfish();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Silverfish();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.VINDICATOR || entity.getType() == EntityType.ILLUSIONER) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_BadVillager();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_BadVillager();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}else if(entity.getType() == EntityType.GUARDIAN) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Guardian();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Guardian();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			
			else if(entity.getType() == EntityType.PIG_ZOMBIE) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Pigmen();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_pigmen();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.MAGMA_CUBE) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Magmacream();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_magmacream();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.BLAZE) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Blaze();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_blaze();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			
			else if(entity.getType() == EntityType.HORSE) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Horse();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Horse();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.SHEEP) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Sheep();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Sheep();
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity);
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.COW) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Cow();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Cow();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.CHICKEN) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Chicken();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Chicken();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.RABBIT) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Lapin();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Lapin();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.PIG) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Pig();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Pig();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.BAT) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Bat();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Bat();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.VILLAGER) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Villager();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Villager();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.OCELOT) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Cat();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Cat();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.MUSHROOM_COW) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_MooshroomCow();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_MooshroomCow();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
			}
			else if(entity.getType() == EntityType.SQUID) {
				int xpPerEntity = JobXpValue.getJobXpValue().getXpPerMob_Squid();
				PlayerJobsStats.getPlayerJobsStats().addXP(p, 2, xpPerEntity);
				int moneyPerEntity = JobXpValue.getJobXpValue().getMoneyPerMob_Squid();
				double coef = FileChasseurConfig.filechasseurConfig.getCoef(level2);
				p.performCommand("eco give " + p.getDisplayName() + " " + moneyPerEntity*coef);
				p.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText("§7§oVous avez gagné : " + xpPerEntity + " xp et " + moneyPerEntity*coef + "$"));
				actualizePlayer(p,2);
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
