package com.ddvudo;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

@SuppressWarnings("unused")
public final class ThrowEgg implements Listener{
	@EventHandler
	public void magicegg(PlayerEggThrowEvent e){
		Player player = e.getPlayer();
		World world = player.getWorld();
		double x = e.getEgg().getLocation().getX();
		double y = e.getEgg().getLocation().getY();
		double z =e.getEgg().getLocation().getZ();
		e.getPlayer().getServer().getLogger().info("羊出生在了"+x+','+y+','+z);
		Location loc = new Location(world, x, y, z);
		EnderDragon ed =world.spawn(loc, EnderDragon.class);
		//sheep.setCustomName("我是一只蛋生龙");
	}
}
