package me.igamblenull.animalsilktouch.event;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import me.igamblenull.animalsilktouch.main;

public class onEntityDeathEvent implements Listener {
	
	private main plugin;

	public onEntityDeathEvent(main plugin) {
		this.plugin = plugin;
	}
	
	@SuppressWarnings("incomplete-switch")
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		if(e.getEntity().getKiller() instanceof Player) {
			Player p = e.getEntity().getKiller();
			if(p.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
				Material pickaxe[] = {Material.WOODEN_PICKAXE, Material.STONE_PICKAXE, Material.IRON_PICKAXE, Material.GOLDEN_PICKAXE, Material.DIAMOND_PICKAXE};
				
				if(Arrays.asList(pickaxe).contains(p.getInventory().getItemInMainHand().getType()) && p.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
					switch(e.getEntityType()) {
					case PIG:
						if(plugin.getConfig().getBoolean("enabledAnimals.PIG")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.PIG_SPAWN_EGG));
							break;
						}
						
					case COW:
						if(plugin.getConfig().getBoolean("enabledAnimals.COW")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.COW_SPAWN_EGG));
							break;
						}
						
					case CHICKEN:
						if(plugin.getConfig().getBoolean("enabledAnimals.CHICKEN")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.CHICKEN_SPAWN_EGG));
							break;
						}
						
					case SHEEP:
						if(plugin.getConfig().getBoolean("enabledAnimals.SHEEP")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.SHEEP_SPAWN_EGG));
							break;
						}
						
					case DOLPHIN:
						if(plugin.getConfig().getBoolean("enabledAnimals.DOLPHIN")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.DOLPHIN_SPAWN_EGG));
							break;
						}
						
					case DONKEY:
						if(plugin.getConfig().getBoolean("enabledAnimals.DONKEY")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.DONKEY_SPAWN_EGG));
							break;
						}
						
					case HORSE:
						if(plugin.getConfig().getBoolean("enabledAnimals.HORSE")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.HORSE_SPAWN_EGG));
							break;
						}
						
					case RABBIT:
						if(plugin.getConfig().getBoolean("enabledAnimals.RABBIT")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.RABBIT_SPAWN_EGG));
							break;
						}
						
					case WOLF:
						if(plugin.getConfig().getBoolean("enabledAnimals.WOLF")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.WOLF_SPAWN_EGG));
							break;
						}
						
					case VILLAGER:
						if(plugin.getConfig().getBoolean("enabledAnimals.VILLAGER")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.VILLAGER_SPAWN_EGG));
							break;
						}
						
					case TURTLE:
						if(plugin.getConfig().getBoolean("enabledAnimals.TURTLE")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.TURTLE_SPAWN_EGG));
							break;
						}
						
					case TROPICAL_FISH:
						if(plugin.getConfig().getBoolean("enabledAnimals.TROPICAL_FISH")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.TROPICAL_FISH_SPAWN_EGG));
							break;
						}
						
					case SQUID:
						if(plugin.getConfig().getBoolean("enabledAnimals.SQUID")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.SQUID_SPAWN_EGG));
							break;
						}
						
					case POLAR_BEAR:
						if(plugin.getConfig().getBoolean("enabledAnimals.POLAR_BEAR")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.POLAR_BEAR_SPAWN_EGG));
							break;
						}
						
					case OCELOT:
						if(plugin.getConfig().getBoolean("enabledAnimals.OCELOT")) {
							disableMobDrops(e);
							e.getDrops().add(new ItemStack(Material.OCELOT_SPAWN_EGG));
							break;
						}
					}
				}
			}
		}
	}
	
	public void disableMobDrops(EntityDeathEvent e) {
		e.getDrops().clear();
		e.setDroppedExp(0);
	}
}
