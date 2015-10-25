package com.uncc.gamejam49er.espionage.items.weapons;

import com.uncc.gamejam49er.espionage.items.Item;
import com.uncc.gamejam49er.espionage.items.armor.AdaptiveCamoflage;

/**
 * Created by Megan on 10/24/2015.
 */
public class KillerNanoBugs extends Item {
    public KillerNanoBugs() {
        this.name = "Killer Nano Bugs";
        this.attackValue = 9;
        this.description = "Swarm your enemy with a thousand killer nano bugs.";
        this.hardCounters.add(new AdaptiveCamoflage());
    }
}
