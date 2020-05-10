package fr.eazyender.jobspl.cmd;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.eazyender.jobspl.gui.GuiJobs;

public class CommandJobs implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {
		
			if(sender instanceof Player) {
				
				GuiJobs.createGui((Player) sender);
				
				return true;
			}
		
		return false;
	}

}
