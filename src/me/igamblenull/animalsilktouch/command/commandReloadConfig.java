package me.igamblenull.animalsilktouch.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.igamblenull.animalsilktouch.main;

public class commandReloadConfig implements CommandExecutor {

	private main plugin;

	public commandReloadConfig(main plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(args[0].equalsIgnoreCase("reload")) {
			if(sender instanceof Player) {
				Player p = (Player) sender;	
				if(p.hasPermission("AnimalSilkTouch.reload")) {
					plugin.reloadConfig();
					p.sendMessage(ChatColor.RED + "Animal Silk Touch reloaded!");
				}else {
					p.sendMessage(ChatColor.RED + "You don't have permission to use this command!");
				}
			}else {
				plugin.reloadConfig();
				sender.sendMessage(ChatColor.GREEN + "Animal Silk Touch reloaded!");
			}
		}
		return true;
	}

}
