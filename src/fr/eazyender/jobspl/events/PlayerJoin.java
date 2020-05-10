package fr.eazyender.jobspl.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.eazyender.jobspl.files.PlayerJobsStats;

public class PlayerJoin implements Listener {
	
	@EventHandler
	  public void onPlayerJoin(PlayerJoinEvent e) { 
		
		/* Chargement du joueur */
		PlayerJobsStats.getPlayerJobsStats().loadPlayer(e.getPlayer()); 
		
	}

}
