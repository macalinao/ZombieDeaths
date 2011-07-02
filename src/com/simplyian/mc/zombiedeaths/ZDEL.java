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

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.CreatureType;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityListener;

/**
 * ZombieDeaths Player Listener
 * 
 * @author simplyianm
 * @since 0.1
 */
public class ZDEL extends EntityListener {
    /**
     * ZombieDeaths Main Class Instance
     * 
     * @since 0.1
     */
    private static ZombieDeaths zd;
    
    /**
     * Constructor
     * 
     * @param instance 
     * 
     * @since 0.1
     */
    public ZDEL(ZombieDeaths instance) {
        zd = instance;
    }
    
    /**
     * Triggered when an entity dies.
     * 
     * @param event 
     * 
     * @since 0.1
     */
    @Override
    public void onEntityDeath(EntityDeathEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Player) {
            Location loc = entity.getLocation();
            loc.getWorld().spawnCreature(loc, CreatureType.ZOMBIE);
        }
    }
}
