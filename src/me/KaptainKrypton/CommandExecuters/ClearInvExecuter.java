package me.KaptainKrypton.CommandExecuters;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ClearInvExecuter  implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		Player player = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("clearinv")){
					player.sendMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + " Your inventory is being cleared!");
					player.getInventory().clear();
					player.sendMessage(ChatColor.DARK_RED + "[CoreCraft]" + ChatColor.DARK_GREEN + " Your inventory has been cleared!");
					return true;
				}
			return false;
		}
}
