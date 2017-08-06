package com.ddvudo;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.inventory.ItemStack;

public final class GiveBasicItem implements Listener{
	@EventHandler
	public void onlogin(PlayerLoginEvent event){
		org.bukkit.inventory.PlayerInventory inventory = event.getPlayer().getInventory();
		ItemStack temp = new ItemStack(Material.LEATHER_HELMET);
		inventory.addItem(temp);
		temp = new ItemStack(Material.LEATHER_CHESTPLATE);
		inventory.addItem(temp);
		temp = new ItemStack(Material.LEATHER_BOOTS);
		inventory.addItem(temp);
		temp = new ItemStack(Material.LEATHER_LEGGINGS);
		inventory.addItem(temp);
		temp = new ItemStack(Material.IRON_SWORD);
		inventory.addItem(temp);
		temp = new ItemStack(Material.EGG,64);
		inventory.addItem(temp);
	}
}
