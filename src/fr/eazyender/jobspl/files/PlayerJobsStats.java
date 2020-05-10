package fr.eazyender.jobspl.files;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import fr.eazyender.jobspl.JobsPlMain;

public class PlayerJobsStats {
	
	public static PlayerJobsStats playerJobStats;
	
	 private static Map<UUID, Long> xpMineurPlayer = new HashMap<UUID, Long>();
	 private static Map<UUID, Integer> levelMineurPlayer = new HashMap<UUID, Integer>();
	 
	 private static Map<UUID, Long> xpChasseurPlayer = new HashMap<UUID, Long>();
	 private static Map<UUID, Integer> levelChasseurPlayer = new HashMap<UUID, Integer>();
	 
	 private static Map<UUID, Long> xpBucheronPlayer = new HashMap<UUID, Long>();
	 private static Map<UUID, Integer> levelBucheronPlayer = new HashMap<UUID, Integer>();
	 
	 private static Map<UUID, Long> xpAgriculteurPlayer = new HashMap<UUID, Long>();
	 private static Map<UUID, Integer> levelAgriculteurPlayer = new HashMap<UUID, Integer>();
	
	  private static File jobStatsFile;
	  private static FileConfiguration jobStatsConfig;
	
	  public PlayerJobsStats() {
		  playerJobStats = this;
		    registerFile();
		    for (Player ps : Bukkit.getOnlinePlayers()) {
		      loadPlayer(ps);
		    }
	  }
	  
	  public void onDisable() {
		  for (Player ps : Bukkit.getOnlinePlayers()) {
		  ConfigurationSection s = jobStatsConfig.getConfigurationSection(ps.getUniqueId().toString());
		  s.set("xp_mineur", xpMineurPlayer.get(ps.getUniqueId()));
		  s.set("level_mineur", levelMineurPlayer.get(ps.getUniqueId()));
		  
		  s.set("xp_chasseur", xpChasseurPlayer.get(ps.getUniqueId()));
		  s.set("level_chasseur", levelChasseurPlayer.get(ps.getUniqueId()));
		  
		  s.set("xp_bucheron", xpBucheronPlayer.get(ps.getUniqueId()));
		  s.set("level_bucheron", levelBucheronPlayer.get(ps.getUniqueId()));
		  
		  s.set("xp_agriculteur", xpAgriculteurPlayer.get(ps.getUniqueId()));
		  s.set("level_agriculteur", levelAgriculteurPlayer.get(ps.getUniqueId()));
		  }
		    saveFile();
		  }
	  
	  public static void createPlayerJobsStats(Player p) {
		    long baseXpValue = 0;
		    int baseLevelValue = 1;
		    xpMineurPlayer.put(p.getUniqueId(), baseXpValue);
		    levelMineurPlayer.put(p.getUniqueId(), baseLevelValue);
		    
		    xpChasseurPlayer.put(p.getUniqueId(), baseXpValue);
		    levelChasseurPlayer.put(p.getUniqueId(), baseLevelValue);
		    
		    xpBucheronPlayer.put(p.getUniqueId(), baseXpValue);
		    levelBucheronPlayer.put(p.getUniqueId(), baseLevelValue);
		    
		    xpAgriculteurPlayer.put(p.getUniqueId(), baseXpValue);
		    levelAgriculteurPlayer.put(p.getUniqueId(), baseLevelValue);
		    
		    ConfigurationSection s = jobStatsConfig.createSection(p.getUniqueId().toString());  
		    s.set("xp_mineur", Long.valueOf(0));
			s.set("level_mineur", Integer.valueOf(1));
			  
			s.set("xp_chasseur", Long.valueOf(0));
			s.set("level_chasseur", Integer.valueOf(1));
			  
			s.set("xp_bucheron", Long.valueOf(0));
			s.set("level_bucheron", Integer.valueOf(1));
			  
			s.set("xp_agriculteur", Long.valueOf(0));
			s.set("level_agriculteur", Integer.valueOf(1));
		    
		    saveFile();
		  }
	  
	  
	 private void registerFile() {
		 jobStatsFile = new File(JobsPlMain.getJobsPl().getDataFolder(), "PlayerJobsStats.yml");
		 jobStatsConfig = YamlConfiguration.loadConfiguration(jobStatsFile);
		    saveFile();
		  }
	 
	 private static void saveFile() {
		    try {		    
		    	jobStatsConfig.save(jobStatsFile);
		    } catch (IOException iOException) {}
		  }
	 
	 public void loadPlayer(Player p) {
		    if (jobStatsConfig.contains(p.getUniqueId().toString())) {
		      ConfigurationSection s = jobStatsConfig.getConfigurationSection(p.getUniqueId().toString());
		      	long xp_mineur = s.getLong("xp_mineur");
		      	xpMineurPlayer.put(p.getUniqueId(), xp_mineur);
		      	int level_mineur = s.getInt("level_mineur");
			    levelMineurPlayer.put(p.getUniqueId(), level_mineur);
			    
			    long xp_chasseur = s.getLong("xp_chasseur");
			    xpChasseurPlayer.put(p.getUniqueId(), xp_chasseur);
			    int level_chasseur = s.getInt("level_chasseur");
			    levelChasseurPlayer.put(p.getUniqueId(), level_chasseur);
			    
			    long xp_bucheron = s.getLong("xp_bucheron");
			    xpBucheronPlayer.put(p.getUniqueId(), xp_bucheron);
			    int level_bucheron = s.getInt("level_bucheron");
			    levelBucheronPlayer.put(p.getUniqueId(), level_bucheron);
			    
			    long xp_agriculteur = s.getLong("xp_agriculteur");
			    xpAgriculteurPlayer.put(p.getUniqueId(), xp_agriculteur);
			    int level_agriculteur = s.getInt("level_agriculteur");
			    levelAgriculteurPlayer.put(p.getUniqueId(), level_agriculteur);
		    } else {
		    	createPlayerJobsStats(p);
		    }
		  }
	 
	 public long getAStatsXP(Player p,int id) {
		    if (playerExist(p) && id <= 4 && id > 0) {	
		    	switch(id) {
		    	case 1 : return xpMineurPlayer.get(p.getUniqueId());
		    	case 2 : return xpChasseurPlayer.get(p.getUniqueId());
		    	case 3 : return xpBucheronPlayer.get(p.getUniqueId());
		    	case 4 : return xpAgriculteurPlayer.get(p.getUniqueId());
		    	}
		    }else {System.out.println("Player doesn't exist");}
		    return 0;
		  }
	 public long getAStatsLevel(Player p,int id) {
		    if (playerExist(p) && id <= 4 && id > 0) {	
		    	switch(id) {
		    	case 1 : return levelMineurPlayer.get(p.getUniqueId());
		    	case 2 : return levelChasseurPlayer.get(p.getUniqueId());
		    	case 3 : return levelBucheronPlayer.get(p.getUniqueId());
		    	case 4 : return levelAgriculteurPlayer.get(p.getUniqueId());
		    	}
		    }else {System.out.println("Player doesn't exist");}
		    return 0;
		  }
	 
	 public void setXP(Player p, int id, long newValue) {
		    if (playerExist(p) && id <= 4 && id > 0) {
		    	switch(id) {
		    	case 1 : xpMineurPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	case 2 : xpChasseurPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	case 3 : xpBucheronPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	case 4 : xpAgriculteurPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	}
		    }else {System.out.println("Player doesn't exist");}
		  }
	 
	 public void setLevel(Player p, int id, int newValue) {
		    if (playerExist(p) && id <= 4 && id > 0) {
		    	switch(id) {
		    	case 1 : levelMineurPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	case 2 : levelChasseurPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	case 3 : levelBucheronPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	case 4 : levelAgriculteurPlayer.replace(p.getUniqueId(), newValue);
		    	break;
		    	}
		    }else {System.out.println("Player doesn't exist");}
		  }
	 
	 public void addXP(Player p, int id, long value) {
		    if (playerExist(p) && id <= 4 && id > 0) {
		    	switch(id) {
		    	case 1 : xpMineurPlayer.replace(p.getUniqueId(), (xpMineurPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	case 2 : xpChasseurPlayer.replace(p.getUniqueId(), (xpChasseurPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	case 3 : xpBucheronPlayer.replace(p.getUniqueId(), (xpBucheronPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	case 4 : xpAgriculteurPlayer.replace(p.getUniqueId(), (xpAgriculteurPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	}
		    }else {
		    	System.out.println("Player doesn't exist");
		    }
		  }
	 
	 public void addLevel(Player p, int id, int value) {
		    if (playerExist(p) && id <= 4 && id > 0) {
		    	switch(id) {
		    	case 1 : levelMineurPlayer.replace(p.getUniqueId(), (levelMineurPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	case 2 : levelChasseurPlayer.replace(p.getUniqueId(), (levelChasseurPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	case 3 : levelBucheronPlayer.replace(p.getUniqueId(), (levelBucheronPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	case 4 : levelAgriculteurPlayer.replace(p.getUniqueId(), (levelAgriculteurPlayer.get(p.getUniqueId()) + value));
		    	break;
		    	}
		    }else {
		    	System.out.println("Player doesn't exist");
		    }
		  }
	 
	 public void unloadPlayer(Player p) {
		 	onDisable();
		    if (playerExist(p)) {
		    	xpMineurPlayer.remove(p.getUniqueId());
		    	levelMineurPlayer.remove(p.getUniqueId());
		    	xpBucheronPlayer.remove(p.getUniqueId());
		    	levelBucheronPlayer.remove(p.getUniqueId());
		    	xpChasseurPlayer.remove(p.getUniqueId());
		    	levelChasseurPlayer.remove(p.getUniqueId());
		    	xpAgriculteurPlayer.remove(p.getUniqueId());
		    	levelAgriculteurPlayer.remove(p.getUniqueId());
		    }
		  }
	 
	 public static PlayerJobsStats getPlayerJobsStats() { return playerJobStats;  }
	 
	 public boolean playerExist(Player p) { return xpMineurPlayer.containsKey(p.getUniqueId()) && levelMineurPlayer.containsKey(p.getUniqueId()); }


}
