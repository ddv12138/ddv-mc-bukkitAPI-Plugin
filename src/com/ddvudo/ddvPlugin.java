package com.ddvudo;

import org.bukkit.plugin.java.JavaPlugin;

public final class ddvPlugin extends JavaPlugin{
	@Override
	public void onEnable(){
		//提示加载信息
		getLogger().info("ddv的神奇插件已经成功加载");
		//添加监听器magic
		getServer().getPluginManager().registerEvents(new GiveBasicItem(), this);
		getServer().getPluginManager().registerEvents(new ThrowEgg(), this);
		//getServer().getPluginManager().registerEvents(new ChangeBlock(), this);
	}
	@Override
	public void onDisable(){
		getLogger().info("ddv的神奇插件已经成功卸载");
	}
}
