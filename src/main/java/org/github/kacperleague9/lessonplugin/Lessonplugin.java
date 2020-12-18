package org.github.kacperleague9.lessonplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.github.kacperleague9.lessonplugin.events.Main;

public class Lessonplugin extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new Main(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
