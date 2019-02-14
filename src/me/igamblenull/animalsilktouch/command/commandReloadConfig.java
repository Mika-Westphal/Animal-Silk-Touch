package me.igamblenull.animalsilktouch.command;

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
		if(args.length == 0) {
			if(args[0].equalsIgnoreCase("reload")) {
				if(sender instanceof Player) {
					Player p = (Player) sender;	
					if(p.hasPermission("AnimalSilkTouch.reload")) {
						plugin.reloadConfig();
						p.sendMessage("§aAnimal Silk Touch reloaded!");
					}else {
						p.sendMessage("§4You don't have permission to use this command!");
					}
				}else {
					plugin.reloadConfig();
					sender.sendMessage("§aAnimal Silk Touch reloaded!");
				}
			}
		}
		return true;
	}

}
