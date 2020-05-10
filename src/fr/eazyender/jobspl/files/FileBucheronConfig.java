package fr.eazyender.jobspl.files;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import fr.eazyender.jobspl.JobsPlMain;

public class FileBucheronConfig {
	
	public static FileBucheronConfig filebucheronConfig;
	
	/* Integer = Level & Long = Xp Require */
	private static Map<Integer, Long> requireXp = new HashMap<Integer, Long>();
	/* Integer = Level & Double = coefficient multiplication */
	private static Map<Integer, Double> coefMoney = new HashMap<Integer, Double>();
	/* Integer = Level & Long = Message */
	private static Map<Integer, String> messageLevel = new HashMap<Integer, String>();
	
	private static File BucheronjobFile;
	private static FileConfiguration BucheronStatsConfig;
	
	public FileBucheronConfig() {
		filebucheronConfig = this;
		    registerFile();
		    loadValues();
	  }
	
	private void registerFile() {
		BucheronjobFile = new File(JobsPlMain.getJobsPl().getDataFolder(), "ConfigBucheron.yml");
		BucheronStatsConfig = YamlConfiguration.loadConfiguration(BucheronjobFile);
		    saveFile();
		  }
	
	public static void createBasicFile() {
		for(int i = 1; i <= 50; i++) {
	    String baseStringValue = "broadcast le joueur %player% est niveau " + i + " BUCHERON";
	    long baseXpValue = 1 + i;
	    double baseAmplification = 1.0 + (i*0.1);
	    requireXp.put(i, baseXpValue);
	    messageLevel.put(i, baseStringValue);
	    coefMoney.put(i, baseAmplification);
	    
	    String str = i + "";
	    ConfigurationSection s = BucheronStatsConfig.createSection(str);  
	    s.set("requireXp", Long.valueOf(baseXpValue));
		s.set("commandeLevel", String.valueOf(baseStringValue));
		s.set("coefMoney", Double.valueOf(baseAmplification));
		}
	    saveFile();
	  }
	
	private static void saveFile() {
	    try {		    
	    	BucheronStatsConfig.save(BucheronjobFile);
	    } catch (IOException iOException) {}
	  }
	
	public void loadValues() {
	    if (BucheronStatsConfig.contains("1")) {
	      for(int i = 1; i <= 50; i++) {
	    	  String str = i + "";
	    	ConfigurationSection s = BucheronStatsConfig.getConfigurationSection(str);
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
