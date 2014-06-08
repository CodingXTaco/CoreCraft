package me.KaptainKrypton.CommandExecuters;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WarpExecuter implements CommandExecutor{
	public final Location[] warpLocations = new Location[100];
	public final String[] warpNames = new String[100];
	public int warpCounter = 0;
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("setwarp")){
				if(args.length == 0){
					player.sendMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.RED + "Syntax Error! Incorrect Arguments!");
					return false;
				}else{
					Location location = player.getLocation();
					if(!(warpCounter > 100)){
						warpLocations[warpCounter] = location;
						warpNames[warpCounter] = args[0];
						warpCounter++;
						player.sendMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + " Warp set as: " + ChatColor.GOLD + args[0] + ChatColor.DARK_GREEN + "!");
					}else{
						player.sendMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + "Warp Limit Exceeded! Unable To Create Warp!");
					}
				}
			}else if(cmd.getName().equalsIgnoreCase("warp")){
					for(int i = 0; i < warpNames.length; i++){
						String warpName = warpNames[i];
						if(args[0].equalsIgnoreCase(warpName)){
							Location warpLocation = warpLocations[i];
							player.teleport(warpLocation);
							player.sendMessage("You have been teleported to: " + warpName);
							break;
							}
						return true;
						}
					}else if(cmd.getName().equalsIgnoreCase("warps")){
						String warps = "";
						for(int i = 0; i < warpNames.length; i++){
							if(i != warps.length()){
								warps += warpNames[i] + ", ".replace("empty warp", "");
								return true;
				}else{
					player.sendMessage(ChatColor.DARK_RED + "[CoreCraft]" + " Warps List: " + warpNames);
					return true;
							}
						}
					}
			return false;
	}
}