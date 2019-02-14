package me.igamblenull.animalsilktouch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.igamblenull.animalsilktouch.command.commandReloadConfig;
import me.igamblenull.animalsilktouch.event.onEntityDeathEvent;

public class main extends JavaPlugin {
	public void onEnable() {
		loadConfig();
		Bukkit.getServer().getPluginManager().registerEvents(new onEntityDeathEvent(this), this);
		
		commandReloadConfig cmdReloadConfig = new commandReloadConfig(this);
		getCommand("animalsilk").setExecutor(cmdReloadConfig);
	}
	
	public void loadConfig() {
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
}
