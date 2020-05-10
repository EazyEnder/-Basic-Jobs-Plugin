package fr.eazyender.jobspl.files;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import fr.eazyender.jobspl.JobsPlMain;

public class JobXpValue {
	
	public static JobXpValue fileJobXpValue;
	
	private static File JobXpValueFile;
	private static FileConfiguration JobXpValueConfig;
	
	/* Mineur :*/
	
	private int xpPerBlock_Diamond = 5, 
				xpPerBlock_Gold = 3,
				xpPerBlock_Redstone = 3,
				xpPerBlock_Lapiz = 4,
				xpPerBlock_Coal = 1,
				xpPerBlock_Emerald = 6,
				xpPerBlock_Stone = 1,
				xpPerBlock_Iron = 2;
	private int moneyPerBlock_Diamond = 5, 
			moneyPerBlock_Gold = 3,
			moneyPerBlock_Redstone = 3,
			moneyPerBlock_Lapiz = 4,
			moneyPerBlock_Coal = 1,
			moneyPerBlock_Emerald = 6,
			moneyPerBlock_Stone = 1,
			moneyPerBlock_Iron = 2;
	
	/* Chasseur :*/
	
	private int xpPerMob_Zombie = 5, 
				xpPerMob_Spider = 3,
				xpPerMob_Squeleton = 3,
				xpPerMob_Creeper = 2,
				xpPerMob_Witch = 4,
				xpPerMob_Enderman = 1,
				xpPerMob_Slime = 6,
				xpPerMob_EnderDragon = 2,
				xpPerMob_Wither = 2,
				xpPerMob_Endermite = 2,
				xpPerMob_Silverfish = 2,
				xpPerMob_BadVillager = 2,
				xpPerMob_Guardian = 2,
				
				xpPerMob_Horse = 3,
				xpPerMob_Sheep = 3,
				xpPerMob_Pig = 3,
				xpPerMob_Cow = 4,
				xpPerMob_Lapin = 1,
				xpPerMob_Chicken = 6,
				xpPerMob_Bat = 2,
				xpPerMob_Villager = 2,
				xpPerMob_Cat = 2,
				xpPerMob_MooshroomCow = 3,
				xpPerMob_Squid = 3,
	
				xpPerMob_pigmen = 2,
				xpPerMob_blaze = 3,
				xpPerMob_magmacream = 3,
	
			moneyPerMob_Zombie = 5, 
			moneyPerMob_Spider = 3,
			moneyPerMob_Squeleton = 3,
			moneyPerMob_Creeper = 2,
			moneyPerMob_Witch = 4,
			moneyPerMob_Enderman = 1,
			moneyPerMob_Slime = 6,
			moneyPerMob_EnderDragon = 2,
			moneyPerMob_Wither = 2,
			moneyPerMob_Endermite = 2,
			moneyPerMob_Silverfish = 2,
			moneyPerMob_BadVillager = 2,
			moneyPerMob_Guardian = 2,
			
			moneyPerMob_Horse = 3,
			moneyPerMob_Sheep = 3,
			moneyPerMob_Pig = 3,
			moneyPerMob_Cow = 4,
			moneyPerMob_Lapin = 1,
			moneyPerMob_Chicken = 6,
			moneyPerMob_Bat = 2,
			moneyPerMob_Villager = 2,
			moneyPerMob_Cat = 2,
			moneyPerMob_MooshroomCow = 3,
			moneyPerMob_Squid = 3,

			moneyPerMob_pigmen = 2,
			moneyPerMob_blaze = 3,
			moneyPerMob_magmacream = 3;
	
	/* Bucheron :*/
	
	private int xpPerBlock_Log1 = 5,
				xpPerBlock_Log2 = 5,

			moenyPerBlock_Log1 = 5,
			moneyPerBlock_Log2 = 5;
	
	/* Agriculteur :*/
	
	private int xpPerBlock_Potato = 5,
				xpPerBlock_Ble = 5, 
				xpPerBlock_Carotte = 5, 
				xpPerBlock_NetherVerrue = 5, 
				xpPerBlock_Melon = 5, 
				xpPerBlock_Pumpkin = 5,
				xpPerBlock_Betterave = 5,
						moneyPerBlock_Potato = 5,
						moneyPerBlock_Ble = 5, 
						moneyPerBlock_Carotte = 5, 
						moneyPerBlock_NetherVerrue = 5, 
						moneyPerBlock_Melon = 5, 
						moneyPerBlock_Pumpkin = 5,
						moneyPerBlock_Betterave = 5;

							
	
	public JobXpValue() {
		fileJobXpValue = this;
		    registerFile();
		    loadValues();
	  }
	
	public static JobXpValue getJobXpValue() { return fileJobXpValue;  }
	
	private void registerFile() {
		JobXpValueFile = new File(JobsPlMain.getJobsPl().getDataFolder(), "JobsValues.yml");
		JobXpValueConfig = YamlConfiguration.loadConfiguration(JobXpValueFile);
		    saveFile();
		  }
	
	public static void createBasicFile() {
		
			int basicxpPerBlock_Diamond = 5, 
				basicxpPerBlock_Gold = 3,
				basicxpPerBlock_Redstone = 3,
				basicxpPerBlock_Lapiz = 4,
				basicxpPerBlock_Coal = 1,
				basicxpPerBlock_Stone = 1,
				basicxpPerBlock_Emerald = 6,
				basicxpPerBlock_Iron = 2;
			ConfigurationSection s = JobXpValueConfig.createSection("Mineur"); 
			s.set("xpPerBlock_Stone", Integer.valueOf(basicxpPerBlock_Stone));
	    	s.set("xpPerBlock_Coal", Integer.valueOf(basicxpPerBlock_Coal));
	    	s.set("xpPerBlock_Iron", Integer.valueOf(basicxpPerBlock_Iron));
	    	s.set("xpPerBlock_Gold", Integer.valueOf(basicxpPerBlock_Gold));
	    	s.set("xpPerBlock_Redstone", Integer.valueOf(basicxpPerBlock_Redstone));
	    	s.set("xpPerBlock_Lapiz", Integer.valueOf(basicxpPerBlock_Lapiz));
	    	s.set("xpPerBlock_Diamond", Integer.valueOf(basicxpPerBlock_Diamond));
	    	s.set("xpPerBlock_Emerald", Integer.valueOf(basicxpPerBlock_Emerald));
	    	int basicmoneyPerBlock_Diamond = 5, 
					basicmoneyPerBlock_Gold = 3,
					basicmoneyPerBlock_Redstone = 3,
					basicmoneyPerBlock_Lapiz = 4,
					basicmoneyPerBlock_Coal = 1,
					basicmoneyPerBlock_Stone = 1,
					basicmoneyPerBlock_Emerald = 6,
					basicmoneyPerBlock_Iron = 2;
				s.set("moneyPerBlock_Stone", Integer.valueOf(basicmoneyPerBlock_Stone));
		    	s.set("moneyPerBlock_Coal", Integer.valueOf(basicmoneyPerBlock_Coal));
		    	s.set("moneyPerBlock_Iron", Integer.valueOf(basicmoneyPerBlock_Iron));
		    	s.set("moneyPerBlock_Gold", Integer.valueOf(basicmoneyPerBlock_Gold));
		    	s.set("moneyPerBlock_Redstone", Integer.valueOf(basicmoneyPerBlock_Redstone));
		    	s.set("moneyPerBlock_Lapiz", Integer.valueOf(basicmoneyPerBlock_Lapiz));
		    	s.set("moneyPerBlock_Diamond", Integer.valueOf(basicmoneyPerBlock_Diamond));
		    	s.set("moneyPerBlock_Emerald", Integer.valueOf(basicmoneyPerBlock_Emerald));
	    	
	    		int	xpPerMob_Zombie = 5, 
					xpPerMob_Spider = 3,
					xpPerMob_Squeleton = 3,
					xpPerMob_Creeper = 2,
					xpPerMob_Witch = 4,
					xpPerMob_Enderman = 1,
					xpPerMob_Slime = 6,
					xpPerMob_EnderDragon = 2,
					xpPerMob_Wither = 2,
					xpPerMob_Endermite = 2,
					xpPerMob_Silverfish = 2,
					xpPerMob_BadVillager = 2,
					xpPerMob_Guardian = 2,
					xpPerMob_Horse = 3,
					xpPerMob_Sheep = 3,
					xpPerMob_Pig = 3,
					xpPerMob_Cow = 4,
					xpPerMob_Lapin = 1,
					xpPerMob_Chicken = 6,
					xpPerMob_Bat = 2,
					xpPerMob_Villager = 2,
					xpPerMob_Cat = 2,
					xpPerMob_MooshroomCow = 3,
					xpPerMob_Squid = 3,
	    			xpPerMob_pigmen = 2,
	    			xpPerMob_magmacream = 3,
	    			xpPerMob_blaze = 3;
		    ConfigurationSection s2 = JobXpValueConfig.createSection("Chasseur");  
		    	s2.set("xpPerMob_Zombie", Integer.valueOf(xpPerMob_Zombie));
		    	s2.set("xpPerMob_Spider", Integer.valueOf(xpPerMob_Spider));
		    	s2.set("xpPerMob_Squeleton", Integer.valueOf(xpPerMob_Squeleton));
		    	s2.set("xpPerMob_Creeper", Integer.valueOf(xpPerMob_Creeper));
		    	s2.set("xpPerMob_Witch", Integer.valueOf(xpPerMob_Witch));
		    	s2.set("xpPerMob_Enderman", Integer.valueOf(xpPerMob_Enderman));
		    	s2.set("xpPerMob_Slime", Integer.valueOf(xpPerMob_Slime));
		    	s2.set("xpPerMob_EnderDragon", Integer.valueOf(xpPerMob_EnderDragon));
		    	s2.set("xpPerMob_Wither", Integer.valueOf(xpPerMob_Wither));
		    	s2.set("xpPerMob_Endermite", Integer.valueOf(xpPerMob_Endermite));
		    	s2.set("xpPerMob_Silverfish", Integer.valueOf(xpPerMob_Silverfish));
		    	s2.set("xpPerMob_BadVillager", Integer.valueOf(xpPerMob_BadVillager));
		    	s2.set("xpPerMob_Guardian", Integer.valueOf(xpPerMob_Guardian));
		    	s2.set("xpPerMob_Horse", Integer.valueOf(xpPerMob_Horse));
		    	s2.set("xpPerMob_Sheep", Integer.valueOf(xpPerMob_Sheep));
		    	s2.set("xpPerMob_Pig", Integer.valueOf(xpPerMob_Pig));
		    	s2.set("xpPerMob_Cow", Integer.valueOf(xpPerMob_Cow));
		    	s2.set("xpPerMob_Lapin", Integer.valueOf(xpPerMob_Lapin));
		    	s2.set("xpPerMob_Chicken", Integer.valueOf(xpPerMob_Chicken));
		    	s2.set("xpPerMob_Bat", Integer.valueOf(xpPerMob_Bat));
		    	s2.set("xpPerMob_Villager", Integer.valueOf(xpPerMob_Villager));
		    	s2.set("xpPerMob_Cat", Integer.valueOf(xpPerMob_Cat));
		    	s2.set("xpPerMob_MooshroomCow", Integer.valueOf(xpPerMob_MooshroomCow));
		    	s2.set("xpPerMob_Squid", Integer.valueOf(xpPerMob_Squid));
		    	s2.set("xpPerMob_pigmen", Integer.valueOf(xpPerMob_pigmen));
		    	s2.set("xpPerMob_magmacream", Integer.valueOf(xpPerMob_magmacream));
		    	s2.set("xpPerMob_blaze", Integer.valueOf(xpPerMob_blaze));
		    	int	moneyPerMob_Zombie = 5, 
						moneyPerMob_Spider = 3,
						moneyPerMob_Squeleton = 3,
						moneyPerMob_Creeper = 2,
						moneyPerMob_Witch = 4,
						moneyPerMob_Enderman = 1,
						moneyPerMob_Slime = 6,
						moneyPerMob_EnderDragon = 2,
						moneyPerMob_Wither = 2,
						moneyPerMob_Endermite = 2,
						moneyPerMob_Silverfish = 2,
						moneyPerMob_BadVillager = 2,
						moneyPerMob_Guardian = 2,
						moneyPerMob_Horse = 3,
						moneyPerMob_Sheep = 3,
						moneyPerMob_Pig = 3,
						moneyPerMob_Cow = 4,
						moneyPerMob_Lapin = 1,
						moneyPerMob_Chicken = 6,
						moneyPerMob_Bat = 2,
						moneyPerMob_Villager = 2,
						moneyPerMob_Cat = 2,
						moneyPerMob_MooshroomCow = 3,
						moneyPerMob_Squid = 3,
		    			moneyPerMob_pigmen = 2,
		    			moneyPerMob_magmacream = 3,
		    			moneyPerMob_blaze = 3;
			    	s2.set("moneyPerMob_Zombie", Integer.valueOf(moneyPerMob_Zombie));
			    	s2.set("moneyPerMob_Spider", Integer.valueOf(moneyPerMob_Spider));
			    	s2.set("moneyPerMob_Squeleton", Integer.valueOf(moneyPerMob_Squeleton));
			    	s2.set("moneyPerMob_Creeper", Integer.valueOf(moneyPerMob_Creeper));
			    	s2.set("moneyPerMob_Witch", Integer.valueOf(moneyPerMob_Witch));
			    	s2.set("moneyPerMob_Enderman", Integer.valueOf(moneyPerMob_Enderman));
			    	s2.set("moneyPerMob_Slime", Integer.valueOf(moneyPerMob_Slime));
			    	s2.set("moneyPerMob_EnderDragon", Integer.valueOf(moneyPerMob_EnderDragon));
			    	s2.set("moneyPerMob_Wither", Integer.valueOf(moneyPerMob_Wither));
			    	s2.set("moneyPerMob_Endermite", Integer.valueOf(moneyPerMob_Endermite));
			    	s2.set("moneyPerMob_Silverfish", Integer.valueOf(moneyPerMob_Silverfish));
			    	s2.set("moneyPerMob_BadVillager", Integer.valueOf(moneyPerMob_BadVillager));
			    	s2.set("moneyPerMob_Guardian", Integer.valueOf(moneyPerMob_Guardian));
			    	s2.set("moneyPerMob_Horse", Integer.valueOf(moneyPerMob_Horse));
			    	s2.set("moneyPerMob_Sheep", Integer.valueOf(moneyPerMob_Sheep));
			    	s2.set("moneyPerMob_Pig", Integer.valueOf(moneyPerMob_Pig));
			    	s2.set("moneyPerMob_Cow", Integer.valueOf(moneyPerMob_Cow));
			    	s2.set("moneyPerMob_Lapin", Integer.valueOf(moneyPerMob_Lapin));
			    	s2.set("moneyPerMob_Chicken", Integer.valueOf(moneyPerMob_Chicken));
			    	s2.set("moneyPerMob_Bat", Integer.valueOf(moneyPerMob_Bat));
			    	s2.set("moneyPerMob_Villager", Integer.valueOf(moneyPerMob_Villager));
			    	s2.set("moneyPerMob_Cat", Integer.valueOf(moneyPerMob_Cat));
			    	s2.set("moneyPerMob_MooshroomCow", Integer.valueOf(moneyPerMob_MooshroomCow));
			    	s2.set("moneyPerMob_Squid", Integer.valueOf(moneyPerMob_Squid));
			    	s2.set("moneyPerMob_pigmen", Integer.valueOf(moneyPerMob_pigmen));
			    	s2.set("moneyPerMob_magmacream", Integer.valueOf(moneyPerMob_magmacream));
			    	s2.set("moneyPerMob_blaze", Integer.valueOf(moneyPerMob_blaze));
		    	
		    	int xpPerBlock_Log1 = 5,
		    		xpPerBlock_Log2 = 5;
		    ConfigurationSection s3 = JobXpValueConfig.createSection("Bucheron");
		    	s3.set("xpPerBlock_Log1", Integer.valueOf(xpPerBlock_Log1));
		    	s3.set("xpPerBlock_Log2", Integer.valueOf(xpPerBlock_Log2));
		    	int moneyPerBlock_Log1 = 5,
			    		moneyPerBlock_Log2 = 5;
			    	s3.set("moneyPerBlock_Log1", Integer.valueOf(moneyPerBlock_Log1));
			    	s3.set("moneyPerBlock_Log2", Integer.valueOf(moneyPerBlock_Log2));

		    	
		    	int xpPerBlock_Potato = 5,
						xpPerBlock_Ble = 5, 
						xpPerBlock_Carotte = 5, 
						xpPerBlock_NetherVerrue = 5, 
						xpPerBlock_Melon = 5, 
						xpPerBlock_Pumpkin = 5,
						xpPerBlock_Betterave = 5;
			    ConfigurationSection s4 = JobXpValueConfig.createSection("Agriculteur");
			    	s4.set("xpPerBlock_Potato", Integer.valueOf(xpPerBlock_Potato));
			    	s4.set("xpPerBlock_Ble", Integer.valueOf(xpPerBlock_Ble));
			    	s4.set("xpPerBlock_Carotte", Integer.valueOf(xpPerBlock_Carotte));
			    	s4.set("xpPerBlock_NetherVerrue", Integer.valueOf(xpPerBlock_NetherVerrue));
			    	s4.set("xpPerBlock_Melon", Integer.valueOf(xpPerBlock_Melon));
			    	s4.set("xpPerBlock_Pumpkin", Integer.valueOf(xpPerBlock_Pumpkin));
			    	s4.set("xpPerBlock_Betterave", Integer.valueOf(xpPerBlock_Betterave));
			    	int moneyPerBlock_Potato = 5,
							moneyPerBlock_Ble = 5, 
							moneyPerBlock_Carotte = 5, 
							moneyPerBlock_NetherVerrue = 5, 
							moneyPerBlock_Melon = 5, 
							moneyPerBlock_Pumpkin = 5,
							moneyPerBlock_Betterave = 5;
				    	s4.set("moneyPerBlock_Potato", Integer.valueOf(moneyPerBlock_Potato));
				    	s4.set("moneyPerBlock_Ble", Integer.valueOf(moneyPerBlock_Ble));
				    	s4.set("moneyPerBlock_Carotte", Integer.valueOf(moneyPerBlock_Carotte));
				    	s4.set("moneyPerBlock_NetherVerrue", Integer.valueOf(moneyPerBlock_NetherVerrue));
				    	s4.set("moneyPerBlock_Melon", Integer.valueOf(moneyPerBlock_Melon));
				    	s4.set("moneyPerBlock_Pumpkin", Integer.valueOf(moneyPerBlock_Pumpkin));
				    	s4.set("moneyPerBlock_Betterave", Integer.valueOf(moneyPerBlock_Betterave));
		    	
	    saveFile();
	  }
	
	private static void saveFile() {
	    try {		    
	    	JobXpValueConfig.save(JobXpValueFile);
	    } catch (IOException iOException) {}
	  }
	
	public void loadValues() {
	    if (JobXpValueConfig.contains("Mineur")) {
	    	
	    	ConfigurationSection s = JobXpValueConfig.getConfigurationSection("Mineur");
	    	xpPerBlock_Stone = s.getInt("xpPerBlock_Stone");
	    	xpPerBlock_Coal = s.getInt("xpPerBlock_Coal");
	    	xpPerBlock_Iron = s.getInt("xpPerBlock_Iron");
	    	xpPerBlock_Gold = s.getInt("xpPerBlock_Gold");
	    	xpPerBlock_Redstone = s.getInt("xpPerBlock_Redstone");
	    	xpPerBlock_Lapiz = s.getInt("xpPerBlock_Lapiz");
	    	xpPerBlock_Diamond = s.getInt("xpPerBlock_Diamond");
	    	xpPerBlock_Emerald = s.getInt("xpPerBlock_Emerald");
	    	
	    	ConfigurationSection s2 = JobXpValueConfig.getConfigurationSection("Chasseur");
	    	xpPerMob_Zombie = s2.getInt("xpPerMob_Zombie");
	    	xpPerMob_Spider = s2.getInt("xpPerMob_Spider");
	    	xpPerMob_Squeleton = s2.getInt("xpPerMob_Squeleton");
	    	xpPerMob_Creeper = s2.getInt("xpPerMob_Creeper");
	    	xpPerMob_Witch = s2.getInt("xpPerMob_Witch");
	    	xpPerMob_Enderman = s2.getInt("xpPerMob_Enderman");
	    	xpPerMob_Slime = s2.getInt("xpPerMob_Slime");
	    	xpPerMob_EnderDragon = s2.getInt("xpPerMob_EnderDragon");
	    	xpPerMob_Wither = s2.getInt("xpPerMob_Wither");
	    	xpPerMob_Endermite = s2.getInt("xpPerMob_Endermite");
	    	xpPerMob_Silverfish = s2.getInt("xpPerMob_Silverfish");
	    	xpPerMob_BadVillager = s2.getInt("xpPerMob_BadVillager");
	    	xpPerMob_Guardian = s2.getInt("xpPerMob_Guardian");
	    	xpPerMob_Horse = s2.getInt("xpPerMob_Horse");
	    	xpPerMob_Sheep = s2.getInt("xpPerMob_Sheep");
	    	xpPerMob_Pig = s2.getInt("xpPerMob_Pig");
	    	xpPerMob_Cow = s2.getInt("xpPerMob_Cow");
	    	xpPerMob_Lapin = s2.getInt("xpPerMob_Lapin");
	    	xpPerMob_Chicken = s2.getInt("xpPerMob_Chicken");
	    	xpPerMob_Bat = s2.getInt("xpPerMob_Bat");
	    	xpPerMob_Villager = s2.getInt("xpPerMob_Villager");
	    	xpPerMob_Cat = s2.getInt("xpPerMob_Cat");
	    	xpPerMob_MooshroomCow = s2.getInt("xpPerMob_MooshroomCow");
	    	xpPerMob_Squid = s2.getInt("xpPerMob_Squid");
	    	xpPerMob_pigmen = s2.getInt("xpPerMob_pigmen");
	    	xpPerMob_magmacream= s2.getInt("xpPerMob_magmacream");
	    	xpPerMob_blaze = s2.getInt("xpPerMob_blaze");
	    	
	    	ConfigurationSection s3 = JobXpValueConfig.getConfigurationSection("Bucheron");
	    	xpPerBlock_Log1 = s3.getInt("xpPerBlock_Log1");
	    	xpPerBlock_Log2 = s3.getInt("xpPerBlock_Log2");
	    	
	    	ConfigurationSection s4 = JobXpValueConfig.getConfigurationSection("Agriculteur");
	    	xpPerBlock_Potato = s4.getInt("xpPerBlock_Potato");
	    	xpPerBlock_Ble = s4.getInt("xpPerBlock_Ble");
	    	xpPerBlock_Carotte = s4.getInt("xpPerBlock_Carotte");
	    	xpPerBlock_NetherVerrue = s4.getInt("xpPerBlock_NetherVerrue");
	    	xpPerBlock_Melon = s4.getInt("xpPerBlock_Melon");
	    	xpPerBlock_Pumpkin = s4.getInt("xpPerBlock_Pumpkin");
	    	xpPerBlock_Betterave = s4.getInt("xpPerBlock_Betterave");
	    	
	    	moneyPerBlock_Stone = s.getInt("moneyPerBlock_Stone");
	    	moneyPerBlock_Coal = s.getInt("moneyPerBlock_Coal");
	    	moneyPerBlock_Iron = s.getInt("moneyPerBlock_Iron");
	    	moneyPerBlock_Gold = s.getInt("moneyPerBlock_Gold");
	    	moneyPerBlock_Redstone = s.getInt("moneyPerBlock_Redstone");
	    	moneyPerBlock_Lapiz = s.getInt("moneyPerBlock_Lapiz");
	    	moneyPerBlock_Diamond = s.getInt("moneyPerBlock_Diamond");
	    	moneyPerBlock_Emerald = s.getInt("moneyPerBlock_Emerald");
	    	moneyPerMob_Zombie = s2.getInt("moneyPerMob_Zombie");
	    	moneyPerMob_Spider = s2.getInt("moneyPerMob_Spider");
	    	moneyPerMob_Squeleton = s2.getInt("moneyPerMob_Squeleton");
	    	moneyPerMob_Creeper = s2.getInt("moneyPerMob_Creeper");
	    	moneyPerMob_Witch = s2.getInt("moneyPerMob_Witch");
	    	moneyPerMob_Enderman = s2.getInt("moneyPerMob_Enderman");
	    	moneyPerMob_Slime = s2.getInt("moneyPerMob_Slime");
	    	moneyPerMob_EnderDragon = s2.getInt("moneyPerMob_EnderDragon");
	    	moneyPerMob_Wither = s2.getInt("moneyPerMob_Wither");
	    	moneyPerMob_Endermite = s2.getInt("moneyPerMob_Endermite");
	    	moneyPerMob_Silverfish = s2.getInt("moneyPerMob_Silverfish");
	    	moneyPerMob_BadVillager = s2.getInt("moneyPerMob_BadVillager");
	    	moneyPerMob_Guardian = s2.getInt("moneyPerMob_Guardian");
	    	moneyPerMob_Horse = s2.getInt("moneyPerMob_Horse");
	    	moneyPerMob_Sheep = s2.getInt("moneyPerMob_Sheep");
	    	moneyPerMob_Pig = s2.getInt("moneyPerMob_Pig");
	    	moneyPerMob_Cow = s2.getInt("moneyPerMob_Cow");
	    	moneyPerMob_Lapin = s2.getInt("moneyPerMob_Lapin");
	    	moneyPerMob_Chicken = s2.getInt("moneyPerMob_Chicken");
	    	moneyPerMob_Bat = s2.getInt("moneyPerMob_Bat");
	    	moneyPerMob_Villager = s2.getInt("moneyPerMob_Villager");
	    	moneyPerMob_Cat = s2.getInt("moneyPerMob_Cat");
	    	moneyPerMob_MooshroomCow = s2.getInt("moneyPerMob_MooshroomCow");
	    	moneyPerMob_Squid = s2.getInt("moneyPerMob_Squid");
	    	moneyPerMob_pigmen = s2.getInt("moneyPerMob_pigmen");
	    	moneyPerMob_magmacream= s2.getInt("moneyPerMob_magmacream");
	    	moneyPerMob_blaze = s2.getInt("moneyPerMob_blaze");
	    	
	    	moenyPerBlock_Log1 = s3.getInt("moneyPerBlock_Log1");
	    	moneyPerBlock_Log2 = s3.getInt("moneyPerBlock_Log2");
	    	
	    	moneyPerBlock_Potato = s4.getInt("moneyPerBlock_Potato");
	    	moneyPerBlock_Ble = s4.getInt("moneyPerBlock_Ble");
	    	moneyPerBlock_Carotte = s4.getInt("moneyPerBlock_Carotte");
	    	moneyPerBlock_NetherVerrue = s4.getInt("moneyPerBlock_NetherVerrue");
	    	moneyPerBlock_Melon = s4.getInt("moneyPerBlock_Melon");
	    	moneyPerBlock_Pumpkin = s4.getInt("moneyPerBlock_Pumpkin");
	    	moneyPerBlock_Betterave = s4.getInt("moneyPerBlock_Betterave");
	    	
	    } else {
	    	createBasicFile();
	    }
	  }

	
	
	public int getMoneyPerBlock_Diamond() {
		return moneyPerBlock_Diamond;
	}

	public int getMoneyPerBlock_Gold() {
		return moneyPerBlock_Gold;
	}

	public int getMoneyPerBlock_Redstone() {
		return moneyPerBlock_Redstone;
	}

	public int getMoneyPerBlock_Lapiz() {
		return moneyPerBlock_Lapiz;
	}

	public int getMoneyPerBlock_Coal() {
		return moneyPerBlock_Coal;
	}

	public int getMoneyPerBlock_Emerald() {
		return moneyPerBlock_Emerald;
	}

	public int getMoneyPerBlock_Stone() {
		return moneyPerBlock_Stone;
	}

	public int getMoneyPerBlock_Iron() {
		return moneyPerBlock_Iron;
	}

	public int getXpPerMob_pigmen() {
		return xpPerMob_pigmen;
	}

	public int getXpPerMob_blaze() {
		return xpPerMob_blaze;
	}

	public int getXpPerMob_magmacream() {
		return xpPerMob_magmacream;
	}

	public int getMoneyPerMob_Zombie() {
		return moneyPerMob_Zombie;
	}

	public int getMoneyPerMob_Spider() {
		return moneyPerMob_Spider;
	}

	public int getMoneyPerMob_Squeleton() {
		return moneyPerMob_Squeleton;
	}

	public int getMoneyPerMob_Creeper() {
		return moneyPerMob_Creeper;
	}

	public int getMoneyPerMob_Witch() {
		return moneyPerMob_Witch;
	}

	public int getMoneyPerMob_Enderman() {
		return moneyPerMob_Enderman;
	}

	public int getMoneyPerMob_Slime() {
		return moneyPerMob_Slime;
	}

	public int getMoneyPerMob_EnderDragon() {
		return moneyPerMob_EnderDragon;
	}

	public int getMoneyPerMob_Wither() {
		return moneyPerMob_Wither;
	}

	public int getMoneyPerMob_Endermite() {
		return moneyPerMob_Endermite;
	}

	public int getMoneyPerMob_Silverfish() {
		return moneyPerMob_Silverfish;
	}

	public int getMoneyPerMob_BadVillager() {
		return moneyPerMob_BadVillager;
	}

	public int getMoneyPerMob_Guardian() {
		return moneyPerMob_Guardian;
	}

	public int getMoneyPerMob_Horse() {
		return moneyPerMob_Horse;
	}

	public int getMoneyPerMob_Sheep() {
		return moneyPerMob_Sheep;
	}

	public int getMoneyPerMob_Pig() {
		return moneyPerMob_Pig;
	}

	public int getMoneyPerMob_Cow() {
		return moneyPerMob_Cow;
	}

	public int getMoneyPerMob_Lapin() {
		return moneyPerMob_Lapin;
	}

	public int getMoneyPerMob_Chicken() {
		return moneyPerMob_Chicken;
	}

	public int getMoneyPerMob_Bat() {
		return moneyPerMob_Bat;
	}

	public int getMoneyPerMob_Villager() {
		return moneyPerMob_Villager;
	}

	public int getMoneyPerMob_Cat() {
		return moneyPerMob_Cat;
	}

	public int getMoneyPerMob_MooshroomCow() {
		return moneyPerMob_MooshroomCow;
	}

	public int getMoneyPerMob_Squid() {
		return moneyPerMob_Squid;
	}

	public int getMoneyPerMob_pigmen() {
		return moneyPerMob_pigmen;
	}

	public int getMoneyPerMob_blaze() {
		return moneyPerMob_blaze;
	}

	public int getMoneyPerMob_magmacream() {
		return moneyPerMob_magmacream;
	}

	public int getMoenyPerBlock_Log1() {
		return moenyPerBlock_Log1;
	}

	public int getMoneyPerBlock_Log2() {
		return moneyPerBlock_Log2;
	}

	public int getMoneyPerBlock_Potato() {
		return moneyPerBlock_Potato;
	}

	public int getMoneyPerBlock_Ble() {
		return moneyPerBlock_Ble;
	}

	public int getMoneyPerBlock_Carotte() {
		return moneyPerBlock_Carotte;
	}

	public int getMoneyPerBlock_NetherVerrue() {
		return moneyPerBlock_NetherVerrue;
	}

	public int getMoneyPerBlock_Melon() {
		return moneyPerBlock_Melon;
	}

	public int getMoneyPerBlock_Pumpkin() {
		return moneyPerBlock_Pumpkin;
	}

	public int getMoneyPerBlock_Betterave() {
		return moneyPerBlock_Betterave;
	}

	public int getXpPerBlock_Diamond() {
		return xpPerBlock_Diamond;
	}

	public int getXpPerBlock_Gold() {
		return xpPerBlock_Gold;
	}
	
	public int getXpPerBlock_Stone() {
		return xpPerBlock_Stone;
	}

	public int getXpPerBlock_Redstone() {
		return xpPerBlock_Redstone;
	}

	public int getXpPerBlock_Lapiz() {
		return xpPerBlock_Lapiz;
	}

	public int getXpPerBlock_Coal() {
		return xpPerBlock_Coal;
	}

	public int getXpPerBlock_Emerald() {
		return xpPerBlock_Emerald;
	}

	public int getXpPerBlock_Iron() {
		return xpPerBlock_Iron;
	}

	public int getXpPerMob_Zombie() {
		return xpPerMob_Zombie;
	}

	public int getXpPerMob_Spider() {
		return xpPerMob_Spider;
	}

	public int getXpPerMob_Squeleton() {
		return xpPerMob_Squeleton;
	}

	public int getXpPerMob_Creeper() {
		return xpPerMob_Creeper;
	}

	public int getXpPerMob_Witch() {
		return xpPerMob_Witch;
	}

	public int getXpPerMob_Enderman() {
		return xpPerMob_Enderman;
	}

	public int getXpPerMob_Slime() {
		return xpPerMob_Slime;
	}

	public int getXpPerMob_EnderDragon() {
		return xpPerMob_EnderDragon;
	}

	public int getXpPerMob_Wither() {
		return xpPerMob_Wither;
	}

	public int getXpPerMob_Endermite() {
		return xpPerMob_Endermite;
	}

	public int getXpPerMob_Silverfish() {
		return xpPerMob_Silverfish;
	}

	public int getXpPerMob_BadVillager() {
		return xpPerMob_BadVillager;
	}

	public int getXpPerMob_Guardian() {
		return xpPerMob_Guardian;
	}


	public int getXpPerMob_Horse() {
		return xpPerMob_Horse;
	}

	public int getXpPerMob_Sheep() {
		return xpPerMob_Sheep;
	}

	public int getXpPerMob_Pig() {
		return xpPerMob_Pig;
	}

	public int getXpPerMob_Cow() {
		return xpPerMob_Cow;
	}

	public int getXpPerMob_Lapin() {
		return xpPerMob_Lapin;
	}

	public int getXpPerMob_Chicken() {
		return xpPerMob_Chicken;
	}

	public int getXpPerMob_Bat() {
		return xpPerMob_Bat;
	}

	public int getXpPerMob_Villager() {
		return xpPerMob_Villager;
	}

	public int getXpPerMob_Cat() {
		return xpPerMob_Cat;
	}

	public int getXpPerMob_MooshroomCow() {
		return xpPerMob_MooshroomCow;
	}

	public int getXpPerMob_Pigmen() {
		return xpPerMob_pigmen;
	}
	public int getXpPerMob_Magmacream() {
		return xpPerMob_magmacream;
	}

	public int getXpPerMob_Blaze() {
		return xpPerMob_blaze;
	}

	public int getXpPerMob_Squid() {
		return xpPerMob_Squid;
	}

	public int getXpPerBlock_Log1() {
		return xpPerBlock_Log1;
	}

	public int getXpPerBlock_Log2() {
		return xpPerBlock_Log2;
	}


	public int getXpPerBlock_Potato() {
		return xpPerBlock_Potato;
	}

	public int getXpPerBlock_Ble() {
		return xpPerBlock_Ble;
	}

	public int getXpPerBlock_Carotte() {
		return xpPerBlock_Carotte;
	}

	public int getXpPerBlock_NetherVerrue() {
		return xpPerBlock_NetherVerrue;
	}

	public int getXpPerBlock_Melon() {
		return xpPerBlock_Melon;
	}

	public int getXpPerBlock_Pumpkin() {
		return xpPerBlock_Pumpkin;
	}

	public int getXpPerBlock_Betterave() {
		return xpPerBlock_Betterave;
	}
	
}
