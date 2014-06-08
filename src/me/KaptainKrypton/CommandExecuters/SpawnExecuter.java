package me.KaptainKrypton.CommandExecuters;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnExecuter implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player) sender;
		World world = player.getWorld();
		if(player.isOp()){
			if(cmd.getName().equalsIgnoreCase("spawnset")){
					Bukkit.broadcastMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + " Location is being saved!");
					world.setSpawnLocation(player.getLocation().getBlockX(),player.getLocation().getBlockY(),player.getLocation().getBlockZ());
					Bukkit.getServer().reload();
					Bukkit.broadcastMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + " Location has been saved!");
					return true;
				}
		}
		return false;
	}
}
