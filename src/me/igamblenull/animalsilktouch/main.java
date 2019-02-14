package me.igamblenull.animalsilktouch;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.igamblenull.animalsilktouch.event.onEntityDeathEvent;

public class main extends JavaPlugin {
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new onEntityDeathEvent(), this);
	}
}
