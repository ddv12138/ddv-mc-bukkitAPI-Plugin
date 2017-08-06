package com.ddvudo;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public final class ChangeBlock implements Listener{
	@EventHandler
	public void onmove(PlayerMoveEvent e){
		//World w = e.getPlayer().getWorld();
		Player p = e.getPlayer();
		Location loc = p.getLocation();
		loc.setY(loc.getY()+5);
		Block b = loc.getBlock();
		b.setType(Material.GLOWSTONE);
	}
}
