package fr.eazyender.jobspl.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.eazyender.jobspl.files.PlayerJobsStats;

public class PlayerQuit implements Listener {
	
	@EventHandler
	  public void onPlayerJoin(PlayerQuitEvent e) { 
		
		/* Dechargement du joueur */
		PlayerJobsStats.getPlayerJobsStats().unloadPlayer(e.getPlayer());
		
	}

}
