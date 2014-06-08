package me.KaptainKrypton.CommandExecuters;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SaveExecuter {
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player) sender;
		World world = player.getWorld();	
			if(cmd.getName().equalsIgnoreCase("save")){
					Bukkit.broadcastMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + " World is being saved!");
					world.save();
					Bukkit.savePlayers();Bukkit.reload();
					Bukkit.broadcastMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + " World has been saved!");
					return true;
				}
			return false;
		}
}
