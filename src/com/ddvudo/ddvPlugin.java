package com.ddvudo;

import org.bukkit.plugin.java.JavaPlugin;

public final class ddvPlugin extends JavaPlugin{
	@Override
	public void onEnable(){
		//��ʾ������Ϣ
		getLogger().info("ddv���������Ѿ��ɹ�����");
		//��Ӽ�����magic
		getServer().getPluginManager().registerEvents(new GiveBasicItem(), this);
		getServer().getPluginManager().registerEvents(new ThrowEgg(), this);
		//getServer().getPluginManager().registerEvents(new ChangeBlock(), this);
	}
	@Override
	public void onDisable(){
		getLogger().info("ddv���������Ѿ��ɹ�ж��");
	}
}
