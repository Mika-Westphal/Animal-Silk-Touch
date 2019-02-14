package me.igamblenull.animalsilktouch.event;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class onEntityDeathEvent implements Listener {
	@SuppressWarnings("incomplete-switch")
	@EventHandler
	public void onEntityDeath(EntityDeathEvent e) {
		Player p = e.getEntity().getKiller();
		
		if(p.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
			Material pickaxe[] = {Material.WOODEN_PICKAXE, Material.STONE_PICKAXE, Material.IRON_PICKAXE, Material.GOLDEN_PICKAXE, Material.DIAMOND_PICKAXE};
			
			if(Arrays.asList(pickaxe).contains(p.getInventory().getItemInMainHand().getType()) && p.getInventory().getItemInMainHand().containsEnchantment(Enchantment.SILK_TOUCH)) {
				switch(e.getEntityType()) {
					case PIG:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.PIG_SPAWN_EGG));
						break;
					case COW:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.COW_SPAWN_EGG));
						break;
					case CHICKEN:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.CHICKEN_SPAWN_EGG));
						break;
					case SHEEP:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.SHEEP_SPAWN_EGG));
						break;
					case DOLPHIN:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.DOLPHIN_SPAWN_EGG));
						break;
					case DONKEY:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.DONKEY_SPAWN_EGG));
						break;
					case HORSE:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.HORSE_SPAWN_EGG));
						break;
					case RABBIT:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.RABBIT_SPAWN_EGG));
						break;
					case WOLF:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.WOLF_SPAWN_EGG));
						break;
					case VILLAGER:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.VILLAGER_SPAWN_EGG));
						break;
					case TURTLE:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.TURTLE_SPAWN_EGG));
						break;
					case TROPICAL_FISH:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.TROPICAL_FISH_SPAWN_EGG));
						break;
					case SQUID:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.SQUID_SPAWN_EGG));
						break;
					case POLAR_BEAR:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.POLAR_BEAR_SPAWN_EGG));
						break;
					case OCELOT:
						disableMobDrops(e);
						e.getDrops().add(new ItemStack(Material.OCELOT_SPAWN_EGG));
						break;
				}
			}
		}
	}
	
	public void disableMobDrops(EntityDeathEvent e) {
		e.getDrops().clear();
		e.setDroppedExp(0);
	}
}
