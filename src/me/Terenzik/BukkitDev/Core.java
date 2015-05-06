package me.Terenzik.BukkitDev;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Michael on 6/05/15.
 */
public class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Enabling Plugin!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Disabling Plugin!");
    }

}
