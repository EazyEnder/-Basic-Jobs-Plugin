package fr.eazyender.jobspl;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.eazyender.jobspl.cmd.CommandJobs;
import fr.eazyender.jobspl.events.PlayerBreakBlocks;
import fr.eazyender.jobspl.events.PlayerJoin;
import fr.eazyender.jobspl.events.PlayerKillEntity;
import fr.eazyender.jobspl.events.PlayerPlaceBlocks;
import fr.eazyender.jobspl.events.PlayerQuit;
import fr.eazyender.jobspl.files.FileAgriculteurConfig;
import fr.eazyender.jobspl.files.FileBucheronConfig;
import fr.eazyender.jobspl.files.FileChasseurConfig;
import fr.eazyender.jobspl.files.FileMineurConfig;
import fr.eazyender.jobspl.files.JobXpValue;
import fr.eazyender.jobspl.files.PlayerJobsStats;
import fr.eazyender.jobspl.gui.GuiJobs;

/** Dev : Eazy_Ender */
public class JobsPlMain extends JavaPlugin {
	
	private static JobsPlMain jobspl;
	
	@Override
	public void onEnable() 
	{
		jobspl = this;
		
		PluginManager pm = getServer().getPluginManager();
		
		/* Import/Gen du fichier des stats de joueurs sur les métiers*/
		PlayerJobsStats file_pjs = new PlayerJobsStats();
		
		/* Import/Gen du fichier des valeurs de rewards en xp d'un métier*/
		JobXpValue file_jxv = new JobXpValue();
		
		/* Import/Gen des configs de métier */
			/* Mineur */
		FileMineurConfig file_fmc = new FileMineurConfig();
			/* Chasseur */
		FileChasseurConfig file_fcc = new FileChasseurConfig();
			/* Bucheron */
		FileBucheronConfig file_fbc = new FileBucheronConfig();
			/* Agriculteur */
		FileAgriculteurConfig file_fac = new FileAgriculteurConfig();
		
		/* Les commandes : */
			/* Commande principale pour les jobs*/
			getCommand("jobs").setExecutor(new CommandJobs());
		
		/* Les GUI : */
			/* Interface principale pour les jobs*/
			pm.registerEvents(new GuiJobs(), this);
			
		/* Les events/listeners : */
			/* Permettant de load les fichiers/stats nécessaires pour le joueur */
			pm.registerEvents(new PlayerJoin(), this);
			/* Permettant de save les blocs déja miner(+etc) par le joueur */
			pm.registerEvents(new PlayerPlaceBlocks(), this);
			/* Pour les métiers : Mineur , Bucheron , Agriculteur */
			pm.registerEvents(new PlayerBreakBlocks(), this);
			/* Pour le métier : Chasseur */
			pm.registerEvents(new PlayerKillEntity(), this);
			/* Permettant de save les fichiers/stats nécessaires pour le joueur */
			pm.registerEvents(new PlayerQuit(), this);
		
		
	}
	
	@Override
	public void onDisable() 
	{
		/* On save les fichiers et deload */
		PlayerJobsStats.getPlayerJobsStats().onDisable();
	}
	
	public static JobsPlMain getJobsPl() {
		return jobspl;
	}

}
