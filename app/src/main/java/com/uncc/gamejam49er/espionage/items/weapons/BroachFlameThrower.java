package com.uncc.gamejam49er.espionage.items.weapons;


import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.armor.AdaptiveCamoflage;

/**
 * Created by Megan on 10/24/2015.
 */
public class BroachFlameThrower extends Item {
    public BroachFlameThrower() {
        this.name = "Broach Flame Thrower";
        this.attackValue = 8;
        this.description = "Make your enemies burn with envy.";
        this.hardCounters.add(new AdaptiveCamoflage());
    }
}