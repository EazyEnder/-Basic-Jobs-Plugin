package fr.eazyender.jobspl.files;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import fr.eazyender.jobspl.JobsPlMain;

public class FileAgriculteurConfig {
	
	public static FileAgriculteurConfig fileagriculteurConfig;
	
	/* Integer = Level & Long = Xp Require */
	private static Map<Integer, Long> requireXp = new HashMap<Integer, Long>();
	/* Integer = Level & Double = coefficient multiplication */
	private static Map<Integer, Double> coefMoney = new HashMap<Integer, Double>();
	/* Integer = Level & Long = Message */
	private static Map<Integer, String> messageLevel = new HashMap<Integer, String>();
	
	private static File AgriculteurjobFile;
	private static FileConfiguration AgriculteurStatsConfig;
	
	public FileAgriculteurConfig() {
		fileagriculteurConfig = this;
		    registerFile();
		    loadValues();
	  }
	
	private void registerFile() {
		AgriculteurjobFile = new File(JobsPlMain.getJobsPl().getDataFolder(), "ConfigAgriculteur.yml");
		AgriculteurStatsConfig = YamlConfiguration.loadConfiguration(AgriculteurjobFile);
		    saveFile();
		  }
	
	public static void createBasicFile() {
		for(int i = 1; i <= 50; i++) {
	    String baseStringValue = "broadcast le joueur %player% est niveau " + i + " AGRICULTEUR";
	    long baseXpValue = 1 + i;
	    double baseAmplification = 1.0 + (i*0.1);
	    requireXp.put(i, baseXpValue);
	    coefMoney.put(i, baseAmplification);
	    messageLevel.put(i, baseStringValue);
	    
	    String str = i + "";
	    ConfigurationSection s = AgriculteurStatsConfig.createSection(str);  
	    s.set("requireXp", Long.valueOf(baseXpValue));
	    s.set("coefMoney", Double.valueOf(baseAmplification));
		s.set("commandeLevel", String.valueOf(baseStringValue));
		}
	    saveFile();
	  }
	
	private static void saveFile() {
	    try {		    
	    	AgriculteurStatsConfig.save(AgriculteurjobFile);
	    } catch (IOException iOException) {}
	  }
	
	public void loadValues() {
	    if (AgriculteurStatsConfig.contains("1")) {
	      for(int i = 1; i <= 50; i++) {
	    	  String str = i + "";
	    	ConfigurationSection s = AgriculteurStatsConfig.getConfigurationSection(str);
	      	long requireXpValue = s.getLong("requireXp");
	      	requireXp.put(i, requireXpValue);
	      	String messageLevelValue = s.getString("commandeLevel");
	      	messageLevel.put(i, messageLevelValue);
	      	Double coefMoneyValue = s.getDouble("coefMoney");
	      	coefMoney.put(i, coefMoneyValue);
	      }
	    } else {
	    	createBasicFile();
	    }
	  }
	
	public double getCoef(int level) {
	    if (level <= 50 && level > 0) {	
	    	return coefMoney.get(level);
	    }
	    else {return 0;}
	  }
	
	public long getXpNecessary(int level) {
	    if (level <= 50 && level > 0) {	
	    	return requireXp.get(level);
	    }
	    else {return 0;}
	  }
	
	public String getCommandOfALevel(int level) {
	    if (level <= 50 && level > 0) {	
	    	return messageLevel.get(level);
	    }
	    else {return "say DONT FIND THE VALUE";}
	  }
	
	
	
}
