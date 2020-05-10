package fr.eazyender.jobspl.events;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PlayerPlaceBlocks implements Listener {

	public List<Block> MineurV = new ArrayList<Block>();
	public List<Block> BucheronV = new ArrayList<Block>();
	public List<Block> AgriculteurV = new ArrayList<Block>();
	
	public static PlayerPlaceBlocks instance;
	
	@EventHandler
	  public void onPlayerPlaceBlock(BlockPlaceEvent e) { 
		
		Player player = e.getPlayer();
		Block b = e.getBlock();
		
		if(b.getType().equals(Material.STONE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}else if(b.getType().equals(Material.COAL_ORE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}else if(b.getType().equals(Material.IRON_ORE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}else if(b.getType().equals(Material.REDSTONE_ORE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}else if(b.getType().equals(Material.LAPIS_ORE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}else if(b.getType().equals(Material.GOLD_ORE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}else if(b.getType().equals(Material.DIAMOND_ORE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}else if(b.getType().equals(Material.EMERALD_ORE)) {
			if(!MineurV.contains(b))MineurV.add(b);
		}
		
		else if(b.getType().equals(Material.LOG)) {
			if(!BucheronV.contains(b))BucheronV.add(b);
		}else if(b.getType().equals(Material.LOG_2)) {
			if(!BucheronV.contains(b))BucheronV.add(b);
		}
		
		else if(b.getType().equals(Material.PUMPKIN)) {
			if(!AgriculteurV.contains(b))AgriculteurV.add(b);
		}else if(b.getType().equals(Material.MELON_BLOCK)) {
			if(!AgriculteurV.contains(b))AgriculteurV.add(b);
		}
		
	}

	public PlayerPlaceBlocks() {
		instance = this;
	}

	public List<Block> getMineurV() {
		return MineurV;
	}

	public List<Block> getBucheronV() {
		return BucheronV;
	}

	public List<Block> getAgriculteurV() {
		return AgriculteurV;
	}
	
	
}
