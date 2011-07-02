/*
 * ZombieDeaths for Bukkit
 * Copyright (C) 2011 simplyianm
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.simplyian.mc.zombiedeaths;

import java.util.logging.Logger;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * ZombieDeaths Main Class
 * 
 * @author simplyianm
 * @since 0.1
 */
public class ZombieDeaths extends JavaPlugin {
    /**
     * Entity Listener
     * 
     * @since 0.1
     */
    private final ZDEL entityListener = new ZDEL(this);
    
    /**
     * Logger
     * 
     * @since 0.1
     */
    public static final Logger log = Logger.getLogger("Minecraft");
    
    /**
     * Triggered on the enabling of the plugin.
     * 
     * @since 0.1
     */
    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvent(Event.Type.ENTITY_DEATH, entityListener, Event.Priority.Normal, this);
        log.info("[ZombieDeaths] Plugin enabled.");
    }
    
    /**
     * Triggered on the disabling of the plugin.
     * 
     * @since 0.1
     */
    @Override
    public void onDisable() {
        log.info("[ZombieDeaths] Plugin disabled.");
    }
}